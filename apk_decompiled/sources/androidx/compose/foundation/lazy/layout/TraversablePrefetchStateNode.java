package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TraversablePrefetchStateNode extends Modifier.Node implements TraversableNode {
    private LazyLayoutPrefetchState prefetchState;
    private final String traverseKey = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";

    public TraversablePrefetchStateNode(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.prefetchState = lazyLayoutPrefetchState;
    }

    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    public final void setPrefetchState(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.prefetchState = lazyLayoutPrefetchState;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }
}
