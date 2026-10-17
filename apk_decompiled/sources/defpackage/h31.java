package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class h31 extends g31 {
    public h31(p31 p31Var, WindowInsets windowInsets) {
        super(p31Var, windowInsets);
    }

    @Override // defpackage.m31
    public p31 a() {
        return p31.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.f31, defpackage.m31
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h31)) {
            return false;
        }
        h31 h31Var = (h31) obj;
        return Objects.equals(this.c, h31Var.c) && Objects.equals(this.g, h31Var.g) && f31.B(this.h, h31Var.h);
    }

    @Override // defpackage.m31
    public pr f() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new pr(displayCutout);
    }

    @Override // defpackage.m31
    public int hashCode() {
        return this.c.hashCode();
    }

    public h31(p31 p31Var, h31 h31Var) {
        super(p31Var, h31Var);
    }
}
