package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import defpackage.ds0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InputState_androidKt {
    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m7058getMinimpl(textFieldValue.m7310getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m7057getMaximpl(textFieldValue.m7310getSelectiond9O1mEE());
        extractedText.flags = !ds0.h0(textFieldValue.getText(), '\n') ? 1 : 0;
        return extractedText;
    }
}
