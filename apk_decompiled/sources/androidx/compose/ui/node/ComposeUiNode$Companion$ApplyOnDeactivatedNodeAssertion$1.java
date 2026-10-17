package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1 extends f30 implements ky {
    public static final ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1 INSTANCE = new ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1();

    public ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1() {
        super(1);
    }

    public final void invoke(ComposeUiNode composeUiNode) {
        LayoutNode layoutNode = composeUiNode instanceof LayoutNode ? (LayoutNode) composeUiNode : null;
        boolean z = false;
        if (layoutNode != null && layoutNode.isDeactivated()) {
            z = true;
        }
        if (z) {
            InlineClassHelperKt.throwIllegalStateException("Apply is called on deactivated node " + composeUiNode);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ComposeUiNode) obj);
        return w01.a;
    }
}
