package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusState;
import defpackage.my;
import defpackage.w01;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class FocusableNode$focusTargetNode$1 extends xy implements my {
    public FocusableNode$focusTargetNode$1(Object obj) {
        super(2, obj, FocusableNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((FocusState) obj, (FocusState) obj2);
        return w01.a;
    }

    public final void invoke(FocusState focusState, FocusState focusState2) {
        ((FocusableNode) this.receiver).onFocusStateChange(focusState, focusState2);
    }
}
