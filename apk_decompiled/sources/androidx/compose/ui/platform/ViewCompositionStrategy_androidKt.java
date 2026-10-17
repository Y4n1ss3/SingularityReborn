package androidx.compose.ui.platform;

import defpackage.a50;
import defpackage.c1;
import defpackage.iy;
import defpackage.q40;
import defpackage.r40;
import defpackage.s40;
import defpackage.y40;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewCompositionStrategy_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final iy installForLifecycle(AbstractComposeView abstractComposeView, s40 s40Var) {
        if (((a50) s40Var).d.compareTo(r40.d) > 0) {
            c1 c1Var = new c1(abstractComposeView, 2);
            s40Var.a(c1Var);
            return new ViewCompositionStrategy_androidKt$installForLifecycle$2(s40Var, c1Var);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + s40Var + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installForLifecycle$lambda$1(AbstractComposeView abstractComposeView, y40 y40Var, q40 q40Var) {
        if (q40Var == q40.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }
}
