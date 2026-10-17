package defpackage;

import com.lumi.singularity.ui.activities.AdbActivity;
import com.lumi.singularity.ui.activities.AdbRootActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class k2 extends us0 implements ky {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(Object obj, hm hmVar, int i) {
        super(1, hmVar);
        this.d = i;
        this.f = obj;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        int i = this.d;
        Object obj = this.f;
        switch (i) {
            case 0:
                return new k2((AdbActivity) obj, hmVar, 0);
            default:
                return new k2((c3) obj, hmVar, 1);
        }
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        hm hmVar = (hm) obj;
        switch (i) {
        }
        return ((k2) create(hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        Object obj2 = this.f;
        vn vnVar = vn.d;
        hm hmVar = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    int i4 = AdbActivity.w;
                    Object h = ((AdbActivity) obj2).h(this);
                    if (h == vnVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            default:
                int i5 = this.e;
                if (i5 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    nq nqVar = nr.a;
                    Object H = p01.H(hq.d, new z2((AdbRootActivity) ((c3) obj2), hmVar, i2), this);
                    if (H == vnVar) {
                        break;
                    }
                } else if (i5 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
        }
        return vnVar;
    }
}
