package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class Connector {
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        this(colorSpace, colorSpace2, ColorModel.m5191equalsimpl0(r0, r2.m5198getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace, ColorModel.m5191equalsimpl0(colorSpace2.m5200getModelxdoWZVw(), r2.m5198getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace2, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace2, i, Companion.m5208computeTransformYBCOT_4(colorSpace, colorSpace2, i), null);
        long m5200getModelxdoWZVw = colorSpace.m5200getModelxdoWZVw();
        ColorModel.Companion companion = ColorModel.Companion;
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m5205getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    public final ColorSpace getSource() {
        return this.source;
    }

    public float[] transform(float[] fArr) {
        float[] xyz = this.transformSource.toXyz(fArr);
        float[] fArr2 = this.transform;
        if (fArr2 != null) {
            xyz[0] = xyz[0] * fArr2[0];
            xyz[1] = xyz[1] * fArr2[1];
            xyz[2] = xyz[2] * fArr2[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    /* renamed from: transformToColor-l2rxGTc$ui_graphics, reason: not valid java name */
    public long mo5206transformToColorl2rxGTc$ui_graphics(long j) {
        float m4767getRedimpl = Color.m4767getRedimpl(j);
        float m4766getGreenimpl = Color.m4766getGreenimpl(j);
        float m4764getBlueimpl = Color.m4764getBlueimpl(j);
        float m4763getAlphaimpl = Color.m4763getAlphaimpl(j);
        long xy$ui_graphics = this.transformSource.toXy$ui_graphics(m4767getRedimpl, m4766getGreenimpl, m4764getBlueimpl);
        float intBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics & 4294967295L));
        float z$ui_graphics = this.transformSource.toZ$ui_graphics(m4767getRedimpl, m4766getGreenimpl, m4764getBlueimpl);
        float[] fArr = this.transform;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            z$ui_graphics *= fArr[2];
        }
        float f = intBitsToFloat;
        return this.transformDestination.mo5201xyzaToColorJlNiLsg$ui_graphics(f, intBitsToFloat2, z$ui_graphics, m4763getAlphaimpl, this.destination);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m5208computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
            if (!RenderIntent.m5214equalsimpl0(i, RenderIntent.Companion.m5218getAbsoluteuksYyKA())) {
                return null;
            }
            long m5200getModelxdoWZVw = colorSpace.m5200getModelxdoWZVw();
            ColorModel.Companion companion = ColorModel.Companion;
            boolean m5191equalsimpl0 = ColorModel.m5191equalsimpl0(m5200getModelxdoWZVw, companion.m5198getRgbxdoWZVw());
            boolean m5191equalsimpl02 = ColorModel.m5191equalsimpl0(colorSpace2.m5200getModelxdoWZVw(), companion.m5198getRgbxdoWZVw());
            if (m5191equalsimpl0 && m5191equalsimpl02) {
                return null;
            }
            if (!m5191equalsimpl0 && !m5191equalsimpl02) {
                return null;
            }
            if (!m5191equalsimpl0) {
                colorSpace = colorSpace2;
            }
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics = m5191equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics() : Illuminant.INSTANCE.getD50Xyz$ui_graphics();
            float[] xyz$ui_graphics2 = m5191equalsimpl02 ? rgb.getWhitePoint().toXyz$ui_graphics() : Illuminant.INSTANCE.getD50Xyz$ui_graphics();
            return new float[]{xyz$ui_graphics[0] / xyz$ui_graphics2[0], xyz$ui_graphics[1] / xyz$ui_graphics2[1], xyz$ui_graphics[2] / xyz$ui_graphics2[2]};
        }

        public final Connector identity$ui_graphics(final ColorSpace colorSpace) {
            final int m5220getRelativeuksYyKA = RenderIntent.Companion.m5220getRelativeuksYyKA();
            return new Connector(colorSpace, m5220getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                {
                    super(colorSpace, colorSpace, m5220getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                public float[] transform(float[] fArr) {
                    return fArr;
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* renamed from: transformToColor-l2rxGTc$ui_graphics */
                public long mo5206transformToColorl2rxGTc$ui_graphics(long j) {
                    return j;
                }
            };
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RgbConnector extends Connector {
        public static final int $stable = 8;
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        private RgbConnector(Rgb rgb, Rgb rgb2, int i) {
            super(rgb, rgb2, rgb, rgb2, i, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m5209computeTransformYBCOT_4(rgb, rgb2, i);
        }

        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m5209computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics(), rgb.getTransform$ui_graphics());
            }
            float[] transform$ui_graphics = rgb.getTransform$ui_graphics();
            float[] inverseTransform$ui_graphics = rgb2.getInverseTransform$ui_graphics();
            float[] xyz$ui_graphics = rgb.getWhitePoint().toXyz$ui_graphics();
            float[] xyz$ui_graphics2 = rgb2.getWhitePoint().toXyz$ui_graphics();
            WhitePoint whitePoint = rgb.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                transform$ui_graphics = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics(), xyz$ui_graphics, illuminant.newD50Xyz$ui_graphics()), rgb.getTransform$ui_graphics());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), illuminant.getD50())) {
                inverseTransform$ui_graphics = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics(), xyz$ui_graphics2, illuminant.newD50Xyz$ui_graphics()), rgb2.getTransform$ui_graphics()));
            }
            if (RenderIntent.m5214equalsimpl0(i, RenderIntent.Companion.m5218getAbsoluteuksYyKA())) {
                transform$ui_graphics = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics[0] / xyz$ui_graphics2[0], xyz$ui_graphics[1] / xyz$ui_graphics2[1], xyz$ui_graphics[2] / xyz$ui_graphics2[2]}, transform$ui_graphics);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics, transform$ui_graphics);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public float[] transform(float[] fArr) {
            fArr[0] = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fArr[0]);
            fArr[1] = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fArr[1]);
            fArr[2] = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fArr[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, fArr);
            fArr[0] = (float) this.mDestination.getOetfFunc$ui_graphics().invoke(fArr[0]);
            fArr[1] = (float) this.mDestination.getOetfFunc$ui_graphics().invoke(fArr[1]);
            fArr[2] = (float) this.mDestination.getOetfFunc$ui_graphics().invoke(fArr[2]);
            return fArr;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-l2rxGTc$ui_graphics */
        public long mo5206transformToColorl2rxGTc$ui_graphics(long j) {
            float m4767getRedimpl = Color.m4767getRedimpl(j);
            float m4766getGreenimpl = Color.m4766getGreenimpl(j);
            float m4764getBlueimpl = Color.m4764getBlueimpl(j);
            float m4763getAlphaimpl = Color.m4763getAlphaimpl(j);
            float invoke = (float) this.mSource.getEotfFunc$ui_graphics().invoke(m4767getRedimpl);
            float invoke2 = (float) this.mSource.getEotfFunc$ui_graphics().invoke(m4766getGreenimpl);
            float invoke3 = (float) this.mSource.getEotfFunc$ui_graphics().invoke(m4764getBlueimpl);
            float[] fArr = this.mTransform;
            return ColorKt.Color((float) this.mDestination.getOetfFunc$ui_graphics().invoke((fArr[6] * invoke3) + (fArr[3] * invoke2) + (fArr[0] * invoke)), (float) this.mDestination.getOetfFunc$ui_graphics().invoke((fArr[7] * invoke3) + (fArr[4] * invoke2) + (fArr[1] * invoke)), (float) this.mDestination.getOetfFunc$ui_graphics().invoke((fArr[8] * invoke3) + (fArr[5] * invoke2) + (fArr[2] * invoke)), m4763getAlphaimpl, this.mDestination);
        }

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i, dq dqVar) {
            this(rgb, rgb2, i);
        }
    }

    public final float[] transform(float f, float f2, float f3) {
        return transform(new float[]{f, f2, f3});
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr, dq dqVar) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i, fArr);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i;
        this.transform = fArr;
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i, dq dqVar) {
        this(colorSpace, colorSpace2, i);
    }
}
