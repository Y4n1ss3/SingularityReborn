package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionModifierNode$measure$animSize$1 extends f30 implements ky {
    final /* synthetic */ long $target;
    final /* synthetic */ EnterExitTransitionModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$animSize$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j) {
        super(1);
        this.this$0 = enterExitTransitionModifierNode;
        this.$target = j;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m7774boximpl(m73invokeYEO4UFw((EnterExitState) obj));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m73invokeYEO4UFw(EnterExitState enterExitState) {
        return this.this$0.m70sizeByStateUzc_VyU(enterExitState, this.$target);
    }
}
