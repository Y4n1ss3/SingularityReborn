package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ZIndexElement extends ModifierNodeElement<ZIndexNode> {
    public static final int $stable = 0;
    private final float zIndex;

    public ZIndexElement(float f) {
        this.zIndex = f;
    }

    public static /* synthetic */ ZIndexElement copy$default(ZIndexElement zIndexElement, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = zIndexElement.zIndex;
        }
        return zIndexElement.copy(f);
    }

    public final float component1() {
        return this.zIndex;
    }

    public final ZIndexElement copy(float f) {
        return new ZIndexElement(f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ZIndexNode create() {
        return new ZIndexNode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.zIndex, ((ZIndexElement) obj).zIndex) == 0;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.hashCode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("zIndex");
        inspectorInfo.getProperties().set("zIndex", Float.valueOf(this.zIndex));
    }

    public String toString() {
        return k4.g(new StringBuilder("ZIndexElement(zIndex="), this.zIndex, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ZIndexNode zIndexNode) {
        zIndexNode.setZIndex(this.zIndex);
    }
}
