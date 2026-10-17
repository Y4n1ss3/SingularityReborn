package androidx.compose.ui.platform;

import android.view.View;
import defpackage.b5;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeViewTranslationCallbackS {
    public static final int $stable = 0;
    public static final AndroidComposeViewTranslationCallbackS INSTANCE = new AndroidComposeViewTranslationCallbackS();

    private AndroidComposeViewTranslationCallbackS() {
    }

    public final void clearViewTranslationCallback(View view) {
        view.clearViewTranslationCallback();
    }

    public final void setViewTranslationCallback(View view) {
        view.setViewTranslationCallback(b5.l(AndroidComposeViewTranslationCallback.INSTANCE));
    }
}
