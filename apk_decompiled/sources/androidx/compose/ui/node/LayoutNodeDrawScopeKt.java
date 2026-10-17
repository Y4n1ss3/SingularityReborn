package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node nextDrawNode(DelegatableNode delegatableNode) {
        int m6573constructorimpl = NodeKind.m6573constructorimpl(4);
        int m6573constructorimpl2 = NodeKind.m6573constructorimpl(2);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null || (child$ui.getAggregateChildKindSet$ui() & m6573constructorimpl) == 0) {
            return null;
        }
        while (child$ui != null && (child$ui.getKindSet$ui() & m6573constructorimpl2) == 0) {
            if ((child$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                return child$ui;
            }
            child$ui = child$ui.getChild$ui();
        }
        return null;
    }
}
