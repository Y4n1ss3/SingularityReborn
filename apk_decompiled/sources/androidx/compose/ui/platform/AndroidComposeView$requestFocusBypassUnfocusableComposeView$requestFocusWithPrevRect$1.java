package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1 extends f30 implements ky {
    final /* synthetic */ int $focusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1(int i) {
        super(1);
        this.$focusDirection = i;
    }

    @Override // defpackage.ky
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.mo4423requestFocus3ESFkO8(this.$focusDirection));
    }
}
