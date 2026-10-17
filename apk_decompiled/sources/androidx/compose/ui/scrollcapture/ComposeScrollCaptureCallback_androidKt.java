package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import defpackage.hl;
import defpackage.my;
import defpackage.p01;
import defpackage.rr0;
import defpackage.un;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposeScrollCaptureCallback_androidKt {
    private static final boolean DEBUG = false;
    private static final String TAG = "ScrollCapture";

    /* JADX INFO: Access modifiers changed from: private */
    public static final z10 launchWithCancellationSignal(un unVar, CancellationSignal cancellationSignal, my myVar) {
        rr0 t = p01.t(unVar, null, null, myVar, 3);
        t.h(new ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1(cancellationSignal));
        cancellationSignal.setOnCancelListener(new hl(t, 0));
        return t;
    }
}
