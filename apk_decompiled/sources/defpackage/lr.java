package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class lr extends tl0 {
    public static final /* synthetic */ long h = dc.a.objectFieldOffset(lr.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.tl0, defpackage.i20
    public final void p(Object obj) {
        q(obj);
    }

    @Override // defpackage.tl0, defpackage.i20
    public final void q(Object obj) {
        while (true) {
            Unsafe unsafe = dc.a;
            long j = h;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    q10.B(d41.C(this.g), d41.F(obj));
                    return;
                } else {
                    o.f("Already resumed");
                    return;
                }
            }
            lr lrVar = this;
            if (unsafe.compareAndSwapInt(lrVar, j, 0, 2)) {
                return;
            } else {
                this = lrVar;
            }
        }
    }
}
