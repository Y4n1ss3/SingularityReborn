package defpackage;

import androidx.compose.foundation.layout.InsetsConsumingModifierNode;
import androidx.compose.ui.node.TraversableNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class w00 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ InsetsConsumingModifierNode e;

    public /* synthetic */ w00(InsetsConsumingModifierNode insetsConsumingModifierNode, int i) {
        this.d = i;
        this.e = insetsConsumingModifierNode;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        TraversableNode.Companion.TraverseDescendantsAction invalidateChildConsumedInsets$lambda$0;
        boolean onAttach$lambda$0;
        int i = this.d;
        InsetsConsumingModifierNode insetsConsumingModifierNode = this.e;
        TraversableNode traversableNode = (TraversableNode) obj;
        switch (i) {
            case 0:
                invalidateChildConsumedInsets$lambda$0 = InsetsConsumingModifierNode.invalidateChildConsumedInsets$lambda$0(insetsConsumingModifierNode, traversableNode);
                return invalidateChildConsumedInsets$lambda$0;
            default:
                onAttach$lambda$0 = InsetsConsumingModifierNode.onAttach$lambda$0(insetsConsumingModifierNode, traversableNode);
                return Boolean.valueOf(onAttach$lambda$0);
        }
    }
}
