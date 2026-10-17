package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class m extends im {
    public ek0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pw f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pw pwVar, hm hmVar) {
        super(hmVar);
        this.f = pwVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
