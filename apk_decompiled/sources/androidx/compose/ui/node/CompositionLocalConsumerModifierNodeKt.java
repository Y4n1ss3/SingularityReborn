package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.ui.internal.InlineClassHelperKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CompositionLocalConsumerModifierNodeKt {
    public static final <T> T currentValueOf(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, CompositionLocal<T> compositionLocal) {
        if (!compositionLocalConsumerModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) DelegatableNodeKt.requireLayoutNode(compositionLocalConsumerModifierNode).getCompositionLocalMap().get(compositionLocal);
    }
}
