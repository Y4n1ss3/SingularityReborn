package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m1446finalConstraintstfFHcEY(long j, boolean z, int i, float f) {
        return Constraints.Companion.m7573fitPrioritizingWidthZbe2FdA(0, m1448finalMaxWidthtfFHcEY(j, z, i, f), 0, Constraints.m7563getMaxHeightimpl(j));
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m1447finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        if ((z || !m1449isEllipsisMW5ApA(i)) && i2 >= 1) {
            return i2;
        }
        return 1;
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m1448finalMaxWidthtfFHcEY(long j, boolean z, int i, float f) {
        int m7564getMaxWidthimpl = ((z || m1449isEllipsisMW5ApA(i)) && Constraints.m7560getHasBoundedWidthimpl(j)) ? Constraints.m7564getMaxWidthimpl(j) : Integer.MAX_VALUE;
        return Constraints.m7566getMinWidthimpl(j) == m7564getMaxWidthimpl ? m7564getMaxWidthimpl : y80.h(TextDelegateKt.ceilToIntPx(f), Constraints.m7566getMinWidthimpl(j), m7564getMaxWidthimpl);
    }

    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m1449isEllipsisMW5ApA(int i) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return TextOverflow.m7537equalsimpl0(i, companion.m7547getEllipsisgIe3tQ8()) || TextOverflow.m7537equalsimpl0(i, companion.m7549getStartEllipsisgIe3tQ8()) || TextOverflow.m7537equalsimpl0(i, companion.m7548getMiddleEllipsisgIe3tQ8());
    }
}
