package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class w90 extends im {
    public /* synthetic */ Object d;
    public final /* synthetic */ ts e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(ts tsVar, im imVar) {
        super(imVar);
        this.e = tsVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object v = this.e.v(null, this);
        return v == vn.d ? v : new kj0(v);
    }
}
