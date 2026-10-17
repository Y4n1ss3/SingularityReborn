package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ah extends bh {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(ah.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final zg g;
    public final boolean h;

    public /* synthetic */ ah(zg zgVar, boolean z) {
        this(zgVar, z, st.d, -3, mf.d);
    }

    @Override // defpackage.bh, defpackage.iw
    public final Object collect(jw jwVar, hm hmVar) {
        int i2 = this.e;
        vn vnVar = vn.d;
        if (i2 == -3) {
            boolean z = this.h;
            if (z && i.getAndSet(this, 1) != 0) {
                o.f("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object n = q10.n(jwVar, this.g, z, hmVar);
            if (n == vnVar) {
                return n;
            }
        } else {
            Object collect = super.collect(jwVar, hmVar);
            if (collect == vnVar) {
                return collect;
            }
        }
        return w01.a;
    }

    @Override // defpackage.bh
    public final String d() {
        return "channel=" + this.g;
    }

    @Override // defpackage.bh
    public final Object e(gg0 gg0Var, hm hmVar) {
        Object n = q10.n(new zn0(gg0Var), this.g, this.h, hmVar);
        return n == vn.d ? n : w01.a;
    }

    @Override // defpackage.bh
    public final bh f(kn knVar, int i2, mf mfVar) {
        return new ah(this.g, this.h, knVar, i2, mfVar);
    }

    @Override // defpackage.bh
    public final iw g() {
        return new ah(this.g, this.h);
    }

    @Override // defpackage.bh
    public final zg h(un unVar) {
        if (!this.h || i.getAndSet(this, 1) == 0) {
            return this.e == -3 ? this.g : super.h(unVar);
        }
        o.f("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public ah(zg zgVar, boolean z, kn knVar, int i2, mf mfVar) {
        super(knVar, i2, mfVar);
        this.g = zgVar;
        this.h = z;
        this.consumed$volatile = 0;
    }
}
