package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class ViewCompatShims {
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static AutofillId getAutofillId(View view) {
            return view.getAutofillId();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static ContentCaptureSession getContentCaptureSession(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static void setImportantForContentCapture(View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }

    private ViewCompatShims() {
    }

    public static AutofillIdCompat getAutofillId(View view) {
        return AutofillIdCompat.toAutofillIdCompat(Api26Impl.getAutofillId(view));
    }

    public static ContentCaptureSessionWrapper getContentCaptureSession(View view) {
        ContentCaptureSession contentCaptureSession = Api29Impl.getContentCaptureSession(view);
        if (contentCaptureSession == null) {
            return null;
        }
        return ContentCaptureSessionCompat.toContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public static void setImportantForContentCapture(View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setImportantForContentCapture(view, i);
        }
    }
}
