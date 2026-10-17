package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import defpackage.g2;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ScrollCapture$onScrollCaptureSearch$1 extends g2 implements ky {
    public ScrollCapture$onScrollCaptureSearch$1(Object obj) {
        super(1, obj, MutableVector.class, "add", "add(Ljava/lang/Object;)Z", 8);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ScrollCaptureCandidate) obj);
        return w01.a;
    }

    public final void invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
        ((MutableVector) this.receiver).add(scrollCaptureCandidate);
    }
}
