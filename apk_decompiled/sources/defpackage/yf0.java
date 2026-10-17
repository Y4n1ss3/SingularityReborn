package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class yf0 extends xi {
    public final xf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(a30 a30Var) {
        super(a30Var);
        a30Var.getClass();
        this.b = new xf0(a30Var.c());
    }

    @Override // defpackage.xi, defpackage.a30
    public final void a(uk0 uk0Var, Object obj) {
        n(uk0Var.a(this.b), obj, g(obj));
    }

    @Override // defpackage.xi, defpackage.a30
    public final Object b(d41 d41Var) {
        return i(d41Var);
    }

    @Override // defpackage.a30
    public final go0 c() {
        return this.b;
    }

    @Override // defpackage.xi
    public final Object d() {
        return (wf0) k(m());
    }

    @Override // defpackage.xi
    public final int e(Object obj) {
        wf0 wf0Var = (wf0) obj;
        wf0Var.getClass();
        return wf0Var.d();
    }

    @Override // defpackage.xi
    public final Iterator f(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.xi
    public final void h(int i, Object obj, Object obj2) {
        ((wf0) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // defpackage.xi
    public final Object l(Object obj) {
        wf0 wf0Var = (wf0) obj;
        wf0Var.getClass();
        return wf0Var.a();
    }

    public abstract Object m();

    public abstract void n(uk0 uk0Var, Object obj, int i);
}
