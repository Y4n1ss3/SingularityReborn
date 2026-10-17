package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class c11 extends us0 implements my {
    public final /* synthetic */ ky d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(ky kyVar, float f, hm hmVar) {
        super(2, hmVar);
        this.d = kyVar;
        this.e = f;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new c11(this.d, this.e, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        c11 c11Var = (c11) create((un) obj, (hm) obj2);
        w01 w01Var = w01.a;
        c11Var.invokeSuspend(w01Var);
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        p10.Q(obj);
        this.d.invoke(new Float(this.e));
        return w01.a;
    }
}
