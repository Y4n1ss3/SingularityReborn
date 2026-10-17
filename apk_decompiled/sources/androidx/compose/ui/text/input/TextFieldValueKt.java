package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m6895subSequence5zctL8(textFieldValue.m7310getSelectiond9O1mEE());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
        int m7057getMaximpl = TextRange.m7057getMaximpl(textFieldValue.m7310getSelectiond9O1mEE());
        int m7057getMaximpl2 = TextRange.m7057getMaximpl(textFieldValue.m7310getSelectiond9O1mEE());
        int i2 = m7057getMaximpl2 + i;
        if (((i ^ i2) & (m7057getMaximpl2 ^ i2)) < 0) {
            i2 = textFieldValue.getText().length();
        }
        return annotatedString.subSequence(m7057getMaximpl, Math.min(i2, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
        int m7058getMinimpl = TextRange.m7058getMinimpl(textFieldValue.m7310getSelectiond9O1mEE());
        int i2 = m7058getMinimpl - i;
        if (((i ^ m7058getMinimpl) & (m7058getMinimpl ^ i2)) < 0) {
            i2 = 0;
        }
        return annotatedString.subSequence(Math.max(0, i2), TextRange.m7058getMinimpl(textFieldValue.m7310getSelectiond9O1mEE()));
    }
}
