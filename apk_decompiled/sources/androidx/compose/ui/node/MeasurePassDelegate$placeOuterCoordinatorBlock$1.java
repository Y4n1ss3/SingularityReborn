package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MeasurePassDelegate$placeOuterCoordinatorBlock$1 extends f30 implements iy {
    final /* synthetic */ MeasurePassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasurePassDelegate$placeOuterCoordinatorBlock$1(MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.this$0 = measurePassDelegate;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6523invoke() {
        Placeable.PlacementScope placementScope;
        ky kyVar;
        GraphicsLayer graphicsLayer;
        long j;
        float f;
        long j2;
        float f2;
        long j3;
        float f3;
        NodeCoordinator wrappedBy$ui = this.this$0.getOuterCoordinator().getWrappedBy$ui();
        if (wrappedBy$ui == null || (placementScope = wrappedBy$ui.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this.this$0.getLayoutNode()).getPlacementScope();
        }
        Placeable.PlacementScope placementScope2 = placementScope;
        MeasurePassDelegate measurePassDelegate = this.this$0;
        kyVar = measurePassDelegate.placeOuterCoordinatorLayerBlock;
        graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
        if (graphicsLayer != null) {
            NodeCoordinator outerCoordinator = measurePassDelegate.getOuterCoordinator();
            j3 = measurePassDelegate.placeOuterCoordinatorPosition;
            f3 = measurePassDelegate.placeOuterCoordinatorZIndex;
            placementScope2.m6318placeWithLayeraW9wM(outerCoordinator, j3, graphicsLayer, f3);
            return;
        }
        if (kyVar == null) {
            NodeCoordinator outerCoordinator2 = measurePassDelegate.getOuterCoordinator();
            j2 = measurePassDelegate.placeOuterCoordinatorPosition;
            f2 = measurePassDelegate.placeOuterCoordinatorZIndex;
            placementScope2.m6309place70tqf50(outerCoordinator2, j2, f2);
            return;
        }
        NodeCoordinator outerCoordinator3 = measurePassDelegate.getOuterCoordinator();
        j = measurePassDelegate.placeOuterCoordinatorPosition;
        f = measurePassDelegate.placeOuterCoordinatorZIndex;
        placementScope2.m6317placeWithLayeraW9wM(outerCoordinator3, j, f, kyVar);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6523invoke();
        return w01.a;
    }
}
