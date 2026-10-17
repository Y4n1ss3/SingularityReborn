package com.topjohnwu.superuser.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Process;
import android.util.ArraySet;
import android.util.Log;
import com.topjohnwu.superuser.Shell;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Utils {
    private static final String TAG = "LIBSU";
    public static Context context = null;
    private static int currentRootState = -1;
    private static Class<?> synchronizedCollectionClass;

    public static void err(Throwable th) {
        err(TAG, th);
    }

    public static Context getContext() {
        if (context == null) {
            try {
                context = getContextImpl((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null));
            } catch (Exception e) {
                err(e);
            }
        }
        return context;
    }

    public static Context getContextImpl(Context context2) {
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        return context2;
    }

    public static Context getDeContext() {
        return getContext().createDeviceProtectedStorageContext();
    }

    public static boolean hasStartupAgents(Context context2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return new File(context2.getCodeCacheDir(), "startup_agents").isDirectory();
    }

    public static synchronized Boolean isAppGrantedRoot() {
        synchronized (Utils.class) {
            int i = currentRootState;
            if (i >= 0) {
                if (i == 0) {
                    return Boolean.FALSE;
                }
                if (i != 2) {
                    return null;
                }
                return Boolean.TRUE;
            }
            if (Process.myUid() == 0) {
                currentRootState = 2;
                return Boolean.TRUE;
            }
            for (String str : System.getenv("PATH").split(":")) {
                if (new File(str, "su").canExecute()) {
                    currentRootState = 1;
                    return null;
                }
            }
            currentRootState = 0;
            return Boolean.FALSE;
        }
    }

    public static boolean isMainShellRoot() {
        return MainShell.get().isRoot();
    }

    public static boolean isProcess64Bit() {
        return Process.is64Bit();
    }

    public static boolean isRootImpossible() {
        return Objects.equals(isAppGrantedRoot(), Boolean.FALSE);
    }

    public static boolean isSynchronized(Collection<?> collection) {
        Class<?> cls = synchronizedCollectionClass;
        if (cls == null) {
            cls = Collections.synchronizedCollection(NOPList.getInstance()).getClass();
            synchronizedCollectionClass = cls;
        }
        return cls.isInstance(collection);
    }

    public static <E> Set<E> newArraySet() {
        return new ArraySet();
    }

    public static long pump(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[65536];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static synchronized void setConfirmedRootState(boolean z) {
        synchronized (Utils.class) {
            currentRootState = z ? 2 : 0;
        }
    }

    public static void setContext(Context context2) {
        Context contextImpl = getContextImpl(context2);
        Context applicationContext = contextImpl.getApplicationContext();
        if (applicationContext != null) {
            contextImpl = applicationContext;
        }
        context = getContextImpl(contextImpl);
    }

    public static boolean vLog() {
        return Shell.enableVerboseLogging;
    }

    public static void log(String str, Object obj) {
    }

    public static void err(String str, Throwable th) {
        Log.d(str, "", th);
    }

    public static void ex(Throwable th) {
    }

    public static void log(Object obj) {
    }
}
