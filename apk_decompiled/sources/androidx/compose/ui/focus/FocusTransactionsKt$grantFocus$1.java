package androidx.compose.ui.focus;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusTransactionsKt$grantFocus$1 extends f30 implements iy {
    final /* synthetic */ FocusTargetNode $this_grantFocus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTransactionsKt$grantFocus$1(FocusTargetNode focusTargetNode) {
        super(0);
        this.$this_grantFocus = focusTargetNode;
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m4439invoke();
        return w01.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4439invoke() {
        this.$this_grantFocus.fetchFocusProperties$ui();
    }
}
