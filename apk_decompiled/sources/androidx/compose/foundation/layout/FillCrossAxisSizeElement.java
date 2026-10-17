package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FillCrossAxisSizeElement extends ModifierNodeElement<FillCrossAxisSizeNode> {
    public static final int $stable = 0;
    private final float fraction;

    public FillCrossAxisSizeElement(float f) {
        this.fraction = f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FillCrossAxisSizeNode create() {
        return new FillCrossAxisSizeNode(this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        FillCrossAxisSizeNode fillCrossAxisSizeNode = obj instanceof FillCrossAxisSizeNode ? (FillCrossAxisSizeNode) obj : null;
        return fillCrossAxisSizeNode != null && this.fraction == fillCrossAxisSizeNode.getFraction();
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.hashCode(this.fraction) * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("fraction");
        inspectorInfo.setValue(Float.valueOf(this.fraction));
        inspectorInfo.getProperties().set("fraction", Float.valueOf(this.fraction));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FillCrossAxisSizeNode fillCrossAxisSizeNode) {
        fillCrossAxisSizeNode.setFraction(this.fraction);
    }
}
