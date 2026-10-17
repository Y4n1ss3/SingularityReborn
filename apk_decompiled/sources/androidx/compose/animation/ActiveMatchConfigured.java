package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ActiveMatchConfigured extends MatchIsOrHasBeenConfigured {
    public static final int $stable = 0;
    private final MutableState currentBounds$delegate;
    private final MutableState targetBoundsProvider$delegate;
    private final TargetData targetData;

    public ActiveMatchConfigured(TargetData targetData, BoundsProvider boundsProvider, Rect rect) {
        this.targetData = targetData;
        this.targetBoundsProvider$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsProvider, null, 2, null);
        this.currentBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(rect, null, 2, null);
    }

    private void setCurrentBounds(Rect rect) {
        this.currentBounds$delegate.setValue(rect);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    /* renamed from: configureActiveMatch-38uP1EE, reason: not valid java name */
    public SharedTransitionStateMachine.State mo0configureActiveMatch38uP1EE(SharedElement sharedElement, BoundsProvider boundsProvider, long j, long j2, long j3) {
        SharedTransitionStateMachineKt.m97updateTargetDataBGTQxF0(getTargetData(), j, j2, j3, !q10.b(getTargetBoundsProvider(), boundsProvider));
        setTargetBoundsProvider(boundsProvider);
        return this;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public boolean getActiveMatchFound() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.MatchIsOrHasBeenConfigured, androidx.compose.animation.SharedTransitionStateMachine.State
    public Rect getCurrentBounds() {
        return (Rect) this.currentBounds$delegate.getValue();
    }

    public final BoundsProvider getTargetBoundsProvider() {
        return (BoundsProvider) this.targetBoundsProvider$delegate.getValue();
    }

    @Override // androidx.compose.animation.MatchIsOrHasBeenConfigured, androidx.compose.animation.SharedTransitionStateMachine.State
    public TargetData getTargetData() {
        return this.targetData;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        Rect calculateAlternativeTargetBounds = getTargetBoundsProvider().calculateAlternativeTargetBounds(RectKt.m4556Recttz77jQw(Offset.m4521plusMKHz9U(getTargetData().m110getCurrentMfrOffsetF1C5BW0(), getTargetData().m113getTargetStructuralOffsetF1C5BW0()), getTargetData().m112getSizeNHjbRc()));
        if (calculateAlternativeTargetBounds == null) {
            return NoMatchFound.INSTANCE;
        }
        TargetData targetData = new TargetData(calculateAlternativeTargetBounds.m4549getSizeNHjbRc(), getTargetData().m111getInitialMfrOffsetF1C5BW0(), Offset.m4520minusMKHz9U(calculateAlternativeTargetBounds.m4551getTopLeftF1C5BW0(), getTargetData().m110getCurrentMfrOffsetF1C5BW0()), null);
        targetData.m114setCurrentMfrOffsetk4lQ0M(getTargetData().m110getCurrentMfrOffsetF1C5BW0());
        return new ActiveMatchRemovedDuringTransition(targetData, getCurrentBounds());
    }

    public final void setTargetBoundsProvider(BoundsProvider boundsProvider) {
        this.targetBoundsProvider$delegate.setValue(boundsProvider);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public void updateBounds(Rect rect) {
        setCurrentBounds(rect);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public SharedTransitionStateMachine.State onMatchFound(BoundsProvider boundsProvider) {
        return this;
    }
}
