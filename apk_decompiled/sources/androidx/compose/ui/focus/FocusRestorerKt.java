package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import defpackage.bv;
import defpackage.er;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusRestorerKt {
    private static final String PrevFocusedChild = "pfc";

    @er
    public static final Modifier focusRestorer(Modifier modifier, iy iyVar) {
        FocusRequester focusRequester;
        if (iyVar == null || (focusRequester = (FocusRequester) iyVar.invoke()) == null) {
            focusRequester = FocusRequester.Companion.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }

    public static /* synthetic */ Modifier focusRestorer$default(Modifier modifier, FocusRequester focusRequester, int i, Object obj) {
        if ((i & 1) != 0) {
            focusRequester = FocusRequester.Companion.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }

    public static final PinnableContainer.PinnedHandle pinFocusedChild(FocusTargetNode focusTargetNode) {
        PinnableContainer pinnableContainer;
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (findActiveFocusNode == null || (pinnableContainer = (PinnableContainer) CompositionLocalConsumerModifierNodeKt.currentValueOf(findActiveFocusNode, PinnableContainerKt.getLocalPinnableContainer())) == null) {
            return null;
        }
        return pinnableContainer.pin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x006f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean restoreFocusedChild(FocusTargetNode focusTargetNode) {
        SaveableStateRegistry saveableStateRegistry;
        if (focusTargetNode.getPreviouslyFocusedChildHash() == null && (saveableStateRegistry = (SaveableStateRegistry) CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNode, SaveableStateRegistryKt.getLocalSaveableStateRegistry())) != null) {
            Object consumeRestored = saveableStateRegistry.consumeRestored(PrevFocusedChild + DelegatableNodeKt.requireLayoutNode(focusTargetNode).getCompositeKeyHash());
            if (consumeRestored != null) {
                focusTargetNode.setPreviouslyFocusedChildHash((Integer) consumeRestored);
            }
        }
        if (focusTargetNode.getPreviouslyFocusedChildHash() == null) {
            return false;
        }
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetNode.getNode(), false);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (ComposeUiFlags.isFocusRestorationEnabled) {
                                    if (focusTargetNode2.isAttached()) {
                                        int compositeKeyHash = DelegatableNodeKt.requireLayoutNode(focusTargetNode2).getCompositeKeyHash();
                                        Integer previouslyFocusedChildHash = focusTargetNode.getPreviouslyFocusedChildHash();
                                        if (previouslyFocusedChildHash != null && compositeKeyHash == previouslyFocusedChildHash.intValue()) {
                                            return FocusTargetModifierNode.m4421requestFocus3ESFkO8$default(focusTargetNode2, 0, 1, null);
                                        }
                                    }
                                } else if (focusTargetNode2.isAttached()) {
                                    int compositeKeyHash2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode2).getCompositeKeyHash();
                                    Integer previouslyFocusedChildHash2 = focusTargetNode.getPreviouslyFocusedChildHash();
                                    if (previouslyFocusedChildHash2 != null && compositeKeyHash2 == previouslyFocusedChildHash2.intValue()) {
                                        return restoreFocusedChild(focusTargetNode2) || (focusTargetNode2.fetchFocusProperties$ui().getCanFocus() && FocusTargetModifierNode.m4421requestFocus3ESFkO8$default(focusTargetNode2, 0, 1, null));
                                    }
                                }
                            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector2.add(node);
                                                node = null;
                                            }
                                            mutableVector2.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0040, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean saveFocusedChild(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.getFocusState().getHasFocus()) {
            return false;
        }
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetNode.getNode(), false);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) bv.d(mutableVector, 1);
            if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.getFocusState().getHasFocus()) {
                                    int compositeKeyHash = DelegatableNodeKt.requireLayoutNode(focusTargetNode2).getCompositeKeyHash();
                                    focusTargetNode.setPreviouslyFocusedChildHash(Integer.valueOf(compositeKeyHash));
                                    SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNode, SaveableStateRegistryKt.getLocalSaveableStateRegistry());
                                    if (saveableStateRegistry != null) {
                                        saveableStateRegistry.registerProvider(PrevFocusedChild + DelegatableNodeKt.requireLayoutNode(focusTargetNode).getCompositeKeyHash(), new FocusRestorerKt$saveFocusedChild$1$1(compositeKeyHash));
                                    }
                                    return true;
                                }
                            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector2.add(node);
                                                node = null;
                                            }
                                            mutableVector2.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
        return false;
    }

    public static final Modifier focusRestorer(Modifier modifier, FocusRequester focusRequester) {
        return modifier.then(new FocusRestorerElement(focusRequester));
    }
}
