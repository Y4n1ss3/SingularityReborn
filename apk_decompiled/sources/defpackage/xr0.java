package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class xr0 extends m0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.m0
    public final boolean a(l0 l0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(p10.i);
        return true;
    }

    @Override // defpackage.m0
    public final hm[] b(l0 l0Var) {
        this.a.set(null);
        return cq.a;
    }
}
