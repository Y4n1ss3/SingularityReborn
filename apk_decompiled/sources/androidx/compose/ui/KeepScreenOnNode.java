package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class KeepScreenOnNode extends Modifier.Node {
    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNodeKt.requireOwner(this).incrementKeepScreenOnCount();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNodeKt.requireOwner(this).decrementKeepScreenOnCount();
    }
}
