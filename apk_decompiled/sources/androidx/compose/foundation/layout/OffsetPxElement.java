package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class OffsetPxElement extends ModifierNodeElement<OffsetPxNode> {
    private final ky inspectorInfo;
    private final ky offset;
    private final boolean rtlAware;

    public OffsetPxElement(ky kyVar, boolean z, ky kyVar2) {
        this.offset = kyVar;
        this.rtlAware = z;
        this.inspectorInfo = kyVar2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OffsetPxNode create() {
        return new OffsetPxNode(this.offset, this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.offset == offsetPxElement.offset && this.rtlAware == offsetPxElement.rtlAware;
    }

    public final ky getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final ky getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.rtlAware) + (this.offset.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.offset);
        sb.append(", rtlAware=");
        return uf.e(sb, this.rtlAware, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OffsetPxNode offsetPxNode) {
        offsetPxNode.update(this.offset, this.rtlAware);
    }
}
