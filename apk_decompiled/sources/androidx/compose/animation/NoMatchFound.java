package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoMatchFound extends SharedTransitionStateMachine.State {
    public static final int $stable = 0;
    public static final NoMatchFound INSTANCE = new NoMatchFound();

    private NoMatchFound() {
        super(null);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public SharedTransitionStateMachine.State onMatchFound(BoundsProvider boundsProvider) {
        return new ActiveMatchFoundConfigPending(boundsProvider, null, null, 6, null);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        return this;
    }
}
