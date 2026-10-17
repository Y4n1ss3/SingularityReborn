package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class MatchIsOrHasBeenConfigured extends SharedTransitionStateMachine.State {
    public static final int $stable = 0;

    public MatchIsOrHasBeenConfigured() {
        super(null);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public abstract Rect getCurrentBounds();

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public boolean getMatchIsOrHasBeenConfigured() {
        return true;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public abstract TargetData getTargetData();
}
