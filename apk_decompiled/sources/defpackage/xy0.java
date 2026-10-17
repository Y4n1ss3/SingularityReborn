package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import com.lumi.singularity.ui.activities.TweaksActivity;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class xy0 extends us0 implements my {
    public final /* synthetic */ MutableState A;
    public final /* synthetic */ MutableState B;
    public final /* synthetic */ MutableState C;
    public final /* synthetic */ MutableState D;
    public final /* synthetic */ MutableState E;
    public final /* synthetic */ MutableState F;
    public final /* synthetic */ MutableState G;
    public final /* synthetic */ MutableState H;
    public final /* synthetic */ MutableState I;
    public final /* synthetic */ MutableState J;
    public final /* synthetic */ MutableState K;
    public final /* synthetic */ MutableState L;
    public final /* synthetic */ MutableState M;
    public final /* synthetic */ MutableState N;
    public final /* synthetic */ MutableState O;
    public final /* synthetic */ MutableState P;
    public final /* synthetic */ MutableState Q;
    public final /* synthetic */ MutableState R;
    public final /* synthetic */ MutableState S;
    public final /* synthetic */ MutableState T;
    public final /* synthetic */ MutableState U;
    public final /* synthetic */ MutableState V;
    public final /* synthetic */ MutableState W;
    public final /* synthetic */ rw0 d;
    public final /* synthetic */ zr0 e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ AtomicLong g;
    public final /* synthetic */ long h;
    public final /* synthetic */ AtomicLong i;
    public final /* synthetic */ long j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ MutableState w;
    public final /* synthetic */ MutableState x;
    public final /* synthetic */ MutableState y;
    public final /* synthetic */ MutableState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(rw0 rw0Var, zr0 zr0Var, SharedPreferences sharedPreferences, AtomicLong atomicLong, long j, AtomicLong atomicLong2, long j2, String str, String str2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, MutableState mutableState21, MutableState mutableState22, MutableState mutableState23, MutableState mutableState24, MutableState mutableState25, MutableState mutableState26, MutableState mutableState27, MutableState mutableState28, MutableState mutableState29, MutableState mutableState30, MutableState mutableState31, MutableState mutableState32, MutableState mutableState33, MutableState mutableState34, MutableState mutableState35, MutableState mutableState36, MutableState mutableState37, hm hmVar) {
        super(2, hmVar);
        this.d = rw0Var;
        this.e = zr0Var;
        this.f = sharedPreferences;
        this.g = atomicLong;
        this.h = j;
        this.i = atomicLong2;
        this.j = j2;
        this.k = str;
        this.l = str2;
        this.m = mutableState;
        this.n = mutableState2;
        this.o = mutableState3;
        this.p = mutableState4;
        this.q = mutableState5;
        this.r = mutableState6;
        this.s = mutableState7;
        this.t = mutableState8;
        this.u = mutableState9;
        this.v = mutableState10;
        this.w = mutableState11;
        this.x = mutableState12;
        this.y = mutableState13;
        this.z = mutableState14;
        this.A = mutableState15;
        this.B = mutableState16;
        this.C = mutableState17;
        this.D = mutableState18;
        this.E = mutableState19;
        this.F = mutableState20;
        this.G = mutableState21;
        this.H = mutableState22;
        this.I = mutableState23;
        this.J = mutableState24;
        this.K = mutableState25;
        this.L = mutableState26;
        this.M = mutableState27;
        this.N = mutableState28;
        this.O = mutableState29;
        this.P = mutableState30;
        this.Q = mutableState31;
        this.R = mutableState32;
        this.S = mutableState33;
        this.T = mutableState34;
        this.U = mutableState35;
        this.V = mutableState36;
        this.W = mutableState37;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new xy0(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        xy0 xy0Var = (xy0) create((un) obj, (hm) obj2);
        w01 w01Var = w01.a;
        xy0Var.invokeSuspend(w01Var);
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        p10.Q(obj);
        TweaksActivity tweaksActivity = (TweaksActivity) this.d;
        MutableState mutableState = tweaksActivity.v;
        zr0 zr0Var = this.e;
        mutableState.setValue(Boolean.valueOf(zr0Var.a));
        tweaksActivity.w.setValue(Boolean.valueOf(zr0Var.b));
        tweaksActivity.x.setValue(Boolean.valueOf(zr0Var.c));
        this.m.setValue(Boolean.valueOf(zr0Var.d));
        this.n.setValue(Boolean.valueOf(zr0Var.e));
        this.o.setValue(Boolean.valueOf(zr0Var.f));
        this.p.setValue(Boolean.valueOf(zr0Var.E));
        this.q.setValue(Integer.valueOf(zr0Var.G ? this.f.getInt("charge_limit_target", 100) : 100));
        if (this.g.get() == this.h) {
            this.r.setValue(Boolean.valueOf(zr0Var.g));
        }
        Boolean bool = Boolean.FALSE;
        this.s.setValue(bool);
        this.t.setValue(Boolean.valueOf(zr0Var.i));
        this.u.setValue(Boolean.valueOf(zr0Var.j));
        this.v.setValue(Boolean.valueOf(zr0Var.h));
        if (this.i.get() == this.j) {
            this.w.setValue(Integer.valueOf(zr0Var.k));
        }
        this.x.setValue(zr0Var.l);
        this.y.setValue(Boolean.valueOf(zr0Var.m));
        this.z.setValue(Boolean.valueOf(zr0Var.u));
        this.A.setValue(Boolean.valueOf(zr0Var.v));
        this.B.setValue(Boolean.valueOf(zr0Var.n));
        this.C.setValue(Boolean.valueOf(zr0Var.w));
        this.D.setValue(Boolean.valueOf(zr0Var.o));
        this.E.setValue(Boolean.valueOf(zr0Var.x));
        this.F.setValue(Boolean.valueOf(zr0Var.p));
        this.G.setValue(Boolean.valueOf(zr0Var.y));
        this.H.setValue(Boolean.valueOf(zr0Var.q));
        this.I.setValue(Boolean.valueOf(zr0Var.z));
        this.J.setValue(Boolean.valueOf(zr0Var.r));
        this.K.setValue(Boolean.valueOf(zr0Var.A));
        this.L.setValue(Boolean.valueOf(zr0Var.s));
        this.M.setValue(Boolean.valueOf(zr0Var.t));
        this.N.setValue(Boolean.valueOf(zr0Var.B));
        this.O.setValue(Boolean.valueOf(zr0Var.C));
        this.P.setValue(Boolean.valueOf(zr0Var.F));
        this.Q.setValue(Boolean.valueOf(zr0Var.J));
        this.R.setValue(Boolean.valueOf(zr0Var.K));
        this.S.setValue(Boolean.valueOf(zr0Var.L));
        this.T.setValue(Boolean.valueOf(zr0Var.M));
        String str = this.k;
        if (str.length() <= 0) {
            str = null;
        }
        this.U.setValue(str);
        this.V.setValue(this.l);
        this.W.setValue(bool);
        return w01.a;
    }
}
