package androidx.compose.foundation.text.selection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionRegistrarImplKt {
    /* renamed from: inARow-zwwh4xc, reason: not valid java name */
    public static final boolean m1543inARowzwwh4xc(long j, long j2, long j3, long j4) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i) - Float.intBitsToFloat(i2);
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i3) - Float.intBitsToFloat(i4);
        int i5 = (int) (j4 & 4294967295L);
        int i6 = (int) (4294967295L & j3);
        float intBitsToFloat3 = Float.intBitsToFloat(i5) - Float.intBitsToFloat(i6);
        int i7 = (int) (j4 >> 32);
        int i8 = (int) (j3 >> 32);
        float intBitsToFloat4 = Float.intBitsToFloat(i7) - Float.intBitsToFloat(i8);
        float max = Math.max(0.0f, Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i5)) - Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i6)));
        float max2 = Math.max(0.0f, Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i7)) - Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i8)));
        return ((max > (intBitsToFloat * 0.5f) ? 1 : (max == (intBitsToFloat * 0.5f) ? 0 : -1)) >= 0 || (max > (intBitsToFloat3 * 0.5f) ? 1 : (max == (intBitsToFloat3 * 0.5f) ? 0 : -1)) >= 0) && ((max2 > (intBitsToFloat2 * 0.5f) ? 1 : (max2 == (intBitsToFloat2 * 0.5f) ? 0 : -1)) < 0 && (max2 > (intBitsToFloat4 * 0.5f) ? 1 : (max2 == (intBitsToFloat4 * 0.5f) ? 0 : -1)) < 0);
    }
}
