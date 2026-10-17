package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class fu extends gu {
    public final Runnable f;

    public fu(Runnable runnable, long j) {
        super(j);
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.run();
    }

    @Override // defpackage.gu
    public final String toString() {
        return super.toString() + this.f;
    }
}
