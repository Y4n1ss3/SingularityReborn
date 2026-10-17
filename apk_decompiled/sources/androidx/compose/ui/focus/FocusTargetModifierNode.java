package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNode;
import defpackage.er;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface FocusTargetModifierNode extends DelegatableNode {
    /* renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    static /* synthetic */ boolean m4421requestFocus3ESFkO8$default(FocusTargetModifierNode focusTargetModifierNode, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
            return false;
        }
        if ((i2 & 1) != 0) {
            i = FocusDirection.Companion.m4393getEnterdhqQ8s();
        }
        return focusTargetModifierNode.mo4423requestFocus3ESFkO8(i);
    }

    FocusState getFocusState();

    /* renamed from: getFocusability-LCbbffg, reason: not valid java name */
    int mo4422getFocusabilityLCbbffg();

    @er
    /* synthetic */ boolean requestFocus();

    /* renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    boolean mo4423requestFocus3ESFkO8(int i);

    /* renamed from: setFocusability-josRg5g, reason: not valid java name */
    void mo4424setFocusabilityjosRg5g(int i);
}
