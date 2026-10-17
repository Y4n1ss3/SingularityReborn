package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class s21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a31 a;
    public final /* synthetic */ p31 b;
    public final /* synthetic */ p31 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public s21(a31 a31Var, p31 p31Var, p31 p31Var2, int i, View view) {
        this.a = a31Var;
        this.b = p31Var;
        this.c = p31Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        a31 a31Var = this.a;
        z21 z21Var = a31Var.a;
        z21Var.e(animatedFraction);
        float c = z21Var.c();
        PathInterpolator pathInterpolator = w21.e;
        int i = Build.VERSION.SDK_INT;
        p31 p31Var = this.b;
        e31 d31Var = i >= 34 ? new d31(p31Var) : i >= 30 ? new c31(p31Var) : new b31(p31Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            m31 m31Var = p31Var.a;
            if (i3 == 0) {
                d31Var.c(i2, m31Var.g(i2));
            } else {
                v00 g = m31Var.g(i2);
                v00 g2 = this.c.a.g(i2);
                float f = 1.0f - c;
                d31Var.c(i2, p31.a(g, (int) (((g.a - g2.a) * f) + 0.5d), (int) (((g.b - g2.b) * f) + 0.5d), (int) (((g.c - g2.c) * f) + 0.5d), (int) (((g.d - g2.d) * f) + 0.5d)));
            }
        }
        w21.h(this.e, d31Var.b(), Collections.singletonList(a31Var));
    }
}
