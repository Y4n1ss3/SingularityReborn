package androidx.compose.ui.unit;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Dp implements Comparable<Dp> {
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m7611constructorimpl(0.0f);
    private static final float Infinity = m7611constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m7611constructorimpl(Float.NaN);
    private final float value;

    private /* synthetic */ Dp(float f) {
        this.value = f;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m7609boximpl(float f) {
        return new Dp(f);
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m7610compareTo0680j_4(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m7612div0680j_4(float f, float f2) {
        return f / f2;
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m7614divu2uoSUM(float f, int i) {
        return m7611constructorimpl(f / i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7615equalsimpl(float f, Object obj) {
        return (obj instanceof Dp) && Float.compare(f, ((Dp) obj).m7625unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7616equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7617hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m7618minus5rwHm24(float f, float f2) {
        return m7611constructorimpl(f - f2);
    }

    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m7619plus5rwHm24(float f, float f2) {
        return m7611constructorimpl(f + f2);
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m7621timesu2uoSUM(float f, int i) {
        return m7611constructorimpl(f * i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7622toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m7623unaryMinusD9Ej5fM(float f) {
        return m7611constructorimpl(-f);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m7624compareTo0680j_4(dp.m7625unboximpl());
    }

    public boolean equals(Object obj) {
        return m7615equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7617hashCodeimpl(this.value);
    }

    public String toString() {
        return m7622toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m7625unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m7629getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m7630getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m7631getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }

        private Companion() {
        }

        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m7626getHairlineD9Ej5fM$annotations() {
        }

        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m7627getInfinityD9Ej5fM$annotations() {
        }

        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m7628getUnspecifiedD9Ej5fM$annotations() {
        }
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m7613divu2uoSUM(float f, float f2) {
        return m7611constructorimpl(f / f2);
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m7620timesu2uoSUM(float f, float f2) {
        return m7611constructorimpl(f * f2);
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m7624compareTo0680j_4(float f) {
        return m7610compareTo0680j_4(this.value, f);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m7611constructorimpl(float f) {
        return f;
    }
}
