package androidx.compose.ui.unit;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DpSize {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m7700constructorimpl(0);
    private static final long Unspecified = m7700constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    private /* synthetic */ DpSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m7697boximpl(long j) {
        return new DpSize(j);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m7698component1D9Ej5fM(long j) {
        return m7709getWidthD9Ej5fM(j);
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m7699component2D9Ej5fM(long j) {
        return m7707getHeightD9Ej5fM(j);
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m7701copyDwJknco(long j, float f, float f2) {
        return m7700constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m7702copyDwJknco$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m7709getWidthD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m7707getHeightD9Ej5fM(j);
        }
        return m7701copyDwJknco(j, f, f2);
    }

    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m7704divGh9hcWk(long j, int i) {
        float f = i;
        float m7611constructorimpl = Dp.m7611constructorimpl(m7709getWidthD9Ej5fM(j) / f);
        float m7611constructorimpl2 = Dp.m7611constructorimpl(m7707getHeightD9Ej5fM(j) / f);
        return m7700constructorimpl((Float.floatToRawIntBits(m7611constructorimpl) << 32) | (Float.floatToRawIntBits(m7611constructorimpl2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7705equalsimpl(long j, Object obj) {
        return (obj instanceof DpSize) && j == ((DpSize) obj).m7717unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7706equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m7707getHeightD9Ej5fM(long j) {
        return Dp.m7611constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m7709getWidthD9Ej5fM(long j) {
        return Dp.m7611constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7711hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m7712minuse_xh8Ic(long j, long j2) {
        float m7611constructorimpl = Dp.m7611constructorimpl(m7709getWidthD9Ej5fM(j) - m7709getWidthD9Ej5fM(j2));
        float m7611constructorimpl2 = Dp.m7611constructorimpl(m7707getHeightD9Ej5fM(j) - m7707getHeightD9Ej5fM(j2));
        return m7700constructorimpl((Float.floatToRawIntBits(m7611constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m7611constructorimpl2)));
    }

    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m7713pluse_xh8Ic(long j, long j2) {
        float m7611constructorimpl = Dp.m7611constructorimpl(m7709getWidthD9Ej5fM(j2) + m7709getWidthD9Ej5fM(j));
        float m7611constructorimpl2 = Dp.m7611constructorimpl(m7707getHeightD9Ej5fM(j2) + m7707getHeightD9Ej5fM(j));
        return m7700constructorimpl((Float.floatToRawIntBits(m7611constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m7611constructorimpl2)));
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m7715timesGh9hcWk(long j, int i) {
        float f = i;
        float m7611constructorimpl = Dp.m7611constructorimpl(m7709getWidthD9Ej5fM(j) * f);
        float m7611constructorimpl2 = Dp.m7611constructorimpl(m7707getHeightD9Ej5fM(j) * f);
        return m7700constructorimpl((Float.floatToRawIntBits(m7611constructorimpl) << 32) | (Float.floatToRawIntBits(m7611constructorimpl2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7716toStringimpl(long j) {
        if (j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpSize.Unspecified";
        }
        return ((Object) Dp.m7622toStringimpl(m7709getWidthD9Ej5fM(j))) + " x " + ((Object) Dp.m7622toStringimpl(m7707getHeightD9Ej5fM(j)));
    }

    public boolean equals(Object obj) {
        return m7705equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m7711hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7716toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7717unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m7718getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m7719getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        private Companion() {
        }
    }

    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7708getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7710getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m7703divGh9hcWk(long j, float f) {
        float m7611constructorimpl = Dp.m7611constructorimpl(m7709getWidthD9Ej5fM(j) / f);
        float m7611constructorimpl2 = Dp.m7611constructorimpl(m7707getHeightD9Ej5fM(j) / f);
        return m7700constructorimpl((Float.floatToRawIntBits(m7611constructorimpl) << 32) | (Float.floatToRawIntBits(m7611constructorimpl2) & 4294967295L));
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m7714timesGh9hcWk(long j, float f) {
        float m7611constructorimpl = Dp.m7611constructorimpl(m7709getWidthD9Ej5fM(j) * f);
        float m7611constructorimpl2 = Dp.m7611constructorimpl(m7707getHeightD9Ej5fM(j) * f);
        return m7700constructorimpl((Float.floatToRawIntBits(m7611constructorimpl) << 32) | (Float.floatToRawIntBits(m7611constructorimpl2) & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7700constructorimpl(long j) {
        return j;
    }
}
