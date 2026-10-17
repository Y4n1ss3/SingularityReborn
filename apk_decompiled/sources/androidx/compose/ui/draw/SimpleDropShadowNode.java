package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SimpleDropShadowNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {
    public static final int $stable = 8;
    private Shadow shadow;
    private DropShadowPainter shadowPainter;
    private Shape shape;

    public SimpleDropShadowNode(Shape shape, Shadow shadow) {
        this.shape = shape;
        this.shadow = shadow;
    }

    private final DropShadowPainter obtainPainter() {
        DropShadowPainter dropShadowPainter = this.shadowPainter;
        if (dropShadowPainter != null) {
            return dropShadowPainter;
        }
        DropShadowPainter createDropShadowPainter = DelegatableNodeKt.requireGraphicsContext(this).getShadowContext().createDropShadowPainter(this.shape, this.shadow);
        this.shadowPainter = createDropShadowPainter;
        return createDropShadowPainter;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Painter.m5460drawx_KDEd0$default(obtainPainter(), contentDrawScope, contentDrawScope.mo5335getSizeNHjbRc(), 0.0f, null, 6, null);
        contentDrawScope.drawContent();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SimpleDropShadowNode)) {
            return false;
        }
        SimpleDropShadowNode simpleDropShadowNode = (SimpleDropShadowNode) obj;
        return q10.b(this.shape, simpleDropShadowNode.shape) && q10.b(this.shadow, simpleDropShadowNode.shadow);
    }

    public int hashCode() {
        return this.shadow.hashCode() + (this.shape.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.shadowPainter = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public final void update(Shape shape, Shadow shadow) {
        if (!q10.b(this.shape, shape) || !q10.b(this.shadow, shadow)) {
            this.shadowPainter = null;
        }
        this.shape = shape;
        this.shadow = shadow;
    }
}
