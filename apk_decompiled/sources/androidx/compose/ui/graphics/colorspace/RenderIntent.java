package androidx.compose.ui.graphics.colorspace;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RenderIntent {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = m5212constructorimpl(0);
    private static final int Relative = m5212constructorimpl(1);
    private static final int Saturation = m5212constructorimpl(2);
    private static final int Absolute = m5212constructorimpl(3);

    private /* synthetic */ RenderIntent(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RenderIntent m5211boximpl(int i) {
        return new RenderIntent(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5213equalsimpl(int i, Object obj) {
        return (obj instanceof RenderIntent) && i == ((RenderIntent) obj).m5217unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5214equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5215hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5216toStringimpl(int i) {
        return m5214equalsimpl0(i, Perceptual) ? "Perceptual" : m5214equalsimpl0(i, Relative) ? "Relative" : m5214equalsimpl0(i, Saturation) ? "Saturation" : m5214equalsimpl0(i, Absolute) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5213equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5215hashCodeimpl(this.value);
    }

    public String toString() {
        return m5216toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5217unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m5218getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m5219getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m5220getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m5221getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5212constructorimpl(int i) {
        return i;
    }
}
