package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageBitmapConfig {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Argb8888 = m4985constructorimpl(0);
    private static final int Alpha8 = m4985constructorimpl(1);
    private static final int Rgb565 = m4985constructorimpl(2);
    private static final int F16 = m4985constructorimpl(3);
    private static final int Gpu = m4985constructorimpl(4);

    private /* synthetic */ ImageBitmapConfig(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m4984boximpl(int i) {
        return new ImageBitmapConfig(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4986equalsimpl(int i, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i == ((ImageBitmapConfig) obj).m4990unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4987equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4988hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4989toStringimpl(int i) {
        return m4987equalsimpl0(i, Argb8888) ? "Argb8888" : m4987equalsimpl0(i, Alpha8) ? "Alpha8" : m4987equalsimpl0(i, Rgb565) ? "Rgb565" : m4987equalsimpl0(i, F16) ? "F16" : m4987equalsimpl0(i, Gpu) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4986equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4988hashCodeimpl(this.value);
    }

    public String toString() {
        return m4989toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4990unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m4991getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m4992getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m4993getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m4994getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }

        /* renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m4995getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4985constructorimpl(int i) {
        return i;
    }
}
