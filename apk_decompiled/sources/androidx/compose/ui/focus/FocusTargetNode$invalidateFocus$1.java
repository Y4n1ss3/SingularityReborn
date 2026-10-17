package androidx.compose.ui.focus;

import defpackage.f30;
import defpackage.iy;
import defpackage.ji0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusTargetNode$invalidateFocus$1 extends f30 implements iy {
    final /* synthetic */ ji0 $focusProperties;
    final /* synthetic */ FocusTargetNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetNode$invalidateFocus$1(ji0 ji0Var, FocusTargetNode focusTargetNode) {
        super(0);
        this.$focusProperties = ji0Var;
        this.this$0 = focusTargetNode;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4432invoke() {
        this.$focusProperties.d = this.this$0.fetchFocusProperties$ui();
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m4432invoke();
        return w01.a;
    }
}
