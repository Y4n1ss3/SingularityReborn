package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class eu extends gu {
    public final gg f;
    public final /* synthetic */ iu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(iu iuVar, long j, gg ggVar) {
        super(j);
        this.g = iuVar;
        this.f = ggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.C(this.g);
    }

    @Override // defpackage.gu
    public final String toString() {
        return super.toString() + this.f;
    }
}
