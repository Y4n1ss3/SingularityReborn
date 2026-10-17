package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShapeKt {
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f, float f2, float f3, float f4) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f), CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return AbsoluteRoundedCornerShape(f, f2, f3, f4);
    }

    /* renamed from: AbsoluteRoundedCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m1044AbsoluteRoundedCornerShape0680j_4(float f) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.m1048CornerSize0680j_4(f));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m1045AbsoluteRoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.m1048CornerSize0680j_4(f), CornerSizeKt.m1048CornerSize0680j_4(f2), CornerSizeKt.m1048CornerSize0680j_4(f3), CornerSizeKt.m1048CornerSize0680j_4(f4));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteRoundedCornerShape m1046AbsoluteRoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m7611constructorimpl(0.0f);
        }
        return m1045AbsoluteRoundedCornerShapea9UjIt4(f, f2, f3, f4);
    }

    public static final AbsoluteRoundedCornerShape lerp(AbsoluteRoundedCornerShape absoluteRoundedCornerShape, AbsoluteRoundedCornerShape absoluteRoundedCornerShape2, float f) {
        return new AbsoluteRoundedCornerShape(RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getTopStart(), absoluteRoundedCornerShape2.getTopStart(), f), RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getTopEnd(), absoluteRoundedCornerShape2.getTopEnd(), f), RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getBottomEnd(), absoluteRoundedCornerShape2.getBottomEnd(), f), RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getBottomStart(), absoluteRoundedCornerShape2.getBottomStart(), f));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(CornerSize cornerSize) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i, int i2, int i3, int i4) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i), CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return AbsoluteRoundedCornerShape(i, i2, i3, i4);
    }
}
