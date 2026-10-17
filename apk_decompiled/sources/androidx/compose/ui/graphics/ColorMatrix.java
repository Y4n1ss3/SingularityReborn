package androidx.compose.ui.graphics;

import defpackage.dq;
import defpackage.my;
import defpackage.q10;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorMatrix {
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m4816boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m4818constructorimpl$default(float[] fArr, int i, dq dqVar) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m4817constructorimpl(fArr);
    }

    /* renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m4819convertRgbToYuvimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m4820convertYuvToRgbimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4821equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && q10.b(fArr, ((ColorMatrix) obj).m4836unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4822equalsimpl0(float[] fArr, float[] fArr2) {
        return q10.b(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m4823getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4824hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m4825resetimpl(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
    }

    /* renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m4826rotateInternalimpl(float[] fArr, float f, my myVar) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) Math.floor(r8 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float floor2 = f2 - ((float) Math.floor(0.5f + f2));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f4 = 1.0f - abs2;
        myVar.invoke(Float.valueOf(((floor * 8.0f) * f3) / (1.25f - (abs * f3))), Float.valueOf(((floor2 * 8.0f) * f4) / (1.25f - (abs2 * f4))));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m4827setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    /* renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m4828setjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 20 && fArr2.length >= 20) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
            fArr[8] = fArr2[8];
            fArr[9] = fArr2[9];
            fArr[10] = fArr2[10];
            fArr[11] = fArr2[11];
            fArr[12] = fArr2[12];
            fArr[13] = fArr2[13];
            fArr[14] = fArr2[14];
            fArr[15] = fArr2[15];
            fArr[16] = fArr2[16];
            fArr[17] = fArr2[17];
            fArr[18] = fArr2[18];
            fArr[19] = fArr2[19];
        }
    }

    /* renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m4829setToRotateBlueimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) Math.floor(r3 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float f4 = ((floor * 8.0f) * f3) / (1.25f - (abs * f3));
        float floor2 = f2 - ((float) Math.floor(0.5f + f2));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f5 = 1.0f - abs2;
        float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (abs2 * f5));
        fArr[0] = f4;
        fArr[1] = f6;
        fArr[5] = -f6;
        fArr[6] = f4;
    }

    /* renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m4830setToRotateGreenimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) Math.floor(r3 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float f4 = ((floor * 8.0f) * f3) / (1.25f - (abs * f3));
        float floor2 = f2 - ((float) Math.floor(0.5f + f2));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f5 = 1.0f - abs2;
        float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (abs2 * f5));
        fArr[0] = f4;
        fArr[2] = -f6;
        fArr[10] = f6;
        fArr[12] = f4;
    }

    /* renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m4831setToRotateRedimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) Math.floor(r2 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float f4 = ((floor * 8.0f) * f3) / (1.25f - (abs * f3));
        float floor2 = f2 - ((float) Math.floor(0.5f + f2));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f5 = 1.0f - abs2;
        float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (abs2 * f5));
        fArr[6] = f4;
        fArr[7] = f6;
        fArr[11] = -f6;
        fArr[12] = f4;
    }

    /* renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m4832setToSaturationimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = 1.0f - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    /* renamed from: setToScale-impl, reason: not valid java name */
    public static final void m4833setToScaleimpl(float[] fArr, float f, float f2, float f3, float f4) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    /* renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m4834timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length < 20) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[5];
        float f5 = fArr[2];
        float f6 = fArr2[10];
        float f7 = f5 * f6;
        float f8 = fArr[3];
        float f9 = fArr2[15];
        float f10 = f8 * f9;
        float f11 = f10 + f7 + (f3 * f4) + (f * f2);
        float f12 = fArr2[1];
        float f13 = fArr2[6];
        float f14 = fArr2[11];
        float f15 = f5 * f14;
        float f16 = fArr2[16];
        float f17 = f8 * f16;
        float f18 = f17 + f15 + (f3 * f13) + (f * f12);
        float f19 = fArr2[2];
        float f20 = fArr2[7];
        float f21 = fArr2[12];
        float f22 = f5 * f21;
        float f23 = fArr2[17];
        float f24 = f8 * f23;
        float f25 = f24 + f22 + (f3 * f20) + (f * f19);
        float f26 = fArr2[3];
        float f27 = fArr2[8];
        float f28 = fArr2[13];
        float f29 = f5 * f28;
        float f30 = fArr2[18];
        float f31 = f8 * f30;
        float f32 = f31 + f29 + (f3 * f27) + (f * f26);
        float f33 = fArr2[4];
        float f34 = fArr2[9];
        float f35 = fArr2[14];
        float f36 = f5 * f35;
        float f37 = fArr2[19];
        float f38 = f8 * f37;
        float f39 = f38 + f36 + (f3 * f34) + (f * f33) + fArr[4];
        float f40 = fArr[5];
        float f41 = fArr[6];
        float f42 = fArr[7];
        float f43 = (f42 * f6) + (f41 * f4) + (f40 * f2);
        float f44 = fArr[8];
        float f45 = (f44 * f9) + f43;
        float f46 = (f44 * f16) + (f42 * f14) + (f41 * f13) + (f40 * f12);
        float f47 = (f44 * f23) + (f42 * f21) + (f41 * f20) + (f40 * f19);
        float f48 = (f44 * f30) + (f42 * f28) + (f41 * f27) + (f40 * f26);
        float f49 = f42 * f35;
        float f50 = f44 * f37;
        float f51 = f50 + f49 + (f41 * f34) + (f40 * f33) + fArr[9];
        float f52 = fArr[10];
        float f53 = fArr[11];
        float f54 = fArr[12];
        float f55 = (f54 * f6) + (f53 * f4) + (f52 * f2);
        float f56 = fArr[13];
        float f57 = (f56 * f9) + f55;
        float f58 = (f56 * f16) + (f54 * f14) + (f53 * f13) + (f52 * f12);
        float f59 = (f56 * f23) + (f54 * f21) + (f53 * f20) + (f52 * f19);
        float f60 = (f56 * f30) + (f54 * f28) + (f53 * f27) + (f52 * f26);
        float f61 = f54 * f35;
        float f62 = f56 * f37;
        float f63 = f62 + f61 + (f53 * f34) + (f52 * f33) + fArr[14];
        float f64 = fArr[15];
        float f65 = fArr[16];
        float f66 = (f4 * f65) + (f2 * f64);
        float f67 = fArr[17];
        float f68 = (f6 * f67) + f66;
        float f69 = fArr[18];
        float f70 = (f9 * f69) + f68;
        float f71 = f14 * f67;
        float f72 = f16 * f69;
        float f73 = f72 + f71 + (f13 * f65) + (f12 * f64);
        float f74 = f21 * f67;
        float f75 = f23 * f69;
        float f76 = f75 + f74 + (f20 * f65) + (f19 * f64);
        float f77 = f28 * f67;
        float f78 = f30 * f69;
        float f79 = f78 + f77 + (f27 * f65) + (f26 * f64);
        float f80 = f67 * f35;
        float f81 = f69 * f37;
        float f82 = f81 + f80 + (f65 * f34) + (f64 * f33) + fArr[19];
        fArr[0] = f11;
        fArr[1] = f18;
        fArr[2] = f25;
        fArr[3] = f32;
        fArr[4] = f39;
        fArr[5] = f45;
        fArr[6] = f46;
        fArr[7] = f47;
        fArr[8] = f48;
        fArr[9] = f51;
        fArr[10] = f57;
        fArr[11] = f58;
        fArr[12] = f59;
        fArr[13] = f60;
        fArr[14] = f63;
        fArr[15] = f70;
        fArr[16] = f73;
        fArr[17] = f76;
        fArr[18] = f79;
        fArr[19] = f82;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4835toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m4821equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m4824hashCodeimpl(this.values);
    }

    public String toString() {
        return m4835toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m4836unboximpl() {
        return this.values;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m4817constructorimpl(float[] fArr) {
        return fArr;
    }
}
