package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SensitiveNodeElement extends ModifierNodeElement<SensitiveContentNode> {
    private final boolean isContentSensitive;

    public SensitiveNodeElement(boolean z) {
        this.isContentSensitive = z;
    }

    public static /* synthetic */ SensitiveNodeElement copy$default(SensitiveNodeElement sensitiveNodeElement, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sensitiveNodeElement.isContentSensitive;
        }
        return sensitiveNodeElement.copy(z);
    }

    public final boolean component1() {
        return this.isContentSensitive;
    }

    public final SensitiveNodeElement copy(boolean z) {
        return new SensitiveNodeElement(z);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SensitiveContentNode create() {
        return new SensitiveContentNode(this.isContentSensitive);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveNodeElement) && this.isContentSensitive == ((SensitiveNodeElement) obj).isContentSensitive;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.isContentSensitive);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sensitiveContent");
        inspectorInfo.getProperties().set("isContentSensitive", Boolean.valueOf(this.isContentSensitive));
    }

    public final boolean isContentSensitive() {
        return this.isContentSensitive;
    }

    public String toString() {
        return uf.e(new StringBuilder("SensitiveNodeElement(isContentSensitive="), this.isContentSensitive, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SensitiveContentNode sensitiveContentNode) {
        sensitiveContentNode.setContentSensitive(this.isContentSensitive);
    }
}
