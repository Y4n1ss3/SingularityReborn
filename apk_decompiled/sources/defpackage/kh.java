package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kh extends dn0 {
    public final of g;
    public final /* synthetic */ AtomicReferenceArray h;

    public kh(long j, kh khVar, of ofVar, int i) {
        super(j, khVar, i);
        this.g = ofVar;
        this.h = new AtomicReferenceArray(qf.b * 2);
    }

    @Override // defpackage.dn0
    public final int f() {
        return qf.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // defpackage.dn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, kn knVar) {
        int i2 = qf.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object k = k(i);
            boolean z2 = k instanceof f21;
            of ofVar = this.g;
            if (z2 || (k instanceof g21)) {
                if (j(i, k, z ? qf.j : qf.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        ofVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (k == qf.j || k == qf.k) {
                    break;
                }
                if (k != qf.g && k != qf.f) {
                    if (k == qf.i || k == qf.d || k == qf.l) {
                        return;
                    }
                    o.p(k, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            of ofVar = this.g;
            ofVar.getClass();
            ofVar.H((this.d * qf.b) + i);
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void n(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
