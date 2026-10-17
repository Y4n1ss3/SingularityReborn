package androidx.compose.ui.platform;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class AndroidViewConfigurationApi34 {
    public static final AndroidViewConfigurationApi34 INSTANCE = new AndroidViewConfigurationApi34();

    private AndroidViewConfigurationApi34() {
    }

    public final float getScaledHandwritingGestureLineMargin(android.view.ViewConfiguration viewConfiguration) {
        int scaledHandwritingGestureLineMargin;
        scaledHandwritingGestureLineMargin = viewConfiguration.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }

    public final float getScaledHandwritingSlop(android.view.ViewConfiguration viewConfiguration) {
        int scaledHandwritingSlop;
        scaledHandwritingSlop = viewConfiguration.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }
}
