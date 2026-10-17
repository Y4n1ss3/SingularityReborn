package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class gd0 extends us0 implements ny {
    public final /* synthetic */ fi0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(fi0 fi0Var, hm hmVar) {
        super(3, hmVar);
        this.d = fi0Var;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gd0 gd0Var = new gd0(this.d, (hm) obj3);
        w01 w01Var = w01.a;
        gd0Var.invokeSuspend(w01Var);
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        p10.Q(obj);
        this.d.d = true;
        return w01.a;
    }
}
