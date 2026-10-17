package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.o6;
import defpackage.q10;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode, ObserverModifierNode, BoundsProvider {
    public static final int $stable = 8;
    private Rect boundsBeforeDetached;
    private boolean isPlaced;
    private GraphicsLayer layer;
    private final ModifierLocalMap providedValues;
    private SharedElementEntry sharedElementEntry;

    public SharedBoundsNode(SharedElementEntry sharedElementEntry) {
        this.sharedElementEntry = sharedElementEntry;
        this.layer = sharedElementEntry.getLayer();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(new xe0(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementEntry));
    }

    private final MeasureResult approachPlace(MeasureScope measureScope, Placeable placeable) {
        long m7777constructorimpl;
        if (getSharedElement().getState$animation().getMatchIsOrHasBeenConfigured()) {
            m7777constructorimpl = this.sharedElementEntry.getPlaceholderSize().mo87calculateSizeJyjRU_E(requireLookaheadLayoutCoordinates().mo6242getSizeYbymL2g(), IntSize.m7777constructorimpl((placeable.getHeight() & 4294967295L) | (placeable.getWidth() << 32)));
        } else {
            m7777constructorimpl = IntSize.m7777constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L));
        }
        return MeasureScope.layout$default(measureScope, (int) (m7777constructorimpl >> 32), (int) (m7777constructorimpl & 4294967295L), null, new SharedBoundsNode$approachPlace$1(this, placeable), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void approachPlaceMatchBeyondTransition(Placeable.PlacementScope placementScope, Placeable placeable, Rect rect) {
        long m7750getZeronOccac;
        if (getBoundsAnimation().getTarget()) {
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
            return;
        }
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            m7750getZeronOccac = IntOffsetKt.m7756roundk4lQ0M(Offset.m4520minusMKHz9U(rect.m4551getTopLeftF1C5BW0(), getRootCoords().mo6243localPositionOfR5De75A(coordinates, Offset.Companion.m4532getZeroF1C5BW0())));
        } else {
            m7750getZeronOccac = IntOffset.Companion.m7750getZeronOccac();
        }
        Placeable.PlacementScope.place$default(placementScope, placeable, IntOffset.m7739getXimpl(m7750getZeronOccac), IntOffset.m7740getYimpl(m7750getZeronOccac), 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec approachPlaceMatchInTransition$lambda$0(Rect rect, Rect rect2) {
        return AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
    }

    private final LayoutCoordinates getApproachCoordinates() {
        return DelegatableNodeKt.requireLayoutCoordinates(this);
    }

    private final BoundsAnimation getBoundsAnimation() {
        return this.sharedElementEntry.getBoundsAnimation();
    }

    private final LayoutCoordinates getRootCoords() {
        return getSharedElement().getScope().getRoot$animation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement getSharedElement() {
        return this.sharedElementEntry.getSharedElement();
    }

    private final LayoutCoordinates requireLookaheadLayoutCoordinates() {
        return this.sharedElementEntry.getSharedElement().getScope().toLookaheadCoordinates(DelegatableNodeKt.requireLayoutCoordinates(this));
    }

    private final void setLayer(GraphicsLayer graphicsLayer) {
        if (graphicsLayer == null) {
            GraphicsLayer graphicsLayer2 = this.layer;
            if (graphicsLayer2 != null) {
                DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer2);
            }
        } else {
            this.sharedElementEntry.setLayer(graphicsLayer);
        }
        this.layer = graphicsLayer;
    }

    private final void setup() {
        provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), this.sharedElementEntry);
        this.sharedElementEntry.setParentState((SharedElementEntry) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.isPlaced = false;
        this.sharedElementEntry.setBoundsProvider(this);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo38approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
        Rect value = getBoundsAnimation().getValue();
        if (value == null) {
            value = getSharedElement().tryInitializingCurrentBounds();
        }
        if (value != null) {
            long m7790roundToIntSizeuvyYCjk = IntSizeKt.m7790roundToIntSizeuvyYCjk(value.m4549getSizeNHjbRc());
            int i = (int) (m7790roundToIntSizeuvyYCjk >> 32);
            int i2 = (int) (m7790roundToIntSizeuvyYCjk & 4294967295L);
            if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                StringBuilder sb = new StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                sb.append(getBoundsAnimation().getValue());
                Rect currentBounds = getSharedElement().getState$animation().getCurrentBounds();
                sb.append(", current bounds: ");
                sb.append(currentBounds);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            Constraints.Companion companion = Constraints.Companion;
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            j = companion.m7574fixedJhjzzOo(i, i2);
        }
        return approachPlace(approachMeasureScope, measurable.mo6234measureBRTryo0(j));
    }

    public final void approachPlaceMatchInTransition$animation(Placeable.PlacementScope placementScope, Placeable placeable, TargetData targetData, Rect rect) {
        long j;
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates == null) {
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
            return;
        }
        boolean activeMatchFound = getSharedElement().getState$animation().getActiveMatchFound();
        long mo6243localPositionOfR5De75A = getRootCoords().mo6243localPositionOfR5De75A(coordinates, Offset.Companion.m4532getZeroF1C5BW0());
        if (activeMatchFound) {
            BoundsAnimation.animate$default(getBoundsAnimation(), rect, SharedTransitionStateMachineKt.getTargetBounds(targetData), null, 4, null);
        } else {
            getBoundsAnimation().animate(rect, SharedTransitionStateMachineKt.getTargetBounds(targetData), new o6(1));
        }
        Rect value = getBoundsAnimation().getValue();
        Offset m4505boximpl = value != null ? Offset.m4505boximpl(SharedTransitionStateMachineKt.calculateOffsetFromDirectManipulation(targetData, value)) : null;
        if (getBoundsAnimation().getTarget() || !activeMatchFound) {
            long m4526unboximpl = m4505boximpl != null ? m4505boximpl.m4526unboximpl() : mo6243localPositionOfR5De75A;
            getSharedElement().getState$animation().updateBounds(m4505boximpl == null ? RectKt.m4556Recttz77jQw(mo6243localPositionOfR5De75A, IntSizeKt.m7794toSizeozmzZPI(coordinates.mo6242getSizeYbymL2g())) : RectKt.m4556Recttz77jQw(m4505boximpl.m4526unboximpl(), value.m4549getSizeNHjbRc()));
            j = m4526unboximpl;
        } else {
            j = m4505boximpl != null ? m4505boximpl.m4526unboximpl() : rect.m4551getTopLeftF1C5BW0();
        }
        long m4520minusMKHz9U = Offset.m4520minusMKHz9U(j, mo6243localPositionOfR5De75A);
        Placeable.PlacementScope.place$default(placementScope, placeable, Math.round(Float.intBitsToFloat((int) (m4520minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (m4520minusMKHz9U & 4294967295L))), 0.0f, 4, null);
    }

    @Override // androidx.compose.animation.BoundsProvider
    public Rect calculateAlternativeTargetBounds(Rect rect) {
        return this.sharedElementEntry.calculateTargetBounds(rect);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Rect currentBounds = getSharedElement().getState$animation().getCurrentBounds();
        SharedElementEntry sharedElementEntry = this.sharedElementEntry;
        sharedElementEntry.setClipPathInOverlay$animation((!sharedElementEntry.getShouldRenderInOverlay$animation() || currentBounds == null) ? null : this.sharedElementEntry.getOverlayClip().getClipPath(this.sharedElementEntry.getUserState(), currentBounds, contentDrawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(this)));
        GraphicsLayer layer = this.sharedElementEntry.getLayer();
        if (layer != null) {
            DrawScope.m5333recordJVtK1S4$default(contentDrawScope, layer, 0L, new SharedBoundsNode$draw$1(currentBounds, this, contentDrawScope), 1, null);
            if (this.sharedElementEntry.getShouldRenderInPlace()) {
                GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
        sb.append(getSharedElement().getKey());
        boolean target = this.sharedElementEntry.getBoundsAnimation().getTarget();
        boolean isAttached = isAttached();
        sb.append(",target: ");
        sb.append(target);
        sb.append(", is attached: ");
        sb.append(isAttached);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // androidx.compose.animation.BoundsProvider
    public Rect getLastBoundsInSharedTransitionScope() {
        if (isAttached()) {
            return !this.isPlaced ? this.boundsBeforeDetached : RectKt.m4556Recttz77jQw(LayoutCoordinates.m6241localPositionOfS_NoaFU$default(getRootCoords(), getApproachCoordinates(), 0L, false, 6, null), IntSizeKt.m7794toSizeozmzZPI(getApproachCoordinates().mo6242getSizeYbymL2g()));
        }
        return null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final SharedElementEntry getSharedElementEntry() {
        return this.sharedElementEntry;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo39isMeasurementApproachInProgressozmzZPI(long j) {
        return this.sharedElementEntry.isEnabled() && getSharedElement().getFoundMatch() && getSharedElement().getScope().isTransitionActive();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new SharedBoundsNode$measure$1(mo6234measureBRTryo0, this), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        ObserverModifierNodeKt.observeReads(this, getSharedElement().getObservingVisibilityChange$animation());
        setup();
        this.sharedElementEntry.setAttached(true);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        LayoutCoordinates nullableRoot$animation = getSharedElement().getScope().getNullableRoot$animation();
        if (nullableRoot$animation != null) {
            this.boundsBeforeDetached = (nullableRoot$animation.isAttached() && this.isPlaced) ? RectKt.m4556Recttz77jQw(Offset.m4520minusMKHz9U(LayoutCoordinatesKt.positionInRoot(getApproachCoordinates()), LayoutCoordinatesKt.positionInRoot(nullableRoot$animation)), IntSizeKt.m7794toSizeozmzZPI(getApproachCoordinates().mo6242getSizeYbymL2g())) : null;
        }
        setLayer(null);
        this.sharedElementEntry.setParentState(null);
        this.sharedElementEntry.setBoundsProvider(null);
        this.sharedElementEntry.setAttached(false);
        this.isPlaced = false;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        getSharedElement().updateMatch$animation();
        ObserverModifierNodeKt.observeReads(this, getSharedElement().getObservingVisibilityChange$animation());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        this.boundsBeforeDetached = null;
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
        }
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
    }

    public final void setSharedElementEntry$animation(SharedElementEntry sharedElementEntry) {
        if (q10.b(sharedElementEntry, this.sharedElementEntry)) {
            return;
        }
        this.sharedElementEntry.setAttached(false);
        this.sharedElementEntry = sharedElementEntry;
        sharedElementEntry.setAttached(isAttached());
        if (isAttached()) {
            setup();
        }
    }
}
