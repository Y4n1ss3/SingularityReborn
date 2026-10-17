package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import defpackage.ji0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class FocusTargetInteropNode extends DelegatingNode implements ObserverModifierNode, CompositionLocalConsumerModifierNode {
    private final FocusTargetNode focusTargetNode = (FocusTargetNode) delegate(new FocusTargetNode(0, true, new FocusTargetInteropNode$focusTargetNode$1(this), null, 9, null));
    private PinnableContainer.PinnedHandle pinnedHandle;

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState, FocusState focusState2) {
        boolean isFocused;
        if (isAttached() && (isFocused = focusState2.isFocused()) != focusState.isFocused()) {
            if (isFocused) {
                PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
                this.pinnedHandle = retrievePinnableContainer != null ? retrievePinnableContainer.pin() : null;
            } else {
                PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
                this.pinnedHandle = null;
            }
        }
    }

    private final PinnableContainer retrievePinnableContainer() {
        ji0 ji0Var = new ji0();
        ObserverModifierNodeKt.observeReads(this, new FocusTargetInteropNode$retrievePinnableContainer$1(ji0Var, this));
        return (PinnableContainer) ji0Var.d;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
        if (this.focusTargetNode.getFocusState().isFocused()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = retrievePinnableContainer != null ? retrievePinnableContainer.pin() : null;
        }
    }
}
