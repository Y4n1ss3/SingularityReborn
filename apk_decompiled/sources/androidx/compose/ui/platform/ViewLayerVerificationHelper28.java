package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class ViewLayerVerificationHelper28 {
    public static final ViewLayerVerificationHelper28 INSTANCE = new ViewLayerVerificationHelper28();

    private ViewLayerVerificationHelper28() {
    }

    public final void setOutlineAmbientShadowColor(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    public final void setOutlineSpotShadowColor(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }
}
