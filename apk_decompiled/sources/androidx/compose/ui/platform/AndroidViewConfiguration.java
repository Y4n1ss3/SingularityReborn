package androidx.compose.ui.platform;

import android.os.Build;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidViewConfiguration implements ViewConfiguration {
    public static final int $stable = 8;
    private final android.view.ViewConfiguration viewConfiguration;

    public AndroidViewConfiguration(android.view.ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapTimeoutMillis() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getHandwritingGestureLineMargin() {
        return Build.VERSION.SDK_INT >= 34 ? AndroidViewConfigurationApi34.INSTANCE.getScaledHandwritingGestureLineMargin(this.viewConfiguration) : super.getHandwritingGestureLineMargin();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getHandwritingSlop() {
        return Build.VERSION.SDK_INT >= 34 ? AndroidViewConfigurationApi34.INSTANCE.getScaledHandwritingSlop(this.viewConfiguration) : super.getHandwritingSlop();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getLongPressTimeoutMillis() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getMaximumFlingVelocity() {
        return this.viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getMinimumFlingVelocity() {
        return this.viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getTouchSlop() {
        return this.viewConfiguration.getScaledTouchSlop();
    }
}
