package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InlineDensity {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m1424constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    private /* synthetic */ InlineDensity(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m1423boximpl(long j) {
        return new InlineDensity(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1424constructorimpl(float f, float f2) {
        return m1425constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1427equalsimpl(long j, Object obj) {
        return (obj instanceof InlineDensity) && j == ((InlineDensity) obj).m1433unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1428equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getDensity-impl, reason: not valid java name */
    public static final float m1429getDensityimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m1430getFontScaleimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1431hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1432toStringimpl(long j) {
        return "InlineDensity(density=" + m1429getDensityimpl(j) + ", fontScale=" + m1430getFontScaleimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m1427equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1431hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1432toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1433unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m1434getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1426constructorimpl(Density density) {
        return m1424constructorimpl(density.getDensity(), density.getFontScale());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m1425constructorimpl(long j) {
        return j;
    }
}
