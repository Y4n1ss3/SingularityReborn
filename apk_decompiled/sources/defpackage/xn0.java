package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class xn0 extends dn0 {
    public final /* synthetic */ AtomicReferenceArray g;

    public xn0(long j, xn0 xn0Var, int i) {
        super(j, xn0Var, i);
        this.g = new AtomicReferenceArray(wn0.f);
    }

    @Override // defpackage.dn0
    public final int f() {
        return wn0.f;
    }

    @Override // defpackage.dn0
    public final void g(int i, kn knVar) {
        this.g.set(i, wn0.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
