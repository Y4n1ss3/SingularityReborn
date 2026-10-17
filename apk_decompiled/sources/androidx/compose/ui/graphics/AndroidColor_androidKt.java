package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.Color;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidColor_androidKt {
    public static final long fromColorLong(Color.Companion companion, long j) {
        long j2 = 63 & j;
        if (j2 >= 16) {
            j = (j & (-64)) | (j2 + 1);
        }
        return Color.m4757constructorimpl(j);
    }

    /* renamed from: toColorLong-8_81llA, reason: not valid java name */
    public static final long m4624toColorLong8_81llA(long j) {
        long j2 = 63 & j;
        return Long.compareUnsigned(j2, 16L) < 0 ? j : (j & (-64)) | (j2 - 1);
    }
}
