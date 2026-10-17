package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class f0 extends p10 {
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;

    public f0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.k = atomicReferenceFieldUpdater;
        this.l = atomicReferenceFieldUpdater2;
        this.m = atomicReferenceFieldUpdater3;
        this.n = atomicReferenceFieldUpdater4;
        this.o = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.p10
    public final void B(h0 h0Var, h0 h0Var2) {
        this.l.lazySet(h0Var, h0Var2);
    }

    @Override // defpackage.p10
    public final void C(h0 h0Var, Thread thread) {
        this.k.lazySet(h0Var, thread);
    }

    @Override // defpackage.p10
    public final boolean i(i0 i0Var, e0 e0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(i0Var, e0Var, e0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(i0Var) == e0Var);
        return false;
    }

    @Override // defpackage.p10
    public final boolean j(i0 i0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(i0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(i0Var) == obj);
        return false;
    }

    @Override // defpackage.p10
    public final boolean k(i0 i0Var, h0 h0Var, h0 h0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(i0Var, h0Var, h0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(i0Var) == h0Var);
        return false;
    }
}
