package androidx.compose.ui.node;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadPassDelegate$performMeasureBlock$1 extends f30 implements iy {
    final /* synthetic */ LookaheadPassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadPassDelegate$performMeasureBlock$1(LookaheadPassDelegate lookaheadPassDelegate) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6509invoke() {
        NodeCoordinator outerCoordinator;
        long j;
        outerCoordinator = this.this$0.getOuterCoordinator();
        LookaheadDelegate lookaheadDelegate = outerCoordinator.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        j = this.this$0.performMeasureConstraints;
        lookaheadDelegate.mo6234measureBRTryo0(j);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6509invoke();
        return w01.a;
    }
}
