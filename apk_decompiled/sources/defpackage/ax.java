package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ax extends us0 implements ny {
    public int d;
    public /* synthetic */ jw e;
    public /* synthetic */ Object f;
    public final /* synthetic */ my g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(my myVar, hm hmVar) {
        super(3, hmVar);
        this.g = myVar;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ax axVar = new ax(this.g, (hm) obj3);
        axVar.e = (jw) obj;
        axVar.f = obj2;
        return axVar.invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r0.emit(r6, r5) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6 == r4) goto L15;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jw jwVar;
        int i = this.d;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            jwVar = this.e;
            Object obj2 = this.f;
            this.e = jwVar;
            this.d = 1;
            obj = this.g.invoke(obj2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jwVar = this.e;
            p10.Q(obj);
        }
        this.e = null;
        this.d = 2;
    }
}
