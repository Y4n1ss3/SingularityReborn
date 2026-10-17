package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class AndroidComposeViewSensitiveContent35 {
    public static final AndroidComposeViewSensitiveContent35 INSTANCE = new AndroidComposeViewSensitiveContent35();

    private AndroidComposeViewSensitiveContent35() {
    }

    public final void setContentSensitivity(View view, boolean z) {
        if (z) {
            view.setContentSensitivity(1);
        } else {
            view.setContentSensitivity(0);
        }
    }
}
