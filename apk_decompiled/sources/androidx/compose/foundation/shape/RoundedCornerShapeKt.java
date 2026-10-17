package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoundedCornerShapeKt {
    private static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    public static final RoundedCornerShape RoundedCornerShape(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(f), CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return RoundedCornerShape(f, f2, f3, f4);
    }

    /* renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final RoundedCornerShape m1056RoundedCornerShape0680j_4(float f) {
        return RoundedCornerShape(CornerSizeKt.m1048CornerSize0680j_4(f));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final RoundedCornerShape m1057RoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(CornerSizeKt.m1048CornerSize0680j_4(f), CornerSizeKt.m1048CornerSize0680j_4(f2), CornerSizeKt.m1048CornerSize0680j_4(f3), CornerSizeKt.m1048CornerSize0680j_4(f4));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ RoundedCornerShape m1058RoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return m1057RoundedCornerShapea9UjIt4(f, f2, f3, f4);
    }

    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    public static final RoundedCornerShape lerp(RoundedCornerShape roundedCornerShape, RoundedCornerShape roundedCornerShape2, float f) {
        return new RoundedCornerShape(lerp(roundedCornerShape.getTopStart(), roundedCornerShape2.getTopStart(), f), lerp(roundedCornerShape.getTopEnd(), roundedCornerShape2.getTopEnd(), f), lerp(roundedCornerShape.getBottomEnd(), roundedCornerShape2.getBottomEnd(), f), lerp(roundedCornerShape.getBottomStart(), roundedCornerShape2.getBottomStart(), f));
    }

    public static final RoundedCornerShape RoundedCornerShape(float f) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(f));
    }

    public static final RoundedCornerShape RoundedCornerShape(int i) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i));
    }

    public static final RoundedCornerShape RoundedCornerShape(CornerSize cornerSize) {
        return new RoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static final RoundedCornerShape RoundedCornerShape(int i, int i2, int i3, int i4) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(i), CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
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
        return RoundedCornerShape(i, i2, i3, i4);
    }

    public static final CornerSize lerp(final CornerSize cornerSize, final CornerSize cornerSize2, final float f) {
        return new CornerSize() { // from class: androidx.compose.foundation.shape.RoundedCornerShapeKt$lerp$1
            @Override // androidx.compose.foundation.shape.CornerSize
            /* renamed from: toPx-TmRCtEA */
            public float mo1047toPxTmRCtEA(long j, Density density) {
                return MathHelpersKt.lerp(CornerSize.this.mo1047toPxTmRCtEA(j, density), cornerSize2.mo1047toPxTmRCtEA(j, density), f);
            }
        };
    }
}
