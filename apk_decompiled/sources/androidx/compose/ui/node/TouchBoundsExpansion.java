package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TouchBoundsExpansion {
    private static final long IS_LAYOUT_DIRECTION_AWARE = Long.MIN_VALUE;
    private static final int MASK = 32767;
    public static final int MAX_VALUE = 32767;
    private static final int SHIFT = 15;
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long None = TouchBoundsExpansionKt.TouchBoundsExpansion$default(0, 0, 0, 0, 14, null);

    private /* synthetic */ TouchBoundsExpansion(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TouchBoundsExpansion m6658boximpl(long j) {
        return new TouchBoundsExpansion(j);
    }

    /* renamed from: computeLeft-impl$ui, reason: not valid java name */
    public static final int m6659computeLeftimpl$ui(long j, LayoutDirection layoutDirection) {
        return (!m6669isLayoutDirectionAwareimpl(j) || layoutDirection == LayoutDirection.Ltr) ? m6666getStartimpl(j) : m6665getEndimpl(j);
    }

    /* renamed from: computeRight-impl$ui, reason: not valid java name */
    public static final int m6660computeRightimpl$ui(long j, LayoutDirection layoutDirection) {
        return (!m6669isLayoutDirectionAwareimpl(j) || layoutDirection == LayoutDirection.Ltr) ? m6665getEndimpl(j) : m6666getStartimpl(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6662equalsimpl(long j, Object obj) {
        return (obj instanceof TouchBoundsExpansion) && j == ((TouchBoundsExpansion) obj).m6671unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6663equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m6664getBottomimpl(long j) {
        return Companion.unpack(j, 3);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m6665getEndimpl(long j) {
        return Companion.unpack(j, 2);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m6666getStartimpl(long j) {
        return Companion.unpack(j, 0);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m6667getTopimpl(long j) {
        return Companion.unpack(j, 1);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6668hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isLayoutDirectionAware-impl, reason: not valid java name */
    public static final boolean m6669isLayoutDirectionAwareimpl(long j) {
        return (j & Long.MIN_VALUE) != None;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6670toStringimpl(long j) {
        return "TouchBoundsExpansion(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m6662equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6668hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6670toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6671unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: Absolute-vsh68fg$default, reason: not valid java name */
        public static /* synthetic */ long m6672Absolutevsh68fg$default(Companion companion, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                i3 = 0;
            }
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            return companion.m6673Absolutevsh68fg(i, i2, i3, i4);
        }

        private final long trimAndShift(int i, int i2) {
            return (i & 32767) << (i2 * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int unpack(long j, int i) {
            return ((int) (j >> (i * 15))) & 32767;
        }

        /* renamed from: Absolute-vsh68fg, reason: not valid java name */
        public final long m6673Absolutevsh68fg(int i, int i2, int i3, int i4) {
            if (!(i >= 0 && i < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
            }
            if (!(i2 >= 0 && i2 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
            }
            if (!(i3 >= 0 && i3 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
            }
            if (!(i4 >= 0 && i4 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
            }
            return TouchBoundsExpansion.m6661constructorimpl(pack$ui(i, i2, i3, i4, false));
        }

        /* renamed from: getNone-RZrCHBk, reason: not valid java name */
        public final long m6674getNoneRZrCHBk() {
            return TouchBoundsExpansion.None;
        }

        public final long pack$ui(int i, int i2, int i3, int i4, boolean z) {
            return trimAndShift(i2, 1) | trimAndShift(i, 0) | trimAndShift(i3, 2) | trimAndShift(i4, 3) | (z ? Long.MIN_VALUE : TouchBoundsExpansion.None);
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6661constructorimpl(long j) {
        return j;
    }
}
