package androidx.compose.ui.spatial;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RectListKt {
    public static final int AxisEast = 3;
    public static final int AxisNorth = 0;
    public static final int AxisSouth = 1;
    public static final int AxisWest = 2;
    public static final int BitOffsetForFocusable = 61;
    public static final int BitOffsetForGesturable = 62;
    public static final int BitOffsetForHasCallbacks = 63;
    public static final int BitOffsetForLastChildOffset = 50;
    public static final int BitOffsetForParentId = 25;
    public static final int BitOffsetForUpdated = 60;
    private static final long EverythingButLastChildOffset = -1151795604700004353L;
    private static final long EverythingButParentId = -1125899873288193L;
    public static final int InitialSize = 64;
    public static final int LongsPerItem = 3;
    public static final int Lower10Bits = 1023;
    private static final int Lower25Bits = 33554431;
    private static final int MaxSupportedId = 33554431;
    public static final int MaxSupportedLastChildOffset = 1023;
    private static final long PackedIntsHighestBit = -9223372034707292160L;
    private static final long PackedIntsLowestBit = 4294967297L;
    private static final long TombStone = (Math.min(0, 1023) << 50) | 1125899906842623L;

    public static final int distanceScore(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i == 0) {
            return distanceScoreAlongAxis(i3, i9, i4, i2, i8, i6);
        }
        if (i == 1) {
            return distanceScoreAlongAxis(i7, i5, i4, i2, i8, i6);
        }
        if (i == 2) {
            return distanceScoreAlongAxis(i2, i8, i5, i3, i9, i7);
        }
        if (i != 3) {
            return Integer.MAX_VALUE;
        }
        return distanceScoreAlongAxis(i6, i4, i5, i3, i9, i7);
    }

    public static final int distanceScoreAlongAxis(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i - i2;
        return (((Math.max(i4, i6) + (i3 - i4)) - Math.min(i3, i5)) + 1) * (i7 + 1);
    }

    public static final long getEverythingButLastChildOffset() {
        return EverythingButLastChildOffset;
    }

    public static final long getEverythingButParentId() {
        return EverythingButParentId;
    }

    public static final long getTombStone() {
        return TombStone;
    }

    public static final long metaMarkFlags(long j, boolean z, boolean z2) {
        return (j & (-6917529027641081857L)) | ((z ? 1L : 0L) * 2305843009213693952L) | ((z2 ? 1L : 0L) * 4611686018427387904L);
    }

    public static final long metaMarkUpdated(long j) {
        return j | 1152921504606846976L;
    }

    public static final long metaMarkUpdatedAndHasCallbacks(long j, boolean z, boolean z2) {
        return (j & 8070450532247928831L) | ((z ? 1L : 0L) * 1152921504606846976L) | ((z2 ? 1L : 0L) * Long.MIN_VALUE);
    }

    public static final long metaMarkUpdatedIfHasCallbacks(long j) {
        return j | (((j >> 63) & 1) << 60);
    }

    public static final long metaUnMarkUpdated(long j) {
        return j & (-1152921504606846977L);
    }

    public static final long metaWithLastChildOffset(long j, int i) {
        return (j & getEverythingButLastChildOffset()) | (Math.min(i, 1023) << 50);
    }

    public static final long metaWithParentId(long j, int i) {
        return (j & getEverythingButParentId()) | ((i & 33554431) << 25);
    }

    public static final long packMeta(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        return ((z3 ? 1L : 0L) << 62) | ((z4 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 61) | ((z ? 1L : 0L) << 60) | (Math.min(i3, 1023) << 50) | ((i2 & 33554431) << 25) | (i & 33554431);
    }

    public static final long packXY(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final boolean rectIntersectsRect(long j, long j2, long j3, long j4) {
        return ((((j4 - j) - 4294967297L) | ((j2 - j3) - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final long toLong(boolean z) {
        return z ? 1L : 0L;
    }

    public static final int unpackMetaFocusable(long j) {
        return ((int) (j >> 61)) & 1;
    }

    public static final int unpackMetaGesturable(long j) {
        return ((int) (j >> 62)) & 1;
    }

    public static final int unpackMetaHasCallbacks(long j) {
        return ((int) (j >> 63)) & 1;
    }

    public static final int unpackMetaLastChildOffset(long j) {
        return ((int) (j >> 50)) & 1023;
    }

    public static final int unpackMetaParentId(long j) {
        return ((int) (j >> 25)) & 33554431;
    }

    public static final int unpackMetaUpdated(long j) {
        return ((int) (j >> 60)) & 1;
    }

    public static final int unpackMetaValue(long j) {
        return ((int) j) & 33554431;
    }

    public static final int unpackX(long j) {
        return (int) (j >> 32);
    }

    public static final int unpackY(long j) {
        return (int) j;
    }
}
