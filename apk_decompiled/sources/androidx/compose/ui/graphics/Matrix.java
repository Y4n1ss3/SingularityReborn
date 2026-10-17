package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import defpackage.dq;
import defpackage.es0;
import defpackage.kp0;
import defpackage.q10;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Matrix {
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m5003boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m5005constructorimpl$default(float[] fArr, int i, dq dqVar) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m5004constructorimpl(fArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5006equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && q10.b(fArr, ((Matrix) obj).m5028unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5007equalsimpl0(float[] fArr, float[] fArr2) {
        return q10.b(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m5008getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 4) + i2];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5009hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl, reason: not valid java name */
    public static final void m5010invertimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 == 0.0f) {
            return;
        }
        float f30 = 1.0f / f29;
        fArr[0] = kp0.a(f8, f26, (f6 * f28) - (f7 * f27), f30);
        fArr[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
        fArr[2] = kp0.a(f16, f20, (f14 * f22) - (f15 * f21), f30);
        fArr[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
        fArr[5] = kp0.a(f4, f24, (f28 * f) - (f3 * f25), f30);
        float f32 = -f13;
        fArr[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
        fArr[7] = kp0.a(f12, f18, (f9 * f22) - (f11 * f19), f30);
        fArr[8] = kp0.a(f8, f23, (f5 * f27) - (f6 * f25), f30);
        fArr[9] = (((f2 * f25) + ((-f) * f27)) - (f4 * f23)) * f30;
        fArr[10] = kp0.a(f16, f17, (f13 * f21) - (f14 * f19), f30);
        fArr[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
        fArr[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
        fArr[13] = kp0.a(f3, f23, (f * f26) - (f2 * f24), f30);
        fArr[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
        fArr[15] = kp0.a(f11, f17, (f9 * f20) - (f10 * f18), f30);
    }

    /* renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m5011mapMKHz9U(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f6 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        float f11 = ((f5 * intBitsToFloat2) + (f2 * intBitsToFloat) + f8) * f10;
        return Offset.m4508constructorimpl((Float.floatToRawIntBits((((f4 * intBitsToFloat2) + (f * intBitsToFloat)) + f7) * f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final void m5013mapimpl(float[] fArr, MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f10 = f3 * left;
        float f11 = f6 * top;
        float f12 = 1.0f / ((f10 + f11) + f9);
        if ((Float.floatToRawIntBits(f12) & Integer.MAX_VALUE) >= 2139095040) {
            f12 = 0.0f;
        }
        float f13 = f * left;
        float f14 = f4 * top;
        float f15 = (f13 + f14 + f7) * f12;
        float f16 = left * f2;
        float f17 = top * f5;
        float f18 = (f16 + f17 + f8) * f12;
        float f19 = f6 * bottom;
        float f20 = 1.0f / ((f10 + f19) + f9);
        if ((Float.floatToRawIntBits(f20) & Integer.MAX_VALUE) >= 2139095040) {
            f20 = 0.0f;
        }
        float f21 = f4 * bottom;
        float f22 = (f13 + f21 + f7) * f20;
        float f23 = f5 * bottom;
        float f24 = (f16 + f23 + f8) * f20;
        float f25 = f3 * right;
        float f26 = 1.0f / ((f11 + f25) + f9);
        if ((Float.floatToRawIntBits(f26) & Integer.MAX_VALUE) >= 2139095040) {
            f26 = 0.0f;
        }
        float f27 = f * right;
        float f28 = (f27 + f14 + f7) * f26;
        float f29 = right * f2;
        float f30 = (f17 + f29 + f8) * f26;
        float f31 = 1.0f / ((f25 + f19) + f9);
        float f32 = (Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) < 2139095040 ? f31 : 0.0f;
        float f33 = (f27 + f21 + f7) * f32;
        float f34 = (f29 + f23 + f8) * f32;
        mutableRect.setLeft(Math.min(f15, Math.min(f22, Math.min(f28, f33))));
        mutableRect.setTop(Math.min(f18, Math.min(f24, Math.min(f30, f34))));
        mutableRect.setRight(Math.max(f15, Math.max(f22, Math.max(f28, f33))));
        mutableRect.setBottom(Math.max(f18, Math.max(f24, Math.max(f30, f34))));
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m5014resetimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl, reason: not valid java name */
    public static final void m5015resetToPivotedTransformimpl(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        double d = f6 * 0.017453292519943295d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f12 = -sin;
        float f13 = (f4 * cos) - (f5 * sin);
        float f14 = (f5 * cos) + (f4 * sin);
        double d2 = f7 * 0.017453292519943295d;
        float sin2 = (float) Math.sin(d2);
        float cos2 = (float) Math.cos(d2);
        float f15 = -sin2;
        float f16 = sin * sin2;
        float f17 = sin * cos2;
        float f18 = cos * sin2;
        float f19 = cos * cos2;
        float f20 = (f14 * sin2) + (f3 * cos2);
        float f21 = (f14 * cos2) + ((-f3) * sin2);
        double d3 = f8 * 0.017453292519943295d;
        float sin3 = (float) Math.sin(d3);
        float cos3 = (float) Math.cos(d3);
        float f22 = -sin3;
        float f23 = (cos3 * f16) + (f22 * cos2);
        float f24 = ((f16 * sin3) + (cos2 * cos3)) * f9;
        float f25 = sin3 * cos * f9;
        float f26 = ((sin3 * f17) + (cos3 * f15)) * f9;
        float f27 = f23 * f10;
        float f28 = cos * cos3 * f10;
        float f29 = ((cos3 * f17) + (f22 * f15)) * f10;
        float f30 = f18 * f11;
        float f31 = f12 * f11;
        float f32 = f19 * f11;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f24;
        fArr[1] = f25;
        fArr[2] = f26;
        fArr[3] = 0.0f;
        fArr[4] = f27;
        fArr[5] = f28;
        fArr[6] = f29;
        fArr[7] = 0.0f;
        fArr[8] = f30;
        fArr[9] = f31;
        fArr[10] = f32;
        fArr[11] = 0.0f;
        float f33 = -f;
        fArr[12] = ((f24 * f33) - (f27 * f2)) + f20 + f;
        fArr[13] = ((f25 * f33) - (f28 * f2)) + f13 + f2;
        fArr[14] = ((f33 * f26) - (f2 * f29)) + f21;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl$default, reason: not valid java name */
    public static /* synthetic */ void m5016resetToPivotedTransformimpl$default(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 16) != 0) {
            f5 = 0.0f;
        }
        if ((i & 32) != 0) {
            f6 = 0.0f;
        }
        if ((i & 64) != 0) {
            f7 = 0.0f;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            f8 = 0.0f;
        }
        if ((i & Fields.RotationX) != 0) {
            f9 = 1.0f;
        }
        if ((i & Fields.RotationY) != 0) {
            f10 = 1.0f;
        }
        if ((i & Fields.RotationZ) != 0) {
            f11 = 1.0f;
        }
        m5015resetToPivotedTransformimpl(fArr, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
    }

    /* renamed from: rotateX-impl, reason: not valid java name */
    public static final void m5017rotateXimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = f * 0.017453292519943295d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * cos) - (f3 * sin);
        fArr[2] = (f3 * cos) + (f2 * sin);
        fArr[5] = (f4 * cos) - (f5 * sin);
        fArr[6] = (f5 * cos) + (f4 * sin);
        fArr[9] = (f6 * cos) - (f7 * sin);
        fArr[10] = (f7 * cos) + (f6 * sin);
        fArr[13] = (f8 * cos) - (f9 * sin);
        fArr[14] = (f9 * cos) + (f8 * sin);
    }

    /* renamed from: rotateY-impl, reason: not valid java name */
    public static final void m5018rotateYimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = f * 0.017453292519943295d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[8];
        float f7 = fArr[10];
        float f8 = fArr[12];
        float f9 = fArr[14];
        fArr[0] = (f3 * sin) + (f2 * cos);
        fArr[2] = (f3 * cos) + ((-f2) * sin);
        fArr[4] = (f5 * sin) + (f4 * cos);
        fArr[6] = (f5 * cos) + ((-f4) * sin);
        fArr[8] = (f7 * sin) + (f6 * cos);
        fArr[10] = (f7 * cos) + ((-f6) * sin);
        fArr[12] = (f9 * sin) + (f8 * cos);
        fArr[14] = (f9 * cos) + ((-f8) * sin);
    }

    /* renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m5019rotateZimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = f * 0.017453292519943295d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = (sin * f3) + (cos * f2);
        float f5 = -sin;
        float f6 = fArr[1];
        float f7 = fArr[5];
        float f8 = (sin * f7) + (cos * f6);
        float f9 = fArr[2];
        float f10 = fArr[6];
        float f11 = (sin * f10) + (cos * f9);
        float f12 = fArr[3];
        float f13 = fArr[7];
        fArr[0] = f4;
        fArr[1] = f8;
        fArr[2] = f11;
        fArr[3] = (sin * f13) + (cos * f12);
        fArr[4] = (f3 * cos) + (f2 * f5);
        fArr[5] = (f7 * cos) + (f6 * f5);
        fArr[6] = (f10 * cos) + (f9 * f5);
        fArr[7] = (cos * f13) + (f5 * f12);
    }

    /* renamed from: scale-impl, reason: not valid java name */
    public static final void m5020scaleimpl(float[] fArr, float f, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m5021scaleimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        m5020scaleimpl(fArr, f, f2, f3);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m5022setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 4) + i2] = f;
    }

    /* renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m5023setFrom58bKbWc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
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
        }
    }

    /* renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m5024timesAssign58bKbWc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[1];
            float f4 = fArr2[4];
            float f5 = fArr[2];
            float f6 = fArr2[8];
            float f7 = f5 * f6;
            float f8 = fArr[3];
            float f9 = fArr2[12];
            float f10 = f8 * f9;
            float f11 = f10 + f7 + (f3 * f4) + (f * f2);
            float f12 = fArr2[1];
            float f13 = fArr2[5];
            float f14 = fArr2[9];
            float f15 = f5 * f14;
            float f16 = fArr2[13];
            float f17 = f8 * f16;
            float f18 = f17 + f15 + (f3 * f13) + (f * f12);
            float f19 = fArr2[2];
            float f20 = fArr2[6];
            float f21 = fArr2[10];
            float f22 = f5 * f21;
            float f23 = fArr2[14];
            float f24 = f8 * f23;
            float f25 = f24 + f22 + (f3 * f20) + (f * f19);
            float f26 = fArr2[3];
            float f27 = fArr2[7];
            float f28 = fArr2[11];
            float f29 = f5 * f28;
            float f30 = fArr2[15];
            float f31 = f8 * f30;
            float f32 = f31 + f29 + (f3 * f27) + (f * f26);
            float f33 = fArr[4];
            float f34 = fArr[5];
            float f35 = fArr[6];
            float f36 = (f35 * f6) + (f34 * f4) + (f33 * f2);
            float f37 = fArr[7];
            float f38 = (f37 * f9) + f36;
            float f39 = (f37 * f16) + (f35 * f14) + (f34 * f13) + (f33 * f12);
            float f40 = (f37 * f23) + (f35 * f21) + (f34 * f20) + (f33 * f19);
            float f41 = f35 * f28;
            float f42 = f37 * f30;
            float f43 = f42 + f41 + (f34 * f27) + (f33 * f26);
            float f44 = fArr[8];
            float f45 = fArr[9];
            float f46 = fArr[10];
            float f47 = (f46 * f6) + (f45 * f4) + (f44 * f2);
            float f48 = fArr[11];
            float f49 = (f48 * f9) + f47;
            float f50 = (f48 * f16) + (f46 * f14) + (f45 * f13) + (f44 * f12);
            float f51 = (f48 * f23) + (f46 * f21) + (f45 * f20) + (f44 * f19);
            float f52 = f46 * f28;
            float f53 = f48 * f30;
            float f54 = f53 + f52 + (f45 * f27) + (f44 * f26);
            float f55 = fArr[12];
            float f56 = fArr[13];
            float f57 = (f4 * f56) + (f2 * f55);
            float f58 = fArr[14];
            float f59 = (f6 * f58) + f57;
            float f60 = fArr[15];
            float f61 = (f9 * f60) + f59;
            float f62 = f14 * f58;
            float f63 = f16 * f60;
            float f64 = f63 + f62 + (f13 * f56) + (f12 * f55);
            float f65 = f21 * f58;
            float f66 = f23 * f60;
            float f67 = f66 + f65 + (f20 * f56) + (f19 * f55);
            float f68 = f58 * f28;
            float f69 = f60 * f30;
            fArr[0] = f11;
            fArr[1] = f18;
            fArr[2] = f25;
            fArr[3] = f32;
            fArr[4] = f38;
            fArr[5] = f39;
            fArr[6] = f40;
            fArr[7] = f43;
            fArr[8] = f49;
            fArr[9] = f50;
            fArr[10] = f51;
            fArr[11] = f54;
            fArr[12] = f61;
            fArr[13] = f64;
            fArr[14] = f67;
            fArr[15] = f69 + f68 + (f56 * f27) + (f55 * f26);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5025toStringimpl(float[] fArr) {
        return es0.W("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl, reason: not valid java name */
    public static final void m5026translateimpl(float[] fArr, float f, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        float f4 = (fArr[8] * f3) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f5 = (fArr[9] * f3) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f6 = (fArr[10] * f3) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f7 = (fArr[11] * f3) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    /* renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m5027translateimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m5026translateimpl(fArr, f, f2, f3);
    }

    public boolean equals(Object obj) {
        return m5006equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m5009hashCodeimpl(this.values);
    }

    public String toString() {
        return m5025toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m5028unboximpl() {
        return this.values;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m5004constructorimpl(float[] fArr) {
        return fArr;
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final Rect m5012mapimpl(float[] fArr, Rect rect) {
        if (fArr.length < 16) {
            return rect;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        float f10 = f3 * left;
        float f11 = f6 * top;
        float f12 = 1.0f / ((f10 + f11) + f9);
        if ((Float.floatToRawIntBits(f12) & Integer.MAX_VALUE) >= 2139095040) {
            f12 = 0.0f;
        }
        float f13 = f * left;
        float f14 = f4 * top;
        float f15 = (f13 + f14 + f7) * f12;
        float f16 = left * f2;
        float f17 = top * f5;
        float f18 = f12 * (f16 + f17 + f8);
        float f19 = f6 * bottom;
        float f20 = 1.0f / ((f10 + f19) + f9);
        if ((Float.floatToRawIntBits(f20) & Integer.MAX_VALUE) >= 2139095040) {
            f20 = 0.0f;
        }
        float f21 = f4 * bottom;
        float f22 = (f13 + f21 + f7) * f20;
        float f23 = f5 * bottom;
        float f24 = (f16 + f23 + f8) * f20;
        float f25 = f3 * right;
        float f26 = 1.0f / ((f11 + f25) + f9);
        if ((Float.floatToRawIntBits(f26) & Integer.MAX_VALUE) >= 2139095040) {
            f26 = 0.0f;
        }
        float f27 = f * right;
        float f28 = (f27 + f14 + f7) * f26;
        float f29 = right * f2;
        float f30 = (f17 + f29 + f8) * f26;
        float f31 = 1.0f / ((f25 + f19) + f9);
        float f32 = (Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) < 2139095040 ? f31 : 0.0f;
        float f33 = (f27 + f21 + f7) * f32;
        float f34 = (f29 + f23 + f8) * f32;
        return new Rect(Math.min(f15, Math.min(f22, Math.min(f28, f33))), Math.min(f18, Math.min(f24, Math.min(f30, f34))), Math.max(f15, Math.max(f22, Math.max(f28, f33))), Math.max(f18, Math.max(f24, Math.max(f30, f34))));
    }
}
