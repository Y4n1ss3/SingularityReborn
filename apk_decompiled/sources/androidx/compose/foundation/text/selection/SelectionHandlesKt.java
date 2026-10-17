package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionHandlesKt {
    private static final float HandleWidth = Dp.m7611constructorimpl(25.0f);
    private static final float HandleHeight = Dp.m7611constructorimpl(25.0f);
    private static final SemanticsPropertyKey<SelectionHandleInfo> SelectionHandleInfoKey = new SemanticsPropertyKey<>("SelectionHandleInfo", (my) null, 2, (dq) null);

    /* renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m1506getAdjustedCoordinatesk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f;
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public static final float getHandleHeight() {
        return HandleHeight;
    }

    public static final float getHandleWidth() {
        return HandleWidth;
    }

    public static final SemanticsPropertyKey<SelectionHandleInfo> getSelectionHandleInfoKey() {
        return SelectionHandleInfoKey;
    }

    public static final boolean isHandleLtrDirection(ResolvedTextDirection resolvedTextDirection, boolean z) {
        if (resolvedTextDirection != ResolvedTextDirection.Ltr || z) {
            return resolvedTextDirection == ResolvedTextDirection.Rtl && z;
        }
        return true;
    }

    public static final boolean isLeftSelectionHandle(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        return z ? isHandleLtrDirection(resolvedTextDirection, z2) : !isHandleLtrDirection(resolvedTextDirection, z2);
    }
}
