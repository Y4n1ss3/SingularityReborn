package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class hc extends f30 implements iy {
    public final /* synthetic */ kc d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(kc kcVar, boolean z) {
        super(0);
        this.d = kcVar;
        this.e = z;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        this.d.setEnabled(this.e);
        return w01.a;
    }
}
