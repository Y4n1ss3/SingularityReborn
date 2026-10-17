package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import defpackage.q10;
import defpackage.w00;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class InsetsConsumingModifierNode extends Modifier.Node implements TraversableNode {
    public static final int $stable = 8;
    private WindowInsets ancestorConsumedInsets = WindowInsetsKt.WindowInsets();
    private WindowInsets consumedInsets = WindowInsetsKt.WindowInsets();

    private final void invalidateChildConsumedInsets() {
        TraversableNodeKt.traverseDescendants(this, getTraverseKey(), new w00(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TraversableNode.Companion.TraverseDescendantsAction invalidateChildConsumedInsets$lambda$0(InsetsConsumingModifierNode insetsConsumingModifierNode, TraversableNode traversableNode) {
        traversableNode.getClass();
        ((InsetsConsumingModifierNode) traversableNode).setAncestorConsumedInsets(insetsConsumingModifierNode.consumedInsets);
        return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttach$lambda$0(InsetsConsumingModifierNode insetsConsumingModifierNode, TraversableNode traversableNode) {
        traversableNode.getClass();
        insetsConsumingModifierNode.ancestorConsumedInsets = ((InsetsConsumingModifierNode) traversableNode).consumedInsets;
        return false;
    }

    private final void setAncestorConsumedInsets(WindowInsets windowInsets) {
        if (q10.b(this.ancestorConsumedInsets, windowInsets)) {
            return;
        }
        this.ancestorConsumedInsets = windowInsets;
        insetsInvalidated();
    }

    public abstract WindowInsets calculateInsets(WindowInsets windowInsets);

    public final WindowInsets getAncestorConsumedInsets() {
        return this.ancestorConsumedInsets;
    }

    public final WindowInsets getConsumedInsets() {
        return this.consumedInsets;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    public void insetsInvalidated() {
        this.consumedInsets = calculateInsets(this.ancestorConsumedInsets);
        invalidateChildConsumedInsets();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        TraversableNodeKt.traverseAncestors(this, getTraverseKey(), new w00(this, 1));
        insetsInvalidated();
        super.onAttach();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.consumedInsets = this.ancestorConsumedInsets;
        invalidateChildConsumedInsets();
        super.onDetach();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        this.ancestorConsumedInsets = WindowInsetsKt.WindowInsets();
    }
}
