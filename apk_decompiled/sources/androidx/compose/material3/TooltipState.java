package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import defpackage.hm;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TooltipState {
    static /* synthetic */ Object show$default(TooltipState tooltipState, MutatePriority mutatePriority, hm hmVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: show");
            return null;
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return tooltipState.show(mutatePriority, hmVar);
    }

    void dismiss();

    MutableTransitionState<Boolean> getTransition();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    Object show(MutatePriority mutatePriority, hm hmVar);
}
