package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class a80 extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(vf0 vf0Var, boolean z, hm hmVar) {
        super(2, hmVar);
        this.d = 1;
        this.f = vf0Var;
        this.e = z;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.f;
        boolean z = this.e;
        switch (i) {
            case 0:
                return new a80(z, (iy) obj2, hmVar, 0);
            case 1:
                return new a80((vf0) obj2, z, hmVar);
            default:
                return new a80(z, (rw0) obj2, hmVar, 2);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
            case 0:
                ((a80) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 1:
                ((a80) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((a80) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = this.f;
        boolean z = this.e;
        switch (i) {
            case 0:
                p10.Q(obj);
                if (z) {
                    ((iy) obj2).invoke();
                    break;
                }
                break;
            case 1:
                p10.Q(obj);
                ((vf0) obj2).setEnabled(z);
                break;
            default:
                p10.Q(obj);
                rw0 rw0Var = (rw0) obj2;
                if (!z) {
                    rw0.a(rw0Var, "com.lumi.singularity.STOP_CHARGE_NOTIF");
                    break;
                } else {
                    rw0.a(rw0Var, "com.lumi.singularity.START_CHARGE_NOTIF");
                    break;
                }
        }
        return w01Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a80(boolean z, Object obj, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = z;
        this.f = obj;
    }
}
