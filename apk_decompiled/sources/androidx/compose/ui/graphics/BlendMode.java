package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m4668constructorimpl(0);
    private static final int Src = m4668constructorimpl(1);
    private static final int Dst = m4668constructorimpl(2);
    private static final int SrcOver = m4668constructorimpl(3);
    private static final int DstOver = m4668constructorimpl(4);
    private static final int SrcIn = m4668constructorimpl(5);
    private static final int DstIn = m4668constructorimpl(6);
    private static final int SrcOut = m4668constructorimpl(7);
    private static final int DstOut = m4668constructorimpl(8);
    private static final int SrcAtop = m4668constructorimpl(9);
    private static final int DstAtop = m4668constructorimpl(10);
    private static final int Xor = m4668constructorimpl(11);
    private static final int Plus = m4668constructorimpl(12);
    private static final int Modulate = m4668constructorimpl(13);
    private static final int Screen = m4668constructorimpl(14);
    private static final int Overlay = m4668constructorimpl(15);
    private static final int Darken = m4668constructorimpl(16);
    private static final int Lighten = m4668constructorimpl(17);
    private static final int ColorDodge = m4668constructorimpl(18);
    private static final int ColorBurn = m4668constructorimpl(19);
    private static final int Hardlight = m4668constructorimpl(20);
    private static final int Softlight = m4668constructorimpl(21);
    private static final int Difference = m4668constructorimpl(22);
    private static final int Exclusion = m4668constructorimpl(23);
    private static final int Multiply = m4668constructorimpl(24);
    private static final int Hue = m4668constructorimpl(25);
    private static final int Saturation = m4668constructorimpl(26);
    private static final int Color = m4668constructorimpl(27);
    private static final int Luminosity = m4668constructorimpl(28);

    private /* synthetic */ BlendMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m4667boximpl(int i) {
        return new BlendMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4669equalsimpl(int i, Object obj) {
        return (obj instanceof BlendMode) && i == ((BlendMode) obj).m4673unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4670equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4671hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4672toStringimpl(int i) {
        return m4670equalsimpl0(i, Clear) ? "Clear" : m4670equalsimpl0(i, Src) ? "Src" : m4670equalsimpl0(i, Dst) ? "Dst" : m4670equalsimpl0(i, SrcOver) ? "SrcOver" : m4670equalsimpl0(i, DstOver) ? "DstOver" : m4670equalsimpl0(i, SrcIn) ? "SrcIn" : m4670equalsimpl0(i, DstIn) ? "DstIn" : m4670equalsimpl0(i, SrcOut) ? "SrcOut" : m4670equalsimpl0(i, DstOut) ? "DstOut" : m4670equalsimpl0(i, SrcAtop) ? "SrcAtop" : m4670equalsimpl0(i, DstAtop) ? "DstAtop" : m4670equalsimpl0(i, Xor) ? "Xor" : m4670equalsimpl0(i, Plus) ? "Plus" : m4670equalsimpl0(i, Modulate) ? "Modulate" : m4670equalsimpl0(i, Screen) ? "Screen" : m4670equalsimpl0(i, Overlay) ? "Overlay" : m4670equalsimpl0(i, Darken) ? "Darken" : m4670equalsimpl0(i, Lighten) ? "Lighten" : m4670equalsimpl0(i, ColorDodge) ? "ColorDodge" : m4670equalsimpl0(i, ColorBurn) ? "ColorBurn" : m4670equalsimpl0(i, Hardlight) ? "HardLight" : m4670equalsimpl0(i, Softlight) ? "Softlight" : m4670equalsimpl0(i, Difference) ? "Difference" : m4670equalsimpl0(i, Exclusion) ? "Exclusion" : m4670equalsimpl0(i, Multiply) ? "Multiply" : m4670equalsimpl0(i, Hue) ? "Hue" : m4670equalsimpl0(i, Saturation) ? "Saturation" : m4670equalsimpl0(i, Color) ? "Color" : m4670equalsimpl0(i, Luminosity) ? "Luminosity" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4669equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4671hashCodeimpl(this.value);
    }

    public String toString() {
        return m4672toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4673unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m4674getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m4675getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m4676getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m4677getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m4678getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m4679getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m4680getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m4681getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m4682getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m4683getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m4684getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m4685getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m4686getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m4687getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m4688getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m4689getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m4690getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m4691getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m4692getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m4693getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m4694getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m4695getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m4696getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m4697getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m4698getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m4699getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m4700getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m4701getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m4702getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4668constructorimpl(int i) {
        return i;
    }
}
