package defpackage;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.Matrix;
import com.lumi.singularity.ui.activities.AdbRootActivity;
import com.lumi.singularity.ui.activities.MainActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class u3 extends us0 implements my {
    public final /* synthetic */ int d;
    public Object e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(MutableState mutableState, MutableState mutableState2, Context context, yz0 yz0Var, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.d = 12;
        this.h = mutableState;
        this.i = mutableState2;
        this.g = context;
        this.e = yz0Var;
        this.j = mutableState3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0168, code lost:
    
        if (r0 == r15) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012c A[Catch: Exception -> 0x0037, TryCatch #3 {Exception -> 0x0037, blocks: (B:8:0x002f, B:10:0x016b, B:13:0x0178, B:21:0x0048, B:22:0x011f, B:24:0x012c, B:27:0x014b, B:30:0x017c, B:31:0x0051, B:32:0x0099, B:34:0x009f, B:40:0x00dd, B:42:0x00ef, B:43:0x00f4, B:62:0x0191, B:63:0x0194, B:64:0x0195, B:67:0x005e, B:59:0x018f, B:36:0x00cf, B:39:0x00da, B:54:0x018b, B:55:0x018e, B:38:0x00d4, B:51:0x0189), top: B:2:0x0023, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        Object obj2;
        Object v;
        File file;
        boolean z;
        Object c;
        String str;
        String str2;
        Object H;
        String str3;
        Context context = (Context) this.j;
        q90 q90Var = (q90) this.h;
        ky kyVar = (ky) this.i;
        int i = this.f;
        vn vnVar = vn.d;
        try {
        } catch (Exception e) {
            String str4 = q90Var.b;
            String simpleName = e.getClass().getSimpleName();
            String message = e.getMessage();
            StringBuilder k = j50.k("installVectorModule failed for ", str4, ": ", simpleName, ": ");
            k.append(message);
            Log.e("ModuleRepoManager", k.toString());
            kyVar.invoke("Error: " + e.getMessage());
            obj2 = new jj0(e);
        }
        if (i == 0) {
            p10.Q(obj);
            Log.d("ModuleRepoManager", "installVectorModule: starting for " + q90Var.b + " (" + q90Var.e + "/" + q90Var.f + ")");
            kyVar.invoke("Finding latest release...");
            ts tsVar = ts.m;
            this.f = 1;
            v = tsVar.v(q90Var, this);
            if (v == vnVar) {
                return vnVar;
            }
        } else if (i == 1) {
            p10.Q(obj);
            v = ((kj0) obj).d;
        } else {
            if (i != 2) {
                if (i != 3) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str5 = (String) this.e;
                p10.Q(obj);
                str3 = str5;
                H = obj;
                kyVar.invoke(((Boolean) H).booleanValue() ? "Installed & enabled in Vector." : "Installed. Enable it from the Vector manager notification (couldn't auto-enable).");
                obj2 = str3;
                return new kj0(obj2);
            }
            String str6 = (String) this.e;
            File file2 = (File) this.g;
            p10.Q(obj);
            file = file2;
            z = false;
            c = obj;
            str = str6;
            str2 = (String) c;
            file.delete();
            if (ds0.g0(str2, "Success", z)) {
                kyVar.invoke("Install failed: ".concat(ds0.C0(300, str2)));
                return new kj0(new jj0(new Exception(str2)));
            }
            if (str == null) {
                kyVar.invoke("Installed, but couldn't read its package name -- enable it manually in Vector.");
                obj2 = q90Var.a;
                return new kj0(obj2);
            }
            kyVar.invoke("Enabling in Vector...");
            this.g = null;
            this.e = str;
            this.f = 3;
            nq nqVar = nr.a;
            H = p01.H(hq.d, new qe(str, (hm) null, 4), this);
            str3 = str;
        }
        Throwable a = kj0.a(v);
        if (a != null) {
            return new kj0(new jj0(a));
        }
        kyVar.invoke("Downloading " + q90Var.b + "...");
        file = new File(context.getCacheDir(), q90Var.a.concat(".apk"));
        InputStream openStream = new URL((String) v).openStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                openStream.getClass();
                q10.k(openStream, fileOutputStream);
                fileOutputStream.close();
                openStream.close();
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
                String str7 = packageArchiveInfo != null ? packageArchiveInfo.packageName : null;
                kyVar.invoke("Installing...");
                zj0 zj0Var = zj0.a;
                String str8 = "pm install -r \"" + file.getAbsolutePath() + "\"";
                this.g = file;
                this.e = str7;
                this.f = 2;
                z = false;
                c = zj0.c(str8, false, this);
                str = str7;
                if (c == vnVar) {
                    return vnVar;
                }
                str2 = (String) c;
                file.delete();
                if (ds0.g0(str2, "Success", z)) {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
    
        if (r12 == r6) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:8:0x001e, B:17:0x007b, B:19:0x0081, B:21:0x00a4, B:22:0x00ab, B:24:0x0086, B:27:0x0097, B:33:0x00c2, B:37:0x0038), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:8:0x001e, B:17:0x007b, B:19:0x0081, B:21:0x00a4, B:22:0x00ab, B:24:0x0086, B:27:0x0097, B:33:0x00c2, B:37:0x0038), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a4 -> B:10:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bd -> B:9:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d7 -> B:10:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(Object obj) {
        ji0 ji0Var;
        nf nfVar;
        String str;
        Boolean bool;
        String str2;
        ji0 ji0Var2;
        Object b;
        String str3 = this.f;
        vn vnVar = vn.d;
        try {
        } catch (Exception e) {
            q10.c(Log.e("ProxChargeWatcher", "Failed to run: " + str3, e));
        }
        if (str3 == 0) {
            p10.Q(obj);
            ji0Var2 = new ji0();
            nfVar = new nf((of) this.i);
            this.g = ji0Var2;
            this.h = nfVar;
            this.e = null;
            this.f = 1;
            b = nfVar.b(this);
            if (b != vnVar) {
            }
            return vnVar;
        }
        if (str3 == 1) {
            nf nfVar2 = (nf) this.h;
            ji0 ji0Var3 = (ji0) this.g;
            p10.Q(obj);
            ji0Var = ji0Var3;
            nfVar = nfVar2;
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (str3 != 2) {
                if (str3 != 3) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str4 = (String) this.e;
                nfVar = (nf) this.h;
                ji0Var = (ji0) this.g;
                p10.Q(obj);
                String str5 = str4;
                if (obj == null) {
                    Log.w("ProxChargeWatcher", "Wireless ADB unreachable, couldn't run: " + str5);
                }
                ji0Var2 = ji0Var;
                this.g = ji0Var2;
                this.h = nfVar;
                this.e = null;
                this.f = 1;
                b = nfVar.b(this);
                if (b != vnVar) {
                    ji0Var = ji0Var2;
                    obj = b;
                    if (((Boolean) obj).booleanValue()) {
                        return w01.a;
                    }
                    str3 = (String) nfVar.c();
                    bool = (Boolean) ji0Var.d;
                    str2 = str3;
                    if (bool == null) {
                        zj0 zj0Var = zj0.a;
                        this.g = ji0Var;
                        this.h = nfVar;
                        this.e = str3;
                        this.f = 2;
                        obj = zj0.b(this);
                        str = str3;
                        if (obj == vnVar) {
                        }
                        Boolean bool2 = (Boolean) obj;
                        bool2.booleanValue();
                        ji0Var.d = bool2;
                        bool = (Boolean) obj;
                        str2 = str;
                    }
                    if (bool.booleanValue()) {
                        Context context = ((kh0) this.j).a;
                        this.g = ji0Var;
                        this.h = nfVar;
                        this.e = str2;
                        this.f = 3;
                        obj = j4.i(context, str2, this);
                        str5 = str2;
                    } else {
                        zj0 zj0Var2 = zj0.a;
                        zj0.a(str2);
                        ji0Var2 = ji0Var;
                        this.g = ji0Var2;
                        this.h = nfVar;
                        this.e = null;
                        this.f = 1;
                        b = nfVar.b(this);
                        if (b != vnVar) {
                        }
                    }
                }
                return vnVar;
            }
            String str6 = (String) this.e;
            nfVar = (nf) this.h;
            ji0Var = (ji0) this.g;
            p10.Q(obj);
            str = str6;
            Boolean bool22 = (Boolean) obj;
            bool22.booleanValue();
            ji0Var.d = bool22;
            bool = (Boolean) obj;
            str2 = str;
            if (bool.booleanValue()) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0341, code lost:
    
        if (defpackage.p01.H(r0, r2, r20) != r10) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x030d, code lost:
    
        if (defpackage.p01.H(r2, r4, r20) == r10) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0264 A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #6 {Exception -> 0x0049, blocks: (B:11:0x0044, B:13:0x005c, B:14:0x02f4, B:18:0x0071, B:20:0x02dd, B:21:0x02df, B:25:0x0088, B:27:0x02b4, B:29:0x009f, B:30:0x0260, B:32:0x0264, B:38:0x0285, B:56:0x02c4, B:57:0x02c7, B:58:0x02c8, B:62:0x00a8, B:63:0x01d7, B:67:0x00b5, B:69:0x01bd, B:70:0x01bf, B:74:0x00c4, B:76:0x01a5, B:78:0x00d3, B:79:0x0161, B:81:0x0165, B:84:0x01a8, B:93:0x00f7, B:96:0x00ff, B:98:0x0109, B:101:0x01f3, B:102:0x01fa, B:103:0x01fb, B:109:0x0220, B:128:0x031d, B:129:0x0320, B:105:0x0212, B:108:0x021d, B:120:0x0317, B:121:0x031a, B:107:0x0217, B:117:0x0315, B:53:0x02c2, B:34:0x0277, B:37:0x0282, B:48:0x02be, B:49:0x02c1, B:36:0x027c, B:45:0x02bc, B:125:0x031b), top: B:2:0x002a, inners: #0, #3, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c8 A[Catch: Exception -> 0x0049, TryCatch #6 {Exception -> 0x0049, blocks: (B:11:0x0044, B:13:0x005c, B:14:0x02f4, B:18:0x0071, B:20:0x02dd, B:21:0x02df, B:25:0x0088, B:27:0x02b4, B:29:0x009f, B:30:0x0260, B:32:0x0264, B:38:0x0285, B:56:0x02c4, B:57:0x02c7, B:58:0x02c8, B:62:0x00a8, B:63:0x01d7, B:67:0x00b5, B:69:0x01bd, B:70:0x01bf, B:74:0x00c4, B:76:0x01a5, B:78:0x00d3, B:79:0x0161, B:81:0x0165, B:84:0x01a8, B:93:0x00f7, B:96:0x00ff, B:98:0x0109, B:101:0x01f3, B:102:0x01fa, B:103:0x01fb, B:109:0x0220, B:128:0x031d, B:129:0x0320, B:105:0x0212, B:108:0x021d, B:120:0x0317, B:121:0x031a, B:107:0x0217, B:117:0x0315, B:53:0x02c2, B:34:0x0277, B:37:0x0282, B:48:0x02be, B:49:0x02c1, B:36:0x027c, B:45:0x02bc, B:125:0x031b), top: B:2:0x002a, inners: #0, #3, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165 A[Catch: Exception -> 0x0049, TryCatch #6 {Exception -> 0x0049, blocks: (B:11:0x0044, B:13:0x005c, B:14:0x02f4, B:18:0x0071, B:20:0x02dd, B:21:0x02df, B:25:0x0088, B:27:0x02b4, B:29:0x009f, B:30:0x0260, B:32:0x0264, B:38:0x0285, B:56:0x02c4, B:57:0x02c7, B:58:0x02c8, B:62:0x00a8, B:63:0x01d7, B:67:0x00b5, B:69:0x01bd, B:70:0x01bf, B:74:0x00c4, B:76:0x01a5, B:78:0x00d3, B:79:0x0161, B:81:0x0165, B:84:0x01a8, B:93:0x00f7, B:96:0x00ff, B:98:0x0109, B:101:0x01f3, B:102:0x01fa, B:103:0x01fb, B:109:0x0220, B:128:0x031d, B:129:0x0320, B:105:0x0212, B:108:0x021d, B:120:0x0317, B:121:0x031a, B:107:0x0217, B:117:0x0315, B:53:0x02c2, B:34:0x0277, B:37:0x0282, B:48:0x02be, B:49:0x02c1, B:36:0x027c, B:45:0x02bc, B:125:0x031b), top: B:2:0x002a, inners: #0, #3, #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8 A[Catch: Exception -> 0x0049, TryCatch #6 {Exception -> 0x0049, blocks: (B:11:0x0044, B:13:0x005c, B:14:0x02f4, B:18:0x0071, B:20:0x02dd, B:21:0x02df, B:25:0x0088, B:27:0x02b4, B:29:0x009f, B:30:0x0260, B:32:0x0264, B:38:0x0285, B:56:0x02c4, B:57:0x02c7, B:58:0x02c8, B:62:0x00a8, B:63:0x01d7, B:67:0x00b5, B:69:0x01bd, B:70:0x01bf, B:74:0x00c4, B:76:0x01a5, B:78:0x00d3, B:79:0x0161, B:81:0x0165, B:84:0x01a8, B:93:0x00f7, B:96:0x00ff, B:98:0x0109, B:101:0x01f3, B:102:0x01fa, B:103:0x01fb, B:109:0x0220, B:128:0x031d, B:129:0x0320, B:105:0x0212, B:108:0x021d, B:120:0x0317, B:121:0x031a, B:107:0x0217, B:117:0x0315, B:53:0x02c2, B:34:0x0277, B:37:0x0282, B:48:0x02be, B:49:0x02c1, B:36:0x027c, B:45:0x02bc, B:125:0x031b), top: B:2:0x002a, inners: #0, #3, #5, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(Object obj) {
        ie ieVar;
        ie ieVar2;
        File file;
        je K;
        Object c;
        Object c2;
        rz rzVar;
        w3 w3Var;
        Object c3;
        Object c4;
        String str = "BLACKHOLE";
        ky kyVar = (ky) this.j;
        Context context = (Context) this.i;
        int i = this.f;
        vn vnVar = vn.d;
        try {
        } catch (Exception e) {
            Log.e("BootAnimation", "Failed to apply boot animation", e);
            nq nqVar = nr.a;
            rz rzVar2 = f80.a;
            z60 z60Var = new z60(4, null, kyVar);
            this.g = null;
            this.e = null;
            this.h = null;
            this.f = 11;
        }
        switch (i) {
            case 0:
                p10.Q(obj);
                SharedPreferences sharedPreferences = context.getSharedPreferences("payload_prefs", 0);
                try {
                    String string = sharedPreferences.getString("payload_bootanimation_choice", "BLACKHOLE");
                    if (string != null) {
                        str = string;
                    }
                    ieVar = ie.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    ieVar = ie.f;
                }
                if (ieVar == ie.h) {
                    String string2 = sharedPreferences.getString("payload_bootanimation_custom_uri", null);
                    if (string2 == null) {
                        throw new IOException("No custom boot animation pack selected");
                    }
                    file = new File(context.getCacheDir(), "bootpack_apply");
                    uv.K(file);
                    Uri parse = Uri.parse(string2);
                    parse.getClass();
                    K = p10.K(context, parse, file);
                    File file2 = new File(context.getCacheDir(), "meta-horizonos_temp.glb");
                    uv.J(new File(file, K.c), file2, true);
                    String W = es0.W("\n                                                            mv " + file2.getAbsolutePath() + " /data/local/tmp/meta-horizonos.glb\n                                                            chmod 644 /data/local/tmp/meta-horizonos.glb\n                                                            if [ -f /system_ext/etc/bootanim/meta-horizonos.glb ]; then\n                                                                umount /system_ext/etc/bootanim/meta-horizonos.glb 2>/dev/null\n                                                                mount -o bind /data/local/tmp/meta-horizonos.glb /system_ext/etc/bootanim/meta-horizonos.glb\n                                                            fi\n                                                        ");
                    zj0 zj0Var = zj0.a;
                    this.g = null;
                    this.e = file;
                    this.h = K;
                    this.f = 1;
                    if (zj0.c(W, true, this) == vnVar) {
                    }
                    if (K.d) {
                        zj0 zj0Var2 = zj0.a;
                        this.g = null;
                        this.e = file;
                        this.h = K;
                        this.f = 3;
                        c = zj0.c("if grep -qE '^[^ ]+ /product/overlay ' /proc/mounts; then umount -l /product/overlay; fi", true, this);
                        if (c == vnVar) {
                        }
                        uv.K(file);
                        zj0 zj0Var3 = zj0.a;
                        this.g = null;
                        this.e = null;
                        this.h = K;
                        this.f = 4;
                        if (zj0.c("killall zygote64", true, this) == vnVar) {
                        }
                        nq nqVar2 = nr.a;
                        rzVar = f80.a;
                        w3Var = new w3(kyVar, K, null, 4);
                        this.g = null;
                        this.e = null;
                        this.h = null;
                        this.f = 5;
                        if (p01.H(rzVar, w3Var, this) == vnVar) {
                        }
                        return w01.a;
                    }
                    File file3 = new File(context.getCacheDir(), "StartupSoundOverlay_temp.apk");
                    uv.J(new File(file, "StartupSoundOverlay.apk"), file3, true);
                    String W2 = es0.W("\n                                                                mv " + file3.getAbsolutePath() + " /data/local/tmp/StartupSoundOverlay.apk\n                                                                mkdir -p /data/adb/sound_overlay\n                                                                if grep -qE '^[^ ]+ /product/overlay ' /proc/mounts; then\n                                                                    umount -l /product/overlay\n                                                                fi\n                                                                if [ -z \"$(ls -A /data/adb/sound_overlay 2>/dev/null)\" ]; then\n                                                                    cp -a /product/overlay/. /data/adb/sound_overlay/\n                                                                fi\n                                                                magisk --clone-attr /product/overlay /data/adb/sound_overlay\n                                                                cp /data/local/tmp/StartupSoundOverlay.apk /data/adb/sound_overlay/StartupSoundOverlay.apk\n                                                                magisk --clone-attr /product/overlay/PermissionControllerRRO.apk /data/adb/sound_overlay/StartupSoundOverlay.apk\n                                                                mount -o bind /data/adb/sound_overlay /product/overlay\n                                                            ");
                    zj0 zj0Var4 = zj0.a;
                    this.g = null;
                    this.e = file;
                    this.h = K;
                    this.f = 2;
                    c2 = zj0.c(W2, true, this);
                    if (c2 == vnVar) {
                    }
                    uv.K(file);
                    zj0 zj0Var32 = zj0.a;
                    this.g = null;
                    this.e = null;
                    this.h = K;
                    this.f = 4;
                    if (zj0.c("killall zygote64", true, this) == vnVar) {
                    }
                    nq nqVar22 = nr.a;
                    rzVar = f80.a;
                    w3Var = new w3(kyVar, K, null, 4);
                    this.g = null;
                    this.e = null;
                    this.h = null;
                    this.f = 5;
                    if (p01.H(rzVar, w3Var, this) == vnVar) {
                    }
                    return w01.a;
                }
                File file4 = new File(context.getCacheDir(), "meta-horizonos_temp.glb");
                InputStream open = context.getAssets().open("bootanimation/".concat(ieVar.d));
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                    try {
                        open.getClass();
                        q10.k(open, fileOutputStream);
                        fileOutputStream.close();
                        open.close();
                        String W3 = es0.W("\n                                                            cp " + file4.getAbsolutePath() + " /data/local/tmp/meta-horizonos.glb\n                                                            rm -f " + file4.getAbsolutePath() + "\n                                                            chmod 644 /data/local/tmp/meta-horizonos.glb\n                                                            if [ -f /system_ext/etc/bootanim/meta-horizonos.glb ]; then\n                                                                umount /system_ext/etc/bootanim/meta-horizonos.glb 2>/dev/null\n                                                                mount -o bind /data/local/tmp/meta-horizonos.glb /system_ext/etc/bootanim/meta-horizonos.glb\n                                                            fi\n                                                        ");
                        zj0 zj0Var5 = zj0.a;
                        this.g = ieVar;
                        this.e = null;
                        this.h = null;
                        this.f = 6;
                        if (zj0.c(W3, true, this) != vnVar) {
                            ieVar2 = ieVar;
                            if (ieVar2 != ie.g) {
                                File file5 = new File(context.getCacheDir(), "StartupSoundOverlay_temp.apk");
                                open = context.getAssets().open("bootanimation/StartupSoundOverlay.apk");
                                try {
                                    fileOutputStream = new FileOutputStream(file5);
                                    try {
                                        open.getClass();
                                        q10.k(open, fileOutputStream);
                                        fileOutputStream.close();
                                        open.close();
                                        String W4 = es0.W("\n                                                                mv " + file5.getAbsolutePath() + " /data/local/tmp/StartupSoundOverlay.apk\n                                                                mkdir -p /data/adb/sound_overlay\n                                                                if grep -qE '^[^ ]+ /product/overlay ' /proc/mounts; then\n                                                                    umount -l /product/overlay\n                                                                fi\n                                                                if [ -z \"$(ls -A /data/adb/sound_overlay 2>/dev/null)\" ]; then\n                                                                    cp -a /product/overlay/. /data/adb/sound_overlay/\n                                                                fi\n                                                                magisk --clone-attr /product/overlay /data/adb/sound_overlay\n                                                                cp /data/local/tmp/StartupSoundOverlay.apk /data/adb/sound_overlay/StartupSoundOverlay.apk\n                                                                magisk --clone-attr /product/overlay/PermissionControllerRRO.apk /data/adb/sound_overlay/StartupSoundOverlay.apk\n                                                                mount -o bind /data/adb/sound_overlay /product/overlay\n                                                            ");
                                        zj0 zj0Var6 = zj0.a;
                                        this.g = ieVar2;
                                        this.e = null;
                                        this.h = null;
                                        this.f = 7;
                                        c4 = zj0.c(W4, true, this);
                                        if (c4 == vnVar) {
                                        }
                                        zj0 zj0Var7 = zj0.a;
                                        this.g = ieVar2;
                                        this.e = null;
                                        this.h = null;
                                        this.f = 9;
                                        if (zj0.c("killall zygote64", true, this) == vnVar) {
                                        }
                                        nq nqVar3 = nr.a;
                                        rz rzVar3 = f80.a;
                                        w3 w3Var2 = new w3(kyVar, ieVar2, null, 5);
                                        this.g = null;
                                        this.e = null;
                                        this.h = null;
                                        this.f = 10;
                                        break;
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
                                zj0 zj0Var8 = zj0.a;
                                this.g = ieVar2;
                                this.e = null;
                                this.h = null;
                                this.f = 8;
                                c3 = zj0.c("if grep -qE '^[^ ]+ /product/overlay ' /proc/mounts; then umount -l /product/overlay; fi", true, this);
                                if (c3 == vnVar) {
                                }
                                zj0 zj0Var72 = zj0.a;
                                this.g = ieVar2;
                                this.e = null;
                                this.h = null;
                                this.f = 9;
                                if (zj0.c("killall zygote64", true, this) == vnVar) {
                                }
                                nq nqVar32 = nr.a;
                                rz rzVar32 = f80.a;
                                w3 w3Var22 = new w3(kyVar, ieVar2, null, 5);
                                this.g = null;
                                this.e = null;
                                this.h = null;
                                this.f = 10;
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
                return vnVar;
            case 1:
                K = (je) this.h;
                file = (File) this.e;
                p10.Q(obj);
                if (K.d) {
                }
                return vnVar;
            case 2:
                K = (je) this.h;
                file = (File) this.e;
                p10.Q(obj);
                c2 = obj;
                uv.K(file);
                zj0 zj0Var322 = zj0.a;
                this.g = null;
                this.e = null;
                this.h = K;
                this.f = 4;
                if (zj0.c("killall zygote64", true, this) == vnVar) {
                }
                nq nqVar222 = nr.a;
                rzVar = f80.a;
                w3Var = new w3(kyVar, K, null, 4);
                this.g = null;
                this.e = null;
                this.h = null;
                this.f = 5;
                if (p01.H(rzVar, w3Var, this) == vnVar) {
                }
                return w01.a;
            case 3:
                K = (je) this.h;
                file = (File) this.e;
                p10.Q(obj);
                c = obj;
                uv.K(file);
                zj0 zj0Var3222 = zj0.a;
                this.g = null;
                this.e = null;
                this.h = K;
                this.f = 4;
                if (zj0.c("killall zygote64", true, this) == vnVar) {
                }
                nq nqVar2222 = nr.a;
                rzVar = f80.a;
                w3Var = new w3(kyVar, K, null, 4);
                this.g = null;
                this.e = null;
                this.h = null;
                this.f = 5;
                if (p01.H(rzVar, w3Var, this) == vnVar) {
                }
                return w01.a;
            case 4:
                K = (je) this.h;
                p10.Q(obj);
                nq nqVar22222 = nr.a;
                rzVar = f80.a;
                w3Var = new w3(kyVar, K, null, 4);
                this.g = null;
                this.e = null;
                this.h = null;
                this.f = 5;
                if (p01.H(rzVar, w3Var, this) == vnVar) {
                }
                return w01.a;
            case 5:
                p10.Q(obj);
                return w01.a;
            case 6:
                ieVar2 = (ie) this.g;
                p10.Q(obj);
                if (ieVar2 != ie.g) {
                }
                return vnVar;
            case 7:
                ieVar2 = (ie) this.g;
                p10.Q(obj);
                c4 = obj;
                zj0 zj0Var722 = zj0.a;
                this.g = ieVar2;
                this.e = null;
                this.h = null;
                this.f = 9;
                if (zj0.c("killall zygote64", true, this) == vnVar) {
                }
                nq nqVar322 = nr.a;
                rz rzVar322 = f80.a;
                w3 w3Var222 = new w3(kyVar, ieVar2, null, 5);
                this.g = null;
                this.e = null;
                this.h = null;
                this.f = 10;
                break;
            case 8:
                ieVar2 = (ie) this.g;
                p10.Q(obj);
                c3 = obj;
                zj0 zj0Var7222 = zj0.a;
                this.g = ieVar2;
                this.e = null;
                this.h = null;
                this.f = 9;
                if (zj0.c("killall zygote64", true, this) == vnVar) {
                }
                nq nqVar3222 = nr.a;
                rz rzVar3222 = f80.a;
                w3 w3Var2222 = new w3(kyVar, ieVar2, null, 5);
                this.g = null;
                this.e = null;
                this.h = null;
                this.f = 10;
                break;
            case 9:
                ieVar2 = (ie) this.g;
                p10.Q(obj);
                nq nqVar32222 = nr.a;
                rz rzVar32222 = f80.a;
                w3 w3Var22222 = new w3(kyVar, ieVar2, null, 5);
                this.g = null;
                this.e = null;
                this.h = null;
                this.f = 10;
                break;
            case 10:
                p10.Q(obj);
                return w01.a;
            case 11:
                p10.Q(obj);
                return w01.a;
            default:
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(File file, String str, im imVar) {
        i4 i4Var;
        int i;
        if (imVar instanceof i4) {
            i4Var = (i4) imVar;
            int i2 = i4Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i4Var.e = i2 - Integer.MIN_VALUE;
                Object obj = i4Var.d;
                i = i4Var.e;
                if (i != 0) {
                    p10.Q(obj);
                    str.getClass();
                    i4Var.e = 1;
                    obj = j4.h(file, str, new String[]{"devices"}, i4Var);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return Boolean.valueOf(ds0.g0((CharSequence) obj, "127.0.0.1:5555\tdevice", false));
            }
        }
        i4Var = new i4(imVar);
        Object obj2 = i4Var.d;
        i = i4Var.e;
        if (i != 0) {
        }
        return Boolean.valueOf(ds0.g0((CharSequence) obj2, "127.0.0.1:5555\tdevice", false));
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                return new u3((c3) this.g, (String) this.e, (MutableState) this.h, (MutableState) obj3, (MutableState) obj2, hmVar, 0);
            case 1:
                return new u3((Context) obj3, (String) obj2, hmVar, 1);
            case 2:
                return new u3((ky) this.h, (String) this.e, (Context) obj3, (String) obj2, hmVar);
            case 3:
                return new u3((String) this.e, (un) this.g, (Context) obj2, (MutableState) this.h, (MutableState) obj3, hmVar);
            case 4:
                return new u3((Context) this.g, (MutableState) this.h, (MutableState) obj3, (List) this.e, (MutableState) obj2, hmVar);
            case 5:
                return new u3((jm) this.g, (String) this.e, (MutableState) this.h, (un) obj2, (MutableState) obj3, hmVar);
            case 6:
                u3 u3Var = new u3((MainActivity) this.e, (Process) this.h, (fi0) obj3, (ky) obj2, hmVar);
                u3Var.g = obj;
                return u3Var;
            case 7:
                return new u3((Context) this.g, (a11) this.e, (MutableState) this.h, (MutableState) obj3, (MutableState) obj2, hmVar, 7);
            case 8:
                return new u3(hmVar, (ky) obj3, (q90) this.h, (Context) obj2);
            case 9:
                return new u3((of) obj3, (kh0) obj2, hmVar, 9);
            case 10:
                return new u3((SnapshotStateList) this.h, (my) obj3, (String) this.e, (LazyListState) obj2, hmVar);
            case 11:
                return new u3((Context) obj3, (ky) obj2, hmVar, 11);
            default:
                return new u3((MutableState) this.h, (MutableState) obj3, (Context) this.g, (yz0) this.e, (MutableState) obj2, hmVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
        }
        return ((u3) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x0792, code lost:
    
        if (r2 == r9) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0781, code lost:
    
        if (defpackage.y80.p(500, r28) == r9) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x076e, code lost:
    
        if (defpackage.j4.h(r1, r0, new java.lang.String[]{"connect", "127.0.0.1:5555"}, r28) == r9) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0756, code lost:
    
        if (defpackage.y80.p(1500, r28) != r9) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06fb, code lost:
    
        if (r4 == r9) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x06e0, code lost:
    
        if (defpackage.y80.p(1500, r28) != r9) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x069c, code lost:
    
        if (r1 == r9) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0667, code lost:
    
        if (r1 != r9) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0628, code lost:
    
        if (r4 != r9) goto L227;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x065a  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        File file;
        String str;
        Object h;
        File file2;
        File file3;
        Object h2;
        Integer num;
        Object H;
        int i;
        String str2;
        Integer num2;
        File file4;
        Object h3;
        Object obj2;
        File file5;
        Object h4;
        Object h5;
        File file6;
        Object c;
        Object c2;
        String str3;
        PackageManager packageManager;
        Drawable drawable;
        MutableState mutableState;
        List F0;
        kw0 kw0Var;
        Object invoke;
        SnapshotStateList snapshotStateList;
        Object H2;
        int i2 = this.d;
        int i3 = 0;
        w01 w01Var = w01.a;
        Object obj3 = this.j;
        vn vnVar = vn.d;
        Object obj4 = this.i;
        switch (i2) {
            case 0:
                MutableState mutableState2 = (MutableState) obj4;
                MutableState mutableState3 = (MutableState) this.h;
                c3 c3Var = (c3) this.g;
                int i4 = this.f;
                if (i4 == 0) {
                    p10.Q(obj);
                    File h6 = ((AdbRootActivity) c3Var).h();
                    if (h6 == null) {
                        j4.e(mutableState3, "Error: ADB binary not found.");
                        j4.c(mutableState2);
                        return w01Var;
                    }
                    String str4 = (String) this.e;
                    String str5 = (String) ((MutableState) obj3).getValue();
                    k2 k2Var = new k2(c3Var, null, 1);
                    y2 y2Var = new y2(mutableState3, 4);
                    this.f = 1;
                    nq nqVar = nr.a;
                    if (p01.H(hq.d, new h4(h6, str4, str5, y2Var, k2Var, null), this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i4 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                j4.c(mutableState2);
                return w01Var;
            case 1:
                Context context = (Context) obj4;
                switch (this.f) {
                    case 0:
                        p10.Q(obj);
                        File file7 = new File(context.getApplicationInfo().nativeLibraryDir, "libadb.so");
                        if (!file7.exists()) {
                            file7 = null;
                        }
                        if (file7 != null) {
                            String absolutePath = context.getDir("adb_keys", 0).getAbsolutePath();
                            absolutePath.getClass();
                            d1 d1Var = new d1(3);
                            this.g = file7;
                            this.e = absolutePath;
                            this.f = 1;
                            if (j4.g(context, absolutePath, d1Var, this) != vnVar) {
                                file = file7;
                                str = absolutePath;
                                this.g = file;
                                this.e = str;
                                this.f = 2;
                                h = h(file, str, this);
                                break;
                            }
                            return vnVar;
                        }
                        return null;
                    case 1:
                        str = (String) this.e;
                        file = (File) this.g;
                        p10.Q(obj);
                        this.g = file;
                        this.e = str;
                        this.f = 2;
                        h = h(file, str, this);
                        break;
                    case 2:
                        str = (String) this.e;
                        File file8 = (File) this.g;
                        p10.Q(obj);
                        file = file8;
                        h = obj;
                        if (!((Boolean) h).booleanValue()) {
                            str.getClass();
                            this.g = file;
                            this.e = str;
                            this.f = 3;
                            if (j4.h(file, str, new String[]{"connect", "127.0.0.1:5555"}, this) != vnVar) {
                                file2 = file;
                                this.g = file2;
                                this.e = str;
                                this.f = 4;
                                if (y80.p(500L, this) != vnVar) {
                                    file3 = file2;
                                    file = file3;
                                }
                            }
                            return vnVar;
                        }
                        this.g = file;
                        this.e = str;
                        this.f = 5;
                        h2 = h(file, str, this);
                        break;
                    case 3:
                        str = (String) this.e;
                        file2 = (File) this.g;
                        p10.Q(obj);
                        this.g = file2;
                        this.e = str;
                        this.f = 4;
                        if (y80.p(500L, this) != vnVar) {
                        }
                        return vnVar;
                    case 4:
                        str = (String) this.e;
                        file3 = (File) this.g;
                        p10.Q(obj);
                        file = file3;
                        this.g = file;
                        this.e = str;
                        this.f = 5;
                        h2 = h(file, str, this);
                        break;
                    case 5:
                        str = (String) this.e;
                        File file9 = (File) this.g;
                        p10.Q(obj);
                        file = file9;
                        h2 = obj;
                        if (!((Boolean) h2).booleanValue()) {
                            try {
                                i = Settings.Global.getInt(context.getContentResolver(), "adb_wifi_port", 0);
                            } catch (Exception unused) {
                            }
                            if (i > 0) {
                                num = Integer.valueOf(i);
                                if (num == null) {
                                    this.g = file;
                                    this.e = str;
                                    this.f = 6;
                                    nq nqVar2 = nr.a;
                                    H = p01.H(hq.d, new e4(context, null, i3), this);
                                    break;
                                }
                                Integer num3 = num;
                                str2 = str;
                                num2 = num3;
                                if (num2 != null) {
                                    str2.getClass();
                                    String[] strArr = {"connect", "127.0.0.1:" + num2};
                                    this.g = file;
                                    this.e = str2;
                                    this.h = num2;
                                    this.f = 7;
                                    if (j4.h(file, str2, strArr, this) != vnVar) {
                                        file4 = file;
                                        this.g = file4;
                                        this.e = str2;
                                        this.h = num2;
                                        this.f = 8;
                                        break;
                                    }
                                    return vnVar;
                                }
                                return null;
                            }
                            num = null;
                            if (num == null) {
                            }
                            Integer num32 = num;
                            str2 = str;
                            num2 = num32;
                            if (num2 != null) {
                            }
                            return null;
                        }
                        str.getClass();
                        this.g = null;
                        this.e = null;
                        this.h = null;
                        this.f = 15;
                        h5 = j4.h(file, str, new String[]{"-s", "127.0.0.1:5555", "shell", (String) obj3}, this);
                        if (h5 != vnVar) {
                            return h5;
                        }
                        return vnVar;
                    case 6:
                        str = (String) this.e;
                        File file10 = (File) this.g;
                        p10.Q(obj);
                        file = file10;
                        H = obj;
                        num = (Integer) H;
                        Integer num322 = num;
                        str2 = str;
                        num2 = num322;
                        if (num2 != null) {
                        }
                        return null;
                    case 7:
                        num2 = (Integer) this.h;
                        str2 = (String) this.e;
                        file4 = (File) this.g;
                        p10.Q(obj);
                        this.g = file4;
                        this.e = str2;
                        this.h = num2;
                        this.f = 8;
                        break;
                    case 8:
                        num2 = (Integer) this.h;
                        str2 = (String) this.e;
                        file4 = (File) this.g;
                        p10.Q(obj);
                        str2.getClass();
                        this.g = file4;
                        this.e = str2;
                        this.h = num2;
                        this.f = 9;
                        h3 = j4.h(file4, str2, new String[]{"devices"}, this);
                        break;
                    case 9:
                        num2 = (Integer) this.h;
                        str2 = (String) this.e;
                        file4 = (File) this.g;
                        p10.Q(obj);
                        h3 = obj;
                        if (ds0.g0((CharSequence) h3, "127.0.0.1:" + num2 + "\tdevice", false)) {
                            str2.getClass();
                            String[] strArr2 = {"-s", "127.0.0.1:" + num2, "tcpip", "5555"};
                            this.g = file4;
                            this.e = str2;
                            obj2 = null;
                            this.h = null;
                            this.f = 10;
                            if (j4.h(file4, str2, strArr2, this) != vnVar) {
                                str = str2;
                                file5 = file4;
                                this.g = file5;
                                this.e = str;
                                this.h = obj2;
                                this.f = 11;
                                break;
                            }
                            return vnVar;
                        }
                        return null;
                    case 10:
                        str = (String) this.e;
                        file5 = (File) this.g;
                        p10.Q(obj);
                        obj2 = null;
                        this.g = file5;
                        this.e = str;
                        this.h = obj2;
                        this.f = 11;
                        break;
                    case 11:
                        str = (String) this.e;
                        file5 = (File) this.g;
                        p10.Q(obj);
                        obj2 = null;
                        str.getClass();
                        this.g = file5;
                        this.e = str;
                        this.h = obj2;
                        this.f = 12;
                        break;
                    case Matrix.TranslateX /* 12 */:
                        str = (String) this.e;
                        file5 = (File) this.g;
                        p10.Q(obj);
                        obj2 = null;
                        this.g = file5;
                        this.e = str;
                        this.h = obj2;
                        this.f = 13;
                        break;
                    case Matrix.TranslateY /* 13 */:
                        str = (String) this.e;
                        file5 = (File) this.g;
                        p10.Q(obj);
                        obj2 = null;
                        this.g = file5;
                        this.e = str;
                        this.h = obj2;
                        this.f = 14;
                        h4 = h(file5, str, this);
                        break;
                    case Matrix.TranslateZ /* 14 */:
                        str = (String) this.e;
                        file5 = (File) this.g;
                        p10.Q(obj);
                        h4 = obj;
                        if (((Boolean) h4).booleanValue()) {
                            file = file5;
                            str.getClass();
                            this.g = null;
                            this.e = null;
                            this.h = null;
                            this.f = 15;
                            h5 = j4.h(file, str, new String[]{"-s", "127.0.0.1:5555", "shell", (String) obj3}, this);
                            if (h5 != vnVar) {
                            }
                            return vnVar;
                        }
                        return null;
                    case 15:
                        p10.Q(obj);
                        return obj;
                    default:
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 2:
                String str6 = (String) this.e;
                ky kyVar = (ky) this.h;
                int i5 = this.f;
                try {
                    if (i5 == 0) {
                        p10.Q(obj);
                        kyVar.invoke("Downloading " + str6 + "...");
                        file6 = new File(((Context) obj4).getCacheDir(), str6.concat(".apk"));
                        InputStream openStream = new URL((String) obj3).openStream();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file6);
                            try {
                                openStream.getClass();
                                q10.k(openStream, fileOutputStream);
                                fileOutputStream.close();
                                openStream.close();
                                kyVar.invoke("Installing...");
                                zj0 zj0Var = zj0.a;
                                String str7 = "pm install -r \"" + file6.getAbsolutePath() + "\"";
                                this.g = file6;
                                this.f = 1;
                                c = zj0.c(str7, false, this);
                                if (c == vnVar) {
                                    return vnVar;
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        if (i5 != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        File file11 = (File) this.g;
                        p10.Q(obj);
                        file6 = file11;
                        c = obj;
                    }
                    file6.delete();
                    if (ds0.g0((String) c, "Success", false)) {
                        kyVar.invoke(str6.concat(" installed successfully!"));
                        return Boolean.TRUE;
                    }
                    kyVar.invoke("Installation failed.");
                    return Boolean.FALSE;
                } catch (Exception e) {
                    kyVar.invoke("An error occurred: " + e.getMessage());
                    e.printStackTrace();
                    return Boolean.FALSE;
                }
            case 3:
                int i6 = this.f;
                if (i6 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var2 = zj0.a;
                    String c3 = uo.c("pm uninstall --user 0 ", (String) this.e);
                    this.f = 1;
                    if (zj0.c(c3, false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i6 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                kb.h((un) this.g, (Context) obj3, (MutableState) this.h, (MutableState) obj4);
                return w01Var;
            case 4:
                List<String> list = (List) this.e;
                Context context2 = (Context) this.g;
                MutableState mutableState4 = (MutableState) obj4;
                MutableState mutableState5 = (MutableState) this.h;
                int i7 = this.f;
                try {
                    try {
                        if (i7 == 0) {
                            p10.Q(obj);
                            ni0 ni0Var = kb.a;
                            mutableState5.setValue(Boolean.TRUE);
                            mutableState4.setValue(null);
                            zj0 zj0Var3 = zj0.a;
                            this.f = 1;
                            c2 = zj0.c("pm list packages -3", false, this);
                            if (c2 == vnVar) {
                                return vnVar;
                            }
                        } else {
                            if (i7 != 1) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            p10.Q(obj);
                            c2 = obj;
                        }
                        str3 = (String) c2;
                        packageManager = context2.getPackageManager();
                        drawable = context2.getDrawable(R.drawable.sym_def_app_icon);
                        drawable.getClass();
                        mutableState = (MutableState) obj3;
                    } catch (Throwable th) {
                        ni0 ni0Var2 = kb.a;
                        mutableState5.setValue(Boolean.FALSE);
                        throw th;
                    }
                } catch (Exception e2) {
                    String str8 = "An unexpected error occurred: " + e2.getMessage();
                    ni0 ni0Var3 = kb.a;
                    mutableState4.setValue(str8);
                }
                if (!ds0.g0(str3, "Execution failed", false) && !ds0.g0(str3, "ERROR:", false)) {
                    List r0 = ds0.r0(str3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : r0) {
                        if (ks0.c0((String) obj5, "package:", false)) {
                            arrayList.add(obj5);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(zi.a0(arrayList, 10));
                    int size = arrayList.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj6 = arrayList.get(i8);
                        i8++;
                        String str9 = (String) obj6;
                        arrayList2.add(ds0.E0(ds0.x0(str9, "package:", str9)).toString());
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj7 = arrayList2.get(i9);
                        i9++;
                        String str10 = (String) obj7;
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (ks0.c0(str10, (String) it.next(), false)) {
                                    break;
                                }
                            }
                        }
                        arrayList3.add(obj7);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size3 = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Object obj8 = arrayList3.get(i10);
                        i10++;
                        String str11 = (String) obj8;
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str11, 0);
                            applicationInfo.getClass();
                            kw0Var = new kw0(packageManager.getApplicationIcon(applicationInfo), packageManager.getApplicationLabel(applicationInfo).toString(), str11);
                        } catch (Exception unused2) {
                            kw0Var = new kw0(drawable, str11, str11);
                        }
                        arrayList4.add(kw0Var);
                    }
                    F0 = yi.F0(arrayList4, new jb(1));
                    ni0 ni0Var4 = kb.a;
                    mutableState.setValue(F0);
                    mutableState5.setValue(Boolean.FALSE);
                    return w01Var;
                }
                ni0 ni0Var5 = kb.a;
                mutableState4.setValue("Root unavailable — showing all user apps.");
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
                installedApplications.getClass();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj9 : installedApplications) {
                    if ((((ApplicationInfo) obj9).flags & 1) == 0) {
                        arrayList5.add(obj9);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                int size4 = arrayList5.size();
                int i11 = 0;
                while (i11 < size4) {
                    Object obj10 = arrayList5.get(i11);
                    i11++;
                    ApplicationInfo applicationInfo2 = (ApplicationInfo) obj10;
                    if (!list.isEmpty()) {
                        for (String str12 : list) {
                            String str13 = applicationInfo2.packageName;
                            str13.getClass();
                            if (ks0.c0(str13, str12, false)) {
                                break;
                            }
                        }
                    }
                    arrayList6.add(obj10);
                }
                ArrayList arrayList7 = new ArrayList(zi.a0(arrayList6, 10));
                int size5 = arrayList6.size();
                int i12 = 0;
                while (i12 < size5) {
                    Object obj11 = arrayList6.get(i12);
                    i12++;
                    ApplicationInfo applicationInfo3 = (ApplicationInfo) obj11;
                    arrayList7.add(new kw0(packageManager.getApplicationIcon(applicationInfo3), packageManager.getApplicationLabel(applicationInfo3).toString(), applicationInfo3.packageName));
                }
                F0 = yi.F0(arrayList7, new jb(i3));
                ni0 ni0Var42 = kb.a;
                mutableState.setValue(F0);
                mutableState5.setValue(Boolean.FALSE);
                return w01Var;
            case 5:
                jm jmVar = (jm) this.g;
                MutableState mutableState6 = (MutableState) this.h;
                int i13 = this.f;
                if (i13 == 0) {
                    p10.Q(obj);
                    mutableState6.setValue(Boolean.TRUE);
                    String concat = "rstest unpair ".concat((String) this.e);
                    this.f = 1;
                    if (zj0.c(concat, false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i13 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                um.c((un) obj3, jmVar, mutableState6, (MutableState) obj4);
                return w01Var;
            case 6:
                un unVar = (un) this.g;
                int i14 = this.f;
                if (i14 != 0) {
                    if (i14 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                InputStream inputStream = ((Process) this.h).getInputStream();
                inputStream.getClass();
                Set set = MainActivity.w;
                pw pwVar = new pw(new b01(inputStream, null), 2);
                gh ghVar = new gh((MainActivity) this.e, linkedHashSet, unVar, (fi0) obj4, (ky) obj3);
                this.g = null;
                this.f = 1;
                return pwVar.collect(ghVar, this) == vnVar ? vnVar : w01Var;
            case 7:
                int i15 = this.f;
                if (i15 != 0) {
                    if (i15 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                ((MutableState) this.h).setValue(Boolean.TRUE);
                Context context3 = (Context) this.g;
                String str14 = ((a11) this.e).c;
                i3 i3Var = new i3((MutableState) obj4, 16);
                i3 i3Var2 = new i3((MutableState) obj3, 17);
                this.f = 1;
                nq nqVar3 = nr.a;
                Object H3 = p01.H(hq.d, new d11(context3, i3Var2, i3Var, str14, null), this);
                if (H3 != vnVar) {
                    H3 = w01Var;
                }
                return H3 == vnVar ? vnVar : w01Var;
            case 8:
                return e(obj);
            case 9:
                return f(obj);
            case 10:
                SnapshotStateList snapshotStateList2 = (SnapshotStateList) this.h;
                int i16 = this.f;
                if (i16 == 0) {
                    p10.Q(obj);
                    String str15 = (String) this.e;
                    this.g = snapshotStateList2;
                    this.f = 1;
                    invoke = ((my) obj4).invoke(str15, this);
                    if (invoke != vnVar) {
                        snapshotStateList = snapshotStateList2;
                    }
                    return vnVar;
                }
                if (i16 != 1) {
                    if (i16 == 2) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SnapshotStateList snapshotStateList3 = (SnapshotStateList) this.g;
                p10.Q(obj);
                snapshotStateList = snapshotStateList3;
                invoke = obj;
                snapshotStateList.add(ds0.E0((String) invoke).toString());
                int size6 = snapshotStateList2.size();
                this.g = null;
                this.f = 2;
                if (LazyListState.animateScrollToItem$default((LazyListState) obj3, size6, 0, this, 2, null) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 11:
                return g(obj);
            default:
                MutableState mutableState7 = (MutableState) this.h;
                MutableState mutableState8 = (MutableState) obj4;
                int i17 = this.f;
                if (i17 == 0) {
                    p10.Q(obj);
                    mutableState7.setValue(Boolean.TRUE);
                    mutableState8.setValue("Starting...");
                    Context context4 = (Context) this.g;
                    yz0 yz0Var = (yz0) this.e;
                    String str16 = yz0Var.c;
                    String str17 = yz0Var.a;
                    i3 i3Var3 = new i3(mutableState8, 23);
                    this.f = 1;
                    nq nqVar4 = nr.a;
                    H2 = p01.H(hq.d, new u3(i3Var3, str17, context4, str16, (hm) null), this);
                    if (H2 == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i17 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    H2 = obj;
                }
                boolean booleanValue = ((Boolean) H2).booleanValue();
                mutableState7.setValue(Boolean.FALSE);
                if (!booleanValue) {
                    return w01Var;
                }
                ((MutableState) obj3).setValue(Boolean.TRUE);
                mutableState8.setValue("Installed!");
                return w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(jm jmVar, String str, MutableState mutableState, un unVar, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.d = 5;
        this.g = jmVar;
        this.e = str;
        this.h = mutableState;
        this.j = unVar;
        this.i = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(ky kyVar, String str, Context context, String str2, hm hmVar) {
        super(2, hmVar);
        this.d = 2;
        this.h = kyVar;
        this.e = str;
        this.i = context;
        this.j = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(Context context, MutableState mutableState, MutableState mutableState2, List list, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.d = 4;
        this.g = context;
        this.h = mutableState;
        this.i = mutableState2;
        this.e = list;
        this.j = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(hm hmVar, ky kyVar, q90 q90Var, Context context) {
        super(2, hmVar);
        this.d = 8;
        this.h = q90Var;
        this.i = kyVar;
        this.j = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(SnapshotStateList snapshotStateList, my myVar, String str, LazyListState lazyListState, hm hmVar) {
        super(2, hmVar);
        this.d = 10;
        this.h = snapshotStateList;
        this.i = myVar;
        this.e = str;
        this.j = lazyListState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(MainActivity mainActivity, Process process, fi0 fi0Var, ky kyVar, hm hmVar) {
        super(2, hmVar);
        this.d = 6;
        this.e = mainActivity;
        this.h = process;
        this.i = fi0Var;
        this.j = kyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3(Object obj, Object obj2, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3(Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.g = obj;
        this.e = obj2;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(String str, un unVar, Context context, MutableState mutableState, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.d = 3;
        this.e = str;
        this.g = unVar;
        this.j = context;
        this.h = mutableState;
        this.i = mutableState2;
    }
}
