package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VerticalAlignNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    private Alignment.Vertical vertical;

    public VerticalAlignNode(Alignment.Vertical vertical) {
        this.vertical = vertical;
    }

    public final Alignment.Vertical getVertical() {
        return this.vertical;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public RowColumnParentData modifyParentData(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.vertical$foundation_layout(this.vertical));
        return rowColumnParentData;
    }

    public final void setVertical(Alignment.Vertical vertical) {
        this.vertical = vertical;
    }
}
