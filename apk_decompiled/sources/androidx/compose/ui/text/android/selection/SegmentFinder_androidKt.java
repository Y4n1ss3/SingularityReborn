package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SegmentFinder_androidKt {
    public static final SegmentFinder createGraphemeClusterSegmentFinder(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinderApi29(charSequence, textPaint);
    }
}
