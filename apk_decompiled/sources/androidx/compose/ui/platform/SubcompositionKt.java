package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.PausableComposition;
import androidx.compose.runtime.PausableCompositionKt;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.ui.node.LayoutNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SubcompositionKt {
    public static final PausableComposition createPausableSubcomposition(LayoutNode layoutNode, CompositionContext compositionContext) {
        return PausableCompositionKt.PausableComposition(Wrapper_androidKt.createApplier(layoutNode), compositionContext);
    }

    public static final ReusableComposition createSubcomposition(LayoutNode layoutNode, CompositionContext compositionContext) {
        return CompositionKt.ReusableComposition(Wrapper_androidKt.createApplier(layoutNode), compositionContext);
    }
}
