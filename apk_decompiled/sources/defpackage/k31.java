package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class k31 extends i31 {
    public static final p31 r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = p31.c(windowInsets, null);
    }

    public k31(p31 p31Var, WindowInsets windowInsets) {
        super(p31Var, windowInsets);
    }

    @Override // defpackage.f31, defpackage.m31
    public v00 g(int i) {
        Insets insets;
        insets = this.c.getInsets(n31.a(i));
        return v00.c(insets);
    }

    @Override // defpackage.f31, defpackage.m31
    public v00 h(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(n31.a(i));
        return v00.c(insetsIgnoringVisibility);
    }

    @Override // defpackage.f31, defpackage.m31
    public boolean q(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(n31.a(i));
        return isVisible;
    }

    public k31(p31 p31Var, k31 k31Var) {
        super(p31Var, k31Var);
    }

    @Override // defpackage.f31, defpackage.m31
    public final void d(View view) {
    }
}
