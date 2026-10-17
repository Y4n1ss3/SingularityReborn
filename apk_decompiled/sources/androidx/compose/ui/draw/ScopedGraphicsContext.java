package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.shadow.ShadowContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import defpackage.dd0;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ScopedGraphicsContext implements GraphicsContext {
    private xa0 allocatedGraphicsLayers;
    private GraphicsContext graphicsContext;

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public GraphicsLayer createGraphicsLayer() {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (graphicsContext == null) {
            InlineClassHelperKt.throwIllegalStateException("GraphicsContext not provided");
        }
        GraphicsLayer createGraphicsLayer = graphicsContext.createGraphicsLayer();
        xa0 xa0Var = this.allocatedGraphicsLayers;
        if (xa0Var != null) {
            xa0Var.g(createGraphicsLayer);
            return createGraphicsLayer;
        }
        Object[] objArr = dd0.a;
        xa0 xa0Var2 = new xa0(1);
        xa0Var2.g(createGraphicsLayer);
        this.allocatedGraphicsLayers = xa0Var2;
        return createGraphicsLayer;
    }

    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public ShadowContext getShadowContext() {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (!(graphicsContext != null)) {
            InlineClassHelperKt.throwIllegalStateException("GraphicsContext not provided");
        }
        return graphicsContext.getShadowContext();
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public void releaseGraphicsLayer(GraphicsLayer graphicsLayer) {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
    }

    public final void releaseGraphicsLayers() {
        xa0 xa0Var = this.allocatedGraphicsLayers;
        if (xa0Var != null) {
            Object[] objArr = xa0Var.a;
            int i = xa0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                releaseGraphicsLayer((GraphicsLayer) objArr[i2]);
            }
            xa0Var.j();
        }
    }

    public final void setGraphicsContext(GraphicsContext graphicsContext) {
        releaseGraphicsLayers();
        this.graphicsContext = graphicsContext;
    }
}
