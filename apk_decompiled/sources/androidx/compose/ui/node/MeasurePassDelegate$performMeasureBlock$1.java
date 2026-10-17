package androidx.compose.ui.node;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MeasurePassDelegate$performMeasureBlock$1 extends f30 implements iy {
    final /* synthetic */ MeasurePassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasurePassDelegate$performMeasureBlock$1(MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.this$0 = measurePassDelegate;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6522invoke() {
        long j;
        NodeCoordinator outerCoordinator = this.this$0.getOuterCoordinator();
        j = this.this$0.performMeasureConstraints;
        outerCoordinator.mo6234measureBRTryo0(j);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6522invoke();
        return w01.a;
    }
}
