package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnLayoutRectChangedModifierKt {
    public static final Modifier onLayoutRectChanged(Modifier modifier, long j, long j2, ky kyVar) {
        return modifier.then(new OnLayoutRectChangedElement(j, j2, kyVar));
    }

    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier modifier, long j, long j2, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 64;
        }
        return onLayoutRectChanged(modifier, j3, j2, kyVar);
    }

    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(DelegatableNode delegatableNode, long j, long j2, ky kyVar) {
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().registerOnRectChangedCallback(requireLayoutNode.getSemanticsId(), j, j2, delegatableNode, kyVar);
    }
}
