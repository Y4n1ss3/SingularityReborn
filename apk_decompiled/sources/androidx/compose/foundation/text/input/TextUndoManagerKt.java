package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.UndoManagerKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextUndoManagerKt {
    private static final int TEXT_UNDO_CAPACITY = 100;

    private static final boolean isNewLineInsert(TextUndoOperation textUndoOperation) {
        return q10.b(textUndoOperation.getPostText(), "\n") || q10.b(textUndoOperation.getPostText(), "\r\n");
    }

    public static final TextUndoOperation merge(TextUndoOperation textUndoOperation, TextUndoOperation textUndoOperation2) {
        if (!textUndoOperation.getCanMerge() || !textUndoOperation2.getCanMerge() || textUndoOperation2.getTimeInMillis() < textUndoOperation.getTimeInMillis() || textUndoOperation2.getTimeInMillis() - textUndoOperation.getTimeInMillis() >= UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS() || isNewLineInsert(textUndoOperation) || isNewLineInsert(textUndoOperation2) || textUndoOperation.getTextEditType() != textUndoOperation2.getTextEditType()) {
            return null;
        }
        if (textUndoOperation.getTextEditType() == TextEditType.Insert) {
            if (textUndoOperation.getPostText().length() + textUndoOperation.getIndex() == textUndoOperation2.getIndex()) {
                return new TextUndoOperation(textUndoOperation.getIndex(), "", textUndoOperation.getPostText() + textUndoOperation2.getPostText(), textUndoOperation.m1422getPreSelectiond9O1mEE(), textUndoOperation2.m1421getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
        }
        if (textUndoOperation.getTextEditType() == TextEditType.Delete && textUndoOperation.getDeletionType() == textUndoOperation2.getDeletionType() && (textUndoOperation.getDeletionType() == TextDeleteType.Start || textUndoOperation.getDeletionType() == TextDeleteType.End)) {
            if (textUndoOperation.getIndex() == textUndoOperation2.getPreText().length() + textUndoOperation2.getIndex()) {
                return new TextUndoOperation(textUndoOperation2.getIndex(), textUndoOperation2.getPreText() + textUndoOperation.getPreText(), "", textUndoOperation.m1422getPreSelectiond9O1mEE(), textUndoOperation2.m1421getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
            if (textUndoOperation.getIndex() == textUndoOperation2.getIndex()) {
                return new TextUndoOperation(textUndoOperation.getIndex(), textUndoOperation.getPreText() + textUndoOperation2.getPreText(), "", textUndoOperation.m1422getPreSelectiond9O1mEE(), textUndoOperation2.m1421getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
        }
        return null;
    }

    public static final void recordChanges(TextUndoManager textUndoManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, boolean z) {
        if (changeList.getChangeCount() > 1) {
            textUndoManager.record(new TextUndoOperation(0, textFieldCharSequence.toString(), textFieldCharSequence2.toString(), textFieldCharSequence.m1239getSelectiond9O1mEE(), textFieldCharSequence2.m1239getSelectiond9O1mEE(), 0L, false, 32, null));
            return;
        }
        if (changeList.getChangeCount() == 1) {
            long mo1235getOriginalRangejx7JFs = changeList.mo1235getOriginalRangejx7JFs(0);
            long mo1236getRangejx7JFs = changeList.mo1236getRangejx7JFs(0);
            if (TextRange.m7054getCollapsedimpl(mo1235getOriginalRangejx7JFs) && TextRange.m7054getCollapsedimpl(mo1236getRangejx7JFs)) {
                return;
            }
            textUndoManager.record(new TextUndoOperation(TextRange.m7058getMinimpl(mo1235getOriginalRangejx7JFs), TextRangeKt.m7067substringFDrldGo(textFieldCharSequence, mo1235getOriginalRangejx7JFs), TextRangeKt.m7067substringFDrldGo(textFieldCharSequence2, mo1236getRangejx7JFs), textFieldCharSequence.m1239getSelectiond9O1mEE(), textFieldCharSequence2.m1239getSelectiond9O1mEE(), 0L, z, 32, null));
        }
    }

    public static /* synthetic */ void recordChanges$default(TextUndoManager textUndoManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        recordChanges(textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, z);
    }
}
