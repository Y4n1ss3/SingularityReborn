package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$indirectPointerNavigationGestureDetector$1 extends f30 implements ky {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$indirectPointerNavigationGestureDetector$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m6695invoke3ESFkO8(((FocusDirection) obj).m4391unboximpl());
        return w01.a;
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final void m6695invoke3ESFkO8(int i) {
        this.this$0.getFocusOwner().mo4409moveFocusaToIllA(i, false);
    }
}
