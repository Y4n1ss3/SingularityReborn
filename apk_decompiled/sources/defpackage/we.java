package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class we implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public we(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w80 w80Var = this.a.n;
        if (w80Var != null) {
            v80 v80Var = w80Var.a;
            if (v80Var.h != floatValue) {
                v80Var.h = floatValue;
                w80Var.e = true;
                w80Var.invalidateSelf();
            }
        }
    }
}
