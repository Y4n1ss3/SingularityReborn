package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollableContainerNode extends Modifier.Node implements TraversableNode {
    private boolean enabled;
    private final Object traverseKey = TraverseKey;
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public ScrollableContainerNode(boolean z) {
        this.enabled = z;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void update(boolean z) {
        this.enabled = z;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(dq dqVar) {
            this();
        }

        private TraverseKey() {
        }
    }
}
