package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {
    public static final int $stable = 8;
    private final MutableState<IntSize> targetSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7774boximpl(IntSize.Companion.m7787getZeroYbymL2g()), null, 2, null);
    private Transition<EnterExitState> transition;

    public AnimatedVisibilityScopeImpl(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    public final MutableState<IntSize> getTargetSize$animation() {
        return this.targetSize;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public void setTransition(Transition<EnterExitState> transition) {
        this.transition = transition;
    }
}
