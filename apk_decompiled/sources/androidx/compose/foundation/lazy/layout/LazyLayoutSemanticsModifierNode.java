package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.iy;
import defpackage.kp0;
import defpackage.ky;
import defpackage.p01;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    private final ky indexForKeyMapping = new e(this, 0);
    private iy itemProviderLambda;
    private Orientation orientation;
    private boolean reverseScrolling;
    private ScrollAxisRange scrollAxisRange;
    private ky scrollToIndexAction;
    private LazyLayoutSemanticState state;
    private boolean userScrollEnabled;

    public LazyLayoutSemanticsModifierNode(iy iyVar, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2) {
        this.itemProviderLambda = iyVar;
        this.state = lazyLayoutSemanticState;
        this.orientation = orientation;
        this.userScrollEnabled = z;
        this.reverseScrolling = z2;
        updateCachedSemanticsValues();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float applySemantics$lambda$1(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        return Float.valueOf(lazyLayoutSemanticsModifierNode.state.getViewport() - lazyLayoutSemanticsModifierNode.state.getContentPadding());
    }

    private final CollectionInfo getCollectionInfo() {
        return this.state.collectionInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int indexForKeyMapping$lambda$0(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, Object obj) {
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutSemanticsModifierNode.itemProviderLambda.invoke();
        int itemCount = lazyLayoutItemProvider.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (q10.b(lazyLayoutItemProvider.getKey(i), obj)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    private final void updateCachedSemanticsValues() {
        this.scrollAxisRange = new ScrollAxisRange(new f(this, 0), new f(this, 1), this.reverseScrolling);
        this.scrollToIndexAction = this.userScrollEnabled ? new e(this, 1) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float updateCachedSemanticsValues$lambda$0(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        return lazyLayoutSemanticsModifierNode.state.getScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float updateCachedSemanticsValues$lambda$1(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        return lazyLayoutSemanticsModifierNode.state.getMaxScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateCachedSemanticsValues$lambda$2(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i) {
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutSemanticsModifierNode.itemProviderLambda.invoke();
        if (i < 0 || i >= lazyLayoutItemProvider.getItemCount()) {
            StringBuilder f = kp0.f(i, "Can't scroll to index ", ", it is out of bounds [0, ");
            f.append(lazyLayoutItemProvider.getItemCount());
            f.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(f.toString());
        }
        p01.t(lazyLayoutSemanticsModifierNode.getCoroutineScope(), null, null, new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(lazyLayoutSemanticsModifierNode, i, null), 3);
        return true;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, this.indexForKeyMapping);
        boolean isVertical = isVertical();
        ScrollAxisRange scrollAxisRange = this.scrollAxisRange;
        if (isVertical) {
            if (scrollAxisRange == null) {
                q10.H("scrollAxisRange");
                throw null;
            }
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            if (scrollAxisRange == null) {
                q10.H("scrollAxisRange");
                throw null;
            }
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
        ky kyVar = this.scrollToIndexAction;
        if (kyVar != null) {
            SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, null, kyVar, 1, null);
        }
        SemanticsPropertiesKt.getScrollViewportLength$default(semanticsPropertyReceiver, null, new f(this, 2), 1, null);
        SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, getCollectionInfo());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void update(iy iyVar, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2) {
        this.itemProviderLambda = iyVar;
        this.state = lazyLayoutSemanticState;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (this.userScrollEnabled == z && this.reverseScrolling == z2) {
            return;
        }
        this.userScrollEnabled = z;
        this.reverseScrolling = z2;
        updateCachedSemanticsValues();
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }
}
