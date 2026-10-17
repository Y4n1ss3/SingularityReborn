package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class BackgroundNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode, SemanticsModifierNode {
    private float alpha;
    private Brush brush;
    private long color;
    private final boolean isImportantForBounds;
    private LayoutDirection lastLayoutDirection;
    private Outline lastOutline;
    private Shape lastShape;
    private long lastSize;
    private Shape shape;
    private final boolean shouldAutoInvalidate;
    private Outline tmpOutline;

    private BackgroundNode(long j, Brush brush, float f, Shape shape) {
        this.color = j;
        this.brush = brush;
        this.alpha = f;
        this.shape = shape;
        this.lastSize = Size.Companion.m4593getUnspecifiedNHjbRc();
    }

    private final void drawOutline(ContentDrawScope contentDrawScope) {
        ContentDrawScope contentDrawScope2;
        Outline outline = getOutline(contentDrawScope);
        if (Color.m4762equalsimpl0(this.color, Color.Companion.m4797getUnspecified0d7_KjU())) {
            contentDrawScope2 = contentDrawScope;
        } else {
            contentDrawScope2 = contentDrawScope;
            OutlineKt.m5034drawOutlinewDX37Ww$default(contentDrawScope2, outline, this.color, 0.0f, null, null, 0, 60, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            OutlineKt.m5032drawOutlinehn5TExg$default(contentDrawScope2, outline, brush, this.alpha, null, null, 0, 56, null);
        }
    }

    private final void drawRect(ContentDrawScope contentDrawScope) {
        if (!Color.m4762equalsimpl0(this.color, Color.Companion.m4797getUnspecified0d7_KjU())) {
            DrawScope.m5329drawRectnJ9OG0$default(contentDrawScope, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            DrawScope.m5328drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    private final Outline getOutline(ContentDrawScope contentDrawScope) {
        Outline outline;
        if (Size.m4581equalsimpl0(contentDrawScope.mo5335getSizeNHjbRc(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection && q10.b(this.lastShape, this.shape)) {
            outline = this.lastOutline;
            outline.getClass();
        } else {
            ObserverModifierNodeKt.observeReads(this, new c(0, this, contentDrawScope));
            outline = this.tmpOutline;
            this.tmpOutline = null;
        }
        this.lastOutline = outline;
        this.lastSize = contentDrawScope.mo5335getSizeNHjbRc();
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
        this.lastShape = this.shape;
        outline.getClass();
        return outline;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 getOutline$lambda$0(BackgroundNode backgroundNode, ContentDrawScope contentDrawScope) {
        backgroundNode.tmpOutline = backgroundNode.shape.mo283createOutlinePq9zytI(contentDrawScope.mo5335getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        return w01.a;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.shape);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        if (this.shape == RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m228getColor0d7_KjU() {
        return this.color;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean isImportantForBounds() {
        return this.isImportantForBounds;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.lastSize = Size.Companion.m4593getUnspecifiedNHjbRc();
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setBrush(Brush brush) {
        this.brush = brush;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m229setColor8_81llA(long j) {
        this.color = j;
    }

    public final void setShape(Shape shape) {
        this.shape = shape;
    }

    public /* synthetic */ BackgroundNode(long j, Brush brush, float f, Shape shape, dq dqVar) {
        this(j, brush, f, shape);
    }
}
