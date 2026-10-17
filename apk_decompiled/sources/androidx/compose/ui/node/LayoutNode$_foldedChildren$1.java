package androidx.compose.ui.node;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutNode$_foldedChildren$1 extends f30 implements iy {
    final /* synthetic */ LayoutNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$_foldedChildren$1(LayoutNode layoutNode) {
        super(0);
        this.this$0 = layoutNode;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6480invoke() {
        this.this$0.getLayoutDelegate$ui().markChildrenDirty();
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6480invoke();
        return w01.a;
    }
}
