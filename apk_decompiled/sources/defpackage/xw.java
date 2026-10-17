package defpackage;

/* loaded from: classes2.dex */
public final class xw extends im {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ sw f;
    public zw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(sw swVar, hm hmVar) {
        super(hmVar);
        this.f = swVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
