package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import defpackage.ky;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener {
    private ViewTreeObserver attachedViewTreeObserver;
    private View focusedChild;
    private final ky onEnter = new FocusGroupPropertiesNode$onEnter$1(this);
    private final ky onExit = new FocusGroupPropertiesNode$onExit$1(this);

    private final FocusTargetNode getFocusTargetOfEmbeddedViewWrapper() {
        boolean z;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(Fields.RotationZ);
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = getNode();
        if ((node.getAggregateChildKindSet$ui() & m6573constructorimpl) != 0) {
            boolean z2 = false;
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                    Modifier.Node node2 = child$ui;
                    MutableVector mutableVector = null;
                    while (node2 != null) {
                        if (node2 instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) node2;
                            if (z2) {
                                return focusTargetNode;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (node2.getKindSet$ui() & m6573constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui = ((DelegatingNode) node2).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node2 = delegate$ui;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node2 != null) {
                                            mutableVector.add(node2);
                                            node2 = null;
                                        }
                                        mutableVector.add(delegate$ui);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node2 = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
        o.f("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    public final ViewTreeObserver getAttachedViewTreeObserver() {
        return this.attachedViewTreeObserver;
    }

    public final View getFocusedChild() {
        return this.focusedChild;
    }

    public final ky getOnEnter() {
        return this.onEnter;
    }

    public final ky getOnExit() {
        return this.onExit;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = DelegatableNode_androidKt.requireView(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.attachedViewTreeObserver = null;
        DelegatableNode_androidKt.requireView(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
        super.onDetach();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onGlobalFocusChanged(View view, View view2) {
        View embeddedView;
        boolean z;
        boolean z2;
        boolean containsDescendant;
        boolean containsDescendant2;
        if (DelegatableNodeKt.requireLayoutNode(this).getOwner$ui() == null) {
            return;
        }
        embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        Owner requireOwner = DelegatableNodeKt.requireOwner(this);
        if (view != null && !view.equals(requireOwner)) {
            containsDescendant2 = FocusGroupNode_androidKt.containsDescendant(embeddedView, view);
            if (containsDescendant2) {
                z = true;
                if (view2 != null && !view2.equals(requireOwner)) {
                    containsDescendant = FocusGroupNode_androidKt.containsDescendant(embeddedView, view2);
                    if (containsDescendant) {
                        z2 = true;
                        if (!z && z2) {
                            this.focusedChild = view2;
                            return;
                        }
                        if (z2) {
                            this.focusedChild = view2;
                            FocusTargetNode focusTargetOfEmbeddedViewWrapper = getFocusTargetOfEmbeddedViewWrapper();
                            if (focusTargetOfEmbeddedViewWrapper.getFocusState().getHasFocus()) {
                                return;
                            }
                            FocusTransactionsKt.performRequestFocus(focusTargetOfEmbeddedViewWrapper);
                            return;
                        }
                        if (!z) {
                            this.focusedChild = null;
                            return;
                        }
                        this.focusedChild = null;
                        if (getFocusTargetOfEmbeddedViewWrapper().getFocusState().isFocused()) {
                            focusOwner.mo4405clearFocusI7lrPNg(false, true, false, FocusDirection.Companion.m4394getExitdhqQ8s());
                            return;
                        }
                        return;
                    }
                }
                z2 = false;
                if (!z) {
                }
                if (z2) {
                }
            }
        }
        z = false;
        if (view2 != null) {
            containsDescendant = FocusGroupNode_androidKt.containsDescendant(embeddedView, view2);
            if (containsDescendant) {
            }
        }
        z2 = false;
        if (!z) {
        }
        if (z2) {
        }
    }

    public final void setAttachedViewTreeObserver(ViewTreeObserver viewTreeObserver) {
        this.attachedViewTreeObserver = viewTreeObserver;
    }

    public final void setFocusedChild(View view) {
        this.focusedChild = view;
    }
}
