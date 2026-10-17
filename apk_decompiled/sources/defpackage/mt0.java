package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class mt0 extends lt0 {
    public final Runnable f;

    public mt0(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(cq.r(runnable));
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        return c21.a(sb, this.e ? "Blocking" : "Non-blocking", ']');
    }
}
