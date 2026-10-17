package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class l31 extends k31 {
    public static final p31 s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = p31.c(windowInsets, null);
    }

    public l31(p31 p31Var, WindowInsets windowInsets) {
        super(p31Var, windowInsets);
    }

    @Override // defpackage.k31, defpackage.f31, defpackage.m31
    public v00 g(int i) {
        Insets insets;
        insets = this.c.getInsets(o31.a(i));
        return v00.c(insets);
    }

    @Override // defpackage.k31, defpackage.f31, defpackage.m31
    public v00 h(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(o31.a(i));
        return v00.c(insetsIgnoringVisibility);
    }

    @Override // defpackage.k31, defpackage.f31, defpackage.m31
    public boolean q(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(o31.a(i));
        return isVisible;
    }

    public l31(p31 p31Var, l31 l31Var) {
        super(p31Var, l31Var);
    }
}
