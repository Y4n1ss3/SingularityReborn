package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SubcomposeLayoutState$setMeasurePolicy$1 extends f30 implements my {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setMeasurePolicy$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    public final void invoke(LayoutNode layoutNode, my myVar) {
        LayoutNodeSubcompositionsState state;
        state = this.this$0.getState();
        layoutNode.setMeasurePolicy(state.createMeasurePolicy(myVar));
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (my) obj2);
        return w01.a;
    }
}
