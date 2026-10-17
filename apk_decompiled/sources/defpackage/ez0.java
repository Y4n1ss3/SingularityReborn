package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ez0 extends us0 implements my {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ky e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ SharedPreferences h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez0(boolean z, ky kyVar, boolean z2, boolean z3, SharedPreferences sharedPreferences, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.d = z;
        this.e = kyVar;
        this.f = z2;
        this.g = z3;
        this.h = sharedPreferences;
        this.i = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ez0(this.d, this.e, this.f, this.g, this.h, this.i, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        ez0 ez0Var = (ez0) create((un) obj, (hm) obj2);
        w01 w01Var = w01.a;
        ez0Var.invokeSuspend(w01Var);
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        p10.Q(obj);
        boolean z = this.d;
        ky kyVar = this.e;
        if (z) {
            kyVar.invoke(this.f ? "Display Scaling Enabled" : "Display Scaling Disabled");
        } else {
            MutableState mutableState = this.i;
            boolean z2 = this.g;
            mutableState.setValue(Boolean.valueOf(z2));
            this.h.edit().putBoolean("fps_display_scaling", z2).apply();
            kyVar.invoke("Couldn't reach wireless ADB. Enable Wireless Debugging and run Setup With Computer first");
        }
        return w01.a;
    }
}
