package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldCharSequenceKt {
    public static final CharSequence getSelectedText(TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.m7058getMinimpl(textFieldCharSequence.m1239getSelectiond9O1mEE()), TextRange.m7057getMaximpl(textFieldCharSequence.m1239getSelectiond9O1mEE()));
    }

    public static final CharSequence getTextAfterSelection(TextFieldCharSequence textFieldCharSequence, int i) {
        int m7057getMaximpl = TextRange.m7057getMaximpl(textFieldCharSequence.m1239getSelectiond9O1mEE());
        int m7057getMaximpl2 = TextRange.m7057getMaximpl(textFieldCharSequence.m1239getSelectiond9O1mEE());
        int i2 = m7057getMaximpl2 + i;
        if (((i ^ i2) & (m7057getMaximpl2 ^ i2)) < 0) {
            i2 = textFieldCharSequence.length();
        }
        return textFieldCharSequence.subSequence(m7057getMaximpl, Math.min(i2, textFieldCharSequence.length()));
    }

    public static final CharSequence getTextBeforeSelection(TextFieldCharSequence textFieldCharSequence, int i) {
        int m7058getMinimpl = TextRange.m7058getMinimpl(textFieldCharSequence.m1239getSelectiond9O1mEE());
        int i2 = m7058getMinimpl - i;
        if (((i ^ m7058getMinimpl) & (m7058getMinimpl ^ i2)) < 0) {
            i2 = 0;
        }
        return textFieldCharSequence.subSequence(Math.max(0, i2), TextRange.m7058getMinimpl(textFieldCharSequence.m1239getSelectiond9O1mEE()));
    }
}
