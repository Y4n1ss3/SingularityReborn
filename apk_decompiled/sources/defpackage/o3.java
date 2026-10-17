package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import com.lumi.singularity.system.TweakService;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class o3 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public Object f;
    public Object g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(MutableState mutableState, ky kyVar, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.d = 11;
        this.h = mutableState;
        this.f = kyVar;
        this.g = mutableState2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0231, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026d, code lost:
    
        if (defpackage.p01.H(defpackage.hq.d, new defpackage.mw0(r7, null, 18), r24) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x029d, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02cd, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02fe, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0341, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0376, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03a6, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03e6, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0446, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x046e, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04a3, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04fc, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0110, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x07c5, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0140, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0188, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0200, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x07c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        String str;
        String str2;
        vn vnVar;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str5;
        String str6;
        Intent intent = (Intent) this.h;
        TweakService tweakService = (TweakService) this.f;
        String str7 = tweakService.g;
        zl zlVar = tweakService.e;
        int i = this.e;
        w01 w01Var = w01.a;
        hm hmVar = null;
        vn vnVar2 = vn.d;
        switch (i) {
            case 0:
                p10.Q(obj);
                String str8 = (String) this.g;
                str = "max_freq_is_running";
                str2 = "link_fix_running";
                int i2 = 3;
                switch (str8.hashCode()) {
                    case -2008198697:
                        vnVar = vnVar2;
                        if (str8.equals("com.lumi.singularity.STOP_ALL")) {
                            this.e = 31;
                            int i3 = TweakService.T;
                            if (tweakService.f(this) == vnVar) {
                                return vnVar;
                            }
                        }
                        this.e = 32;
                        int i4 = TweakService.T;
                        return tweakService.h(this) == vnVar ? vnVar : w01Var;
                    case -2008182525:
                        vnVar = vnVar2;
                        str3 = "rgb_led_is_running";
                        if (str8.equals("com.lumi.singularity.STOP_RGB")) {
                            this.e = 2;
                            int i5 = TweakService.T;
                            nq nqVar = nr.a;
                            Object H = p01.H(hq.d, new mw0(tweakService, null, 26), this);
                            if (H != vnVar) {
                                H = w01Var;
                            }
                            if (H == vnVar) {
                                return vnVar;
                            }
                            int i6 = TweakService.T;
                            kp0.l(tweakService, str3, false);
                        }
                        this.e = 32;
                        int i42 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -1881137713:
                        vnVar = vnVar2;
                        str4 = "min_freq_is_running";
                        if (str8.equals("com.lumi.singularity.STOP_MIN_FREQ")) {
                            this.e = 8;
                            int i7 = TweakService.T;
                            nq nqVar2 = nr.a;
                            Object H2 = p01.H(hq.d, new mw0(tweakService, null, 22), this);
                            if (H2 != vnVar) {
                                H2 = w01Var;
                            }
                            if (H2 == vnVar) {
                                return vnVar;
                            }
                            int i8 = TweakService.T;
                            kp0.l(tweakService, str4, false);
                        }
                        this.e = 32;
                        int i422 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -1824778347:
                        vnVar = vnVar2;
                        z = true;
                        if (str8.equals("com.lumi.singularity.START_MIN_FREQ")) {
                            this.e = 7;
                            int i9 = TweakService.T;
                            nq nqVar3 = nr.a;
                            Object H3 = p01.H(hq.d, new mw0(tweakService, null, 8), this);
                            if (H3 != vnVar) {
                                H3 = w01Var;
                            }
                            if (H3 == vnVar) {
                                return vnVar;
                            }
                            int i10 = TweakService.T;
                            kp0.l(tweakService, "min_freq_is_running", z);
                        }
                        this.e = 32;
                        int i4222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -1616768131:
                        vnVar = vnVar2;
                        z2 = true;
                        if (str8.equals("com.lumi.singularity.START_RGB")) {
                            this.e = 1;
                            int i11 = TweakService.T;
                            nq nqVar4 = nr.a;
                            Object H4 = p01.H(hq.d, new mw0(tweakService, null, 12), this);
                            if (H4 != vnVar) {
                                H4 = w01Var;
                            }
                            if (H4 == vnVar) {
                                return vnVar;
                            }
                            int i12 = TweakService.T;
                            kp0.l(tweakService, "rgb_led_is_running", z2);
                        }
                        this.e = 32;
                        int i42222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -1433836272:
                        vnVar = vnVar2;
                        if (str8.equals("com.lumi.singularity.STOP_FRIDA")) {
                            this.e = 16;
                            int i13 = TweakService.T;
                            nq nqVar5 = nr.a;
                            Object H5 = p01.H(hq.d, new mw0(tweakService, null, 17), this);
                            if (H5 != vnVar) {
                                H5 = w01Var;
                            }
                            if (H5 == vnVar) {
                                return vnVar;
                            }
                            int i14 = TweakService.T;
                            kp0.l(tweakService, "frida_is_running", false);
                        }
                        this.e = 32;
                        int i422222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -1392374136:
                        vnVar = vnVar2;
                        if (str8.equals("com.lumi.singularity.START_PROX_CHARGE_WATCH")) {
                            nq nqVar6 = nr.a;
                            rz rzVar = f80.a;
                            nw0 nw0Var = new nw0(tweakService, null, 0);
                            this.e = 27;
                            if (p01.H(rzVar, nw0Var, this) == vnVar) {
                                return vnVar;
                            }
                        }
                        this.e = 32;
                        int i4222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -1329306015:
                        vnVar = vnVar2;
                        z3 = true;
                        if (str8.equals("com.lumi.singularity.START_POWER_LED")) {
                            this.e = 5;
                            int i15 = TweakService.T;
                            nq nqVar7 = nr.a;
                            Object H6 = p01.H(hq.d, new mw0(tweakService, null, 11), this);
                            if (H6 != vnVar) {
                                H6 = w01Var;
                            }
                            if (H6 == vnVar) {
                                return vnVar;
                            }
                            int i16 = TweakService.T;
                            kp0.l(tweakService, "power_led_is_running", z3);
                        }
                        this.e = 32;
                        int i42222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -1171756658:
                        vnVar = vnVar2;
                        int i17 = 1;
                        if (str8.equals("com.lumi.singularity.STOP_PROX_CHARGE_WATCH")) {
                            nq nqVar8 = nr.a;
                            rz rzVar2 = f80.a;
                            nw0 nw0Var2 = new nw0(tweakService, hmVar, i17);
                            this.e = 28;
                            if (p01.H(rzVar2, nw0Var2, this) == vnVar) {
                                return vnVar;
                            }
                        }
                        this.e = 32;
                        int i422222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -1142625561:
                        vnVar = vnVar2;
                        if (str8.equals("com.lumi.singularity.SET_FAN_SLEEP_MODE")) {
                            int i18 = TweakService.T;
                            boolean z7 = tweakService.c().getBoolean("fan_sleep_lower_enabled", false);
                            List list = iv.a;
                            File file = tweakService.Q;
                            if (file == null) {
                                q10.H("fanSleepEnabledFile");
                                throw null;
                            }
                            String absolutePath = file.getAbsolutePath();
                            absolutePath.getClass();
                            iv.d(absolutePath, z7);
                        }
                        this.e = 32;
                        int i4222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -591500678:
                        vnVar = vnVar2;
                        if (str8.equals("com.lumi.singularity.START_USB_INTERCEPTOR")) {
                            this.e = 21;
                            int i19 = TweakService.T;
                            nq nqVar9 = nr.a;
                            Object H7 = p01.H(hq.d, new mw0(tweakService, null, 13), this);
                            if (H7 != vnVar) {
                                H7 = w01Var;
                            }
                            if (H7 == vnVar) {
                                return vnVar;
                            }
                        }
                        this.e = 32;
                        int i42222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -514206942:
                        vnVar = vnVar2;
                        if (str8.equals("com.lumi.singularity.STOP_GPU_MIN_FREQ")) {
                            this.e = 12;
                            int i20 = TweakService.T;
                            nq nqVar10 = nr.a;
                            Object H8 = p01.H(hq.d, new mw0(tweakService, null, 19), this);
                            if (H8 != vnVar) {
                                H8 = w01Var;
                            }
                            if (H8 == vnVar) {
                                return vnVar;
                            }
                            int i21 = TweakService.T;
                            kp0.l(tweakService, "gpu_min_freq_is_running", false);
                        }
                        this.e = 32;
                        int i422222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -509248510:
                        vnVar = vnVar2;
                        if (str8.equals("com.lumi.singularity.STOP_FAN_OVERRIDE")) {
                            this.e = 18;
                            int i22 = TweakService.T;
                            nq nqVar11 = nr.a;
                            if (p01.H(hq.d, new mw0(tweakService, null, 16), this) == vnVar) {
                                return vnVar;
                            }
                            int i23 = TweakService.T;
                            kp0.l(tweakService, "fan_override_is_running", false);
                        }
                        this.e = 32;
                        int i4222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -388622826:
                        vnVar = vnVar2;
                        z4 = true;
                        if (str8.equals("com.lumi.singularity.START_GPU_MAX_FREQ")) {
                            this.e = 13;
                            int i24 = TweakService.T;
                            nq nqVar12 = nr.a;
                            Object H9 = p01.H(hq.d, new d4(tweakService, null, 9), this);
                            if (H9 != vnVar) {
                                H9 = w01Var;
                            }
                            if (H9 == vnVar) {
                                return vnVar;
                            }
                            int i25 = TweakService.T;
                            kp0.l(tweakService, "gpu_max_freq_is_running", z4);
                        }
                        this.e = 32;
                        int i42222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -309488819:
                        z5 = true;
                        if (str8.equals("com.lumi.singularity.START_CUSTOM_LED")) {
                            int intExtra = intent.getIntExtra("RED", 255);
                            int intExtra2 = intent.getIntExtra("GREEN", 255);
                            int intExtra3 = intent.getIntExtra("BLUE", 255);
                            this.e = 3;
                            int i26 = TweakService.T;
                            nq nqVar13 = nr.a;
                            vnVar = vnVar2;
                            Object H10 = p01.H(hq.d, new ow0(intExtra, intExtra2, intExtra3, tweakService, null), this);
                            if (H10 != vnVar) {
                                H10 = w01Var;
                            }
                            if (H10 == vnVar) {
                                return vnVar;
                            }
                            int i27 = TweakService.T;
                            kp0.l(tweakService, "custom_led_is_running", z5);
                            this.e = 32;
                            int i422222222222222 = TweakService.T;
                            if (tweakService.h(this) == vnVar) {
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i4222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -273953024:
                        if (str8.equals("com.lumi.singularity.STOP_USB_INTERCEPTOR")) {
                            this.e = 22;
                            int i28 = TweakService.T;
                            nq nqVar14 = nr.a;
                            Object H11 = p01.H(hq.d, new mw0(tweakService, null, 27), this);
                            if (H11 != vnVar2) {
                                H11 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i42222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -183776011:
                        if (str8.equals("com.lumi.singularity.START_CHARGE_NOTIF")) {
                            int i29 = TweakService.T;
                            if (tweakService.B) {
                                z6 = true;
                            } else {
                                z6 = true;
                                tweakService.B = true;
                                tweakService.C = p01.t(zlVar, null, null, new d4(tweakService, null, 8), 3);
                            }
                            kp0.l(tweakService, "charge_notif_enabled", z6);
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i422222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -104941059:
                        str5 = str;
                        if (str8.equals("com.lumi.singularity.STOP_MAX_FREQ")) {
                            this.e = 10;
                            int i30 = TweakService.T;
                            nq nqVar15 = nr.a;
                            Object H12 = p01.H(hq.d, new mw0(tweakService, null, 21), this);
                            if (H12 != vnVar2) {
                                H12 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i4222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case -48581693:
                        if (str8.equals("com.lumi.singularity.START_MAX_FREQ")) {
                            this.e = 9;
                            int i31 = TweakService.T;
                            nq nqVar16 = nr.a;
                            Object H13 = p01.H(hq.d, new mw0(tweakService, null, 7), this);
                            if (H13 != vnVar2) {
                                H13 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i42222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 512403056:
                        if (str8.equals("ACTION_APPLY_PASSTHROUGH_FIX")) {
                            this.e = 20;
                            int i32 = TweakService.T;
                            nq nqVar17 = nr.a;
                            Object H14 = p01.H(hq.d, new mw0(tweakService, hmVar, 0), this);
                            if (H14 != vnVar2) {
                                H14 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i422222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 514538643:
                        if (str8.equals("com.lumi.singularity.SET_FAN_RPM")) {
                            int i33 = TweakService.T;
                            int i34 = tweakService.c().getInt("fan_override_target_rpm", iv.b());
                            File file2 = tweakService.P;
                            if (file2 == null) {
                                q10.H("fanTargetRpmFile");
                                throw null;
                            }
                            String absolutePath2 = file2.getAbsolutePath();
                            absolutePath2.getClass();
                            iv.e(i34, absolutePath2);
                            tweakService.y = true;
                            kp0.l(tweakService, "fan_override_is_running", true);
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i4222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 572887655:
                        if (str8.equals("com.lumi.singularity.START_OTA_BLOCKER")) {
                            this.e = 23;
                            int i35 = TweakService.T;
                            nq nqVar18 = nr.a;
                            Object H15 = p01.H(hq.d, new mw0(tweakService, null, 9), this);
                            if (H15 != vnVar2) {
                                H15 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i42222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 608259648:
                        if (str8.equals("com.lumi.singularity.SET_CHARGE_LIMIT")) {
                            this.e = 19;
                            int i36 = TweakService.T;
                            nq nqVar19 = nr.a;
                            Object H16 = p01.H(hq.d, new ne(tweakService, null, 1), this);
                            if (H16 != vnVar2) {
                                H16 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i422222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 653282202:
                        str6 = str2;
                        if (str8.equals("com.lumi.singularity.STOP_LINK_FIX")) {
                            this.e = 30;
                            int i37 = TweakService.T;
                            nq nqVar20 = nr.a;
                            Object H17 = p01.H(hq.d, new mw0(tweakService, null, 20), this);
                            if (H17 != vnVar2) {
                                H17 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i4222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 709641568:
                        if (str8.equals("com.lumi.singularity.START_LINK_FIX")) {
                            this.e = 29;
                            int i38 = TweakService.T;
                            nq nqVar21 = nr.a;
                            Object H18 = p01.H(hq.d, new mw0(tweakService, null, 6), this);
                            if (H18 != vnVar2) {
                                H18 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i42222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 812273622:
                        if (str8.equals("com.lumi.singularity.action.STOP_WIRELESS_ADB")) {
                            Log.i(str7, "Stopping Wireless ADB");
                            p01.t(zlVar, null, null, new mw0(tweakService, null, 4), 3);
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i422222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 903227885:
                        if (str8.equals("com.lumi.singularity.STOP_OTA_BLOCKER")) {
                            this.e = 24;
                            int i39 = TweakService.T;
                            nq nqVar22 = nr.a;
                            Object H19 = p01.H(hq.d, new mw0(tweakService, null, 23), this);
                            if (H19 != vnVar2) {
                                H19 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i4222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 1053241610:
                        if (str8.equals("com.lumi.singularity.START_FRIDA")) {
                            this.e = 15;
                            int i40 = TweakService.T;
                            nq nqVar23 = nr.a;
                            Object H20 = p01.H(hq.d, new mw0(tweakService, null, 5), this);
                            if (H20 != vnVar2) {
                                H20 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i42222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 1218520935:
                        if (str8.equals("com.lumi.singularity.STOP_POWER_LED")) {
                            this.e = 6;
                            int i41 = TweakService.T;
                            nq nqVar24 = nr.a;
                            Object H21 = p01.H(hq.d, new mw0(tweakService, null, 25), this);
                            if (H21 != vnVar2) {
                                H21 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i422222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 1261989712:
                        if (str8.equals("com.lumi.singularity.STOP_GPU_MAX_FREQ")) {
                            this.e = 14;
                            int i43 = TweakService.T;
                            nq nqVar25 = nr.a;
                            break;
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i4222222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 1339652596:
                        if (str8.equals("com.lumi.singularity.START_PERSIST_PROTECT")) {
                            this.e = 25;
                            int i44 = TweakService.T;
                            nq nqVar26 = nr.a;
                            Object H22 = p01.H(hq.d, new mw0(tweakService, null, 10), this);
                            if (H22 != vnVar2) {
                                H22 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i42222222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 1363735303:
                        if (str8.equals("com.lumi.singularity.STOP_CUSTOM_LED")) {
                            this.e = 4;
                            int i45 = TweakService.T;
                            nq nqVar27 = nr.a;
                            Object H23 = p01.H(hq.d, new mw0(tweakService, null, 15), this);
                            if (H23 != vnVar2) {
                                H23 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i422222222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 1466836527:
                        if (str8.equals("com.lumi.singularity.STOP_CHARGE_NOTIF")) {
                            int i46 = TweakService.T;
                            tweakService.B = false;
                            rr0 rr0Var = tweakService.C;
                            if (rr0Var != null) {
                                rr0Var.cancel(null);
                            }
                            tweakService.C = null;
                            Object systemService = tweakService.getSystemService("notification");
                            systemService.getClass();
                            ((NotificationManager) systemService).cancel(3);
                            tweakService.c().edit().putBoolean("charge_notif_enabled", false).apply();
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i4222222222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 1657200250:
                        if (str8.equals("com.lumi.singularity.STOP_PERSIST_PROTECT")) {
                            this.e = 26;
                            int i47 = TweakService.T;
                            nq nqVar28 = nr.a;
                            Object H24 = p01.H(hq.d, new mw0(tweakService, hmVar, 24), this);
                            if (H24 != vnVar2) {
                                H24 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i42222222222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 1974131264:
                        if (str8.equals("com.lumi.singularity.action.START_WIRELESS_ADB")) {
                            Log.i(str7, "Starting Wireless ADB");
                            p01.t(zlVar, null, null, new mw0(tweakService, null, i2), 3);
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i422222222222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 2130147816:
                        if (str8.equals("com.lumi.singularity.START_GPU_MIN_FREQ")) {
                            this.e = 11;
                            int i48 = TweakService.T;
                            nq nqVar29 = nr.a;
                            Object H25 = p01.H(hq.d, new d4(tweakService, null, 10), this);
                            if (H25 != vnVar2) {
                                H25 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i4222222222222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    case 2135106248:
                        if (str8.equals("com.lumi.singularity.START_FAN_OVERRIDE")) {
                            this.e = 17;
                            int i49 = TweakService.T;
                            nq nqVar30 = nr.a;
                            Object H26 = p01.H(hq.d, new pw0(tweakService, null), this);
                            if (H26 != vnVar2) {
                                H26 = w01Var;
                                break;
                            }
                        }
                        vnVar = vnVar2;
                        this.e = 32;
                        int i42222222222222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                    default:
                        vnVar = vnVar2;
                        this.e = 32;
                        int i422222222222222222222222222222222222222 = TweakService.T;
                        if (tweakService.h(this) == vnVar) {
                        }
                        break;
                }
            case 1:
                p10.Q(obj);
                vnVar = vnVar2;
                z2 = true;
                int i122 = TweakService.T;
                kp0.l(tweakService, "rgb_led_is_running", z2);
                this.e = 32;
                int i4222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 2:
                p10.Q(obj);
                vnVar = vnVar2;
                str3 = "rgb_led_is_running";
                int i62 = TweakService.T;
                kp0.l(tweakService, str3, false);
                this.e = 32;
                int i42222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 3:
                p10.Q(obj);
                vnVar = vnVar2;
                z5 = true;
                int i272 = TweakService.T;
                kp0.l(tweakService, "custom_led_is_running", z5);
                this.e = 32;
                int i422222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 4:
                p10.Q(obj);
                int i50 = TweakService.T;
                kp0.l(tweakService, "custom_led_is_running", false);
                vnVar = vnVar2;
                this.e = 32;
                int i4222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 5:
                p10.Q(obj);
                vnVar = vnVar2;
                z3 = true;
                int i162 = TweakService.T;
                kp0.l(tweakService, "power_led_is_running", z3);
                this.e = 32;
                int i42222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 6:
                p10.Q(obj);
                int i51 = TweakService.T;
                kp0.l(tweakService, "power_led_is_running", false);
                vnVar = vnVar2;
                this.e = 32;
                int i422222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 7:
                p10.Q(obj);
                vnVar = vnVar2;
                z = true;
                int i102 = TweakService.T;
                kp0.l(tweakService, "min_freq_is_running", z);
                this.e = 32;
                int i4222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 8:
                p10.Q(obj);
                vnVar = vnVar2;
                str4 = "min_freq_is_running";
                int i82 = TweakService.T;
                kp0.l(tweakService, str4, false);
                this.e = 32;
                int i42222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 9:
                p10.Q(obj);
                str = "max_freq_is_running";
                int i52 = TweakService.T;
                kp0.l(tweakService, str, true);
                vnVar = vnVar2;
                this.e = 32;
                int i422222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 10:
                p10.Q(obj);
                str5 = "max_freq_is_running";
                int i53 = TweakService.T;
                kp0.l(tweakService, str5, false);
                vnVar = vnVar2;
                this.e = 32;
                int i4222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 11:
                p10.Q(obj);
                int i54 = TweakService.T;
                kp0.l(tweakService, "gpu_min_freq_is_running", true);
                vnVar = vnVar2;
                this.e = 32;
                int i42222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case Matrix.TranslateX /* 12 */:
                p10.Q(obj);
                vnVar = vnVar2;
                int i212 = TweakService.T;
                kp0.l(tweakService, "gpu_min_freq_is_running", false);
                this.e = 32;
                int i422222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case Matrix.TranslateY /* 13 */:
                p10.Q(obj);
                vnVar = vnVar2;
                z4 = true;
                int i252 = TweakService.T;
                kp0.l(tweakService, "gpu_max_freq_is_running", z4);
                this.e = 32;
                int i4222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case Matrix.TranslateZ /* 14 */:
                p10.Q(obj);
                int i55 = TweakService.T;
                kp0.l(tweakService, "gpu_max_freq_is_running", false);
                vnVar = vnVar2;
                this.e = 32;
                int i42222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 15:
                p10.Q(obj);
                int i56 = TweakService.T;
                kp0.l(tweakService, "frida_is_running", true);
                vnVar = vnVar2;
                this.e = 32;
                int i422222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 16:
                p10.Q(obj);
                vnVar = vnVar2;
                int i142 = TweakService.T;
                kp0.l(tweakService, "frida_is_running", false);
                this.e = 32;
                int i4222222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 17:
                p10.Q(obj);
                int i57 = TweakService.T;
                kp0.l(tweakService, "fan_override_is_running", true);
                vnVar = vnVar2;
                this.e = 32;
                int i42222222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 18:
                p10.Q(obj);
                vnVar = vnVar2;
                int i232 = TweakService.T;
                kp0.l(tweakService, "fan_override_is_running", false);
                this.e = 32;
                int i422222222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 19:
                p10.Q(obj);
                int i58 = TweakService.T;
                tweakService.c().edit().putBoolean("charge_limit_is_running", tweakService.z).apply();
                vnVar = vnVar2;
                this.e = 32;
                int i4222222222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
            case 21:
            case 22:
            case 23:
            case 24:
            case 27:
            case 28:
            case 31:
                p10.Q(obj);
                vnVar = vnVar2;
                this.e = 32;
                int i42222222222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case RectListKt.BitOffsetForParentId /* 25 */:
                p10.Q(obj);
                int i59 = TweakService.T;
                tweakService.c().edit().putBoolean("persist_protect_running", true).putBoolean("persist_protect_toggle_enabled", true).apply();
                vnVar = vnVar2;
                this.e = 32;
                int i422222222222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 26:
                p10.Q(obj);
                int i60 = TweakService.T;
                tweakService.c().edit().putBoolean("persist_protect_running", false).putBoolean("persist_protect_toggle_enabled", false).apply();
                vnVar = vnVar2;
                this.e = 32;
                int i4222222222222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 29:
                p10.Q(obj);
                str2 = "link_fix_running";
                int i61 = TweakService.T;
                kp0.l(tweakService, str2, true);
                vnVar = vnVar2;
                this.e = 32;
                int i42222222222222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 30:
                p10.Q(obj);
                str6 = "link_fix_running";
                int i63 = TweakService.T;
                kp0.l(tweakService, str6, false);
                vnVar = vnVar2;
                this.e = 32;
                int i422222222222222222222222222222222222222222222222222222222222222 = TweakService.T;
                if (tweakService.h(this) == vnVar) {
                }
                break;
            case 32:
                p10.Q(obj);
                return w01Var;
            default:
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = 2;
        switch (this.d) {
            case 0:
                return new o3(this.f, (Serializable) this.g, this.h, hmVar, 0);
            case 1:
                return new o3((PackageManager) this.g, (b8) this.h, (Context) this.f, hmVar);
            case 2:
                o3 o3Var = new o3((jw) this.g, (bh) this.h, hmVar, i);
                o3Var.f = obj;
                return o3Var;
            case 3:
                return new o3((jm) this.f, (MutableState) this.h, (MutableState) this.g, hmVar);
            case 4:
                return new o3(this.g, this.f, this.h, hmVar, 4);
            case 5:
                return new o3(i, 5, hmVar);
            case 6:
                return new o3((SharedPreferences) this.g, (Context) this.f, (MutableState) this.h, hmVar, 6);
            case 7:
                return new o3(i, 7, hmVar);
            case 8:
                o3 o3Var2 = new o3((Context) this.f, (MutableState) this.h, hmVar);
                o3Var2.g = obj;
                return o3Var2;
            case 9:
                return new o3((my) this.g, (hy) this.h, hmVar, 9);
            case 10:
                return new o3((String) this.g, (TweakService) this.f, (Intent) this.h, hmVar, 10);
            case 11:
                return new o3((MutableState) this.h, (ky) this.f, (MutableState) this.g, hmVar);
            case Matrix.TranslateX /* 12 */:
                return new o3(this.f, (Serializable) this.g, this.h, hmVar, 12);
            default:
                o3 o3Var3 = new o3((p7) this.h, (Context) this.f, hmVar);
                o3Var3.g = obj;
                return o3Var3;
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 1:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 2:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 3:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 4:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 5:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 6:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 7:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 8:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 9:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 10:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 11:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case Matrix.TranslateX /* 12 */:
                return ((o3) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            default:
                return ((o3) create((gg0) obj, (hm) obj2)).invokeSuspend(w01Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01fa, code lost:
    
        if (r3 == r0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0334, code lost:
    
        if (r0 == r2) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x06af, code lost:
    
        if (r5.length() > 0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
    
        if (defpackage.p01.H(r2, r10, r21) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
    
        if (defpackage.zj0.c("umount -l /system/framework/services.jar 2>/dev/null || true; rm -rf /data/adb/singularity/services", false, r21) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        if (defpackage.p01.H(r2, r3, r21) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b1, code lost:
    
        if (defpackage.zj0.c(r0, false, r21) == r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0175, code lost:
    
        if (r7 == r4) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0380 A[Catch: all -> 0x0384, TRY_LEAVE, TryCatch #1 {all -> 0x0384, blocks: (B:156:0x0355, B:158:0x035d, B:160:0x0363, B:162:0x0380), top: B:155:0x0355 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x061a  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        u80 n;
        String x0;
        String str6;
        String str7;
        String str8;
        Object e;
        bo boVar;
        Object i;
        ob0 ob0Var;
        bo boVar2;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        Object b;
        Object H;
        List list;
        Object b2;
        ob0 ob0Var2;
        List list2;
        SharedPreferences sharedPreferences2;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor putString2;
        Object b3;
        fi0 fi0Var;
        int i2 = 9;
        int i3 = 2;
        int i4 = 0;
        Object obj2 = "call to 'resume' before 'invoke' with coroutine";
        int i5 = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        String str9 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj3 = null;
        Object obj4 = null;
        switch (this.d) {
            case 0:
                vn vnVar = vn.d;
                int i6 = this.e;
                if (i6 == 0) {
                    p10.Q(obj);
                    Context context = (Context) this.f;
                    String str10 = (String) this.g;
                    y2 y2Var = new y2((MutableState) this.h, 1);
                    this.e = 1;
                    if (j4.g(context, str10, y2Var, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i6 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01.a;
            case 1:
                b8 b8Var = (b8) this.h;
                vn vnVar2 = vn.d;
                int i7 = this.e;
                if (i7 == 0) {
                    p10.Q(obj);
                    Intent launchIntentForPackage = ((PackageManager) this.g).getLaunchIntentForPackage(b8Var.c);
                    if (launchIntentForPackage != null) {
                        ((Context) this.f).startActivity(launchIntentForPackage);
                    } else {
                        nq nqVar = nr.a;
                        hq hqVar = hq.d;
                        y9 y9Var = new y9(b8Var, objArr == true ? 1 : 0, c2 == true ? 1 : 0);
                        this.e = 1;
                        if (p01.H(hqVar, y9Var, this) == vnVar2) {
                            return vnVar2;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01.a;
            case 2:
                w01 w01Var = w01.a;
                vn vnVar3 = vn.d;
                int i8 = this.e;
                if (i8 == 0) {
                    p10.Q(obj);
                    un unVar = (un) this.f;
                    jw jwVar = (jw) this.g;
                    zg h = ((bh) this.h).h(unVar);
                    this.e = 1;
                    Object n2 = q10.n(jwVar, h, true, this);
                    if (n2 != vnVar3) {
                        n2 = w01Var;
                    }
                    if (n2 == vnVar3) {
                        return vnVar3;
                    }
                } else {
                    if (i8 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01Var;
            case 3:
                MutableState mutableState = (MutableState) this.h;
                vn vnVar4 = vn.d;
                int i9 = this.e;
                if (i9 == 0) {
                    p10.Q(obj);
                    mutableState.setValue(Boolean.TRUE);
                    this.e = 1;
                    zj0 zj0Var = zj0.a;
                    c = zj0.c("rstest info", false, this);
                    if (c == vnVar4) {
                        return vnVar4;
                    }
                } else {
                    if (i9 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    c = obj;
                }
                String str11 = (String) c;
                MutableState mutableState2 = (MutableState) this.g;
                str11.getClass();
                ArrayList arrayList = new ArrayList();
                for (String str12 : ds0.w0(str11, new String[]{"\n"})) {
                    if (ds0.g0(str12, "Paired device:", false) && !ds0.g0(str12, "NoHand", false) && !ds0.g0(str12, "NoHandSecond", false)) {
                        if (ds0.g0(str12, "<none>", false)) {
                            Pattern compile = Pattern.compile("deviceType:\\s*(\\d+)");
                            compile.getClass();
                            Matcher matcher = compile.matcher(str12);
                            matcher.getClass();
                            u80 n3 = cq.n(matcher, 0, str12);
                            String str13 = (n3 == null || (str2 = (String) ((s80) n3.a()).get(1)) == null) ? "" : str2;
                            Pattern compile2 = Pattern.compile("\\(([^)]+)\\)");
                            compile2.getClass();
                            Matcher matcher2 = compile2.matcher(str12);
                            matcher2.getClass();
                            u80 n4 = cq.n(matcher2, 0, str12);
                            arrayList.add(new km(str13, (n4 == null || (str = (String) ((s80) n4.a()).get(1)) == null) ? "Unknown Slot" : str, null, null, null, "NOT PAIRED", null, null, false));
                        } else {
                            Pattern compile3 = Pattern.compile("deviceType:\\s*(\\d+)");
                            compile3.getClass();
                            Matcher matcher3 = compile3.matcher(str12);
                            matcher3.getClass();
                            u80 n5 = cq.n(matcher3, 0, str12);
                            String str14 = (n5 == null || (str8 = (String) ((s80) n5.a()).get(1)) == null) ? "" : str8;
                            Pattern compile4 = Pattern.compile("\\((LeftHand|RightHand)\\)");
                            compile4.getClass();
                            Matcher matcher4 = compile4.matcher(str12);
                            matcher4.getClass();
                            u80 n6 = cq.n(matcher4, 0, str12);
                            if (n6 == null || (str7 = (String) ((s80) n6.a()).get(1)) == null) {
                                Pattern compile5 = Pattern.compile("deviceType:\\s*\\d+\\s+\\(([^)]+)\\)");
                                compile5.getClass();
                                Matcher matcher5 = compile5.matcher(str12);
                                matcher5.getClass();
                                u80 n7 = cq.n(matcher5, 0, str12);
                                str3 = n7 != null ? (String) ((s80) n7.a()).get(1) : "Unknown Slot";
                            } else {
                                str3 = str7;
                            }
                            Pattern compile6 = Pattern.compile("model:\\s*\\d+\\s+\\(([^)]+)\\)");
                            compile6.getClass();
                            Matcher matcher6 = compile6.matcher(str12);
                            matcher6.getClass();
                            u80 n8 = cq.n(matcher6, 0, str12);
                            if (n8 == null || (str5 = (String) ((s80) n8.a()).get(1)) == null) {
                                Pattern compile7 = Pattern.compile("model:\\s*(\\d+)");
                                compile7.getClass();
                                Matcher matcher7 = compile7.matcher(str12);
                                matcher7.getClass();
                                u80 n9 = cq.n(matcher7, 0, str12);
                                if (n9 != null) {
                                    str5 = (String) ((s80) n9.a()).get(1);
                                } else {
                                    str4 = null;
                                    Pattern compile8 = Pattern.compile("id:\\s*([a-f0-9A-F]+)");
                                    compile8.getClass();
                                    Matcher matcher8 = compile8.matcher(str12);
                                    matcher8.getClass();
                                    u80 n10 = cq.n(matcher8, 0, str12);
                                    String str15 = n10 == null ? (String) ((s80) n10.a()).get(1) : null;
                                    Pattern compile9 = Pattern.compile("status:\\s*([A-Z_]+)");
                                    compile9.getClass();
                                    Matcher matcher9 = compile9.matcher(str12);
                                    matcher9.getClass();
                                    n = cq.n(matcher9, 0, str12);
                                    if (n != null || (r7 = (String) ((s80) n.a()).get(1)) == null) {
                                        String str16 = "PAIRED";
                                    }
                                    String str17 = str16;
                                    Pattern compile10 = Pattern.compile("bat:\\s*(\\d+)");
                                    compile10.getClass();
                                    Matcher matcher10 = compile10.matcher(str12);
                                    matcher10.getClass();
                                    u80 n11 = cq.n(matcher10, 0, str12);
                                    String str18 = n11 == null ? (String) ((s80) n11.a()).get(1) : null;
                                    Pattern compile11 = Pattern.compile("fw:\\s*([0-9.]+)");
                                    compile11.getClass();
                                    Matcher matcher11 = compile11.matcher(str12);
                                    matcher11.getClass();
                                    u80 n12 = cq.n(matcher11, 0, str12);
                                    String str19 = n12 == null ? (String) ((s80) n12.a()).get(1) : null;
                                    x0 = ds0.x0(str12, "serial:", "");
                                    if (x0.length() > 0) {
                                        str6 = ds0.E0(ds0.B0(x0, "status:")).toString();
                                        break;
                                    }
                                    str6 = null;
                                    arrayList.add(new km(str14, str3, str4, str15, str6 != null ? "N/A" : str6, str17, str18, str19 != null ? "N/A" : str19, true));
                                }
                            }
                            str4 = str5;
                            Pattern compile82 = Pattern.compile("id:\\s*([a-f0-9A-F]+)");
                            compile82.getClass();
                            Matcher matcher82 = compile82.matcher(str12);
                            matcher82.getClass();
                            u80 n102 = cq.n(matcher82, 0, str12);
                            if (n102 == null) {
                            }
                            Pattern compile92 = Pattern.compile("status:\\s*([A-Z_]+)");
                            compile92.getClass();
                            Matcher matcher92 = compile92.matcher(str12);
                            matcher92.getClass();
                            n = cq.n(matcher92, 0, str12);
                            if (n != null) {
                            }
                            String str162 = "PAIRED";
                            String str172 = str162;
                            Pattern compile102 = Pattern.compile("bat:\\s*(\\d+)");
                            compile102.getClass();
                            Matcher matcher102 = compile102.matcher(str12);
                            matcher102.getClass();
                            u80 n112 = cq.n(matcher102, 0, str12);
                            if (n112 == null) {
                            }
                            Pattern compile112 = Pattern.compile("fw:\\s*([0-9.]+)");
                            compile112.getClass();
                            Matcher matcher112 = compile112.matcher(str12);
                            matcher112.getClass();
                            u80 n122 = cq.n(matcher112, 0, str12);
                            if (n122 == null) {
                            }
                            x0 = ds0.x0(str12, "serial:", "");
                            if (x0.length() > 0) {
                            }
                            str6 = null;
                            arrayList.add(new km(str14, str3, str4, str15, str6 != null ? "N/A" : str6, str172, str18, str19 != null ? "N/A" : str19, true));
                        }
                    }
                }
                mutableState2.setValue(arrayList);
                mutableState.setValue(Boolean.FALSE);
                return w01.a;
            case 4:
                vn vnVar5 = vn.d;
                int i10 = this.e;
                if (i10 == 0) {
                    p10.Q(obj);
                    ro roVar = ro.a;
                    this.e = 1;
                    e = ro.e(this);
                    if (e == vnVar5) {
                        return vnVar5;
                    }
                } else {
                    if (i10 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    e = obj;
                }
                bo boVar3 = (bo) e;
                String str20 = (String) this.g;
                if (str20 == null) {
                    str20 = String.valueOf(boVar3.b().d);
                }
                String str21 = (String) this.f;
                if (str21 == null) {
                    str21 = String.valueOf(boVar3.a().d);
                }
                String u0 = yi.u0(boVar3.b().b(), "\n    ", null, null, new wd(str20, 3), 30);
                String u02 = yi.u0(boVar3.a().b(), "\n    ", null, null, new wd(str21, 4), 30);
                zn c5 = boVar3.c();
                if (c5 != null) {
                    String str22 = (String) this.h;
                    if (str22 == null) {
                        str22 = String.valueOf(c5.d);
                    }
                    str9 = yi.u0(c5.b(), "\n    ", null, null, new wd(str22, 5), 30);
                }
                StringBuilder k = j50.k("\n            #!/system/bin/sh\n            while true; do\n                ", u0, "\n                ", str9 != null ? str9 : "", "\n                ");
                k.append(u02);
                k.append("\n                sleep 2\n            done\n        ");
                return es0.W(k.toString());
            case 5:
                vn vnVar6 = vn.d;
                int i11 = this.e;
                try {
                } catch (Exception e2) {
                    Log.w("CpuUtils", "Topology re-verification failed: " + e2.getMessage());
                    boVar = null;
                }
                if (i11 == 0) {
                    p10.Q(obj);
                    obj2 = ro.c;
                    ro roVar2 = ro.a;
                    this.f = obj2;
                    this.e = 1;
                    b = roVar2.b(this);
                    if (b == vnVar6) {
                        return vnVar6;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ob0 ob0Var3 = (ob0) this.h;
                            boVar2 = (bo) this.g;
                            p10.Q(obj);
                            ob0Var = ob0Var3;
                            try {
                                ro roVar3 = ro.a;
                                ro.c = boVar2;
                                sharedPreferences = ro.g;
                                if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
                                    ro roVar4 = ro.a;
                                    putString = edit.putString("cpu_topology_cache", yi.u0(boVar2.a, "\n", null, null, new ed(25), 30));
                                    if (putString != null) {
                                        putString.apply();
                                    }
                                }
                                ob0Var.f(null);
                                Log.d("CpuUtils", "CPU topology cache updated after re-verification: ".concat(yi.u0(boVar2.a, null, null, null, new qo(i4), 31)));
                                return boVar2;
                            } finally {
                            }
                        }
                        bo boVar4 = (bo) this.f;
                        p10.Q(obj);
                        obj2 = boVar4;
                        i = obj;
                        boVar = (bo) i;
                        if (obj2 == null && q10.b(boVar, obj2)) {
                            return null;
                        }
                        ob0Var = ro.d;
                        this.f = null;
                        this.g = boVar;
                        this.h = ob0Var;
                        this.e = 3;
                        if (ob0Var.d(this) != vnVar6) {
                            boVar2 = boVar;
                            ro roVar32 = ro.a;
                            ro.c = boVar2;
                            sharedPreferences = ro.g;
                            if (sharedPreferences != null) {
                                ro roVar42 = ro.a;
                                putString = edit.putString("cpu_topology_cache", yi.u0(boVar2.a, "\n", null, null, new ed(25), 30));
                                if (putString != null) {
                                }
                            }
                            ob0Var.f(null);
                            Log.d("CpuUtils", "CPU topology cache updated after re-verification: ".concat(yi.u0(boVar2.a, null, null, null, new qo(i4), 31)));
                            return boVar2;
                        }
                        return vnVar6;
                    }
                    obj2 = (bo) this.f;
                    p10.Q(obj);
                    b = obj;
                }
                boVar = (bo) b;
                if (boVar == null) {
                    ro roVar5 = ro.a;
                    this.f = obj2;
                    this.e = 2;
                    i = roVar5.i(this);
                    break;
                }
                if (obj2 == null) {
                }
                ob0Var = ro.d;
                this.f = null;
                this.g = boVar;
                this.h = ob0Var;
                this.e = 3;
                if (ob0Var.d(this) != vnVar6) {
                }
                return vnVar6;
            case 6:
                MutableState mutableState3 = (MutableState) this.h;
                vn vnVar7 = vn.d;
                int i12 = this.e;
                if (i12 == 0) {
                    p10.Q(obj);
                    nq nqVar2 = nr.a;
                    hq hqVar2 = hq.d;
                    e4 e4Var = new e4((Context) this.f, objArr2 == true ? 1 : 0, i2);
                    this.e = 1;
                    H = p01.H(hqVar2, e4Var, this);
                    if (H == vnVar7) {
                        return vnVar7;
                    }
                } else {
                    if (i12 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    H = obj;
                }
                Boolean bool = (Boolean) H;
                boolean booleanValue = bool.booleanValue();
                if (booleanValue != gs.b(mutableState3)) {
                    mutableState3.setValue(bool);
                    ((SharedPreferences) this.g).edit().putBoolean("root_blocker_is_running", booleanValue).apply();
                }
                return w01.a;
            case 7:
                vn vnVar8 = vn.d;
                int i13 = this.e;
                if (i13 == 0) {
                    p10.Q(obj);
                    list = pz.q;
                    pz pzVar = pz.a;
                    this.f = list;
                    this.e = 1;
                    b2 = pzVar.b(this);
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ob0 ob0Var4 = (ob0) this.h;
                        List list3 = (List) this.g;
                        p10.Q(obj);
                        ob0Var2 = ob0Var4;
                        list2 = list3;
                        try {
                            pz pzVar2 = pz.a;
                            pz.q = list2;
                            if (list2.size() >= 2 && (sharedPreferences2 = pz.s) != null && (edit2 = sharedPreferences2.edit()) != null && (putString2 = edit2.putString("gpu_available_freqs_cache", yi.u0(list2, ",", null, null, null, 62))) != null) {
                                putString2.apply();
                            }
                            ob0Var2.f(null);
                            Log.d("GpuUtils", "GPU available frequencies cache updated after re-verification: " + list2);
                            return list2;
                        } finally {
                        }
                    }
                    list = (List) this.f;
                    p10.Q(obj);
                    b2 = obj;
                }
                List list4 = (List) b2;
                if (list4 == null) {
                    list4 = hr.d() ? pz.b : ut.d;
                }
                if (list != null && q10.b(list4, list)) {
                    return null;
                }
                ob0Var2 = pz.r;
                this.f = null;
                this.g = list4;
                this.h = ob0Var2;
                this.e = 2;
                if (ob0Var2.d(this) != vnVar8) {
                    list2 = list4;
                    pz pzVar22 = pz.a;
                    pz.q = list2;
                    if (list2.size() >= 2) {
                        putString2.apply();
                    }
                    ob0Var2.f(null);
                    Log.d("GpuUtils", "GPU available frequencies cache updated after re-verification: " + list2);
                    return list2;
                }
                return vnVar8;
            case 8:
                Context context2 = (Context) this.f;
                MutableState mutableState4 = (MutableState) this.h;
                un unVar2 = (un) this.g;
                vn vnVar9 = vn.d;
                int i14 = this.e;
                if (i14 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var2 = zj0.a;
                    this.g = unVar2;
                    this.e = 1;
                    b3 = zj0.b(this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            p10.Q(obj);
                            return w01.a;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    b3 = obj;
                }
                Boolean bool2 = (Boolean) b3;
                boolean booleanValue2 = bool2.booleanValue();
                if (booleanValue2 != ((Boolean) mutableState4.getValue()).booleanValue()) {
                    mutableState4.setValue(bool2);
                    if (booleanValue2) {
                        if (!q10.v(context2)) {
                            String packageName = context2.getPackageName();
                            if (q10.b(packageName, "com.lumi.singularity")) {
                                zj0 zj0Var3 = zj0.a;
                                String c6 = uo.c("pm uninstall ", packageName);
                                this.g = null;
                                this.e = 2;
                                break;
                            }
                        } else {
                            nq nqVar3 = nr.a;
                            p01.t(unVar2, hq.d, null, new b80(i3, c3 == true ? 1 : 0, objArr3 == true ? 1 : 0), 2);
                        }
                    }
                }
                return w01.a;
            case 9:
                vn vnVar10 = vn.d;
                int i15 = this.e;
                if (i15 == 0) {
                    p10.Q(obj);
                    fi0 fi0Var2 = new fi0();
                    my myVar = (my) this.g;
                    ow owVar = new ow(new ah((of) ((hy) this.h).b, c4 == true ? 1 : 0), new gd0(fi0Var2, null));
                    this.f = fi0Var2;
                    this.e = 1;
                    if (myVar.invoke(owVar, this) == vnVar10) {
                        return vnVar10;
                    }
                    fi0Var = fi0Var2;
                } else {
                    if (i15 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fi0Var = (fi0) this.f;
                    p10.Q(obj);
                }
                if (fi0Var.d) {
                    return w01.a;
                }
                o.f("You must collect the progress flow");
                return null;
            case 10:
                return e(obj);
            case 11:
                MutableState mutableState5 = (MutableState) this.h;
                vn vnVar11 = vn.d;
                int i16 = this.e;
                hm hmVar = null;
                if (i16 == 0) {
                    p10.Q(obj);
                    nq nqVar4 = nr.a;
                    rz rzVar = f80.a;
                    aa aaVar = new aa(mutableState5, hmVar, i5);
                    this.e = 1;
                    break;
                } else if (i16 == 1) {
                    p10.Q(obj);
                } else {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            p10.Q(obj);
                            return w01.a;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    nq nqVar5 = nr.a;
                    rz rzVar2 = f80.a;
                    f4 f4Var = new f4((ky) this.f, this.g, mutableState5, hmVar, 7);
                    this.e = 3;
                    break;
                }
                zj0 zj0Var4 = zj0.a;
                this.e = 2;
                break;
            case Matrix.TranslateX /* 12 */:
                vn vnVar12 = vn.d;
                int i17 = this.e;
                if (i17 == 0) {
                    p10.Q(obj);
                    nq nqVar6 = nr.a;
                    hq hqVar3 = hq.d;
                    xz0 xz0Var = new xz0((List) this.f, (ArrayList) this.g, (ArrayList) this.h, null);
                    this.e = 1;
                    if (p01.H(hqVar3, xz0Var, this) == vnVar12) {
                        return vnVar12;
                    }
                } else {
                    if (i17 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01.a;
            default:
                p7 p7Var = (p7) this.h;
                vn vnVar13 = vn.d;
                int i18 = this.e;
                if (i18 == 0) {
                    p10.Q(obj);
                    gg0 gg0Var = (gg0) this.g;
                    p21 p21Var = new p21(gg0Var);
                    ((m21) p7Var.d).a((Context) this.f, new hg0(0), p21Var);
                    rn0 rn0Var = new rn0(i2, p7Var, p21Var);
                    this.e = 1;
                    if (p10.d(gg0Var, rn0Var, this) == vnVar13) {
                        return vnVar13;
                    }
                } else {
                    if (i18 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(p7 p7Var, Context context, hm hmVar) {
        super(2, hmVar);
        this.d = 13;
        this.h = p7Var;
        this.f = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(jm jmVar, MutableState mutableState, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.d = 3;
        this.f = jmVar;
        this.h = mutableState;
        this.g = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(Context context, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.d = 8;
        this.f = context;
        this.h = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(PackageManager packageManager, b8 b8Var, Context context, hm hmVar) {
        super(2, hmVar);
        this.d = 1;
        this.g = packageManager;
        this.h = b8Var;
        this.f = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(int i, int i2, hm hmVar) {
        super(i, hmVar);
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(Object obj, Serializable serializable, Object obj2, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = obj;
        this.g = serializable;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(Object obj, Object obj2, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(Object obj, Object obj2, Object obj3, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.g = obj;
        this.f = obj2;
        this.h = obj3;
    }
}
