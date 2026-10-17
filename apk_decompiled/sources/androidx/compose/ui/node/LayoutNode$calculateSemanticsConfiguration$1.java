package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.f30;
import defpackage.iy;
import defpackage.ji0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutNode$calculateSemanticsConfiguration$1 extends f30 implements iy {
    final /* synthetic */ ji0 $config;
    final /* synthetic */ LayoutNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$calculateSemanticsConfiguration$1(LayoutNode layoutNode, ji0 ji0Var) {
        super(0);
        this.this$0 = layoutNode;
        this.$config = ji0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6481invoke() {
        NodeChain nodes$ui = this.this$0.getNodes$ui();
        int m6573constructorimpl = NodeKind.m6573constructorimpl(8);
        ji0 ji0Var = this.$config;
        if ((nodes$ui.getAggregateChildKindSet() & m6573constructorimpl) != 0) {
            for (Modifier.Node tail$ui = nodes$ui.getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
                if ((tail$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    DelegatingNode delegatingNode = tail$ui;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof SemanticsModifierNode) {
                            SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNode;
                            if (semanticsModifierNode.getShouldClearDescendantSemantics()) {
                                SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                                ji0Var.d = semanticsConfiguration;
                                semanticsConfiguration.setClearingSemantics(true);
                            }
                            if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                ((SemanticsConfiguration) ji0Var.d).setMergingSemanticsOfDescendants(true);
                            }
                            semanticsModifierNode.applySemantics((SemanticsPropertyReceiver) ji0Var.d);
                        } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                            int i = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        delegatingNode = delegate$ui;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui);
                                    }
                                }
                                delegate$ui = delegate$ui.getChild$ui();
                                delegatingNode = delegatingNode;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6481invoke();
        return w01.a;
    }
}
