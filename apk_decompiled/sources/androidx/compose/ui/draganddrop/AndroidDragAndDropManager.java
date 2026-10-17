package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fi0;
import defpackage.ky;
import defpackage.ny;
import defpackage.ub;
import defpackage.zb;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, DragAndDropManager {
    public static final int $stable = 8;
    private final ny startDrag;
    private final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(null, null, 3, null);
    private final zb interestedTargets = new zb();
    private final Modifier modifier = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public DragAndDropNode create() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = AndroidDragAndDropManager.this.rootDragAndDropNode;
            return dragAndDropNode;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = AndroidDragAndDropManager.this.rootDragAndDropNode;
            return dragAndDropNode.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DragAndDropNode dragAndDropNode) {
        }
    };

    public AndroidDragAndDropManager(ny nyVar) {
        this.startDrag = nyVar;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isInterestedTarget(DragAndDropTarget dragAndDropTarget) {
        return this.interestedTargets.contains(dragAndDropTarget);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isRequestDragAndDropTransferRequired() {
        return true;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean acceptDragAndDropTransfer = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                Iterator it = this.interestedTargets.iterator();
                while (true) {
                    ub ubVar = (ub) it;
                    if (!ubVar.hasNext()) {
                        break;
                    } else {
                        ((DragAndDropTarget) ubVar.next()).onStarted(dragAndDropEvent);
                    }
                }
            case 2:
                this.rootDragAndDropNode.onMoved(dragAndDropEvent);
                break;
            case 4:
                this.rootDragAndDropNode.onEnded(dragAndDropEvent);
                this.interestedTargets.clear();
                break;
            case 5:
                this.rootDragAndDropNode.onEntered(dragAndDropEvent);
                break;
            case 6:
                this.rootDragAndDropNode.onExited(dragAndDropEvent);
                break;
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void registerTargetInterest(DragAndDropTarget dragAndDropTarget) {
        this.interestedTargets.add(dragAndDropTarget);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    /* renamed from: requestDragAndDropTransfer-Uv8p0NA, reason: not valid java name */
    public void mo4259requestDragAndDropTransferUv8p0NA(DragAndDropNode dragAndDropNode, long j) {
        final fi0 fi0Var = new fi0();
        dragAndDropNode.m4265startDragAndDropTransferd4ec7I(new DragAndDropStartTransferScope() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1
            @Override // androidx.compose.ui.draganddrop.DragAndDropStartTransferScope
            /* renamed from: startDragAndDropTransfer-12SF9DM, reason: not valid java name */
            public boolean mo4260startDragAndDropTransfer12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j2, ky kyVar) {
                ny nyVar;
                fi0 fi0Var2 = fi0.this;
                nyVar = this.startDrag;
                fi0Var2.d = ((Boolean) nyVar.invoke(dragAndDropTransferData, Size.m4573boximpl(j2), kyVar)).booleanValue();
                return fi0.this.d;
            }
        }, j, new AndroidDragAndDropManager$requestDragAndDropTransfer$1$1(fi0Var));
    }
}
