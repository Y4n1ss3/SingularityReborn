package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cj;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.p01;
import defpackage.q10;
import defpackage.un;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final int $stable = 0;
    private final /* synthetic */ LookaheadScope $$delegate_0;
    private LayoutCoordinates _nullableLookaheadRoot;
    private final un coroutineScope;
    private iy invalidateOverlay;
    private LayoutCoordinates nullableRoot;
    private iy testBlockToRun;
    private final MutableState isTransitionActive$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private final iy observeAnimatingBlock = new SharedTransitionScopeImpl$observeAnimatingBlock$1(this);
    private final SnapshotStateList<LayerRenderer> renderers = SnapshotStateKt.mutableStateListOf();
    private final SnapshotStateMap<Object, SharedElement> sharedElements = SnapshotStateKt.mutableStateMapOf();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {
        private final Shape clipShape;
        private final Path path = AndroidPath_androidKt.Path();

        public ShapeBasedClip(Shape shape) {
            this.clipShape = shape;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
            this.path.reset();
            OutlineKt.addOutline(this.path, this.clipShape.mo283createOutlinePq9zytI(rect.m4549getSizeNHjbRc(), layoutDirection, density));
            this.path.mo4653translatek4lQ0M(rect.m4551getTopLeftF1C5BW0());
            return this.path;
        }

        public final Shape getClipShape() {
            return this.clipShape;
        }
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, un unVar) {
        this.$$delegate_0 = lookaheadScope;
        this.coroutineScope = unVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElementEntry rememberSharedElementState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip overlayClip, float f, boolean z2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(864401334, i, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:1311)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SharedElementEntry(sharedElement, boundsAnimation, placeholderSize, z, overlayClip, z2, sharedContentState, f);
            composer.updateRememberedValue(rememberedValue);
        }
        SharedElementEntry sharedElementEntry = (SharedElementEntry) rememberedValue;
        sharedContentState.setInternalState$animation(sharedElementEntry);
        sharedElementEntry.setSharedElement(sharedElement);
        sharedElementEntry.setRenderOnlyWhenVisible(z);
        sharedElementEntry.setBoundsAnimation(boundsAnimation);
        sharedElementEntry.setPlaceholderSize(placeholderSize);
        sharedElementEntry.setOverlayClip(overlayClip);
        sharedElementEntry.setZIndex(f);
        sharedElementEntry.setRenderInOverlayDuringTransition(z2);
        sharedElementEntry.setUserState(sharedContentState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sharedElementEntry;
    }

    private void setTransitionActive(boolean z) {
        this.isTransitionActive$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Modifier sharedBoundsImpl(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, Transition<T> transition, ky kyVar, BoundsTransform boundsTransform, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, boolean z2, float f, SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(modifier, null, new SharedTransitionScopeImpl$sharedBoundsImpl$1(sharedContentState, transition, kyVar, this, placeholderSize, z, overlayClip, f, z2, boundsTransform), 1, null);
    }

    public static /* synthetic */ Modifier sharedBoundsWithCallerManagedVisibility$animation$default(SharedTransitionScopeImpl sharedTransitionScopeImpl, Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z2, float f, SharedTransitionScope.OverlayClip overlayClip, int i, Object obj) {
        SharedTransitionScope.OverlayClip overlayClip2;
        SharedTransitionScope.OverlayClip overlayClip3;
        if ((i & 4) != 0) {
            boundsTransform = SharedTransitionDefaults.INSTANCE.getBoundsTransform();
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i & 8) != 0) {
            placeholderSize = SharedTransitionScope.PlaceholderSize.Companion.getContentSize();
        }
        SharedTransitionScope.PlaceholderSize placeholderSize2 = placeholderSize;
        boolean z3 = (i & 16) != 0 ? true : z2;
        float f2 = (i & 32) != 0 ? 0.0f : f;
        if ((i & 64) != 0) {
            overlayClip3 = SharedTransitionScopeKt.ParentClip;
            overlayClip2 = overlayClip3;
        } else {
            overlayClip2 = overlayClip;
        }
        return sharedTransitionScopeImpl.sharedBoundsWithCallerManagedVisibility$animation(modifier, sharedContentState, z, boundsTransform2, placeholderSize2, z3, f2, overlayClip2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement sharedElementsFor(Object obj) {
        SharedElement sharedElement = this.sharedElements.get(obj);
        if (sharedElement != null) {
            return sharedElement;
        }
        SharedElement sharedElement2 = new SharedElement(obj, this);
        this.sharedElements.put(obj, sharedElement2);
        return sharedElement2;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public SharedTransitionScope.OverlayClip OverlayClip(Shape shape) {
        return new ShapeBasedClip(shape);
    }

    public final void drawInOverlay$animation(ContentDrawScope contentDrawScope) {
        SnapshotStateList<LayerRenderer> snapshotStateList = this.renderers;
        if (snapshotStateList.size() > 1) {
            cj.b0(snapshotStateList, new Comparator() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    LayerRenderer layerRenderer = (LayerRenderer) t;
                    LayerRenderer layerRenderer2 = (LayerRenderer) t2;
                    return p01.i(Float.valueOf((layerRenderer.getZIndex() == 0.0f && (layerRenderer instanceof SharedElementEntry) && ((SharedElementEntry) layerRenderer).getParentState() == null) ? -1.0f : layerRenderer.getZIndex()), Float.valueOf((layerRenderer2.getZIndex() == 0.0f && (layerRenderer2 instanceof SharedElementEntry) && ((SharedElementEntry) layerRenderer2).getParentState() == null) ? -1.0f : layerRenderer2.getZIndex()));
                }
            });
        }
        SnapshotStateList<LayerRenderer> snapshotStateList2 = this.renderers;
        int size = snapshotStateList2.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList2.get(i).drawInOverlay(contentDrawScope);
        }
    }

    public final un getCoroutineScope() {
        return this.coroutineScope;
    }

    public final iy getInvalidateOverlay() {
        return this.invalidateOverlay;
    }

    public final LayoutCoordinates getLookaheadRoot$animation() {
        LayoutCoordinates layoutCoordinates = this._nullableLookaheadRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        o.m("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        return this.$$delegate_0.getLookaheadScopeCoordinates(placementScope);
    }

    public final LayoutCoordinates getNullableRoot$animation() {
        return this.nullableRoot;
    }

    public final iy getObserveAnimatingBlock$animation() {
        return this.observeAnimatingBlock;
    }

    public final LayoutCoordinates getRoot$animation() {
        LayoutCoordinates layoutCoordinates = this.nullableRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        o.m("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    public final iy getTestBlockToRun() {
        return this.testBlockToRun;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public boolean isTransitionActive() {
        return ((Boolean) this.isTransitionActive$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-au-aQtc, reason: not valid java name */
    public long mo92localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z) {
        return this.$$delegate_0.mo92localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j, z);
    }

    public final void onEntryAdded$animation(SharedElementEntry sharedElementEntry) {
        sharedElementEntry.getSharedElement().addEntry(sharedElementEntry);
        updateTransitionActiveness$animation();
        Iterator<LayerRenderer> it = this.renderers.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            LayerRenderer next = it.next();
            SharedElementEntry sharedElementEntry2 = next instanceof SharedElementEntry ? (SharedElementEntry) next : null;
            if (q10.b(sharedElementEntry2 != null ? sharedElementEntry2.getSharedElement() : null, sharedElementEntry.getSharedElement())) {
                break;
            } else {
                i++;
            }
        }
        if (i == this.renderers.size() - 1 || i == -1) {
            this.renderers.add(sharedElementEntry);
        } else {
            this.renderers.add(i + 1, sharedElementEntry);
        }
    }

    public final void onEntryRemoved$animation(SharedElementEntry sharedElementEntry) {
        SharedElement sharedElement = sharedElementEntry.getSharedElement();
        sharedElement.removeEntry(sharedElementEntry);
        updateTransitionActiveness$animation();
        this.renderers.remove(sharedElementEntry);
        if (sharedElement.getAllEntries().isEmpty()) {
            p01.t(sharedElement.getScope().coroutineScope, null, null, new SharedTransitionScopeImpl$onEntryRemoved$1$1(sharedElement, sharedElementEntry, null), 3);
        }
    }

    public final void onLayerRendererCreated$animation(LayerRenderer layerRenderer) {
        this.renderers.add(layerRenderer);
    }

    public final void onLayerRendererRemoved$animation(LayerRenderer layerRenderer) {
        this.renderers.remove(layerRenderer);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, float f, iy iyVar) {
        return modifier.then(new RenderInTransitionOverlayNodeElement(this, iyVar, f));
    }

    public final void setInvalidateOverlay(iy iyVar) {
        this.invalidateOverlay = iyVar;
    }

    public final void setLookaheadRoot$animation(LayoutCoordinates layoutCoordinates) {
        this._nullableLookaheadRoot = layoutCoordinates;
    }

    public final void setRoot$animation(LayoutCoordinates layoutCoordinates) {
        this.nullableRoot = layoutCoordinates;
    }

    public final void setTestBlockToRun(iy iyVar) {
        this.testBlockToRun = iyVar;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedBounds(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, SharedTransitionScope.ResizeMode resizeMode, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, float f, SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), SharedTransitionScopeImpl$sharedBounds$1.INSTANCE, boundsTransform, placeholderSize, false, z, f, overlayClip), null, new SharedTransitionScopeImpl$sharedBounds$2(animatedVisibilityScope, enterTransition, exitTransition, sharedContentState, resizeMode), 1, null);
    }

    public final Modifier sharedBoundsWithCallerManagedVisibility$animation(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z2, float f, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1(z), boundsTransform, placeholderSize, false, z2, f, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElement(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, float f, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), SharedTransitionScopeImpl$sharedElement$1.INSTANCE, boundsTransform, placeholderSize, true, z, f, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z2, float f, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1(z), boundsTransform, placeholderSize, true, z2, f, overlayClip);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier skipToLookaheadSize(Modifier modifier, iy iyVar) {
        return modifier.then(new SkipToLookaheadSizeElement(null, iyVar, 1, 0 == true ? 1 : 0));
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        return this.$$delegate_0.toLookaheadCoordinates(layoutCoordinates);
    }

    public final void updateTransitionActiveness$animation() {
        SnapshotStateMap<Object, SharedElement> snapshotStateMap = this.sharedElements;
        boolean z = false;
        if (!snapshotStateMap.isEmpty()) {
            Iterator<Map.Entry<Object, SharedElement>> it = snapshotStateMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().getValue().isAnimating()) {
                    z = true;
                    break;
                }
            }
        }
        if (z != isTransitionActive()) {
            setTransitionActive(z);
            if (!z) {
                Iterator<Map.Entry<Object, SharedElement>> it2 = this.sharedElements.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().onSharedTransitionFinished();
                }
            }
        }
        Iterator<Map.Entry<Object, SharedElement>> it3 = this.sharedElements.entrySet().iterator();
        while (it3.hasNext()) {
            it3.next().getValue().updateMatch$animation();
        }
    }

    public static /* synthetic */ void getTestBlockToRun$annotations() {
    }
}
