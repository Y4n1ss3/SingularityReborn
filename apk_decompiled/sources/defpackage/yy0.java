package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class yy0 extends us0 implements my {
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
    public long d;
    public long e;
    public zr0 f;
    public String g;
    public int h;
    public final /* synthetic */ nj i;
    public final /* synthetic */ nj j;
    public final /* synthetic */ iy k;
    public final /* synthetic */ AtomicLong l;
    public final /* synthetic */ AtomicLong m;
    public final /* synthetic */ rw0 n;
    public final /* synthetic */ SharedPreferences o;
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
    public yy0(nj njVar, nj njVar2, iy iyVar, AtomicLong atomicLong, AtomicLong atomicLong2, rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, MutableState mutableState21, MutableState mutableState22, MutableState mutableState23, MutableState mutableState24, MutableState mutableState25, MutableState mutableState26, MutableState mutableState27, MutableState mutableState28, MutableState mutableState29, MutableState mutableState30, MutableState mutableState31, MutableState mutableState32, MutableState mutableState33, MutableState mutableState34, MutableState mutableState35, MutableState mutableState36, MutableState mutableState37, MutableState mutableState38, hm hmVar) {
        super(2, hmVar);
        this.i = njVar;
        this.j = njVar2;
        this.k = iyVar;
        this.l = atomicLong;
        this.m = atomicLong2;
        this.n = rw0Var;
        this.o = sharedPreferences;
        this.p = mutableState;
        this.q = mutableState2;
        this.r = mutableState3;
        this.s = mutableState4;
        this.t = mutableState5;
        this.u = mutableState6;
        this.v = mutableState7;
        this.w = mutableState8;
        this.x = mutableState9;
        this.y = mutableState10;
        this.z = mutableState11;
        this.A = mutableState12;
        this.B = mutableState13;
        this.C = mutableState14;
        this.D = mutableState15;
        this.E = mutableState16;
        this.F = mutableState17;
        this.G = mutableState18;
        this.H = mutableState19;
        this.I = mutableState20;
        this.J = mutableState21;
        this.K = mutableState22;
        this.L = mutableState23;
        this.M = mutableState24;
        this.N = mutableState25;
        this.O = mutableState26;
        this.P = mutableState27;
        this.Q = mutableState28;
        this.R = mutableState29;
        this.S = mutableState30;
        this.T = mutableState31;
        this.U = mutableState32;
        this.V = mutableState33;
        this.W = mutableState34;
        this.X = mutableState35;
        this.Y = mutableState36;
        this.Z = mutableState37;
        this.a0 = mutableState38;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new yy0(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((yy0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ed, code lost:
    
        if (r2 == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (r1 == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (defpackage.o01.c(r6, r4, r58) == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (r1 == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
    
        if (((defpackage.oj) r58.j).r(r58) == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006a, code lost:
    
        if (((defpackage.oj) r58.i).r(r58) == r7) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0344 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        Object H;
        zr0 zr0Var;
        Object H2;
        Object c;
        long j3;
        long j4;
        zr0 zr0Var2;
        String str;
        int i = this.h;
        SharedPreferences sharedPreferences = this.o;
        int i2 = 2;
        w01 w01Var = w01.a;
        hm hmVar = null;
        AtomicLong atomicLong = this.m;
        AtomicLong atomicLong2 = this.l;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                p10.Q(obj);
                this.h = 1;
                break;
            case 1:
                p10.Q(obj);
                this.h = 2;
                break;
            case 2:
                p10.Q(obj);
                zj0 zj0Var = zj0.a;
                this.h = 3;
                nq nqVar = nr.a;
                Object H3 = p01.H(hq.d, new yj0(2, 2, null), this);
                if (H3 != vnVar) {
                    H3 = w01Var;
                    break;
                }
                break;
            case 3:
                p10.Q(obj);
                Boolean bool = (Boolean) this.k.invoke();
                bool.getClass();
                this.p.setValue(bool);
                this.h = 4;
                break;
            case 4:
                p10.Q(obj);
                j = atomicLong2.get();
                j2 = atomicLong.get();
                ob0 ob0Var = as0.a;
                this.d = j;
                this.e = j2;
                this.h = 5;
                nq nqVar2 = nr.a;
                H = p01.H(hq.d, new y9(i2, hmVar), this);
                break;
            case 5:
                j2 = this.e;
                j = this.d;
                p10.Q(obj);
                H = obj;
                zr0Var = (zr0) H;
                if (zr0Var != null) {
                    this.f = zr0Var;
                    this.d = j;
                    this.e = j2;
                    this.h = 6;
                    nq nqVar3 = nr.a;
                    H2 = p01.H(hq.d, new w2(2, 6, null), this);
                    break;
                }
            case 6:
                long j5 = this.e;
                long j6 = this.d;
                zr0 zr0Var3 = this.f;
                p10.Q(obj);
                zr0Var = zr0Var3;
                j = j6;
                j2 = j5;
                H2 = obj;
                String str2 = (String) H2;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("rgb_led_is_running", zr0Var.a);
                edit.putBoolean("custom_led_is_running", zr0Var.b);
                edit.putBoolean("power_led_is_running", zr0Var.c);
                edit.putBoolean("min_freq_is_running", zr0Var.d);
                edit.putBoolean("gpu_min_freq_is_running", zr0Var.e);
                edit.putBoolean("gpu_max_freq_is_running", zr0Var.f);
                edit.putBoolean("fan_override_is_running", zr0Var.E);
                edit.putBoolean("charge_limit_is_running", zr0Var.G);
                if (atomicLong2.get() == j) {
                    edit.putBoolean("usb_interceptor_running", zr0Var.g);
                }
                edit.putBoolean("sys_ota_disabled", zr0Var.h);
                edit.putBoolean("root_blocker_is_running", false);
                edit.putBoolean("wireless_adb_is_running", zr0Var.j);
                if (atomicLong.get() == j2) {
                    edit.putInt("ui_switch_state", zr0Var.k);
                }
                edit.putString("navigator_mode", zr0Var.l.name());
                edit.putBoolean("transition_void_enabled", zr0Var.m);
                edit.putBoolean("trans_pref_exists", zr0Var.u);
                edit.putBoolean("trans_dbg_pref_exists", zr0Var.v);
                edit.putBoolean("teleport_limit_disabled", zr0Var.n);
                edit.putBoolean("teleport_pref_exists", zr0Var.w);
                edit.putBoolean("navigator_fog_enabled", zr0Var.o);
                edit.putBoolean("fog_pref_exists", zr0Var.x);
                edit.putBoolean("panel_scaling_enabled", zr0Var.p);
                edit.putBoolean("panel_scale_pref_exists", zr0Var.y);
                edit.putBoolean("infinite_panels_enabled", zr0Var.q);
                edit.putBoolean("inf_panels_pref_exists", zr0Var.z);
                edit.putBoolean("no_controller_enabled", zr0Var.r);
                edit.putBoolean("no_controller_pref_exists", zr0Var.A);
                edit.putBoolean("simultaneous_hands_controllers_enabled", zr0Var.s);
                edit.putBoolean("sim_hands_pref_exists", zr0Var.t);
                edit.putBoolean("multimodal_pref_exists", zr0Var.B);
                edit.putBoolean("dt_passthrough_pref_exists", zr0Var.C);
                edit.putBoolean("frida_is_running", zr0Var.D);
                edit.putBoolean("meta_backdoor_toggle_enabled", zr0Var.F);
                edit.putBoolean("guardian_disabled", zr0Var.J);
                edit.putBoolean("captive_portal_disabled", zr0Var.K);
                edit.putBoolean("gamepad_mode_toggle_enabled", zr0Var.L);
                edit.putBoolean("gamepad_mode_key_exists", zr0Var.M);
                edit.apply();
                zj0 zj0Var2 = zj0.a;
                this.f = zr0Var;
                this.g = str2;
                this.d = j;
                this.e = j2;
                this.h = 7;
                c = zj0.c("/data/local/tmp/frida-server --version 2>/dev/null", false, this);
                if (c != vnVar) {
                    long j7 = j;
                    j3 = j2;
                    j4 = j7;
                    zr0Var2 = zr0Var;
                    str = str2;
                    String obj2 = ds0.E0((String) c).toString();
                    nq nqVar4 = nr.a;
                    rz rzVar = f80.a;
                    long j8 = j4;
                    xy0 xy0Var = new xy0(this.n, zr0Var2, sharedPreferences, this.l, j8, this.m, j3, obj2, str, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, null);
                    this.f = null;
                    this.g = null;
                    this.d = j8;
                    this.e = j3;
                    this.h = 8;
                    return p01.H(rzVar, xy0Var, this) != vnVar ? vnVar : w01Var;
                }
                return vnVar;
            case 7:
                long j9 = this.e;
                j4 = this.d;
                String str3 = this.g;
                zr0Var2 = this.f;
                p10.Q(obj);
                j3 = j9;
                str = str3;
                c = obj;
                String obj22 = ds0.E0((String) c).toString();
                nq nqVar42 = nr.a;
                rz rzVar2 = f80.a;
                long j82 = j4;
                xy0 xy0Var2 = new xy0(this.n, zr0Var2, sharedPreferences, this.l, j82, this.m, j3, obj22, str, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, null);
                this.f = null;
                this.g = null;
                this.d = j82;
                this.e = j3;
                this.h = 8;
                if (p01.H(rzVar2, xy0Var2, this) != vnVar) {
                }
                break;
            case 8:
                p10.Q(obj);
                return w01Var;
            default:
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
