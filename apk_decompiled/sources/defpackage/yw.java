package defpackage;

/* loaded from: classes2.dex */
public final class yw extends im {
    public zw d;
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ zw g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(zw zwVar, hm hmVar) {
        super(hmVar);
        this.g = zwVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
