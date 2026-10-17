package com.lumi.singularity.ui.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.a70;
import defpackage.ac;
import defpackage.b2;
import defpackage.cq0;
import defpackage.d41;
import defpackage.dj;
import defpackage.ds0;
import defpackage.ek;
import defpackage.f80;
import defpackage.hq;
import defpackage.ie;
import defpackage.je;
import defpackage.ku;
import defpackage.ky;
import defpackage.nq;
import defpackage.nr;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.rh;
import defpackage.t40;
import defpackage.uo;
import defpackage.uv;
import defpackage.v1;
import defpackage.v60;
import defpackage.vu0;
import defpackage.w60;
import defpackage.y1;
import defpackage.y60;
import defpackage.y80;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MainActivity extends vu0 implements cq0 {
    public final y1 v = g(new v1(2), new b2(this, 1));
    public static final Set w = ac.o0(new String[]{"eureka", "panther"});
    public static final Set x = ac.o0(new String[]{"hollywood", "eureka", "panther", "xse_panther", "seacliff"});
    public static final Set y = ac.o0(new String[]{"52106880032500150", "52106880035500150", "52106880036800150", "52106880038100150", "52106880041300150", "52106880041500150", "52106880052400150", "52150470014600150", "52150470020900150", "52150470026300150", "52150470027100150", "52150470030200150", "52150470034100150", "52150470034600150", "52175280016700150", "52175280018900150", "52175280022600150", "52175280027400150", "52175280028600150", "52175280031200150", "52175280039900150", "52202280016300150", "52202280019500150", "52202280021800150", "52202280025400150", "52202280027400150", "52202280028100150", "52222680019700150", "52222680020900150", "52222680023900150", "52222680024500150", "52222680026600150", "52222680028100150", "52222680032600150", "52242990012600150", "52242990017700150", "52242990018400150", "52242990019700150", "52242990021400150", "52242990023000150", "52242990023400150", "52242990024200150"});
    public static final Set z = ac.o0(new String[]{"2921110037200610", "2921110038400610", "2921110041700610", "2921110053000610", "3296320014500610", "3296320020900610", "3296320026500610", "3296320027400610", "3296320030600610", "3296320034600610", "3296320034800610", "3451870014800610", "3451870018000610", "3451870019900610", "3451870024000610", "3451870029100610", "3451870030300610", "3451870033000610", "3594280009600610", "3594280014400610", "3594280016000610", "3594280019200610", "3594280021600610", "3594280025400610", "3594280027100610", "3594280027800610", "3697600015800610", "3697600019500610", "3697600020700610", "3697600023700610", "3697600024300610", "3697600027800610", "3697600032300610", "3814840012900610", "3814840015800610", "3814840018300610", "3814840019100610", "3814840020600610", "3814840021800610", "3814840023400610", "3814840023900610", "3814840024700610"});
    public static final Set A = ac.o0(new String[]{"51943020036500520", "51943020043400520", "51943020048700520", "51943020050500520", "51943020052200520", "51943020055900520", "51943020065300520", "52083180010100520", "52083180015100520", "52083180022600520", "52083180023600520", "52083180027000520", "52083180031500520", "52083180032000520", "52168470022300520", "52168470026700520", "52168470029300520", "52168470033700520", "52168470039400520", "52168470040700520", "52168470043600520", "52168470052900520", "52270740013000520", "52270740021500520", "52270740024300520", "52270740028400520", "52270740031100520", "52270740034800520", "52270740036900520", "52270740038100520", "52345320022000520", "52345320026300520", "52345320027600520", "52345320031000520", "52345320031600520", "52345320035400520", "52345320040100520", "52433670017700520", "52433670023300520", "52433670026500520", "52433670028200520", "52433670030600520", "52433670032200520", "52433670034300520", "52433670035200520", "52433670036000520"});
    public static final Set B = ac.o0(new String[]{"51360500027200340", "51360500032000340", "51360500035000340", "51360500037600340", "51360500040800340", "51360500051900340", "51412760014500340", "51412760020900340", "51412760025900340", "51412760027100340", "51412760030200340", "51412760034600340", "51436340028700340", "51436340031400340", "51436340040000340", "51463340027700340", "51483620019200340", "51483620020700340", "51483620023800340", "51483620024400340", "51483620026500340", "51483620027600340", "51483620032400340", "51503870018000340", "51503870018800340", "51503870019200340", "51503870020100340", "51503870021300340", "51503870023600340", "51503870024400340"});
    public static final Set C = ac.o0(new String[]{"712720041601570", "712720049401570", "752170024601570", "772360028001570", "772360030601570", "772360039101570", "796930021201570", "796930024901570", "796930026601570", "796930027301570", "836890021501570", "836890023601570", "836890024401570"});

    public static String i(File file, String str, String... strArr) {
        try {
            ArrayList G = y80.G(file.getAbsolutePath());
            dj.e0(G, strArr);
            ProcessBuilder processBuilder = new ProcessBuilder(G);
            Map<String, String> environment = processBuilder.environment();
            environment.getClass();
            environment.put("HOME", str);
            Map<String, String> environment2 = processBuilder.environment();
            environment2.getClass();
            environment2.put("ANDROID_SDK_HOME", str);
            Map<String, String> environment3 = processBuilder.environment();
            environment3.getClass();
            environment3.put("EXTERNAL_STORAGE", str);
            Map<String, String> environment4 = processBuilder.environment();
            environment4.getClass();
            environment4.put("TMPDIR", str);
            Map<String, String> environment5 = processBuilder.environment();
            environment5.getClass();
            environment5.put("ADB_VENDOR_KEYS", str.concat("/.android/adbkey"));
            Map<String, String> environment6 = processBuilder.environment();
            environment6.getClass();
            environment6.put("USER", "singularity");
            Map<String, String> environment7 = processBuilder.environment();
            environment7.getClass();
            environment7.put("LOGNAME", "singularity");
            Map<String, String> environment8 = processBuilder.environment();
            environment8.getClass();
            environment8.put("HOSTNAME", "quest");
            Map<String, String> environment9 = processBuilder.environment();
            environment9.getClass();
            environment9.put("ADB_SERVER_SOCKET", "tcp:15037");
            Map<String, String> environment10 = processBuilder.environment();
            environment10.getClass();
            environment10.put("ANDROID_ADB_LOG_PATH", str.concat("/adb_daemon.log"));
            Process start = processBuilder.redirectErrorStream(true).start();
            InputStream inputStream = start.getInputStream();
            inputStream.getClass();
            String z2 = p01.z(new BufferedReader(new InputStreamReader(inputStream, rh.a), 8192));
            start.waitFor();
            return z2;
        } catch (Exception e) {
            Log.e("MainActivity", "ADB execution error", e);
            return "";
        }
    }

    public static final void k(MainActivity mainActivity, ky kyVar, String str) {
        Log.d("Fugu", str);
        t40 y2 = d41.y(mainActivity);
        nq nqVar = nr.a;
        p01.t(y2, f80.a, null, new y60(2, null, kyVar, str), 2);
    }

    public static void l(MainActivity mainActivity, ky kyVar, String str) {
        Log.e("Fugu", str);
        t40 y2 = d41.y(mainActivity);
        nq nqVar = nr.a;
        p01.t(y2, f80.a, null, new y60(3, null, kyVar, str), 2);
    }

    public static String n() {
        String str = Build.VERSION.INCREMENTAL;
        if (y.contains(str)) {
            return uo.c("q2_", str);
        }
        if (z.contains(str)) {
            return uo.c("q3s_", str);
        }
        if (C.contains(str)) {
            return uo.c("q3sx_", str);
        }
        if (A.contains(str)) {
            return uo.c("q3_", str);
        }
        if (B.contains(str)) {
            return uo.c("QPro_", str);
        }
        return null;
    }

    public static String o() {
        String obj;
        String property = System.getProperty("os.version");
        return (property == null || (obj = ds0.E0(property).toString()) == null) ? "" : obj;
    }

    public static final void s(w60 w60Var, MainActivity mainActivity, File file, String str, boolean z2) {
        String concat = "/data/local/tmp/".concat(str);
        String str2 = w60Var.b;
        File file2 = w60Var.a;
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        mainActivity.getClass();
        String i = i(file2, str2, "-s", "127.0.0.1:5555", "push", absolutePath, concat);
        if (ds0.g0(i, "error", true) || ds0.g0(i, "failed", true)) {
            Log.e("PayloadChain", "  PUSH FAILED (" + str + "): " + i);
        }
        if (z2) {
            i(file2, str2, "-s", "127.0.0.1:5555", "shell", "chmod", "755", concat);
        }
    }

    public final boolean h() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop ro.boot.adb.rootable").getInputStream();
            inputStream.getClass();
            return q10.b(ds0.E0(p01.z(new BufferedReader(new InputStreamReader(inputStream, rh.a), 8192))).toString(), "1");
        } catch (Exception e) {
            Log.e("MainActivity", "Failed to check adb rootable state", e);
            return false;
        }
    }

    public final void j(Context context, ku kuVar, ky kyVar, ky kyVar2) {
        context.getClass();
        kuVar.getClass();
        t40 y2 = d41.y(this);
        nq nqVar = nr.a;
        p01.t(y2, hq.d, null, new a70(context, kuVar, this, kyVar2, kyVar, null), 2);
    }

    public final void m() {
        Build.PRODUCT.getClass();
    }

    @Override // defpackage.vu0, defpackage.dk, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ek.a(this, ComposableLambdaKt.composableLambdaInstance(-2078199090, true, new v60(this, getSharedPreferences("singularity_prefs", 0), 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(ku kuVar) {
        long j;
        kuVar.getClass();
        int ordinal = kuVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                o.n();
                return false;
            }
            if (q(ku.e)) {
                m();
                String str = Build.PRODUCT;
                if (!q10.b(str, "eureka")) {
                    j = q10.b(str, "panther") ? 1176880099000610L : 51154110129000520L;
                }
                String str2 = Build.VERSION.INCREMENTAL;
                str2.getClass();
                if (Long.parseLong(str2) > j) {
                    return true;
                }
            }
            return false;
        }
        if (!q(ku.d) || n() != null) {
            return false;
        }
    }

    public final boolean q(ku kuVar) {
        kuVar.getClass();
        int ordinal = kuVar.ordinal();
        if (ordinal == 0) {
            m();
            return x.contains(Build.PRODUCT);
        }
        if (ordinal != 1) {
            o.n();
            return false;
        }
        m();
        return w.contains(Build.PRODUCT);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:37|38|39|(4:40|41|(1:43)(1:128)|44)|(2:46|(24:48|49|50|51|(8:53|54|55|56|57|58|59|60)|79|(0)|(0)|(0)|(0)|(0)|90|91|92|93|94|95|96|(0)(0)|99|100|(0)|103|104))|127|50|51|(0)|79|(0)|(0)|(0)|(0)|(0)|90|91|92|93|94|95|96|(0)(0)|99|100|(0)|103|104) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0178, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Context context, AssetManager assetManager, w60 w60Var, ky kyVar) {
        ie ieVar;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        File file;
        je K;
        String str2 = "BLACKHOLE";
        SharedPreferences sharedPreferences = context.getSharedPreferences("payload_prefs", 0);
        boolean z5 = sharedPreferences.getBoolean("payload_singularity_magisk", true);
        boolean z6 = sharedPreferences.getBoolean("payload_persistent_port", true);
        boolean z7 = sharedPreferences.getBoolean("payload_soft_reboot", true);
        boolean z8 = sharedPreferences.getBoolean("payload_disable_ota", true);
        boolean z9 = sharedPreferences.getBoolean("payload_bootanimation", true);
        try {
            String string = sharedPreferences.getString("payload_bootanimation_choice", "BLACKHOLE");
            if (string != null) {
                str2 = string;
            }
            ieVar = ie.valueOf(str2);
        } catch (IllegalArgumentException unused) {
            ieVar = ie.f;
        }
        String string2 = sharedPreferences.getString("payload_bootanimation_custom_uri", null);
        kyVar.invoke("Staging Magisk assets and dynamic scripts...");
        File file2 = new File(context.getCacheDir(), "singularity_magisk.sh");
        InputStream open = assetManager.open("payloads/singularity_magisk.sh");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                open.getClass();
                q10.k(open, fileOutputStream);
                fileOutputStream.close();
                open.close();
                File file3 = new File(context.getCacheDir(), "persistent_port.sh");
                open = assetManager.open("payloads/persistent_port.sh");
                try {
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        open.getClass();
                        q10.k(open, fileOutputStream);
                        fileOutputStream.close();
                        open.close();
                        File file4 = new File(context.getCacheDir(), "disable_ota.sh");
                        open = assetManager.open("payloads/disable_ota.sh");
                        try {
                            open.getClass();
                            q10.k(open, new FileOutputStream(file4));
                            open.close();
                            file4.setExecutable(true);
                            File file5 = new File(context.getCacheDir(), "soft_reboot.sh");
                            open = assetManager.open("payloads/soft_reboot.sh");
                            try {
                                fileOutputStream = new FileOutputStream(file5);
                                try {
                                    open.getClass();
                                    q10.k(open, fileOutputStream);
                                    fileOutputStream.close();
                                    open.close();
                                    File file6 = new File(context.getCacheDir(), "bootanimation.sh");
                                    open = assetManager.open("payloads/bootanimation.sh");
                                    try {
                                        fileOutputStream = new FileOutputStream(file6);
                                        try {
                                            open.getClass();
                                            q10.k(open, fileOutputStream);
                                            fileOutputStream.close();
                                            open.close();
                                            File file7 = new File(context.getCacheDir(), "meta-horizonos.glb");
                                            File file8 = new File(context.getCacheDir(), "StartupSoundOverlay.apk");
                                            ie ieVar2 = ie.h;
                                            if (ieVar == ieVar2 && string2 != null) {
                                                try {
                                                    str = "soft_reboot.sh";
                                                } catch (Exception e) {
                                                    e = e;
                                                    str = "soft_reboot.sh";
                                                }
                                                try {
                                                    file = new File(context.getCacheDir(), "bootpack_stage");
                                                    uv.K(file);
                                                    Uri parse = Uri.parse(string2);
                                                    parse.getClass();
                                                    K = p10.K(context, parse, file);
                                                    File file9 = new File(file, K.c);
                                                    boolean exists = file9.exists();
                                                    if (exists) {
                                                        z4 = exists;
                                                        uv.J(file9, file7, true);
                                                    } else {
                                                        z4 = exists;
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    z2 = false;
                                                    Log.e("PayloadChain", "Failed to extract custom boot animation zip: " + e.getMessage());
                                                    z4 = false;
                                                    if (!z4) {
                                                    }
                                                    File file10 = new File(context.getCacheDir(), "payload_chain.sh");
                                                    z3 = z2;
                                                    StringBuilder sb = new StringBuilder("#!/system/bin/sh\nif [ -f /persist/srt_push/token ]; then rm -f /persist/srt_push/token; echo 'Killswitch token removed successfully.'; fi\n");
                                                    if (z5) {
                                                    }
                                                    if (z8) {
                                                    }
                                                    if (z6) {
                                                    }
                                                    if (z9) {
                                                    }
                                                    if (z7) {
                                                    }
                                                    uv.M(file10, sb.toString());
                                                    File file11 = new File(context.getCacheDir(), "singularity-Magisk.apk");
                                                    open = assetManager.open("exploit/magisk.apk");
                                                    fileOutputStream = new FileOutputStream(file11);
                                                    open.getClass();
                                                    q10.k(open, fileOutputStream);
                                                    fileOutputStream.close();
                                                    open.close();
                                                    s(w60Var, this, file2, "singularity_magisk.sh", true);
                                                    s(w60Var, this, file3, "persistent_port.sh", true);
                                                    s(w60Var, this, file4, "disable_ota.sh", true);
                                                    s(w60Var, this, file5, str, true);
                                                    s(w60Var, this, file6, "bootanimation.sh", true);
                                                    s(w60Var, this, file7, "meta-horizonos.glb", false);
                                                    if (z3) {
                                                    }
                                                    s(w60Var, this, file10, "payload_chain.sh", true);
                                                    s(w60Var, this, file11, "singularity-Magisk.apk", false);
                                                    file2.delete();
                                                    file3.delete();
                                                    file5.delete();
                                                    file6.delete();
                                                    file7.delete();
                                                    if (file8.exists()) {
                                                    }
                                                    file10.delete();
                                                    file11.delete();
                                                    kyVar.invoke("Payload chain staged.");
                                                    return;
                                                }
                                                if (K.d) {
                                                    File file12 = new File(file, "StartupSoundOverlay.apk");
                                                    if (file12.exists()) {
                                                        uv.J(file12, file8, true);
                                                        z2 = true;
                                                        uv.K(file);
                                                        if (!z4) {
                                                            open = assetManager.open("bootanimation/singularity-blackhole.glb");
                                                            try {
                                                                fileOutputStream = new FileOutputStream(file7);
                                                                try {
                                                                    open.getClass();
                                                                    q10.k(open, fileOutputStream);
                                                                    fileOutputStream.close();
                                                                    open.close();
                                                                    z2 = false;
                                                                } finally {
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        File file102 = new File(context.getCacheDir(), "payload_chain.sh");
                                                        z3 = z2;
                                                        StringBuilder sb2 = new StringBuilder("#!/system/bin/sh\nif [ -f /persist/srt_push/token ]; then rm -f /persist/srt_push/token; echo 'Killswitch token removed successfully.'; fi\n");
                                                        if (z5) {
                                                        }
                                                        if (z8) {
                                                        }
                                                        if (z6) {
                                                        }
                                                        if (z9) {
                                                        }
                                                        if (z7) {
                                                        }
                                                        uv.M(file102, sb2.toString());
                                                        File file112 = new File(context.getCacheDir(), "singularity-Magisk.apk");
                                                        open = assetManager.open("exploit/magisk.apk");
                                                        fileOutputStream = new FileOutputStream(file112);
                                                        open.getClass();
                                                        q10.k(open, fileOutputStream);
                                                        fileOutputStream.close();
                                                        open.close();
                                                        s(w60Var, this, file2, "singularity_magisk.sh", true);
                                                        s(w60Var, this, file3, "persistent_port.sh", true);
                                                        s(w60Var, this, file4, "disable_ota.sh", true);
                                                        s(w60Var, this, file5, str, true);
                                                        s(w60Var, this, file6, "bootanimation.sh", true);
                                                        s(w60Var, this, file7, "meta-horizonos.glb", false);
                                                        if (z3) {
                                                        }
                                                        s(w60Var, this, file102, "payload_chain.sh", true);
                                                        s(w60Var, this, file112, "singularity-Magisk.apk", false);
                                                        file2.delete();
                                                        file3.delete();
                                                        file5.delete();
                                                        file6.delete();
                                                        file7.delete();
                                                        if (file8.exists()) {
                                                        }
                                                        file102.delete();
                                                        file112.delete();
                                                        kyVar.invoke("Payload chain staged.");
                                                        return;
                                                    }
                                                }
                                                z2 = false;
                                                uv.K(file);
                                                if (!z4) {
                                                }
                                                File file1022 = new File(context.getCacheDir(), "payload_chain.sh");
                                                z3 = z2;
                                                StringBuilder sb22 = new StringBuilder("#!/system/bin/sh\nif [ -f /persist/srt_push/token ]; then rm -f /persist/srt_push/token; echo 'Killswitch token removed successfully.'; fi\n");
                                                if (z5) {
                                                }
                                                if (z8) {
                                                }
                                                if (z6) {
                                                }
                                                if (z9) {
                                                }
                                                if (z7) {
                                                }
                                                uv.M(file1022, sb22.toString());
                                                File file1122 = new File(context.getCacheDir(), "singularity-Magisk.apk");
                                                open = assetManager.open("exploit/magisk.apk");
                                                fileOutputStream = new FileOutputStream(file1122);
                                                open.getClass();
                                                q10.k(open, fileOutputStream);
                                                fileOutputStream.close();
                                                open.close();
                                                s(w60Var, this, file2, "singularity_magisk.sh", true);
                                                s(w60Var, this, file3, "persistent_port.sh", true);
                                                s(w60Var, this, file4, "disable_ota.sh", true);
                                                s(w60Var, this, file5, str, true);
                                                s(w60Var, this, file6, "bootanimation.sh", true);
                                                s(w60Var, this, file7, "meta-horizonos.glb", false);
                                                if (z3) {
                                                }
                                                s(w60Var, this, file1022, "payload_chain.sh", true);
                                                s(w60Var, this, file1122, "singularity-Magisk.apk", false);
                                                file2.delete();
                                                file3.delete();
                                                file5.delete();
                                                file6.delete();
                                                file7.delete();
                                                if (file8.exists()) {
                                                }
                                                file1022.delete();
                                                file1122.delete();
                                                kyVar.invoke("Payload chain staged.");
                                                return;
                                            }
                                            str = "soft_reboot.sh";
                                            open = assetManager.open("bootanimation/".concat(ieVar == ieVar2 ? "singularity-blackhole.glb" : ieVar.d));
                                            try {
                                                fileOutputStream = new FileOutputStream(file7);
                                                try {
                                                    open.getClass();
                                                    q10.k(open, fileOutputStream);
                                                    fileOutputStream.close();
                                                    open.close();
                                                    try {
                                                        try {
                                                            if (ieVar == ie.g) {
                                                                open = assetManager.open("bootanimation/StartupSoundOverlay.apk");
                                                                try {
                                                                    fileOutputStream = new FileOutputStream(file8);
                                                                    try {
                                                                        open.getClass();
                                                                        q10.k(open, fileOutputStream);
                                                                        fileOutputStream.close();
                                                                        open.close();
                                                                        z2 = true;
                                                                        File file10222 = new File(context.getCacheDir(), "payload_chain.sh");
                                                                        z3 = z2;
                                                                        StringBuilder sb222 = new StringBuilder("#!/system/bin/sh\nif [ -f /persist/srt_push/token ]; then rm -f /persist/srt_push/token; echo 'Killswitch token removed successfully.'; fi\n");
                                                                        if (z5) {
                                                                            sb222.append("echo 3 > /proc/sys/vm/drop_caches\n/data/local/tmp/singularity_magisk.sh\n");
                                                                        }
                                                                        if (z8) {
                                                                            sb222.append("/data/local/tmp/disable_ota.sh\n");
                                                                        }
                                                                        if (z6) {
                                                                            sb222.append("/data/local/tmp/persistent_port.sh\n");
                                                                        }
                                                                        if (z9) {
                                                                            sb222.append("/data/local/tmp/bootanimation.sh\n");
                                                                        }
                                                                        if (z7) {
                                                                            sb222.append("/data/local/tmp/soft_reboot.sh\n");
                                                                        }
                                                                        uv.M(file10222, sb222.toString());
                                                                        File file11222 = new File(context.getCacheDir(), "singularity-Magisk.apk");
                                                                        open = assetManager.open("exploit/magisk.apk");
                                                                        fileOutputStream = new FileOutputStream(file11222);
                                                                        open.getClass();
                                                                        q10.k(open, fileOutputStream);
                                                                        fileOutputStream.close();
                                                                        open.close();
                                                                        s(w60Var, this, file2, "singularity_magisk.sh", true);
                                                                        s(w60Var, this, file3, "persistent_port.sh", true);
                                                                        s(w60Var, this, file4, "disable_ota.sh", true);
                                                                        s(w60Var, this, file5, str, true);
                                                                        s(w60Var, this, file6, "bootanimation.sh", true);
                                                                        s(w60Var, this, file7, "meta-horizonos.glb", false);
                                                                        if (z3) {
                                                                            i(w60Var.a, w60Var.b, "-s", "127.0.0.1:5555", "shell", "rm", "-f", "/data/local/tmp/StartupSoundOverlay.apk");
                                                                        } else {
                                                                            s(w60Var, this, file8, "StartupSoundOverlay.apk", false);
                                                                        }
                                                                        s(w60Var, this, file10222, "payload_chain.sh", true);
                                                                        s(w60Var, this, file11222, "singularity-Magisk.apk", false);
                                                                        file2.delete();
                                                                        file3.delete();
                                                                        file5.delete();
                                                                        file6.delete();
                                                                        file7.delete();
                                                                        if (file8.exists()) {
                                                                            file8.delete();
                                                                        }
                                                                        file10222.delete();
                                                                        file11222.delete();
                                                                        kyVar.invoke("Payload chain staged.");
                                                                        return;
                                                                    } finally {
                                                                        try {
                                                                            throw th;
                                                                        } finally {
                                                                        }
                                                                    }
                                                                } finally {
                                                                    try {
                                                                        throw th;
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                            open.getClass();
                                                            q10.k(open, fileOutputStream);
                                                            fileOutputStream.close();
                                                            open.close();
                                                            s(w60Var, this, file2, "singularity_magisk.sh", true);
                                                            s(w60Var, this, file3, "persistent_port.sh", true);
                                                            s(w60Var, this, file4, "disable_ota.sh", true);
                                                            s(w60Var, this, file5, str, true);
                                                            s(w60Var, this, file6, "bootanimation.sh", true);
                                                            s(w60Var, this, file7, "meta-horizonos.glb", false);
                                                            if (z3) {
                                                            }
                                                            s(w60Var, this, file10222, "payload_chain.sh", true);
                                                            s(w60Var, this, file11222, "singularity-Magisk.apk", false);
                                                            file2.delete();
                                                            file3.delete();
                                                            file5.delete();
                                                            file6.delete();
                                                            file7.delete();
                                                            if (file8.exists()) {
                                                            }
                                                            file10222.delete();
                                                            file11222.delete();
                                                            kyVar.invoke("Payload chain staged.");
                                                            return;
                                                        } finally {
                                                            try {
                                                                throw th;
                                                            } finally {
                                                            }
                                                        }
                                                        fileOutputStream = new FileOutputStream(file11222);
                                                    } finally {
                                                        try {
                                                            throw th;
                                                        } finally {
                                                        }
                                                    }
                                                    z2 = false;
                                                    File file102222 = new File(context.getCacheDir(), "payload_chain.sh");
                                                    z3 = z2;
                                                    StringBuilder sb2222 = new StringBuilder("#!/system/bin/sh\nif [ -f /persist/srt_push/token ]; then rm -f /persist/srt_push/token; echo 'Killswitch token removed successfully.'; fi\n");
                                                    if (z5) {
                                                    }
                                                    if (z8) {
                                                    }
                                                    if (z6) {
                                                    }
                                                    if (z9) {
                                                    }
                                                    if (z7) {
                                                    }
                                                    uv.M(file102222, sb2222.toString());
                                                    File file112222 = new File(context.getCacheDir(), "singularity-Magisk.apk");
                                                    open = assetManager.open("exploit/magisk.apk");
                                                } finally {
                                                    try {
                                                        throw th;
                                                    } finally {
                                                    }
                                                }
                                            } finally {
                                                try {
                                                    throw th;
                                                } finally {
                                                }
                                            }
                                        } finally {
                                            try {
                                                throw th;
                                            } finally {
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
