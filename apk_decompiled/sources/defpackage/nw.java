package defpackage;

/* loaded from: classes2.dex */
public final class nw extends im {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ ow f;
    public Object g;
    public jw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(ow owVar, hm hmVar) {
        super(hmVar);
        this.f = owVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
