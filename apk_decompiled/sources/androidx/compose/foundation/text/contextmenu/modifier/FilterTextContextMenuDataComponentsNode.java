package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import defpackage.ky;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterTextContextMenuDataComponentsNode extends Modifier.Node implements TraversableNode {
    private ky filter;

    public FilterTextContextMenuDataComponentsNode(ky kyVar) {
        this.filter = kyVar;
    }

    public final ky getFilter() {
        return this.filter;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TextContextMenuDataTraverseKey.INSTANCE;
    }

    public final void setFilter(ky kyVar) {
        this.filter = kyVar;
    }
}
