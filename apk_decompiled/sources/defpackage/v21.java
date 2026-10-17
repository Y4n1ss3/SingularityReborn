package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.lumi.singularity.R;
import java.util.Objects;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class v21 implements View.OnApplyWindowInsetsListener {
    public final r21 a;
    public p31 b;

    public v21(View view, r21 r21Var) {
        p31 p31Var;
        this.a = r21Var;
        int i = u11.a;
        p31 a = q11.a(view);
        if (a != null) {
            int i2 = Build.VERSION.SDK_INT;
            p31Var = (i2 >= 34 ? new d31(a) : i2 >= 30 ? new c31(a) : new b31(a)).b();
        } else {
            p31Var = null;
        }
        this.b = p31Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = p31.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        p31 c = p31.c(windowInsets, view);
        m31 m31Var = c.a;
        p31 p31Var = this.b;
        if (p31Var == null) {
            int i = u11.a;
            p31Var = q11.a(view);
            this.b = p31Var;
        }
        if (p31Var == null) {
            this.b = c;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            r21 j = w21.j(view);
            if (j == null || !Objects.equals(j.mDispachedInsets, c)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                p31 p31Var2 = this.b;
                int i2 = 1;
                while (i2 <= 512) {
                    v00 g = m31Var.g(i2);
                    v00 g2 = p31Var2.a.g(i2);
                    int i3 = g.a;
                    int i4 = g.d;
                    int i5 = g.c;
                    int i6 = g.b;
                    int i7 = g2.a;
                    int i8 = g2.d;
                    int[] iArr4 = iArr2;
                    int i9 = g2.c;
                    int i10 = g2.b;
                    if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i2;
                        } else {
                            iArr[0] = iArr[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    p31 p31Var3 = this.b;
                    a31 a31Var = new a31(i13, (i11 & 8) != 0 ? w21.e : (i12 & 8) != 0 ? w21.f : (i11 & 519) != 0 ? w21.g : (i12 & 519) != 0 ? w21.h : null, (i13 & 8) != 0 ? 160L : 250L);
                    a31Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(a31Var.a.b());
                    v00 g3 = m31Var.g(i13);
                    v00 g4 = p31Var3.a.g(i13);
                    int min = Math.min(g3.a, g4.a);
                    int i14 = g3.b;
                    int i15 = g4.b;
                    int min2 = Math.min(i14, i15);
                    int i16 = g3.c;
                    int i17 = g4.c;
                    int min3 = Math.min(i16, i17);
                    int i18 = g3.d;
                    int i19 = g4.d;
                    q21 q21Var = new q21(v00.b(min, min2, min3, Math.min(i18, i19)), v00.b(Math.max(g3.a, g4.a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
                    w21.g(view, a31Var, c, false);
                    duration.addUpdateListener(new s21(a31Var, c, p31Var3, i13, view));
                    duration.addListener(new t21(a31Var, view));
                    vd0 vd0Var = new vd0(view, new u21(view, a31Var, q21Var, duration));
                    view.getViewTreeObserver().addOnPreDrawListener(vd0Var);
                    view.addOnAttachStateChangeListener(vd0Var);
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
