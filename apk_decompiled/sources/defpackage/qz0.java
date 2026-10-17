package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class qz0 extends us0 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ky g;
    public final /* synthetic */ SharedPreferences h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz0(boolean z, rw0 rw0Var, boolean z2, ky kyVar, SharedPreferences sharedPreferences, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.e = z;
        this.j = rw0Var;
        this.f = z2;
        this.g = kyVar;
        this.h = sharedPreferences;
        this.i = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new qz0(this.e, this.f, this.g, this.h, this.i, (MutableState) obj2, hmVar);
            default:
                SharedPreferences sharedPreferences = this.h;
                MutableState mutableState = this.i;
                return new qz0(this.e, (rw0) obj2, this.f, this.g, sharedPreferences, mutableState, hmVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
            case 0:
                ((qz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((qz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        SharedPreferences sharedPreferences = this.h;
        MutableState mutableState = this.i;
        Object obj2 = this.j;
        boolean z = this.e;
        boolean z2 = this.f;
        ky kyVar = this.g;
        switch (i) {
            case 0:
                p10.Q(obj);
                mutableState.setValue(Boolean.FALSE);
                if (z != z2) {
                    ((MutableState) obj2).setValue(Boolean.valueOf(z));
                    sharedPreferences.edit().putBoolean("gamepad_mode_toggle_enabled", z).apply();
                    kyVar.invoke("Unable to verify Gamepad Mode state");
                    break;
                } else {
                    kyVar.invoke(z2 ? "Gamepad Mode Enabled" : "Gamepad Mode Disabled");
                    break;
                }
            default:
                p10.Q(obj);
                if (!z) {
                    boolean z3 = !z2;
                    mutableState.setValue(Boolean.valueOf(z3));
                    sharedPreferences.edit().putBoolean("prox_sensor_disabled", z3).apply();
                    kyVar.invoke("Couldn't reach wireless ADB. Enable Wireless Debugging and run Setup With Computer first");
                    break;
                } else {
                    if (hr.b() == rh0.f) {
                        rw0.a((rw0) obj2, z2 ? "com.lumi.singularity.START_PROX_CHARGE_WATCH" : "com.lumi.singularity.STOP_PROX_CHARGE_WATCH");
                    }
                    kyVar.invoke(z2 ? "Proximity Sensor Disabled" : "Proximity Sensor Restored");
                    break;
                }
        }
        return w01Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz0(boolean z, boolean z2, ky kyVar, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.e = z;
        this.f = z2;
        this.g = kyVar;
        this.h = sharedPreferences;
        this.i = mutableState;
        this.j = mutableState2;
    }
}
