package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class g31 extends f31 {
    public v00 n;

    public g31(p31 p31Var, g31 g31Var) {
        super(p31Var, g31Var);
        this.n = null;
        this.n = g31Var.n;
    }

    @Override // defpackage.m31
    public p31 b() {
        return p31.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.m31
    public p31 c() {
        return p31.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.m31
    public final v00 j() {
        v00 v00Var = this.n;
        if (v00Var != null) {
            return v00Var;
        }
        WindowInsets windowInsets = this.c;
        v00 b = v00.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.n = b;
        return b;
    }

    @Override // defpackage.m31
    public boolean o() {
        return this.c.isConsumed();
    }

    public g31(p31 p31Var, WindowInsets windowInsets) {
        super(p31Var, windowInsets);
        this.n = null;
    }
}
