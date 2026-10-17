package androidx.compose.ui.focus;

import defpackage.f30;
import defpackage.ji0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusOwnerImpl$moveFocus$focusSearchSuccess$1 extends f30 implements ky {
    final /* synthetic */ int $focusDirection;
    final /* synthetic */ ji0 $requestFocusSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$moveFocus$focusSearchSuccess$1(ji0 ji0Var, int i) {
        super(1);
        this.$requestFocusSuccess = ji0Var;
        this.$focusDirection = i;
    }

    @Override // defpackage.ky
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        this.$requestFocusSuccess.d = Boolean.valueOf(focusTargetNode.mo4423requestFocus3ESFkO8(this.$focusDirection));
        return (Boolean) this.$requestFocusSuccess.d;
    }
}
