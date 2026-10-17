package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnVisibilityChangedModifierKt {
    public static final Modifier onVisibilityChanged(Modifier modifier, long j, float f, LayoutBoundsHolder layoutBoundsHolder, ky kyVar) {
        return modifier.then(new OnVisibilityChangedElement(j, f, layoutBoundsHolder, kyVar));
    }

    public static /* synthetic */ Modifier onVisibilityChanged$default(Modifier modifier, long j, float f, LayoutBoundsHolder layoutBoundsHolder, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            layoutBoundsHolder = null;
        }
        return onVisibilityChanged(modifier, j2, f2, layoutBoundsHolder, kyVar);
    }

    public static final DelegatableNode onVisibilityChangedNode(long j, float f, LayoutBoundsHolder layoutBoundsHolder, ky kyVar) {
        return new OnVisibilityChangedNode(j, f, layoutBoundsHolder, kyVar);
    }

    public static /* synthetic */ DelegatableNode onVisibilityChangedNode$default(long j, float f, LayoutBoundsHolder layoutBoundsHolder, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            layoutBoundsHolder = null;
        }
        return onVisibilityChangedNode(j, f, layoutBoundsHolder, kyVar);
    }
}
