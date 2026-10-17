package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class f31 extends m31 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public v00[] d;
    public v00 e;
    public p31 f;
    public v00 g;
    public int h;

    public f31(p31 p31Var, f31 f31Var) {
        this(p31Var, new WindowInsets(f31Var.c));
    }

    private static void A() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public static boolean B(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private v00 v(int i2, boolean z) {
        v00 v00Var = v00.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                v00Var = v00.a(v00Var, w(i3, z));
            }
        }
        return v00Var;
    }

    private v00 x() {
        p31 p31Var = this.f;
        return p31Var != null ? p31Var.a.j() : v00.e;
    }

    private v00 y(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            lu0.a("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!i) {
            A();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(invoke));
                if (rect != null) {
                    return v00.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @Override // defpackage.m31
    public void d(View view) {
        v00 y = y(view);
        if (y == null) {
            y = v00.e;
        }
        s(y);
    }

    @Override // defpackage.m31
    public void e(p31 p31Var) {
        p31Var.a.t(this.f);
        v00 v00Var = this.g;
        m31 m31Var = p31Var.a;
        m31Var.s(v00Var);
        m31Var.u(this.h);
    }

    @Override // defpackage.m31
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        f31 f31Var = (f31) obj;
        return Objects.equals(this.g, f31Var.g) && B(this.h, f31Var.h);
    }

    @Override // defpackage.m31
    public v00 g(int i2) {
        return v(i2, false);
    }

    @Override // defpackage.m31
    public v00 h(int i2) {
        return v(i2, true);
    }

    @Override // defpackage.m31
    public final v00 l() {
        v00 v00Var = this.e;
        if (v00Var != null) {
            return v00Var;
        }
        WindowInsets windowInsets = this.c;
        v00 b = v00.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = b;
        return b;
    }

    @Override // defpackage.m31
    public p31 n(int i2, int i3, int i4, int i5) {
        p31 c = p31.c(this.c, null);
        int i6 = Build.VERSION.SDK_INT;
        e31 d31Var = i6 >= 34 ? new d31(c) : i6 >= 30 ? new c31(c) : new b31(c);
        d31Var.g(p31.a(l(), i2, i3, i4, i5));
        d31Var.e(p31.a(j(), i2, i3, i4, i5));
        return d31Var.b();
    }

    @Override // defpackage.m31
    public boolean p() {
        return this.c.isRound();
    }

    @Override // defpackage.m31
    public boolean q(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !z(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.m31
    public void r(v00[] v00VarArr) {
        this.d = v00VarArr;
    }

    @Override // defpackage.m31
    public void s(v00 v00Var) {
        this.g = v00Var;
    }

    @Override // defpackage.m31
    public void t(p31 p31Var) {
        this.f = p31Var;
    }

    @Override // defpackage.m31
    public void u(int i2) {
        this.h = i2;
    }

    public v00 w(int i2, boolean z) {
        v00 j2;
        int i3;
        v00 v00Var = v00.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    v00[] v00VarArr = this.d;
                    j2 = v00VarArr != null ? v00VarArr[cq.v(8)] : null;
                    if (j2 != null) {
                        return j2;
                    }
                    v00 l2 = l();
                    v00 x = x();
                    int i4 = l2.d;
                    if (i4 > x.d) {
                        return v00.b(0, 0, 0, i4);
                    }
                    v00 v00Var2 = this.g;
                    if (v00Var2 != null && !v00Var2.equals(v00Var) && (i3 = this.g.d) > x.d) {
                        return v00.b(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return k();
                    }
                    if (i2 == 32) {
                        return i();
                    }
                    if (i2 == 64) {
                        return m();
                    }
                    if (i2 == 128) {
                        p31 p31Var = this.f;
                        pr f = p31Var != null ? p31Var.a.f() : f();
                        if (f != null) {
                            DisplayCutout displayCutout = f.a;
                            return v00.b(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
            } else {
                if (z) {
                    v00 x2 = x();
                    v00 j3 = j();
                    return v00.b(Math.max(x2.a, j3.a), 0, Math.max(x2.c, j3.c), Math.max(x2.d, j3.d));
                }
                if ((this.h & 2) == 0) {
                    v00 l3 = l();
                    p31 p31Var2 = this.f;
                    j2 = p31Var2 != null ? p31Var2.a.j() : null;
                    int i5 = l3.d;
                    if (j2 != null) {
                        i5 = Math.min(i5, j2.d);
                    }
                    return v00.b(l3.a, 0, l3.c, i5);
                }
            }
        } else {
            if (z) {
                return v00.b(0, Math.max(x().b, l().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return v00.b(0, l().b, 0, 0);
            }
        }
        return v00Var;
    }

    public boolean z(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !w(i2, false).equals(v00.e);
    }

    public f31(p31 p31Var, WindowInsets windowInsets) {
        super(p31Var);
        this.e = null;
        this.c = windowInsets;
    }
}
