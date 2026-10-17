package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class t21 extends AnimatorListenerAdapter {
    public final /* synthetic */ a31 a;
    public final /* synthetic */ View b;

    public t21(a31 a31Var, View view) {
        this.a = a31Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a31 a31Var = this.a;
        a31Var.a.e(1.0f);
        w21.f(a31Var, this.b);
    }
}
