package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class StretchOverscrollNode extends DelegatingNode implements DrawModifierNode {
    private RenderNode _renderNode;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public StretchOverscrollNode(DelegatableNode delegatableNode, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        delegate(delegatableNode);
    }

    private final boolean drawBottomStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(180.0f, edgeEffect, canvas);
    }

    private final boolean drawLeftStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(270.0f, edgeEffect, canvas);
    }

    private final boolean drawRightStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(90.0f, edgeEffect, canvas);
    }

    private final boolean drawTopStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(0.0f, edgeEffect, canvas);
    }

    private final boolean drawWithRotation(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final RenderNode getRenderNode() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = renderNode2;
        return renderNode2;
    }

    private final boolean shouldDrawHorizontalStretch() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        return edgeEffectWrapper.isLeftAnimating() || edgeEffectWrapper.isLeftNegationStretched() || edgeEffectWrapper.isRightAnimating() || edgeEffectWrapper.isRightNegationStretched();
    }

    private final boolean shouldDrawVerticalStretch() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        return edgeEffectWrapper.isTopAnimating() || edgeEffectWrapper.isTopNegationStretched() || edgeEffectWrapper.isBottomAnimating() || edgeEffectWrapper.isBottomNegationStretched();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d2  */
    @Override // androidx.compose.ui.node.DrawModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(ContentDrawScope contentDrawScope) {
        boolean z;
        float f;
        long j;
        char c;
        float f2;
        androidx.compose.ui.graphics.Canvas Canvas;
        Density density;
        LayoutDirection layoutDirection;
        androidx.compose.ui.graphics.Canvas canvas;
        long mo5256getSizeNHjbRc;
        GraphicsLayer graphicsLayer;
        float f3;
        float f4;
        this.overscrollEffect.m208updateSizeuvyYCjk$foundation(contentDrawScope.mo5335getSizeNHjbRc());
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        this.overscrollEffect.getRedrawSignal$foundation().getValue();
        if (Size.m4587isEmptyimpl(contentDrawScope.mo5335getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        if (!nativeCanvas.isHardwareAccelerated()) {
            this.edgeEffectWrapper.finishAll();
            contentDrawScope.drawContent();
            return;
        }
        float mo367toPx0680j_4 = contentDrawScope.mo367toPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean shouldDrawVerticalStretch = shouldDrawVerticalStretch();
        boolean shouldDrawHorizontalStretch = shouldDrawHorizontalStretch();
        if (shouldDrawVerticalStretch && shouldDrawHorizontalStretch) {
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else if (shouldDrawVerticalStretch) {
            getRenderNode().setPosition(0, 0, (y80.P(mo367toPx0680j_4) * 2) + nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else {
            if (!shouldDrawHorizontalStretch) {
                contentDrawScope.drawContent();
                return;
            }
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), (y80.P(mo367toPx0680j_4) * 2) + nativeCanvas.getHeight());
        }
        RecordingCanvas beginRecording = getRenderNode().beginRecording();
        if (edgeEffectWrapper.isLeftNegationStretched()) {
            EdgeEffect orCreateLeftEffectNegation = edgeEffectWrapper.getOrCreateLeftEffectNegation();
            drawRightStretch(orCreateLeftEffectNegation, beginRecording);
            orCreateLeftEffectNegation.finish();
        }
        if (edgeEffectWrapper.isLeftAnimating()) {
            EdgeEffect orCreateLeftEffect = edgeEffectWrapper.getOrCreateLeftEffect();
            z = drawLeftStretch(orCreateLeftEffect, beginRecording);
            if (edgeEffectWrapper.isLeftStretched()) {
                float intBitsToFloat = Float.intBitsToFloat((int) (this.overscrollEffect.m207displacementF1C5BW0$foundation() & 4294967295L));
                EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
                edgeEffectCompat.onPullDistanceCompat(edgeEffectWrapper.getOrCreateLeftEffectNegation(), edgeEffectCompat.getDistanceCompat(orCreateLeftEffect), 1.0f - intBitsToFloat);
            }
        } else {
            z = false;
        }
        if (edgeEffectWrapper.isTopNegationStretched()) {
            EdgeEffect orCreateTopEffectNegation = edgeEffectWrapper.getOrCreateTopEffectNegation();
            drawBottomStretch(orCreateTopEffectNegation, beginRecording);
            orCreateTopEffectNegation.finish();
        }
        boolean z2 = true;
        try {
            try {
                if (edgeEffectWrapper.isTopAnimating()) {
                    EdgeEffect orCreateTopEffect = edgeEffectWrapper.getOrCreateTopEffect();
                    z = drawTopStretch(orCreateTopEffect, beginRecording) || z;
                    if (edgeEffectWrapper.isTopStretched()) {
                        f = 1.0f;
                        c = ' ';
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.overscrollEffect.m207displacementF1C5BW0$foundation() >> 32));
                        EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
                        j = 4294967295L;
                        edgeEffectCompat2.onPullDistanceCompat(edgeEffectWrapper.getOrCreateTopEffectNegation(), edgeEffectCompat2.getDistanceCompat(orCreateTopEffect), intBitsToFloat2);
                        if (edgeEffectWrapper.isRightNegationStretched()) {
                            EdgeEffect orCreateRightEffectNegation = edgeEffectWrapper.getOrCreateRightEffectNegation();
                            drawLeftStretch(orCreateRightEffectNegation, beginRecording);
                            orCreateRightEffectNegation.finish();
                        }
                        if (edgeEffectWrapper.isRightAnimating()) {
                            EdgeEffect orCreateRightEffect = edgeEffectWrapper.getOrCreateRightEffect();
                            z = drawRightStretch(orCreateRightEffect, beginRecording) || z;
                            if (edgeEffectWrapper.isRightStretched()) {
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (this.overscrollEffect.m207displacementF1C5BW0$foundation() & j));
                                EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.INSTANCE;
                                edgeEffectCompat3.onPullDistanceCompat(edgeEffectWrapper.getOrCreateRightEffectNegation(), edgeEffectCompat3.getDistanceCompat(orCreateRightEffect), intBitsToFloat3);
                            }
                        }
                        if (edgeEffectWrapper.isBottomNegationStretched()) {
                            EdgeEffect orCreateBottomEffectNegation = edgeEffectWrapper.getOrCreateBottomEffectNegation();
                            drawTopStretch(orCreateBottomEffectNegation, beginRecording);
                            orCreateBottomEffectNegation.finish();
                        }
                        if (edgeEffectWrapper.isBottomAnimating()) {
                            EdgeEffect orCreateBottomEffect = edgeEffectWrapper.getOrCreateBottomEffect();
                            if (!drawBottomStretch(orCreateBottomEffect, beginRecording) && !z) {
                                z2 = false;
                            }
                            if (edgeEffectWrapper.isBottomStretched()) {
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (this.overscrollEffect.m207displacementF1C5BW0$foundation() >> c));
                                EdgeEffectCompat edgeEffectCompat4 = EdgeEffectCompat.INSTANCE;
                                edgeEffectCompat4.onPullDistanceCompat(edgeEffectWrapper.getOrCreateBottomEffectNegation(), edgeEffectCompat4.getDistanceCompat(orCreateBottomEffect), f - intBitsToFloat4);
                            }
                            z = z2;
                        }
                        if (z) {
                            this.overscrollEffect.invalidateOverscroll$foundation();
                        }
                        f2 = !shouldDrawHorizontalStretch ? 0.0f : mo367toPx0680j_4;
                        if (shouldDrawVerticalStretch) {
                            mo367toPx0680j_4 = 0.0f;
                        }
                        LayoutDirection layoutDirection2 = contentDrawScope.getLayoutDirection();
                        Canvas = AndroidCanvas_androidKt.Canvas(beginRecording);
                        long mo5335getSizeNHjbRc = contentDrawScope.mo5335getSizeNHjbRc();
                        density = contentDrawScope.getDrawContext().getDensity();
                        layoutDirection = contentDrawScope.getDrawContext().getLayoutDirection();
                        canvas = contentDrawScope.getDrawContext().getCanvas();
                        mo5256getSizeNHjbRc = contentDrawScope.getDrawContext().mo5256getSizeNHjbRc();
                        graphicsLayer = contentDrawScope.getDrawContext().getGraphicsLayer();
                        DrawContext drawContext = contentDrawScope.getDrawContext();
                        drawContext.setDensity(contentDrawScope);
                        drawContext.setLayoutDirection(layoutDirection2);
                        drawContext.setCanvas(Canvas);
                        drawContext.mo5257setSizeuvyYCjk(mo5335getSizeNHjbRc);
                        drawContext.setGraphicsLayer(null);
                        Canvas.save();
                        contentDrawScope.getDrawContext().getTransform().translate(f2, mo367toPx0680j_4);
                        contentDrawScope.drawContent();
                        Canvas.restore();
                        DrawContext drawContext2 = contentDrawScope.getDrawContext();
                        drawContext2.setDensity(density);
                        drawContext2.setLayoutDirection(layoutDirection);
                        drawContext2.setCanvas(canvas);
                        drawContext2.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
                        drawContext2.setGraphicsLayer(graphicsLayer);
                        getRenderNode().endRecording();
                        int save = nativeCanvas.save();
                        nativeCanvas.translate(f3, f4);
                        nativeCanvas.drawRenderNode(getRenderNode());
                        nativeCanvas.restoreToCount(save);
                        return;
                    }
                }
                contentDrawScope.drawContent();
                Canvas.restore();
                DrawContext drawContext22 = contentDrawScope.getDrawContext();
                drawContext22.setDensity(density);
                drawContext22.setLayoutDirection(layoutDirection);
                drawContext22.setCanvas(canvas);
                drawContext22.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
                drawContext22.setGraphicsLayer(graphicsLayer);
                getRenderNode().endRecording();
                int save2 = nativeCanvas.save();
                nativeCanvas.translate(f3, f4);
                nativeCanvas.drawRenderNode(getRenderNode());
                nativeCanvas.restoreToCount(save2);
                return;
            } finally {
                contentDrawScope.getDrawContext().getTransform().translate(-f2, -mo367toPx0680j_4);
            }
            contentDrawScope.getDrawContext().getTransform().translate(f2, mo367toPx0680j_4);
        } catch (Throwable th) {
            Canvas.restore();
            DrawContext drawContext3 = contentDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection);
            drawContext3.setCanvas(canvas);
            drawContext3.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th;
        }
        f = 1.0f;
        j = 4294967295L;
        c = ' ';
        if (edgeEffectWrapper.isRightNegationStretched()) {
        }
        if (edgeEffectWrapper.isRightAnimating()) {
        }
        if (edgeEffectWrapper.isBottomNegationStretched()) {
        }
        if (edgeEffectWrapper.isBottomAnimating()) {
        }
        if (z) {
        }
        if (!shouldDrawHorizontalStretch) {
        }
        if (shouldDrawVerticalStretch) {
        }
        LayoutDirection layoutDirection22 = contentDrawScope.getLayoutDirection();
        Canvas = AndroidCanvas_androidKt.Canvas(beginRecording);
        long mo5335getSizeNHjbRc2 = contentDrawScope.mo5335getSizeNHjbRc();
        density = contentDrawScope.getDrawContext().getDensity();
        layoutDirection = contentDrawScope.getDrawContext().getLayoutDirection();
        canvas = contentDrawScope.getDrawContext().getCanvas();
        mo5256getSizeNHjbRc = contentDrawScope.getDrawContext().mo5256getSizeNHjbRc();
        graphicsLayer = contentDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext4 = contentDrawScope.getDrawContext();
        drawContext4.setDensity(contentDrawScope);
        drawContext4.setLayoutDirection(layoutDirection22);
        drawContext4.setCanvas(Canvas);
        drawContext4.mo5257setSizeuvyYCjk(mo5335getSizeNHjbRc2);
        drawContext4.setGraphicsLayer(null);
        Canvas.save();
    }
}
