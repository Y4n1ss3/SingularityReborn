package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RectKt {
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m4554Rect0a9Yr6o(long j, long j2) {
        return new Rect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m4555Rect3MmeM6k(long j, float f) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new Rect(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m4556Recttz77jQw(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new Rect(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final Rect lerp(Rect rect, Rect rect2, float f) {
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f));
    }
}
