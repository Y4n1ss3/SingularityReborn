package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class cq {
    public static final hm[] a = new hm[0];
    public static final ox b = new ox("CLOSED", 4);
    public static final Object c = new Object();
    public static final ts d = new ts(23);
    public static final Object e = new Object();

    public static void A(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static j11 B(String str) {
        String group;
        if (str == null || ds0.n0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
        group4.getClass();
        return new j11(parseInt, parseInt2, parseInt3, group4);
    }

    public static Intent C(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            o.m("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i2 != 0 && (i & 4) != 0) {
            o.m("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i);
        }
        if ((i & 4) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
        }
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (q10.f(context, str) != 0) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (q10.f(context, str) != 0) {
                throw new RuntimeException(uo.d("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
            }
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, null);
    }

    public static void E(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            v0.f(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            v0.f(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            F(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            F(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            F(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int min = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + min) - 1))) {
            min--;
        }
        int i10 = min2 + i7;
        F(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + min2), charSequence.subSequence(i2, min + i2)) : charSequence.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public static void F(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final void G(ji jiVar, String str) {
        String sb;
        String str2 = "in the polymorphic scope of '" + jiVar.b() + '\'';
        if (str == null) {
            sb = "Class discriminator was missing and no default serializers were registered " + str2 + '.';
        } else {
            StringBuilder k = j50.k("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            k.append(str);
            k.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
            k.append(str);
            k.append("' has to be '@Serializable', and the base class '");
            k.append(jiVar.b());
            k.append("' has to be sealed and '@Serializable'.");
            sb = k.toString();
        }
        throw new jo0(sb);
    }

    public static final String H(hm hmVar) {
        Object jj0Var;
        if (hmVar instanceof kr) {
            return ((kr) hmVar).toString();
        }
        try {
            jj0Var = hmVar + '@' + r(hmVar);
        } catch (Throwable th) {
            jj0Var = new jj0(th);
        }
        if (kj0.a(jj0Var) != null) {
            jj0Var = hmVar.getClass().getName() + '@' + r(hmVar);
        }
        return (String) jj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I(Context context, Executor executor, ig0 ig0Var, boolean z) {
        boolean z2;
        ?? r7;
        ir[] irVarArr;
        ir[] irVarArr2;
        ir[] irVarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? byteArrayOutputStream;
        gr grVar;
        String str;
        String str2;
        FileInputStream a2;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                ig0Var.d(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        mg0.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = p10.g;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            gr grVar2 = new gr(assets, executor, ig0Var, name, file2);
            byte[] bArr3 = grVar2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        grVar2.b(4, null);
                    }
                    grVar2.f = true;
                    try {
                        try {
                            r7 = grVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            ig0Var.d(6, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            irVarArr2 = grVar2.g;
                            if (irVarArr2 != null) {
                            }
                            ig0 ig0Var2 = grVar2.b;
                            irVarArr3 = grVar2.g;
                            byte[] bArr4 = grVar2.c;
                            boolean z11 = r7;
                            z11 = r7;
                            if (irVarArr3 != null) {
                            }
                            bArr = grVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            mg0.c(context, (z6 || !z) ? false : z9);
                        } catch (IOException e3) {
                            ig0Var.d(7, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            irVarArr2 = grVar2.g;
                            if (irVarArr2 != null) {
                            }
                            ig0 ig0Var22 = grVar2.b;
                            irVarArr3 = grVar2.g;
                            byte[] bArr42 = grVar2.c;
                            boolean z112 = r7;
                            z112 = r7;
                            if (irVarArr3 != null) {
                            }
                            bArr = grVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            mg0.c(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e4) {
                                    ig0Var.d(8, e4);
                                    try {
                                        r7.close();
                                    } catch (IOException e5) {
                                        ig0Var.d(7, e5);
                                    }
                                    irVarArr = null;
                                    grVar2.g = irVarArr;
                                    irVarArr2 = grVar2.g;
                                    if (irVarArr2 != null) {
                                    }
                                    ig0 ig0Var222 = grVar2.b;
                                    irVarArr3 = grVar2.g;
                                    byte[] bArr422 = grVar2.c;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (irVarArr3 != null) {
                                    }
                                    bArr = grVar2.h;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    mg0.c(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e6) {
                                ig0Var.d(7, e6);
                                r7.close();
                                irVarArr = null;
                                grVar2.g = irVarArr;
                                irVarArr2 = grVar2.g;
                                if (irVarArr2 != null) {
                                }
                                ig0 ig0Var2222 = grVar2.b;
                                irVarArr3 = grVar2.g;
                                byte[] bArr4222 = grVar2.c;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (irVarArr3 != null) {
                                }
                                bArr = grVar2.h;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                mg0.c(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, y80.K(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            irVarArr = p10.H(r7, y80.K(r7, 4), grVar2.e);
                            try {
                                r7.close();
                            } catch (IOException e7) {
                                ig0Var.d(7, e7);
                            }
                            grVar2.g = irVarArr;
                        }
                        irVarArr2 = grVar2.g;
                        if (irVarArr2 != null && (r7 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a2 = grVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e8) {
                                ig0Var.d(9, e8);
                                str = r7;
                            } catch (IOException e9) {
                                ig0Var.d(7, e9);
                                str = r7;
                            } catch (IllegalStateException e10) {
                                grVar2.g = null;
                                ig0Var.d(8, e10);
                                str = r7;
                            }
                            if (a2 == null) {
                                try {
                                    if (!Arrays.equals(p10.h, y80.K(a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] K = y80.K(a2, 4);
                                    grVar2.g = p10.E(a2, K, bArr3, irVarArr2);
                                    a2.close();
                                    grVar = grVar2;
                                    r7 = K;
                                    if (grVar != null) {
                                        grVar2 = grVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                    str = str2;
                                }
                                grVar = null;
                                r7 = str;
                                if (grVar != null) {
                                }
                            }
                        }
                        ig0 ig0Var22222 = grVar2.b;
                        irVarArr3 = grVar2.g;
                        byte[] bArr42222 = grVar2.c;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (irVarArr3 != null && bArr42222 != null) {
                            z7 = grVar2.f;
                            if (z7) {
                                o.f("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e11) {
                                ig0Var22222.d(7, e11);
                                z8 = z7;
                            } catch (IllegalStateException e12) {
                                ig0Var22222.d(8, e12);
                                z8 = z7;
                            }
                            if (p10.R(byteArrayOutputStream, bArr42222, irVarArr3)) {
                                grVar2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                grVar2.g = null;
                                z112222 = z8;
                            } else {
                                ig0Var22222.d(5, null);
                                grVar2.g = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = grVar2.h;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!grVar2.f) {
                                    o.f("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(grVar2.d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[Fields.RotationY];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                grVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                grVar2.h = null;
                                                                                grVar2.g = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        z112222 = true;
                                        grVar2.b(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        mg0.c(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e14) {
                                        e = e14;
                                        z112222 = true;
                                        grVar2.b(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        mg0.c(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    grVar2.b(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    mg0.c(context, (z6 || !z) ? false : z9);
                                } catch (IOException e16) {
                                    e = e16;
                                    grVar2.b(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    mg0.c(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                grVar2.h = null;
                                grVar2.g = null;
                            }
                        }
                        if (z4) {
                            A(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            grVar2.b(4, null);
                        }
                        grVar2.f = true;
                        r7 = grVar2.a(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        irVarArr2 = grVar2.g;
                        if (irVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a2 = grVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a2 == null) {
                            }
                        }
                        ig0 ig0Var222222 = grVar2.b;
                        irVarArr3 = grVar2.g;
                        byte[] bArr422222 = grVar2.c;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (irVarArr3 != null) {
                            z7 = grVar2.f;
                            if (z7) {
                            }
                        }
                        bArr = grVar2.h;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        grVar2.b(4, null);
                    }
                }
                mg0.c(context, (z6 || !z) ? false : z9);
            }
            grVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            mg0.c(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e17) {
            ig0Var.d(7, e17);
            mg0.c(context, false);
        }
    }

    public static final void a(boolean z, my myVar, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-642000585);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(myVar, startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(-723524056);
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        un coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new vf0(z, coroutineScope, rememberUpdatedState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        vf0 vf0Var = (vf0) rememberedValue2;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new a80(vf0Var, z, null), startRestartGroup, (i & 14) | 64);
        td0 a2 = y50.a(startRestartGroup);
        if (a2 == null) {
            o.f("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            return;
        }
        rd0 onBackPressedDispatcher = a2.getOnBackPressedDispatcher();
        y40 y40Var = (y40) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        int i2 = 1;
        EffectsKt.DisposableEffect(y40Var, onBackPressedDispatcher, new ic(onBackPressedDispatcher, y40Var, vf0Var, i2), startRestartGroup, 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new jc(z, myVar, i, i2));
    }

    public static void b(rd0 rd0Var, fk fkVar, ky kyVar) {
        rd0Var.getClass();
        rd0Var.a(fkVar, new sd0(kyVar));
    }

    public static void c(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final Object d(z10 z10Var, us0 us0Var) {
        z10Var.cancel(null);
        Object n = z10Var.n(us0Var);
        return n == vn.d ? n : w01.a;
    }

    public static final void e(int i) {
        if (i >= 1) {
            return;
        }
        o.c(j50.h(i, "Expected positive parallelism level, but got "));
    }

    public static void f(int i) {
        if (2 > i || i >= 37) {
            StringBuilder f = kp0.f(i, "radix ", " was not in valid range ");
            f.append(new k10(2, 36, 1));
            throw new IllegalArgumentException(f.toString());
        }
    }

    public static boolean g(of ofVar) {
        return ofVar.b(null, false);
    }

    public static final Object h(kr0 kr0Var, int i) {
        Object obj;
        kr0Var.getClass();
        int e2 = p10.e(kr0Var.d, kr0Var.f, i);
        if (e2 < 0 || (obj = kr0Var.e[e2]) == e) {
            return null;
        }
        return obj;
    }

    public static boolean j(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = j(file2) && z;
        }
        return z;
    }

    public static int k(char c2) {
        int digit = Character.digit((int) c2, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a decimal digit");
    }

    public static final void l(kn knVar) {
        z10 z10Var = (z10) knVar.get(ts.l);
        if (z10Var != null && !z10Var.isActive()) {
            throw z10Var.f();
        }
    }

    public static final boolean m(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final u80 n(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new u80(matcher, charSequence);
        }
        return null;
    }

    public static final Object o(dn0 dn0Var, long j, my myVar) {
        while (true) {
            dn0 dn0Var2 = dn0Var;
            while (true) {
                if (dn0Var2.d >= j && !dn0Var2.c()) {
                    return dn0Var2;
                }
                Object objectVolatile = dc.a.getObjectVolatile(dn0Var2, kl.a);
                ox oxVar = b;
                if (objectVolatile == oxVar) {
                    return oxVar;
                }
                dn0Var = (dn0) ((kl) objectVolatile);
                if (dn0Var != null) {
                    break;
                }
                dn0 dn0Var3 = (dn0) myVar.invoke(Long.valueOf(dn0Var2.d + 1), dn0Var2);
                while (true) {
                    Unsafe unsafe = dc.a;
                    long j2 = kl.a;
                    if (unsafe.compareAndSwapObject(dn0Var2, j2, (Object) null, dn0Var3)) {
                        if (dn0Var2.c()) {
                            dn0Var2.d();
                        }
                        dn0Var2 = dn0Var3;
                    } else if (unsafe.getObjectVolatile(dn0Var2, j2) != null) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(iw iwVar, my myVar, hm hmVar) {
        dx dxVar;
        int i;
        my myVar2;
        ji0 ji0Var;
        a e2;
        rw rwVar;
        Object obj;
        ox oxVar = y80.e;
        if (hmVar instanceof dx) {
            dxVar = (dx) hmVar;
            int i2 = dxVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dxVar.h = i2 - Integer.MIN_VALUE;
                Object obj2 = dxVar.g;
                i = dxVar.h;
                int i3 = 1;
                if (i != 0) {
                    p10.Q(obj2);
                    ji0 ji0Var2 = new ji0();
                    ji0Var2.d = oxVar;
                    rw rwVar2 = new rw(i3, myVar, ji0Var2);
                    try {
                        dxVar.d = (us0) myVar;
                        dxVar.e = ji0Var2;
                        dxVar.f = rwVar2;
                        dxVar.h = 1;
                        Object collect = iwVar.collect(rwVar2, dxVar);
                        Object obj3 = vn.d;
                        if (collect == obj3) {
                            return obj3;
                        }
                        myVar2 = myVar;
                        ji0Var = ji0Var2;
                    } catch (a e3) {
                        myVar2 = myVar;
                        ji0Var = ji0Var2;
                        e2 = e3;
                        rwVar = rwVar2;
                        if (e2.d != rwVar) {
                        }
                        obj = ji0Var.d;
                        if (obj == oxVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rwVar = dxVar.f;
                    ji0Var = dxVar.e;
                    myVar2 = (my) dxVar.d;
                    try {
                        p10.Q(obj2);
                    } catch (a e4) {
                        e2 = e4;
                        if (e2.d != rwVar) {
                            throw e2;
                        }
                        obj = ji0Var.d;
                        if (obj == oxVar) {
                        }
                    }
                }
                obj = ji0Var.d;
                if (obj == oxVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + myVar2);
            }
        }
        dxVar = new dx(hmVar);
        Object obj22 = dxVar.g;
        i = dxVar.h;
        int i32 = 1;
        if (i != 0) {
        }
        obj = ji0Var.d;
        if (obj == oxVar) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList q(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        bj0 bj0Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        cj0 cj0Var = new cj0(resources, theme);
        synchronized (fj0.c) {
            try {
                SparseArray sparseArray = (SparseArray) fj0.b.get(cj0Var);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (bj0Var = (bj0) sparseArray.get(i)) != null) {
                    if (bj0Var.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (bj0Var.c != 0) {
                            }
                            colorStateList2 = bj0Var.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = fj0.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = ej.a(resources, resources.getXml(i), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (fj0.c) {
            try {
                WeakHashMap weakHashMap = fj0.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(cj0Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(cj0Var, sparseArray2);
                }
                sparseArray2.append(i, new bj0(colorStateList, cj0Var.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static final String r(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final z10 s(kn knVar) {
        z10 z10Var = (z10) knVar.get(ts.l);
        if (z10Var != null) {
            return z10Var;
        }
        o.p(knVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final a30 t(a30 a30Var) {
        return a30Var.c().c() ? a30Var : new yc0(a30Var);
    }

    public static final void u(kn knVar, Throwable th) {
        try {
            on onVar = (on) knVar.get(nn.d);
            if (onVar != null) {
                onVar.handleException(knVar, th);
            } else {
                d41.B(knVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                d41.c(runtimeException, th);
                th = runtimeException;
            }
            d41.B(knVar, th);
        }
    }

    public static int v(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        o.m(j50.h(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final qr w(z10 z10Var, boolean z, d20 d20Var) {
        return z10Var instanceof i20 ? ((i20) z10Var).I(z, d20Var) : z10Var.e(d20Var.k(), z, new c20(1, d20Var, d20.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean x(kn knVar) {
        z10 z10Var = (z10) knVar.get(ts.l);
        if (z10Var != null) {
            return z10Var.isActive();
        }
        return true;
    }

    public static boolean y(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final q z(Object[] objArr) {
        objArr.getClass();
        return new q(objArr);
    }

    public abstract cq D(String str, ky kyVar);

    public abstract Object i();
}
