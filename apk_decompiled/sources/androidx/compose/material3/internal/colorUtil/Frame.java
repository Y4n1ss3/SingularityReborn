package androidx.compose.material3.internal.colorUtil;

import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Frame {
    public static final int $stable;
    public static final Companion Companion;
    private static final Frame Default;
    private final float aw;
    private final float c;
    private final float fl;
    private final float flRoot;
    private final float n;
    private final float nbb;
    private final float nc;
    private final float ncb;
    private final float[] rgbD;
    private final float z;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        $stable = 8;
        CamUtils camUtils = CamUtils.INSTANCE;
        Default = companion.make(camUtils.getWHITE_POINT_D65(), (float) ((camUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    private Frame(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.n = f;
        this.aw = f2;
        this.nbb = f3;
        this.ncb = f4;
        this.c = f5;
        this.nc = f6;
        this.rgbD = fArr;
        this.fl = f7;
        this.flRoot = f8;
        this.z = f9;
    }

    public final float getAw() {
        return this.aw;
    }

    public final float getC() {
        return this.c;
    }

    public final float getFl() {
        return this.fl;
    }

    public final float getFlRoot() {
        return this.flRoot;
    }

    public final float getN() {
        return this.n;
    }

    public final float getNbb() {
        return this.nbb;
    }

    public final float getNc() {
        return this.nc;
    }

    public final float getNcb() {
        return this.ncb;
    }

    public final float[] getRgbD() {
        return this.rgbD;
    }

    public final float getZ() {
        return this.z;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Frame getDefault() {
            return Frame.Default;
        }

        public final Frame make(float[] fArr, float f, float f2, float f3, boolean z) {
            CamUtils camUtils = CamUtils.INSTANCE;
            float[][] xyz_to_cam16rgb = camUtils.getXYZ_TO_CAM16RGB();
            float f4 = fArr[0];
            float[] fArr2 = xyz_to_cam16rgb[0];
            float f5 = fArr2[0] * f4;
            float f6 = fArr[1];
            float f7 = (fArr2[1] * f6) + f5;
            float f8 = fArr[2];
            float f9 = (fArr2[2] * f8) + f7;
            float[] fArr3 = xyz_to_cam16rgb[1];
            float f10 = (fArr3[2] * f8) + (fArr3[1] * f6) + (fArr3[0] * f4);
            float[] fArr4 = xyz_to_cam16rgb[2];
            float f11 = (f8 * fArr4[2]) + (f6 * fArr4[1]) + (f4 * fArr4[0]);
            float f12 = (f3 / 10.0f) + 0.8f;
            float lerp = ((double) f12) >= 0.9d ? Frame_androidKt.lerp(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : Frame_androidKt.lerp(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
            float exp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
            double d = exp;
            if (d > 1.0d) {
                exp = 1.0f;
            } else if (d < 0.0d) {
                exp = 0.0f;
            }
            float[] fArr5 = {(((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp};
            float f13 = 1.0f / ((5.0f * f) + 1.0f);
            float f14 = f13 * f13 * f13 * f13;
            float f15 = 1.0f - f14;
            float cbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(f * 5.0d))) + (f14 * f);
            float yFromLstar = ((float) camUtils.yFromLstar(f2)) / fArr[1];
            double d2 = yFromLstar;
            float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
            float pow = 0.725f / ((float) Math.pow(d2, 0.20000000298023224d));
            float[] fArr6 = {(float) Math.pow(((fArr5[0] * cbrt) * f9) / 100.0f, 0.41999998688697815d), (float) Math.pow(((fArr5[1] * cbrt) * f10) / 100.0f, 0.41999998688697815d), (float) Math.pow(((fArr5[2] * cbrt) * f11) / 100.0f, 0.41999998688697815d)};
            float f16 = fArr6[0];
            float f17 = (f16 * 400.0f) / (f16 + 27.13f);
            float f18 = fArr6[1];
            float f19 = (f18 * 400.0f) / (f18 + 27.13f);
            float f20 = fArr6[2];
            float[] fArr7 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
            return new Frame(yFromLstar, kp0.a(fArr7[2], 0.05f, (fArr7[0] * 2.0f) + fArr7[1], pow), pow, pow, lerp, f12, fArr5, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Frame(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9, dq dqVar) {
        this(f, f2, f3, f4, f5, f6, fArr, f7, f8, f9);
    }
}
