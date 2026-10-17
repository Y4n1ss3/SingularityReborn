package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import defpackage.iy;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RenderInTransitionOverlayNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private boolean enabled;
    private LayerWithRenderer layerWithRenderer;
    private long positionInOverlay = Offset.Companion.m4532getZeroF1C5BW0();
    private iy renderInOverlay;
    private SharedTransitionScopeImpl sharedScope;
    private final MutableFloatState zIndexInOverlay$delegate;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class LayerWithRenderer implements LayerRenderer {
        private final GraphicsLayer layer;

        public LayerWithRenderer(GraphicsLayer graphicsLayer) {
            this.layer = graphicsLayer;
        }

        @Override // androidx.compose.animation.LayerRenderer
        public void drawInOverlay(DrawScope drawScope) {
            if (RenderInTransitionOverlayNode.this.enabled) {
                RenderInTransitionOverlayNode renderInTransitionOverlayNode = RenderInTransitionOverlayNode.this;
                float intBitsToFloat = Float.intBitsToFloat((int) (renderInTransitionOverlayNode.positionInOverlay >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (renderInTransitionOverlayNode.positionInOverlay & 4294967295L));
                drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
                try {
                    GraphicsLayerKt.drawLayer(drawScope, this.layer);
                } finally {
                    drawScope.getDrawContext().getTransform().translate(-intBitsToFloat, -intBitsToFloat2);
                }
            }
        }

        public final GraphicsLayer getLayer() {
            return this.layer;
        }

        @Override // androidx.compose.animation.LayerRenderer
        public SharedElementEntry getParentState() {
            return RenderInTransitionOverlayNode.this.getParentState();
        }

        @Override // androidx.compose.animation.LayerRenderer
        public float getZIndex() {
            return RenderInTransitionOverlayNode.this.getZIndexInOverlay();
        }
    }

    public RenderInTransitionOverlayNode(SharedTransitionScopeImpl sharedTransitionScopeImpl, iy iyVar, float f) {
        this.sharedScope = sharedTransitionScopeImpl;
        this.renderInOverlay = iyVar;
        this.zIndexInOverlay$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEnabled(boolean z) {
        if (z != this.enabled) {
            iy invalidateOverlay = this.sharedScope.getInvalidateOverlay();
            if (invalidateOverlay != null) {
                invalidateOverlay.invoke();
            }
            DrawModifierNodeKt.invalidateDraw(this);
            this.enabled = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPositionInOverlay-k-4lQ0M, reason: not valid java name */
    public final void m78setPositionInOverlayk4lQ0M(long j) {
        if (Offset.m4513equalsimpl0(j, this.positionInOverlay)) {
            return;
        }
        iy invalidateOverlay = this.sharedScope.getInvalidateOverlay();
        if (invalidateOverlay != null) {
            invalidateOverlay.invoke();
        }
        DrawModifierNodeKt.invalidateDraw(this);
        this.positionInOverlay = j;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        GraphicsLayer layer = getLayer();
        if (layer == null) {
            o.m("Error: layer never initialized");
            return;
        }
        DrawScope.m5333recordJVtK1S4$default(contentDrawScope, layer, 0L, new RenderInTransitionOverlayNode$draw$1(contentDrawScope), 1, null);
        if (this.enabled) {
            return;
        }
        GraphicsLayerKt.drawLayer(contentDrawScope, layer);
    }

    public final GraphicsLayer getLayer() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            return layerWithRenderer.getLayer();
        }
        return null;
    }

    public final SharedElementEntry getParentState() {
        return (SharedElementEntry) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState());
    }

    public final iy getRenderInOverlay() {
        return this.renderInOverlay;
    }

    public final SharedTransitionScopeImpl getSharedScope() {
        return this.sharedScope;
    }

    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay$delegate.getFloatValue();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new RenderInTransitionOverlayNode$measure$1$1(measureScope, this, mo6234measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        LayerWithRenderer layerWithRenderer = new LayerWithRenderer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.sharedScope.onLayerRendererCreated$animation(layerWithRenderer);
        this.layerWithRenderer = layerWithRenderer;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            this.sharedScope.onLayerRendererRemoved$animation(layerWithRenderer);
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(layerWithRenderer.getLayer());
        }
    }

    public final void setRenderInOverlay(iy iyVar) {
        this.renderInOverlay = iyVar;
    }

    public final void setSharedScope(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedScope = sharedTransitionScopeImpl;
    }

    public final void setZIndexInOverlay(float f) {
        this.zIndexInOverlay$delegate.setFloatValue(f);
    }
}
