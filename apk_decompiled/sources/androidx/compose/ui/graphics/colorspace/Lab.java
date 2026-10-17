package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Lab extends ColorSpace {
    public static final int $stable = 0;
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    public static final Companion Companion = new Companion(null);
    private static final float D = 0.20689656f;

    public Lab(String str, int i) {
        super(str, ColorModel.Companion.m5197getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        float f = fArr[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f2 = f / illuminant.getD50Xyz$ui_graphics()[0];
        float f3 = fArr[1] / illuminant.getD50Xyz$ui_graphics()[1];
        float f4 = fArr[2] / illuminant.getD50Xyz$ui_graphics()[2];
        float cbrt = f2 > A ? (float) Math.cbrt(f2) : (f2 * B) + C;
        float cbrt2 = f3 > A ? (float) Math.cbrt(f3) : (f3 * B) + C;
        float cbrt3 = f4 > A ? (float) Math.cbrt(f4) : (f4 * B) + C;
        float f5 = (116.0f * cbrt2) - 16.0f;
        float f6 = (cbrt - cbrt2) * 500.0f;
        float f7 = (cbrt2 - cbrt3) * 200.0f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 100.0f) {
            f5 = 100.0f;
        }
        fArr[0] = f5;
        if (f6 < -128.0f) {
            f6 = -128.0f;
        }
        if (f6 > 128.0f) {
            f6 = 128.0f;
        }
        fArr[1] = f6;
        if (f7 < -128.0f) {
            f7 = -128.0f;
        }
        fArr[2] = f7 <= 128.0f ? f7 : 128.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        float f4 = (f + 16.0f) / 116.0f;
        float f5 = (f2 * 0.002f) + f4;
        float f6 = f5 > D ? f5 * f5 * f5 : (f5 - C) * 0.12841855f;
        float f7 = f4 > D ? f4 * f4 * f4 : (f4 - C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        return (Float.floatToRawIntBits(f6 * illuminant.getD50Xyz$ui_graphics()[0]) << 32) | (4294967295L & Float.floatToRawIntBits(f7 * illuminant.getD50Xyz$ui_graphics()[1]));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float f = fArr[0];
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        fArr[0] = f;
        float f2 = fArr[1];
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        fArr[1] = f2;
        float f3 = fArr[2];
        float f4 = f3 >= -128.0f ? f3 : -128.0f;
        float f5 = f4 <= 128.0f ? f4 : 128.0f;
        fArr[2] = f5;
        float f6 = (f + 16.0f) / 116.0f;
        float f7 = (f2 * 0.002f) + f6;
        float f8 = f6 - (f5 * 0.005f);
        float f9 = f7 > D ? f7 * f7 * f7 : (f7 - C) * 0.12841855f;
        float f10 = f6 > D ? f6 * f6 * f6 : (f6 - C) * 0.12841855f;
        float f11 = f8 > D ? f8 * f8 * f8 : (f8 - C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        fArr[0] = f9 * illuminant.getD50Xyz$ui_graphics()[0];
        fArr[1] = f10 * illuminant.getD50Xyz$ui_graphics()[1];
        fArr[2] = f11 * illuminant.getD50Xyz$ui_graphics()[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
        return (f4 > D ? f4 * f4 * f4 : 0.12841855f * (f4 - C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public long mo5201xyzaToColorJlNiLsg$ui_graphics(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        Illuminant illuminant = Illuminant.INSTANCE;
        float f5 = f / illuminant.getD50Xyz$ui_graphics()[0];
        float f6 = f2 / illuminant.getD50Xyz$ui_graphics()[1];
        float f7 = f3 / illuminant.getD50Xyz$ui_graphics()[2];
        float cbrt = f5 > A ? (float) Math.cbrt(f5) : (f5 * B) + C;
        float cbrt2 = f6 > A ? (float) Math.cbrt(f6) : (f6 * B) + C;
        float cbrt3 = f7 > A ? (float) Math.cbrt(f7) : (f7 * B) + C;
        float f8 = (116.0f * cbrt2) - 16.0f;
        float f9 = (cbrt - cbrt2) * 500.0f;
        float f10 = (cbrt2 - cbrt3) * 200.0f;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 100.0f) {
            f8 = 100.0f;
        }
        if (f9 < -128.0f) {
            f9 = -128.0f;
        }
        if (f9 > 128.0f) {
            f9 = 128.0f;
        }
        if (f10 < -128.0f) {
            f10 = -128.0f;
        }
        return ColorKt.Color(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, colorSpace);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
