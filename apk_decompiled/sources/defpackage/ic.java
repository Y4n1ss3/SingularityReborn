package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ic extends f30 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ rd0 e;
    public final /* synthetic */ y40 f;
    public final /* synthetic */ hd0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic(rd0 rd0Var, y40 y40Var, hd0 hd0Var, int i) {
        super(1);
        this.d = i;
        this.e = rd0Var;
        this.f = y40Var;
        this.g = hd0Var;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        hd0 hd0Var = this.g;
        y40 y40Var = this.f;
        rd0 rd0Var = this.e;
        switch (i) {
            case 0:
                kc kcVar = (kc) hd0Var;
                rd0Var.a(y40Var, kcVar);
                return new c2(kcVar, 1);
            default:
                vf0 vf0Var = (vf0) hd0Var;
                rd0Var.a(y40Var, vf0Var);
                return new c2(vf0Var, 2);
        }
    }
}
