package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ColorMatrixFilterHelper {
    public static final ColorMatrixFilterHelper INSTANCE = new ColorMatrixFilterHelper();

    private ColorMatrixFilterHelper() {
    }

    /* renamed from: getColorMatrix-8unuwjk, reason: not valid java name */
    public final float[] m4840getColorMatrix8unuwjk(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return ColorMatrix.m4817constructorimpl(colorMatrix.getArray());
    }
}
