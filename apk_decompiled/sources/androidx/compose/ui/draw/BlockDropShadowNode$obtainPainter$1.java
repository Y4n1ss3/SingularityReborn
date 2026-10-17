package androidx.compose.ui.draw;

import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlockDropShadowNode$obtainPainter$1 extends f30 implements iy {
    final /* synthetic */ BlockDropShadowNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockDropShadowNode$obtainPainter$1(BlockDropShadowNode blockDropShadowNode) {
        super(0);
        this.this$0 = blockDropShadowNode;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4275invoke() {
        ky kyVar;
        kyVar = this.this$0.block;
        kyVar.invoke(this.this$0);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m4275invoke();
        return w01.a;
    }
}
