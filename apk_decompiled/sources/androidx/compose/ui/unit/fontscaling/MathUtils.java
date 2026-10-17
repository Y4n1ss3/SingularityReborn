package androidx.compose.ui.unit.fontscaling;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MathUtils {
    public static final int $stable = 0;
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    public final float constrainedMap(float f, float f2, float f3, float f4, float f5) {
        return lerp(f, f2, Math.max(0.0f, Math.min(1.0f, lerpInv(f3, f4, f5))));
    }

    public final float lerp(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public final float lerpInv(float f, float f2, float f3) {
        if (f == f2) {
            return 0.0f;
        }
        return (f3 - f) / (f2 - f);
    }
}
