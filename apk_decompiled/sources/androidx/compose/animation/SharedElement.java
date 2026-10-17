package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.dj;
import defpackage.iy;
import defpackage.p01;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedElement {
    public static final int $stable = 8;
    private final SnapshotStateList<SharedElementEntry> _allEntries;
    private final SnapshotStateList<SharedElementEntry> _enabledEntries;
    private boolean animationSpecFinalized;
    private final Object key;
    private final Animatable<Offset, AnimationVector2D> momentumAnimation;
    private final iy momentumAnimationOffset;
    private final iy observingVisibilityChange;
    private final SharedTransitionScopeImpl scope;
    private final SharedTransitionStateMachine stateMachine = new SharedTransitionStateMachine(this);

    public SharedElement(Object obj, SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.key = obj;
        this.scope = sharedTransitionScopeImpl;
        Offset.Companion companion = Offset.Companion;
        this.momentumAnimation = new Animatable<>(Offset.m4505boximpl(companion.m4532getZeroF1C5BW0()), VectorConvertersKt.getVectorConverter(companion), null, null, 12, null);
        this.momentumAnimationOffset = new SharedElement$momentumAnimationOffset$1(this);
        this._allEntries = SnapshotStateKt.mutableStateListOf();
        this._enabledEntries = SnapshotStateKt.mutableStateListOf();
        this.observingVisibilityChange = new SharedElement$observingVisibilityChange$1(this);
    }

    public final void addEntry(SharedElementEntry sharedElementEntry) {
        this._allEntries.add(sharedElementEntry);
        updateMatch$animation();
    }

    public final List<SharedElementEntry> getAllEntries() {
        return this._allEntries;
    }

    public final boolean getBoundsTransformIsActive() {
        return getState$animation().getMatchIsOrHasBeenConfigured();
    }

    public final List<SharedElementEntry> getEnabledEntries() {
        return this._enabledEntries;
    }

    public final boolean getFoundMatch() {
        return getState$animation().getActiveMatchFound() || getState$animation().getMatchIsOrHasBeenConfigured() || this.stateMachine.getActiveMatchDeferred();
    }

    public final Object getKey() {
        return this.key;
    }

    public final iy getMomentumAnimationOffset() {
        return this.momentumAnimationOffset;
    }

    public final iy getObservingVisibilityChange$animation() {
        return this.observingVisibilityChange;
    }

    public final SharedTransitionScopeImpl getScope() {
        return this.scope;
    }

    public final SharedTransitionStateMachine.State getState$animation() {
        return this.stateMachine.getState();
    }

    public final void invalidateTargetBoundsProvider() {
        this.stateMachine.invalidateTargetBoundsProvider();
    }

    public final boolean isAnimating() {
        List<SharedElementEntry> enabledEntries = getEnabledEntries();
        int size = enabledEntries.size();
        for (int i = 0; i < size; i++) {
            if (enabledEntries.get(i).getBoundsAnimation().isRunning()) {
                return true;
            }
        }
        return false;
    }

    public final void onLookaheadPlaced(Placeable.PlacementScope placementScope, SharedElementEntry sharedElementEntry) {
        LayoutCoordinates coordinates;
        this.stateMachine.processPendingRequest();
        if (q10.b(getState$animation(), NoMatchFound.INSTANCE) || !sharedElementEntry.isEnabled()) {
            return;
        }
        SharedTransitionStateMachine.State state$animation = getState$animation();
        if (sharedElementEntry.getBoundsAnimation().getTarget() && state$animation.getActiveMatchFound() && (coordinates = placementScope.getCoordinates()) != null) {
            long m7794toSizeozmzZPI = IntSizeKt.m7794toSizeozmzZPI(coordinates.mo6242getSizeYbymL2g());
            long m6265localLookaheadPositionOfauaQtc$default = LookaheadScope.m6265localLookaheadPositionOfauaQtc$default(sharedElementEntry.getSharedElement().scope, sharedElementEntry.getSharedElement().scope.getLookaheadRoot$animation(), coordinates, 0L, false, 6, null);
            SharedTransitionScopeImpl sharedTransitionScopeImpl = sharedElementEntry.getSharedElement().scope;
            this.stateMachine.m95configureActiveMatchL7TYDSY(m7794toSizeozmzZPI, m6265localLookaheadPositionOfauaQtc$default, LayoutCoordinates.m6241localPositionOfS_NoaFU$default(sharedElementEntry.getSharedElement().scope.getLookaheadRoot$animation(), coordinates, 0L, false, 2, null));
        }
    }

    public final void onSharedTransitionFinished() {
        boolean hasVisibleContent;
        if (getEnabledEntries().size() > 1) {
            hasVisibleContent = SharedElementKt.hasVisibleContent(getEnabledEntries());
            if (hasVisibleContent) {
                return;
            }
        }
        this.stateMachine.resetState();
    }

    public final void removeEntry(SharedElementEntry sharedElementEntry) {
        this._allEntries.remove(sharedElementEntry);
        this._enabledEntries.remove(sharedElementEntry);
        updateMatch$animation();
    }

    public final Rect tryInitializingCurrentBounds() {
        return this.stateMachine.tryInitializingCurrentBounds();
    }

    /* renamed from: updateExitVelocity-TH1AsA0$animation, reason: not valid java name */
    public final void m83updateExitVelocityTH1AsA0$animation(long j) {
        p01.t(this.scope.getCoroutineScope(), null, null, new SharedElement$updateExitVelocity$1(this, j, null), 3);
    }

    public final void updateMatch$animation() {
        boolean hasVisibleContent;
        iy testBlockToRun = this.scope.getTestBlockToRun();
        if (testBlockToRun != null) {
            testBlockToRun.invoke();
        }
        dj.g0(new SharedElement$updateMatch$1(this), this._enabledEntries);
        List<SharedElementEntry> allEntries = getAllEntries();
        int size = allEntries.size();
        for (int i = 0; i < size; i++) {
            SharedElementEntry sharedElementEntry = allEntries.get(i);
            if (sharedElementEntry.isEnabled() && !getEnabledEntries().contains(sharedElementEntry)) {
                this._enabledEntries.add(sharedElementEntry);
            }
        }
        hasVisibleContent = SharedElementKt.hasVisibleContent(this._enabledEntries);
        this.stateMachine.checkForAndDeferStateUpdates(hasVisibleContent);
    }
}
