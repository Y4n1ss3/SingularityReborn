package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddTextContextMenuDataComponentsNode extends Modifier.Node implements TraversableNode {
    public static final int $stable = 8;
    private ky builder;

    public AddTextContextMenuDataComponentsNode(ky kyVar) {
        this.builder = kyVar;
    }

    public final ky getBuilder() {
        return this.builder;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TextContextMenuDataTraverseKey.INSTANCE;
    }

    public final void setBuilder(ky kyVar) {
        this.builder = kyVar;
    }
}
