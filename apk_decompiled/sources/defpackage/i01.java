package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class i01 extends us0 implements my {
    public /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ SharedPreferences i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(boolean z, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, SharedPreferences sharedPreferences, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, hm hmVar) {
        super(2, hmVar);
        this.e = z;
        this.f = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.i = sharedPreferences;
        this.j = mutableState4;
        this.k = mutableState5;
        this.l = mutableState6;
        this.m = mutableState7;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        i01 i01Var = new i01(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, hmVar);
        i01Var.d = obj;
        return i01Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        i01 i01Var = (i01) create((un) obj, (hm) obj2);
        w01 w01Var = w01.a;
        i01Var.invokeSuspend(w01Var);
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        un unVar = (un) this.d;
        p10.Q(obj);
        if (this.e) {
            nq nqVar = nr.a;
            hq hqVar = hq.d;
            p01.t(unVar, hqVar, null, new g01(this.f, this.g, this.h, this.i, this.j, null), 2);
            p01.t(unVar, hqVar, null, new a3(this.k, this.l, this.m, (hm) null), 2);
        }
        return w01.a;
    }
}
