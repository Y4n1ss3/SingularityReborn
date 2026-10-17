package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionHelpersKt {
    public static final ResolvedTextDirection getTextDirectionForOffset(TextLayoutResult textLayoutResult, int i) {
        return isOffsetAnEmptyLine(textLayoutResult, i) ? textLayoutResult.getParagraphDirection(i) : textLayoutResult.getBidiRunDirection(i);
    }

    private static final boolean isOffsetAnEmptyLine(TextLayoutResult textLayoutResult, int i) {
        if (textLayoutResult.getLayoutInput().getText().length() != 0) {
            int lineForOffset = textLayoutResult.getLineForOffset(i);
            if (i != 0 && lineForOffset == textLayoutResult.getLineForOffset(i - 1)) {
                return false;
            }
            if (i != textLayoutResult.getLayoutInput().getText().length() && lineForOffset == textLayoutResult.getLineForOffset(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
