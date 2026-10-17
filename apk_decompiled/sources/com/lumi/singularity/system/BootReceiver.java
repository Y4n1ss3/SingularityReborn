package com.lumi.singularity.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.lumi.singularity.ui.activities.MainActivity;
import com.scottyab.rootbeer.RootBeer;
import defpackage.d4;
import defpackage.ds0;
import defpackage.e4;
import defpackage.hm;
import defpackage.hq;
import defpackage.hr;
import defpackage.ks0;
import defpackage.ne;
import defpackage.nq;
import defpackage.nr;
import defpackage.oe;
import defpackage.p01;
import defpackage.p10;
import defpackage.pe;
import defpackage.q10;
import defpackage.qe;
import defpackage.re;
import defpackage.rh0;
import defpackage.se;
import defpackage.z9;
import defpackage.zl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BootReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [hm, kn, xn] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [hm, java.lang.String, kn, xn] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [hm, kn, xn] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r7;
        int i;
        int i2;
        ?? r8;
        int i3;
        ?? r72;
        int i4;
        ?? r73;
        int i5;
        int i6;
        ArrayList arrayList;
        context.getClass();
        intent.getClass();
        if (q10.b(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("singularity_prefs", 0);
            boolean z5 = sharedPreferences.getBoolean("root_on_boot", false);
            sharedPreferences.getBoolean("start_on_boot", false);
            boolean z6 = sharedPreferences.getBoolean("blocker_on_boot", false);
            boolean z7 = sharedPreferences.getBoolean("rgb_on_boot", false);
            boolean z8 = sharedPreferences.getBoolean("custom_led_on_boot", false);
            boolean z9 = sharedPreferences.getBoolean("power_led_on_boot", false);
            boolean z10 = sharedPreferences.getBoolean("min_freq_on_boot", false);
            boolean z11 = sharedPreferences.getBoolean("wireless_adb_on_boot", false);
            boolean z12 = sharedPreferences.getBoolean("cycle_wifi_on_boot", false);
            boolean z13 = sharedPreferences.getBoolean("root_blocker_on_boot", false);
            boolean z14 = sharedPreferences.getBoolean("root_blocker_setup", false);
            boolean z15 = sharedPreferences.getBoolean("usb_interceptor_on_boot", false);
            boolean z16 = sharedPreferences.getBoolean("ota_blocker_on_boot", true);
            boolean z17 = sharedPreferences.getBoolean("prox_sensor_disabled", false);
            boolean z18 = sharedPreferences.getBoolean("passthrough_fix_on_boot", false);
            boolean z19 = sharedPreferences.getBoolean("is_unlocked_bootloader", false);
            boolean z20 = sharedPreferences.getBoolean("persist_protect_toggle_enabled", false);
            boolean z21 = sharedPreferences.getBoolean("telemetry_toggle_enabled", false);
            boolean z22 = sharedPreferences.getBoolean("update_engine_toggle_enabled", false);
            boolean z23 = sharedPreferences.getBoolean("meta_backdoor_toggle_enabled", false);
            boolean z24 = sharedPreferences.getBoolean("gpu_min_freq_on_boot", false);
            boolean z25 = sharedPreferences.getBoolean("gpu_max_freq_on_boot", false);
            boolean z26 = sharedPreferences.getBoolean("fan_override_on_boot", false);
            boolean z27 = sharedPreferences.getBoolean("charge_limit_on_boot", false);
            boolean z28 = sharedPreferences.getBoolean("fix_controllers_on_boot", false);
            boolean z29 = sharedPreferences.getBoolean("double_tap_passthrough_enabled", false);
            boolean z30 = sharedPreferences.getBoolean("guardian_disabled", false);
            boolean z31 = sharedPreferences.getBoolean("captive_portal_disabled", false);
            boolean z32 = sharedPreferences.getBoolean("link_fix_on_boot", false);
            nq nqVar = nr.a;
            zl a2 = p10.a(hq.d);
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.addFlags(805306368);
            if (z5) {
                if (new RootBeer(context).isRooted()) {
                    z = z8;
                } else {
                    z = z8;
                    intent2.putExtra("auto_root", true);
                }
                z2 = z9;
                p01.t(a2, null, null, new d4(context, intent2, null, 2), 3);
            } else {
                z = z8;
                z2 = z9;
            }
            if (z) {
                int i7 = sharedPreferences.getInt("led_red", 255);
                int i8 = sharedPreferences.getInt("led_green", 255);
                z3 = z10;
                int i9 = sharedPreferences.getInt("led_blue", 255);
                Intent intent3 = new Intent(context, (Class<?>) TweakService.class);
                z4 = z11;
                intent3.setAction("com.lumi.singularity.START_CUSTOM_LED");
                intent3.putExtra("RED", i7);
                intent3.putExtra("GREEN", i8);
                intent3.putExtra("BLUE", i9);
                context.startService(intent3);
            } else {
                z3 = z10;
                z4 = z11;
                if (z7) {
                    Intent intent4 = new Intent(context, (Class<?>) TweakService.class);
                    intent4.setAction("com.lumi.singularity.START_RGB");
                    context.startService(intent4);
                } else if (z2) {
                    Intent intent5 = new Intent(context, (Class<?>) TweakService.class);
                    intent5.setAction("com.lumi.singularity.START_POWER_LED");
                    context.startService(intent5);
                }
            }
            if (z3) {
                Intent intent6 = new Intent(context, (Class<?>) TweakService.class);
                intent6.setAction("com.lumi.singularity.START_MIN_FREQ");
                context.startService(intent6);
            }
            if (sharedPreferences.getBoolean("max_freq_on_boot", false)) {
                Intent intent7 = new Intent(context, (Class<?>) TweakService.class);
                intent7.setAction("com.lumi.singularity.START_MAX_FREQ");
                context.startService(intent7);
            }
            if (z24) {
                Intent intent8 = new Intent(context, (Class<?>) TweakService.class);
                intent8.setAction("com.lumi.singularity.START_GPU_MIN_FREQ");
                context.startService(intent8);
            }
            if (z25) {
                Intent intent9 = new Intent(context, (Class<?>) TweakService.class);
                intent9.setAction("com.lumi.singularity.START_GPU_MAX_FREQ");
                context.startService(intent9);
            }
            if (z26) {
                Intent intent10 = new Intent(context, (Class<?>) TweakService.class);
                intent10.setAction("com.lumi.singularity.START_FAN_OVERRIDE");
                context.startService(intent10);
            }
            if (z27) {
                Intent intent11 = new Intent(context, (Class<?>) TweakService.class);
                intent11.setAction("com.lumi.singularity.SET_CHARGE_LIMIT");
                context.startService(intent11);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (z) {
                r7 = 0;
            } else {
                r7 = 0;
                edit.putBoolean("custom_led_is_running", false);
            }
            if (!z7) {
                edit.putBoolean("rgb_led_is_running", r7);
            }
            if (!z2) {
                edit.putBoolean("power_led_is_running", r7);
            }
            if (!z3) {
                edit.putBoolean("min_freq_is_running", r7);
            }
            if (!z24) {
                edit.putBoolean("gpu_min_freq_is_running", r7);
            }
            if (!z25) {
                edit.putBoolean("gpu_max_freq_is_running", r7);
            }
            if (!z26) {
                edit.putBoolean("fan_override_is_running", r7);
            }
            if (!z32) {
                edit.putBoolean("link_fix_running", r7);
            }
            edit.apply();
            if (sharedPreferences.getBoolean("fps_on_boot", r7)) {
                int i10 = sharedPreferences.getInt("fps_target", r7);
                String string = sharedPreferences.getString("fps_available_rates", null);
                if (string != null) {
                    List w0 = ds0.w0(string, new String[]{","});
                    arrayList = new ArrayList();
                    Iterator it = w0.iterator();
                    while (it.hasNext()) {
                        Integer e0 = ks0.e0(ds0.E0((String) it.next()).toString());
                        if (e0 != null) {
                            arrayList.add(e0);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (i10 <= 0 || !(arrayList == null || arrayList.isEmpty() || arrayList.contains(Integer.valueOf(i10)))) {
                    Log.w("BootReceiver", "FPS on Boot: no valid saved rate (" + i10 + "), skipped");
                } else {
                    p01.t(a2, null, null, new re(sharedPreferences, i10, context, null), 3);
                }
            }
            if (z4) {
                i2 = 2;
                r8 = 0;
                i = 3;
                p01.t(a2, null, null, new z9(2, 11, null), 3);
            } else {
                i = 3;
                i2 = 2;
                r8 = 0;
            }
            if (z12) {
                p01.t(a2, r8, r8, new z9(i2, 12, r8), i);
            }
            if (z13) {
                p01.t(a2, r8, r8, new se(z14, context, sharedPreferences, (hm) r8), i);
            }
            if (z6) {
                p01.t(a2, r8, r8, new e4(context, r8, 5), i);
            }
            if (z32) {
                Intent intent12 = new Intent(context, (Class<?>) TweakService.class);
                intent12.setAction("com.lumi.singularity.START_LINK_FIX");
                context.startService(intent12);
            }
            if (z15) {
                Intent intent13 = new Intent(context, (Class<?>) TweakService.class);
                intent13.setAction("com.lumi.singularity.START_USB_INTERCEPTOR");
                context.startService(intent13);
            }
            if (z16) {
                Intent intent14 = new Intent(context, (Class<?>) TweakService.class);
                intent14.setAction("com.lumi.singularity.START_OTA_BLOCKER");
                context.startService(intent14);
            }
            if (z17) {
                if (hr.b() == rh0.f) {
                    Intent intent15 = new Intent(context, (Class<?>) TweakService.class);
                    intent15.setAction("com.lumi.singularity.START_PROX_CHARGE_WATCH");
                    context.startService(intent15);
                }
                r72 = 0;
                i3 = 3;
                p01.t(a2, null, null, new e4(context, null, 6), 3);
            } else {
                i3 = 3;
                r72 = 0;
                p01.t(a2, null, null, new e4(context, null, 1), 3);
            }
            if (z30) {
                p01.t(a2, r72, r72, new e4(context, r72, 2), i3);
            }
            if (z31) {
                p01.t(a2, r72, r72, new ne(context, r72, 0), i3);
            }
            if (z20) {
                Intent intent16 = new Intent(context, (Class<?>) TweakService.class);
                intent16.setAction("com.lumi.singularity.START_PERSIST_PROTECT");
                context.startService(intent16);
            }
            if (!z21 || hr.c()) {
                i4 = 2;
                r73 = 0;
            } else {
                r73 = 0;
                i4 = 2;
                p01.t(a2, hq.d, null, new e4(context, null, 3), 2);
            }
            if (z22) {
                p01.t(a2, hq.d, r73, new e4(context, r73, 4), i4);
            }
            if (z23) {
                p01.t(a2, hq.d, r73, new z9(i4, 7, r73), i4);
            }
            if (z28) {
                z9 z9Var = new z9(i4, 8, r73);
                i5 = 3;
                p01.t(a2, r73, r73, z9Var, 3);
            } else {
                i5 = 3;
            }
            p01.t(a2, r73, r73, new oe(z29, context, (hm) r73), i5);
            if (z18) {
                p01.t(a2, r73, r73, new pe(context, sharedPreferences, z13, r73), i5);
            }
            String string2 = sharedPreferences.getString("start_app_on_boot", r73);
            if (string2 != null && !ds0.n0(string2)) {
                p01.t(a2, r73, r73, new qe(string2, (hm) r73, 0), i5);
            }
            if (z19) {
                i6 = 2;
                p01.t(a2, r73, r73, new z9(2, 9, r73), i5);
            } else {
                i6 = 2;
            }
            if (hr.c()) {
                return;
            }
            p01.t(a2, r73, r73, new z9(i6, 10, r73), i5);
        }
    }
}
