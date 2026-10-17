package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsElement(float f, float f2, int i, dq dqVar) {
        this((i & 1) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f2, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public UnspecifiedConstraintsNode create() {
        return new UnspecifiedConstraintsNode(this.minWidth, this.minHeight, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return Dp.m7616equalsimpl0(this.minWidth, unspecifiedConstraintsElement.minWidth) && Dp.m7616equalsimpl0(this.minHeight, unspecifiedConstraintsElement.minHeight);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m824getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m825getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.minHeight) + (Dp.m7617hashCodeimpl(this.minWidth) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("defaultMinSize");
        j50.g(this.minWidth, inspectorInfo.getProperties(), "minWidth", inspectorInfo).set("minHeight", Dp.m7609boximpl(this.minHeight));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(UnspecifiedConstraintsNode unspecifiedConstraintsNode) {
        unspecifiedConstraintsNode.m829setMinWidth0680j_4(this.minWidth);
        unspecifiedConstraintsNode.m828setMinHeight0680j_4(this.minHeight);
    }

    private UnspecifiedConstraintsElement(float f, float f2) {
        this.minWidth = f;
        this.minHeight = f2;
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f, float f2, dq dqVar) {
        this(f, f2);
    }
}
