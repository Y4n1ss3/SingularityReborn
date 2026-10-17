package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class b20 extends i20 implements pj {
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(z10 z10Var) {
        super(true);
        boolean z = true;
        H(z10Var);
        Unsafe unsafe = dc.a;
        long j = i20.d;
        yh yhVar = (yh) unsafe.getObjectVolatile(this, j);
        zh zhVar = yhVar instanceof zh ? (zh) yhVar : null;
        if (zhVar != null) {
            i20 j2 = zhVar.j();
            while (!j2.B()) {
                yh yhVar2 = (yh) dc.a.getObjectVolatile(j2, j);
                zh zhVar2 = yhVar2 instanceof zh ? (zh) yhVar2 : null;
                if (zhVar2 != null) {
                    j2 = zhVar2.j();
                }
            }
            this.f = z;
        }
        z = false;
        this.f = z;
    }

    @Override // defpackage.i20
    public final boolean B() {
        return this.f;
    }

    @Override // defpackage.i20
    public final boolean C() {
        return true;
    }
}
