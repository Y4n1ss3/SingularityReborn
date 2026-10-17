package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class jz0 extends us0 implements my {
    public int d;
    public final /* synthetic */ rw0 e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(rw0 rw0Var, ky kyVar, int i, String str, hm hmVar) {
        super(2, hmVar);
        this.e = rw0Var;
        this.f = kyVar;
        this.g = i;
        this.h = str;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new jz0(this.e, this.f, this.g, this.h, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((jz0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i == 0) {
            p10.Q(obj);
            rw0.a(this.e, "com.lumi.singularity.SET_FAN_RPM");
            nq nqVar = nr.a;
            rz rzVar = f80.a;
            iz0 iz0Var = new iz0(this.g, null, this.f, this.h);
            this.d = 1;
            Object H = p01.H(rzVar, iz0Var, this);
            vn vnVar = vn.d;
            if (H == vnVar) {
                return vnVar;
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
