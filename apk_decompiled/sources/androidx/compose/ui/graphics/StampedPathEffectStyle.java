package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StampedPathEffectStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Translate = m5119constructorimpl(0);
    private static final int Rotate = m5119constructorimpl(1);
    private static final int Morph = m5119constructorimpl(2);

    private /* synthetic */ StampedPathEffectStyle(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StampedPathEffectStyle m5118boximpl(int i) {
        return new StampedPathEffectStyle(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5120equalsimpl(int i, Object obj) {
        return (obj instanceof StampedPathEffectStyle) && i == ((StampedPathEffectStyle) obj).m5124unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5121equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5122hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5123toStringimpl(int i) {
        return m5121equalsimpl0(i, Translate) ? "Translate" : m5121equalsimpl0(i, Rotate) ? "Rotate" : m5121equalsimpl0(i, Morph) ? "Morph" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5120equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5122hashCodeimpl(this.value);
    }

    public String toString() {
        return m5123toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5124unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getMorph-Ypspkwk, reason: not valid java name */
        public final int m5125getMorphYpspkwk() {
            return StampedPathEffectStyle.Morph;
        }

        /* renamed from: getRotate-Ypspkwk, reason: not valid java name */
        public final int m5126getRotateYpspkwk() {
            return StampedPathEffectStyle.Rotate;
        }

        /* renamed from: getTranslate-Ypspkwk, reason: not valid java name */
        public final int m5127getTranslateYpspkwk() {
            return StampedPathEffectStyle.Translate;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5119constructorimpl(int i) {
        return i;
    }
}
