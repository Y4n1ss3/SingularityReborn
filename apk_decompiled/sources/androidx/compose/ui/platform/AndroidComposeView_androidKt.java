package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;
    private static final int maskForNonWindowMetricsChanges = 1342235263;
    private static ky platformTextInputServiceInterceptor = AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (q10.b(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean diffForWindowMetricsChanged(Configuration configuration, Configuration configuration2) {
        return (configuration.diff(configuration2) & (-1342235264)) != 0;
    }

    /* renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m6706dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionWrapper getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    public static final ky getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m6707preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float m6706dotp89u6pk = m6706dotp89u6pk(fArr2, 0, fArr, 0);
        float m6706dotp89u6pk2 = m6706dotp89u6pk(fArr2, 0, fArr, 1);
        float m6706dotp89u6pk3 = m6706dotp89u6pk(fArr2, 0, fArr, 2);
        float m6706dotp89u6pk4 = m6706dotp89u6pk(fArr2, 0, fArr, 3);
        float m6706dotp89u6pk5 = m6706dotp89u6pk(fArr2, 1, fArr, 0);
        float m6706dotp89u6pk6 = m6706dotp89u6pk(fArr2, 1, fArr, 1);
        float m6706dotp89u6pk7 = m6706dotp89u6pk(fArr2, 1, fArr, 2);
        float m6706dotp89u6pk8 = m6706dotp89u6pk(fArr2, 1, fArr, 3);
        float m6706dotp89u6pk9 = m6706dotp89u6pk(fArr2, 2, fArr, 0);
        float m6706dotp89u6pk10 = m6706dotp89u6pk(fArr2, 2, fArr, 1);
        float m6706dotp89u6pk11 = m6706dotp89u6pk(fArr2, 2, fArr, 2);
        float m6706dotp89u6pk12 = m6706dotp89u6pk(fArr2, 2, fArr, 3);
        float m6706dotp89u6pk13 = m6706dotp89u6pk(fArr2, 3, fArr, 0);
        float m6706dotp89u6pk14 = m6706dotp89u6pk(fArr2, 3, fArr, 1);
        float m6706dotp89u6pk15 = m6706dotp89u6pk(fArr2, 3, fArr, 2);
        float m6706dotp89u6pk16 = m6706dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = m6706dotp89u6pk;
        fArr[1] = m6706dotp89u6pk2;
        fArr[2] = m6706dotp89u6pk3;
        fArr[3] = m6706dotp89u6pk4;
        fArr[4] = m6706dotp89u6pk5;
        fArr[5] = m6706dotp89u6pk6;
        fArr[6] = m6706dotp89u6pk7;
        fArr[7] = m6706dotp89u6pk8;
        fArr[8] = m6706dotp89u6pk9;
        fArr[9] = m6706dotp89u6pk10;
        fArr[10] = m6706dotp89u6pk11;
        fArr[11] = m6706dotp89u6pk12;
        fArr[12] = m6706dotp89u6pk13;
        fArr[13] = m6706dotp89u6pk14;
        fArr[14] = m6706dotp89u6pk15;
        fArr[15] = m6706dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m6708preTranslatecG2Xzmc(float[] fArr, float f, float f2, float[] fArr2) {
        Matrix.m5014resetimpl(fArr2);
        Matrix.m5027translateimpl$default(fArr2, f, f2, 0.0f, 4, null);
        m6707preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(ky kyVar) {
        platformTextInputServiceInterceptor = kyVar;
    }
}
