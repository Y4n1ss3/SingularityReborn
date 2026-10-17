package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DrawModifierNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void dispatchDraw(DelegatableNode delegatableNode, ContentDrawScope contentDrawScope) {
        DelegatingNode node = delegatableNode.getNode();
        int m6573constructorimpl = NodeKind.m6573constructorimpl(4);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof DrawModifierNode) {
                ((DrawModifierNode) node).draw(contentDrawScope);
            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = node.getDelegate$ui();
                int i = 0;
                node = node;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            node = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.add(node);
                                node = 0;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    node = node;
                }
                if (i == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
    }

    public static final void invalidateDraw(DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().isAttached()) {
            DelegatableNodeKt.m6414requireCoordinator64DMado(drawModifierNode, NodeKind.m6573constructorimpl(1)).invalidateLayer();
        }
    }
}
