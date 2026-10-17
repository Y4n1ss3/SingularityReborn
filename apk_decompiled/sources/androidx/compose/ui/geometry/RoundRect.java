package androidx.compose.ui.geometry;

import androidx.compose.ui.graphics.Fields;
import defpackage.bv;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoundRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m4570RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m4488getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, dq dqVar) {
        this(f, f2, f3, f4, (i & 16) != 0 ? CornerRadius.Companion.m4488getZerokKHJgLs() : j, (i & 32) != 0 ? CornerRadius.Companion.m4488getZerokKHJgLs() : j2, (i & 64) != 0 ? CornerRadius.Companion.m4488getZerokKHJgLs() : j3, (i & Fields.SpotShadowColor) != 0 ? CornerRadius.Companion.m4488getZerokKHJgLs() : j4, null);
    }

    /* renamed from: copy-MDFrsts$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m4557copyMDFrsts$default(RoundRect roundRect, float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = roundRect.left;
        }
        if ((i & 2) != 0) {
            f2 = roundRect.top;
        }
        if ((i & 4) != 0) {
            f3 = roundRect.right;
        }
        if ((i & 8) != 0) {
            f4 = roundRect.bottom;
        }
        if ((i & 16) != 0) {
            j = roundRect.topLeftCornerRadius;
        }
        if ((i & 32) != 0) {
            j2 = roundRect.topRightCornerRadius;
        }
        if ((i & 64) != 0) {
            j3 = roundRect.bottomRightCornerRadius;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            j4 = roundRect.bottomLeftCornerRadius;
        }
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        long j8 = j;
        return roundRect.m4563copyMDFrsts(f, f2, f3, f4, j8, j7, j6, j5);
    }

    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f, float f2, float f3, float f4) {
        float f5 = f2 + f3;
        return f5 > f4 ? f5 == 0.0f ? f : Math.min(f, f4 / f5) : f;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)), Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)), getWidth()), Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)), Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)), getWidth());
        float f = this.left * minRadius;
        float f2 = this.top * minRadius;
        float f3 = this.right * minRadius;
        float f4 = this.bottom * minRadius;
        float intBitsToFloat = Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)) * minRadius;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)) * minRadius;
        long m4470constructorimpl = CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)) * minRadius;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)) * minRadius;
        long m4470constructorimpl2 = CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)) * minRadius;
        float intBitsToFloat6 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)) * minRadius;
        long m4470constructorimpl3 = CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)) * minRadius;
        float intBitsToFloat8 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)) * minRadius;
        RoundRect roundRect2 = new RoundRect(f, f2, f3, f4, m4470constructorimpl, m4470constructorimpl2, m4470constructorimpl3, CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(intBitsToFloat7) << 32) | (Float.floatToRawIntBits(intBitsToFloat8) & 4294967295L)), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m4558component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m4559component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m4560component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m4561component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a5 A[RETURN] */
    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4562containsk4lQ0M(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        float intBitsToFloat3;
        float intBitsToFloat4;
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) >= this.left && Float.intBitsToFloat(i) < this.right) {
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) >= this.top && Float.intBitsToFloat(i2) < this.bottom) {
                RoundRect scaledRadiiRect = scaledRadiiRect();
                if (Float.intBitsToFloat(i) < Float.intBitsToFloat((int) (scaledRadiiRect.topLeftCornerRadius >> 32)) + this.left) {
                    if (Float.intBitsToFloat(i2) < Float.intBitsToFloat((int) (scaledRadiiRect.topLeftCornerRadius & 4294967295L)) + this.top) {
                        intBitsToFloat = (Float.intBitsToFloat(i) - this.left) - Float.intBitsToFloat((int) (scaledRadiiRect.topLeftCornerRadius >> 32));
                        intBitsToFloat2 = (Float.intBitsToFloat(i2) - this.top) - Float.intBitsToFloat((int) (scaledRadiiRect.topLeftCornerRadius & 4294967295L));
                        intBitsToFloat3 = Float.intBitsToFloat((int) (scaledRadiiRect.topLeftCornerRadius >> 32));
                        intBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & scaledRadiiRect.topLeftCornerRadius));
                        float f = intBitsToFloat / intBitsToFloat3;
                        float f2 = intBitsToFloat2 / intBitsToFloat4;
                        return (f2 * f2) + (f * f) <= 1.0f;
                    }
                }
                if (Float.intBitsToFloat(i) > this.right - Float.intBitsToFloat((int) (scaledRadiiRect.topRightCornerRadius >> 32))) {
                    if (Float.intBitsToFloat(i2) < Float.intBitsToFloat((int) (scaledRadiiRect.topRightCornerRadius & 4294967295L)) + this.top) {
                        intBitsToFloat = (Float.intBitsToFloat(i) - this.right) + Float.intBitsToFloat((int) (scaledRadiiRect.topRightCornerRadius >> 32));
                        intBitsToFloat2 = (Float.intBitsToFloat(i2) - this.top) - Float.intBitsToFloat((int) (scaledRadiiRect.topRightCornerRadius & 4294967295L));
                        intBitsToFloat3 = Float.intBitsToFloat((int) (scaledRadiiRect.topRightCornerRadius >> 32));
                        intBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & scaledRadiiRect.topRightCornerRadius));
                        float f3 = intBitsToFloat / intBitsToFloat3;
                        float f22 = intBitsToFloat2 / intBitsToFloat4;
                        if ((f22 * f22) + (f3 * f3) <= 1.0f) {
                        }
                    }
                }
                if (Float.intBitsToFloat(i) <= this.right - Float.intBitsToFloat((int) (scaledRadiiRect.bottomRightCornerRadius >> 32)) || Float.intBitsToFloat(i2) <= this.bottom - Float.intBitsToFloat((int) (scaledRadiiRect.bottomRightCornerRadius & 4294967295L))) {
                    if (Float.intBitsToFloat(i) >= Float.intBitsToFloat((int) (scaledRadiiRect.bottomLeftCornerRadius >> 32)) + this.left || Float.intBitsToFloat(i2) <= this.bottom - Float.intBitsToFloat((int) (scaledRadiiRect.bottomLeftCornerRadius & 4294967295L))) {
                        return true;
                    }
                    intBitsToFloat = (Float.intBitsToFloat(i) - this.left) - Float.intBitsToFloat((int) (scaledRadiiRect.bottomLeftCornerRadius >> 32));
                    intBitsToFloat2 = (Float.intBitsToFloat(i2) - this.bottom) + Float.intBitsToFloat((int) (scaledRadiiRect.bottomLeftCornerRadius & 4294967295L));
                    intBitsToFloat3 = Float.intBitsToFloat((int) (scaledRadiiRect.bottomLeftCornerRadius >> 32));
                    intBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & scaledRadiiRect.bottomLeftCornerRadius));
                } else {
                    intBitsToFloat = (Float.intBitsToFloat(i) - this.right) + Float.intBitsToFloat((int) (scaledRadiiRect.bottomRightCornerRadius >> 32));
                    intBitsToFloat2 = (Float.intBitsToFloat(i2) - this.bottom) + Float.intBitsToFloat((int) (scaledRadiiRect.bottomRightCornerRadius & 4294967295L));
                    intBitsToFloat3 = Float.intBitsToFloat((int) (scaledRadiiRect.bottomRightCornerRadius >> 32));
                    intBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & scaledRadiiRect.bottomRightCornerRadius));
                }
                float f32 = intBitsToFloat / intBitsToFloat3;
                float f222 = intBitsToFloat2 / intBitsToFloat4;
                if ((f222 * f222) + (f32 * f32) <= 1.0f) {
                }
            }
        }
        return false;
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m4563copyMDFrsts(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        return new RoundRect(f, f2, f3, f4, j, j2, j3, j4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m4475equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m4475equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m4475equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m4475equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4564getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4565getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4566getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4567getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return CornerRadius.m4478hashCodeimpl(this.bottomLeftCornerRadius) + ((CornerRadius.m4478hashCodeimpl(this.bottomRightCornerRadius) + ((CornerRadius.m4478hashCodeimpl(this.topRightCornerRadius) + ((CornerRadius.m4478hashCodeimpl(this.topLeftCornerRadius) + bv.a(this.bottom, bv.a(this.right, bv.a(this.top, Float.hashCode(this.left) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m4475equalsimpl0(j, j2) || !CornerRadius.m4475equalsimpl0(j2, j3) || !CornerRadius.m4475equalsimpl0(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m4484toStringimpl(j)) + ", topRight=" + ((Object) CornerRadius.m4484toStringimpl(j2)) + ", bottomRight=" + ((Object) CornerRadius.m4484toStringimpl(j3)) + ", bottomLeft=" + ((Object) CornerRadius.m4484toStringimpl(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i2), 1) + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        private Companion() {
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, dq dqVar) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }
}
