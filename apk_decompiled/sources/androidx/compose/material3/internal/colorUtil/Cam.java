package androidx.compose.material3.internal.colorUtil;

import defpackage.dq;
import defpackage.fj;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Cam {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float astar;
    private final float bstar;
    private final float chroma;
    private final float hue;
    private final float j;
    private float jstar;
    private final float m;
    private final float s;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public Cam(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.hue = f;
        this.chroma = f2;
        this.j = f3;
        this.m = f4;
        this.s = f5;
        this.jstar = f6;
        this.astar = f7;
        this.bstar = f8;
    }

    public final float distance(Cam cam) {
        float f = this.jstar - cam.jstar;
        float f2 = this.astar - cam.astar;
        float f3 = this.bstar - cam.bstar;
        return (float) (Math.pow(Math.sqrt((f3 * f3) + (f2 * f2) + (f * f)), 0.63d) * 1.41d);
    }

    public final float getAstar() {
        return this.astar;
    }

    public final float getBstar() {
        return this.bstar;
    }

    public final float getChroma() {
        return this.chroma;
    }

    public final float getHue() {
        return this.hue;
    }

    public final float getJ() {
        return this.j;
    }

    public final float getJstar() {
        return this.jstar;
    }

    public final float getM() {
        return this.m;
    }

    public final float getS() {
        return this.s;
    }

    public final void setJstar(float f) {
        this.jstar = f;
    }

    public final int viewed(Frame frame) {
        float f;
        float f2 = this.chroma;
        if (f2 != 0.0f) {
            if (this.j != 0.0f) {
                f = f2 / ((float) Math.sqrt(r2 / 100.0f));
                float pow = f / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.28999999165534973d, frame.getN()), 0.7300000190734863d)), 1.1111111640930176d));
                float f3 = (this.hue * 3.1415927f) / 180.0f;
                float cos = (((float) Math.cos(2.0f + f3)) + 3.8f) * 0.25f;
                float aw = frame.getAw() * ((float) Math.pow(this.j / 100.0f, (1.0f / frame.getC()) / frame.getZ()));
                float ncb = frame.getNcb() * frame.getNc() * cos * 3846.1538f;
                float nbb = aw / frame.getNbb();
                double d = f3;
                float sin = (float) Math.sin(d);
                float cos2 = (float) Math.cos(d);
                float f4 = (((0.305f + nbb) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (ncb * 23.0f)));
                float f5 = cos2 * f4;
                float f6 = f4 * sin;
                float f7 = nbb * 460.0f;
                float f8 = ((288.0f * f6) + ((451.0f * f5) + f7)) / 1403.0f;
                float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
                float f10 = ((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f;
                float fl = (100.0f / frame.getFl()) * Math.signum(f8) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f8) * 27.13f) / (400.0f - Math.abs(f8))), 2.3809523582458496d));
                float fl2 = (100.0f / frame.getFl()) * Math.signum(f9) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f9) * 27.13f) / (400.0f - Math.abs(f9))), 2.3809523582458496d));
                float fl3 = (100.0f / frame.getFl()) * Math.signum(f10) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f10) * 27.13f) / (400.0f - Math.abs(f10))), 2.3809523582458496d));
                float f11 = fl / frame.getRgbD()[0];
                float f12 = fl2 / frame.getRgbD()[1];
                float f13 = fl3 / frame.getRgbD()[2];
                float[][] cam16rgb_to_xyz = CamUtils.INSTANCE.getCAM16RGB_TO_XYZ();
                float[] fArr = cam16rgb_to_xyz[0];
                float f14 = (fArr[2] * f13) + (fArr[1] * f12) + (fArr[0] * f11);
                float[] fArr2 = cam16rgb_to_xyz[1];
                float f15 = (fArr2[2] * f13) + (fArr2[1] * f12) + (fArr2[0] * f11);
                float[] fArr3 = cam16rgb_to_xyz[2];
                return fj.a(f14, f15, (f13 * fArr3[2]) + (f12 * fArr3[1]) + (f11 * fArr3[0]));
            }
        }
        f = 0.0f;
        float pow2 = f / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.28999999165534973d, frame.getN()), 0.7300000190734863d)), 1.1111111640930176d));
        float f32 = (this.hue * 3.1415927f) / 180.0f;
        float cos3 = (((float) Math.cos(2.0f + f32)) + 3.8f) * 0.25f;
        float aw2 = frame.getAw() * ((float) Math.pow(this.j / 100.0f, (1.0f / frame.getC()) / frame.getZ()));
        float ncb2 = frame.getNcb() * frame.getNc() * cos3 * 3846.1538f;
        float nbb2 = aw2 / frame.getNbb();
        double d2 = f32;
        float sin2 = (float) Math.sin(d2);
        float cos22 = (float) Math.cos(d2);
        float f42 = (((0.305f + nbb2) * 23.0f) * pow2) / (((pow2 * 108.0f) * sin2) + (((11.0f * pow2) * cos22) + (ncb2 * 23.0f)));
        float f52 = cos22 * f42;
        float f62 = f42 * sin2;
        float f72 = nbb2 * 460.0f;
        float f82 = ((288.0f * f62) + ((451.0f * f52) + f72)) / 1403.0f;
        float f92 = ((f72 - (891.0f * f52)) - (261.0f * f62)) / 1403.0f;
        float f102 = ((f72 - (f52 * 220.0f)) - (f62 * 6300.0f)) / 1403.0f;
        float fl4 = (100.0f / frame.getFl()) * Math.signum(f82) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f82) * 27.13f) / (400.0f - Math.abs(f82))), 2.3809523582458496d));
        float fl22 = (100.0f / frame.getFl()) * Math.signum(f92) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f92) * 27.13f) / (400.0f - Math.abs(f92))), 2.3809523582458496d));
        float fl32 = (100.0f / frame.getFl()) * Math.signum(f102) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f102) * 27.13f) / (400.0f - Math.abs(f102))), 2.3809523582458496d));
        float f112 = fl4 / frame.getRgbD()[0];
        float f122 = fl22 / frame.getRgbD()[1];
        float f132 = fl32 / frame.getRgbD()[2];
        float[][] cam16rgb_to_xyz2 = CamUtils.INSTANCE.getCAM16RGB_TO_XYZ();
        float[] fArr4 = cam16rgb_to_xyz2[0];
        float f142 = (fArr4[2] * f132) + (fArr4[1] * f122) + (fArr4[0] * f112);
        float[] fArr22 = cam16rgb_to_xyz2[1];
        float f152 = (fArr22[2] * f132) + (fArr22[1] * f122) + (fArr22[0] * f112);
        float[] fArr32 = cam16rgb_to_xyz2[2];
        return fj.a(f142, f152, (f132 * fArr32[2]) + (f122 * fArr32[1]) + (f112 * fArr32[0]));
    }

    public final int viewedInSrgb() {
        return viewed(Frame.Companion.getDefault());
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private final Cam findCamByJ(float f, float f2, float f3) {
            float f4 = 100.0f;
            float f5 = 1000.0f;
            float f6 = 0.0f;
            Cam cam = null;
            float f7 = 1000.0f;
            while (Math.abs(f6 - f4) > 0.009999999776482582d) {
                float f8 = ((f4 - f6) / 2.0f) + f6;
                int viewedInSrgb = fromJch(f8, f2, f).viewedInSrgb();
                float lstarFromInt = CamUtils.INSTANCE.lstarFromInt(viewedInSrgb);
                float abs = (float) Math.abs(f3 - lstarFromInt);
                if (abs < 0.2f) {
                    Cam fromInt = fromInt(viewedInSrgb);
                    float distance = fromInt.distance(fromJch(fromInt.getJ(), fromInt.getChroma(), f));
                    if (distance <= 1.0f) {
                        cam = fromInt;
                        f5 = abs;
                        f7 = distance;
                    }
                }
                if (f5 == 0.0f && f7 == 0.0f) {
                    return cam;
                }
                if (lstarFromInt < f3) {
                    f6 = f8;
                } else {
                    f4 = f8;
                }
            }
            return cam;
        }

        private final Cam fromIntInFrame(int i, Frame frame) {
            CamUtils camUtils = CamUtils.INSTANCE;
            float[] xyzFromInt = camUtils.xyzFromInt(i);
            float[][] xyz_to_cam16rgb = camUtils.getXYZ_TO_CAM16RGB();
            float f = xyzFromInt[0];
            float[] fArr = xyz_to_cam16rgb[0];
            float f2 = fArr[0] * f;
            float f3 = xyzFromInt[1];
            float f4 = (fArr[1] * f3) + f2;
            float f5 = xyzFromInt[2];
            float f6 = (fArr[2] * f5) + f4;
            float[] fArr2 = xyz_to_cam16rgb[1];
            float f7 = (fArr2[2] * f5) + (fArr2[1] * f3) + (fArr2[0] * f);
            float[] fArr3 = xyz_to_cam16rgb[2];
            float f8 = (f5 * fArr3[2]) + (f3 * fArr3[1]) + (f * fArr3[0]);
            float f9 = frame.getRgbD()[0] * f6;
            float f10 = frame.getRgbD()[1] * f7;
            float f11 = frame.getRgbD()[2] * f8;
            float pow = (float) Math.pow((Math.abs(f9) * frame.getFl()) / 100.0f, 0.41999998688697815d);
            float pow2 = (float) Math.pow((Math.abs(f10) * frame.getFl()) / 100.0f, 0.41999998688697815d);
            float pow3 = (float) Math.pow((Math.abs(f11) * frame.getFl()) / 100.0f, 0.41999998688697815d);
            float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
            float signum2 = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
            float signum3 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
            float f12 = ((((-12.0f) * signum2) + (signum * 11.0f)) + signum3) / 11.0f;
            float f13 = ((signum + signum2) - (signum3 * 2.0f)) / 9.0f;
            float f14 = signum2 * 20.0f;
            float f15 = ((21.0f * signum3) + ((signum * 20.0f) + f14)) / 20.0f;
            float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
            float atan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
            if (atan2 < 0.0f) {
                atan2 += 360.0f;
            } else if (atan2 >= 360.0f) {
                atan2 -= 360.0f;
            }
            float f17 = atan2;
            float f18 = (f17 * 3.1415927f) / 180.0f;
            float pow4 = ((float) Math.pow((frame.getNbb() * f16) / frame.getAw(), frame.getZ() * frame.getC())) * 100.0f;
            float pow5 = ((float) Math.pow(((frame.getNcb() * (frame.getNc() * (((((float) Math.cos((((((double) f17) < 20.14d ? 360.0f + f17 : f17) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f))) * ((float) Math.sqrt((f13 * f13) + (f12 * f12)))) / (f15 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, frame.getN())), 0.7300000190734863d)) * ((float) Math.sqrt(pow4 / 100.0f));
            float flRoot = frame.getFlRoot() * pow5;
            float sqrt = ((float) Math.sqrt((frame.getC() * r0) / (frame.getAw() + 4.0f))) * 50.0f;
            float f19 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
            float log = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
            double d = f18;
            return new Cam(f17, pow5, pow4, flRoot, sqrt, f19, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
        }

        private final Cam fromJch(float f, float f2, float f3) {
            return fromJchInFrame(f, f2, f3, Frame.Companion.getDefault());
        }

        private final Cam fromJchInFrame(float f, float f2, float f3, Frame frame) {
            float flRoot = frame.getFlRoot() * f2;
            float sqrt = ((float) Math.sqrt((frame.getC() * (f2 / ((float) Math.sqrt(f / 100.0d)))) / (frame.getAw() + 4.0f))) * 50.0f;
            float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
            float log = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
            double d = (3.1415927f * f3) / 180.0f;
            return new Cam(f3, f2, f, flRoot, sqrt, f4, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
        }

        private final int getInt(float f, float f2, float f3, Frame frame) {
            if (q10.b(frame, Frame.Companion.getDefault())) {
                return HctSolver.INSTANCE.solveToInt(f, f2, f3);
            }
            if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
                return CamUtils.INSTANCE.intFromLstar(f3);
            }
            float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
            Cam cam = null;
            boolean z = true;
            float f4 = 0.0f;
            float f5 = f2;
            while (Math.abs(f4 - f2) >= 0.4000000059604645d) {
                Cam findCamByJ = findCamByJ(min, f5, f3);
                if (!z) {
                    if (findCamByJ == null) {
                        f2 = f5;
                    } else {
                        f4 = f5;
                        cam = findCamByJ;
                    }
                    f5 = ((f2 - f4) / 2.0f) + f4;
                } else {
                    if (findCamByJ != null) {
                        return findCamByJ.viewed(frame);
                    }
                    f5 = ((f2 - f4) / 2.0f) + f4;
                    z = false;
                }
            }
            return cam == null ? CamUtils.INSTANCE.intFromLstar(f3) : cam.viewed(frame);
        }

        public final Cam fromInt(int i) {
            return fromIntInFrame(i, Frame.Companion.getDefault());
        }

        private Companion() {
        }

        public final int getInt(float f, float f2, float f3) {
            return getInt(f, f2, f3, Frame.Companion.getDefault());
        }
    }
}
