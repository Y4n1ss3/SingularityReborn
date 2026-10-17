package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SubcomposeLayoutState$setRoot$1 extends f30 implements my {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setRoot$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    public final void invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
        LayoutNodeSubcompositionsState state;
        LayoutNodeSubcompositionsState state2;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2;
        SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
        LayoutNodeSubcompositionsState subcompositionsState$ui = layoutNode.getSubcompositionsState$ui();
        if (subcompositionsState$ui == null) {
            subcomposeSlotReusePolicy2 = this.this$0.slotReusePolicy;
            subcompositionsState$ui = new LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy2);
            layoutNode.setSubcompositionsState$ui(subcompositionsState$ui);
        }
        subcomposeLayoutState2._state = subcompositionsState$ui;
        state = this.this$0.getState();
        state.makeSureStateIsConsistent();
        state2 = this.this$0.getState();
        subcomposeSlotReusePolicy = this.this$0.slotReusePolicy;
        state2.setSlotReusePolicy(subcomposeSlotReusePolicy);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (SubcomposeLayoutState) obj2);
        return w01.a;
    }
}
