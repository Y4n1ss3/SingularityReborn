package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ColorMatrixKt {
    /* renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m4841dotMe4OoYI(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 5;
        return (fArr[i3 + 3] * fArr2[15 + i2]) + (fArr[i3 + 2] * fArr2[10 + i2]) + (fArr[i3 + 1] * fArr2[5 + i2]) + (fArr[i3] * fArr2[i2]);
    }
}
