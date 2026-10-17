package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntOffset;
import defpackage.dq;
import defpackage.iy;
import defpackage.ms;
import defpackage.p01;
import defpackage.un;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation {
    private final un coroutineScope;
    private FiniteAnimationSpec<Float> fadeInSpec;
    private FiniteAnimationSpec<Float> fadeOutSpec;
    private long finalOffset;
    private final GraphicsContext graphicsContext;
    private final MutableState isAppearanceAnimationInProgress$delegate;
    private final MutableState isDisappearanceAnimationFinished$delegate;
    private final MutableState isDisappearanceAnimationInProgress$delegate;
    private final MutableState isPlacementAnimationInProgress$delegate;
    private boolean isRunningMovingAwayAnimation;
    private GraphicsLayer layer;
    private long lookaheadOffset;
    private final iy onLayerPropertyChanged;
    private final MutableState placementDelta$delegate;
    private final Animatable<IntOffset, AnimationVector2D> placementDeltaAnimation;
    private FiniteAnimationSpec<IntOffset> placementSpec;
    private long rawOffset;
    private final Animatable<Float, AnimationVector1D> visibilityAnimation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final long NotInitialized = IntOffset.m7733constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);

    public LazyLayoutItemAnimation(un unVar, GraphicsContext graphicsContext, iy iyVar) {
        this.coroutineScope = unVar;
        this.graphicsContext = graphicsContext;
        this.onLayerPropertyChanged = iyVar;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isAppearanceAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisappearanceAnimationFinished$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        long j = NotInitialized;
        this.rawOffset = j;
        IntOffset.Companion companion = IntOffset.Companion;
        this.finalOffset = companion.m7750getZeronOccac();
        this.layer = graphicsContext != null ? graphicsContext.createGraphicsLayer() : null;
        String str = null;
        this.placementDeltaAnimation = new Animatable<>(IntOffset.m7730boximpl(companion.m7750getZeronOccac()), VectorConvertersKt.getVectorConverter(companion), null, str, 12, null);
        this.visibilityAnimation = new Animatable<>(Float.valueOf(1.0f), VectorConvertersKt.getVectorConverter(zv.a), str, null, 12, null);
        this.placementDelta$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m7730boximpl(companion.m7750getZeronOccac()), null, 2, null);
        this.lookaheadOffset = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAppearanceAnimationInProgress(boolean z) {
        this.isAppearanceAnimationInProgress$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisappearanceAnimationFinished(boolean z) {
        this.isDisappearanceAnimationFinished$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisappearanceAnimationInProgress(boolean z) {
        this.isDisappearanceAnimationInProgress$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlacementAnimationInProgress(boolean z) {
        this.isPlacementAnimationInProgress$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlacementDelta--gyyYBs, reason: not valid java name */
    public final void m913setPlacementDeltagyyYBs(long j) {
        this.placementDelta$delegate.setValue(IntOffset.m7730boximpl(j));
    }

    public final void animateAppearance() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeInSpec;
        if (isAppearanceAnimationInProgress() || finiteAnimationSpec == null || graphicsLayer == null) {
            if (isDisappearanceAnimationInProgress()) {
                if (graphicsLayer != null) {
                    graphicsLayer.setAlpha(1.0f);
                }
                p01.t(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3);
                return;
            }
            return;
        }
        setAppearanceAnimationInProgress(true);
        boolean isDisappearanceAnimationInProgress = isDisappearanceAnimationInProgress();
        boolean z = !isDisappearanceAnimationInProgress;
        if (!isDisappearanceAnimationInProgress) {
            graphicsLayer.setAlpha(0.0f);
        }
        p01.t(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animateAppearance$2(z, this, finiteAnimationSpec, graphicsLayer, null), 3);
    }

    public final void animateDisappearance() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeOutSpec;
        if (graphicsLayer == null || isDisappearanceAnimationInProgress() || finiteAnimationSpec == null) {
            return;
        }
        setDisappearanceAnimationInProgress(true);
        p01.t(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animateDisappearance$1(this, finiteAnimationSpec, graphicsLayer, null), 3);
    }

    /* renamed from: animatePlacementDelta-ar5cAso, reason: not valid java name */
    public final void m914animatePlacementDeltaar5cAso(long j, boolean z) {
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long m7742minusqkQi6aY = IntOffset.m7742minusqkQi6aY(m917getPlacementDeltanOccac(), j);
        m913setPlacementDeltagyyYBs(m7742minusqkQi6aY);
        setPlacementAnimationInProgress(true);
        this.isRunningMovingAwayAnimation = z;
        p01.t(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, m7742minusqkQi6aY, null), 3);
    }

    public final void cancelPlacementAnimation() {
        if (isPlacementAnimationInProgress()) {
            p01.t(this.coroutineScope, null, null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3);
        }
    }

    public final FiniteAnimationSpec<Float> getFadeInSpec() {
        return this.fadeInSpec;
    }

    public final FiniteAnimationSpec<Float> getFadeOutSpec() {
        return this.fadeOutSpec;
    }

    /* renamed from: getFinalOffset-nOcc-ac, reason: not valid java name */
    public final long m915getFinalOffsetnOccac() {
        return this.finalOffset;
    }

    public final GraphicsLayer getLayer() {
        return this.layer;
    }

    /* renamed from: getLookaheadOffset-nOcc-ac, reason: not valid java name */
    public final long m916getLookaheadOffsetnOccac() {
        return this.lookaheadOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPlacementDelta-nOcc-ac, reason: not valid java name */
    public final long m917getPlacementDeltanOccac() {
        return ((IntOffset) this.placementDelta$delegate.getValue()).m7748unboximpl();
    }

    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    /* renamed from: getRawOffset-nOcc-ac, reason: not valid java name */
    public final long m918getRawOffsetnOccac() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAppearanceAnimationInProgress() {
        return ((Boolean) this.isAppearanceAnimationInProgress$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationFinished() {
        return ((Boolean) this.isDisappearanceAnimationFinished$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationInProgress() {
        return ((Boolean) this.isDisappearanceAnimationInProgress$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPlacementAnimationInProgress() {
        return ((Boolean) this.isPlacementAnimationInProgress$delegate.getValue()).booleanValue();
    }

    public final boolean isRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public final void release() {
        GraphicsContext graphicsContext;
        if (isPlacementAnimationInProgress()) {
            setPlacementAnimationInProgress(false);
            p01.t(this.coroutineScope, null, null, new LazyLayoutItemAnimation$release$1(this, null), 3);
        }
        if (isAppearanceAnimationInProgress()) {
            setAppearanceAnimationInProgress(false);
            p01.t(this.coroutineScope, null, null, new LazyLayoutItemAnimation$release$2(this, null), 3);
        }
        if (isDisappearanceAnimationInProgress()) {
            setDisappearanceAnimationInProgress(false);
            p01.t(this.coroutineScope, null, null, new LazyLayoutItemAnimation$release$3(this, null), 3);
        }
        this.isRunningMovingAwayAnimation = false;
        m913setPlacementDeltagyyYBs(IntOffset.Companion.m7750getZeronOccac());
        this.rawOffset = NotInitialized;
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null && (graphicsContext = this.graphicsContext) != null) {
            graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }

    public final void setFadeInSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeInSpec = finiteAnimationSpec;
    }

    public final void setFadeOutSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeOutSpec = finiteAnimationSpec;
    }

    /* renamed from: setFinalOffset--gyyYBs, reason: not valid java name */
    public final void m919setFinalOffsetgyyYBs(long j) {
        this.finalOffset = j;
    }

    /* renamed from: setLookaheadOffset--gyyYBs, reason: not valid java name */
    public final void m920setLookaheadOffsetgyyYBs(long j) {
        this.lookaheadOffset = j;
    }

    public final void setPlacementSpec(FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    /* renamed from: setRawOffset--gyyYBs, reason: not valid java name */
    public final void m921setRawOffsetgyyYBs(long j) {
        this.rawOffset = j;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getNotInitialized-nOcc-ac, reason: not valid java name */
        public final long m922getNotInitializednOccac() {
            return LazyLayoutItemAnimation.NotInitialized;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LazyLayoutItemAnimation(un unVar, GraphicsContext graphicsContext, iy iyVar, int i, dq dqVar) {
        this(unVar, (i & 2) != 0 ? null : graphicsContext, (i & 4) != 0 ? new ms(8) : iyVar);
    }
}
