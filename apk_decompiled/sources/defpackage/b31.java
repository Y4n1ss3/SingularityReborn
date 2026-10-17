package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class b31 extends e31 {
    public final WindowInsets.Builder c;

    public b31(p31 p31Var) {
        super(p31Var);
        WindowInsets b = p31Var.b();
        this.c = b != null ? new WindowInsets.Builder(b) : new WindowInsets.Builder();
    }

    @Override // defpackage.e31
    public p31 b() {
        a();
        p31 c = p31.c(this.c.build(), null);
        c.a.r(this.b);
        return c;
    }

    @Override // defpackage.e31
    public void d(v00 v00Var) {
        this.c.setMandatorySystemGestureInsets(v00Var.d());
    }

    @Override // defpackage.e31
    public void e(v00 v00Var) {
        this.c.setStableInsets(v00Var.d());
    }

    @Override // defpackage.e31
    public void f(v00 v00Var) {
        this.c.setSystemGestureInsets(v00Var.d());
    }

    @Override // defpackage.e31
    public void g(v00 v00Var) {
        this.c.setSystemWindowInsets(v00Var.d());
    }

    @Override // defpackage.e31
    public void h(v00 v00Var) {
        this.c.setTappableElementInsets(v00Var.d());
    }

    public b31() {
        this.c = new WindowInsets.Builder();
    }
}
