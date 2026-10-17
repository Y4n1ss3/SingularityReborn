package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CornerRadiusKt {
    public static final long CornerRadius(float f, float f2) {
        return CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: lerp-3Ry4LBc, reason: not valid java name */
    public static final long m4489lerp3Ry4LBc(long j, long j2, float f) {
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }
}
