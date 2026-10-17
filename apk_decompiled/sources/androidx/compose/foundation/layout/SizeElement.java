package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.j50;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SizeElement extends ModifierNodeElement<SizeNode> {
    private final boolean enforceIncoming;
    private final ky inspectorInfo;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, ky kyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f4, z, kyVar, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SizeNode create() {
        return new SizeNode(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return Dp.m7616equalsimpl0(this.minWidth, sizeElement.minWidth) && Dp.m7616equalsimpl0(this.minHeight, sizeElement.minHeight) && Dp.m7616equalsimpl0(this.maxWidth, sizeElement.maxWidth) && Dp.m7616equalsimpl0(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.enforceIncoming) + j50.a(this.maxHeight, j50.a(this.maxWidth, j50.a(this.minHeight, Dp.m7617hashCodeimpl(this.minWidth) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SizeNode sizeNode) {
        sizeNode.m823setMinWidth0680j_4(this.minWidth);
        sizeNode.m822setMinHeight0680j_4(this.minHeight);
        sizeNode.m821setMaxWidth0680j_4(this.maxWidth);
        sizeNode.m820setMaxHeight0680j_4(this.maxHeight);
        sizeNode.setEnforceIncoming(this.enforceIncoming);
    }

    private SizeElement(float f, float f2, float f3, float f4, boolean z, ky kyVar) {
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
        this.inspectorInfo = kyVar;
    }

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, ky kyVar, dq dqVar) {
        this(f, f2, f3, f4, z, kyVar);
    }
}
