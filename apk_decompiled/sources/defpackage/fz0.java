package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class fz0 extends us0 implements my {
    public int d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ky g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ SharedPreferences i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(Context context, boolean z, ky kyVar, boolean z2, SharedPreferences sharedPreferences, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.e = context;
        this.f = z;
        this.g = kyVar;
        this.h = z2;
        this.i = sharedPreferences;
        this.j = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new fz0(this.e, this.f, this.g, this.h, this.i, this.j, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((fz0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (defpackage.p01.H(r13, r4, r12) == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r13 == r3) goto L18;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            String h = j50.h(this.f ? 1 : 0, "setprop debug.oculus.forceDisplayScaling ");
            this.d = 1;
            obj = j4.i(this.e, h, this);
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
        boolean z = obj != null;
        nq nqVar = nr.a;
        rz rzVar = f80.a;
        ez0 ez0Var = new ez0(z, this.g, this.f, this.h, this.i, this.j, null);
        this.d = 2;
    }
}
