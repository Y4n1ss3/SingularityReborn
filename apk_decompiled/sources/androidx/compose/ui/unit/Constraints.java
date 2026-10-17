package androidx.compose.ui.unit;

import defpackage.c21;
import defpackage.dq;
import defpackage.er;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Constraints {
    public static final Companion Companion = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    private /* synthetic */ Constraints(long j) {
        this.value = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m7551boximpl(long j) {
        return new Constraints(j);
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m7553copyZbe2FdA(long j, int i, int i2, int i3, int i4) {
        if (!(i2 >= i && i4 >= i3 && i >= 0 && i3 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i, i2, i3, i4);
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m7554copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m7566getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m7564getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m7565getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m7563getMaxHeightimpl(j);
        }
        return m7553copyZbe2FdA(j, i6, i7, i8, i4);
    }

    /* renamed from: copyMaxDimensions-msEJaDk, reason: not valid java name */
    public static final long m7555copyMaxDimensionsmsEJaDk(long j) {
        return m7552constructorimpl(j & ConstraintsKt.MaxDimensionsAndFocusMask);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7556equalsimpl(long j, Object obj) {
        return (obj instanceof Constraints) && j == ((Constraints) obj).m7570unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7557equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m7558getFocusIndeximpl(long j) {
        return (int) (j & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m7559getHasBoundedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m7560getHasBoundedWidthimpl(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m7561getHasFixedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m7562getHasFixedWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m7563getMaxHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m7564getMaxWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m7565getMinHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m7566getMinWidthimpl(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7567hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m7568isZeroimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7569toStringimpl(long j) {
        int m7564getMaxWidthimpl = m7564getMaxWidthimpl(j);
        String valueOf = m7564getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(m7564getMaxWidthimpl);
        int m7563getMaxHeightimpl = m7563getMaxHeightimpl(j);
        String valueOf2 = m7563getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(m7563getMaxHeightimpl) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m7566getMinWidthimpl(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(m7565getMinHeightimpl(j));
        sb.append(", maxHeight = ");
        return c21.a(sb, valueOf2, ')');
    }

    public boolean equals(Object obj) {
        return m7556equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7567hashCodeimpl(this.value);
    }

    public String toString() {
        return m7569toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7570unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m7571restrictConstraintsxF2OJ5Q$default(Companion companion, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
            if ((i5 & 16) != 0) {
                z = true;
            }
            return companion.m7577restrictConstraintsxF2OJ5Q(i, i2, i3, i4, z);
        }

        /* renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m7572fitPrioritizingHeightZbe2FdA(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int min = Math.min(i3, 262142);
            int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
            int i6 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i6);
                        o.j();
                        return 0L;
                    }
                    i5 = 8190;
                }
            }
            return ConstraintsKt.Constraints(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, min, min2);
        }

        /* renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m7573fitPrioritizingWidthZbe2FdA(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int min = Math.min(i, 262142);
            int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
            int i6 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i6);
                        o.j();
                        return 0L;
                    }
                    i5 = 8190;
                }
            }
            return ConstraintsKt.Constraints(min, min2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
        }

        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m7574fixedJhjzzOo(int i, int i2) {
            if (!((i2 >= 0) & (i >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return ConstraintsKt.createConstraints(i, i, i2, i2);
        }

        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m7575fixedHeightOenEA2s(int i) {
            if (!(i >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, i, i);
        }

        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m7576fixedWidthOenEA2s(int i) {
            if (!(i >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return ConstraintsKt.createConstraints(i, i, 0, Integer.MAX_VALUE);
        }

        @er
        /* renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m7577restrictConstraintsxF2OJ5Q(int i, int i2, int i3, int i4, boolean z) {
            return z ? m7573fitPrioritizingWidthZbe2FdA(i, i2, i3, i4) : m7572fitPrioritizingHeightZbe2FdA(i, i2, i3, i4);
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7552constructorimpl(long j) {
        return j;
    }
}
