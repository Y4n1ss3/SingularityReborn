package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class u70 extends us0 implements my {
    public MutableState d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SharedPreferences g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ un l;
    public final /* synthetic */ ky m;
    public final /* synthetic */ Animatable n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ cq0 s;
    public final /* synthetic */ g80 t;
    public final /* synthetic */ MutableState u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(SharedPreferences sharedPreferences, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, un unVar, ky kyVar, Animatable animatable, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, cq0 cq0Var, g80 g80Var, MutableState mutableState8, hm hmVar) {
        super(2, hmVar);
        this.g = sharedPreferences;
        this.h = context;
        this.i = mutableState;
        this.j = mutableState2;
        this.k = mutableState3;
        this.l = unVar;
        this.m = kyVar;
        this.n = animatable;
        this.o = mutableState4;
        this.p = mutableState5;
        this.q = mutableState6;
        this.r = mutableState7;
        this.s = cq0Var;
        this.t = g80Var;
        this.u = mutableState8;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        u70 u70Var = new u70(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, hmVar);
        u70Var.f = obj;
        return u70Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((u70) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object b;
        MutableState mutableState;
        un unVar = (un) this.f;
        int i = this.e;
        w01 w01Var = w01.a;
        MutableState mutableState2 = this.i;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            SharedPreferences sharedPreferences = this.g;
            if (sharedPreferences.contains("fugu_adb_ready")) {
                sharedPreferences.edit().remove("fugu_adb_ready").apply();
            }
            zj0 zj0Var = zj0.a;
            this.f = unVar;
            this.d = mutableState2;
            this.e = 1;
            b = zj0.b(this);
            if (b != vnVar) {
                mutableState = mutableState2;
            }
            return vnVar;
        }
        if (i != 1) {
            if (i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            return w01Var;
        }
        MutableState mutableState3 = this.d;
        p10.Q(obj);
        mutableState = mutableState3;
        b = obj;
        Boolean bool = (Boolean) b;
        bool.getClass();
        mutableState.setValue(bool);
        this.j.setValue(Boolean.TRUE);
        if (e80.g(mutableState2)) {
            Context context = this.h;
            if (!q10.v(context)) {
                String packageName = context.getPackageName();
                if (q10.b(packageName, "com.lumi.singularity")) {
                    zj0 zj0Var2 = zj0.a;
                    String c = uo.c("pm uninstall ", packageName);
                    this.f = null;
                    this.d = null;
                    this.e = 2;
                    if (zj0.c(c, false, this) == vnVar) {
                        return vnVar;
                    }
                }
                return w01Var;
            }
            nq nqVar = nr.a;
            p01.t(unVar, hq.d, null, new z9(2, 27, null), 2);
        }
        if (((Boolean) this.k.getValue()).booleanValue()) {
            p01.t(this.l, null, null, new qa(false, this.h, this.m, this.n, this.o, this.p, this.q, this.r, null), 3);
        }
        p01.t(unVar, null, null, new s3(this.s, this.g, this.h, this.t, this.u, this.i, null), 3);
        return w01Var;
    }
}
