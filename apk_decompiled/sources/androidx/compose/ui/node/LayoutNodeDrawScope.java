package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.er;
import defpackage.k4;
import defpackage.ky;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public static final int $stable = 0;
    private final CanvasDrawScope canvasDrawScope;
    private DrawModifierNode drawNode;

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i, dq dqVar) {
        this((i & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: draw-eZhPAX0$ui, reason: not valid java name */
    public final void m6482draweZhPAX0$ui(Canvas canvas, long j, NodeCoordinator nodeCoordinator, Modifier.Node node, GraphicsLayer graphicsLayer) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(4);
        DelegatingNode delegatingNode = node;
        MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof DrawModifierNode) {
                m6483drawDirecteZhPAX0$ui(canvas, j, nodeCoordinator, delegatingNode, graphicsLayer);
            } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                int i = 0;
                delegatingNode = delegatingNode;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            delegatingNode = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNode != 0) {
                                mutableVector.add(delegatingNode);
                                delegatingNode = 0;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    delegatingNode = delegatingNode;
                }
                if (i == 1) {
                }
            }
            delegatingNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo5232drawArcillE91I(Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5232drawArcillE91I(brush, f, f2, z, j, j2, f3, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo5233drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5233drawArcyD3GUKo(j, f, f2, z, j2, j3, f3, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo5234drawCircleV9BoPsw(Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5234drawCircleV9BoPsw(brush, f, j, f2, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo5235drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5235drawCircleVaOC9Bg(j, f, j2, f2, drawStyle, colorFilter, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        DelegatingNode nextDrawNode;
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        if (drawModifierNode == null) {
            throw k4.a("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        nextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (nextDrawNode == 0) {
            NodeCoordinator m6414requireCoordinator64DMado = DelegatableNodeKt.m6414requireCoordinator64DMado(drawModifierNode, NodeKind.m6573constructorimpl(4));
            if (m6414requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                m6414requireCoordinator64DMado = m6414requireCoordinator64DMado.getWrapped$ui();
                m6414requireCoordinator64DMado.getClass();
            }
            m6414requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
            return;
        }
        int m6573constructorimpl = NodeKind.m6573constructorimpl(4);
        MutableVector mutableVector = null;
        while (nextDrawNode != 0) {
            if (nextDrawNode instanceof DrawModifierNode) {
                performDraw((DrawModifierNode) nextDrawNode, canvas, getDrawContext().getGraphicsLayer());
            } else if ((nextDrawNode.getKindSet$ui() & m6573constructorimpl) != 0 && (nextDrawNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = nextDrawNode.getDelegate$ui();
                int i = 0;
                nextDrawNode = nextDrawNode;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            nextDrawNode = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (nextDrawNode != 0) {
                                mutableVector.add(nextDrawNode);
                                nextDrawNode = 0;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    nextDrawNode = nextDrawNode;
                }
                if (i == 1) {
                }
            }
            nextDrawNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* renamed from: drawDirect-eZhPAX0$ui, reason: not valid java name */
    public final void m6483drawDirecteZhPAX0$ui(Canvas canvas, long j, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode, GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        Density density = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long mo5256getSizeNHjbRc = canvasDrawScope.getDrawContext().mo5256getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(nodeCoordinator);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo5257setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            drawModifierNode.draw(this);
            canvas.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            this.drawNode = drawModifierNode2;
        } catch (Throwable th) {
            canvas.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @er
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo5236drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5236drawImage9jGpkUE(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo5237drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        this.canvasDrawScope.mo5237drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo5238drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5238drawImagegbVJVH8(imageBitmap, j, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo5239drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo5239drawLine1RTmtNc(brush, j, j2, f, i, pathEffect, f2, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo5240drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo5240drawLineNGM6Ib0(j, j2, j3, f, i, pathEffect, f2, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo5241drawOvalAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5241drawOvalAsUm42w(brush, j, j2, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo5242drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5242drawOvalnJ9OG0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo5243drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5243drawPathGBMwjPU(path, brush, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo5244drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5244drawPathLG529CI(path, j, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo5245drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        this.canvasDrawScope.mo5245drawPointsF8ZwMP8(list, i, j, f, i2, pathEffect, f2, colorFilter, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo5246drawPointsGsft0Ws(List<Offset> list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        this.canvasDrawScope.mo5246drawPointsGsft0Ws(list, i, brush, f, i2, pathEffect, f2, colorFilter, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo5247drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5247drawRectAsUm42w(brush, j, j2, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo5248drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5248drawRectnJ9OG0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo5249drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5249drawRoundRectZuiqVtQ(brush, j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo5250drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo5250drawRoundRectuAw5IA(j, j2, j3, j4, drawStyle, f, colorFilter, i);
    }

    public final CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo5334getCenterF1C5BW0() {
        return this.canvasDrawScope.mo5334getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo5335getSizeNHjbRc() {
        return this.canvasDrawScope.mo5335getSizeNHjbRc();
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator m6414requireCoordinator64DMado = DelegatableNodeKt.m6414requireCoordinator64DMado(drawModifierNode, NodeKind.m6573constructorimpl(4));
        m6414requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui().m6483drawDirecteZhPAX0$ui(canvas, IntSizeKt.m7794toSizeozmzZPI(m6414requireCoordinator64DMado.mo6242getSizeYbymL2g()), m6414requireCoordinator64DMado, drawModifierNode, graphicsLayer);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: record-JVtK1S4 */
    public void mo5336recordJVtK1S4(GraphicsLayer graphicsLayer, long j, ky kyVar) {
        graphicsLayer.m5429recordmLhObY(this, getLayoutDirection(), j, new LayoutNodeDrawScope$record$1(this, this.drawNode, kyVar));
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo360roundToPxR2X_6o(long j) {
        return this.canvasDrawScope.mo360roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo361roundToPx0680j_4(float f) {
        return this.canvasDrawScope.mo361roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo362toDpGaN1DYA(long j) {
        return this.canvasDrawScope.mo362toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo363toDpu2uoSUM(float f) {
        return this.canvasDrawScope.mo363toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo365toDpSizekrfVVM(long j) {
        return this.canvasDrawScope.mo365toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo366toPxR2X_6o(long j) {
        return this.canvasDrawScope.mo366toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo367toPx0680j_4(float f) {
        return this.canvasDrawScope.mo367toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo368toSizeXkaWNTQ(long j) {
        return this.canvasDrawScope.mo368toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo369toSp0xMU5do(float f) {
        return this.canvasDrawScope.mo369toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo370toSpkPz2Gy4(float f) {
        return this.canvasDrawScope.mo370toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo364toDpu2uoSUM(int i) {
        return this.canvasDrawScope.mo364toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo371toSpkPz2Gy4(int i) {
        return this.canvasDrawScope.mo371toSpkPz2Gy4(i);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
