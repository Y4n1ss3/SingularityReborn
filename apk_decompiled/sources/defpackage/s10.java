package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class s10 extends im {
    public int d;
    public final /* synthetic */ my e;
    public final /* synthetic */ hm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s10(hm hmVar, kn knVar, my myVar, hm hmVar2) {
        super(hmVar, knVar);
        this.e = myVar;
        this.f = hmVar2;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                o.f("This coroutine had already completed");
                return null;
            }
            this.d = 2;
            p10.Q(obj);
            return obj;
        }
        this.d = 1;
        p10.Q(obj);
        my myVar = this.e;
        myVar.getClass();
        p01.f(2, myVar);
        return myVar.invoke(this.f, this);
    }
}
