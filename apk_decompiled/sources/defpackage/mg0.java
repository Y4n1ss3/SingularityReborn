package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class mg0 {
    public static final yi0 a = new yi0();
    public static final Object b = new Object();
    public static ts c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? w0.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static ts b() {
        ts tsVar = new ts(26);
        c = tsVar;
        yi0 yi0Var = a;
        yi0Var.getClass();
        if (i0.i.j(yi0Var, null, tsVar)) {
            i0.b(yi0Var);
        }
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:34|35|36|(2:76|77)(1:38)|39|(9:46|(1:50)|(1:57)|58|(2:66|67)|62|63|64|65)|(1:73)(1:(1:75))|(1:50)|(3:52|55|57)|58|(1:60)|66|67|62|63|64|65) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z) {
        boolean z2;
        lg0 a2;
        lg0 lg0Var;
        int i;
        if (z || c == null) {
            synchronized (b) {
                if (!z) {
                    if (c != null) {
                        return;
                    }
                }
                int i2 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z2 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                if (Build.VERSION.SDK_INT == 30) {
                    b();
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z3 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z4 = file2.exists() && length2 > 0;
                try {
                    long a3 = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            a2 = lg0.a(file3);
                        } catch (IOException unused2) {
                            b();
                            return;
                        }
                    } else {
                        a2 = null;
                    }
                    if (a2 != null && a2.c == a3 && (i = a2.b) != 2) {
                        i2 = i;
                        if (z && z4 && i2 != 1) {
                            i2 = 2;
                        }
                        if (a2 != null && a2.b == 2 && i2 == 1 && length < a2.d) {
                            i2 = 3;
                        }
                        lg0Var = new lg0(1, i2, a3, length2);
                        if (a2 != null || !a2.equals(lg0Var)) {
                            lg0Var.b(file3);
                        }
                        b();
                    }
                    if (z3) {
                        i2 = 1;
                    } else if (z4) {
                        i2 = 2;
                    }
                    if (z) {
                        i2 = 2;
                    }
                    if (a2 != null) {
                        i2 = 3;
                    }
                    lg0Var = new lg0(1, i2, a3, length2);
                    if (a2 != null) {
                    }
                    lg0Var.b(file3);
                    b();
                } catch (PackageManager.NameNotFoundException unused3) {
                    b();
                }
            }
        }
    }
}
