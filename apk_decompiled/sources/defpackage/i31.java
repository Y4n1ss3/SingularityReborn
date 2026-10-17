package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class i31 extends h31 {
    public v00 o;
    public v00 p;
    public v00 q;

    public i31(p31 p31Var, WindowInsets windowInsets) {
        super(p31Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.m31
    public v00 i() {
        v00 v00Var = this.p;
        if (v00Var != null) {
            return v00Var;
        }
        v00 c = v00.c(this.c.getMandatorySystemGestureInsets());
        this.p = c;
        return c;
    }

    @Override // defpackage.m31
    public v00 k() {
        v00 v00Var = this.o;
        if (v00Var != null) {
            return v00Var;
        }
        v00 c = v00.c(this.c.getSystemGestureInsets());
        this.o = c;
        return c;
    }

    @Override // defpackage.m31
    public v00 m() {
        v00 v00Var = this.q;
        if (v00Var != null) {
            return v00Var;
        }
        v00 c = v00.c(this.c.getTappableElementInsets());
        this.q = c;
        return c;
    }

    @Override // defpackage.f31, defpackage.m31
    public p31 n(int i, int i2, int i3, int i4) {
        return p31.c(this.c.inset(i, i2, i3, i4), null);
    }

    public i31(p31 p31Var, i31 i31Var) {
        super(p31Var, i31Var);
        this.o = null;
        this.p = null;
        this.q = null;
    }
}
