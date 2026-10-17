package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vr0 extends im {
    public wr0 d;
    public jw e;
    public xr0 f;
    public z10 g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ wr0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(wr0 wr0Var, hm hmVar) {
        super(hmVar);
        this.j = wr0Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        this.j.collect(null, this);
        return vn.d;
    }
}
