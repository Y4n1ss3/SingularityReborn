package defpackage;

/* loaded from: classes2.dex */
public final class cx extends im {
    public rw d;
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ rw g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(rw rwVar, hm hmVar) {
        super(hmVar);
        this.g = rwVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
