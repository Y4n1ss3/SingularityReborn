package androidx.compose.material3.internal.colorUtil;

import defpackage.fj;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CamUtils {
    public static final CamUtils INSTANCE = new CamUtils();
    private static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    private static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    private static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    private static final double[][] SRGB_TO_XYZ = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    private static final double[][] XYZ_TO_SRGB = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final int $stable = 8;

    private CamUtils() {
    }

    private final int argbFromRgb(int i, int i2, int i3) {
        return ((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255);
    }

    private final int argbFromXyz(double d, double d2, double d3) {
        double[][] dArr = XYZ_TO_SRGB;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        return argbFromRgb(delinearized(d4), delinearized(d5), delinearized((dArr4[2] * d3) + (dArr4[1] * d2) + (dArr4[0] * d)));
    }

    private final int clampInt(int i, int i2, int i3) {
        return i3 < i ? i : i3 > i2 ? i2 : i3;
    }

    private final int delinearized(double d) {
        double d2 = d / 100.0d;
        return clampInt(0, 255, (int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    private final float linearized(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    private final float lstarFromY(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    private final float yFromInt(int i) {
        float linearized = linearized((i >> 16) & 255);
        float linearized2 = linearized((i >> 8) & 255);
        float linearized3 = linearized(i & 255);
        double[] dArr = SRGB_TO_XYZ[1];
        return (float) ((linearized3 * dArr[2]) + (linearized2 * dArr[1]) + (linearized * dArr[0]));
    }

    public final int argbFromLinrgbComponents(double d, double d2, double d3) {
        return argbFromRgb(delinearized(d), delinearized(d2), delinearized(d3));
    }

    public final int argbFromLstar(double d) {
        double d2 = (d + 16.0d) / 116.0d;
        double d3 = d > 8.0d ? d2 * d2 * d2 : d / 903.2962962962963d;
        double d4 = d2 * d2 * d2;
        boolean z = d4 > 0.008856451679035631d;
        double d5 = z ? d4 : d / 903.2962962962963d;
        if (!z) {
            d4 = d / 903.2962962962963d;
        }
        float[] fArr = WHITE_POINT_D65;
        return argbFromXyz(d5 * fArr[0], d3 * fArr[1], d4 * fArr[2]);
    }

    public final float[][] getCAM16RGB_TO_XYZ() {
        return CAM16RGB_TO_XYZ;
    }

    public final float[] getWHITE_POINT_D65() {
        return WHITE_POINT_D65;
    }

    public final float[][] getXYZ_TO_CAM16RGB() {
        return XYZ_TO_CAM16RGB;
    }

    public final int intFromLstar(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return fj.a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public final float lstarFromInt(int i) {
        return lstarFromY(yFromInt(i));
    }

    public final int signum(double d) {
        if (d < 0.0d) {
            return -1;
        }
        return d == 0.0d ? 0 : 1;
    }

    public final float[] xyzFromInt(int i) {
        float linearized = linearized((i >> 16) & 255);
        float linearized2 = linearized((i >> 8) & 255);
        float linearized3 = linearized(i & 255);
        double[][] dArr = SRGB_TO_XYZ;
        double d = linearized;
        double[] dArr2 = dArr[0];
        double d2 = linearized2;
        double d3 = linearized3;
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        return new float[]{(float) d4, (float) d5, (float) ((d3 * dArr4[2]) + (d2 * dArr4[1]) + (d * dArr4[0]))};
    }

    public final double yFromLstar(double d) {
        return d > 8.0d ? Math.pow((d + 16.0d) / 116.0d, 3.0d) * 100.0d : (d / 903.2962962962963d) * 100.0d;
    }
}
