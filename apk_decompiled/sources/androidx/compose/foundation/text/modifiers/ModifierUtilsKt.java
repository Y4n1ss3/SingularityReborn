package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModifierUtilsKt {
    /* renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m1451maxWidthForTextLayoutR2G3SPE(long j, boolean z, int i) {
        if ((z || TextOverflow.m7537equalsimpl0(i, TextOverflow.Companion.m7547getEllipsisgIe3tQ8())) && Constraints.m7560getHasBoundedWidthimpl(j)) {
            return Constraints.m7564getMaxWidthimpl(j);
        }
        return Integer.MAX_VALUE;
    }
}
