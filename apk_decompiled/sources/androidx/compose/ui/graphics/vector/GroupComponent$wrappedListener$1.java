package androidx.compose.ui.graphics.vector;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GroupComponent$wrappedListener$1 extends f30 implements ky {
    final /* synthetic */ GroupComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupComponent$wrappedListener$1(GroupComponent groupComponent) {
        super(1);
        this.this$0 = groupComponent;
    }

    public final void invoke(VNode vNode) {
        this.this$0.markTintForVNode(vNode);
        ky invalidateListener$ui = this.this$0.getInvalidateListener$ui();
        if (invalidateListener$ui != null) {
            invalidateListener$ui.invoke(vNode);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VNode) obj);
        return w01.a;
    }
}
