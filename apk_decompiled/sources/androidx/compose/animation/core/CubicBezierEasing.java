package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import defpackage.bv;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float max;
    private final float min;

    public CubicBezierEasing(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            PreconditionsKt.throwIllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        long computeCubicVerticalBounds = BezierKt.computeCubicVerticalBounds(0.0f, f2, f4, 1.0f, new float[5], 0);
        this.min = Float.intBitsToFloat((int) (computeCubicVerticalBounds >> 32));
        this.max = Float.intBitsToFloat((int) (computeCubicVerticalBounds & 4294967295L));
    }

    private final void throwNoSolution(float f) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ") has no solution at " + f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        return this.a == cubicBezierEasing.a && this.b == cubicBezierEasing.b && this.c == cubicBezierEasing.c && this.d == cubicBezierEasing.d;
    }

    public int hashCode() {
        return Float.hashCode(this.d) + bv.a(this.c, bv.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.a);
        sb.append(", b=");
        sb.append(this.b);
        sb.append(", c=");
        sb.append(this.c);
        sb.append(", d=");
        return k4.g(sb, this.d, ')');
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f) {
        if (f > 0.0f && f < 1.0f) {
            float max = Math.max(f, 1.1920929E-7f);
            float findFirstCubicRoot = BezierKt.findFirstCubicRoot(0.0f - max, this.a - max, this.c - max, 1.0f - max);
            if (Float.isNaN(findFirstCubicRoot)) {
                throwNoSolution(f);
            }
            f = BezierKt.evaluateCubic(this.b, this.d, findFirstCubicRoot);
            float f2 = this.min;
            float f3 = this.max;
            if (f < f2) {
                f = f2;
            }
            if (f > f3) {
                return f3;
            }
        }
        return f;
    }
}
