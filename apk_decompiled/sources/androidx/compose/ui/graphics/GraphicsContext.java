package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.shadow.PlatformShadowContext;
import androidx.compose.ui.graphics.shadow.ShadowContext;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface GraphicsContext {
    GraphicsLayer createGraphicsLayer();

    default ShadowContext getShadowContext() {
        return new PlatformShadowContext() { // from class: androidx.compose.ui.graphics.GraphicsContext$shadowContext$1
        };
    }

    void releaseGraphicsLayer(GraphicsLayer graphicsLayer);
}
