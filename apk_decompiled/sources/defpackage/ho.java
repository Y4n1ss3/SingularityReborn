package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ho extends im {
    public /* synthetic */ Object d;
    public final /* synthetic */ ro e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(ro roVar, im imVar) {
        super(imVar);
        this.e = roVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}
