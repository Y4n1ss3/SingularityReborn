package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.q10;
import defpackage.ra0;
import defpackage.xa0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class HitPathTracker {
    public static final int $stable = 8;
    private boolean clearNodeCacheAfterDispatchedEvent;
    private boolean dispatchCancelAfterDispatchedEvent;
    private boolean dispatchingEvent;
    private boolean removeSpecificNodesAfterDispatchedEvent;
    private final LayoutCoordinates rootCoordinates;
    private final xa0 nodesToRemove = new xa0();
    private final NodeParent root = new NodeParent();
    private final ra0 hitPointerIdsAndNodesForPruningNonMatches = new ra0(10);

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }

    /* renamed from: addHitPath-QJqDSyo$default, reason: not valid java name */
    public static /* synthetic */ void m6002addHitPathQJqDSyo$default(HitPathTracker hitPathTracker, long j, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        hitPathTracker.m6003addHitPathQJqDSyo(j, list, z);
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z);
    }

    private final void removeInvalidPointerIdsAndChanges(long j, xa0 xa0Var) {
        this.root.removeInvalidPointerIdsAndChanges(j, xa0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePointerInputModifierNode(Modifier.Node node) {
        if (!this.dispatchingEvent) {
            this.root.removePointerInputModifierNode(node);
        } else {
            this.removeSpecificNodesAfterDispatchedEvent = true;
            this.nodesToRemove.g(node);
        }
    }

    /* renamed from: addHitPath-QJqDSyo, reason: not valid java name */
    public final void m6003addHitPathQJqDSyo(long j, List<? extends Modifier.Node> list, boolean z) {
        Node node;
        NodeParent nodeParent = this.root;
        int size = list.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            Modifier.Node node2 = list.get(i);
            if (node2.isAttached()) {
                node2.setDetachedListener$ui(new HitPathTracker$addHitPath$1(this, node2));
                if (z2) {
                    MutableVector<Node> children = nodeParent.getChildren();
                    Node[] nodeArr = children.content;
                    int size2 = children.getSize();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            node = null;
                            break;
                        }
                        node = nodeArr[i2];
                        if (q10.b(node.getModifierNode(), node2)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    Node node3 = node;
                    if (node3 != null) {
                        node3.markIsIn();
                        node3.getPointerIds().add(j);
                        if (z) {
                            ra0 ra0Var = this.hitPointerIdsAndNodesForPruningNonMatches;
                            Object b = ra0Var.b(j);
                            if (b == null) {
                                b = new xa0();
                                ra0Var.h(j, b);
                            }
                            ((xa0) b).g(node3);
                        }
                        nodeParent = node3;
                    } else {
                        z2 = false;
                    }
                }
                Node node4 = new Node(node2);
                node4.getPointerIds().add(j);
                if (z) {
                    ra0 ra0Var2 = this.hitPointerIdsAndNodesForPruningNonMatches;
                    Object b2 = ra0Var2.b(j);
                    if (b2 == null) {
                        b2 = new xa0();
                        ra0Var2.h(j, b2);
                    }
                    ((xa0) b2).g(node4);
                }
                nodeParent.getChildren().add(node4);
                nodeParent = node4;
            }
        }
        if (z) {
            ra0 ra0Var3 = this.hitPointerIdsAndNodesForPruningNonMatches;
            long[] jArr = ra0Var3.b;
            Object[] objArr = ra0Var3.c;
            long[] jArr2 = ra0Var3.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j2 = jArr2[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j2) < 128) {
                                int i6 = (i3 << 3) + i5;
                                removeInvalidPointerIdsAndChanges(jArr[i6], (xa0) objArr[i6]);
                            }
                            j2 >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.hitPointerIdsAndNodesForPruningNonMatches.c();
    }

    public final void clearPreviouslyHitModifierNodeCache() {
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = true;
        } else {
            this.root.clear();
        }
    }

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent, boolean z) {
        xa0 xa0Var;
        if (!this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z)) {
            return false;
        }
        boolean z2 = true;
        this.dispatchingEvent = true;
        boolean dispatchMainEventPass = this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z);
        if (!this.root.dispatchFinalEventPass(internalPointerEvent) && !dispatchMainEventPass) {
            z2 = false;
        }
        this.dispatchingEvent = false;
        if (this.removeSpecificNodesAfterDispatchedEvent) {
            this.removeSpecificNodesAfterDispatchedEvent = false;
            int i = this.nodesToRemove.b;
            int i2 = 0;
            while (true) {
                xa0Var = this.nodesToRemove;
                if (i2 >= i) {
                    break;
                }
                removePointerInputModifierNode((Modifier.Node) xa0Var.b(i2));
                i2++;
            }
            xa0Var.j();
        }
        if (this.dispatchCancelAfterDispatchedEvent) {
            this.dispatchCancelAfterDispatchedEvent = false;
            processCancel();
        }
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = false;
            clearPreviouslyHitModifierNodeCache();
        }
        return z2;
    }

    public final NodeParent getRoot$ui() {
        return this.root;
    }

    public final void processCancel() {
        if (this.dispatchingEvent) {
            this.dispatchCancelAfterDispatchedEvent = true;
        } else {
            this.root.dispatchCancel();
            clearPreviouslyHitModifierNodeCache();
        }
    }
}
