package androidx.compose.ui.unit;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DpOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m7667constructorimpl(0);
    private static final long Unspecified = m7667constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    private /* synthetic */ DpOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m7666boximpl(long j) {
        return new DpOffset(j);
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m7668copytPigGR8(long j, float f, float f2) {
        return m7667constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m7669copytPigGR8$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m7672getXD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m7674getYD9Ej5fM(j);
        }
        return m7668copytPigGR8(j, f, f2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7670equalsimpl(long j, Object obj) {
        return (obj instanceof DpOffset) && j == ((DpOffset) obj).m7680unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7671equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m7672getXD9Ej5fM(long j) {
        return Dp.m7611constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m7674getYD9Ej5fM(long j) {
        return Dp.m7611constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7676hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m7677minusCBMgk4(long j, long j2) {
        float m7611constructorimpl = Dp.m7611constructorimpl(m7672getXD9Ej5fM(j) - m7672getXD9Ej5fM(j2));
        float m7611constructorimpl2 = Dp.m7611constructorimpl(m7674getYD9Ej5fM(j) - m7674getYD9Ej5fM(j2));
        return m7667constructorimpl((Float.floatToRawIntBits(m7611constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m7611constructorimpl2)));
    }

    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m7678plusCBMgk4(long j, long j2) {
        float m7611constructorimpl = Dp.m7611constructorimpl(m7672getXD9Ej5fM(j2) + m7672getXD9Ej5fM(j));
        float m7611constructorimpl2 = Dp.m7611constructorimpl(m7674getYD9Ej5fM(j2) + m7674getYD9Ej5fM(j));
        return m7667constructorimpl((Float.floatToRawIntBits(m7611constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m7611constructorimpl2)));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7679toStringimpl(long j) {
        if (j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) Dp.m7622toStringimpl(m7672getXD9Ej5fM(j))) + ", " + ((Object) Dp.m7622toStringimpl(m7674getYD9Ej5fM(j))) + ')';
    }

    public boolean equals(Object obj) {
        return m7670equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m7676hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7679toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7680unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m7681getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m7682getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        private Companion() {
        }
    }

    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7673getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7675getYD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7667constructorimpl(long j) {
        return j;
    }
}
