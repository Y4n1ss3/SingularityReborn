package androidx.compose.ui.graphics.colorspace;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorModel {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Rgb = m5189constructorimpl(12884901888L);
    private static final long Xyz = m5189constructorimpl(12884901889L);
    private static final long Lab = m5189constructorimpl(12884901890L);
    private static final long Cmyk = m5189constructorimpl(17179869187L);

    private /* synthetic */ ColorModel(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorModel m5188boximpl(long j) {
        return new ColorModel(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5190equalsimpl(long j, Object obj) {
        return (obj instanceof ColorModel) && j == ((ColorModel) obj).m5195unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5191equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m5192getComponentCountimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5193hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5194toStringimpl(long j) {
        return m5191equalsimpl0(j, Rgb) ? "Rgb" : m5191equalsimpl0(j, Xyz) ? "Xyz" : m5191equalsimpl0(j, Lab) ? "Lab" : m5191equalsimpl0(j, Cmyk) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5190equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5193hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5194toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5195unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m5196getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m5197getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m5198getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m5199getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5189constructorimpl(long j) {
        return j;
    }
}
