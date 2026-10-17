package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.q10;
import defpackage.r60;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class NodeParent {
    public static final int $stable = 8;
    private final MutableVector<Node> children = new MutableVector<>(new Node[16], 0);
    private final xa0 removeMatchingPointerInputModifierNodeList = new xa0(10);

    public boolean buildCache(r60 r60Var, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            z2 = nodeArr[i].buildCache(r60Var, layoutCoordinates, internalPointerEvent, z) || z2;
        }
        return z2;
    }

    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.content[size].getPointerIds().isEmpty()) {
                this.children.removeAt(size);
            }
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public void dispatchCancel() {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].dispatchCancel();
        }
    }

    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = nodeArr[i].dispatchFinalEventPass(internalPointerEvent) || z;
        }
        cleanUpHits(internalPointerEvent);
        return z;
    }

    public boolean dispatchMainEventPass(r60 r60Var, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            z2 = nodeArr[i].dispatchMainEventPass(r60Var, layoutCoordinates, internalPointerEvent, z) || z2;
        }
        return z2;
    }

    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public void removeInvalidPointerIdsAndChanges(long j, xa0 xa0Var) {
        MutableVector<Node> mutableVector = this.children;
        Node[] nodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].removeInvalidPointerIdsAndChanges(j, xa0Var);
        }
    }

    public void removePointerInputModifierNode(Modifier.Node node) {
        this.removeMatchingPointerInputModifierNodeList.j();
        this.removeMatchingPointerInputModifierNodeList.g(this);
        while (this.removeMatchingPointerInputModifierNodeList.e()) {
            NodeParent nodeParent = (NodeParent) this.removeMatchingPointerInputModifierNodeList.l(r0.b - 1);
            int i = 0;
            while (i < nodeParent.children.getSize()) {
                Node node2 = nodeParent.children.content[i];
                if (q10.b(node2.getModifierNode(), node)) {
                    nodeParent.children.remove(node2);
                    node2.dispatchCancel();
                } else {
                    this.removeMatchingPointerInputModifierNodeList.g(node2);
                    i++;
                }
            }
        }
    }
}
