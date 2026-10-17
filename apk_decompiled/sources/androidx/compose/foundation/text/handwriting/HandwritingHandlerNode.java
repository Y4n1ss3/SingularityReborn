package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import defpackage.g30;
import defpackage.g40;
import defpackage.p01;
import defpackage.q10;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class HandwritingHandlerNode extends Modifier.Node implements FocusEventModifierNode {
    private final g30 composeImm$delegate = y80.B(g40.e, new a(2, this));
    private FocusState focusState;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeInputMethodManager composeImm_delegate$lambda$0(HandwritingHandlerNode handwritingHandlerNode) {
        return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(handwritingHandlerNode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeInputMethodManager getComposeImm() {
        return (ComposeInputMethodManager) this.composeImm$delegate.getValue();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (q10.b(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        if (focusState.getHasFocus()) {
            p01.t(getCoroutineScope(), null, null, new HandwritingHandlerNode$onFocusEvent$1(this, null), 3);
        }
    }
}
