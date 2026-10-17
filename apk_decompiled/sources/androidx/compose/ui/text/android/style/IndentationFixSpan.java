package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.text.android.TextLayout_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IndentationFixSpan implements LeadingMarginSpan {
    public static final int $stable = 0;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1 || !TextLayout_androidKt.isLineEllipsized(layout, lineForOffset)) {
            return;
        }
        float ellipsizedRightPadding = IndentationFixSpan_androidKt.getEllipsizedRightPadding(layout, lineForOffset, paint) + IndentationFixSpan_androidKt.getEllipsizedLeftPadding(layout, lineForOffset, paint);
        if (ellipsizedRightPadding == 0.0f) {
            return;
        }
        canvas.getClass();
        canvas.translate(ellipsizedRightPadding, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
