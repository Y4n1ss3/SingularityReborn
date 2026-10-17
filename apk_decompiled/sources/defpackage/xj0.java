package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class xj0 extends im {
    public String d;
    public wj0 e;
    public ob0 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zj0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj0(zj0 zj0Var, im imVar) {
        super(imVar);
        this.h = zj0Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, null, false, this);
    }
}
