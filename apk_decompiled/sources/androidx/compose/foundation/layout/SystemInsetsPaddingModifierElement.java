package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SystemInsetsPaddingModifierElement extends ModifierNodeElement<SystemInsetsPaddingModifierNode> {
    private final ky insetsGetter;
    private final ky inspectorInfo;

    public SystemInsetsPaddingModifierElement(ky kyVar, ky kyVar2) {
        this.inspectorInfo = kyVar;
        this.insetsGetter = kyVar2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SystemInsetsPaddingModifierNode create() {
        return new SystemInsetsPaddingModifierNode(this.insetsGetter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SystemInsetsPaddingModifierElement) && this.insetsGetter == ((SystemInsetsPaddingModifierElement) obj).insetsGetter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.insetsGetter.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SystemInsetsPaddingModifierNode systemInsetsPaddingModifierNode) {
        systemInsetsPaddingModifierNode.update(this.insetsGetter);
    }
}
