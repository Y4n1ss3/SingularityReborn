package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import defpackage.dq;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Color {
    private final long value;
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics());

    private /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m4751boximpl(long j) {
        return new Color(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m4752component1impl(long j) {
        return m4767getRedimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m4753component2impl(long j) {
        return m4766getGreenimpl(j);
    }

    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m4754component3impl(long j) {
        return m4764getBlueimpl(j);
    }

    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m4755component4impl(long j) {
        return m4763getAlphaimpl(j);
    }

    /* renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m4756component5impl(long j) {
        return m4765getColorSpaceimpl(j);
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m4758convertvNxB06k(long j, ColorSpace colorSpace) {
        return ColorSpaceKt.m5203connectYBCOT_4$default(m4765getColorSpaceimpl(j), colorSpace, 0, 2, null).mo5206transformToColorl2rxGTc$ui_graphics(j);
    }

    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m4759copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return ColorKt.Color(f2, f3, f4, f, m4765getColorSpaceimpl(j));
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m4760copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m4763getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m4767getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m4766getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m4764getBlueimpl(j);
        }
        return m4759copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4761equalsimpl(long j, Object obj) {
        return (obj instanceof Color) && j == ((Color) obj).m4771unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4762equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m4763getAlphaimpl(long j) {
        float F;
        float f;
        if ((63 & j) == 0) {
            F = (float) p01.F((j >>> 56) & 255);
            f = 255.0f;
        } else {
            F = (float) p01.F((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return F / f;
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m4764getBlueimpl(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) p01.F((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m4765getColorSpaceimpl(long j) {
        return ColorSpaces.INSTANCE.getColorSpacesArray$ui_graphics()[(int) (j & 63)];
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m4766getGreenimpl(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) p01.F((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m4767getRedimpl(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) p01.F((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4768hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4769toStringimpl(long j) {
        return "Color(" + m4767getRedimpl(j) + ", " + m4766getGreenimpl(j) + ", " + m4764getBlueimpl(j) + ", " + m4763getAlphaimpl(j) + ", " + m4765getColorSpaceimpl(j).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m4761equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name */
    public final long m4770getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m4768hashCodeimpl(this.value);
    }

    public String toString() {
        return m4769toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4771unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m4785hslJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m4800hslJlNiLsg(f, f2, f3, f5, rgb);
        }

        private final float hslToRgbComponent(int i, float f, float f2, float f3) {
            float f4 = ((f / 30.0f) + i) % 12.0f;
            return f3 - (Math.max(-1.0f, Math.min(f4 - 3.0f, Math.min(9.0f - f4, 1.0f))) * (Math.min(f3, 1.0f - f3) * f2));
        }

        /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m4786hsvJlNiLsg$default(Companion companion, float f, float f2, float f3, float f4, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m4801hsvJlNiLsg(f, f2, f3, f5, rgb);
        }

        private final float hsvToRgbComponent(int i, float f, float f2, float f3) {
            float f4 = ((f / 60.0f) + i) % 6.0f;
            return f3 - (Math.max(0.0f, Math.min(f4, Math.min(4.0f - f4, 1.0f))) * (f2 * f3));
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m4787getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m4788getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m4789getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m4790getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m4791getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m4792getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m4793getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m4794getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m4795getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m4796getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m4797getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m4798getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m4799getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m4800hslJlNiLsg(float f, float f2, float f3, float f4, Rgb rgb) {
            if (!(0.0f <= f && f <= 360.0f && 0.0f <= f2 && f2 <= 1.0f && 0.0f <= f3 && f3 <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSL (" + f + ", " + f2 + ", " + f3 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hslToRgbComponent(0, f, f2, f3), hslToRgbComponent(8, f, f2, f3), hslToRgbComponent(4, f, f2, f3), f4, rgb);
        }

        /* renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m4801hsvJlNiLsg(float f, float f2, float f3, float f4, Rgb rgb) {
            if (!(0.0f <= f && f <= 360.0f && 0.0f <= f2 && f2 <= 1.0f && 0.0f <= f3 && f3 <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSV (" + f + ", " + f2 + ", " + f3 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hsvToRgbComponent(5, f, f2, f3), hsvToRgbComponent(3, f, f2, f3), hsvToRgbComponent(1, f, f2, f3), f4, rgb);
        }

        private Companion() {
        }

        /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4772getBlack0d7_KjU$annotations() {
        }

        /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4773getBlue0d7_KjU$annotations() {
        }

        /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4774getCyan0d7_KjU$annotations() {
        }

        /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4775getDarkGray0d7_KjU$annotations() {
        }

        /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4776getGray0d7_KjU$annotations() {
        }

        /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4777getGreen0d7_KjU$annotations() {
        }

        /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4778getLightGray0d7_KjU$annotations() {
        }

        /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4779getMagenta0d7_KjU$annotations() {
        }

        /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4780getRed0d7_KjU$annotations() {
        }

        /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4781getTransparent0d7_KjU$annotations() {
        }

        /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4782getUnspecified0d7_KjU$annotations() {
        }

        /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4783getWhite0d7_KjU$annotations() {
        }

        /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4784getYellow0d7_KjU$annotations() {
        }
    }

    public static /* synthetic */ void getAlpha$annotations() {
    }

    public static /* synthetic */ void getBlue$annotations() {
    }

    public static /* synthetic */ void getColorSpace$annotations() {
    }

    public static /* synthetic */ void getGreen$annotations() {
    }

    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4757constructorimpl(long j) {
        return j;
    }
}
