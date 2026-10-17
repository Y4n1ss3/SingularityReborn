package androidx.compose.ui.viewinterop;

import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import defpackage.f30;
import defpackage.iy;
import defpackage.ji0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FocusTargetInteropNode$retrievePinnableContainer$1 extends f30 implements iy {
    final /* synthetic */ ji0 $container;
    final /* synthetic */ FocusTargetInteropNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetInteropNode$retrievePinnableContainer$1(ji0 ji0Var, FocusTargetInteropNode focusTargetInteropNode) {
        super(0);
        this.$container = ji0Var;
        this.this$0 = focusTargetInteropNode;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7867invoke() {
        this.$container.d = CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, PinnableContainerKt.getLocalPinnableContainer());
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m7867invoke();
        return w01.a;
    }
}
