package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import defpackage.g10;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsOwner {
    public static final int $stable = 8;
    private final xa0 listeners = new xa0(2);
    private final g10 nodes;
    private final EmptySemanticsModifier outerSemanticsNode;
    private final LayoutNode rootNode;

    public SemanticsOwner(LayoutNode layoutNode, EmptySemanticsModifier emptySemanticsModifier, g10 g10Var) {
        this.rootNode = layoutNode;
        this.outerSemanticsNode = emptySemanticsModifier;
        this.nodes = g10Var;
    }

    public final SemanticsInfo get$ui(int i) {
        return (SemanticsInfo) this.nodes.b(i);
    }

    public final xa0 getListeners$ui() {
        return this.listeners;
    }

    public final SemanticsInfo getRootInfo$ui() {
        return this.rootNode;
    }

    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.rootNode, true);
    }

    public final SemanticsNode getUnmergedRootSemanticsNode() {
        return new SemanticsNode(this.outerSemanticsNode, false, this.rootNode, new SemanticsConfiguration());
    }

    public final void notifySemanticsChange$ui(SemanticsInfo semanticsInfo, SemanticsConfiguration semanticsConfiguration) {
        xa0 xa0Var = this.listeners;
        Object[] objArr = xa0Var.a;
        int i = xa0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((SemanticsListener) objArr[i2]).onSemanticsChanged(semanticsInfo, semanticsConfiguration);
        }
    }
}
