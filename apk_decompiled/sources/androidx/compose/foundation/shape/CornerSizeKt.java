package androidx.compose.foundation.shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CornerSizeKt {
    private static final CornerSize ZeroCornerSize = new CornerSizeKt$ZeroCornerSize$1();

    public static final CornerSize CornerSize(int i) {
        return new PercentCornerSize(i);
    }

    /* renamed from: CornerSize-0680j_4, reason: not valid java name */
    public static final CornerSize m1048CornerSize0680j_4(float f) {
        return new DpCornerSize(f, null);
    }

    public static final CornerSize getZeroCornerSize() {
        return ZeroCornerSize;
    }

    public static final CornerSize CornerSize(float f) {
        return new PxCornerSize(f);
    }

    public static /* synthetic */ void getZeroCornerSize$annotations() {
    }
}
