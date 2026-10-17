package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pz0 extends us0 implements my {
    public ts d;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ SharedPreferences i;
    public final /* synthetic */ ky j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(boolean z, boolean z2, Context context, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.f = z;
        this.g = z2;
        this.h = context;
        this.i = sharedPreferences;
        this.j = kyVar;
        this.k = mutableState;
        this.l = mutableState2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new pz0(this.f, this.g, this.h, this.i, this.j, this.k, this.l, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((pz0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d1, code lost:
    
        if (defpackage.p01.H(r1, r12, r21) == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        if (r1 == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r2 == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (defpackage.zj0.c(r2, false, r21) == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        if (r2 == r11) goto L42;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object i;
        Object c;
        Boolean t;
        Boolean bool;
        Object u;
        ts tsVar = ts.o;
        int i2 = this.e;
        Context context = this.h;
        vn vnVar = vn.d;
        if (i2 == 0) {
            p10.Q(obj);
            String concat = this.f ? "oculuspreferences --getc passthrough_on_demand_enabled | grep -q ': false' && oculuspreferences --setc passthrough_on_demand_enabled true\n".concat("cmd sensorservice set-uid-state com.oculus.vrshell ".concat("active")) : "cmd sensorservice set-uid-state com.oculus.vrshell ".concat("idle");
            if (this.g) {
                zj0 zj0Var = zj0.a;
                this.e = 1;
            } else {
                this.e = 3;
                i = j4.i(context, concat, this);
            }
            return vnVar;
        }
        if (i2 == 1) {
            p10.Q(obj);
            zj0 zj0Var2 = zj0.a;
            this.d = tsVar;
            this.e = 2;
            c = zj0.c("cmd sensorservice get-uid-state com.oculus.vrshell", false, this);
        } else if (i2 == 2) {
            tsVar = this.d;
            p10.Q(obj);
            c = obj;
            tsVar.getClass();
            t = ts.t((String) c);
            bool = t;
        } else if (i2 == 3) {
            p10.Q(obj);
            i = obj;
            if (((String) i) != null) {
                this.d = null;
                this.e = 4;
                u = tsVar.u(context, this);
            } else {
                bool = null;
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                return w01.a;
            }
            p10.Q(obj);
            u = obj;
            t = (Boolean) u;
            bool = t;
        }
        nq nqVar = nr.a;
        rz rzVar = f80.a;
        oz0 oz0Var = new oz0(bool, this.i, this.j, this.f, this.g, this.k, this.l, null);
        this.d = null;
        this.e = 5;
    }
}
