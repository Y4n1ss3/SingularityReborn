package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$RootModifierNode$onKeyEvent$1 extends f30 implements ky {
    final /* synthetic */ FocusDirection $focusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$RootModifierNode$onKeyEvent$1(FocusDirection focusDirection) {
        super(1);
        this.$focusDirection = focusDirection;
    }

    @Override // defpackage.ky
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.mo4423requestFocus3ESFkO8(this.$focusDirection.m4391unboximpl()));
    }
}
