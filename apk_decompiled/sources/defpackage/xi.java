package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class xi implements a30 {
    public final a30 a;

    public xi(a30 a30Var) {
        this.a = a30Var;
    }

    @Override // defpackage.a30
    public void a(uk0 uk0Var, Object obj) {
        int g = g(obj);
        go0 c = c();
        c.getClass();
        uk0 a = uk0Var.a(c);
        Iterator f = f(obj);
        for (int i = 0; i < g; i++) {
            a.i(c(), i, this.a, f.next());
        }
    }

    @Override // defpackage.a30
    public Object b(d41 d41Var) {
        return i(d41Var);
    }

    public abstract Object d();

    public abstract int e(Object obj);

    public abstract Iterator f(Object obj);

    public abstract int g(Object obj);

    public abstract void h(int i, Object obj, Object obj2);

    public final Object i(d41 d41Var) {
        Object d = d();
        int e = e(d);
        d41 d2 = d41Var.d(c());
        while (true) {
            int k = d2.k(c());
            if (k == -1) {
                c().getClass();
                return l(d);
            }
            j(d2, k + e, d);
        }
    }

    public void j(d41 d41Var, int i, Object obj) {
        h(i, obj, d41Var.p(c(), this.a));
    }

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
