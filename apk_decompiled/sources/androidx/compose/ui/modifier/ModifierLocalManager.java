package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import defpackage.bv;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ModifierLocalManager {
    public static final int $stable = 8;
    private boolean invalidated;
    private final Owner owner;
    private final MutableVector<BackwardsCompatNode> inserted = new MutableVector<>(new BackwardsCompatNode[16], 0);
    private final MutableVector<ModifierLocal<?>> insertedLocal = new MutableVector<>(new ModifierLocal[16], 0);
    private final MutableVector<LayoutNode> removed = new MutableVector<>(new LayoutNode[16], 0);
    private final MutableVector<ModifierLocal<?>> removedLocal = new MutableVector<>(new ModifierLocal[16], 0);

    public ModifierLocalManager(Owner owner) {
        this.owner = owner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Set, java.util.Set<androidx.compose.ui.node.BackwardsCompatNode>] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private final void invalidateConsumersOfNodeForKey(Modifier.Node node, ModifierLocal<?> modifierLocal, Set<BackwardsCompatNode> set) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(32);
        if (!node.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = node.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node.getNode(), false);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node2 = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node2.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0) {
                for (Modifier.Node node3 = node2; node3 != null && node3.isAttached(); node3 = node3.getChild$ui()) {
                    if ((node3.getKindSet$ui() & m6573constructorimpl) != 0) {
                        DelegatingNode delegatingNode = node3;
                        MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalModifierNode;
                                    if ((backwardsCompatNode.getElement() instanceof ModifierLocalConsumer) && backwardsCompatNode.getReadValues().contains(modifierLocal)) {
                                        set.add(modifierLocalModifierNode);
                                    }
                                }
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui(modifierLocal)) {
                                    break;
                                }
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
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector2.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector2.add(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    delegatingNode = delegatingNode;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node2, false);
        }
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final void insertedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        this.inserted.add(backwardsCompatNode);
        this.insertedLocal.add(modifierLocal);
        invalidate();
    }

    public final void invalidate() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.registerOnEndApplyChangesListener(new ModifierLocalManager$invalidate$1(this));
    }

    public final void removedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        this.removed.add(DelegatableNodeKt.requireLayoutNode(backwardsCompatNode));
        this.removedLocal.add(modifierLocal);
        invalidate();
    }

    public final void triggerUpdates() {
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        MutableVector<LayoutNode> mutableVector = this.removed;
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            ModifierLocal<?> modifierLocal = this.removedLocal.content[i];
            if (layoutNode.getNodes$ui().getHead$ui().isAttached()) {
                invalidateConsumersOfNodeForKey(layoutNode.getNodes$ui().getHead$ui(), modifierLocal, hashSet);
            }
        }
        this.removed.clear();
        this.removedLocal.clear();
        MutableVector<BackwardsCompatNode> mutableVector2 = this.inserted;
        BackwardsCompatNode[] backwardsCompatNodeArr = mutableVector2.content;
        int size2 = mutableVector2.getSize();
        for (int i2 = 0; i2 < size2; i2++) {
            BackwardsCompatNode backwardsCompatNode = backwardsCompatNodeArr[i2];
            ModifierLocal<?> modifierLocal2 = this.insertedLocal.content[i2];
            if (backwardsCompatNode.isAttached()) {
                invalidateConsumersOfNodeForKey(backwardsCompatNode, modifierLocal2, hashSet);
            }
        }
        this.inserted.clear();
        this.insertedLocal.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((BackwardsCompatNode) it.next()).updateModifierLocalConsumer();
        }
    }

    public final void updatedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        this.inserted.add(backwardsCompatNode);
        this.insertedLocal.add(modifierLocal);
        invalidate();
    }
}
