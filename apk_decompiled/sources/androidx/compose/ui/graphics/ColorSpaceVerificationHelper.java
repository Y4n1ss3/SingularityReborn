package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import defpackage.ky;
import defpackage.q10;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ColorSpaceVerificationHelper {
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    public static final ColorSpace androidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace obtainAndroidColorSpace;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (q10.b(colorSpace, colorSpaces.getSrgb())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (q10.b(colorSpace, colorSpaces.getAces())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (q10.b(colorSpace, colorSpaces.getAcescg())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (q10.b(colorSpace, colorSpaces.getAdobeRgb())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (q10.b(colorSpace, colorSpaces.getBt2020())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (q10.b(colorSpace, colorSpaces.getBt709())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (q10.b(colorSpace, colorSpaces.getCieLab())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (q10.b(colorSpace, colorSpaces.getCieXyz())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (q10.b(colorSpace, colorSpaces.getDciP3())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (q10.b(colorSpace, colorSpaces.getDisplayP3())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (q10.b(colorSpace, colorSpaces.getExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (q10.b(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (q10.b(colorSpace, colorSpaces.getLinearSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (q10.b(colorSpace, colorSpaces.getNtsc1953())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (q10.b(colorSpace, colorSpaces.getProPhotoRgb())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (q10.b(colorSpace, colorSpaces.getSmpteC())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (obtainAndroidColorSpace = ColorSpaceVerificationHelperV34.obtainAndroidColorSpace(colorSpace)) != null) {
            return obtainAndroidColorSpace;
        }
        if (!(colorSpace instanceof Rgb)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Rgb rgb = (Rgb) colorSpace;
        float[] xyz$ui_graphics = rgb.getWhitePoint().toXyz$ui_graphics();
        TransferParameters transferParameters = rgb.getTransferParameters();
        ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
        float[] transform$ui_graphics = rgb.getTransform$ui_graphics();
        final int i = 0;
        if (transferParameters2 != null) {
            ColorSpace.Rgb rgb2 = new ColorSpace.Rgb(colorSpace.getName(), rgb.getPrimaries$ui_graphics(), xyz$ui_graphics, transferParameters2);
            return (Float.isNaN(transform$ui_graphics[0]) || Arrays.equals(rgb2.getTransform(), transform$ui_graphics)) ? rgb2 : new ColorSpace.Rgb(colorSpace.getName(), transform$ui_graphics, transferParameters2);
        }
        String name = colorSpace.getName();
        float[] primaries$ui_graphics = rgb.getPrimaries$ui_graphics();
        final ky oetf = rgb.getOetf();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.a
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                double androidColorSpace$lambda$0;
                double androidColorSpace$lambda$1;
                int i2 = i;
                ky kyVar = oetf;
                switch (i2) {
                    case 0:
                        androidColorSpace$lambda$0 = ColorSpaceVerificationHelper.androidColorSpace$lambda$0(kyVar, d);
                        return androidColorSpace$lambda$0;
                    default:
                        androidColorSpace$lambda$1 = ColorSpaceVerificationHelper.androidColorSpace$lambda$1(kyVar, d);
                        return androidColorSpace$lambda$1;
                }
            }
        };
        final ky eotf = rgb.getEotf();
        final int i2 = 1;
        return new ColorSpace.Rgb(name, primaries$ui_graphics, xyz$ui_graphics, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.a
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                double androidColorSpace$lambda$0;
                double androidColorSpace$lambda$1;
                int i22 = i2;
                ky kyVar = eotf;
                switch (i22) {
                    case 0:
                        androidColorSpace$lambda$0 = ColorSpaceVerificationHelper.androidColorSpace$lambda$0(kyVar, d);
                        return androidColorSpace$lambda$0;
                    default:
                        androidColorSpace$lambda$1 = ColorSpaceVerificationHelper.androidColorSpace$lambda$1(kyVar, d);
                        return androidColorSpace$lambda$1;
                }
            }
        }, rgb.getMinValue(0), rgb.getMaxValue(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(ky kyVar, double d) {
        return ((Number) kyVar.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(ky kyVar, double d) {
        return ((Number) kyVar.invoke(Double.valueOf(d))).doubleValue();
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace(final ColorSpace colorSpace) {
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return ColorSpaces.INSTANCE.getAces();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            androidx.compose.ui.graphics.colorspace.ColorSpace obtainComposeColorSpaceFromId = ColorSpaceVerificationHelperV34.obtainComposeColorSpaceFromId(colorSpace.getId());
            if (!q10.b(obtainComposeColorSpaceFromId, ColorSpaces.INSTANCE.getUnspecified$ui_graphics())) {
                return obtainComposeColorSpaceFromId;
            }
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        WhitePoint whitePoint = rgb.getWhitePoint().length == 3 ? new WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        TransferParameters transferParameters2 = transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null;
        final int i = 0;
        final int i2 = 1;
        return new Rgb(rgb.getName(), rgb.getPrimaries(), whitePoint, rgb.getTransform(), new DoubleFunction() { // from class: androidx.compose.ui.graphics.b
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double composeColorSpace$lambda$0;
                double composeColorSpace$lambda$1;
                int i3 = i;
                ColorSpace colorSpace2 = colorSpace;
                switch (i3) {
                    case 0:
                        composeColorSpace$lambda$0 = ColorSpaceVerificationHelper.composeColorSpace$lambda$0(colorSpace2, d);
                        return composeColorSpace$lambda$0;
                    default:
                        composeColorSpace$lambda$1 = ColorSpaceVerificationHelper.composeColorSpace$lambda$1(colorSpace2, d);
                        return composeColorSpace$lambda$1;
                }
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.b
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double composeColorSpace$lambda$0;
                double composeColorSpace$lambda$1;
                int i3 = i2;
                ColorSpace colorSpace2 = colorSpace;
                switch (i3) {
                    case 0:
                        composeColorSpace$lambda$0 = ColorSpaceVerificationHelper.composeColorSpace$lambda$0(colorSpace2, d);
                        return composeColorSpace$lambda$0;
                    default:
                        composeColorSpace$lambda$1 = ColorSpaceVerificationHelper.composeColorSpace$lambda$1(colorSpace2, d);
                        return composeColorSpace$lambda$1;
                }
            }
        }, rgb.getMinValue(0), rgb.getMaxValue(0), transferParameters2, rgb.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$0(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$1(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d);
    }
}
