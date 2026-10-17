package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class lz0 extends us0 implements my {
    public final /* synthetic */ int d = 0;
    public int e;
    public final /* synthetic */ ky f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(int i, hm hmVar, ky kyVar) {
        super(2, hmVar);
        this.f = kyVar;
        this.e = i;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new lz0(this.e, hmVar, this.f);
            default:
                return new lz0(this.f, hmVar);
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
                ((lz0) create(unVar, hmVar)).invokeSuspend(w01Var);
                return w01Var;
            default:
                return ((lz0) create(unVar, hmVar)).invokeSuspend(w01Var);
        }
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        ky kyVar = this.f;
        switch (i) {
            case 0:
                p10.Q(obj);
                int i2 = this.e;
                kyVar.invoke(i2 >= 100 ? "Charge limit removed — charging to 100%" : j50.i(i2, "Battery will stop charging at ", "%"));
                return w01Var;
            default:
                int i3 = this.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                zj0 zj0Var = zj0.a;
                zj0.a("CURRENT_STATE=$(oculuspreferences --get multimodal_hands_and_controllers_enabled)\nif [ \"$CURRENT_STATE\" == \"true\" ]; then\n    oculuspreferences --set multimodal_hands_and_controllers_enabled false\n    oculuspreferences --set multimodal_hands_and_controllers_enabled true\nelse\n    oculuspreferences --set multimodal_hands_and_controllers_enabled true\n    oculuspreferences --set multimodal_hands_and_controllers_enabled false\nfi");
                nq nqVar = nr.a;
                rz rzVar = f80.a;
                z60 z60Var = new z60(3, null, kyVar);
                this.e = 1;
                Object H = p01.H(rzVar, z60Var, this);
                vn vnVar = vn.d;
                return H == vnVar ? vnVar : w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(ky kyVar, hm hmVar) {
        super(2, hmVar);
        this.f = kyVar;
    }
}
