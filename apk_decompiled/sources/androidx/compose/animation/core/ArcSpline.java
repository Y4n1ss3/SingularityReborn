package androidx.compose.animation.core;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArcSpline {
    public static final int $stable = 8;
    private final Arc[][] arcs;
    private final boolean isExtrapolate = true;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Arc {
        public static final int $stable = 8;
        private float arcDistance;
        private final float arcVelocity;
        public final float ellipseA;
        public final float ellipseB;
        public final float ellipseCenterX;
        public final float ellipseCenterY;
        public final boolean isLinear;
        private final float[] lut;
        private final float oneOverDeltaTime;
        private final float time1;
        private final float time2;
        private float tmpCosAngle;
        private float tmpSinAngle;
        private final float vertical;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public Arc(int i, float f, float f2, float f3, float f4, float f5, float f6) {
            this.time1 = f;
            this.time2 = f2;
            this.x1 = f3;
            this.y1 = f4;
            this.x2 = f5;
            this.y2 = f6;
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            boolean z = true;
            boolean z2 = i == 1 || (i == 4 ? f8 > 0.0f : !(i != 5 || f8 >= 0.0f));
            float f9 = z2 ? -1.0f : 1.0f;
            this.vertical = f9;
            float f10 = 1.0f / (f2 - f);
            this.oneOverDeltaTime = f10;
            this.lut = new float[101];
            boolean z3 = i == 3;
            if (z3 || Math.abs(f7) < 0.001f || Math.abs(f8) < 0.001f) {
                float hypot = (float) Math.hypot(f8, f7);
                this.arcDistance = hypot;
                this.arcVelocity = hypot * f10;
                this.ellipseCenterX = f7 * f10;
                this.ellipseCenterY = f8 * f10;
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.ellipseA = f7 * f9;
                this.ellipseB = f8 * (-f9);
                this.ellipseCenterX = z2 ? f5 : f3;
                this.ellipseCenterY = z2 ? f4 : f6;
                buildTable$animation_core(f3, f4, f5, f6);
                this.arcVelocity = this.arcDistance * f10;
                z = z3;
            }
            this.isLinear = z;
        }

        private final float calcAngle(float f) {
            return lookup((this.vertical == -1.0f ? this.time2 - f : f - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
        }

        private final float lookup(float f) {
            if (f <= 0.0f) {
                return 0.0f;
            }
            if (f >= 1.0f) {
                return 1.0f;
            }
            float f2 = f * 100.0f;
            int i = (int) f2;
            float f3 = f2 - i;
            float[] fArr = this.lut;
            float f4 = fArr[i];
            return ((fArr[i + 1] - f4) * f3) + f4;
        }

        public final void buildTable$animation_core(float f, float f2, float f3, float f4) {
            float[] fArr;
            float f5;
            float f6;
            float f7 = f3 - f;
            float f8 = f2 - f4;
            fArr = ArcSplineKt.OurPercentCache;
            int length = fArr.length - 1;
            float f9 = length;
            float[] fArr2 = this.lut;
            if (1 <= length) {
                float f10 = f8;
                int i = 1;
                f6 = 0.0f;
                float f11 = 0.0f;
                while (true) {
                    f5 = f9;
                    double radians = (float) Math.toRadians((i * 90.0d) / length);
                    float sin = ((float) Math.sin(radians)) * f7;
                    float cos = ((float) Math.cos(radians)) * f8;
                    f6 += (float) Math.hypot(sin - f11, cos - f10);
                    fArr[i] = f6;
                    if (i == length) {
                        break;
                    }
                    i++;
                    f9 = f5;
                    f10 = cos;
                    f11 = sin;
                }
            } else {
                f5 = f9;
                f6 = 0.0f;
            }
            this.arcDistance = f6;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    fArr[i2] = fArr[i2] / f6;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float f12 = i3 / 100.0f;
                int binarySearch = Arrays.binarySearch(fArr, 0, fArr.length, f12);
                if (binarySearch >= 0) {
                    fArr2[i3] = binarySearch / f5;
                } else if (binarySearch == -1) {
                    fArr2[i3] = 0.0f;
                } else {
                    int i4 = -binarySearch;
                    int i5 = i4 - 2;
                    float f13 = i5;
                    float f14 = fArr[i5];
                    fArr2[i3] = (((f12 - f14) / (fArr[i4 - 1] - f14)) + f13) / f5;
                }
            }
        }

        public final float calcDX() {
            float f = this.ellipseA * this.tmpCosAngle;
            return f * this.vertical * (this.arcVelocity / ((float) Math.hypot(f, (-this.ellipseB) * this.tmpSinAngle)));
        }

        public final float calcDY() {
            float f = this.ellipseA * this.tmpCosAngle;
            float f2 = (-this.ellipseB) * this.tmpSinAngle;
            return f2 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f, f2)));
        }

        public final float calcX() {
            return (this.tmpSinAngle * this.ellipseA) + this.ellipseCenterX;
        }

        public final float calcY() {
            return (this.tmpCosAngle * this.ellipseB) + this.ellipseCenterY;
        }

        public final float getLinearDX$animation_core() {
            return this.ellipseCenterX;
        }

        public final float getLinearDY$animation_core() {
            return this.ellipseCenterY;
        }

        public final float getLinearX(float f) {
            float f2 = (f - this.time1) * this.oneOverDeltaTime;
            float f3 = this.x1;
            return ((this.x2 - f3) * f2) + f3;
        }

        public final float getLinearY(float f) {
            float f2 = (f - this.time1) * this.oneOverDeltaTime;
            float f3 = this.y1;
            return ((this.y2 - f3) * f2) + f3;
        }

        public final float getTime1() {
            return this.time1;
        }

        public final float getTime2() {
            return this.time2;
        }

        public final void setPoint(float f) {
            double lookup = lookup((this.vertical == -1.0f ? this.time2 - f : f - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(lookup);
            this.tmpCosAngle = (float) Math.cos(lookup);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r7 == r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[LOOP:1: B:14:0x0045->B:15:0x0047, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArcSpline(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length;
        int i2;
        int i3 = 1;
        int length2 = fArr.length - 1;
        Arc[][] arcArr = new Arc[length2][];
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i6 < length2) {
            int i7 = iArr[i6];
            int i8 = 3;
            if (i7 != 0) {
                if (i7 != i3) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            i8 = 4;
                            if (i7 != 4) {
                                i8 = 5;
                                if (i7 != 5) {
                                    i = i5;
                                    float[] fArr3 = fArr2[i6];
                                    int i9 = i6 + 1;
                                    float[] fArr4 = fArr2[i9];
                                    float f = fArr[i6];
                                    float f2 = fArr[i9];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    Arc[] arcArr2 = new Arc[length];
                                    i2 = 0;
                                    while (i2 < length) {
                                        int i10 = i2 * 2;
                                        int i11 = i2;
                                        int i12 = i10 + 1;
                                        arcArr2[i11] = new Arc(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                                        i2 = i11 + 1;
                                    }
                                    arcArr[i6] = arcArr2;
                                    i6 = i9;
                                    i5 = i;
                                    i3 = 1;
                                }
                            }
                        }
                    }
                    i4 = 2;
                    i = i4;
                    float[] fArr32 = fArr2[i6];
                    int i92 = i6 + 1;
                    float[] fArr42 = fArr2[i92];
                    float f3 = fArr[i6];
                    float f22 = fArr[i92];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    Arc[] arcArr22 = new Arc[length];
                    i2 = 0;
                    while (i2 < length) {
                    }
                    arcArr[i6] = arcArr22;
                    i6 = i92;
                    i5 = i;
                    i3 = 1;
                }
                i4 = i3;
                i = i4;
                float[] fArr322 = fArr2[i6];
                int i922 = i6 + 1;
                float[] fArr422 = fArr2[i922];
                float f32 = fArr[i6];
                float f222 = fArr[i922];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                Arc[] arcArr222 = new Arc[length];
                i2 = 0;
                while (i2 < length) {
                }
                arcArr[i6] = arcArr222;
                i6 = i922;
                i5 = i;
                i3 = 1;
            }
            i = i8;
            float[] fArr3222 = fArr2[i6];
            int i9222 = i6 + 1;
            float[] fArr4222 = fArr2[i9222];
            float f322 = fArr[i6];
            float f2222 = fArr[i9222];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            Arc[] arcArr2222 = new Arc[length];
            i2 = 0;
            while (i2 < length) {
            }
            arcArr[i6] = arcArr2222;
            i6 = i9222;
            i5 = i;
            i3 = 1;
        }
        this.arcs = arcArr;
    }

    public final void getPos(float f, float[] fArr) {
        Arc[][] arcArr = this.arcs;
        int length = arcArr.length - 1;
        int i = 0;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[length][0].getTime2();
        int length2 = fArr.length;
        if (!this.isExtrapolate) {
            f = Math.min(Math.max(f, time1), time2);
        } else if (f < time1 || f > time2) {
            if (f > time2) {
                time1 = time2;
            } else {
                length = 0;
            }
            float f2 = f - time1;
            int i2 = 0;
            while (i < length2 - 1) {
                Arc arc = arcArr[length][i2];
                if (arc.isLinear) {
                    fArr[i] = (arc.ellipseCenterX * f2) + arc.getLinearX(time1);
                    fArr[i + 1] = (arc.ellipseCenterY * f2) + arc.getLinearY(time1);
                } else {
                    arc.setPoint(time1);
                    fArr[i] = (arc.calcDX() * f2) + (arc.tmpSinAngle * arc.ellipseA) + arc.ellipseCenterX;
                    fArr[i + 1] = (arc.calcDY() * f2) + (arc.tmpCosAngle * arc.ellipseB) + arc.ellipseCenterY;
                }
                i += 2;
                i2++;
            }
            return;
        }
        boolean z = false;
        for (Arc[] arcArr2 : arcArr) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < length2 - 1) {
                Arc arc2 = arcArr2[i4];
                if (f <= arc2.getTime2()) {
                    if (arc2.isLinear) {
                        fArr[i3] = arc2.getLinearX(f);
                        fArr[i3 + 1] = arc2.getLinearY(f);
                    } else {
                        arc2.setPoint(f);
                        fArr[i3] = (arc2.tmpSinAngle * arc2.ellipseA) + arc2.ellipseCenterX;
                        fArr[i3 + 1] = (arc2.tmpCosAngle * arc2.ellipseB) + arc2.ellipseCenterY;
                    }
                    z = true;
                }
                i3 += 2;
                i4++;
            }
            if (z) {
                return;
            }
        }
    }

    public final void getSlope(float f, float[] fArr) {
        Arc[][] arcArr = this.arcs;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[arcArr.length - 1][0].getTime2();
        if (f < time1) {
            f = time1;
        }
        if (f <= time2) {
            time2 = f;
        }
        int length = fArr.length;
        boolean z = false;
        for (Arc[] arcArr2 : arcArr) {
            int i = 0;
            int i2 = 0;
            while (i < length - 1) {
                Arc arc = arcArr2[i2];
                if (time2 <= arc.getTime2()) {
                    if (arc.isLinear) {
                        fArr[i] = arc.ellipseCenterX;
                        fArr[i + 1] = arc.ellipseCenterY;
                    } else {
                        arc.setPoint(time2);
                        fArr[i] = arc.calcDX();
                        fArr[i + 1] = arc.calcDY();
                    }
                    z = true;
                }
                i += 2;
                i2++;
            }
            if (z) {
                return;
            }
        }
    }
}
