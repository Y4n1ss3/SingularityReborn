package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import defpackage.g30;
import defpackage.g40;
import defpackage.iy;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class HandwritingDetectorNode extends DelegatingNode implements PointerInputModifierNode {
    private iy callback;
    private final g30 composeImm$delegate = y80.B(g40.e, new a(0, this));
    private final StylusHandwritingNode pointerInputNode = (StylusHandwritingNode) delegate(new StylusHandwritingNode(new a(1, this)));

    public HandwritingDetectorNode(iy iyVar) {
        this.callback = iyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeInputMethodManager composeImm_delegate$lambda$0(HandwritingDetectorNode handwritingDetectorNode) {
        return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(handwritingDetectorNode));
    }

    private final ComposeInputMethodManager getComposeImm() {
        return (ComposeInputMethodManager) this.composeImm$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 pointerInputNode$lambda$0(HandwritingDetectorNode handwritingDetectorNode) {
        handwritingDetectorNode.callback.invoke();
        handwritingDetectorNode.getComposeImm().prepareStylusHandwritingDelegation();
        return w01.a;
    }

    public final iy getCallback() {
        return this.callback;
    }

    public final StylusHandwritingNode getPointerInputNode() {
        return this.pointerInputNode;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk, reason: not valid java name */
    public long mo1225getTouchBoundsExpansionRZrCHBk() {
        return this.pointerInputNode.mo1225getTouchBoundsExpansionRZrCHBk();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.pointerInputNode.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }

    public final void setCallback(iy iyVar) {
        this.callback = iyVar;
    }
}
