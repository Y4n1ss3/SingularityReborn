package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SimpleDropShadowElement extends ModifierNodeElement<SimpleDropShadowNode> {
    public static final int $stable = 0;
    private final Shadow shadow;
    private final Shape shape;

    public SimpleDropShadowElement(Shape shape, Shadow shadow) {
        this.shape = shape;
        this.shadow = shadow;
    }

    public static /* synthetic */ SimpleDropShadowElement copy$default(SimpleDropShadowElement simpleDropShadowElement, Shape shape, Shadow shadow, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = simpleDropShadowElement.shape;
        }
        if ((i & 2) != 0) {
            shadow = simpleDropShadowElement.shadow;
        }
        return simpleDropShadowElement.copy(shape, shadow);
    }

    public final Shape component1() {
        return this.shape;
    }

    public final Shadow component2() {
        return this.shadow;
    }

    public final SimpleDropShadowElement copy(Shape shape, Shadow shadow) {
        return new SimpleDropShadowElement(shape, shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleDropShadowNode create() {
        return new SimpleDropShadowNode(this.shape, this.shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleDropShadowElement)) {
            return false;
        }
        SimpleDropShadowElement simpleDropShadowElement = (SimpleDropShadowElement) obj;
        return q10.b(this.shape, simpleDropShadowElement.shape) && q10.b(this.shadow, simpleDropShadowElement.shadow);
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
        inspectorInfo.setName("dropShadow");
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("dropShadow", this.shadow);
    }

    public String toString() {
        return "SimpleDropShadowElement(shape=" + this.shape + ", shadow=" + this.shadow + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SimpleDropShadowNode simpleDropShadowNode) {
        simpleDropShadowNode.update(this.shape, this.shadow);
    }
}
