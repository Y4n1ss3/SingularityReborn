package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CursorAnchorInfoApi34Helper {
    public static final int $stable = 0;
    public static final CursorAnchorInfoApi34Helper INSTANCE = new CursorAnchorInfoApi34Helper();

    private CursorAnchorInfoApi34Helper() {
    }

    public static final CursorAnchorInfo.Builder addVisibleLineBounds(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, Rect rect) {
        if (!rect.isEmpty()) {
            int lineCount = textLayoutResult.getLineCount() - 1;
            if (lineCount < 0) {
                lineCount = 0;
            }
            int h = y80.h(textLayoutResult.getLineForVerticalPosition(rect.getTop()), 0, lineCount);
            int h2 = y80.h(textLayoutResult.getLineForVerticalPosition(rect.getBottom()), 0, lineCount);
            if (h <= h2) {
                while (true) {
                    builder.addVisibleLineBounds(textLayoutResult.getLineLeft(h), textLayoutResult.getLineTop(h), textLayoutResult.getLineRight(h), textLayoutResult.getLineBottom(h));
                    if (h == h2) {
                        break;
                    }
                    h++;
                }
            }
        }
        return builder;
    }
}
