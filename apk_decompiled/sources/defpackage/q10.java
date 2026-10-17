package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.lumi.singularity.R;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class q10 {
    public static final ox e;
    public static final ox f;
    public static final ox g;
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final byte[] h = {48, 49, 53, 0};
    public static final byte[] i = {48, 49, 48, 0};
    public static final byte[] j = {48, 48, 57, 0};
    public static final byte[] k = {48, 48, 53, 0};
    public static final byte[] l = {48, 48, 49, 0};
    public static final byte[] m = {48, 48, 49, 0};
    public static final byte[] n = {48, 48, 50, 0};
    public static final byte[] o = {-98, 60, -95, 119, -16, 93, 34, -74, 74, -127, -50, 15};
    public static final byte[] p = {-24, -79, 90, 103, 63, -92, -27, 26, 42, -35, 33, 27, -106, 112, -81, -111, 53, -53, -35, 0, -72, -97, -65, -39, 34, 92, -123, 90, 51, -123, 87, -90};

    static {
        int i2 = 4;
        e = new ox("UNDEFINED", i2);
        f = new ox("REUSABLE_CLAIMED", i2);
        g = new ox("NO_OWNER", i2);
    }

    public static List A(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final void B(hm hmVar, Object obj) {
        if (!(hmVar instanceof kr)) {
            hmVar.resumeWith(obj);
            return;
        }
        kr krVar = (kr) hmVar;
        mn mnVar = krVar.g;
        hm hmVar2 = krVar.h;
        Throwable a2 = kj0.a(obj);
        Object sjVar = a2 == null ? obj : new sj(a2, false);
        if (mnVar.isDispatchNeeded(hmVar2.getContext())) {
            krVar.i = sjVar;
            krVar.f = 1;
            mnVar.dispatch(hmVar2.getContext(), krVar);
            return;
        }
        du a3 = xu0.a();
        if (a3.d >= 4294967296L) {
            krVar.i = sjVar;
            krVar.f = 1;
            a3.i(krVar);
            return;
        }
        a3.j(true);
        try {
            z10 z10Var = (z10) hmVar2.getContext().get(ts.l);
            if (z10Var == null || z10Var.isActive()) {
                Object obj2 = krVar.j;
                kn context = hmVar2.getContext();
                Object X = y80.X(context, obj2);
                u01 G = X != y80.i ? p01.G(hmVar2, context, X) : null;
                try {
                    hmVar2.resumeWith(obj);
                } finally {
                    if (G == null || G.a0()) {
                        y80.N(context, X);
                    }
                }
            } else {
                krVar.resumeWith(p10.p(z10Var.f()));
            }
            while (a3.l()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static void C(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void D(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final long E(String str, long j2, long j3, long j4) {
        String str2;
        int i2 = zs0.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        Long f0 = ks0.f0(str2);
        if (f0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = f0.longValue();
        if (j3 <= longValue && longValue <= j4) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
    }

    public static int F(String str, int i2, int i3) {
        return (int) E(str, i2, 1L, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static void G() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void H(String str) {
        tj tjVar = new tj(uo.d("lateinit property ", str, " has not been initialized"));
        C(tjVar, q10.class.getName());
        throw tjVar;
    }

    public static float I() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(hm hmVar) {
        Object obj;
        kn context = hmVar.getContext();
        cq.l(context);
        hm C = d41.C(hmVar);
        kr krVar = C instanceof kr ? (kr) C : null;
        Object obj2 = vn.d;
        Object obj3 = w01.a;
        if (krVar != null) {
            mn mnVar = krVar.g;
            if (mnVar.isDispatchNeeded(context)) {
                krVar.i = obj3;
                krVar.f = 1;
                mnVar.dispatchYield(context, krVar);
            } else {
                c41 c41Var = new c41(c41.e);
                kn plus = context.plus(c41Var);
                krVar.i = obj3;
                krVar.f = 1;
                mnVar.dispatchYield(plus, krVar);
                if (c41Var.d) {
                    du a2 = xu0.a();
                    qb qbVar = a2.f;
                    if (!(qbVar != null ? qbVar.isEmpty() : true)) {
                        if (a2.d >= 4294967296L) {
                            krVar.i = obj3;
                            krVar.f = 1;
                            a2.i(krVar);
                        } else {
                            a2.j(true);
                            try {
                                krVar.run();
                                do {
                                } while (a2.l());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                }
            }
            obj = obj2;
            return obj != obj2 ? obj : obj3;
        }
        obj = obj3;
        if (obj != obj2) {
        }
    }

    public static boolean a(Float f2, float f3) {
        return f2 != null && f3 == f2.floatValue();
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final Integer c(int i2) {
        return new Integer(i2);
    }

    public static io0 d(String str, go0[] go0VarArr) {
        if (ds0.n0(str)) {
            o.m("Blank serial names are prohibited");
            return null;
        }
        ki kiVar = new ki(str);
        return new io0(str, ls0.m, kiVar.b.size(), ac.n0(go0VarArr), kiVar);
    }

    public static final io0 e(String str, y80 y80Var, go0[] go0VarArr, ky kyVar) {
        if (ds0.n0(str)) {
            o.m("Blank serial names are prohibited");
            return null;
        }
        if (y80Var.equals(ls0.m)) {
            o.m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        ki kiVar = new ki(str);
        kyVar.invoke(kiVar);
        return new io0(str, y80Var, kiVar.b.size(), ac.n0(go0VarArr), kiVar);
    }

    public static int f(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, context.getOpPackageName()) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final void g(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                d41.c(th, th2);
            }
        }
    }

    public static int h(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int i(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static final void j(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        o.r(") is greater than size (", i2, i3, "toIndex (");
    }

    public static final long k(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ux l(Context context) {
        ProviderInfo providerInfo;
        sx sxVar;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        d41.e(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                sxVar = new sx(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (sxVar != null) {
                return null;
            }
            return new ux(new tx(context, sxVar));
        }
        sxVar = null;
        if (sxVar != null) {
        }
    }

    public static w11 m(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (w11) newInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r1.emit(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(jw jwVar, zg zgVar, boolean z, hm hmVar) {
        lw lwVar;
        int i2;
        nf it;
        nf nfVar;
        jw jwVar2;
        Object b2;
        try {
            if (hmVar instanceof lw) {
                lwVar = (lw) hmVar;
                int i3 = lwVar.i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    lwVar.i = i3 - Integer.MIN_VALUE;
                    Object obj = lwVar.h;
                    i2 = lwVar.i;
                    CancellationException cancellationException = null;
                    vn vnVar = vn.d;
                    if (i2 != 0) {
                        p10.Q(obj);
                        if (jwVar instanceof av0) {
                            throw ((av0) jwVar).d;
                        }
                        it = zgVar.iterator();
                        lwVar.d = jwVar;
                        lwVar.e = zgVar;
                        lwVar.f = it;
                        lwVar.g = z;
                        lwVar.i = 1;
                        b2 = it.b(lwVar);
                        if (b2 != vnVar) {
                        }
                    } else if (i2 == 1) {
                        z = lwVar.g;
                        nfVar = lwVar.f;
                        zgVar = lwVar.e;
                        jwVar2 = lwVar.d;
                        p10.Q(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = lwVar.g;
                        nfVar = lwVar.f;
                        zgVar = lwVar.e;
                        jwVar2 = lwVar.d;
                        p10.Q(obj);
                        it = nfVar;
                        jwVar = jwVar2;
                        lwVar.d = jwVar;
                        lwVar.e = zgVar;
                        lwVar.f = it;
                        lwVar.g = z;
                        lwVar.i = 1;
                        b2 = it.b(lwVar);
                        if (b2 != vnVar) {
                            return vnVar;
                        }
                        jwVar2 = jwVar;
                        nfVar = it;
                        obj = b2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                zgVar.cancel(null);
                            }
                            return w01.a;
                        }
                        Object c2 = nfVar.c();
                        lwVar.d = jwVar2;
                        lwVar.e = zgVar;
                        lwVar.f = nfVar;
                        lwVar.g = z;
                        lwVar.i = 2;
                    }
                }
            }
            if (i2 != 0) {
            }
        } finally {
        }
        lwVar = new lw(hmVar);
        Object obj2 = lwVar.h;
        i2 = lwVar.i;
        CancellationException cancellationException2 = null;
        vn vnVar2 = vn.d;
    }

    public static final y40 o(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            y40 y40Var = tag instanceof y40 ? (y40) tag : null;
            if (y40Var != null) {
                return y40Var;
            }
            Object u = p10.u(view);
            view = u instanceof View ? (View) u : null;
        }
        return null;
    }

    public static Set q() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final int r(String str, Bundle bundle) {
        str.getClass();
        int i2 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i2 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2;
        }
        y80.A(str);
        throw null;
    }

    public static final int s(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                o.m("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    public static final Bundle t(String str, Bundle bundle) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        y80.A(str);
        throw null;
    }

    public static int u(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return fj.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean v(Context context) {
        context.getClass();
        try {
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), GroupFlagsKt.HasRecompositionRequiredFlag).signingInfo;
            Signature[] apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
            if (apkContentsSigners != null && apkContentsSigners.length != 0) {
                byte[] bArr = new byte[32];
                for (int i2 = 0; i2 < 32; i2++) {
                    bArr[i2] = (byte) (p[i2] ^ o[i2 % 12]);
                }
                for (Signature signature : apkContentsSigners) {
                    if (MessageDigest.isEqual(MessageDigest.getInstance("SHA-256").digest(signature.toByteArray()), bArr)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static float w(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static MappedByteBuffer x(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static zx y(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            D(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), sh0.b);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                D(xmlResourceParser);
            }
            List A = A(resources, resourceId);
            return new dy(new sx(string, string2, string3, A), string4 != null ? new sx(string, string2, string4, A) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), sh0.c);
                    int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                    int i4 = obtainAttributes2.getInt(i3, 0);
                    int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                    obtainAttributes2.getString(i5);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        D(xmlResourceParser);
                    }
                    arrayList.add(new cy(i2, z, string6, i4, resourceId2));
                } else {
                    D(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ay((cy[]) arrayList.toArray(new cy[0]));
    }

    public static final byte[] z(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        k(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public abstract void p(yo0 yo0Var, float f2, float f3);
}
