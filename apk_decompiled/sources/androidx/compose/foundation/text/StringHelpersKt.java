package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextRangeKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StringHelpersKt {
    public static final int findParagraphEnd(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final long getParagraphBoundary(CharSequence charSequence, int i) {
        return TextRangeKt.TextRange(findParagraphStart(charSequence, i), findParagraphEnd(charSequence, i));
    }
}
