package androidx.compose.ui.unit;

import defpackage.j50;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    public static final long MaxDimensionsAndFocusMask = -8589934589L;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusMask = 65535;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i, i2, i3, i4);
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    private static final int bitOffsetToIndex(int i) {
        return (i >> 1) + (i & 1);
    }

    public static final int bitsNeedForSizeUnchecked(int i) {
        if (i < MaxNonFocusMask) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < MinFocusMask) {
            return 16;
        }
        if (i < MaxFocusMask) {
            return MaxFocusBits;
        }
        return 255;
    }

    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m7578constrain4WqzIAM(long j, long j2) {
        int i = (int) (j2 >> 32);
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        if (i < m7566getMinWidthimpl) {
            i = m7566getMinWidthimpl;
        }
        if (i <= m7564getMaxWidthimpl) {
            m7564getMaxWidthimpl = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
        if (i2 < m7565getMinHeightimpl) {
            i2 = m7565getMinHeightimpl;
        }
        if (i2 <= m7563getMaxHeightimpl) {
            m7563getMaxHeightimpl = i2;
        }
        return IntSize.m7777constructorimpl((m7564getMaxWidthimpl << 32) | (m7563getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m7579constrainN9IONVI(long j, long j2) {
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
        int m7566getMinWidthimpl2 = Constraints.m7566getMinWidthimpl(j2);
        if (m7566getMinWidthimpl2 < m7566getMinWidthimpl) {
            m7566getMinWidthimpl2 = m7566getMinWidthimpl;
        }
        if (m7566getMinWidthimpl2 > m7564getMaxWidthimpl) {
            m7566getMinWidthimpl2 = m7564getMaxWidthimpl;
        }
        int m7564getMaxWidthimpl2 = Constraints.m7564getMaxWidthimpl(j2);
        if (m7564getMaxWidthimpl2 >= m7566getMinWidthimpl) {
            m7566getMinWidthimpl = m7564getMaxWidthimpl2;
        }
        if (m7566getMinWidthimpl <= m7564getMaxWidthimpl) {
            m7564getMaxWidthimpl = m7566getMinWidthimpl;
        }
        int m7565getMinHeightimpl2 = Constraints.m7565getMinHeightimpl(j2);
        if (m7565getMinHeightimpl2 < m7565getMinHeightimpl) {
            m7565getMinHeightimpl2 = m7565getMinHeightimpl;
        }
        if (m7565getMinHeightimpl2 > m7563getMaxHeightimpl) {
            m7565getMinHeightimpl2 = m7563getMaxHeightimpl;
        }
        int m7563getMaxHeightimpl2 = Constraints.m7563getMaxHeightimpl(j2);
        if (m7563getMaxHeightimpl2 >= m7565getMinHeightimpl) {
            m7565getMinHeightimpl = m7563getMaxHeightimpl2;
        }
        if (m7565getMinHeightimpl <= m7563getMaxHeightimpl) {
            m7563getMaxHeightimpl = m7565getMinHeightimpl;
        }
        return Constraints(m7566getMinWidthimpl2, m7564getMaxWidthimpl, m7565getMinHeightimpl2, m7563getMaxHeightimpl);
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m7580constrainHeightK40F9xA(long j, int i) {
        int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
        if (i < m7565getMinHeightimpl) {
            i = m7565getMinHeightimpl;
        }
        return i > m7563getMaxHeightimpl ? m7563getMaxHeightimpl : i;
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m7581constrainWidthK40F9xA(long j, int i) {
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        if (i < m7566getMinWidthimpl) {
            i = m7566getMinWidthimpl;
        }
        return i > m7564getMaxWidthimpl ? m7564getMaxWidthimpl : i;
    }

    public static final long createConstraints(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int bitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int bitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i6);
        if (bitsNeedForSizeUnchecked + bitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = bitsNeedForSizeUnchecked2 - 13;
        return Constraints.m7552constructorimpl(((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (bitsNeedForSizeUnchecked2 + 2)) | ((i8 & (~(i8 >> 31))) << (bitsNeedForSizeUnchecked2 + 33)));
    }

    private static final int heightMask(int i) {
        return (1 << (18 - i)) - 1;
    }

    private static final int indexToBitOffset(int i) {
        return (((i & 2) >> 1) * 3) + ((i & 1) << 1);
    }

    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m7582isSatisfiedBy4WqzIAM(long j, long j2) {
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        int i = (int) (j2 >> 32);
        if (m7566getMinWidthimpl > i || i > m7564getMaxWidthimpl) {
            return false;
        }
        int i2 = (int) (j2 & 4294967295L);
        return Constraints.m7565getMinHeightimpl(j) <= i2 && i2 <= Constraints.m7563getMaxHeightimpl(j);
    }

    private static final int maxAllowedForSize(int i) {
        if (i < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i < 32767) {
            return MaxAllowedForMinNonFocusBits;
        }
        if (i < MinFocusMask) {
            return MaxAllowedForMinFocusBits;
        }
        if (i < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        throwInvalidConstraintsSizeException(i);
        o.j();
        return 0;
    }

    private static final int minHeightOffsets(int i) {
        return i + 15;
    }

    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m7583offsetNN6EwU(long j, int i, int i2) {
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j) + i;
        if (m7566getMinWidthimpl < 0) {
            m7566getMinWidthimpl = 0;
        }
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        if (m7564getMaxWidthimpl != Integer.MAX_VALUE && (m7564getMaxWidthimpl = m7564getMaxWidthimpl + i) < 0) {
            m7564getMaxWidthimpl = 0;
        }
        int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j) + i2;
        if (m7565getMinHeightimpl < 0) {
            m7565getMinHeightimpl = 0;
        }
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
        return Constraints(m7566getMinWidthimpl, m7564getMaxWidthimpl, m7565getMinHeightimpl, (m7563getMaxHeightimpl == Integer.MAX_VALUE || (m7563getMaxHeightimpl = m7563getMaxHeightimpl + i2) >= 0) ? m7563getMaxHeightimpl : 0);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m7584offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m7583offsetNN6EwU(j, i, i2);
    }

    public static final void throwInvalidConstraintException(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final Void throwInvalidConstraintsSizeException(int i) {
        throw new IllegalArgumentException(j50.i(i, "Can't represent a size of ", " in Constraints"));
    }

    private static final int widthMask(int i) {
        return (1 << (i + 13)) - 1;
    }

    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }
}
