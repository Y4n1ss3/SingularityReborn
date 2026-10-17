package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.Rgb;
import defpackage.ac;
import defpackage.dq;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;
import defpackage.rj0;
import defpackage.y80;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {
    private final ky eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final ky oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final DoubleFunction DoubleIdentity = new o(25);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, TransferParameters transferParameters, int i) {
        super(str, ColorModel.Companion.m5198getRgbxdoWZVw(), i, null);
        float[] fArr3 = fArr2;
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new Rgb$oetf$1(this);
        final int i2 = 0;
        this.oetfFunc = new DoubleFunction(this) { // from class: oj0
            public final /* synthetic */ Rgb b;

            {
                this.b = this;
            }

            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double oetfFunc$lambda$0;
                double eotfFunc$lambda$0;
                int i3 = i2;
                Rgb rgb = this.b;
                switch (i3) {
                    case 0:
                        oetfFunc$lambda$0 = Rgb.oetfFunc$lambda$0(rgb, d);
                        return oetfFunc$lambda$0;
                    default:
                        eotfFunc$lambda$0 = Rgb.eotfFunc$lambda$0(rgb, d);
                        return eotfFunc$lambda$0;
                }
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new Rgb$eotf$1(this);
        final int i3 = 1;
        this.eotfFunc = new DoubleFunction(this) { // from class: oj0
            public final /* synthetic */ Rgb b;

            {
                this.b = this;
            }

            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double oetfFunc$lambda$0;
                double eotfFunc$lambda$0;
                int i32 = i3;
                Rgb rgb = this.b;
                switch (i32) {
                    case 0:
                        oetfFunc$lambda$0 = Rgb.oetfFunc$lambda$0(rgb, d);
                        return oetfFunc$lambda$0;
                    default:
                        eotfFunc$lambda$0 = Rgb.eotfFunc$lambda$0(rgb, d);
                        return eotfFunc$lambda$0;
                }
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            o.m("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        Companion companion = Companion;
        float[] xyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = xyPrimaries;
        if (fArr3 == null) {
            float[] computeXYZMatrix = companion.computeXYZMatrix(xyPrimaries, whitePoint);
            this.transform = computeXYZMatrix;
            fArr3 = computeXYZMatrix;
        } else {
            if (fArr3.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr3.length);
            }
            this.transform = fArr3;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(fArr3);
        this.isWideGamut = companion.isWideGamut(xyPrimaries, f, f2);
        this.isSrgb = companion.isSrgb(xyPrimaries, whitePoint, doubleFunction, doubleFunction2, f, f2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$0(ky kyVar, double d) {
        return ((Number) kyVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$1(ky kyVar, double d) {
        return ((Number) kyVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(ky kyVar, double d) {
        return ((Number) kyVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(ky kyVar, double d) {
        return ((Number) kyVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$0(Rgb rgb, double d) {
        return rgb.eotfOrig.invoke(y80.f(d, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d) {
        return y80.f(rgb.oetfOrig.invoke(d), rgb.min, rgb.max);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !q10.b(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        TransferParameters transferParameters2 = rgb.transferParameters;
        if (transferParameters != null) {
            return q10.b(transferParameters, transferParameters2);
        }
        if (transferParameters2 == null) {
            return true;
        }
        if (q10.b(this.oetfOrig, rgb.oetfOrig)) {
            return q10.b(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    public final float[] fromLinear(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    public final ky getEotf() {
        return this.eotf;
    }

    public final DoubleFunction getEotfFunc$ui_graphics() {
        return this.eotfFunc;
    }

    public final DoubleFunction getEotfOrig$ui_graphics() {
        return this.eotfOrig;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final float[] getInverseTransform$ui_graphics() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return this.min;
    }

    public final ky getOetf() {
        return this.oetf;
    }

    public final DoubleFunction getOetfFunc$ui_graphics() {
        return this.oetfFunc;
    }

    public final DoubleFunction getOetfOrig$ui_graphics() {
        return this.oetfOrig;
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final float[] getPrimaries$ui_graphics() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final float[] getTransform$ui_graphics() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.primaries) + ((this.whitePoint.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.min;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.max;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int hashCode2 = floatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (this.transferParameters != null) {
            return hashCode2;
        }
        return this.eotfOrig.hashCode() + ((this.oetfOrig.hashCode() + (hashCode2 * 31)) * 31);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    public final float[] toLinear(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics(float f, float f2, float f3) {
        float invoke = (float) this.eotfFunc.invoke(f);
        float invoke2 = (float) this.eotfFunc.invoke(f2);
        float invoke3 = (float) this.eotfFunc.invoke(f3);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * invoke3) + (fArr[3] * invoke2) + (fArr[0] * invoke);
        float f5 = (fArr[7] * invoke3) + (fArr[4] * invoke2) + (fArr[1] * invoke);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics(float f, float f2, float f3) {
        float invoke = (float) this.eotfFunc.invoke(f);
        float invoke2 = (float) this.eotfFunc.invoke(f2);
        float invoke3 = (float) this.eotfFunc.invoke(f3);
        float[] fArr = this.transform;
        return (fArr[8] * invoke3) + (fArr[5] * invoke2) + (fArr[2] * invoke);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public long mo5201xyzaToColorJlNiLsg$ui_graphics(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        return ColorKt.Color((float) this.oetfFunc.invoke((fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f)), (float) this.oetfFunc.invoke((fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f)), (float) this.oetfFunc.invoke((fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f)), f4, colorSpace);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private final float area(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        private final boolean compare(double d, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            return Math.abs(doubleFunction.invoke(d) - doubleFunction2.invoke(d)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            return new WhitePoint(f / f3, f2 / f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = (1.0f - f) / f2;
            float f8 = (1.0f - x) / y;
            float f9 = f / f2;
            float f10 = (f3 / f4) - f9;
            float f11 = (x / y) - f9;
            float f12 = ((1.0f - f3) / f4) - f7;
            float f13 = (f5 / f6) - f9;
            float f14 = (((f8 - f7) * f10) - (f11 * f12)) / (((((1.0f - f5) / f6) - f7) * f10) - (f12 * f13));
            float f15 = (f11 - (f13 * f14)) / f10;
            float f16 = (1.0f - f15) - f14;
            float f17 = f16 / f2;
            float f18 = f15 / f4;
            float f19 = f14 / f6;
            return new float[]{f17 * f, f16, ((1.0f - f) - f2) * f17, f18 * f3, f15, ((1.0f - f3) - f4) * f18, f19 * f5, f14, ((1.0f - f5) - f6) * f19};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[1];
            float f4 = fArr2[1];
            float f5 = fArr[2];
            float f6 = fArr2[2];
            float f7 = fArr[3];
            float f8 = fArr2[3];
            float f9 = fArr[4];
            float f10 = fArr2[4];
            float f11 = fArr[5];
            float f12 = fArr2[5];
            float[] fArr3 = {f - f2, f3 - f4, f5 - f6, f7 - f8, f9 - f10, f11 - f12};
            float f13 = fArr3[0];
            float f14 = fArr3[1];
            if (((f4 - f12) * f13) - ((f2 - f10) * f14) >= 0.0f && ((f2 - f6) * f14) - ((f4 - f8) * f13) >= 0.0f) {
                float f15 = fArr3[2];
                float f16 = fArr3[3];
                if (((f8 - f4) * f15) - ((f6 - f2) * f16) >= 0.0f && ((f6 - f10) * f16) - ((f8 - f12) * f15) >= 0.0f) {
                    float f17 = fArr3[4];
                    float f18 = fArr3[5];
                    if (((f12 - f8) * f17) - ((f10 - f6) * f18) >= 0.0f && ((f10 - f2) * f18) - ((f12 - f4) * f17) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateEotf(TransferParameters transferParameters) {
            return transferParameters.isHLGish$ui_graphics() ? new rj0(transferParameters, 0) : transferParameters.isPQish$ui_graphics() ? new rj0(transferParameters, 1) : (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new rj0(transferParameters, 2) : new rj0(transferParameters, 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$0(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$1(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$2(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$3(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateOetf(TransferParameters transferParameters) {
            return transferParameters.isHLGish$ui_graphics() ? new rj0(transferParameters, 4) : transferParameters.isPQish$ui_graphics() ? new rj0(transferParameters, 5) : (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new rj0(transferParameters, 6) : new rj0(transferParameters, 7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$0(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$1(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$2(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$3(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || f != 0.0f || f2 != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!compare(d, doubleFunction, srgb.getOetfOrig$ui_graphics()) || !compare(d, doubleFunction2, srgb.getEotfOrig$ui_graphics())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f, float f2) {
            float area = area(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (area / area(colorSpaces.getNtsc1953Primaries$ui_graphics()) <= 0.9f || !contains(fArr, colorSpaces.getSrgbPrimaries$ui_graphics())) {
                return f < 0.0f && f2 > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                ac.N(fArr, fArr2, 0, 0, (r3 & 8) != 0 ? fArr.length : 6);
                return fArr2;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = f + f2 + fArr[2];
            fArr2[0] = f / f3;
            fArr2[1] = f2 / f3;
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = f4 + f5 + fArr[5];
            fArr2[2] = f4 / f6;
            fArr2[3] = f5 / f6;
            float f7 = fArr[6];
            float f8 = fArr[7];
            float f9 = f7 + f8 + fArr[8];
            fArr2[4] = f7 / f9;
            fArr2[5] = f8 / f9;
            return fArr2;
        }

        public final float[] computePrimaries$ui_graphics(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] mul3x3Float32 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] mul3x3Float33 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            float f4 = mul3x3Float32[0];
            float f5 = mul3x3Float32[1];
            float f6 = f4 + f5 + mul3x3Float32[2];
            float f7 = mul3x3Float33[0];
            float f8 = mul3x3Float33[1];
            float f9 = f7 + f8 + mul3x3Float33[2];
            return new float[]{f / f3, f2 / f3, f4 / f6, f5 / f6, f7 / f9, f8 / f9};
        }

        private Companion() {
        }
    }

    public final float[] getInverseTransform(float[] fArr) {
        ac.N(r1, fArr, 0, 0, (r3 & 8) != 0 ? this.inverseTransform.length : 6);
        return fArr;
    }

    public final float[] getPrimaries(float[] fArr) {
        ac.N(r1, fArr, 0, 0, (r3 & 8) != 0 ? this.primaries.length : 6);
        return fArr;
    }

    public final float[] getTransform(float[] fArr) {
        ac.N(r1, fArr, 0, 0, (r3 & 8) != 0 ? this.transform.length : 6);
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$0(double d) {
        return d;
    }

    public final float[] fromLinear(float f, float f2, float f3) {
        return fromLinear(new float[]{f, f2, f3});
    }

    public final float[] toLinear(float f, float f2, float f3) {
        return toLinear(new float[]{f, f2, f3});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, final ky kyVar, final ky kyVar2) {
        this(str, r3, r4, null, r6, new DoubleFunction() { // from class: pj0
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double _init_$lambda$0;
                double _init_$lambda$1;
                double _init_$lambda$2;
                double _init_$lambda$3;
                int i = r2;
                ky kyVar3 = kyVar2;
                switch (i) {
                    case 0:
                        _init_$lambda$0 = Rgb._init_$lambda$0(kyVar3, d);
                        return _init_$lambda$0;
                    case 1:
                        _init_$lambda$1 = Rgb._init_$lambda$1(kyVar3, d);
                        return _init_$lambda$1;
                    case 2:
                        _init_$lambda$2 = Rgb._init_$lambda$2(kyVar3, d);
                        return _init_$lambda$2;
                    default:
                        _init_$lambda$3 = Rgb._init_$lambda$3(kyVar3, d);
                        return _init_$lambda$3;
                }
            }
        }, 0.0f, 1.0f, null, -1);
        Companion companion = Companion;
        float[] computePrimaries$ui_graphics = companion.computePrimaries$ui_graphics(fArr);
        WhitePoint computeWhitePoint = companion.computeWhitePoint(fArr);
        final int i = 0;
        DoubleFunction doubleFunction = new DoubleFunction() { // from class: pj0
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double _init_$lambda$0;
                double _init_$lambda$1;
                double _init_$lambda$2;
                double _init_$lambda$3;
                int i2 = i;
                ky kyVar3 = kyVar;
                switch (i2) {
                    case 0:
                        _init_$lambda$0 = Rgb._init_$lambda$0(kyVar3, d);
                        return _init_$lambda$0;
                    case 1:
                        _init_$lambda$1 = Rgb._init_$lambda$1(kyVar3, d);
                        return _init_$lambda$1;
                    case 2:
                        _init_$lambda$2 = Rgb._init_$lambda$2(kyVar3, d);
                        return _init_$lambda$2;
                    default:
                        _init_$lambda$3 = Rgb._init_$lambda$3(kyVar3, d);
                        return _init_$lambda$3;
                }
            }
        };
        final int i2 = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final ky kyVar, final ky kyVar2, float f, float f2) {
        this(str, fArr, whitePoint, null, r5, new DoubleFunction() { // from class: pj0
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double _init_$lambda$0;
                double _init_$lambda$1;
                double _init_$lambda$2;
                double _init_$lambda$3;
                int i2 = r2;
                ky kyVar3 = kyVar2;
                switch (i2) {
                    case 0:
                        _init_$lambda$0 = Rgb._init_$lambda$0(kyVar3, d);
                        return _init_$lambda$0;
                    case 1:
                        _init_$lambda$1 = Rgb._init_$lambda$1(kyVar3, d);
                        return _init_$lambda$1;
                    case 2:
                        _init_$lambda$2 = Rgb._init_$lambda$2(kyVar3, d);
                        return _init_$lambda$2;
                    default:
                        _init_$lambda$3 = Rgb._init_$lambda$3(kyVar3, d);
                        return _init_$lambda$3;
                }
            }
        }, f, f2, null, -1);
        final int i = 2;
        DoubleFunction doubleFunction = new DoubleFunction() { // from class: pj0
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double _init_$lambda$0;
                double _init_$lambda$1;
                double _init_$lambda$2;
                double _init_$lambda$3;
                int i2 = i;
                ky kyVar3 = kyVar;
                switch (i2) {
                    case 0:
                        _init_$lambda$0 = Rgb._init_$lambda$0(kyVar3, d);
                        return _init_$lambda$0;
                    case 1:
                        _init_$lambda$1 = Rgb._init_$lambda$1(kyVar3, d);
                        return _init_$lambda$1;
                    case 2:
                        _init_$lambda$2 = Rgb._init_$lambda$2(kyVar3, d);
                        return _init_$lambda$2;
                    default:
                        _init_$lambda$3 = Rgb._init_$lambda$3(kyVar3, d);
                        return _init_$lambda$3;
                }
            }
        };
        final int i2 = 3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, TransferParameters transferParameters) {
        this(str, r0.computePrimaries$ui_graphics(fArr), r0.computeWhitePoint(fArr), transferParameters, -1);
        Companion companion = Companion;
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i) {
        this(str, fArr, whitePoint, null, r0.generateOetf(transferParameters), r0.generateEotf(transferParameters), 0.0f, 1.0f, transferParameters, i);
        Companion companion = Companion;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, double d) {
        this(str, r0.computePrimaries$ui_graphics(fArr), r0.computeWhitePoint(fArr), d, 0.0f, 1.0f, -1);
        Companion companion = Companion;
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, double d) {
        this(str, fArr, whitePoint, d, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d, float f, float f2, int i) {
        this(str, fArr, whitePoint, null, r17, r0, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            final int i2 = 0;
            doubleFunction = new DoubleFunction() { // from class: qj0
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    double _init_$lambda$4;
                    double _init_$lambda$5;
                    switch (i2) {
                        case 0:
                            _init_$lambda$4 = Rgb._init_$lambda$4(d, d2);
                            return _init_$lambda$4;
                        default:
                            _init_$lambda$5 = Rgb._init_$lambda$5(d, d2);
                            return _init_$lambda$5;
                    }
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            final int i3 = 1;
            doubleFunction2 = new DoubleFunction() { // from class: qj0
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    double _init_$lambda$4;
                    double _init_$lambda$5;
                    switch (i3) {
                        case 0:
                            _init_$lambda$4 = Rgb._init_$lambda$4(d, d2);
                            return _init_$lambda$4;
                        default:
                            _init_$lambda$5 = Rgb._init_$lambda$5(d, d2);
                            return _init_$lambda$5;
                    }
                }
            };
        }
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
