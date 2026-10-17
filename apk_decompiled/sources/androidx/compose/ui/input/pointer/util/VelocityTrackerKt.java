package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import defpackage.ac;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static boolean VelocityTrackerAddPointsFix = true;

    private static final float[][] Matrix(int i, int i2) {
        float[][] fArr = new float[i][];
        for (int i3 = 0; i3 < i; i3++) {
            fArr[i3] = new float[i2];
        }
        return fArr;
    }

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        m6210addPointerInputChange0AR0LA0(velocityTracker, pointerInputChange, Offset.Companion.m4532getZeroF1C5BW0());
    }

    /* renamed from: addPointerInputChange-0AR0LA0, reason: not valid java name */
    public static final void m6210addPointerInputChange0AR0LA0(VelocityTracker velocityTracker, PointerInputChange pointerInputChange, long j) {
        velocityTracker.getPlatformVelocityTracker$ui().mo6197addPointerInputChangeUv8p0NA(pointerInputChange, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i, boolean z) {
        int i2 = i - 1;
        float f = fArr2[i2];
        float f2 = 0.0f;
        int i3 = i2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            float f3 = fArr2[i4];
            if (f != f3) {
                float f4 = (z ? -fArr[i4] : fArr[i3] - fArr[i4]) / (f - f3);
                float abs = (Math.abs(f4) * (f4 - (Math.signum(f2) * ((float) Math.sqrt(Math.abs(f2) * 2.0f))))) + f2;
                if (i3 == i2) {
                    abs *= 0.5f;
                }
                f2 = abs;
            }
            i3--;
            f = f3;
        }
        return Math.signum(f2) * ((float) Math.sqrt(Math.abs(f2) * 2.0f));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    private static final float get(float[][] fArr, int i, int i2) {
        return fArr[i][i2];
    }

    public static final boolean getVelocityTrackerAddPointsFix() {
        return VelocityTrackerAddPointsFix;
    }

    private static final float kineticEnergyToVelocity(float f) {
        return Math.signum(f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    public static final float[] polyFitLeastSquares(float[] fArr, float[] fArr2, int i, int i2, float[] fArr3) {
        int i3 = i2;
        if (i3 < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        if (i3 >= i) {
            i3 = i - 1;
        }
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i];
        }
        for (int i6 = 0; i6 < i; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            ac.N(fArr4[i10], fArr7, 0, 0, i);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr8 = fArr5[i11];
                float dot = dot(fArr7, fArr8);
                for (int i12 = 0; i12 < i; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr8[i12] * dot);
                }
            }
            float sqrt = (float) Math.sqrt(dot(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i13 = 0; i13 < i; i13++) {
                fArr7[i13] = fArr7[i13] * f;
            }
            float[] fArr9 = fArr6[i10];
            int i14 = 0;
            while (i14 < i4) {
                fArr9[i14] = i14 < i10 ? 0.0f : dot(fArr7, fArr4[i14]);
                i14++;
            }
            i10++;
        }
        for (int i15 = i3; -1 < i15; i15--) {
            float dot2 = dot(fArr5[i15], fArr2);
            float[] fArr10 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    dot2 -= fArr10[i17] * fArr3[i17];
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            fArr3[i15] = dot2 / fArr10[i15];
        }
        return fArr3;
    }

    public static float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i, int i2, float[] fArr3, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            int i4 = i2 + 1;
            if (i4 < 0) {
                i4 = 0;
            }
            fArr3 = new float[i4];
        }
        return polyFitLeastSquares(fArr, fArr2, i, i2, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i, long j, float f) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i] = new DataPointAtTime(j, f);
        } else {
            dataPointAtTime.setTime(j);
            dataPointAtTime.setDataPoint(f);
        }
    }

    public static final void setVelocityTrackerAddPointsFix(boolean z) {
        VelocityTrackerAddPointsFix = z;
    }

    private static final void set(float[][] fArr, int i, int i2, float f) {
        fArr[i][i2] = f;
    }

    public static /* synthetic */ void getVelocityTrackerAddPointsFix$annotations() {
    }
}
