package defpackage;

/* loaded from: classes2.dex */
public final class vw extends im {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ pw f;
    public Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(pw pwVar, hm hmVar) {
        super(hmVar);
        this.f = pwVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
