package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.lumi.singularity.ui.activities.MainActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class a70 extends us0 implements my {
    public File d;
    public String e;
    public fi0 f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ ku j;
    public final /* synthetic */ MainActivity k;
    public final /* synthetic */ ky l;
    public final /* synthetic */ ky m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a70(Context context, ku kuVar, MainActivity mainActivity, ky kyVar, ky kyVar2, hm hmVar) {
        super(2, hmVar);
        this.i = context;
        this.j = kuVar;
        this.k = mainActivity;
        this.l = kyVar;
        this.m = kyVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #3 {all -> 0x0058, blocks: (B:3:0x001c, B:9:0x002e, B:11:0x004f, B:15:0x007c, B:19:0x005b, B:37:0x00a1, B:38:0x00a4, B:5:0x0020, B:8:0x002b, B:28:0x009a, B:29:0x009d, B:7:0x0025, B:24:0x0097, B:33:0x009e), top: B:2:0x001c, inners: #0, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(Context context, AssetManager assetManager, MainActivity mainActivity, File file, String str, String str2, String str3, boolean z) {
        File file2 = new File(context.getCacheDir(), uo.c("fugu_", new File(str2).getName()));
        try {
            InputStream open = assetManager.open(str2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    open.getClass();
                    q10.k(open, fileOutputStream);
                    fileOutputStream.close();
                    open.close();
                    String absolutePath = file2.getAbsolutePath();
                    absolutePath.getClass();
                    String i = MainActivity.i(file, str, "-s", "127.0.0.1:5555", "push", absolutePath, str3);
                    if (!ds0.g0(i, "error", true)) {
                        if (ds0.g0(i, "failed", true)) {
                        }
                        if (z) {
                            MainActivity.i(file, str, "-s", "127.0.0.1:5555", "shell", "chmod", "755", str3);
                        }
                        file2.delete();
                    }
                    Log.e("Fugu", "Push failed: " + str2 + " -> " + str3 + ": " + i);
                    if (z) {
                    }
                    file2.delete();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            file2.delete();
            throw th;
        }
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        a70 a70Var = new a70(this.i, this.j, this.k, this.l, this.m, hmVar);
        a70Var.h = obj;
        return a70Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((a70) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0213 A[Catch: Exception -> 0x0161, TRY_ENTER, TryCatch #17 {Exception -> 0x0161, blocks: (B:98:0x015d, B:105:0x016e, B:120:0x0203, B:123:0x0213, B:124:0x0228, B:127:0x0236, B:129:0x0258, B:130:0x029c, B:134:0x02a6, B:135:0x0265, B:136:0x0273, B:139:0x028c, B:142:0x02e4, B:143:0x030c, B:145:0x0377, B:146:0x037a, B:148:0x037d, B:149:0x0397, B:153:0x039f, B:155:0x03f5, B:159:0x046e, B:161:0x04b4, B:164:0x04be, B:72:0x074e, B:165:0x0602, B:173:0x0620, B:174:0x0623, B:178:0x01ec, B:40:0x0624, B:42:0x0646, B:44:0x0658, B:45:0x065a, B:47:0x0660, B:51:0x0698, B:60:0x06aa, B:61:0x06ad, B:63:0x06ae, B:65:0x06bd, B:67:0x06db, B:69:0x06e1, B:71:0x0708, B:49:0x0684, B:57:0x06a8, B:157:0x0466, B:170:0x061e), top: B:38:0x012c, inners: #0, #2, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0377 A[Catch: Exception -> 0x0161, TryCatch #17 {Exception -> 0x0161, blocks: (B:98:0x015d, B:105:0x016e, B:120:0x0203, B:123:0x0213, B:124:0x0228, B:127:0x0236, B:129:0x0258, B:130:0x029c, B:134:0x02a6, B:135:0x0265, B:136:0x0273, B:139:0x028c, B:142:0x02e4, B:143:0x030c, B:145:0x0377, B:146:0x037a, B:148:0x037d, B:149:0x0397, B:153:0x039f, B:155:0x03f5, B:159:0x046e, B:161:0x04b4, B:164:0x04be, B:72:0x074e, B:165:0x0602, B:173:0x0620, B:174:0x0623, B:178:0x01ec, B:40:0x0624, B:42:0x0646, B:44:0x0658, B:45:0x065a, B:47:0x0660, B:51:0x0698, B:60:0x06aa, B:61:0x06ad, B:63:0x06ae, B:65:0x06bd, B:67:0x06db, B:69:0x06e1, B:71:0x0708, B:49:0x0684, B:57:0x06a8, B:157:0x0466, B:170:0x061e), top: B:38:0x012c, inners: #0, #2, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037d A[Catch: Exception -> 0x0161, TryCatch #17 {Exception -> 0x0161, blocks: (B:98:0x015d, B:105:0x016e, B:120:0x0203, B:123:0x0213, B:124:0x0228, B:127:0x0236, B:129:0x0258, B:130:0x029c, B:134:0x02a6, B:135:0x0265, B:136:0x0273, B:139:0x028c, B:142:0x02e4, B:143:0x030c, B:145:0x0377, B:146:0x037a, B:148:0x037d, B:149:0x0397, B:153:0x039f, B:155:0x03f5, B:159:0x046e, B:161:0x04b4, B:164:0x04be, B:72:0x074e, B:165:0x0602, B:173:0x0620, B:174:0x0623, B:178:0x01ec, B:40:0x0624, B:42:0x0646, B:44:0x0658, B:45:0x065a, B:47:0x0660, B:51:0x0698, B:60:0x06aa, B:61:0x06ad, B:63:0x06ae, B:65:0x06bd, B:67:0x06db, B:69:0x06e1, B:71:0x0708, B:49:0x0684, B:57:0x06a8, B:157:0x0466, B:170:0x061e), top: B:38:0x012c, inners: #0, #2, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0397 A[Catch: Exception -> 0x0161, TRY_LEAVE, TryCatch #17 {Exception -> 0x0161, blocks: (B:98:0x015d, B:105:0x016e, B:120:0x0203, B:123:0x0213, B:124:0x0228, B:127:0x0236, B:129:0x0258, B:130:0x029c, B:134:0x02a6, B:135:0x0265, B:136:0x0273, B:139:0x028c, B:142:0x02e4, B:143:0x030c, B:145:0x0377, B:146:0x037a, B:148:0x037d, B:149:0x0397, B:153:0x039f, B:155:0x03f5, B:159:0x046e, B:161:0x04b4, B:164:0x04be, B:72:0x074e, B:165:0x0602, B:173:0x0620, B:174:0x0623, B:178:0x01ec, B:40:0x0624, B:42:0x0646, B:44:0x0658, B:45:0x065a, B:47:0x0660, B:51:0x0698, B:60:0x06aa, B:61:0x06ad, B:63:0x06ae, B:65:0x06bd, B:67:0x06db, B:69:0x06e1, B:71:0x0708, B:49:0x0684, B:57:0x06a8, B:157:0x0466, B:170:0x061e), top: B:38:0x012c, inners: #0, #2, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x079b A[Catch: Exception -> 0x07b2, TryCatch #5 {Exception -> 0x07b2, blocks: (B:10:0x07cd, B:12:0x07d1, B:16:0x08a8, B:25:0x08b8, B:26:0x08bb, B:31:0x08bc, B:32:0x08c1, B:78:0x0775, B:80:0x079b, B:82:0x07b5, B:14:0x089f, B:21:0x08b6), top: B:77:0x0775, inners: #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07c9  */
    /* JADX WARN: Type inference failed for: r12v11, types: [ky] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [ky] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r49v0, types: [ky] */
    /* JADX WARN: Type inference failed for: r49v1 */
    /* JADX WARN: Type inference failed for: r49v10 */
    /* JADX WARN: Type inference failed for: r49v8 */
    /* JADX WARN: Type inference failed for: r49v9 */
    /* JADX WARN: Type inference failed for: r53v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r53v1 */
    /* JADX WARN: Type inference failed for: r53v2 */
    /* JADX WARN: Type inference failed for: r53v4 */
    /* JADX WARN: Type inference failed for: r53v5 */
    /* JADX WARN: Type inference failed for: r53v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, ky] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [ky] */
    /* JADX WARN: Type inference failed for: r9v8, types: [ky] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        un unVar;
        ky kyVar;
        ky kyVar2;
        String str;
        String n;
        String str2;
        String str3;
        String str4;
        int i;
        ku kuVar;
        String str5;
        ku kuVar2;
        String str6;
        String[] list;
        MainActivity mainActivity;
        File file;
        String str7;
        ProcessBuilder redirectErrorStream;
        String str8;
        String str9;
        ku kuVar3;
        String str10;
        String str11;
        List list2;
        int i2;
        ku kuVar4;
        ky kyVar3;
        ky kyVar4;
        fi0 fi0Var;
        int exitValue;
        Object n2;
        vn vnVar;
        String str12 = "...";
        Context context = this.i;
        ?? r9 = "No fugu target found for build incremental: ";
        un unVar2 = (un) this.h;
        int i3 = this.g;
        String str13 = "/";
        String str14 = "/adb_daemon.log";
        String str15 = "ANDROID_ADB_LOG_PATH";
        String str16 = "tcp:15037";
        String str17 = "ADB_SERVER_SOCKET";
        String str18 = "quest";
        String str19 = "HOSTNAME";
        String str20 = "LOGNAME";
        String str21 = "USER";
        String str22 = "/.android/adbkey";
        String str23 = "ADB_VENDOR_KEYS";
        String str24 = "TMPDIR";
        ku kuVar5 = ku.d;
        String str25 = "singularity";
        ky kyVar5 = this.m;
        ku kuVar6 = this.j;
        w01 w01Var = w01.a;
        ky kyVar6 = this.l;
        MainActivity mainActivity2 = this.k;
        ?? r49 = kyVar6;
        ky kyVar7 = kyVar5;
        try {
        } catch (Exception e) {
            e = e;
            unVar = unVar2;
            kyVar = kyVar7;
            kyVar2 = r49;
        }
        if (i3 == 0) {
            p10.Q(obj);
            File file2 = new File(context.getApplicationInfo().nativeLibraryDir, "libadb.so");
            String absolutePath = context.getDir("adb_keys", 0).getAbsolutePath();
            Log.d("Fugu", "=== executeExploit START binary=" + kuVar6 + " ===");
            Log.d("Fugu", "adbFile=" + file2.getAbsolutePath() + " exists=" + file2.exists());
            StringBuilder sb = new StringBuilder("adbHomeDir=");
            sb.append(absolutePath);
            Log.d("Fugu", sb.toString());
            mainActivity2.m();
            String str26 = Build.PRODUCT;
            ?? o = MainActivity.o();
            Log.d("Fugu", "device=" + str26 + " kernel=" + o);
            AssetManager assets = context.getAssets();
            try {
            } catch (Exception e2) {
                e = e2;
                unVar = unVar2;
                kyVar = r9;
                kyVar2 = o;
                Log.e("Fugu", "executeExploit caught top-level exception", e);
                nq nqVar = nr.a;
                rz rzVar = f80.a;
                p01.t(unVar, rzVar, null, new w3(kyVar, e, null, 2), 2);
                p01.t(unVar, rzVar, null, new z60(1, null, kyVar2), 2);
                return w01Var;
            }
            if (kuVar6 != kuVar5) {
                mainActivity = mainActivity2;
                String str27 = "ANDROID_SDK_HOME";
                String str28 = "HOME";
                r9 = kyVar7;
                o = r49;
                i2 = 3;
                str7 = absolutePath;
                kuVar4 = kuVar5;
                file = file2;
                kuVar3 = kuVar6;
                if (kuVar3 == ku.e) {
                    MainActivity.k(mainActivity, r9, "Preparing cheese (Adreno GPU) exploit...");
                    str25 = str25;
                    File dir = context.getDir("exploit", 0);
                    String[] list3 = assets.list("exploit");
                    if (list3 == null) {
                        list3 = new String[0];
                    }
                    int length = list3.length;
                    str24 = str24;
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = i4;
                        String str29 = list3[i5];
                        int i6 = length;
                        File file3 = new File(dir, str29);
                        String str30 = str27;
                        StringBuilder sb2 = new StringBuilder();
                        String str31 = str28;
                        sb2.append("exploit/");
                        sb2.append(str29);
                        InputStream open = assets.open(sb2.toString());
                        try {
                            Files.copy(open, file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
                            file3.setExecutable(true);
                            q10.g(open, null);
                            i4 = i5 + 1;
                            length = i6;
                            str27 = str30;
                            str28 = str31;
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    str8 = str28;
                    str9 = str27;
                    mainActivity.m();
                    String str32 = Build.PRODUCT;
                    if (!mainActivity.q(kuVar3)) {
                        MainActivity.l(mainActivity, r9, "Cheese only supports Quest 3 / Quest 3S — device '" + str32 + "' is not supported");
                        o.invoke(null);
                        return w01Var;
                    }
                    if (mainActivity.p(kuVar3)) {
                        String str33 = Build.VERSION.INCREMENTAL;
                        str33.getClass();
                        MainActivity.l(mainActivity, r9, "Cheese is patched on this firmware (incremental " + Long.parseLong(str33) + ") — switch to Fugu");
                        o.invoke(null);
                        return w01Var;
                    }
                    str7.getClass();
                    mainActivity.r(context, assets, new w60(file, str7), new g(26, mainActivity, r9));
                    String absolutePath2 = new File(context.getApplicationInfo().nativeLibraryDir, "libexploit.so").getAbsolutePath();
                    String path = new File(dir, "cheese_launch.sh").getPath();
                    MainActivity.k(mainActivity, r9, "Launching cheese...");
                    redirectErrorStream = new ProcessBuilder(absolutePath2, "sh", path).redirectErrorStream(true);
                    redirectErrorStream.getClass();
                    kyVar4 = r9;
                    kyVar3 = o;
                    Log.d("Fugu", "Starting exploit process via ProcessBuilder");
                    Process start = redirectErrorStream.start();
                    Log.d("Fugu", "Process started (pid lookup not directly available)");
                    fi0 fi0Var2 = new fi0();
                    kyVar7 = kyVar4;
                    fi0Var = fi0Var2;
                    unVar = unVar2;
                    rr0 t = p01.t(unVar, null, null, new u3(mainActivity, start, fi0Var2, kyVar7, (hm) null), i2);
                    Log.d("Fugu", "Waiting for process to exit...");
                    start.waitFor();
                    exitValue = start.exitValue();
                    Log.d("Fugu", "Process exited with code: " + exitValue);
                    if (exitValue != 0) {
                    }
                    this.h = unVar;
                    this.d = file;
                    this.e = str7;
                    this.f = fi0Var;
                    this.g = 1;
                    n2 = t.n(this);
                    vnVar = vn.d;
                    if (n2 != vnVar) {
                    }
                }
                return w01Var;
            }
            try {
                str = Build.VERSION.INCREMENTAL;
                Log.d("Fugu", "Locating fugu target for build " + str + "...");
                n = MainActivity.n();
            } catch (Exception e3) {
                e = e3;
                r9 = kyVar7;
            }
            if (n == null) {
                r9 = kyVar7;
                try {
                    MainActivity.l(mainActivity2, r9, "No fugu target found for build incremental: " + str);
                    r49.invoke(null);
                    return w01Var;
                } catch (Exception e4) {
                    e = e4;
                    o = r49;
                    unVar = unVar2;
                    kyVar = r9;
                    kyVar2 = o;
                    Log.e("Fugu", "executeExploit caught top-level exception", e);
                    nq nqVar2 = nr.a;
                    rz rzVar2 = f80.a;
                    p01.t(unVar, rzVar2, null, new w3(kyVar, e, null, 2), 2);
                    p01.t(unVar, rzVar2, null, new z60(1, null, kyVar2), 2);
                    return w01Var;
                }
            }
            r9 = kyVar7;
            o = r49;
            Log.d("Fugu", "Target matched: ".concat(n));
            try {
                str3 = "fugu/targets/";
                try {
                    StringBuilder sb3 = new StringBuilder(str3);
                    sb3.append(n);
                    str2 = ".json";
                    try {
                        sb3.append(str2);
                        InputStream open2 = assets.open(sb3.toString());
                        try {
                            try {
                                open2.getClass();
                                byte[] z = q10.z(open2);
                                i = 3;
                                i = 3;
                                q10.g(open2, null);
                                String string = new JSONObject(new String(z, rh.a)).getJSONObject("carrier").getString("device_path");
                                string.getClass();
                                str4 = ds0.z0(string);
                                if (ds0.j0(str4, ".ko")) {
                                    str4 = str4.substring(0, str4.length() - 3);
                                }
                            } catch (Exception e5) {
                                e = e5;
                                Log.w("Fugu", "Pre-flight: could not parse carrier from target JSON: " + e.getMessage());
                                str4 = "";
                                i = obj;
                                if (str4.length() > 0) {
                                }
                                absolutePath.getClass();
                                MainActivity.i(file2, absolutePath, "-s", "127.0.0.1:5555", "shell", "mkdir -p /data/local/tmp/fugu/targets/" + n);
                                Log.d("Fugu", "Pushing fugu binaries...");
                                e(this.i, assets, mainActivity2, file2, absolutePath, "fugu/fugu", "/data/local/tmp/fugu/fugu", true);
                                e(this.i, assets, mainActivity2, file2, absolutePath, "fugu/e2e.dex", "/data/local/tmp/e2e.dex", false);
                                e(this.i, assets, mainActivity2, file2, absolutePath, "fugu/dfpoison", "/data/local/tmp/dfpoison", true);
                                AssetManager assetManager = assets;
                                MainActivity mainActivity3 = mainActivity2;
                                Log.d("Fugu", "Pushing target files...");
                                list = assetManager.list(str3 + n);
                                if (list == null) {
                                }
                                if (list.length == 0) {
                                }
                                return w01Var;
                            }
                        } finally {
                        }
                    } catch (Exception e6) {
                        e = e6;
                        obj = 3;
                        Log.w("Fugu", "Pre-flight: could not parse carrier from target JSON: " + e.getMessage());
                        str4 = "";
                        i = obj;
                        if (str4.length() > 0) {
                        }
                        absolutePath.getClass();
                        MainActivity.i(file2, absolutePath, "-s", "127.0.0.1:5555", "shell", "mkdir -p /data/local/tmp/fugu/targets/" + n);
                        Log.d("Fugu", "Pushing fugu binaries...");
                        e(this.i, assets, mainActivity2, file2, absolutePath, "fugu/fugu", "/data/local/tmp/fugu/fugu", true);
                        e(this.i, assets, mainActivity2, file2, absolutePath, "fugu/e2e.dex", "/data/local/tmp/e2e.dex", false);
                        e(this.i, assets, mainActivity2, file2, absolutePath, "fugu/dfpoison", "/data/local/tmp/dfpoison", true);
                        AssetManager assetManager2 = assets;
                        MainActivity mainActivity32 = mainActivity2;
                        Log.d("Fugu", "Pushing target files...");
                        list = assetManager2.list(str3 + n);
                        if (list == null) {
                        }
                        if (list.length == 0) {
                        }
                        return w01Var;
                    }
                } catch (Exception e7) {
                    e = e7;
                    str2 = ".json";
                }
            } catch (Exception e8) {
                e = e8;
                str2 = ".json";
                str3 = "fugu/targets/";
            }
            if (str4.length() > 0) {
                absolutePath.getClass();
                Iterator it = ds0.q0(MainActivity.i(file2, absolutePath, "-s", "127.0.0.1:5555", "shell", "lsmod")).iterator();
                while (true) {
                    f50 f50Var = (f50) it;
                    Iterator it2 = it;
                    if (!f50Var.hasNext()) {
                        kuVar = kuVar5;
                        str5 = str12;
                        kuVar2 = kuVar6;
                        str6 = str2;
                        Log.d("Fugu", "Pre-flight: carrier '" + str4 + "' not loaded — proceeding.");
                        break;
                    }
                    ku kuVar7 = kuVar5;
                    String str34 = (String) f50Var.next();
                    ku kuVar8 = kuVar6;
                    Pattern compile = Pattern.compile("\\s+");
                    compile.getClass();
                    str34.getClass();
                    Matcher matcher = compile.matcher(str34);
                    if (matcher.find()) {
                        str10 = str12;
                        ArrayList arrayList = new ArrayList(10);
                        str11 = str2;
                        int i7 = 0;
                        do {
                            arrayList.add(str34.subSequence(i7, matcher.start()).toString());
                            i7 = matcher.end();
                        } while (matcher.find());
                        arrayList.add(str34.subSequence(i7, str34.length()).toString());
                        list2 = arrayList;
                    } else {
                        list2 = y80.D(str34.toString());
                        str10 = str12;
                        str11 = str2;
                    }
                    if (q10.b(yi.q0(list2), str4)) {
                        Log.e("Fugu", "Pre-flight: carrier '" + str4 + "' already loaded — aborting flow");
                        o.invoke("Carrier module '" + str4 + "' already loaded. Try changing your exploit timing to something higher, reboot your device and try again");
                        break;
                    }
                    str12 = str10;
                    it = it2;
                    str2 = str11;
                    kuVar5 = kuVar7;
                    kuVar6 = kuVar8;
                }
            } else {
                kuVar = kuVar5;
                str5 = "...";
                kuVar2 = kuVar6;
                str6 = str2;
            }
            absolutePath.getClass();
            MainActivity.i(file2, absolutePath, "-s", "127.0.0.1:5555", "shell", "mkdir -p /data/local/tmp/fugu/targets/" + n);
            Log.d("Fugu", "Pushing fugu binaries...");
            e(this.i, assets, mainActivity2, file2, absolutePath, "fugu/fugu", "/data/local/tmp/fugu/fugu", true);
            e(this.i, assets, mainActivity2, file2, absolutePath, "fugu/e2e.dex", "/data/local/tmp/e2e.dex", false);
            e(this.i, assets, mainActivity2, file2, absolutePath, "fugu/dfpoison", "/data/local/tmp/dfpoison", true);
            AssetManager assetManager22 = assets;
            MainActivity mainActivity322 = mainActivity2;
            Log.d("Fugu", "Pushing target files...");
            list = assetManager22.list(str3 + n);
            if (list == null) {
                list = new String[0];
            }
            if (list.length == 0) {
                MainActivity.l(mainActivity322, r9, "Target directory is empty: " + n);
                o.invoke(null);
            } else {
                int length2 = list.length;
                int i8 = 0;
                while (i8 < length2) {
                    String str35 = list[i8];
                    AssetManager assetManager3 = assetManager22;
                    Context context2 = this.i;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str3);
                    sb4.append(n);
                    MainActivity mainActivity4 = mainActivity322;
                    String str36 = str13;
                    sb4.append(str36);
                    sb4.append(str35);
                    e(context2, assetManager3, mainActivity4, file2, absolutePath, sb4.toString(), "/data/local/tmp/fugu/targets/" + n + str36 + str35, false);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("  pushed ");
                    sb5.append(str35);
                    Log.d("Fugu", sb5.toString());
                    i8++;
                    str13 = str36;
                    assetManager22 = assetManager3;
                    mainActivity322 = mainActivity4;
                }
                AssetManager assetManager4 = assetManager22;
                MainActivity mainActivity5 = mainActivity322;
                Context context3 = this.i;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str3);
                sb6.append(n);
                String str37 = str6;
                sb6.append(str37);
                e(context3, assetManager4, mainActivity5, file2, absolutePath, sb6.toString(), "/data/local/tmp/fugu/targets/" + n + str37, false);
                mainActivity = mainActivity5;
                file = file2;
                str7 = absolutePath;
                Log.d("Fugu", "  pushed " + n + str37);
                Log.d("Fugu", "Configuring run.sh for target " + n + str5);
                InputStream open3 = assetManager4.open("fugu/run.sh");
                try {
                    open3.getClass();
                    byte[] z2 = q10.z(open3);
                    q10.g(open3, null);
                    String str38 = new String(z2, rh.a);
                    File file4 = new File(context.getCacheDir(), "run_fugu.sh");
                    uv.M(file4, "rm -f /data/local/tmp/rdbg_cred.ko /data/local/tmp/uv.ko /data/local/tmp/flip.ko /data/local/tmp/cfg_patched.bin /data/local/tmp/out_inject.spec /data/local/tmp/out_libas.spec /data/local/tmp/out_cfg.spec /data/local/tmp/out_cfg_pe.spec /data/local/tmp/stager.log /data/local/tmp/stager.err /data/local/tmp/fugu/rdbg_cred.ko\n" + str38);
                    String absolutePath3 = file4.getAbsolutePath();
                    absolutePath3.getClass();
                    String i9 = MainActivity.i(file, str7, "-s", "127.0.0.1:5555", "push", absolutePath3, "/data/local/tmp/fugu/run.sh");
                    file4.delete();
                    if (!ds0.g0(i9, "error", true) && !ds0.g0(i9, "failed", true)) {
                        MainActivity.i(file, str7, "-s", "127.0.0.1:5555", "shell", "chmod", "755", "/data/local/tmp/fugu/run.sh");
                        Log.d("Fugu", "Staging payload chain...");
                        mainActivity.r(context, assetManager4, new w60(file, str7), new hz(22));
                        String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{new Float(context.getSharedPreferences("singularity_prefs", 0).getFloat("payload_settle_sec", 0.3f))}, 1));
                        Log.d("Fugu", "settle_sec=" + format + " (passed to run.sh)");
                        Log.d("Fugu", "Launching fugu exploit...");
                        ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath(), "-s", "127.0.0.1:5555", "shell", "sh", "/data/local/tmp/fugu/run.sh", n, format);
                        Map<String, String> environment = processBuilder.environment();
                        environment.getClass();
                        environment.put("HOME", str7);
                        Map<String, String> environment2 = processBuilder.environment();
                        environment2.getClass();
                        environment2.put("ANDROID_SDK_HOME", str7);
                        Map<String, String> environment3 = processBuilder.environment();
                        environment3.getClass();
                        environment3.put(str24, str7);
                        Map<String, String> environment4 = processBuilder.environment();
                        environment4.getClass();
                        environment4.put(str23, str7 + str22);
                        Map<String, String> environment5 = processBuilder.environment();
                        environment5.getClass();
                        environment5.put(str21, str25);
                        Map<String, String> environment6 = processBuilder.environment();
                        environment6.getClass();
                        str23 = str23;
                        environment6.put(str20, str25);
                        Map<String, String> environment7 = processBuilder.environment();
                        environment7.getClass();
                        str22 = str22;
                        str20 = str20;
                        environment7.put(str19, str18);
                        Map<String, String> environment8 = processBuilder.environment();
                        environment8.getClass();
                        str19 = str19;
                        str18 = str18;
                        environment8.put(str17, str16);
                        Map<String, String> environment9 = processBuilder.environment();
                        environment9.getClass();
                        str21 = str21;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str7);
                        str16 = str16;
                        sb7.append(str14);
                        str14 = str14;
                        environment9.put(str15, sb7.toString());
                        redirectErrorStream = processBuilder.redirectErrorStream(true);
                        redirectErrorStream.getClass();
                        str25 = str25;
                        str8 = "HOME";
                        str9 = "ANDROID_SDK_HOME";
                        str24 = str24;
                        str15 = str15;
                        str17 = str17;
                        kuVar3 = kuVar2;
                        kyVar4 = r9;
                        kyVar3 = o;
                        kuVar4 = kuVar;
                        i2 = i;
                        Log.d("Fugu", "Starting exploit process via ProcessBuilder");
                        Process start2 = redirectErrorStream.start();
                        Log.d("Fugu", "Process started (pid lookup not directly available)");
                        fi0 fi0Var22 = new fi0();
                        kyVar7 = kyVar4;
                        try {
                            fi0Var = fi0Var22;
                            unVar = unVar2;
                        } catch (Exception e9) {
                            e = e9;
                            unVar = unVar2;
                            kyVar = kyVar7;
                            kyVar2 = kyVar3;
                            Log.e("Fugu", "executeExploit caught top-level exception", e);
                            nq nqVar22 = nr.a;
                            rz rzVar22 = f80.a;
                            p01.t(unVar, rzVar22, null, new w3(kyVar, e, null, 2), 2);
                            p01.t(unVar, rzVar22, null, new z60(1, null, kyVar2), 2);
                            return w01Var;
                        }
                        try {
                            rr0 t2 = p01.t(unVar, null, null, new u3(mainActivity, start2, fi0Var22, kyVar7, (hm) null), i2);
                            Log.d("Fugu", "Waiting for process to exit...");
                            start2.waitFor();
                            exitValue = start2.exitValue();
                            Log.d("Fugu", "Process exited with code: " + exitValue);
                            if (exitValue != 0) {
                                Log.w("Fugu", "Non-zero exit code: " + exitValue);
                            }
                            this.h = unVar;
                            this.d = file;
                            this.e = str7;
                            this.f = fi0Var;
                            this.g = 1;
                            n2 = t2.n(this);
                            vnVar = vn.d;
                            if (n2 != vnVar) {
                                return vnVar;
                            }
                            kuVar5 = kuVar4;
                            kyVar4 = kyVar4;
                            kyVar3 = kyVar3;
                            r49 = kuVar4;
                        } catch (Exception e10) {
                            e = e10;
                            kyVar = kyVar4;
                            kyVar2 = kyVar3;
                            Log.e("Fugu", "executeExploit caught top-level exception", e);
                            nq nqVar222 = nr.a;
                            rz rzVar222 = f80.a;
                            p01.t(unVar, rzVar222, null, new w3(kyVar, e, null, 2), 2);
                            p01.t(unVar, rzVar222, null, new z60(1, null, kyVar2), 2);
                            return w01Var;
                        }
                    }
                    MainActivity.l(mainActivity, r9, "Failed to push run.sh: " + i9);
                    o.invoke(null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            return w01Var;
        }
        if (i3 != 1) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fi0Var = this.f;
        String str39 = this.e;
        file = this.d;
        p10.Q(obj);
        str7 = str39;
        kuVar3 = kuVar6;
        mainActivity = mainActivity2;
        unVar = unVar2;
        str8 = "HOME";
        kyVar4 = kyVar7;
        kyVar3 = r49;
        str9 = "ANDROID_SDK_HOME";
        r49 = r49;
        if (kuVar3 == kuVar5) {
            if (fi0Var.d) {
                Log.d("Fugu", "[*] Root acquired — opening root shell for payload chain...");
                ProcessBuilder processBuilder2 = new ProcessBuilder(file.getAbsolutePath(), "-s", "127.0.0.1:5555", "shell", "sh", "/data/local/tmp/payload_chain.sh");
                Map<String, String> environment10 = processBuilder2.environment();
                environment10.getClass();
                environment10.put(str8, str7);
                Map<String, String> environment11 = processBuilder2.environment();
                environment11.getClass();
                environment11.put(str9, str7);
                Map<String, String> environment12 = processBuilder2.environment();
                environment12.getClass();
                environment12.put(str24, str7);
                Map<String, String> environment13 = processBuilder2.environment();
                environment13.getClass();
                environment13.put(str23, str7 + str22);
                Map<String, String> environment14 = processBuilder2.environment();
                environment14.getClass();
                String str40 = str25;
                environment14.put(str21, str40);
                Map<String, String> environment15 = processBuilder2.environment();
                environment15.getClass();
                environment15.put(str20, str40);
                Map<String, String> environment16 = processBuilder2.environment();
                environment16.getClass();
                environment16.put(str19, str18);
                Map<String, String> environment17 = processBuilder2.environment();
                environment17.getClass();
                environment17.put(str17, str16);
                Map<String, String> environment18 = processBuilder2.environment();
                environment18.getClass();
                environment18.put(str15, str7 + str14);
                Process start3 = processBuilder2.redirectErrorStream(true).start();
                InputStream inputStream = start3.getInputStream();
                inputStream.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, rh.a), 8192);
                try {
                    p01.m(bufferedReader, new x60(mainActivity, unVar, kyVar4));
                    q10.g(bufferedReader, null);
                    start3.waitFor();
                    Log.d("Fugu", "[*] Payload chain complete.");
                } finally {
                }
            } else {
                Log.d("Fugu", "[!] Fugu did not acquire root — payload chain skipped.");
            }
        }
        Log.d("Fugu", "=== executeExploit COMPLETE ===");
        nq nqVar3 = nr.a;
        p01.t(unVar, f80.a, null, new z60(0, null, kyVar3), 2);
        return w01Var;
    }
}
