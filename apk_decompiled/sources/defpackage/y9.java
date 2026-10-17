package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class y9 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(Object obj, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:17|(2:18|(3:20|(2:22|23)(2:(2:26|(2:28|29))|(2:31|32)(2:33|34))|24)(1:35))|36|37|(3:38|39|(7:41|42|(1:44)(2:49|(1:51)(2:52|(1:54)(2:55|(1:57)(2:58|(1:60)(2:61|(1:63)(2:64|(1:66)(2:67|(1:69)(7:70|(1:72)(2:77|(1:79)(2:80|(1:82)(2:83|(1:85)(2:86|(5:88|(1:90)(1:96)|91|(1:93)(1:95)|94)(2:97|(1:99)(2:100|(1:102)(2:103|(1:105)(2:106|(1:108)(2:109|(1:111)(7:112|(1:114)(3:116|117|(1:119)(6:120|(1:122)(3:124|125|(2:127|(1:129))(7:130|(1:132)(2:134|(1:136)(2:137|(1:139)(2:140|(1:142)(3:143|(1:145)(2:147|(1:149)(6:150|(1:152)(2:154|(1:156)(2:157|(1:159)(2:160|(1:162)(2:163|(1:165)(5:166|(1:168)(2:171|(1:173)(2:174|(1:176)(2:177|(1:179)(5:180|(1:182)(2:185|(1:187)(3:188|(2:190|191)(1:192)|48))|183|184|48))))|169|170|48)))))|153|46|47|48))|146))))|133|74|75|76|48))|123|75|76|48))|115|74|75|76|48))))))))))|73|74|75|76|48))))))))|45|46|47|48)(1:193))|194|195|(2:197|(1:199)(13:200|201|(2:203|(10:205|206|207|(1:209)(1:(1:221)(2:222|(4:225|226|(1:228)(1:231)|229)(5:224|212|(1:215)|217|218)))|210|211|212|(1:215)|217|218))|241|206|207|(0)(0)|210|211|212|(0)|217|218))|242|201|(0)|241|206|207|(0)(0)|210|211|212|(0)|217|218) */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x075c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06f8 A[Catch: Exception -> 0x011b, all -> 0x0797, TRY_LEAVE, TryCatch #4 {Exception -> 0x011b, blocks: (B:10:0x00d2, B:12:0x00da, B:14:0x00e2, B:17:0x00ea, B:18:0x00f8, B:20:0x0102, B:22:0x0110, B:26:0x0122, B:31:0x012e, B:36:0x013e, B:38:0x014b, B:41:0x0156, B:44:0x0166, B:49:0x01a2, B:51:0x01a8, B:52:0x01bb, B:54:0x01c1, B:55:0x01d4, B:57:0x01da, B:58:0x01ed, B:60:0x01f3, B:61:0x0207, B:63:0x020d, B:64:0x0221, B:66:0x0227, B:67:0x023b, B:69:0x0241, B:70:0x0255, B:72:0x025d, B:77:0x028d, B:79:0x0299, B:80:0x02c7, B:82:0x02d3, B:83:0x02ff, B:85:0x030b, B:86:0x0335, B:88:0x0341, B:90:0x0353, B:94:0x0360, B:97:0x0378, B:99:0x0384, B:100:0x03ac, B:102:0x03b8, B:103:0x03dd, B:105:0x03e9, B:106:0x040c, B:108:0x0418, B:109:0x0435, B:111:0x0441, B:112:0x0451, B:114:0x045d, B:116:0x047e, B:119:0x048c, B:120:0x0493, B:122:0x049f, B:124:0x04bf, B:127:0x04cd, B:129:0x04d1, B:130:0x04d8, B:132:0x04e4, B:134:0x04fe, B:136:0x0508, B:137:0x050f, B:139:0x0517, B:140:0x052c, B:142:0x0536, B:143:0x053d, B:145:0x0545, B:147:0x055a, B:149:0x0562, B:150:0x0569, B:152:0x0571, B:154:0x058b, B:156:0x0595, B:157:0x059c, B:159:0x05a4, B:160:0x05b9, B:162:0x05c3, B:163:0x05ca, B:165:0x05d2, B:166:0x05e7, B:168:0x05ef, B:171:0x0609, B:173:0x0613, B:174:0x0628, B:176:0x0632, B:177:0x0639, B:179:0x0641, B:180:0x0656, B:182:0x065e, B:185:0x0677, B:187:0x0681, B:188:0x0696, B:190:0x06a0, B:194:0x06de, B:197:0x06e8, B:201:0x06f2, B:203:0x06f8, B:209:0x0706, B:221:0x0716, B:222:0x0721), top: B:9:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0706 A[Catch: Exception -> 0x011b, all -> 0x0797, TRY_ENTER, TryCatch #4 {Exception -> 0x011b, blocks: (B:10:0x00d2, B:12:0x00da, B:14:0x00e2, B:17:0x00ea, B:18:0x00f8, B:20:0x0102, B:22:0x0110, B:26:0x0122, B:31:0x012e, B:36:0x013e, B:38:0x014b, B:41:0x0156, B:44:0x0166, B:49:0x01a2, B:51:0x01a8, B:52:0x01bb, B:54:0x01c1, B:55:0x01d4, B:57:0x01da, B:58:0x01ed, B:60:0x01f3, B:61:0x0207, B:63:0x020d, B:64:0x0221, B:66:0x0227, B:67:0x023b, B:69:0x0241, B:70:0x0255, B:72:0x025d, B:77:0x028d, B:79:0x0299, B:80:0x02c7, B:82:0x02d3, B:83:0x02ff, B:85:0x030b, B:86:0x0335, B:88:0x0341, B:90:0x0353, B:94:0x0360, B:97:0x0378, B:99:0x0384, B:100:0x03ac, B:102:0x03b8, B:103:0x03dd, B:105:0x03e9, B:106:0x040c, B:108:0x0418, B:109:0x0435, B:111:0x0441, B:112:0x0451, B:114:0x045d, B:116:0x047e, B:119:0x048c, B:120:0x0493, B:122:0x049f, B:124:0x04bf, B:127:0x04cd, B:129:0x04d1, B:130:0x04d8, B:132:0x04e4, B:134:0x04fe, B:136:0x0508, B:137:0x050f, B:139:0x0517, B:140:0x052c, B:142:0x0536, B:143:0x053d, B:145:0x0545, B:147:0x055a, B:149:0x0562, B:150:0x0569, B:152:0x0571, B:154:0x058b, B:156:0x0595, B:157:0x059c, B:159:0x05a4, B:160:0x05b9, B:162:0x05c3, B:163:0x05ca, B:165:0x05d2, B:166:0x05e7, B:168:0x05ef, B:171:0x0609, B:173:0x0613, B:174:0x0628, B:176:0x0632, B:177:0x0639, B:179:0x0641, B:180:0x0656, B:182:0x065e, B:185:0x0677, B:187:0x0681, B:188:0x0696, B:190:0x06a0, B:194:0x06de, B:197:0x06e8, B:201:0x06f2, B:203:0x06f8, B:209:0x0706, B:221:0x0716, B:222:0x0721), top: B:9:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0768 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0714  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        boolean e;
        zr0 zr0Var;
        zr0 zr0Var2;
        String str;
        String str2;
        String str3;
        Object H;
        String str4;
        boolean c0;
        boolean g0;
        boolean z;
        boolean z2;
        yr0 yr0Var;
        boolean z3;
        boolean z4;
        boolean g02;
        boolean g03;
        boolean c02;
        boolean c03;
        boolean c04;
        boolean c05;
        boolean c06;
        boolean c07;
        boolean c08;
        boolean c09;
        String str5;
        boolean c010;
        String str6;
        boolean c011;
        String str7;
        boolean c012;
        String str8;
        boolean c013;
        String str9;
        boolean c014;
        String str10;
        boolean c015;
        String str11;
        boolean c016;
        String str12;
        boolean c017;
        String str13;
        boolean c018;
        String str14;
        boolean c019;
        String str15;
        boolean c020;
        String str16;
        boolean c021;
        String str17;
        boolean c022;
        String str18;
        boolean c023;
        StringBuilder sb;
        boolean c024;
        String str19;
        boolean c025;
        boolean c026;
        boolean c027;
        boolean c028;
        boolean c029;
        String str20;
        boolean c030;
        boolean c031;
        boolean c032;
        boolean c033;
        boolean c034;
        String str21;
        boolean c035;
        boolean c036;
        boolean c037;
        boolean c038;
        String str22;
        boolean c039;
        boolean c040;
        String str23;
        boolean c041;
        String x0;
        String x02;
        String x03;
        String x04;
        boolean g04;
        String x05;
        String x06;
        String x07;
        boolean g05;
        String x08;
        boolean g06;
        String x09;
        boolean g07;
        String x010;
        boolean g08;
        String x011;
        boolean g09;
        String x012;
        boolean g010;
        String x013;
        boolean g011;
        String x014;
        String x015;
        String x016;
        String x017;
        String x018;
        String x019;
        String x020;
        String x021;
        String x022;
        String x023;
        String x024;
        String x025;
        String x026;
        String x027;
        String x028;
        String x029;
        String x030;
        String x031;
        String x032;
        boolean c042;
        String str24;
        boolean c043;
        String x033;
        String str25 = "CHECK_GAMEPAD_MODE_EXISTS:";
        String str26 = "CHECK_GAMEPAD_MODE:";
        String str27 = "CHECK_CAPTIVE:";
        String str28 = "CHECK_GUARDIAN:";
        String str29 = "CHECK_SIM_HANDS_EXISTS:";
        String str30 = "CHECK_DT_PASSTHROUGH_EXISTS:";
        String str31 = "CHECK_MULTIMODAL_EXISTS:";
        String str32 = "CHECK_NO_CONTROLLER_EXISTS:";
        String str33 = "CHECK_INF_PANELS_EXISTS:";
        String str34 = "CHECK_PANEL_SCALE_EXISTS:";
        String str35 = "CHECK_FOG_EXISTS:";
        String str36 = "CHECK_TELEPORT_EXISTS:";
        String str37 = "CHECK_TRANS_DBG_EXISTS:";
        String str38 = "CHECK_TRANS_EXISTS:";
        String str39 = "CHECK_UI_STATE_V1:";
        String str40 = "CHECK_UI_STATE_V0:";
        String str41 = "CHECK_CUST_LED:";
        String str42 = "CHECK_ADB_PORT:";
        String str43 = "CHECK_RGB:";
        String str44 = "CHECK_CPU_GOV:";
        String str45 = "CHECK_DT_PASSTHROUGH:";
        String str46 = "CHECK_META_BACKDOOR:";
        int i = this.e;
        String str47 = "CHECK_LINK_FIX:";
        String str48 = "CHECK_CHARGE_LIMIT:";
        String str49 = "CHECK_FAN_OVERRIDE:";
        try {
            if (i == 0) {
                p10.Q(obj);
                e = as0.a.e();
                if (!e) {
                    Log.d("StatusChecks", "loadAllToggleStates: refresh already in flight, skipping");
                    return null;
                }
                zr0Var = new zr0();
                try {
                    zj0 zj0Var = zj0.a;
                    String str50 = "pgrep -f rgb_led.sh             >/dev/null 2>&1 && echo \"CHECK_RGB:1\"            || echo \"CHECK_RGB:0\"\npgrep -f custom_led.sh          >/dev/null 2>&1 && echo \"CHECK_CUST_LED:1\"        || echo \"CHECK_CUST_LED:0\"\npgrep -f power_led.sh           >/dev/null 2>&1 && echo \"CHECK_POWER_LED:1\"       || echo \"CHECK_POWER_LED:0\"\npgrep -f min_freq_lock.sh >/dev/null 2>&1 && echo \"CHECK_CPU_LOCK:1\"       || echo \"CHECK_CPU_LOCK:0\"\npgrep -f gpu_min_freq_lock.sh >/dev/null 2>&1 && echo \"CHECK_GPU_LOCK:1\"     || echo \"CHECK_GPU_LOCK:0\"\npgrep -f gpu_max_freq_lock.sh >/dev/null 2>&1 && echo \"CHECK_GPU_MAX_LOCK:1\" || echo \"CHECK_GPU_MAX_LOCK:0\"\npgrep -f usb_interceptor.sh     >/dev/null 2>&1 && echo \"CHECK_USB_INTERCEPT:1\"  || echo \"CHECK_USB_INTERCEPT:0\"\n[ \"$(settings get global ota_update_server_url 2>/dev/null)\" = \"http://127.0.0.1/\" ] && echo \"CHECK_SYS_OTA:1\" || echo \"CHECK_SYS_OTA:0\"\npgrep -f frida-server           >/dev/null 2>&1 && echo \"CHECK_FRIDA:1\"          || echo \"CHECK_FRIDA:0\"\npgrep -f fan_override.sh >/dev/null 2>&1 && echo \"CHECK_FAN_OVERRIDE:1\" || echo \"CHECK_FAN_OVERRIDE:0\"\npgrep -f charge_limit.sh >/dev/null 2>&1 && echo \"CHECK_CHARGE_LIMIT:1\" || echo \"CHECK_CHARGE_LIMIT:0\"\npgrep -f hide_mc2.sh                >/dev/null 2>&1 && echo \"CHECK_LINK_FIX:1\"          || echo \"CHECK_LINK_FIX:0\"\necho \"CHECK_META_BACKDOOR:$(dumpsys package com.oculus.companion.server 2>/dev/null | awk '/disabledComponents:/{f=1;next} f && /^[[:space:]]+com\\.oculus\\.companion\\.server/ {print;next} f{exit}' | grep -c -E 'DisabledDeviceJobService|RemoteWipeJobService|WipeReceiver')\"\necho \"CHECK_DT_PASSTHROUGH:$(cmd sensorservice get-uid-state com.oculus.vrshell 2>/dev/null | tail -n1)\"\necho \"CHECK_CPU_GOV:$(cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor 2>/dev/null || echo N/A)\"\necho \"CHECK_ADB_PORT:$(getprop service.adb.tcp.port 2>/dev/null || echo -1)\"\necho \"CHECK_UI_STATE_V0:$(oculuspreferences --getc debug_navigator_state 2>/dev/null)\"\necho \"CHECK_UI_STATE_V1:$(oculuspreferences --getc debug_navigator_state_v1 2>/dev/null)\"\necho \"CHECK_UI_BOOT_CFG:$(cat /sdcard/boot_config.json 2>/dev/null)\"\necho \"CHECK_TRANS_EXISTS:$(oculuspreferences --getc shell_immersive_transitions_enabled 2>&1 | grep -q OTHERS_FAILED && echo 0 || echo 1)\"; echo \"CHECK_TRANS:$(oculuspreferences --getc shell_immersive_transitions_enabled 2>/dev/null)\"\necho \"CHECK_TRANS_DBG_EXISTS:$(oculuspreferences --getc debug_disable_shell_transition_animations 2>&1 | grep -q OTHERS_FAILED && echo 0 || echo 1)\"; echo \"CHECK_TRANS_DBG:$(oculuspreferences --getc debug_disable_shell_transition_animations 2>/dev/null)\"\necho \"CHECK_TELEPORT_EXISTS:$(oculuspreferences --getc shell_teleport_anywhere 2>&1 | grep -q OTHERS_FAILED && echo 0 || echo 1)\"; echo \"CHECK_TELEPORT:$(oculuspreferences --getc shell_teleport_anywhere 2>/dev/null)\"\necho \"CHECK_FOG_EXISTS:$(oculuspreferences --getc navigator_background_disabled 2>&1 | grep -q OTHERS_FAILED && echo 0 || echo 1)\"; echo \"CHECK_FOG:$(oculuspreferences --getc navigator_background_disabled 2>/dev/null)\"\necho \"CHECK_PANEL_SCALE_EXISTS:$(oculuspreferences --getc panel_scaling 2>&1 | grep -q OTHERS_FAILED && echo 0 || echo 1)\"; echo \"CHECK_PANEL_SCALE:$(oculuspreferences --getc panel_scaling 2>/dev/null)\"\necho \"CHECK_INF_PANELS_EXISTS:$(oculuspreferences --getc debug_infinite_spatial_panels_enabled 2>&1 | grep -q OTHERS_FAILED && echo 0 || echo 1)\"; echo \"CHECK_INF_PANELS:$(oculuspreferences --getc debug_infinite_spatial_panels_enabled 2>/dev/null)\"\necho \"CHECK_NO_CONTROLLER_EXISTS:$(oculuspreferences --getc vrshell_skip_launchcheck_requires_controllers_enabled 2>&1 | grep -q OTHERS_FAILED && echo 0 || echo 1)\"; echo \"CHECK_NO_CONTROLLER:$(oculuspreferences --getc vrshell_skip_launchcheck_requires_controllers_enabled 2>/dev/null)\"\necho \"CHECK_MULTIMODAL_EXISTS:$(oculuspreferences --getc multimodal_hands_and_controllers_enabled 2>&1 | grep -q OTHERS_FAILED && echo 0 || echo 1)\"\necho \"CHECK_DT_PASSTHROUGH_EXISTS:$(oculuspreferences --getc passthrough_on_demand_enabled 2>&1 | grep -q OTHERS_FAILED && echo 0 || echo 1)\"\necho \"CHECK_SIM_HANDS_EXISTS:$(oculuspreferences --getc simultaneous_hands_and_controllers_mode 2>&1 | grep -q OTHERS_FAILED && echo 0 || echo 1)\"; echo \"CHECK_SIM_HANDS:$(oculuspreferences --getc simultaneous_hands_and_controllers_mode 2>/dev/null)\"\necho \"CHECK_GUARDIAN:$(getprop debug.oculus.guardian_pause 2>/dev/null || echo 0)\"\necho \"CHECK_CAPTIVE:$(settings get global captive_portal_mode 2>/dev/null || echo 1)\"\necho \"CHECK_GAMEPAD_MODE_EXISTS:$(su --mount-master -c \"grep -q '^oculus_systemshell:emulated_gamepad_shell_enabled,' /data/data/com.oculus.vrshell/files/deviceconfig_cache_v2.txt\" 2>/dev/null && echo 1 || echo 0)\"\necho \"CHECK_GAMEPAD_MODE:$(su --mount-master -c \"grep -q '^oculus_systemshell:emulated_gamepad_shell_enabled,true$' /data/data/com.oculus.vrshell/files/deviceconfig_cache_v2.txt\" 2>/dev/null && echo 1 || echo 0)\"";
                    this.f = zr0Var;
                    this.e = 1;
                    try {
                        nq nqVar = nr.a;
                        zr0Var2 = zr0Var;
                    } catch (Exception e2) {
                        e = e2;
                        zr0Var2 = zr0Var;
                    }
                    try {
                        str2 = "StatusChecks";
                        str3 = "CHECK_FRIDA:";
                    } catch (Exception e3) {
                        e = e3;
                        str = "StatusChecks";
                        zr0Var = zr0Var2;
                        Log.e(str, "loadAllToggleStates failed", e);
                        return zr0Var;
                    }
                    try {
                        H = p01.H(hq.d, new qe(str50, (hm) null, 12), this);
                        vn vnVar = vn.d;
                        if (H == vnVar) {
                            return vnVar;
                        }
                        zr0Var = zr0Var2;
                    } catch (Exception e4) {
                        e = e4;
                        str = str2;
                        zr0Var = zr0Var2;
                        Log.e(str, "loadAllToggleStates failed", e);
                        return zr0Var;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str = "StatusChecks";
                    Log.e(str, "loadAllToggleStates failed", e);
                    return zr0Var;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zr0Var = (zr0) this.f;
                try {
                    p10.Q(obj);
                    H = obj;
                    str2 = "StatusChecks";
                    str3 = "CHECK_FRIDA:";
                } catch (Exception e6) {
                    e = e6;
                    str = "StatusChecks";
                    Log.e(str, "loadAllToggleStates failed", e);
                    return zr0Var;
                }
            }
            try {
                str4 = (String) H;
            } catch (Exception e7) {
                e = e7;
                str = str2;
            }
            if (!ds0.n0(str4)) {
                c0 = ks0.c0(str4, "Execution failed", false);
                if (!c0) {
                    g0 = ds0.g0(str4, "CHECK_", false);
                    if (g0) {
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = ds0.q0(str4).iterator();
                        boolean z5 = false;
                        while (true) {
                            f50 f50Var = (f50) it;
                            if (!f50Var.hasNext()) {
                                break;
                            }
                            String str51 = (String) f50Var.next();
                            c042 = ks0.c0(str51, "CHECK_UI_BOOT_CFG:", false);
                            if (c042) {
                                x033 = ds0.x0(str51, "CHECK_UI_BOOT_CFG:", str51);
                                sb2.append(x033);
                                str24 = str4;
                                z5 = true;
                            } else {
                                if (z5) {
                                    c043 = ks0.c0(str51, "CHECK_", false);
                                    if (c043) {
                                        str24 = str4;
                                        z5 = false;
                                    }
                                }
                                if (z5) {
                                    str24 = str4;
                                    sb2.append("\n");
                                    sb2.append(str51);
                                } else {
                                    str24 = str4;
                                }
                            }
                            str4 = str24;
                        }
                        Iterator it2 = ds0.q0(str4).iterator();
                        str = "";
                        String str52 = "";
                        while (true) {
                            f50 f50Var2 = (f50) it2;
                            if (!f50Var2.hasNext()) {
                                break;
                            }
                            String str53 = (String) f50Var2.next();
                            c02 = ks0.c0(str53, str43, false);
                            Iterator it3 = it2;
                            if (c02) {
                                x032 = ds0.x0(str53, str43, str53);
                                zr0Var.a = q10.b(ds0.E0(x032).toString(), "1");
                            } else {
                                c03 = ks0.c0(str53, str41, false);
                                if (c03) {
                                    x031 = ds0.x0(str53, str41, str53);
                                    zr0Var.b = q10.b(ds0.E0(x031).toString(), "1");
                                } else {
                                    c04 = ks0.c0(str53, "CHECK_POWER_LED:", false);
                                    if (c04) {
                                        x030 = ds0.x0(str53, "CHECK_POWER_LED:", str53);
                                        zr0Var.c = q10.b(ds0.E0(x030).toString(), "1");
                                    } else {
                                        c05 = ks0.c0(str53, "CHECK_CPU_LOCK:", false);
                                        if (c05) {
                                            x029 = ds0.x0(str53, "CHECK_CPU_LOCK:", str53);
                                            zr0Var.d = q10.b(ds0.E0(x029).toString(), "1");
                                        } else {
                                            c06 = ks0.c0(str53, "CHECK_GPU_LOCK:", false);
                                            if (c06) {
                                                x028 = ds0.x0(str53, "CHECK_GPU_LOCK:", str53);
                                                zr0Var.e = q10.b(ds0.E0(x028).toString(), "1");
                                            } else {
                                                c07 = ks0.c0(str53, "CHECK_GPU_MAX_LOCK:", false);
                                                if (c07) {
                                                    x027 = ds0.x0(str53, "CHECK_GPU_MAX_LOCK:", str53);
                                                    zr0Var.f = q10.b(ds0.E0(x027).toString(), "1");
                                                } else {
                                                    c08 = ks0.c0(str53, "CHECK_USB_INTERCEPT:", false);
                                                    if (c08) {
                                                        x026 = ds0.x0(str53, "CHECK_USB_INTERCEPT:", str53);
                                                        zr0Var.g = q10.b(ds0.E0(x026).toString(), "1");
                                                    } else {
                                                        c09 = ks0.c0(str53, "CHECK_SYS_OTA:", false);
                                                        if (c09) {
                                                            x025 = ds0.x0(str53, "CHECK_SYS_OTA:", str53);
                                                            zr0Var.h = q10.b(ds0.E0(x025).toString(), "1");
                                                        } else {
                                                            str5 = str3;
                                                            c010 = ks0.c0(str53, str5, false);
                                                            if (c010) {
                                                                x024 = ds0.x0(str53, str5, str53);
                                                                zr0Var.D = q10.b(ds0.E0(x024).toString(), "1");
                                                                str22 = str27;
                                                                str19 = str36;
                                                                str18 = str37;
                                                                str16 = str38;
                                                                str15 = str39;
                                                                str14 = str40;
                                                                str13 = str42;
                                                                str12 = str44;
                                                                str11 = str45;
                                                                str10 = str46;
                                                                str9 = str47;
                                                                str8 = str48;
                                                                str7 = str49;
                                                                str6 = str41;
                                                            } else {
                                                                String str54 = str49;
                                                                str6 = str41;
                                                                c011 = ks0.c0(str53, str54, false);
                                                                if (c011) {
                                                                    x023 = ds0.x0(str53, str54, str53);
                                                                    zr0Var.E = q10.b(ds0.E0(x023).toString(), "1");
                                                                    str22 = str27;
                                                                    str19 = str36;
                                                                    str18 = str37;
                                                                    str16 = str38;
                                                                    str15 = str39;
                                                                    str14 = str40;
                                                                    str13 = str42;
                                                                    str12 = str44;
                                                                    str11 = str45;
                                                                    str10 = str46;
                                                                    str9 = str47;
                                                                    str8 = str48;
                                                                    str7 = str54;
                                                                } else {
                                                                    String str55 = str48;
                                                                    str7 = str54;
                                                                    c012 = ks0.c0(str53, str55, false);
                                                                    if (c012) {
                                                                        x022 = ds0.x0(str53, str55, str53);
                                                                        zr0Var.G = q10.b(ds0.E0(x022).toString(), "1");
                                                                        str22 = str27;
                                                                        str19 = str36;
                                                                        str18 = str37;
                                                                        str16 = str38;
                                                                        str15 = str39;
                                                                        str14 = str40;
                                                                        str13 = str42;
                                                                        str12 = str44;
                                                                        str11 = str45;
                                                                        str10 = str46;
                                                                        str9 = str47;
                                                                        str8 = str55;
                                                                    } else {
                                                                        String str56 = str47;
                                                                        str8 = str55;
                                                                        c013 = ks0.c0(str53, str56, false);
                                                                        if (c013) {
                                                                            x021 = ds0.x0(str53, str56, str53);
                                                                            zr0Var.I = q10.b(ds0.E0(x021).toString(), "1");
                                                                            str22 = str27;
                                                                            str19 = str36;
                                                                            str18 = str37;
                                                                            str16 = str38;
                                                                            str15 = str39;
                                                                            str14 = str40;
                                                                            str13 = str42;
                                                                            str12 = str44;
                                                                            str11 = str45;
                                                                            str10 = str46;
                                                                            str9 = str56;
                                                                        } else {
                                                                            String str57 = str46;
                                                                            str9 = str56;
                                                                            c014 = ks0.c0(str53, str57, false);
                                                                            if (c014) {
                                                                                x020 = ds0.x0(str53, str57, str53);
                                                                                Integer e0 = ks0.e0(ds0.E0(x020).toString());
                                                                                zr0Var.F = (e0 != null ? e0.intValue() : 0) >= 1;
                                                                                str22 = str27;
                                                                                str19 = str36;
                                                                                str18 = str37;
                                                                                str16 = str38;
                                                                                str15 = str39;
                                                                                str14 = str40;
                                                                                str13 = str42;
                                                                                str12 = str44;
                                                                                str11 = str45;
                                                                                str10 = str57;
                                                                            } else {
                                                                                String str58 = str45;
                                                                                str10 = str57;
                                                                                c015 = ks0.c0(str53, str58, false);
                                                                                if (c015) {
                                                                                    x019 = ds0.x0(str53, str58, str53);
                                                                                    zr0Var.H = q10.b(ds0.E0(x019).toString(), "active");
                                                                                    str22 = str27;
                                                                                    str19 = str36;
                                                                                    str18 = str37;
                                                                                    str16 = str38;
                                                                                    str15 = str39;
                                                                                    str14 = str40;
                                                                                    str13 = str42;
                                                                                    str12 = str44;
                                                                                    str11 = str58;
                                                                                } else {
                                                                                    String str59 = str44;
                                                                                    str11 = str58;
                                                                                    c016 = ks0.c0(str53, str59, false);
                                                                                    if (c016) {
                                                                                        x018 = ds0.x0(str53, str59, str53);
                                                                                        zr0Var.i = q10.b(ds0.E0(x018).toString(), "performance");
                                                                                        str22 = str27;
                                                                                        str19 = str36;
                                                                                        str18 = str37;
                                                                                        str16 = str38;
                                                                                        str15 = str39;
                                                                                        str14 = str40;
                                                                                        str13 = str42;
                                                                                        str12 = str59;
                                                                                    } else {
                                                                                        String str60 = str42;
                                                                                        str12 = str59;
                                                                                        c017 = ks0.c0(str53, str60, false);
                                                                                        if (c017) {
                                                                                            x017 = ds0.x0(str53, str60, str53);
                                                                                            zr0Var.j = q10.b(ds0.E0(x017).toString(), "5555");
                                                                                            str22 = str27;
                                                                                            str19 = str36;
                                                                                            str18 = str37;
                                                                                            str16 = str38;
                                                                                            str15 = str39;
                                                                                            str14 = str40;
                                                                                            str13 = str60;
                                                                                        } else {
                                                                                            String str61 = str40;
                                                                                            str13 = str60;
                                                                                            c018 = ks0.c0(str53, str61, false);
                                                                                            if (c018) {
                                                                                                x016 = ds0.x0(str53, str61, str53);
                                                                                                str = x016;
                                                                                                str22 = str27;
                                                                                                str19 = str36;
                                                                                                str18 = str37;
                                                                                                str16 = str38;
                                                                                                str15 = str39;
                                                                                                str14 = str61;
                                                                                            } else {
                                                                                                String str62 = str39;
                                                                                                str14 = str61;
                                                                                                c019 = ks0.c0(str53, str62, false);
                                                                                                if (c019) {
                                                                                                    x015 = ds0.x0(str53, str62, str53);
                                                                                                    str52 = x015;
                                                                                                    str22 = str27;
                                                                                                    str19 = str36;
                                                                                                    str18 = str37;
                                                                                                    str16 = str38;
                                                                                                    str15 = str62;
                                                                                                } else {
                                                                                                    String str63 = str38;
                                                                                                    str15 = str62;
                                                                                                    c020 = ks0.c0(str53, str63, false);
                                                                                                    if (c020) {
                                                                                                        x014 = ds0.x0(str53, str63, str53);
                                                                                                        zr0Var.u = q10.b(ds0.E0(x014).toString(), "1");
                                                                                                        str16 = str63;
                                                                                                    } else {
                                                                                                        str16 = str63;
                                                                                                        c021 = ks0.c0(str53, "CHECK_TRANS:", false);
                                                                                                        if (c021) {
                                                                                                            g011 = ds0.g0(str53, ": false", false);
                                                                                                            zr0Var.m = g011;
                                                                                                        } else {
                                                                                                            String str64 = str37;
                                                                                                            str17 = str43;
                                                                                                            c022 = ks0.c0(str53, str64, false);
                                                                                                            if (c022) {
                                                                                                                x013 = ds0.x0(str53, str64, str53);
                                                                                                                zr0Var.v = q10.b(ds0.E0(x013).toString(), "1");
                                                                                                                str18 = str64;
                                                                                                            } else {
                                                                                                                str18 = str64;
                                                                                                                c023 = ks0.c0(str53, "CHECK_TRANS_DBG:", false);
                                                                                                                if (!c023) {
                                                                                                                    String str65 = str36;
                                                                                                                    sb = sb2;
                                                                                                                    c024 = ks0.c0(str53, str65, false);
                                                                                                                    if (c024) {
                                                                                                                        x012 = ds0.x0(str53, str65, str53);
                                                                                                                        zr0Var.w = q10.b(ds0.E0(x012).toString(), "1");
                                                                                                                        str19 = str65;
                                                                                                                    } else {
                                                                                                                        str19 = str65;
                                                                                                                        c025 = ks0.c0(str53, "CHECK_TELEPORT:", false);
                                                                                                                        if (c025) {
                                                                                                                            g09 = ds0.g0(str53, ": true", false);
                                                                                                                            zr0Var.n = g09;
                                                                                                                        } else {
                                                                                                                            String str66 = str35;
                                                                                                                            c026 = ks0.c0(str53, str66, false);
                                                                                                                            if (c026) {
                                                                                                                                x011 = ds0.x0(str53, str66, str53);
                                                                                                                                zr0Var.x = q10.b(ds0.E0(x011).toString(), "1");
                                                                                                                                str35 = str66;
                                                                                                                            } else {
                                                                                                                                str35 = str66;
                                                                                                                                c027 = ks0.c0(str53, "CHECK_FOG:", false);
                                                                                                                                if (c027) {
                                                                                                                                    g08 = ds0.g0(str53, ": false", false);
                                                                                                                                    zr0Var.o = g08;
                                                                                                                                } else {
                                                                                                                                    String str67 = str34;
                                                                                                                                    c028 = ks0.c0(str53, str67, false);
                                                                                                                                    if (c028) {
                                                                                                                                        x010 = ds0.x0(str53, str67, str53);
                                                                                                                                        zr0Var.y = q10.b(ds0.E0(x010).toString(), "1");
                                                                                                                                    } else {
                                                                                                                                        c029 = ks0.c0(str53, "CHECK_PANEL_SCALE:", false);
                                                                                                                                        if (c029) {
                                                                                                                                            g07 = ds0.g0(str53, ": true", false);
                                                                                                                                            zr0Var.p = g07;
                                                                                                                                        } else {
                                                                                                                                            str20 = str33;
                                                                                                                                            c030 = ks0.c0(str53, str20, false);
                                                                                                                                            if (c030) {
                                                                                                                                                x09 = ds0.x0(str53, str20, str53);
                                                                                                                                                zr0Var.z = q10.b(ds0.E0(x09).toString(), "1");
                                                                                                                                                str34 = str67;
                                                                                                                                            } else {
                                                                                                                                                str34 = str67;
                                                                                                                                                c031 = ks0.c0(str53, "CHECK_INF_PANELS:", false);
                                                                                                                                                if (c031) {
                                                                                                                                                    g06 = ds0.g0(str53, ": true", false);
                                                                                                                                                    zr0Var.q = g06;
                                                                                                                                                } else {
                                                                                                                                                    String str68 = str32;
                                                                                                                                                    c032 = ks0.c0(str53, str68, false);
                                                                                                                                                    if (c032) {
                                                                                                                                                        x08 = ds0.x0(str53, str68, str53);
                                                                                                                                                        zr0Var.A = q10.b(ds0.E0(x08).toString(), "1");
                                                                                                                                                        str32 = str68;
                                                                                                                                                    } else {
                                                                                                                                                        str32 = str68;
                                                                                                                                                        c033 = ks0.c0(str53, "CHECK_NO_CONTROLLER:", false);
                                                                                                                                                        if (c033) {
                                                                                                                                                            g05 = ds0.g0(str53, ": true", false);
                                                                                                                                                            zr0Var.r = g05;
                                                                                                                                                        } else {
                                                                                                                                                            String str69 = str31;
                                                                                                                                                            c034 = ks0.c0(str53, str69, false);
                                                                                                                                                            if (c034) {
                                                                                                                                                                x07 = ds0.x0(str53, str69, str53);
                                                                                                                                                                zr0Var.B = q10.b(ds0.E0(x07).toString(), "1");
                                                                                                                                                                str31 = str69;
                                                                                                                                                            } else {
                                                                                                                                                                str21 = str30;
                                                                                                                                                                c035 = ks0.c0(str53, str21, false);
                                                                                                                                                                if (c035) {
                                                                                                                                                                    x06 = ds0.x0(str53, str21, str53);
                                                                                                                                                                    zr0Var.C = q10.b(ds0.E0(x06).toString(), "1");
                                                                                                                                                                    str31 = str69;
                                                                                                                                                                } else {
                                                                                                                                                                    str31 = str69;
                                                                                                                                                                    String str70 = str29;
                                                                                                                                                                    c036 = ks0.c0(str53, str70, false);
                                                                                                                                                                    if (c036) {
                                                                                                                                                                        x05 = ds0.x0(str53, str70, str53);
                                                                                                                                                                        zr0Var.t = q10.b(ds0.E0(x05).toString(), "1");
                                                                                                                                                                        str29 = str70;
                                                                                                                                                                    } else {
                                                                                                                                                                        str29 = str70;
                                                                                                                                                                        c037 = ks0.c0(str53, "CHECK_SIM_HANDS:", false);
                                                                                                                                                                        if (c037) {
                                                                                                                                                                            g04 = ds0.g0(str53, ": 1", false);
                                                                                                                                                                            zr0Var.s = g04;
                                                                                                                                                                        } else {
                                                                                                                                                                            String str71 = str28;
                                                                                                                                                                            c038 = ks0.c0(str53, str71, false);
                                                                                                                                                                            if (c038) {
                                                                                                                                                                                x04 = ds0.x0(str53, str71, str53);
                                                                                                                                                                                zr0Var.J = q10.b(ds0.E0(x04).toString(), "1");
                                                                                                                                                                                str28 = str71;
                                                                                                                                                                            } else {
                                                                                                                                                                                str22 = str27;
                                                                                                                                                                                c039 = ks0.c0(str53, str22, false);
                                                                                                                                                                                if (c039) {
                                                                                                                                                                                    x03 = ds0.x0(str53, str22, str53);
                                                                                                                                                                                    zr0Var.K = q10.b(ds0.E0(x03).toString(), "0");
                                                                                                                                                                                    str28 = str71;
                                                                                                                                                                                } else {
                                                                                                                                                                                    str28 = str71;
                                                                                                                                                                                    String str72 = str26;
                                                                                                                                                                                    c040 = ks0.c0(str53, str72, false);
                                                                                                                                                                                    if (c040) {
                                                                                                                                                                                        x02 = ds0.x0(str53, str72, str53);
                                                                                                                                                                                        zr0Var.L = q10.b(ds0.E0(x02).toString(), "1");
                                                                                                                                                                                        str26 = str72;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        str26 = str72;
                                                                                                                                                                                        str23 = str25;
                                                                                                                                                                                        c041 = ks0.c0(str53, str23, false);
                                                                                                                                                                                        if (c041) {
                                                                                                                                                                                            x0 = ds0.x0(str53, str23, str53);
                                                                                                                                                                                            zr0Var.M = q10.b(ds0.E0(x0).toString(), "1");
                                                                                                                                                                                        }
                                                                                                                                                                                        it2 = it3;
                                                                                                                                                                                        str25 = str23;
                                                                                                                                                                                        str30 = str21;
                                                                                                                                                                                        str33 = str20;
                                                                                                                                                                                        str27 = str22;
                                                                                                                                                                                        sb2 = sb;
                                                                                                                                                                                        str43 = str17;
                                                                                                                                                                                        str41 = str6;
                                                                                                                                                                                        str37 = str18;
                                                                                                                                                                                        str36 = str19;
                                                                                                                                                                                        str3 = str5;
                                                                                                                                                                                        str49 = str7;
                                                                                                                                                                                        str48 = str8;
                                                                                                                                                                                        str47 = str9;
                                                                                                                                                                                        str46 = str10;
                                                                                                                                                                                        str45 = str11;
                                                                                                                                                                                        str44 = str12;
                                                                                                                                                                                        str42 = str13;
                                                                                                                                                                                        str40 = str14;
                                                                                                                                                                                        str39 = str15;
                                                                                                                                                                                        str38 = str16;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                str23 = str25;
                                                                                                                                                                                it2 = it3;
                                                                                                                                                                                str25 = str23;
                                                                                                                                                                                str30 = str21;
                                                                                                                                                                                str33 = str20;
                                                                                                                                                                                str27 = str22;
                                                                                                                                                                                sb2 = sb;
                                                                                                                                                                                str43 = str17;
                                                                                                                                                                                str41 = str6;
                                                                                                                                                                                str37 = str18;
                                                                                                                                                                                str36 = str19;
                                                                                                                                                                                str3 = str5;
                                                                                                                                                                                str49 = str7;
                                                                                                                                                                                str48 = str8;
                                                                                                                                                                                str47 = str9;
                                                                                                                                                                                str46 = str10;
                                                                                                                                                                                str45 = str11;
                                                                                                                                                                                str44 = str12;
                                                                                                                                                                                str42 = str13;
                                                                                                                                                                                str40 = str14;
                                                                                                                                                                                str39 = str15;
                                                                                                                                                                                str38 = str16;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                str23 = str25;
                                                                                                                                                                str22 = str27;
                                                                                                                                                                it2 = it3;
                                                                                                                                                                str25 = str23;
                                                                                                                                                                str30 = str21;
                                                                                                                                                                str33 = str20;
                                                                                                                                                                str27 = str22;
                                                                                                                                                                sb2 = sb;
                                                                                                                                                                str43 = str17;
                                                                                                                                                                str41 = str6;
                                                                                                                                                                str37 = str18;
                                                                                                                                                                str36 = str19;
                                                                                                                                                                str3 = str5;
                                                                                                                                                                str49 = str7;
                                                                                                                                                                str48 = str8;
                                                                                                                                                                str47 = str9;
                                                                                                                                                                str46 = str10;
                                                                                                                                                                str45 = str11;
                                                                                                                                                                str44 = str12;
                                                                                                                                                                str42 = str13;
                                                                                                                                                                str40 = str14;
                                                                                                                                                                str39 = str15;
                                                                                                                                                                str38 = str16;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            str23 = str25;
                                                                                                                                            str22 = str27;
                                                                                                                                            str21 = str30;
                                                                                                                                            it2 = it3;
                                                                                                                                            str25 = str23;
                                                                                                                                            str30 = str21;
                                                                                                                                            str33 = str20;
                                                                                                                                            str27 = str22;
                                                                                                                                            sb2 = sb;
                                                                                                                                            str43 = str17;
                                                                                                                                            str41 = str6;
                                                                                                                                            str37 = str18;
                                                                                                                                            str36 = str19;
                                                                                                                                            str3 = str5;
                                                                                                                                            str49 = str7;
                                                                                                                                            str48 = str8;
                                                                                                                                            str47 = str9;
                                                                                                                                            str46 = str10;
                                                                                                                                            str45 = str11;
                                                                                                                                            str44 = str12;
                                                                                                                                            str42 = str13;
                                                                                                                                            str40 = str14;
                                                                                                                                            str39 = str15;
                                                                                                                                            str38 = str16;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    str34 = str67;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    str23 = str25;
                                                                                                                    str22 = str27;
                                                                                                                    str21 = str30;
                                                                                                                    str20 = str33;
                                                                                                                    it2 = it3;
                                                                                                                    str25 = str23;
                                                                                                                    str30 = str21;
                                                                                                                    str33 = str20;
                                                                                                                    str27 = str22;
                                                                                                                    sb2 = sb;
                                                                                                                    str43 = str17;
                                                                                                                    str41 = str6;
                                                                                                                    str37 = str18;
                                                                                                                    str36 = str19;
                                                                                                                    str3 = str5;
                                                                                                                    str49 = str7;
                                                                                                                    str48 = str8;
                                                                                                                    str47 = str9;
                                                                                                                    str46 = str10;
                                                                                                                    str45 = str11;
                                                                                                                    str44 = str12;
                                                                                                                    str42 = str13;
                                                                                                                    str40 = str14;
                                                                                                                    str39 = str15;
                                                                                                                    str38 = str16;
                                                                                                                } else if (zr0Var.v) {
                                                                                                                    g010 = ds0.g0(str53, ": true", false);
                                                                                                                    zr0Var.m = g010;
                                                                                                                }
                                                                                                            }
                                                                                                            str23 = str25;
                                                                                                            str22 = str27;
                                                                                                            str21 = str30;
                                                                                                            str19 = str36;
                                                                                                            sb = sb2;
                                                                                                            str20 = str33;
                                                                                                            it2 = it3;
                                                                                                            str25 = str23;
                                                                                                            str30 = str21;
                                                                                                            str33 = str20;
                                                                                                            str27 = str22;
                                                                                                            sb2 = sb;
                                                                                                            str43 = str17;
                                                                                                            str41 = str6;
                                                                                                            str37 = str18;
                                                                                                            str36 = str19;
                                                                                                            str3 = str5;
                                                                                                            str49 = str7;
                                                                                                            str48 = str8;
                                                                                                            str47 = str9;
                                                                                                            str46 = str10;
                                                                                                            str45 = str11;
                                                                                                            str44 = str12;
                                                                                                            str42 = str13;
                                                                                                            str40 = str14;
                                                                                                            str39 = str15;
                                                                                                            str38 = str16;
                                                                                                        }
                                                                                                    }
                                                                                                    str23 = str25;
                                                                                                    str22 = str27;
                                                                                                    str19 = str36;
                                                                                                    str18 = str37;
                                                                                                    str17 = str43;
                                                                                                    sb = sb2;
                                                                                                    str21 = str30;
                                                                                                    str20 = str33;
                                                                                                    it2 = it3;
                                                                                                    str25 = str23;
                                                                                                    str30 = str21;
                                                                                                    str33 = str20;
                                                                                                    str27 = str22;
                                                                                                    sb2 = sb;
                                                                                                    str43 = str17;
                                                                                                    str41 = str6;
                                                                                                    str37 = str18;
                                                                                                    str36 = str19;
                                                                                                    str3 = str5;
                                                                                                    str49 = str7;
                                                                                                    str48 = str8;
                                                                                                    str47 = str9;
                                                                                                    str46 = str10;
                                                                                                    str45 = str11;
                                                                                                    str44 = str12;
                                                                                                    str42 = str13;
                                                                                                    str40 = str14;
                                                                                                    str39 = str15;
                                                                                                    str38 = str16;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            str17 = str43;
                                                            sb = sb2;
                                                            str23 = str25;
                                                            str21 = str30;
                                                            str20 = str33;
                                                            it2 = it3;
                                                            str25 = str23;
                                                            str30 = str21;
                                                            str33 = str20;
                                                            str27 = str22;
                                                            sb2 = sb;
                                                            str43 = str17;
                                                            str41 = str6;
                                                            str37 = str18;
                                                            str36 = str19;
                                                            str3 = str5;
                                                            str49 = str7;
                                                            str48 = str8;
                                                            str47 = str9;
                                                            str46 = str10;
                                                            str45 = str11;
                                                            str44 = str12;
                                                            str42 = str13;
                                                            str40 = str14;
                                                            str39 = str15;
                                                            str38 = str16;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            str22 = str27;
                            str19 = str36;
                            str16 = str38;
                            str15 = str39;
                            str14 = str40;
                            str13 = str42;
                            str12 = str44;
                            str11 = str45;
                            str10 = str46;
                            str9 = str47;
                            str8 = str48;
                            str7 = str49;
                            str5 = str3;
                            str6 = str41;
                            sb = sb2;
                            str23 = str25;
                            str20 = str33;
                            str18 = str37;
                            str17 = str43;
                            str21 = str30;
                            it2 = it3;
                            str25 = str23;
                            str30 = str21;
                            str33 = str20;
                            str27 = str22;
                            sb2 = sb;
                            str43 = str17;
                            str41 = str6;
                            str37 = str18;
                            str36 = str19;
                            str3 = str5;
                            str49 = str7;
                            str48 = str8;
                            str47 = str9;
                            str46 = str10;
                            str45 = str11;
                            str44 = str12;
                            str42 = str13;
                            str40 = str14;
                            str39 = str15;
                            str38 = str16;
                        }
                        StringBuilder sb3 = sb2;
                        if (!ds0.n0(str)) {
                            g03 = ds0.g0(str, "OTHERS_FAILED", false);
                            if (!g03) {
                                z = false;
                                if (!ds0.n0(str52)) {
                                    g02 = ds0.g0(str52, "OTHERS_FAILED", false);
                                    if (!g02) {
                                        z2 = false;
                                        yr0Var = yr0.f;
                                        if (!z) {
                                            zr0Var.l = yr0.d;
                                            z3 = ds0.g0(str, ": 1", false);
                                            zr0Var.k = z3 ? 1 : 0;
                                        } else if (z2) {
                                            zr0Var.l = yr0Var;
                                            String obj2 = ds0.E0(sb3.toString()).toString();
                                            if (ds0.n0(obj2)) {
                                                str = str2;
                                                z4 = true;
                                                zr0Var.k = 1;
                                                z3 = true;
                                                if (zr0Var.l == yr0Var && z3 == z4) {
                                                    zj0 zj0Var2 = zj0.a;
                                                    zj0.a("pm enable com.oculus.systemux/com.oculus.common.navigatoritempinningservice.NavigatorItemPinningService");
                                                }
                                                return zr0Var;
                                            }
                                            try {
                                                JSONObject optJSONObject = new JSONObject(obj2).optJSONObject("systemConfiguration");
                                                z3 = optJSONObject != null ? optJSONObject.optBoolean("navigatorEnabled", true) : true;
                                                zr0Var.k = z3 ? 1 : 0;
                                            } catch (Exception e8) {
                                                str = str2;
                                                Log.w(str, "Could not parse boot_config.json", e8);
                                                zr0Var.k = 1;
                                                z3 = true;
                                            }
                                        } else {
                                            zr0Var.l = yr0.e;
                                            z3 = ds0.g0(str52, ": 1", false);
                                            zr0Var.k = z3 ? 1 : 0;
                                        }
                                        str = str2;
                                        z4 = true;
                                        if (zr0Var.l == yr0Var) {
                                            zj0 zj0Var22 = zj0.a;
                                            zj0.a("pm enable com.oculus.systemux/com.oculus.common.navigatoritempinningservice.NavigatorItemPinningService");
                                        }
                                        return zr0Var;
                                    }
                                }
                                z2 = true;
                                yr0Var = yr0.f;
                                if (!z) {
                                }
                                str = str2;
                                z4 = true;
                                if (zr0Var.l == yr0Var) {
                                }
                                return zr0Var;
                            }
                        }
                        z = true;
                        if (!ds0.n0(str52)) {
                        }
                        z2 = true;
                        yr0Var = yr0.f;
                        if (!z) {
                        }
                        str = str2;
                        z4 = true;
                        if (zr0Var.l == yr0Var) {
                        }
                        return zr0Var;
                    }
                }
            }
            as0.a.f(null);
            return null;
        } finally {
            as0.a.f(null);
        }
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = 2;
        switch (this.d) {
            case 0:
                return new y9((SharedPreferences) this.f, hmVar, 0);
            case 1:
                return new y9((b8) this.f, hmVar, 1);
            case 2:
                return new y9((zn) this.f, hmVar, i);
            case 3:
                return new y9((Animatable) this.f, hmVar, 3);
            case 4:
                return new y9(i, hmVar);
            case 5:
                return new y9((rw0) this.f, hmVar, 5);
            default:
                return new y9((File) this.f, hmVar, 6);
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
        return ((y9) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                ((SharedPreferences) this.f).edit().putBoolean("dogfood_pending_step2", true).apply();
                zj0 zj0Var = zj0.a;
                this.e = 1;
                return zj0.c("magisk resetprop ro.build.type userdebug\nstop\nstart", false, this) == vnVar ? vnVar : w01Var;
            case 1:
                int i3 = this.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                zj0 zj0Var2 = zj0.a;
                String d = uo.d("monkey -p ", ((b8) this.f).c, " -c android.intent.category.LAUNCHER 1");
                this.e = 1;
                return zj0.c(d, false, this) == vnVar ? vnVar : w01Var;
            case 2:
                int i4 = this.e;
                if (i4 != 0) {
                    if (i4 == 1) {
                        p10.Q(obj);
                        return obj;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                ro roVar = ro.a;
                zn znVar = (zn) this.f;
                this.e = 1;
                Serializable a = roVar.a(znVar, this);
                return a == vnVar ? vnVar : a;
            case 3:
                int i5 = this.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                Animatable animatable = (Animatable) this.f;
                Float f = new Float(((Number) animatable.getValue()).floatValue() + 360.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(1000, 0, EasingKt.getLinearEasing(), 2, null);
                this.e = 1;
                return Animatable.animateTo$default(animatable, f, tween$default, null, null, this, 12, null) == vnVar ? vnVar : w01Var;
            case 4:
                return e(obj);
            case 5:
                int i6 = this.e;
                if (i6 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    nq nqVar = nr.a;
                    if (p01.H(hq.d, new jf0(true, null), this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i6 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                rw0.a((rw0) this.f, "com.lumi.singularity.START_PERSIST_PROTECT");
                return w01Var;
            default:
                int i7 = this.e;
                if (i7 != 0) {
                    if (i7 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                zj0 zj0Var3 = zj0.a;
                String c = uo.c("chmod +x ", ((File) this.f).getAbsolutePath());
                this.e = 1;
                return zj0.c(c, false, this) == vnVar ? vnVar : w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(int i, hm hmVar) {
        super(i, hmVar);
        this.d = 4;
    }
}
