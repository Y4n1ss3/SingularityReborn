package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class k8 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ SharedPreferences e;

    public /* synthetic */ k8(SharedPreferences sharedPreferences, int i) {
        this.d = i;
        this.e = sharedPreferences;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int i = this.d;
        SharedPreferences sharedPreferences = this.e;
        switch (i) {
            case 0:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("prevent_auto_install", false)), null, 2, null);
            case 1:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("automation_unlock_toggle_enabled", false)), null, 2, null);
            case 2:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(sharedPreferences.getInt("fps_target", 90)), null, 2, null);
            case 3:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("fps_on_boot", false)), null, 2, null);
            case 4:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("fps_display_scaling", false)), null, 2, null);
            case 5:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(sharedPreferences.getInt("fan_override_target_rpm", iv.b())), null, 2, null);
            case 6:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("fan_sleep_lower_enabled", false)), null, 2, null);
            case 7:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(sharedPreferences.getInt("charge_limit_target", 100)), null, 2, null);
            case 8:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("charge_notif_enabled", false)), null, 2, null);
            case 9:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("persist_protect_toggle_enabled", true)), null, 2, null);
            case 10:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("telemetry_toggle_enabled", false)), null, 2, null);
            case 11:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("update_engine_toggle_enabled", false)), null, 2, null);
            case Matrix.TranslateX /* 12 */:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("cycle_wifi_on_boot", false)), null, 2, null);
            case Matrix.TranslateY /* 13 */:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("usb_interceptor_on_boot", false)), null, 2, null);
            case Matrix.TranslateZ /* 14 */:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("prox_sensor_on_boot", false)), null, 2, null);
            case 15:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("double_tap_passthrough_enabled", false)), null, 2, null);
            case 16:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("gamepad_mode_toggle_enabled", false)), null, 2, null);
            case 17:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("gamepad_mode_key_exists", false)), null, 2, null);
            case 18:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("dt_passthrough_pref_exists", false)), null, 2, null);
            case 19:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("trans_pref_exists", false)), null, 2, null);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("trans_dbg_pref_exists", false)), null, 2, null);
            case 21:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("teleport_pref_exists", false)), null, 2, null);
            case 22:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("fog_pref_exists", false)), null, 2, null);
            case 23:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("panel_scale_pref_exists", false)), null, 2, null);
            case 24:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("inf_panels_pref_exists", false)), null, 2, null);
            case RectListKt.BitOffsetForParentId /* 25 */:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("no_controller_enabled", false)), null, 2, null);
            case 26:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("no_controller_pref_exists", false)), null, 2, null);
            case 27:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("multimodal_pref_exists", false)), null, 2, null);
            case 28:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("simultaneous_hands_controllers_enabled", false)), null, 2, null);
            default:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("sim_hands_pref_exists", false)), null, 2, null);
        }
    }
}
