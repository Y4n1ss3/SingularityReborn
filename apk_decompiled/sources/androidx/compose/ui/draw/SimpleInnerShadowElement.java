package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SimpleInnerShadowElement extends ModifierNodeElement<SimpleInnerShadowNode> {
    public static final int $stable = 0;
    private final Shadow shadow;
    private final Shape shape;

    public SimpleInnerShadowElement(Shape shape, Shadow shadow) {
        this.shape = shape;
        this.shadow = shadow;
    }

    public static /* synthetic */ SimpleInnerShadowElement copy$default(SimpleInnerShadowElement simpleInnerShadowElement, Shape shape, Shadow shadow, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = simpleInnerShadowElement.shape;
        }
        if ((i & 2) != 0) {
            shadow = simpleInnerShadowElement.shadow;
        }
        return simpleInnerShadowElement.copy(shape, shadow);
    }

    public final Shape component1() {
        return this.shape;
    }

    public final Shadow component2() {
        return this.shadow;
    }

    public final SimpleInnerShadowElement copy(Shape shape, Shadow shadow) {
        return new SimpleInnerShadowElement(shape, shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleInnerShadowNode create() {
        return new SimpleInnerShadowNode(this.shape, this.shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleInnerShadowElement)) {
            return false;
        }
        SimpleInnerShadowElement simpleInnerShadowElement = (SimpleInnerShadowElement) obj;
        return q10.b(this.shape, simpleInnerShadowElement.shape) && q10.b(this.shadow, simpleInnerShadowElement.shadow);
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.shadow.hashCode() + (this.shape.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("innerShadow");
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("innerShadow", this.shadow);
    }

    public String toString() {
        return "SimpleInnerShadowElement(shape=" + this.shape + ", shadow=" + this.shadow + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SimpleInnerShadowNode simpleInnerShadowNode) {
        simpleInnerShadowNode.update(this.shape, this.shadow);
    }
}
