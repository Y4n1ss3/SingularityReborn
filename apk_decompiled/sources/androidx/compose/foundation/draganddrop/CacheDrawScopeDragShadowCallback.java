package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import defpackage.ed;
import defpackage.h;
import defpackage.o;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CacheDrawScopeDragShadowCallback {
    public static final int $stable = 8;
    private GraphicsLayer graphicsLayer;

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 cachePicture$lambda$0$0$0(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 cachePicture$lambda$0$1(CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback, ContentDrawScope contentDrawScope) {
        GraphicsLayer graphicsLayer = cacheDrawScopeDragShadowCallback.graphicsLayer;
        graphicsLayer.getClass();
        GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer);
        return w01.a;
    }

    public final DrawResult cachePicture(CacheDrawScope cacheDrawScope) {
        GraphicsLayer obtainGraphicsLayer = cacheDrawScope.obtainGraphicsLayer();
        int i = 10;
        CacheDrawScope.m4292recordTdoYBX4$default(cacheDrawScope, obtainGraphicsLayer, null, null, 0L, new ed(i), 7, null);
        this.graphicsLayer = obtainGraphicsLayer;
        return cacheDrawScope.onDrawWithContent(new h(this, i));
    }

    public final void drawDragShadow(DrawScope drawScope) {
        GraphicsLayer graphicsLayer = this.graphicsLayer;
        if (graphicsLayer != null) {
            GraphicsLayerKt.drawLayer(drawScope, graphicsLayer);
        } else {
            o.m("No cached drag shadow. Check if the drag source node was rendered first");
        }
    }
}
