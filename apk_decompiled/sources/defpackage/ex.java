package defpackage;

/* loaded from: classes2.dex */
public final class ex extends im {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ fx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(fx fxVar, hm hmVar) {
        super(hmVar);
        this.f = fxVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
