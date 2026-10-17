package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ViewConfigurationApi26Impl {
    public static final ViewConfigurationApi26Impl INSTANCE = new ViewConfigurationApi26Impl();

    private ViewConfigurationApi26Impl() {
    }

    public final float getHorizontalScrollFactor(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public final float getVerticalScrollFactor(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
