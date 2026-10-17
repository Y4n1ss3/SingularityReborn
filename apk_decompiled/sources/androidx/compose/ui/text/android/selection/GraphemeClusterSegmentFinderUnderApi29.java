package androidx.compose.ui.text.android.selection;

import java.text.BreakIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class GraphemeClusterSegmentFinderUnderApi29 extends GraphemeClusterSegmentFinder {
    public static final int $stable = 8;
    private final BreakIterator breakIterator;
    private final CharSequence text;

    public GraphemeClusterSegmentFinderUnderApi29(CharSequence charSequence) {
        this.text = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.breakIterator = characterInstance;
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int next(int i) {
        return this.breakIterator.following(i);
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int previous(int i) {
        return this.breakIterator.preceding(i);
    }
}
