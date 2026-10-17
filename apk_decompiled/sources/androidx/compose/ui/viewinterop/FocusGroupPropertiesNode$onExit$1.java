package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import defpackage.f30;
import defpackage.ky;
import defpackage.o;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FocusGroupPropertiesNode$onExit$1 extends f30 implements ky {
    final /* synthetic */ FocusGroupPropertiesNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusGroupPropertiesNode$onExit$1(FocusGroupPropertiesNode focusGroupPropertiesNode) {
        super(1);
        this.this$0 = focusGroupPropertiesNode;
    }

    public final void invoke(FocusEnterExitScope focusEnterExitScope) {
        View embeddedView;
        Rect currentlyFocusedRect;
        View findNextFocusFromRect;
        boolean containsDescendant;
        embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this.this$0);
        if (ComposeUiFlags.isViewFocusFixEnabled) {
            if (embeddedView.hasFocus() || embeddedView.isFocused()) {
                embeddedView.clearFocus();
                return;
            }
            return;
        }
        if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled || !embeddedView.hasFocus()) {
            return;
        }
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this.this$0).getFocusOwner();
        View requireView = DelegatableNode_androidKt.requireView(this.this$0);
        if (!(embeddedView instanceof ViewGroup)) {
            if (requireView.requestFocus()) {
                return;
            }
            o.f("host view did not take focus");
            return;
        }
        currentlyFocusedRect = FocusGroupNode_androidKt.getCurrentlyFocusedRect(focusOwner, requireView, embeddedView);
        Integer m4400toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m4400toAndroidFocusDirection3ESFkO8(focusEnterExitScope.mo4384getRequestedFocusDirectiondhqQ8s());
        int intValue = m4400toAndroidFocusDirection3ESFkO8 != null ? m4400toAndroidFocusDirection3ESFkO8.intValue() : 130;
        FocusFinder focusFinder = FocusFinder.getInstance();
        FocusGroupPropertiesNode focusGroupPropertiesNode = this.this$0;
        if (focusGroupPropertiesNode.getFocusedChild() != null) {
            requireView.getClass();
            findNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) requireView, focusGroupPropertiesNode.getFocusedChild(), intValue);
        } else {
            requireView.getClass();
            findNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) requireView, currentlyFocusedRect, intValue);
        }
        if (findNextFocusFromRect != null) {
            containsDescendant = FocusGroupNode_androidKt.containsDescendant(embeddedView, findNextFocusFromRect);
            if (containsDescendant) {
                findNextFocusFromRect.requestFocus(intValue, currentlyFocusedRect);
                focusEnterExitScope.cancelFocusChange();
                return;
            }
        }
        if (requireView.requestFocus()) {
            return;
        }
        o.f("host view did not take focus");
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusEnterExitScope) obj);
        return w01.a;
    }
}
