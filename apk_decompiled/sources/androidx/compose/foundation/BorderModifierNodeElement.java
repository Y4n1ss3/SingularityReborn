package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.fc;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {
    public static final int $stable = 0;
    private final Brush brush;
    private final Shape shape;
    private final float width;

    private BorderModifierNodeElement(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
    }

    /* renamed from: copy-8Feqmps$default, reason: not valid java name */
    public static /* synthetic */ BorderModifierNodeElement m246copy8Feqmps$default(BorderModifierNodeElement borderModifierNodeElement, float f, Brush brush, Shape shape, int i, Object obj) {
        if ((i & 1) != 0) {
            f = borderModifierNodeElement.width;
        }
        if ((i & 2) != 0) {
            brush = borderModifierNodeElement.brush;
        }
        if ((i & 4) != 0) {
            shape = borderModifierNodeElement.shape;
        }
        return borderModifierNodeElement.m248copy8Feqmps(f, brush, shape);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m247component1D9Ej5fM() {
        return this.width;
    }

    public final Brush component2() {
        return this.brush;
    }

    public final Shape component3() {
        return this.shape;
    }

    /* renamed from: copy-8Feqmps, reason: not valid java name */
    public final BorderModifierNodeElement m248copy8Feqmps(float f, Brush brush, Shape shape) {
        return new BorderModifierNodeElement(f, brush, shape, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BorderModifierNode create() {
        return new BorderModifierNode(this.width, this.brush, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return Dp.m7616equalsimpl0(this.width, borderModifierNodeElement.width) && q10.b(this.brush, borderModifierNodeElement.brush) && q10.b(this.shape, borderModifierNodeElement.shape);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m249getWidthD9Ej5fM() {
        return this.width;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.shape.hashCode() + ((this.brush.hashCode() + (Dp.m7617hashCodeimpl(this.width) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("border");
        inspectorInfo.getProperties().set("width", Dp.m7609boximpl(this.width));
        if (this.brush instanceof SolidColor) {
            inspectorInfo.getProperties().set("color", Color.m4751boximpl(((SolidColor) this.brush).m5117getValue0d7_KjU()));
            inspectorInfo.setValue(Color.m4751boximpl(((SolidColor) this.brush).m5117getValue0d7_KjU()));
        } else {
            inspectorInfo.getProperties().set("brush", this.brush);
        }
        inspectorInfo.getProperties().set("shape", this.shape);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BorderModifierNodeElement(width=");
        fc.i(this.width, sb, ", brush=");
        sb.append(this.brush);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BorderModifierNode borderModifierNode) {
        borderModifierNode.m245setWidth0680j_4(this.width);
        borderModifierNode.setBrush(this.brush);
        borderModifierNode.setShape(this.shape);
    }

    public /* synthetic */ BorderModifierNodeElement(float f, Brush brush, Shape shape, dq dqVar) {
        this(f, brush, shape);
    }
}
