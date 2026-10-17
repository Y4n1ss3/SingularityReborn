package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransformOrigin {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    private /* synthetic */ TransformOrigin(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m5161boximpl(long j) {
        return new TransformOrigin(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5162component1impl(long j) {
        return m5169getPivotFractionXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5163component2impl(long j) {
        return m5170getPivotFractionYimpl(j);
    }

    /* renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m5165copyzey9I6w(long j, float f, float f2) {
        return TransformOriginKt.TransformOrigin(f, f2);
    }

    /* renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m5166copyzey9I6w$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m5169getPivotFractionXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m5170getPivotFractionYimpl(j);
        }
        return m5165copyzey9I6w(j, f, f2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5167equalsimpl(long j, Object obj) {
        return (obj instanceof TransformOrigin) && j == ((TransformOrigin) obj).m5173unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5168equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m5169getPivotFractionXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m5170getPivotFractionYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5171hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5172toStringimpl(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m5167equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5171hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5172toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5173unboximpl() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m5174getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5164constructorimpl(long j) {
        return j;
    }
}
