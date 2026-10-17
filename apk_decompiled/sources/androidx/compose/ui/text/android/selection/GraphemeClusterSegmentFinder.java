package androidx.compose.ui.text.android.selection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class GraphemeClusterSegmentFinder implements SegmentFinder {
    public static final int $stable = 0;

    public abstract int next(int i);

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int i) {
        return next(i);
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int i) {
        int next = next(i);
        if (next == -1 || next(next) == -1) {
            return -1;
        }
        return next;
    }

    public abstract int previous(int i);

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int i) {
        int previous = previous(i);
        if (previous == -1 || previous(previous) == -1) {
            return -1;
        }
        return previous;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int i) {
        return previous(i);
    }
}
