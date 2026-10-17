package androidx.compose.ui.scrollcapture;

import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ScrollCapture$onScrollCaptureSearch$2 extends f30 implements ky {
    public static final ScrollCapture$onScrollCaptureSearch$2 INSTANCE = new ScrollCapture$onScrollCaptureSearch$2();

    public ScrollCapture$onScrollCaptureSearch$2() {
        super(1);
    }

    @Override // defpackage.ky
    public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
        return Integer.valueOf(scrollCaptureCandidate.getDepth());
    }
}
