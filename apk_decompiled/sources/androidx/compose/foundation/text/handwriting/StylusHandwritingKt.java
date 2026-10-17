package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.TouchBoundsExpansionKt;
import androidx.compose.ui.unit.Dp;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StylusHandwritingKt {
    private static final DpTouchBoundsExpansion HandwritingBoundsExpansion;
    private static final float HandwritingBoundsHorizontalOffset;
    private static final float HandwritingBoundsVerticalOffset;

    static {
        float m7611constructorimpl = Dp.m7611constructorimpl(40.0f);
        HandwritingBoundsVerticalOffset = m7611constructorimpl;
        float m7611constructorimpl2 = Dp.m7611constructorimpl(10.0f);
        HandwritingBoundsHorizontalOffset = m7611constructorimpl2;
        HandwritingBoundsExpansion = TouchBoundsExpansionKt.m6675DpTouchBoundsExpansiona9UjIt4(m7611constructorimpl2, m7611constructorimpl, m7611constructorimpl2, m7611constructorimpl);
    }

    public static final DpTouchBoundsExpansion getHandwritingBoundsExpansion() {
        return HandwritingBoundsExpansion;
    }

    public static final float getHandwritingBoundsHorizontalOffset() {
        return HandwritingBoundsHorizontalOffset;
    }

    public static final float getHandwritingBoundsVerticalOffset() {
        return HandwritingBoundsVerticalOffset;
    }

    public static final Modifier stylusHandwriting(Modifier modifier, boolean z, boolean z2, iy iyVar) {
        if (!z || !StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return modifier;
        }
        if (z2) {
            modifier = PointerIconKt.stylusHoverIcon(modifier, TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, HandwritingBoundsExpansion);
        }
        return modifier.then(new StylusHandwritingElement(iyVar));
    }
}
