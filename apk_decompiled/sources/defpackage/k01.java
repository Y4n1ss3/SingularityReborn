package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.lumi.singularity.ui.activities.TweaksActivity;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class k01 extends us0 implements my {
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
    public final /* synthetic */ MutableState Y;
    public final /* synthetic */ MutableState Z;
    public final /* synthetic */ MutableState a0;
    public final /* synthetic */ MutableState b0;
    public final /* synthetic */ MutableState c0;
    public final /* synthetic */ rw0 d;
    public final /* synthetic */ MutableState d0;
    public final /* synthetic */ zr0 e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ SharedPreferences g;
    public final /* synthetic */ AtomicLong h;
    public final /* synthetic */ long i;
    public final /* synthetic */ AtomicLong j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
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
    public k01(rw0 rw0Var, zr0 zr0Var, ky kyVar, SharedPreferences sharedPreferences, AtomicLong atomicLong, long j, AtomicLong atomicLong2, long j2, Context context, String str, String str2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, MutableState mutableState21, MutableState mutableState22, MutableState mutableState23, MutableState mutableState24, MutableState mutableState25, MutableState mutableState26, MutableState mutableState27, MutableState mutableState28, MutableState mutableState29, MutableState mutableState30, MutableState mutableState31, MutableState mutableState32, MutableState mutableState33, MutableState mutableState34, MutableState mutableState35, MutableState mutableState36, MutableState mutableState37, MutableState mutableState38, MutableState mutableState39, MutableState mutableState40, MutableState mutableState41, MutableState mutableState42, hm hmVar) {
        super(2, hmVar);
        this.d = rw0Var;
        this.e = zr0Var;
        this.f = kyVar;
        this.g = sharedPreferences;
        this.h = atomicLong;
        this.i = j;
        this.j = atomicLong2;
        this.k = j2;
        this.l = context;
        this.m = str;
        this.n = str2;
        this.o = mutableState;
        this.p = mutableState2;
        this.q = mutableState3;
        this.r = mutableState4;
        this.s = mutableState5;
        this.t = mutableState6;
        this.u = mutableState7;
        this.v = mutableState8;
        this.w = mutableState9;
        this.x = mutableState10;
        this.y = mutableState11;
        this.z = mutableState12;
        this.A = mutableState13;
        this.B = mutableState14;
        this.C = mutableState15;
        this.D = mutableState16;
        this.E = mutableState17;
        this.F = mutableState18;
        this.G = mutableState19;
        this.H = mutableState20;
        this.I = mutableState21;
        this.J = mutableState22;
        this.K = mutableState23;
        this.L = mutableState24;
        this.M = mutableState25;
        this.N = mutableState26;
        this.O = mutableState27;
        this.P = mutableState28;
        this.Q = mutableState29;
        this.R = mutableState30;
        this.S = mutableState31;
        this.T = mutableState32;
        this.U = mutableState33;
        this.V = mutableState34;
        this.W = mutableState35;
        this.X = mutableState36;
        this.Y = mutableState37;
        this.Z = mutableState38;
        this.a0 = mutableState39;
        this.b0 = mutableState40;
        this.c0 = mutableState41;
        this.d0 = mutableState42;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new k01(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        k01 k01Var = (k01) create((un) obj, (hm) obj2);
        w01 w01Var = w01.a;
        k01Var.invokeSuspend(w01Var);
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        p10.Q(obj);
        TweaksActivity tweaksActivity = (TweaksActivity) this.d;
        MutableState mutableState = tweaksActivity.v;
        zr0 zr0Var = this.e;
        mutableState.setValue(Boolean.valueOf(zr0Var.a));
        if (tweaksActivity.z) {
            Log.d("StatusChecks", "Skipping custom LED bulk check and showed snackbar.");
            tweaksActivity.z = false;
            this.f.invoke("Custom LED started");
        } else {
            tweaksActivity.w.setValue(Boolean.valueOf(zr0Var.b));
        }
        tweaksActivity.x.setValue(Boolean.valueOf(zr0Var.c));
        this.o.setValue(Boolean.valueOf(zr0Var.d));
        this.p.setValue(Boolean.valueOf(zr0Var.e));
        this.q.setValue(Boolean.valueOf(zr0Var.f));
        this.r.setValue(Boolean.valueOf(zr0Var.E));
        boolean z = zr0Var.G;
        SharedPreferences sharedPreferences = this.g;
        this.s.setValue(Integer.valueOf(z ? sharedPreferences.getInt("charge_limit_target", 100) : 100));
        if (this.h.get() == this.i) {
            this.t.setValue(Boolean.valueOf(zr0Var.g));
        }
        Boolean bool = Boolean.FALSE;
        this.u.setValue(bool);
        this.v.setValue(Boolean.valueOf(zr0Var.i));
        this.w.setValue(Boolean.valueOf(zr0Var.j));
        this.x.setValue(Boolean.valueOf(zr0Var.h));
        if (this.j.get() == this.k) {
            this.y.setValue(Integer.valueOf(zr0Var.k));
        }
        this.z.setValue(zr0Var.l);
        this.A.setValue(Boolean.valueOf(zr0Var.m));
        this.B.setValue(Boolean.valueOf(zr0Var.u));
        this.C.setValue(Boolean.valueOf(zr0Var.v));
        this.D.setValue(Boolean.valueOf(zr0Var.n));
        this.E.setValue(Boolean.valueOf(zr0Var.w));
        this.F.setValue(Boolean.valueOf(zr0Var.o));
        this.G.setValue(Boolean.valueOf(zr0Var.x));
        this.H.setValue(Boolean.valueOf(zr0Var.p));
        this.I.setValue(Boolean.valueOf(zr0Var.y));
        this.J.setValue(Boolean.valueOf(zr0Var.q));
        this.K.setValue(Boolean.valueOf(zr0Var.z));
        this.L.setValue(Boolean.valueOf(zr0Var.r));
        this.M.setValue(Boolean.valueOf(zr0Var.A));
        this.N.setValue(Boolean.valueOf(zr0Var.s));
        this.O.setValue(Boolean.valueOf(zr0Var.t));
        this.P.setValue(Boolean.valueOf(zr0Var.B));
        this.Q.setValue(Boolean.valueOf(zr0Var.C));
        this.R.setValue(Boolean.valueOf(zr0Var.F));
        this.S.setValue(Boolean.valueOf(zr0Var.H));
        this.T.setValue(Boolean.valueOf(zr0Var.I));
        this.U.setValue(Boolean.valueOf(zr0Var.D));
        this.V.setValue(Boolean.valueOf(zr0Var.J));
        this.W.setValue(Boolean.valueOf(zr0Var.K));
        this.X.setValue(Boolean.valueOf(zr0Var.L));
        this.Y.setValue(Boolean.valueOf(zr0Var.M));
        this.Z.setValue(Boolean.valueOf(sharedPreferences.getBoolean("prox_sensor_disabled", false)));
        Object systemService = ((dk) this.l).getApplicationContext().getSystemService("wifi");
        systemService.getClass();
        String formatIpAddress = Formatter.formatIpAddress(((WifiManager) systemService).getConnectionInfo().getIpAddress());
        if (q10.b(formatIpAddress, "0.0.0.0")) {
            formatIpAddress = "Not connected to Wi-Fi";
        } else {
            formatIpAddress.getClass();
        }
        this.a0.setValue(formatIpAddress);
        this.b0.setValue(this.m);
        this.c0.setValue(this.n);
        this.d0.setValue(bool);
        return w01.a;
    }
}
