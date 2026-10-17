package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class l01 extends us0 implements my {
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
    public long d;
    public final /* synthetic */ MutableState d0;
    public long e;
    public zr0 f;
    public String g;
    public int h;
    public final /* synthetic */ AtomicLong i;
    public final /* synthetic */ AtomicLong j;
    public final /* synthetic */ rw0 k;
    public final /* synthetic */ SharedPreferences l;
    public final /* synthetic */ ky m;
    public final /* synthetic */ Context n;
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
    public l01(AtomicLong atomicLong, AtomicLong atomicLong2, rw0 rw0Var, SharedPreferences sharedPreferences, ky kyVar, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, MutableState mutableState21, MutableState mutableState22, MutableState mutableState23, MutableState mutableState24, MutableState mutableState25, MutableState mutableState26, MutableState mutableState27, MutableState mutableState28, MutableState mutableState29, MutableState mutableState30, MutableState mutableState31, MutableState mutableState32, MutableState mutableState33, MutableState mutableState34, MutableState mutableState35, MutableState mutableState36, MutableState mutableState37, MutableState mutableState38, MutableState mutableState39, MutableState mutableState40, MutableState mutableState41, MutableState mutableState42, hm hmVar) {
        super(2, hmVar);
        this.i = atomicLong;
        this.j = atomicLong2;
        this.k = rw0Var;
        this.l = sharedPreferences;
        this.m = kyVar;
        this.n = context;
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
        return new l01(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((l01) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r1 == r12) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (defpackage.o01.c(r10, r9, r73) == r12) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02fc A[PHI: r15
  0x02fc: PHI (r15v4 w01) = (r15v2 w01), (r15v5 w01) binds: [B:38:0x008e, B:27:0x02f9] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w01 w01Var;
        long j;
        long j2;
        Object H;
        zr0 zr0Var;
        Object H2;
        long j3;
        zr0 zr0Var2;
        Object c;
        long j4;
        String str;
        long j5;
        String obj2;
        int i = this.h;
        w01 w01Var2 = w01.a;
        AtomicLong atomicLong = this.j;
        AtomicLong atomicLong2 = this.i;
        vn vnVar = vn.d;
        if (i == 0) {
            w01Var = w01Var2;
            p10.Q(obj);
            this.h = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    j2 = this.e;
                    w01Var = w01Var2;
                    j = this.d;
                    p10.Q(obj);
                    H = obj;
                    zr0Var = (zr0) H;
                    if (zr0Var != null) {
                        this.f = zr0Var;
                        this.d = j;
                        this.e = j2;
                        this.h = 3;
                        nq nqVar = nr.a;
                        H2 = p01.H(hq.d, new w2(2, 6, null), this);
                        if (H2 != vnVar) {
                            j3 = j2;
                            zr0Var2 = zr0Var;
                            String str2 = (String) H2;
                            zj0 zj0Var = zj0.a;
                            this.f = zr0Var2;
                            this.g = str2;
                            this.d = j;
                            this.e = j3;
                            this.h = 4;
                            c = zj0.c("/data/local/tmp/frida-server --version 2>/dev/null", false, this);
                            if (c != vnVar) {
                            }
                        }
                    }
                }
                if (i == 3) {
                    j3 = this.e;
                    long j6 = this.d;
                    zr0Var = this.f;
                    p10.Q(obj);
                    H2 = obj;
                    w01Var = w01Var2;
                    j = j6;
                    zr0Var2 = zr0Var;
                    String str22 = (String) H2;
                    zj0 zj0Var2 = zj0.a;
                    this.f = zr0Var2;
                    this.g = str22;
                    this.d = j;
                    this.e = j3;
                    this.h = 4;
                    c = zj0.c("/data/local/tmp/frida-server --version 2>/dev/null", false, this);
                    if (c != vnVar) {
                        j4 = j;
                        str = str22;
                        j5 = j3;
                        obj2 = ds0.E0((String) c).toString();
                        if (obj2.length() == 0) {
                        }
                        SharedPreferences sharedPreferences = this.l;
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putBoolean("rgb_led_is_running", zr0Var2.a);
                        edit.putBoolean("custom_led_is_running", zr0Var2.b);
                        edit.putBoolean("power_led_is_running", zr0Var2.c);
                        edit.putBoolean("min_freq_is_running", zr0Var2.d);
                        edit.putBoolean("gpu_min_freq_is_running", zr0Var2.e);
                        edit.putBoolean("gpu_max_freq_is_running", zr0Var2.f);
                        edit.putBoolean("fan_override_is_running", zr0Var2.E);
                        edit.putBoolean("charge_limit_is_running", zr0Var2.G);
                        if (atomicLong2.get() == j4) {
                        }
                        edit.putBoolean("root_blocker_is_running", false);
                        edit.putBoolean("wireless_adb_is_running", zr0Var2.j);
                        if (atomicLong.get() == j5) {
                        }
                        edit.putString("navigator_mode", zr0Var2.l.name());
                        edit.putBoolean("transition_void_enabled", zr0Var2.m);
                        edit.putBoolean("trans_pref_exists", zr0Var2.u);
                        edit.putBoolean("trans_dbg_pref_exists", zr0Var2.v);
                        edit.putBoolean("teleport_limit_disabled", zr0Var2.n);
                        edit.putBoolean("teleport_pref_exists", zr0Var2.w);
                        edit.putBoolean("navigator_fog_enabled", zr0Var2.o);
                        edit.putBoolean("fog_pref_exists", zr0Var2.x);
                        edit.putBoolean("panel_scaling_enabled", zr0Var2.p);
                        edit.putBoolean("panel_scale_pref_exists", zr0Var2.y);
                        edit.putBoolean("infinite_panels_enabled", zr0Var2.q);
                        edit.putBoolean("inf_panels_pref_exists", zr0Var2.z);
                        edit.putBoolean("no_controller_enabled", zr0Var2.r);
                        edit.putBoolean("no_controller_pref_exists", zr0Var2.A);
                        edit.putBoolean("simultaneous_hands_controllers_enabled", zr0Var2.s);
                        edit.putBoolean("sim_hands_pref_exists", zr0Var2.t);
                        edit.putBoolean("multimodal_pref_exists", zr0Var2.B);
                        edit.putBoolean("dt_passthrough_pref_exists", zr0Var2.C);
                        edit.putBoolean("frida_is_running", zr0Var2.D);
                        edit.putBoolean("meta_backdoor_toggle_enabled", zr0Var2.F);
                        edit.putBoolean("double_tap_passthrough_enabled", zr0Var2.H);
                        edit.putBoolean("link_fix_running", zr0Var2.I);
                        edit.putBoolean("sys_ota_disabled", zr0Var2.h);
                        edit.putBoolean("guardian_disabled", zr0Var2.J);
                        edit.putBoolean("captive_portal_disabled", zr0Var2.K);
                        edit.putBoolean("gamepad_mode_toggle_enabled", zr0Var2.L);
                        edit.putBoolean("gamepad_mode_key_exists", zr0Var2.M);
                        if (obj2 == null) {
                        }
                        edit.apply();
                        nq nqVar2 = nr.a;
                        rz rzVar = f80.a;
                        k01 k01Var = new k01(this.k, zr0Var2, this.m, sharedPreferences, this.i, j4, this.j, j5, this.n, obj2, str, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, null);
                        this.f = null;
                        this.g = null;
                        this.d = j4;
                        this.e = j5;
                        this.h = 5;
                        if (p01.H(rzVar, k01Var, this) != vnVar) {
                        }
                    }
                }
                if (i != 4) {
                    if (i == 5) {
                        p10.Q(obj);
                        return w01Var2;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j7 = this.e;
                long j8 = this.d;
                String str3 = this.g;
                zr0Var2 = this.f;
                p10.Q(obj);
                str = str3;
                w01Var = w01Var2;
                j5 = j7;
                j4 = j8;
                c = obj;
                obj2 = ds0.E0((String) c).toString();
                if (obj2.length() == 0) {
                    obj2 = null;
                }
                SharedPreferences sharedPreferences2 = this.l;
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                edit2.putBoolean("rgb_led_is_running", zr0Var2.a);
                edit2.putBoolean("custom_led_is_running", zr0Var2.b);
                edit2.putBoolean("power_led_is_running", zr0Var2.c);
                edit2.putBoolean("min_freq_is_running", zr0Var2.d);
                edit2.putBoolean("gpu_min_freq_is_running", zr0Var2.e);
                edit2.putBoolean("gpu_max_freq_is_running", zr0Var2.f);
                edit2.putBoolean("fan_override_is_running", zr0Var2.E);
                edit2.putBoolean("charge_limit_is_running", zr0Var2.G);
                if (atomicLong2.get() == j4) {
                    edit2.putBoolean("usb_interceptor_running", zr0Var2.g);
                }
                edit2.putBoolean("root_blocker_is_running", false);
                edit2.putBoolean("wireless_adb_is_running", zr0Var2.j);
                if (atomicLong.get() == j5) {
                    edit2.putInt("ui_switch_state", zr0Var2.k);
                }
                edit2.putString("navigator_mode", zr0Var2.l.name());
                edit2.putBoolean("transition_void_enabled", zr0Var2.m);
                edit2.putBoolean("trans_pref_exists", zr0Var2.u);
                edit2.putBoolean("trans_dbg_pref_exists", zr0Var2.v);
                edit2.putBoolean("teleport_limit_disabled", zr0Var2.n);
                edit2.putBoolean("teleport_pref_exists", zr0Var2.w);
                edit2.putBoolean("navigator_fog_enabled", zr0Var2.o);
                edit2.putBoolean("fog_pref_exists", zr0Var2.x);
                edit2.putBoolean("panel_scaling_enabled", zr0Var2.p);
                edit2.putBoolean("panel_scale_pref_exists", zr0Var2.y);
                edit2.putBoolean("infinite_panels_enabled", zr0Var2.q);
                edit2.putBoolean("inf_panels_pref_exists", zr0Var2.z);
                edit2.putBoolean("no_controller_enabled", zr0Var2.r);
                edit2.putBoolean("no_controller_pref_exists", zr0Var2.A);
                edit2.putBoolean("simultaneous_hands_controllers_enabled", zr0Var2.s);
                edit2.putBoolean("sim_hands_pref_exists", zr0Var2.t);
                edit2.putBoolean("multimodal_pref_exists", zr0Var2.B);
                edit2.putBoolean("dt_passthrough_pref_exists", zr0Var2.C);
                edit2.putBoolean("frida_is_running", zr0Var2.D);
                edit2.putBoolean("meta_backdoor_toggle_enabled", zr0Var2.F);
                edit2.putBoolean("double_tap_passthrough_enabled", zr0Var2.H);
                edit2.putBoolean("link_fix_running", zr0Var2.I);
                edit2.putBoolean("sys_ota_disabled", zr0Var2.h);
                edit2.putBoolean("guardian_disabled", zr0Var2.J);
                edit2.putBoolean("captive_portal_disabled", zr0Var2.K);
                edit2.putBoolean("gamepad_mode_toggle_enabled", zr0Var2.L);
                edit2.putBoolean("gamepad_mode_key_exists", zr0Var2.M);
                if (obj2 == null) {
                    edit2.putString("frida_server_version", obj2);
                } else {
                    edit2.remove("frida_server_version");
                }
                edit2.apply();
                nq nqVar22 = nr.a;
                rz rzVar2 = f80.a;
                k01 k01Var2 = new k01(this.k, zr0Var2, this.m, sharedPreferences2, this.i, j4, this.j, j5, this.n, obj2, str, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, null);
                this.f = null;
                this.g = null;
                this.d = j4;
                this.e = j5;
                this.h = 5;
                return p01.H(rzVar2, k01Var2, this) != vnVar ? vnVar : w01Var;
            }
            w01Var = w01Var2;
            p10.Q(obj);
        }
        j = atomicLong2.get();
        j2 = atomicLong.get();
        ob0 ob0Var = as0.a;
        this.d = j;
        this.e = j2;
        this.h = 2;
        nq nqVar3 = nr.a;
        H = p01.H(hq.d, new y9(2, null), this);
    }
}
