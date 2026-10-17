package androidx.compose.ui.graphics.vector;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorPainter$vector$1$1 extends f30 implements iy {
    final /* synthetic */ VectorPainter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainter$vector$1$1(VectorPainter vectorPainter) {
        super(0);
        this.this$0 = vectorPainter;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5517invoke() {
        this.this$0.setDrawInvalidation(w01.a);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m5517invoke();
        return w01.a;
    }
}
