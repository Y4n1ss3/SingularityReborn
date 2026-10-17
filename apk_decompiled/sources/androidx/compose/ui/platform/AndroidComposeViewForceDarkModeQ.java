package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class AndroidComposeViewForceDarkModeQ {
    public static final AndroidComposeViewForceDarkModeQ INSTANCE = new AndroidComposeViewForceDarkModeQ();

    private AndroidComposeViewForceDarkModeQ() {
    }

    public final void disallowForceDark(View view) {
        view.setForceDarkAllowed(false);
    }
}
