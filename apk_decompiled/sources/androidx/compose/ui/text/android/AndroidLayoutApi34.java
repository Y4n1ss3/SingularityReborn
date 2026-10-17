package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import androidx.compose.ui.text.android.AndroidLayoutApi34;
import androidx.compose.ui.text.android.selection.Api34SegmentFinder;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidLayoutApi34 {
    public static final int $stable = 0;
    public static final AndroidLayoutApi34 INSTANCE = new AndroidLayoutApi34();

    private AndroidLayoutApi34() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRangeForRect$lambda$0(my myVar, RectF rectF, RectF rectF2) {
        return ((Boolean) myVar.invoke(rectF, rectF2)).booleanValue();
    }

    public final int[] getRangeForRect$ui_text(TextLayout textLayout, RectF rectF, int i, final my myVar) {
        return textLayout.getLayout().getRangeForRect(rectF, i == 1 ? Api34SegmentFinder.INSTANCE.toAndroidSegmentFinder$ui_text(new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator())) : new GraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint()), new Layout.TextInclusionStrategy() { // from class: q5
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                boolean rangeForRect$lambda$0;
                rangeForRect$lambda$0 = AndroidLayoutApi34.getRangeForRect$lambda$0(my.this, rectF2, rectF3);
                return rangeForRect$lambda$0;
            }
        });
    }
}
