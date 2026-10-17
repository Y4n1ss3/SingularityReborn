package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import defpackage.dq;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ActiveMatchFoundConfigPending extends SharedTransitionStateMachine.State {
    public static final int $stable = 8;
    private final MutableState currentBounds$delegate;
    private BoundsProvider targetBoundsProviderBeforeConfig;
    private final TargetData targetData;

    public ActiveMatchFoundConfigPending(BoundsProvider boundsProvider, TargetData targetData, Rect rect) {
        super(null);
        this.targetBoundsProviderBeforeConfig = boundsProvider;
        this.targetData = targetData;
        this.currentBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(rect, null, 2, null);
    }

    private void setCurrentBounds(Rect rect) {
        this.currentBounds$delegate.setValue(rect);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    /* renamed from: configureActiveMatch-38uP1EE */
    public SharedTransitionStateMachine.State mo0configureActiveMatch38uP1EE(SharedElement sharedElement, BoundsProvider boundsProvider, long j, long j2, long j3) {
        long j4;
        SharedElementEntry sharedElementEntry;
        TargetData targetData = getTargetData();
        if (targetData == null) {
            targetData = new TargetData(j, Offset.m4520minusMKHz9U(j2, j3), j3, null);
        }
        Rect currentBounds = getCurrentBounds();
        if (currentBounds == null) {
            BoundsProvider boundsProvider2 = this.targetBoundsProviderBeforeConfig;
            if (boundsProvider2 == null) {
                List<SharedElementEntry> allEntries = sharedElement.getAllEntries();
                int size = allEntries.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        sharedElementEntry = null;
                        break;
                    }
                    sharedElementEntry = allEntries.get(i);
                    if (sharedElement.getEnabledEntries().contains(sharedElementEntry)) {
                        break;
                    }
                    i++;
                }
                SharedElementEntry sharedElementEntry2 = sharedElementEntry;
                boundsProvider2 = sharedElementEntry2 != null ? sharedElementEntry2.getBoundsProvider() : null;
            }
            currentBounds = SharedTransitionStateMachineKt.obtainBoundsFromLastTarget(sharedElement, boundsProvider2);
            if (currentBounds == null) {
                j4 = j2;
                currentBounds = RectKt.m4556Recttz77jQw(j4, j);
                TargetData targetData2 = targetData;
                SharedTransitionStateMachineKt.m97updateTargetDataBGTQxF0(targetData2, j, j4, j3, true);
                return new ActiveMatchConfigured(targetData2, boundsProvider, currentBounds);
            }
        }
        j4 = j2;
        TargetData targetData22 = targetData;
        SharedTransitionStateMachineKt.m97updateTargetDataBGTQxF0(targetData22, j, j4, j3, true);
        return new ActiveMatchConfigured(targetData22, boundsProvider, currentBounds);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public boolean getActiveMatchFound() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public Rect getCurrentBounds() {
        return (Rect) this.currentBounds$delegate.getValue();
    }

    public final BoundsProvider getTargetBoundsProviderBeforeConfig() {
        return this.targetBoundsProviderBeforeConfig;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public TargetData getTargetData() {
        return this.targetData;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public Rect initializeCurrentBounds(SharedElement sharedElement) {
        Rect obtainBoundsFromLastTarget;
        SharedElementEntry sharedElementEntry;
        Rect currentBounds = getCurrentBounds();
        if (currentBounds != null) {
            return currentBounds;
        }
        if (getCurrentBounds() == null) {
            BoundsProvider boundsProvider = this.targetBoundsProviderBeforeConfig;
            if (boundsProvider == null) {
                List<SharedElementEntry> allEntries = sharedElement.getAllEntries();
                int size = allEntries.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        sharedElementEntry = null;
                        break;
                    }
                    sharedElementEntry = allEntries.get(i);
                    if (sharedElement.getEnabledEntries().contains(sharedElementEntry)) {
                        break;
                    }
                    i++;
                }
                SharedElementEntry sharedElementEntry2 = sharedElementEntry;
                boundsProvider = sharedElementEntry2 != null ? sharedElementEntry2.getBoundsProvider() : null;
            }
            obtainBoundsFromLastTarget = SharedTransitionStateMachineKt.obtainBoundsFromLastTarget(sharedElement, boundsProvider);
            if (obtainBoundsFromLastTarget != null) {
                setCurrentBounds(obtainBoundsFromLastTarget);
            }
        }
        return getCurrentBounds();
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public SharedTransitionStateMachine.State onMatchFound(BoundsProvider boundsProvider) {
        if (this.targetBoundsProviderBeforeConfig == null) {
            this.targetBoundsProviderBeforeConfig = boundsProvider;
        }
        return this;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        return NoMatchFound.INSTANCE;
    }

    public final void setTargetBoundsProviderBeforeConfig(BoundsProvider boundsProvider) {
        this.targetBoundsProviderBeforeConfig = boundsProvider;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public void updateBounds(Rect rect) {
        setCurrentBounds(rect);
    }

    public /* synthetic */ ActiveMatchFoundConfigPending(BoundsProvider boundsProvider, TargetData targetData, Rect rect, int i, dq dqVar) {
        this(boundsProvider, (i & 2) != 0 ? null : targetData, (i & 4) != 0 ? null : rect);
    }
}
