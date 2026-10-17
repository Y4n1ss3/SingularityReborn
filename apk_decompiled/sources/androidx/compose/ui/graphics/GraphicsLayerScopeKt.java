package androidx.compose.ui.graphics;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GraphicsLayerScopeKt {
    public static final float DefaultCameraDistance = 8.0f;
    private static final long DefaultShadowColor = Color.Companion.m4787getBlack0d7_KjU();

    public static final GraphicsLayerScope GraphicsLayerScope() {
        return new ReusableGraphicsLayerScope();
    }

    public static final long getDefaultShadowColor() {
        return DefaultShadowColor;
    }

    public static final GraphicsLayer rememberGraphicsLayer(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(158092365, i, -1, "androidx.compose.ui.graphics.rememberGraphicsLayer (GraphicsLayerScope.kt:249)");
        }
        GraphicsContext graphicsContext = (GraphicsContext) composer.consume(CompositionLocalsKt.getLocalGraphicsContext());
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GraphicsContextObserver(graphicsContext);
            composer.updateRememberedValue(rememberedValue);
        }
        GraphicsLayer graphicsLayer = ((GraphicsContextObserver) rememberedValue).getGraphicsLayer();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return graphicsLayer;
    }
}
