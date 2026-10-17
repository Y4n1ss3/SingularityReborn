package androidx.compose.ui.text.style;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BaselineShift {
    private final float multiplier;
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = m7352constructorimpl(0.5f);
    private static final float Subscript = m7352constructorimpl(-0.5f);
    private static final float None = m7352constructorimpl(0.0f);
    private static final float Unspecified = m7352constructorimpl(Float.NaN);

    private /* synthetic */ BaselineShift(float f) {
        this.multiplier = f;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaselineShift m7351boximpl(float f) {
        return new BaselineShift(f);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7353equalsimpl(float f, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f, ((BaselineShift) obj).m7357unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7354equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7355hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7356toStringimpl(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return m7353equalsimpl(this.multiplier, obj);
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return m7355hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m7356toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m7357unboximpl() {
        return this.multiplier;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m7362getNoney9eOQZs() {
            return BaselineShift.None;
        }

        /* renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m7363getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m7364getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        /* renamed from: getUnspecified-y9eOQZs, reason: not valid java name */
        public final float m7365getUnspecifiedy9eOQZs() {
            return BaselineShift.Unspecified;
        }

        private Companion() {
        }

        /* renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m7358getNoney9eOQZs$annotations() {
        }

        /* renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m7359getSubscripty9eOQZs$annotations() {
        }

        /* renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m7360getSuperscripty9eOQZs$annotations() {
        }

        /* renamed from: getUnspecified-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m7361getUnspecifiedy9eOQZs$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m7352constructorimpl(float f) {
        return f;
    }
}
