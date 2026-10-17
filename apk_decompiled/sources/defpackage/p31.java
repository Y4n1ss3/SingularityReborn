package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class p31 {
    public static final p31 b;
    public final m31 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = l31.s;
        } else if (i >= 30) {
            b = k31.r;
        } else {
            b = m31.b;
        }
    }

    public p31(p31 p31Var) {
        if (p31Var == null) {
            this.a = new m31(this);
            return;
        }
        m31 m31Var = p31Var.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (m31Var instanceof l31)) {
            this.a = new l31(this, (l31) m31Var);
        } else if (i >= 30 && (m31Var instanceof k31)) {
            this.a = new k31(this, (k31) m31Var);
        } else if (m31Var instanceof i31) {
            this.a = new i31(this, (i31) m31Var);
        } else if (m31Var instanceof h31) {
            this.a = new h31(this, (h31) m31Var);
        } else if (m31Var instanceof g31) {
            this.a = new g31(this, (g31) m31Var);
        } else if (m31Var instanceof f31) {
            this.a = new f31(this, (f31) m31Var);
        } else {
            this.a = new m31(this);
        }
        m31Var.e(this);
    }

    public static v00 a(v00 v00Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, v00Var.a - i);
        int max2 = Math.max(0, v00Var.b - i2);
        int max3 = Math.max(0, v00Var.c - i3);
        int max4 = Math.max(0, v00Var.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? v00Var : v00.b(max, max2, max3, max4);
    }

    public static p31 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        p31 p31Var = new p31(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = u11.a;
            p31 a = q11.a(view);
            m31 m31Var = p31Var.a;
            m31Var.t(a);
            m31Var.d(view.getRootView());
            m31Var.u(view.getWindowSystemUiVisibility());
        }
        return p31Var;
    }

    public final WindowInsets b() {
        m31 m31Var = this.a;
        if (m31Var instanceof f31) {
            return ((f31) m31Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p31) {
            return Objects.equals(this.a, ((p31) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        m31 m31Var = this.a;
        if (m31Var == null) {
            return 0;
        }
        return m31Var.hashCode();
    }

    public p31(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new l31(this, windowInsets);
        } else if (i >= 30) {
            this.a = new k31(this, windowInsets);
        } else {
            this.a = new i31(this, windowInsets);
        }
    }
}
