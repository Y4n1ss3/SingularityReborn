package androidx.compose.ui.node;

import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadPassDelegate$layoutModifierBlock$1 extends f30 implements iy {
    final /* synthetic */ LookaheadPassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadPassDelegate$layoutModifierBlock$1(LookaheadPassDelegate lookaheadPassDelegate) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* renamed from: invoke, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6508invoke() {
        LayoutNode layoutNode;
        NodeCoordinator outerCoordinator;
        NodeCoordinator outerCoordinator2;
        long j;
        LayoutNode layoutNode2;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        NodeCoordinator outerCoordinator3;
        LookaheadDelegate lookaheadDelegate;
        layoutNode = this.this$0.getLayoutNode();
        Placeable.PlacementScope placementScope = null;
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode)) {
            layoutNodeLayoutDelegate = this.this$0.layoutNodeLayoutDelegate;
            if (!layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement$ui()) {
                outerCoordinator3 = this.this$0.getOuterCoordinator();
                NodeCoordinator wrappedBy$ui = outerCoordinator3.getWrappedBy$ui();
                if (wrappedBy$ui != null && (lookaheadDelegate = wrappedBy$ui.getLookaheadDelegate()) != null) {
                    placementScope = lookaheadDelegate.getPlacementScope();
                }
                if (placementScope == null) {
                    layoutNode2 = this.this$0.getLayoutNode();
                    placementScope = LayoutNodeKt.requireOwner(layoutNode2).getPlacementScope();
                }
                LookaheadPassDelegate lookaheadPassDelegate = this.this$0;
                outerCoordinator2 = lookaheadPassDelegate.getOuterCoordinator();
                LookaheadDelegate lookaheadDelegate2 = outerCoordinator2.getLookaheadDelegate();
                lookaheadDelegate2.getClass();
                j = lookaheadPassDelegate.lastPosition;
                Placeable.PlacementScope.m6303place70tqf50$default(placementScope, lookaheadDelegate2, j, 0.0f, 2, null);
            }
        }
        outerCoordinator = this.this$0.getOuterCoordinator();
        NodeCoordinator wrappedBy$ui2 = outerCoordinator.getWrappedBy$ui();
        if (wrappedBy$ui2 != null) {
            placementScope = wrappedBy$ui2.getPlacementScope();
        }
        if (placementScope == null) {
        }
        LookaheadPassDelegate lookaheadPassDelegate2 = this.this$0;
        outerCoordinator2 = lookaheadPassDelegate2.getOuterCoordinator();
        LookaheadDelegate lookaheadDelegate22 = outerCoordinator2.getLookaheadDelegate();
        lookaheadDelegate22.getClass();
        j = lookaheadPassDelegate2.lastPosition;
        Placeable.PlacementScope.m6303place70tqf50$default(placementScope, lookaheadDelegate22, j, 0.0f, 2, null);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6508invoke();
        return w01.a;
    }
}
