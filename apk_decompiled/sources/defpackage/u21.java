package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class u21 implements Runnable {
    public final /* synthetic */ View d;
    public final /* synthetic */ a31 e;
    public final /* synthetic */ q21 f;
    public final /* synthetic */ ValueAnimator g;

    public u21(View view, a31 a31Var, q21 q21Var, ValueAnimator valueAnimator) {
        this.d = view;
        this.e = a31Var;
        this.f = q21Var;
        this.g = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w21.i(this.d, this.e, this.f);
        this.g.start();
    }
}
