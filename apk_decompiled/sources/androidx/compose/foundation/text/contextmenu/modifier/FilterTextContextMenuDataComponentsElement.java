package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FilterTextContextMenuDataComponentsElement extends ModifierNodeElement<FilterTextContextMenuDataComponentsNode> {
    private final ky filter;

    public FilterTextContextMenuDataComponentsElement(ky kyVar) {
        this.filter = kyVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FilterTextContextMenuDataComponentsNode create() {
        return new FilterTextContextMenuDataComponentsNode(this.filter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilterTextContextMenuDataComponentsElement) && this.filter == ((FilterTextContextMenuDataComponentsElement) obj).filter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.filter.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("filterTextContextMenuDataComponents");
        inspectorInfo.getProperties().set("filter", this.filter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FilterTextContextMenuDataComponentsNode filterTextContextMenuDataComponentsNode) {
        filterTextContextMenuDataComponentsNode.setFilter(this.filter);
    }
}
