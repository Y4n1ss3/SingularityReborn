package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class gz0 extends us0 implements my {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ky e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ SharedPreferences h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(boolean z, ky kyVar, int i, int i2, SharedPreferences sharedPreferences, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.d = z;
        this.e = kyVar;
        this.f = i;
        this.g = i2;
        this.h = sharedPreferences;
        this.i = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new gz0(this.d, this.e, this.f, this.g, this.h, this.i, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        gz0 gz0Var = (gz0) create((un) obj, (hm) obj2);
        w01 w01Var = w01.a;
        gz0Var.invokeSuspend(w01Var);
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        p10.Q(obj);
        boolean z = this.d;
        ky kyVar = this.e;
        if (z) {
            kyVar.invoke("Display rate set to " + this.f + " Hz");
        } else {
            MutableState mutableState = this.i;
            int i = this.g;
            mutableState.setValue(Integer.valueOf(i));
            this.h.edit().putInt("fps_target", i).apply();
            kyVar.invoke("Couldn't reach wireless ADB. Enable Wireless Debugging and run Setup With Computer first");
        }
        return w01.a;
    }
}
