package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class oz0 extends us0 implements my {
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz0(Boolean bool, SharedPreferences sharedPreferences, ky kyVar, boolean z, boolean z2, MutableState mutableState, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.d = bool;
        this.e = sharedPreferences;
        this.f = kyVar;
        this.g = z;
        this.h = z2;
        this.i = mutableState;
        this.j = mutableState2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new oz0(this.d, this.e, this.f, this.g, this.h, this.i, this.j, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        oz0 oz0Var = (oz0) create((un) obj, (hm) obj2);
        w01 w01Var = w01.a;
        oz0Var.invokeSuspend(w01Var);
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        p10.Q(obj);
        this.i.setValue(Boolean.FALSE);
        ky kyVar = this.f;
        SharedPreferences sharedPreferences = this.e;
        Boolean bool = this.d;
        MutableState mutableState = this.j;
        if (bool != null) {
            mutableState.setValue(bool);
            sharedPreferences.edit().putBoolean("double_tap_passthrough_enabled", bool.booleanValue()).apply();
            kyVar.invoke(bool.booleanValue() ? "Double Tap Passthrough Enabled" : "Double Tap Passthrough Disabled");
        } else {
            boolean z = !this.g;
            mutableState.setValue(Boolean.valueOf(z));
            sharedPreferences.edit().putBoolean("double_tap_passthrough_enabled", z).apply();
            kyVar.invoke(this.h ? "Unable to verify Double Tap Passthrough state" : "Couldn't reach wireless ADB. Enable Wireless Debugging and run Setup With Computer first");
        }
        return w01.a;
    }
}
