package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class Api35Impl {
    public static final Api35Impl INSTANCE = new Api35Impl();

    private Api35Impl() {
    }

    public static final void setRequestedFrameRate(View view, float f) {
        view.setRequestedFrameRate(f);
    }
}
