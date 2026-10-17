package androidx.compose.ui.draganddrop;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import defpackage.er;
import defpackage.ji0;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    @er
    public static final DragAndDropModifierNode DragAndDropModifierNode(ky kyVar, DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new DragAndDropNodeKt$DragAndDropModifierNode$1(kyVar, dragAndDropTarget), 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropSourceModifierNode DragAndDropSourceModifierNode(my myVar) {
        return new DragAndDropNode(myVar, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropTargetModifierNode DragAndDropTargetModifierNode(ky kyVar, DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new DragAndDropNodeKt$DragAndDropTargetModifierNode$1(kyVar, dragAndDropTarget), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: contains-Uv8p0NA, reason: not valid java name */
    public static final boolean m4268containsUv8p0NA(DragAndDropNode dragAndDropNode, long j) {
        if (!dragAndDropNode.getNode().isAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
        float intBitsToFloat = Float.intBitsToFloat((int) (positionInRoot >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (positionInRoot & 4294967295L));
        float m4262getSizeYbymL2g$ui = ((int) (dragAndDropNode.m4262getSizeYbymL2g$ui() >> 32)) + intBitsToFloat;
        float m4262getSizeYbymL2g$ui2 = ((int) (dragAndDropNode.m4262getSizeYbymL2g$ui() & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= m4262getSizeYbymL2g$ui) {
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= m4262getSizeYbymL2g$ui2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchEntered(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    private static final <T extends TraversableNode> T firstDescendantOrNull(T t, ky kyVar) {
        if (!t.getNode().isAttached()) {
            return null;
        }
        ji0 ji0Var = new ji0();
        TraversableNodeKt.traverseDescendants(t, new DragAndDropNodeKt$firstDescendantOrNull$1(kyVar, ji0Var));
        return (T) ji0Var.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> void traverseSelfAndDescendants(T t, ky kyVar) {
        if (kyVar.invoke(t) != TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        TraversableNodeKt.traverseDescendants(t, kyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @er
    public static final DragAndDropModifierNode DragAndDropModifierNode() {
        return new DragAndDropNode(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }
}
