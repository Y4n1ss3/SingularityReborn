package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class zy0 extends us0 implements my {
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
    public final /* synthetic */ MutableState X;
    public int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ nj f;
    public final /* synthetic */ nj g;
    public final /* synthetic */ iy h;
    public final /* synthetic */ AtomicLong i;
    public final /* synthetic */ AtomicLong j;
    public final /* synthetic */ rw0 k;
    public final /* synthetic */ SharedPreferences l;
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
    public zy0(boolean z, nj njVar, nj njVar2, iy iyVar, AtomicLong atomicLong, AtomicLong atomicLong2, rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, MutableState mutableState21, MutableState mutableState22, MutableState mutableState23, MutableState mutableState24, MutableState mutableState25, MutableState mutableState26, MutableState mutableState27, MutableState mutableState28, MutableState mutableState29, MutableState mutableState30, MutableState mutableState31, MutableState mutableState32, MutableState mutableState33, MutableState mutableState34, MutableState mutableState35, MutableState mutableState36, MutableState mutableState37, MutableState mutableState38, hm hmVar) {
        super(2, hmVar);
        this.e = z;
        this.f = njVar;
        this.g = njVar2;
        this.h = iyVar;
        this.i = atomicLong;
        this.j = atomicLong2;
        this.k = rw0Var;
        this.l = sharedPreferences;
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
        this.X = mutableState38;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new zy0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((zy0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i == 0) {
            p10.Q(obj);
            if (this.e) {
                nq nqVar = nr.a;
                hq hqVar = hq.d;
                yy0 yy0Var = new yy0(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, null);
                this.d = 1;
                Object H = p01.H(hqVar, yy0Var, this);
                vn vnVar = vn.d;
                if (H == vnVar) {
                    return vnVar;
                }
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
