package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IndicatorLineElement extends ModifierNodeElement<IndicatorLineNode> {
    public static final int $stable = 0;
    private final TextFieldColors colors;
    private final boolean enabled;
    private final float focusedIndicatorLineThickness;
    private final InteractionSource interactionSource;
    private final boolean isError;
    private final Shape textFieldShape;
    private final float unfocusedIndicatorLineThickness;

    private IndicatorLineElement(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2) {
        this.enabled = z;
        this.isError = z2;
        this.interactionSource = interactionSource;
        this.colors = textFieldColors;
        this.textFieldShape = shape;
        this.focusedIndicatorLineThickness = f;
        this.unfocusedIndicatorLineThickness = f2;
    }

    /* renamed from: copy-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ IndicatorLineElement m2065copygv0btCI$default(IndicatorLineElement indicatorLineElement, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = indicatorLineElement.enabled;
        }
        if ((i & 2) != 0) {
            z2 = indicatorLineElement.isError;
        }
        if ((i & 4) != 0) {
            interactionSource = indicatorLineElement.interactionSource;
        }
        if ((i & 8) != 0) {
            textFieldColors = indicatorLineElement.colors;
        }
        if ((i & 16) != 0) {
            shape = indicatorLineElement.textFieldShape;
        }
        if ((i & 32) != 0) {
            f = indicatorLineElement.focusedIndicatorLineThickness;
        }
        if ((i & 64) != 0) {
            f2 = indicatorLineElement.unfocusedIndicatorLineThickness;
        }
        float f3 = f;
        float f4 = f2;
        Shape shape2 = shape;
        InteractionSource interactionSource2 = interactionSource;
        return indicatorLineElement.m2068copygv0btCI(z, z2, interactionSource2, textFieldColors, shape2, f3, f4);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.isError;
    }

    public final InteractionSource component3() {
        return this.interactionSource;
    }

    public final TextFieldColors component4() {
        return this.colors;
    }

    public final Shape component5() {
        return this.textFieldShape;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    public final float m2066component6D9Ej5fM() {
        return this.focusedIndicatorLineThickness;
    }

    /* renamed from: component7-D9Ej5fM, reason: not valid java name */
    public final float m2067component7D9Ej5fM() {
        return this.unfocusedIndicatorLineThickness;
    }

    /* renamed from: copy-gv0btCI, reason: not valid java name */
    public final IndicatorLineElement m2068copygv0btCI(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2) {
        return new IndicatorLineElement(z, z2, interactionSource, textFieldColors, shape, f, f2, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public IndicatorLineNode create() {
        return new IndicatorLineNode(this.enabled, this.isError, this.interactionSource, this.colors, this.textFieldShape, this.focusedIndicatorLineThickness, this.unfocusedIndicatorLineThickness, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorLineElement)) {
            return false;
        }
        IndicatorLineElement indicatorLineElement = (IndicatorLineElement) obj;
        return this.enabled == indicatorLineElement.enabled && this.isError == indicatorLineElement.isError && q10.b(this.interactionSource, indicatorLineElement.interactionSource) && q10.b(this.colors, indicatorLineElement.colors) && q10.b(this.textFieldShape, indicatorLineElement.textFieldShape) && Dp.m7616equalsimpl0(this.focusedIndicatorLineThickness, indicatorLineElement.focusedIndicatorLineThickness) && Dp.m7616equalsimpl0(this.unfocusedIndicatorLineThickness, indicatorLineElement.unfocusedIndicatorLineThickness);
    }

    public final TextFieldColors getColors() {
        return this.colors;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: getFocusedIndicatorLineThickness-D9Ej5fM, reason: not valid java name */
    public final float m2069getFocusedIndicatorLineThicknessD9Ej5fM() {
        return this.focusedIndicatorLineThickness;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final Shape getTextFieldShape() {
        return this.textFieldShape;
    }

    /* renamed from: getUnfocusedIndicatorLineThickness-D9Ej5fM, reason: not valid java name */
    public final float m2070getUnfocusedIndicatorLineThicknessD9Ej5fM() {
        return this.unfocusedIndicatorLineThickness;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = (this.interactionSource.hashCode() + kp0.c(Boolean.hashCode(this.enabled) * 31, 31, this.isError)) * 31;
        TextFieldColors textFieldColors = this.colors;
        int hashCode2 = (hashCode + (textFieldColors == null ? 0 : textFieldColors.hashCode())) * 31;
        Shape shape = this.textFieldShape;
        return Dp.m7617hashCodeimpl(this.unfocusedIndicatorLineThickness) + j50.a(this.focusedIndicatorLineThickness, (hashCode2 + (shape != null ? shape.hashCode() : 0)) * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indicatorLine");
        uf.d(this.isError, uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo), "isError", inspectorInfo).set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("colors", this.colors);
        inspectorInfo.getProperties().set("textFieldShape", this.textFieldShape);
        j50.g(this.focusedIndicatorLineThickness, inspectorInfo.getProperties(), "focusedIndicatorLineThickness", inspectorInfo).set("unfocusedIndicatorLineThickness", Dp.m7609boximpl(this.unfocusedIndicatorLineThickness));
    }

    public final boolean isError() {
        return this.isError;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IndicatorLineElement(enabled=");
        sb.append(this.enabled);
        sb.append(", isError=");
        sb.append(this.isError);
        sb.append(", interactionSource=");
        sb.append(this.interactionSource);
        sb.append(", colors=");
        sb.append(this.colors);
        sb.append(", textFieldShape=");
        sb.append(this.textFieldShape);
        sb.append(", focusedIndicatorLineThickness=");
        fc.i(this.focusedIndicatorLineThickness, sb, ", unfocusedIndicatorLineThickness=");
        sb.append((Object) Dp.m7622toStringimpl(this.unfocusedIndicatorLineThickness));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(IndicatorLineNode indicatorLineNode) {
        indicatorLineNode.m2071updategv0btCI(this.enabled, this.isError, this.interactionSource, this.colors, this.textFieldShape, this.focusedIndicatorLineThickness, this.unfocusedIndicatorLineThickness);
    }

    public /* synthetic */ IndicatorLineElement(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, dq dqVar) {
        this(z, z2, interactionSource, textFieldColors, shape, f, f2);
    }
}
