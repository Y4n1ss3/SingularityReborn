package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {
    public static final AndroidComposeViewTranslationCallback INSTANCE = new AndroidComposeViewTranslationCallback();

    private AndroidComposeViewTranslationCallback() {
    }

    public boolean onClearTranslation(View view) {
        view.getClass();
        ((AndroidComposeView) view).getContentCaptureManager$ui().onClearTranslation$ui();
        return true;
    }

    public boolean onHideTranslation(View view) {
        view.getClass();
        ((AndroidComposeView) view).getContentCaptureManager$ui().onHideTranslation$ui();
        return true;
    }

    public boolean onShowTranslation(View view) {
        view.getClass();
        ((AndroidComposeView) view).getContentCaptureManager$ui().onShowTranslation$ui();
        return true;
    }
}
