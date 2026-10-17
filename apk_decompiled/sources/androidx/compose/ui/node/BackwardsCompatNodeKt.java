package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BackwardsCompatNodeKt {
    private static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 DetachedModifierLocalReadScope = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(ModifierLocal<T> modifierLocal) {
            return (T) modifierLocal.getDefaultFactory$ui().invoke();
        }
    };
    private static final ky onDrawCacheReadsChanged = BackwardsCompatNodeKt$onDrawCacheReadsChanged$1.INSTANCE;
    private static final ky updateModifierLocalConsumer = BackwardsCompatNodeKt$updateModifierLocalConsumer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isChainUpdate(BackwardsCompatNode backwardsCompatNode) {
        Modifier.Node tail$ui = DelegatableNodeKt.requireLayoutNode(backwardsCompatNode).getNodes$ui().getTail$ui();
        tail$ui.getClass();
        return ((TailModifierNode) tail$ui).getAttachHasBeenRun();
    }
}
