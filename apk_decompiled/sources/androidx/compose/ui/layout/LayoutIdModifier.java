package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {
    public static final int $stable = 8;
    private Object layoutId;

    public LayoutIdModifier(Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public Object getLayoutId() {
        return this.layoutId;
    }

    public void setLayoutId$ui(Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        return this;
    }
}
