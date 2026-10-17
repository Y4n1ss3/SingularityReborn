package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NodeCoordinator$outOfBoundsHit$1 extends f30 implements iy {
    final /* synthetic */ float $distanceFromEdge;
    final /* synthetic */ HitTestResult $hitTestResult;
    final /* synthetic */ NodeCoordinator.HitTestSource $hitTestSource;
    final /* synthetic */ boolean $isHitInMinimumTouchTargetBetter;
    final /* synthetic */ boolean $isInLayer;
    final /* synthetic */ long $pointerPosition;
    final /* synthetic */ int $pointerType;
    final /* synthetic */ Modifier.Node $this_outOfBoundsHit;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$outOfBoundsHit$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z, float f, boolean z2) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$this_outOfBoundsHit = node;
        this.$hitTestSource = hitTestSource;
        this.$pointerPosition = j;
        this.$hitTestResult = hitTestResult;
        this.$pointerType = i;
        this.$isInLayer = z;
        this.$distanceFromEdge = f;
        this.$isHitInMinimumTouchTargetBetter = z2;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6567invoke() {
        Modifier.Node m6571nextUntilhw7D004;
        NodeCoordinator nodeCoordinator = this.this$0;
        m6571nextUntilhw7D004 = NodeCoordinatorKt.m6571nextUntilhw7D004(this.$this_outOfBoundsHit, this.$hitTestSource.mo6564entityTypeOLwlOKw(), NodeKind.m6573constructorimpl(2));
        nodeCoordinator.m6542outOfBoundsHit8NAm7pk(m6571nextUntilhw7D004, this.$hitTestSource, this.$pointerPosition, this.$hitTestResult, this.$pointerType, this.$isInLayer, this.$distanceFromEdge, this.$isHitInMinimumTouchTargetBetter);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6567invoke();
        return w01.a;
    }
}
