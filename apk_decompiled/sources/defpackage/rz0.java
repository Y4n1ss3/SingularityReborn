package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class rz0 extends us0 implements my {
    public int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ rw0 h;
    public final /* synthetic */ ky i;
    public final /* synthetic */ SharedPreferences j;
    public final /* synthetic */ MutableState k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz0(boolean z, boolean z2, Context context, rw0 rw0Var, ky kyVar, SharedPreferences sharedPreferences, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.e = z;
        this.f = z2;
        this.g = context;
        this.h = rw0Var;
        this.i = kyVar;
        this.j = sharedPreferences;
        this.k = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new rz0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((rz0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (defpackage.p01.H(r13, r4, r12) != r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r13 == r3) goto L26;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        boolean z = true;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            String str = this.e ? "am broadcast -a com.oculus.vrpowermanager.prox_close" : "am broadcast -a com.oculus.vrpowermanager.automation_disable";
            if (this.f) {
                zj0 zj0Var = zj0.a;
                zj0.a(str);
                boolean z2 = z;
                nq nqVar = nr.a;
                rz rzVar = f80.a;
                qz0 qz0Var = new qz0(z2, this.h, this.e, this.i, this.j, this.k, (hm) null);
                this.d = 2;
            } else {
                this.d = 1;
                obj = j4.i(this.g, str, this);
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        if (obj == null) {
            z = false;
        }
        boolean z22 = z;
        nq nqVar2 = nr.a;
        rz rzVar2 = f80.a;
        qz0 qz0Var2 = new qz0(z22, this.h, this.e, this.i, this.j, this.k, (hm) null);
        this.d = 2;
    }
}
