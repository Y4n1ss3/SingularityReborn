package androidx.compose.ui.layout;

import androidx.compose.runtime.ReusableComposition;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsState$deactivateOutOfFrame$1 extends f30 implements iy {
    final /* synthetic */ LayoutNodeSubcompositionsState.NodeState $this_deactivateOutOfFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeSubcompositionsState$deactivateOutOfFrame$1(LayoutNodeSubcompositionsState.NodeState nodeState) {
        super(0);
        this.$this_deactivateOutOfFrame = nodeState;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6263invoke() {
        ReusableComposition composition;
        if (this.$this_deactivateOutOfFrame.getActive() || (composition = this.$this_deactivateOutOfFrame.getComposition()) == null) {
            return;
        }
        composition.deactivate();
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6263invoke();
        return w01.a;
    }
}
