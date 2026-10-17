package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class nb0 implements fg, f21 {
    public final gg d;
    public final /* synthetic */ ob0 e;

    public nb0(ob0 ob0Var, gg ggVar) {
        this.e = ob0Var;
        this.d = ggVar;
    }

    @Override // defpackage.f21
    public final void a(dn0 dn0Var, int i) {
        this.d.a(dn0Var, i);
    }

    @Override // defpackage.fg
    public final ox c(Object obj, ny nyVar) {
        ob0 ob0Var = this.e;
        x6 x6Var = new x6(ob0Var, this);
        ox c = this.d.c((w01) obj, x6Var);
        if (c != null) {
            ob0.h.set(ob0Var, null);
        }
        return c;
    }

    @Override // defpackage.fg
    public final void d(ky kyVar) {
        this.d.d(kyVar);
    }

    @Override // defpackage.hm
    public final kn getContext() {
        return this.d.h;
    }

    @Override // defpackage.fg
    public final boolean isActive() {
        return this.d.t() instanceof vc0;
    }

    @Override // defpackage.fg
    public final void k(Object obj, ny nyVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ob0.h;
        ob0 ob0Var = this.e;
        atomicReferenceFieldUpdater.set(ob0Var, null);
        mb0 mb0Var = new mb0(ob0Var, this);
        gg ggVar = this.d;
        ggVar.B((w01) obj, ggVar.f, new x6(mb0Var, 2));
    }

    @Override // defpackage.fg
    public final boolean l(Throwable th) {
        return this.d.l(th);
    }

    @Override // defpackage.fg
    public final void o(Object obj) {
        this.d.o(obj);
    }

    @Override // defpackage.hm
    public final void resumeWith(Object obj) {
        this.d.resumeWith(obj);
    }
}
