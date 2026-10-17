package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedElementEntry implements LayerRenderer, RememberObserver {
    public static final int $stable = 8;
    private final MutableState boundsAnimation$delegate;
    private BoundsProvider boundsProvider;
    private Path clipPathInOverlay;
    private final MutableState isAttached$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private final MutableState layer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState overlayClip$delegate;
    private SharedElementEntry parentState;
    private final MutableState placeholderSize$delegate;
    private final MutableState renderInOverlayDuringTransition$delegate;
    private final MutableState renderOnlyWhenVisible$delegate;
    private final MutableState sharedElement$delegate;
    private final MutableState userState$delegate;
    private final MutableFloatState zIndex$delegate;

    public SharedElementEntry(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, SharedTransitionScope.OverlayClip overlayClip, boolean z2, SharedTransitionScope.SharedContentState sharedContentState, float f) {
        this.zIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.renderInOverlayDuringTransition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
        this.sharedElement$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
        this.boundsAnimation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
        this.placeholderSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(placeholderSize, null, 2, null);
        this.renderOnlyWhenVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.overlayClip$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
        this.userState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentState, null, 2, null);
    }

    private final boolean getShouldRenderAtAll() {
        if (getBoundsAnimation().getTarget()) {
            return true;
        }
        return (getSharedElement().getState$animation().getMatchIsOrHasBeenConfigured() && !getSharedElement().getState$animation().getActiveMatchFound()) || !getRenderOnlyWhenVisible();
    }

    public final Rect calculateTargetBounds(Rect rect) {
        return getUserState().getConfig$animation().m88alternativeTargetBoundsInTransitionScopeAfterRemovalcSwnlzA(getUserState(), rect, IntSizeKt.m7794toSizeozmzZPI(getSharedElement().getScope().getLookaheadRoot$animation().mo6242getSizeYbymL2g()));
    }

    @Override // androidx.compose.animation.LayerRenderer
    public void drawInOverlay(DrawScope drawScope) {
        Rect currentBounds;
        GraphicsLayer layer = getLayer();
        if (layer == null || (currentBounds = getSharedElement().getState$animation().getCurrentBounds()) == null || !getShouldRenderInOverlay$animation()) {
            return;
        }
        long m4551getTopLeftF1C5BW0 = currentBounds.m4551getTopLeftF1C5BW0();
        float intBitsToFloat = Float.intBitsToFloat((int) (m4551getTopLeftF1C5BW0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m4551getTopLeftF1C5BW0 & 4294967295L));
        Path path = this.clipPathInOverlay;
        if (path == null) {
            drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
            try {
                GraphicsLayerKt.drawLayer(drawScope, layer);
                return;
            } finally {
            }
        }
        int m4750getIntersectrtfAjoo = ClipOp.Companion.m4750getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5258clipPathmtrdDE(path, m4750getIntersectrtfAjoo);
            drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
            try {
                GraphicsLayerKt.drawLayer(drawScope, layer);
            } finally {
            }
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BoundsAnimation getBoundsAnimation() {
        return (BoundsAnimation) this.boundsAnimation$delegate.getValue();
    }

    public final BoundsProvider getBoundsProvider() {
        return this.boundsProvider;
    }

    public final Path getClipPathInOverlay$animation() {
        return this.clipPathInOverlay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GraphicsLayer getLayer() {
        return (GraphicsLayer) this.layer$delegate.getValue();
    }

    public final SharedTransitionScope.OverlayClip getOverlayClip() {
        return (SharedTransitionScope.OverlayClip) this.overlayClip$delegate.getValue();
    }

    @Override // androidx.compose.animation.LayerRenderer
    public SharedElementEntry getParentState() {
        return this.parentState;
    }

    public final SharedTransitionScope.PlaceholderSize getPlaceholderSize() {
        return (SharedTransitionScope.PlaceholderSize) this.placeholderSize$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderInOverlayDuringTransition() {
        return ((Boolean) this.renderInOverlayDuringTransition$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderOnlyWhenVisible() {
        return ((Boolean) this.renderOnlyWhenVisible$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedElement getSharedElement() {
        return (SharedElement) this.sharedElement$delegate.getValue();
    }

    public final boolean getShouldRenderInOverlay$animation() {
        return getShouldRenderAtAll() && getSharedElement().getBoundsTransformIsActive() && isEnabled() && getRenderInOverlayDuringTransition() && getSharedElement().getScope().isTransitionActive();
    }

    public final boolean getShouldRenderInPlace() {
        if (getSharedElement().getBoundsTransformIsActive()) {
            return !getShouldRenderInOverlay$animation() && getShouldRenderAtAll();
        }
        return true;
    }

    public final boolean getTarget() {
        return getBoundsAnimation().getTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedTransitionScope.SharedContentState getUserState() {
        return (SharedTransitionScope.SharedContentState) this.userState$delegate.getValue();
    }

    @Override // androidx.compose.animation.LayerRenderer
    public float getZIndex() {
        return this.zIndex$delegate.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAttached() {
        return ((Boolean) this.isAttached$delegate.getValue()).booleanValue();
    }

    public final boolean isEnabled() {
        return isAttached() && getUserState().isEnabledByUser$animation();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        getSharedElement().getScope().onEntryRemoved$animation(this);
        getSharedElement().invalidateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        getSharedElement().getScope().onEntryAdded$animation(this);
        getSharedElement().invalidateTargetBoundsProvider();
    }

    public final void setAttached(boolean z) {
        this.isAttached$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setBoundsAnimation(BoundsAnimation boundsAnimation) {
        this.boundsAnimation$delegate.setValue(boundsAnimation);
    }

    public final void setBoundsProvider(BoundsProvider boundsProvider) {
        this.boundsProvider = boundsProvider;
    }

    public final void setClipPathInOverlay$animation(Path path) {
        this.clipPathInOverlay = path;
    }

    public final void setLayer(GraphicsLayer graphicsLayer) {
        this.layer$delegate.setValue(graphicsLayer);
    }

    public final void setOverlayClip(SharedTransitionScope.OverlayClip overlayClip) {
        this.overlayClip$delegate.setValue(overlayClip);
    }

    public void setParentState(SharedElementEntry sharedElementEntry) {
        this.parentState = sharedElementEntry;
    }

    public final void setPlaceholderSize(SharedTransitionScope.PlaceholderSize placeholderSize) {
        this.placeholderSize$delegate.setValue(placeholderSize);
    }

    public final void setRenderInOverlayDuringTransition(boolean z) {
        this.renderInOverlayDuringTransition$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setRenderOnlyWhenVisible(boolean z) {
        this.renderOnlyWhenVisible$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setSharedElement(SharedElement sharedElement) {
        this.sharedElement$delegate.setValue(sharedElement);
    }

    public final void setUserState(SharedTransitionScope.SharedContentState sharedContentState) {
        this.userState$delegate.setValue(sharedContentState);
    }

    public void setZIndex(float f) {
        this.zIndex$delegate.setFloatValue(f);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
