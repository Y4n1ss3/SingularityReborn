package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlockDropShadowElement extends ModifierNodeElement<BlockDropShadowNode> {
    public static final int $stable = 0;
    private final ky block;
    private final Shape shape;

    public BlockDropShadowElement(Shape shape, ky kyVar) {
        this.shape = shape;
        this.block = kyVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BlockDropShadowNode create() {
        return new BlockDropShadowNode(this.shape, this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockDropShadowElement)) {
            return false;
        }
        BlockDropShadowElement blockDropShadowElement = (BlockDropShadowElement) obj;
        return q10.b(this.shape, blockDropShadowElement.shape) && this.block == blockDropShadowElement.block;
    }

    public final ky getBlock() {
        return this.block;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode() + (this.shape.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropShadow");
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("block", this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockDropShadowNode blockDropShadowNode) {
        blockDropShadowNode.update(this.shape, this.block);
    }
}
