package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusRequesterModifierNodeKt {
    /* JADX WARN: Code restructure failed: missing block: B:99:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean captureFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                if (FocusTransactionsKt.captureFocus((FocusTargetNode) node)) {
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
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node2 = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node2.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2, false);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                if (FocusTransactionsKt.captureFocus((FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet$ui() & m6573constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                    if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate$ui2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector3.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector3.add(delegate$ui2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild$ui();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean freeFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                if (FocusTransactionsKt.freeFocus((FocusTargetNode) node)) {
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
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node2 = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node2.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2, false);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                if (FocusTransactionsKt.freeFocus((FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet$ui() & m6573constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                    if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate$ui2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector3.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector3.add(delegate$ui2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild$ui();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PinnableContainer.PinnedHandle pinFocusedChild(FocusRequesterModifierNode focusRequesterModifierNode) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                PinnableContainer.PinnedHandle pinFocusedChild = FocusRestorerKt.pinFocusedChild((FocusTargetNode) node);
                if (pinFocusedChild != null) {
                    return pinFocusedChild;
                }
            } else if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                int i = 0;
                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            node = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node2 = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node2.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2, false);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                PinnableContainer.PinnedHandle pinFocusedChild2 = FocusRestorerKt.pinFocusedChild((FocusTargetNode) node2);
                                if (pinFocusedChild2 != null) {
                                    return pinFocusedChild2;
                                }
                            } else if ((node2.getKindSet$ui() & m6573constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                    if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate$ui2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector3.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector3.add(delegate$ui2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild$ui();
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x008a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean requestFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                return FocusTargetModifierNode.m4421requestFocus3ESFkO8$default((FocusTargetNode) node, 0, 1, null);
            }
            if ((node.getKindSet$ui() & m6573constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                int i = 0;
                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            node = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node2 = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node2.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2, false);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                return FocusTargetModifierNode.m4421requestFocus3ESFkO8$default((FocusTargetNode) node2, 0, 1, null);
                            }
                            if ((node2.getKindSet$ui() & m6573constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                    if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate$ui2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector3.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector3.add(delegate$ui2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild$ui();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean restoreFocusedChild(FocusRequesterModifierNode focusRequesterModifierNode) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                if (FocusRestorerKt.restoreFocusedChild((FocusTargetNode) node)) {
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
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node2 = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node2.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2, false);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                if (FocusRestorerKt.restoreFocusedChild((FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet$ui() & m6573constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                    if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate$ui2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector3.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector3.add(delegate$ui2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild$ui();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean saveFocusedChild(FocusRequesterModifierNode focusRequesterModifierNode) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                if (FocusRestorerKt.saveFocusedChild((FocusTargetNode) node)) {
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
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node2 = (Modifier.Node) bv.d(mutableVector2, 1);
            if ((node2.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2, false);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet$ui() & m6573constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                if (FocusRestorerKt.saveFocusedChild((FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet$ui() & m6573constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui2 = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                    if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate$ui2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector3.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector3.add(delegate$ui2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild$ui();
                    }
                }
            }
        }
        return false;
    }
}
