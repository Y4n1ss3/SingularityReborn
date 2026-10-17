package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class xh extends d20 {
    public final gg h;

    public xh(gg ggVar) {
        this.h = ggVar;
    }

    @Override // defpackage.d20
    public final boolean k() {
        return true;
    }

    @Override // defpackage.d20
    public final void l(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        i20 j = j();
        gg ggVar = this.h;
        Throwable r = ggVar.r(j);
        if (ggVar.x()) {
            kr krVar = (kr) ggVar.g;
            long j2 = kr.k;
            loop0: while (true) {
                Object objectVolatile = dc.a.getObjectVolatile(krVar, j2);
                ox oxVar = q10.f;
                if (q10.b(objectVolatile, oxVar)) {
                    do {
                        unsafe = dc.a;
                        if (unsafe.compareAndSwapObject(krVar, kr.k, oxVar, r)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(krVar, j2) == oxVar);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = dc.a;
                        if (unsafe2.compareAndSwapObject(krVar, kr.k, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(krVar, j2) == objectVolatile);
                }
            }
        }
        ggVar.l(r);
        if (ggVar.x()) {
            return;
        }
        ggVar.p();
    }
}
