package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import com.lumi.singularity.system.TweakService;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class mw0 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ TweakService f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw0(TweakService tweakService, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = tweakService;
    }

    public static final boolean e(String str, String str2) {
        if (ds0.n0(str2)) {
            return false;
        }
        String quote = Pattern.quote(str2);
        quote.getClass();
        Pattern compile = Pattern.compile("\\b" + quote + "\\b");
        compile.getClass();
        return compile.matcher(str).find();
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        TweakService tweakService = this.f;
        switch (i) {
            case 0:
                return new mw0(tweakService, hmVar, 0);
            case 1:
                return new mw0(tweakService, hmVar, 1);
            case 2:
                return new mw0(tweakService, hmVar, 2);
            case 3:
                return new mw0(tweakService, hmVar, 3);
            case 4:
                return new mw0(tweakService, hmVar, 4);
            case 5:
                return new mw0(tweakService, hmVar, 5);
            case 6:
                return new mw0(tweakService, hmVar, 6);
            case 7:
                return new mw0(tweakService, hmVar, 7);
            case 8:
                return new mw0(tweakService, hmVar, 8);
            case 9:
                return new mw0(tweakService, hmVar, 9);
            case 10:
                return new mw0(tweakService, hmVar, 10);
            case 11:
                return new mw0(tweakService, hmVar, 11);
            case Matrix.TranslateX /* 12 */:
                return new mw0(tweakService, hmVar, 12);
            case Matrix.TranslateY /* 13 */:
                return new mw0(tweakService, hmVar, 13);
            case Matrix.TranslateZ /* 14 */:
                return new mw0(tweakService, hmVar, 14);
            case 15:
                return new mw0(tweakService, hmVar, 15);
            case 16:
                return new mw0(tweakService, hmVar, 16);
            case 17:
                return new mw0(tweakService, hmVar, 17);
            case 18:
                return new mw0(tweakService, hmVar, 18);
            case 19:
                return new mw0(tweakService, hmVar, 19);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return new mw0(tweakService, hmVar, 20);
            case 21:
                return new mw0(tweakService, hmVar, 21);
            case 22:
                return new mw0(tweakService, hmVar, 22);
            case 23:
                return new mw0(tweakService, hmVar, 23);
            case 24:
                return new mw0(tweakService, hmVar, 24);
            case RectListKt.BitOffsetForParentId /* 25 */:
                return new mw0(tweakService, hmVar, 25);
            case 26:
                return new mw0(tweakService, hmVar, 26);
            case 27:
                return new mw0(tweakService, hmVar, 27);
            default:
                return new mw0(tweakService, hmVar, 28);
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
        return ((mw0) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01a2, code lost:
    
        if (defpackage.zj0.c("pkill -f hide_mc2.sh || true\nrm -f /data/local/tmp/hide_mc2.pid || true", false, r20) == r10) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x020e, code lost:
    
        if (r1 == r10) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0201, code lost:
    
        if (defpackage.zj0.c("pkill -f gpu_max_freq_lock.sh || true", false, r20) == r10) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0284, code lost:
    
        if (defpackage.zj0.c("pkill -f fan_override.sh || true", false, r20) == r10) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r1 == r10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0332, code lost:
    
        if (defpackage.zj0.c(r1, false, r20) == r10) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x043a, code lost:
    
        if (defpackage.zj0.c(r1, false, r20) == r10) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0499, code lost:
    
        if (defpackage.zj0.c(r1, false, r20) == r10) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0510, code lost:
    
        if (defpackage.zj0.c(r1, false, r20) == r10) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x04dd, code lost:
    
        if (r1 == r10) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x05a6, code lost:
    
        if (defpackage.zj0.c(r1, false, r20) == r10) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (defpackage.zj0.c("pkill -f usb_interceptor.sh || true", false, r20) == r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0573, code lost:
    
        if (r1 == r10) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x05fd, code lost:
    
        if (defpackage.zj0.c(r1, false, r20) == r10) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x06b0, code lost:
    
        if (r1 == r10) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fa, code lost:
    
        if (defpackage.zj0.c("pkill -f persist_protect.sh || true", false, r20) == r10) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012b, code lost:
    
        if (defpackage.zj0.c("pkill -f ota_blocker.sh || true", false, r20) == r10) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object c;
        Object H;
        ?? r18;
        Object H2;
        Object f;
        int i = this.d;
        int i2 = 2;
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        TweakService tweakService = this.f;
        int i3 = 1;
        hm hmVar = null;
        switch (i) {
            case 0:
                int i4 = this.e;
                if (i4 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var = zj0.a;
                    this.e = 1;
                    b = zj0.b(this);
                    if (b == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i4 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    b = obj;
                }
                if (!((Boolean) b).booleanValue()) {
                    return w01Var;
                }
                zj0 zj0Var2 = zj0.a;
                zj0.a("am force-stop com.oculus.guardian\nam force-stop com.oculus.vrshell\nsleep 5\nam start -n com.lumi.singularity/.ui.activities.MainActivity");
                SharedPreferences sharedPreferences = tweakService.getSharedPreferences("singularity_prefs", 0);
                boolean z = sharedPreferences.getBoolean("passthrough_fix_on_boot", false);
                String string = sharedPreferences.getString("start_app_on_boot", null);
                if (!z || string == null || string.length() == 0) {
                    return w01Var;
                }
                Intent launchIntentForPackage = tweakService.getPackageManager().getLaunchIntentForPackage("com.lumi.singularity");
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(GroupFlagsKt.IsMovableContentFlag);
                }
                if (launchIntentForPackage != null) {
                    tweakService.startActivity(launchIntentForPackage);
                }
                try {
                    Intent launchIntentForPackage2 = tweakService.getPackageManager().getLaunchIntentForPackage(string);
                    if (launchIntentForPackage2 == null) {
                        return w01Var;
                    }
                    launchIntentForPackage2.addFlags(GroupFlagsKt.IsMovableContentFlag);
                    tweakService.startActivity(launchIntentForPackage2);
                    return w01Var;
                } catch (Exception e) {
                    q10.c(Log.e(tweakService.g, "Failed to launch ".concat(string), e));
                    return w01Var;
                }
            case 1:
                int i5 = this.e;
                if (i5 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var3 = zj0.a;
                    this.e = 1;
                    c = zj0.c("ps -ef", false, this);
                    if (c == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i5 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    c = obj;
                }
                String str = (String) c;
                if (ks0.c0(str, "Execution failed", false)) {
                    return w01Var;
                }
                tweakService.m = e(str, "rgb_led.sh");
                tweakService.n = e(str, "custom_led.sh");
                tweakService.o = e(str, "power_led.sh");
                tweakService.p = e(str, "min_freq_lock.sh");
                tweakService.q = e(str, "max_freq_lock.sh");
                tweakService.r = e(str, "usb_interceptor.sh");
                tweakService.s = e(str, "ota_blocker.sh");
                tweakService.t = e(str, "ovr_loader_override.sh");
                tweakService.u = e(str, "persist_protect.sh");
                tweakService.v = e(str, "gpu_min_freq_lock.sh");
                tweakService.w = e(str, "gpu_max_freq_lock.sh");
                tweakService.x = e(str, "frida-server");
                tweakService.y = e(str, "fan_override.sh");
                tweakService.z = e(str, "charge_limit.sh");
                tweakService.A = e(str, "hide_mc2.sh");
                SharedPreferences.Editor edit = tweakService.c().edit();
                edit.putBoolean("rgb_led_is_running", tweakService.m);
                edit.putBoolean("custom_led_is_running", tweakService.n);
                edit.putBoolean("power_led_is_running", tweakService.o);
                edit.putBoolean("min_freq_is_running", tweakService.p);
                edit.putBoolean("max_freq_is_running", tweakService.q);
                edit.putBoolean("usb_interceptor_running", tweakService.r);
                edit.putBoolean("ota_blocker_running", tweakService.s);
                edit.putBoolean("ovr_loader_override_running", tweakService.t);
                edit.putBoolean("persist_protect_running", tweakService.u);
                edit.putBoolean("gpu_min_freq_is_running", tweakService.v);
                edit.putBoolean("gpu_max_freq_is_running", tweakService.w);
                edit.putBoolean("frida_is_running", tweakService.x);
                edit.putBoolean("fan_override_is_running", tweakService.y);
                edit.putBoolean("charge_limit_is_running", tweakService.z);
                edit.putBoolean("link_fix_running", tweakService.A);
                edit.apply();
                return w01Var;
            case 2:
                int i6 = this.e;
                if (i6 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    int i7 = TweakService.T;
                    nq nqVar = nr.a;
                    Object H3 = p01.H(hq.d, new mw0(tweakService, hmVar, i3), this);
                    if (H3 != vnVar) {
                        H3 = w01Var;
                        break;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                this.e = 2;
                int i8 = TweakService.T;
                if (tweakService.h(this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 3:
                int i9 = this.e;
                if (i9 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var4 = zj0.a;
                    this.e = 1;
                    if (zj0.c("setprop service.adb.tcp.port 5555; stop adbd; start adbd", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i9 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                int i10 = TweakService.T;
                kp0.l(tweakService, "wireless_adb_is_running", true);
                return w01Var;
            case 4:
                int i11 = this.e;
                if (i11 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var5 = zj0.a;
                    this.e = 1;
                    if (zj0.c("setprop service.adb.tcp.port -1; stop adbd; start adbd", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i11 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                int i12 = TweakService.T;
                kp0.l(tweakService, "wireless_adb_is_running", false);
                return w01Var;
            case 5:
                int i13 = this.e;
                if (i13 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var6 = zj0.a;
                    this.e = 1;
                    if (zj0.c("pkill -f frida-server || true\nchmod 755 /data/local/tmp/frida-server\nnohup /data/local/tmp/frida-server -D > /dev/null 2>&1 &", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i13 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.x = true;
                return w01Var;
            case 6:
                int i14 = this.e;
                if (i14 == 0) {
                    p10.Q(obj);
                    File file = tweakService.S;
                    if (file == null) {
                        q10.H("linkFixScriptFile");
                        throw null;
                    }
                    TweakService.b(file, tweakService.l);
                    zj0 zj0Var7 = zj0.a;
                    File file2 = tweakService.S;
                    if (file2 == null) {
                        q10.H("linkFixScriptFile");
                        throw null;
                    }
                    String W = es0.W("\n            pkill -f hide_mc2.sh || true\n            rm -f /data/local/tmp/hide_mc2.pid || true\n            nohup " + file2.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
                    this.e = 1;
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.A = true;
                this.e = 2;
                if (tweakService.h(this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 7:
                int i15 = this.e;
                if (i15 == 0) {
                    p10.Q(obj);
                    int i16 = TweakService.T;
                    String string2 = tweakService.c().getString("cpu_max_freq_selection_little", null);
                    String string3 = tweakService.c().getString("cpu_max_freq_selection_middle", null);
                    String string4 = tweakService.c().getString("cpu_max_freq_selection_big", null);
                    ro roVar = ro.a;
                    this.e = 1;
                    nq nqVar2 = nr.a;
                    hm hmVar2 = null;
                    H = p01.H(hq.d, new o3((Object) string2, (Object) string4, (Object) string3, hmVar2, 4), this);
                    r18 = hmVar2;
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        tweakService.q = true;
                        return w01Var;
                    }
                    p10.Q(obj);
                    H = obj;
                    r18 = 0;
                }
                String str2 = (String) H;
                File file3 = tweakService.I;
                if (file3 == null) {
                    q10.H("maxFreqScriptFile");
                    throw r18;
                }
                TweakService.b(file3, str2);
                zj0 zj0Var8 = zj0.a;
                File file4 = tweakService.I;
                if (file4 == null) {
                    q10.H("maxFreqScriptFile");
                    throw r18;
                }
                String W2 = es0.W("\n            pkill -f max_freq_lock.sh || true\n            nohup " + file4.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
                this.e = 2;
                break;
            case 8:
                int i17 = this.e;
                if (i17 == 0) {
                    p10.Q(obj);
                    ro roVar2 = ro.a;
                    this.e = 1;
                    nq nqVar3 = nr.a;
                    H2 = p01.H(hq.d, new z9(i2, 17, hmVar), this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        tweakService.p = true;
                        return w01Var;
                    }
                    p10.Q(obj);
                    H2 = obj;
                }
                String str3 = (String) H2;
                File file5 = tweakService.H;
                if (file5 == null) {
                    q10.H("minFreqScriptFile");
                    throw null;
                }
                TweakService.b(file5, str3);
                zj0 zj0Var9 = zj0.a;
                File file6 = tweakService.H;
                if (file6 == null) {
                    q10.H("minFreqScriptFile");
                    throw null;
                }
                String W3 = es0.W("\n            pkill -f min_freq_lock.sh || true\n            nohup " + file6.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
                this.e = 2;
                break;
            case 9:
                int i18 = this.e;
                if (i18 == 0) {
                    p10.Q(obj);
                    File file7 = tweakService.K;
                    if (file7 == null) {
                        q10.H("otaBlockerScriptFile");
                        throw null;
                    }
                    TweakService.b(file7, tweakService.j);
                    zj0 zj0Var10 = zj0.a;
                    File file8 = tweakService.K;
                    if (file8 == null) {
                        q10.H("otaBlockerScriptFile");
                        throw null;
                    }
                    String W4 = es0.W("\n            pkill -f ota_blocker.sh || true\n            nohup " + file8.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
                    this.e = 1;
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.s = true;
                this.e = 2;
                if (tweakService.h(this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 10:
                int i19 = this.e;
                if (i19 == 0) {
                    p10.Q(obj);
                    File file9 = tweakService.L;
                    if (file9 == null) {
                        q10.H("persistProtectScriptFile");
                        throw null;
                    }
                    TweakService.b(file9, tweakService.k);
                    zj0 zj0Var11 = zj0.a;
                    File file10 = tweakService.L;
                    if (file10 == null) {
                        q10.H("persistProtectScriptFile");
                        throw null;
                    }
                    String W5 = es0.W("\n            pkill -f persist_protect.sh || true\n            nohup " + file10.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
                    this.e = 1;
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.u = true;
                this.e = 2;
                if (tweakService.h(this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 11:
                int i20 = this.e;
                if (i20 == 0) {
                    p10.Q(obj);
                    File file11 = tweakService.G;
                    if (file11 == null) {
                        q10.H("powerLedScriptFile");
                        throw null;
                    }
                    TweakService.b(file11, "#!/system/bin/sh\n\nRED_LED=\"/sys/class/leds/red/brightness\"\nGREEN_LED=\"/sys/class/leds/green/brightness\"\nBLUE_LED=\"/sys/class/leds/blue/brightness\"\nBATTERY_PATH=\"/sys/class/power_supply/battery/capacity\"\n\nset_led() {\n    echo \"$1\" > \"$RED_LED\"\n    echo \"$2\" > \"$GREEN_LED\"\n    echo \"$3\" > \"$BLUE_LED\"\n}\n\nwhile true; do\n    battery_level=$(cat \"$BATTERY_PATH\")\n\n    if [ \"$battery_level\" -ge 95 ]; then\n        set_led 0 255 0\n    elif [ \"$battery_level\" -ge 90 ]; then\n        set_led 64 255 0\n    elif [ \"$battery_level\" -ge 80 ]; then\n        set_led 128 255 0\n    elif [ \"$battery_level\" -ge 70 ]; then\n        set_led 180 255 0\n    elif [ \"$battery_level\" -ge 60 ]; then\n        set_led 220 255 0\n    elif [ \"$battery_level\" -ge 50 ]; then\n        set_led 255 255 0\n    elif [ \"$battery_level\" -ge 40 ]; then\n        set_led 255 180 0\n    elif [ \"$battery_level\" -ge 30 ]; then\n        set_led 255 128 0\n    elif [ \"$battery_level\" -ge 20 ]; then\n        set_led 255 64 0\n    elif [ \"$battery_level\" -ge 10 ]; then\n        set_led 255 32 0\n    else\n        set_led 255 0 0\n    fi\n    sleep 5\ndone");
                    zj0 zj0Var12 = zj0.a;
                    File file12 = tweakService.G;
                    if (file12 == null) {
                        q10.H("powerLedScriptFile");
                        throw null;
                    }
                    String W6 = es0.W("\n            pkill -f rgb_led.sh || true\n            pkill -f custom_led.sh || true\n            pkill -f power_led.sh || true\n            echo 0 > /sys/class/leds/red/brightness\necho 0 > /sys/class/leds/green/brightness\necho 0 > /sys/class/leds/blue/brightness\n            nohup " + file12.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
                    this.e = 1;
                    if (zj0.c(W6, false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i20 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.o = true;
                tweakService.m = false;
                tweakService.n = false;
                return w01Var;
            case Matrix.TranslateX /* 12 */:
                int i21 = this.e;
                if (i21 == 0) {
                    p10.Q(obj);
                    File file13 = tweakService.E;
                    if (file13 == null) {
                        q10.H("rgbScriptFile");
                        throw null;
                    }
                    TweakService.b(file13, "#!/system/bin/sh\nRED_LED=\"/sys/class/leds/red/brightness\"\nGREEN_LED=\"/sys/class/leds/green/brightness\"\nBLUE_LED=\"/sys/class/leds/blue/brightness\"\nset_rgb() { echo \"${1}\" > \"$RED_LED\"; echo \"${2}\" > \"$GREEN_LED\"; echo \"${3}\" > \"$BLUE_LED\"; }\nclamp() { if [ \"$1\" -lt 0 ]; then echo 0; elif [ \"$1\" -gt 255 ]; then echo 255; else echo \"$1\"; fi; }\ntrap \"set_rgb 0 0 0; exit\" INT TERM\nwhile true; do\n    for i in $(seq 0 5 255); do set_rgb $(clamp $((255 - i))) $(clamp ${i}) 0; sleep 0.005; done\n    for i in $(seq 0 5 255); do set_rgb 0 $(clamp $((255 - i))) $(clamp ${i}); sleep 0.005; done\n    for i in $(seq 0 5 255); do set_rgb $(clamp ${i}) 0 $(clamp $((255 - i))); sleep 0.005; done\ndone");
                    zj0 zj0Var13 = zj0.a;
                    File file14 = tweakService.E;
                    if (file14 == null) {
                        q10.H("rgbScriptFile");
                        throw null;
                    }
                    String W7 = es0.W("\n            pkill -f rgb_led.sh || true\n            pkill -f custom_led.sh || true\n            pkill -f power_led.sh || true\n            echo 0 > /sys/class/leds/red/brightness\necho 0 > /sys/class/leds/green/brightness\necho 0 > /sys/class/leds/blue/brightness\n            nohup " + file14.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
                    this.e = 1;
                    if (zj0.c(W7, false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i21 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.m = true;
                tweakService.n = false;
                tweakService.o = false;
                return w01Var;
            case Matrix.TranslateY /* 13 */:
                int i22 = this.e;
                if (i22 == 0) {
                    p10.Q(obj);
                    File file15 = tweakService.J;
                    if (file15 == null) {
                        q10.H("usbInterceptorScriptFile");
                        throw null;
                    }
                    TweakService.b(file15, tweakService.i);
                    zj0 zj0Var14 = zj0.a;
                    File file16 = tweakService.J;
                    if (file16 == null) {
                        q10.H("usbInterceptorScriptFile");
                        throw null;
                    }
                    String W8 = es0.W("\n            pkill -f usb_interceptor.sh || true\n            nohup " + file16.getAbsolutePath() + " > /dev/null 2>&1 &\n        ");
                    this.e = 1;
                    break;
                } else {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.r = true;
                kp0.l(tweakService, "usb_interceptor_running", true);
                this.e = 2;
                if (tweakService.h(this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case Matrix.TranslateZ /* 14 */:
                int i23 = this.e;
                if (i23 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var15 = zj0.a;
                    this.e = 1;
                    if (zj0.c("            pkill -f rgb_led.sh || true\n            pkill -f custom_led.sh || true\n            pkill -f power_led.sh || true\n            echo 0 > /sys/class/leds/red/brightness\necho 0 > /sys/class/leds/green/brightness\necho 0 > /sys/class/leds/blue/brightness", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i23 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.m = false;
                tweakService.n = false;
                tweakService.o = false;
                return w01Var;
            case 15:
                int i24 = this.e;
                if (i24 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var16 = zj0.a;
                    this.e = 1;
                    if (zj0.c("            pkill -f custom_led.sh || true\n            echo 0 > /sys/class/leds/red/brightness\necho 0 > /sys/class/leds/green/brightness\necho 0 > /sys/class/leds/blue/brightness", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i24 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.n = false;
                return w01Var;
            case 16:
                int i25 = this.e;
                if (i25 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var17 = zj0.a;
                    this.e = 1;
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            p10.Q(obj);
                            return obj;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.y = false;
                List list = iv.a;
                this.e = 2;
                nq nqVar4 = nr.a;
                Object H4 = p01.H(hq.d, new z9(i2, 23, hmVar), this);
                if (H4 != vnVar) {
                    return H4;
                }
                return vnVar;
            case 17:
                int i26 = this.e;
                if (i26 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var18 = zj0.a;
                    this.e = 1;
                    if (zj0.c("pkill -f frida-server >/dev/null 2>&1 || true", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i26 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.x = false;
                return w01Var;
            case 18:
                int i27 = this.e;
                if (i27 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var19 = zj0.a;
                    this.e = 1;
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 != 2) {
                            if (i27 == 3) {
                                p10.Q(obj);
                                return obj;
                            }
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        f = obj;
                        Long f0 = ks0.f0((String) f);
                        long longValue = f0 != null ? f0.longValue() : 690L;
                        pz pzVar = pz.a;
                        String valueOf = String.valueOf(longValue * AnimationKt.MillisToNanos);
                        this.e = 3;
                        nq nqVar5 = nr.a;
                        Object H5 = p01.H(hq.d, new oz(valueOf, null), this);
                        if (H5 != vnVar) {
                            return H5;
                        }
                        return vnVar;
                    }
                    p10.Q(obj);
                }
                tweakService.w = false;
                pz pzVar2 = pz.a;
                this.e = 2;
                f = pz.f(this);
                break;
            case 19:
                int i28 = this.e;
                if (i28 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var20 = zj0.a;
                    this.e = 1;
                    if (zj0.c("pkill -f gpu_min_freq_lock.sh || true", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i28 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.v = false;
                return w01Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                int i29 = this.e;
                if (i29 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var21 = zj0.a;
                    this.e = 1;
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.A = false;
                this.e = 2;
                if (tweakService.h(this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 21:
                int i30 = this.e;
                if (i30 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var22 = zj0.a;
                    this.e = 1;
                    if (zj0.c("pkill -f max_freq_lock.sh || true", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i30 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.q = false;
                return w01Var;
            case 22:
                int i31 = this.e;
                if (i31 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var23 = zj0.a;
                    this.e = 1;
                    if (zj0.c("pkill -f min_freq_lock.sh || true", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i31 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.p = false;
                return w01Var;
            case 23:
                int i32 = this.e;
                if (i32 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var24 = zj0.a;
                    this.e = 1;
                    break;
                } else {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.s = false;
                this.e = 2;
                if (tweakService.h(this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 24:
                int i33 = this.e;
                if (i33 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var25 = zj0.a;
                    this.e = 1;
                    break;
                } else {
                    if (i33 != 1) {
                        if (i33 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.u = false;
                this.e = 2;
                if (tweakService.h(this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case RectListKt.BitOffsetForParentId /* 25 */:
                int i34 = this.e;
                if (i34 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var26 = zj0.a;
                    this.e = 1;
                    if (zj0.c("            pkill -f power_led.sh || true\n            echo 0 > /sys/class/leds/red/brightness\necho 0 > /sys/class/leds/green/brightness\necho 0 > /sys/class/leds/blue/brightness", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i34 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.o = false;
                return w01Var;
            case 26:
                int i35 = this.e;
                if (i35 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var27 = zj0.a;
                    this.e = 1;
                    if (zj0.c("            pkill -f rgb_led.sh || true\n            echo 0 > /sys/class/leds/red/brightness\necho 0 > /sys/class/leds/green/brightness\necho 0 > /sys/class/leds/blue/brightness", false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i35 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.m = false;
                return w01Var;
            case 27:
                int i36 = this.e;
                if (i36 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var28 = zj0.a;
                    this.e = 1;
                    break;
                } else {
                    if (i36 != 1) {
                        if (i36 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                tweakService.r = false;
                kp0.l(tweakService, "usb_interceptor_running", false);
                this.e = 2;
                if (tweakService.h(this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            default:
                int i37 = this.e;
                if (i37 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    int i38 = TweakService.T;
                    nq nqVar6 = nr.a;
                    Object H6 = p01.H(hq.d, new mw0(tweakService, hmVar, i3), this);
                    if (H6 != vnVar) {
                        H6 = w01Var;
                        break;
                    }
                } else {
                    if (i37 != 1) {
                        if (i37 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                nq nqVar7 = nr.a;
                rz rzVar = f80.a;
                nw0 nw0Var = new nw0(tweakService, hmVar, i2);
                this.e = 2;
                if (p01.H(rzVar, nw0Var, this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
        }
    }
}
