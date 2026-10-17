package androidx.compose.ui.text.android.selection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Api34SegmentFinder {
    public static final int $stable = 0;
    public static final Api34SegmentFinder INSTANCE = new Api34SegmentFinder();

    private Api34SegmentFinder() {
    }

    public final android.text.SegmentFinder toAndroidSegmentFinder$ui_text(final SegmentFinder segmentFinder) {
        return new android.text.SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            public int nextEndBoundary(int i) {
                return SegmentFinder.this.nextEndBoundary(i);
            }

            public int nextStartBoundary(int i) {
                return SegmentFinder.this.nextStartBoundary(i);
            }

            public int previousEndBoundary(int i) {
                return SegmentFinder.this.previousEndBoundary(i);
            }

            public int previousStartBoundary(int i) {
                return SegmentFinder.this.previousStartBoundary(i);
            }
        };
    }
}
