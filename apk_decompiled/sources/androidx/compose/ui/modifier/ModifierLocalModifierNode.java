package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ModifierLocalModifierNode extends ModifierLocalReadScope, DelegatableNode {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    default <T> T getCurrent(ModifierLocal<T> modifierLocal) {
        NodeChain nodes$ui;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("ModifierLocal accessed from an unattached node");
        }
        int m6573constructorimpl = NodeKind.m6573constructorimpl(32);
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = getNode().getParent$ui();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (requireLayoutNode != null) {
            if ((fc.b(requireLayoutNode) & m6573constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        DelegatingNode delegatingNode = parent$ui;
                        ?? r4 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui(modifierLocal)) {
                                    return (T) modifierLocalModifierNode.getProvidedValues().get$ui(modifierLocal);
                                }
                            } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                r4 = r4;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            delegatingNode = delegate$ui;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                r4.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r4.add(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    delegatingNode = delegatingNode;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(r4);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodes$ui = requireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return (T) modifierLocal.getDefaultFactory$ui().invoke();
    }

    default ModifierLocalMap getProvidedValues() {
        return EmptyMap.INSTANCE;
    }

    default <T> void provide(ModifierLocal<T> modifierLocal, T t) {
        if (!(getProvidedValues() != EmptyMap.INSTANCE)) {
            InlineClassHelperKt.throwIllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!getProvidedValues().contains$ui(modifierLocal)) {
            InlineClassHelperKt.throwIllegalArgumentException("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal + " was not found.");
        }
        getProvidedValues().mo6391set$ui(modifierLocal, t);
    }
}
