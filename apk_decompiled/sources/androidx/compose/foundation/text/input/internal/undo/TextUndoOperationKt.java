package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.text.TextRange;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextUndoOperationKt {
    public static final void redo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        mainBuffer$foundation.replace(textUndoOperation.getIndex(), textUndoOperation.getPreText().length() + textUndoOperation.getIndex(), textUndoOperation.getPostText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation, TextRange.m7060getStartimpl(textUndoOperation.m1421getPostSelectiond9O1mEE()), TextRange.m7055getEndimpl(textUndoOperation.m1421getPostSelectiond9O1mEE()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation(), TextFieldBuffer.m1228toTextFieldCharSequencewFTz33Y$foundation$default(textFieldState.getMainBuffer$foundation(), 0L, null, null, null, 15, null), true);
    }

    public static final void undo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        mainBuffer$foundation.replace(textUndoOperation.getIndex(), textUndoOperation.getPostText().length() + textUndoOperation.getIndex(), textUndoOperation.getPreText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation, TextRange.m7060getStartimpl(textUndoOperation.m1422getPreSelectiond9O1mEE()), TextRange.m7055getEndimpl(textUndoOperation.m1422getPreSelectiond9O1mEE()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation(), TextFieldBuffer.m1228toTextFieldCharSequencewFTz33Y$foundation$default(textFieldState.getMainBuffer$foundation(), 0L, null, null, null, 15, null), true);
    }
}
