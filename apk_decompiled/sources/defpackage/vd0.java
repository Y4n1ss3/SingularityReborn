package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vd0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View d;
    public ViewTreeObserver e;
    public final u21 f;

    public vd0(View view, u21 u21Var) {
        this.d = view;
        this.e = view.getViewTreeObserver();
        this.f = u21Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.e.isAlive();
        View view = this.d;
        if (isAlive) {
            this.e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.e.isAlive();
        View view2 = this.d;
        if (isAlive) {
            this.e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
