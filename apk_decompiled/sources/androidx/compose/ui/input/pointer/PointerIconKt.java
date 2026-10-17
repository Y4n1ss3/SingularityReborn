package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DpTouchBoundsExpansion;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerIconKt {
    public static final Modifier pointerHoverIcon(Modifier modifier, PointerIcon pointerIcon, boolean z) {
        return modifier.then(new PointerHoverIconModifierElement(pointerIcon, z));
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z);
    }

    public static final Modifier stylusHoverIcon(Modifier modifier, PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return modifier.then(new StylusHoverIconModifierElement(pointerIcon, z, dpTouchBoundsExpansion));
    }

    public static /* synthetic */ Modifier stylusHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            dpTouchBoundsExpansion = null;
        }
        return stylusHoverIcon(modifier, pointerIcon, z, dpTouchBoundsExpansion);
    }
}
