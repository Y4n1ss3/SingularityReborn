package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.dq;
import defpackage.g;
import defpackage.ki0;
import defpackage.q10;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class EditProcessor {
    public static final int $stable = 8;
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m7065getZerod9O1mEE(), (TextRange) null, (dq) null);
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m7310getSelectiond9O1mEE(), (dq) null);

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, EditCommand editCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text() + ", composition=" + this.mBuffer.m7222getCompositionMzsxiRA$ui_text() + ", selection=" + ((Object) TextRange.m7063toStringimpl(this.mBuffer.m7223getSelectiond9O1mEE$ui_text())) + "):");
        sb.append('\n');
        yi.t0(list, sb, new g(17, editCommand, this), 60);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence generateBatchErrorMessage$lambda$0$0(EditCommand editCommand, EditProcessor editProcessor, EditCommand editCommand2) {
        return (editCommand == editCommand2 ? " > " : "   ") + editProcessor.toStringForLog(editCommand2);
    }

    private final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingRegionCommand) {
            return ((SetComposingRegionCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteSurroundingTextCommand) {
            return ((DeleteSurroundingTextCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return ((DeleteSurroundingTextInCodePointsCommand) editCommand).toString();
        }
        if (editCommand instanceof SetSelectionCommand) {
            return ((SetSelectionCommand) editCommand).toString();
        }
        if (editCommand instanceof FinishComposingTextCommand) {
            return ((FinishComposingTextCommand) editCommand).toString();
        }
        if (editCommand instanceof BackspaceCommand) {
            return ((BackspaceCommand) editCommand).toString();
        }
        if (editCommand instanceof MoveCursorCommand) {
            return ((MoveCursorCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteAllCommand) {
            return ((DeleteAllCommand) editCommand).toString();
        }
        String b = ki0.a(editCommand.getClass()).b();
        if (b == null) {
            b = "{anonymous EditCommand}";
        }
        return "Unknown EditCommand: ".concat(b);
    }

    public final TextFieldValue apply(List<? extends EditCommand> list) {
        EditCommand editCommand;
        EditCommand editCommand2 = null;
        try {
            int size = list.size();
            int i = 0;
            EditCommand editCommand3 = null;
            while (i < size) {
                try {
                    editCommand = list.get(i);
                } catch (Exception e) {
                    e = e;
                    editCommand2 = editCommand3;
                }
                try {
                    editCommand.applyTo(this.mBuffer);
                    i++;
                    editCommand3 = editCommand;
                } catch (Exception e2) {
                    e = e2;
                    editCommand2 = editCommand;
                    throw new RuntimeException(generateBatchErrorMessage(list, editCommand2), e);
                }
            }
            AnnotatedString annotatedString$ui_text = this.mBuffer.toAnnotatedString$ui_text();
            long m7223getSelectiond9O1mEE$ui_text = this.mBuffer.m7223getSelectiond9O1mEE$ui_text();
            TextRange m7048boximpl = TextRange.m7048boximpl(m7223getSelectiond9O1mEE$ui_text);
            m7048boximpl.m7064unboximpl();
            TextRange textRange = TextRange.m7059getReversedimpl(this.mBufferState.m7310getSelectiond9O1mEE()) ? null : m7048boximpl;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text, textRange != null ? textRange.m7064unboximpl() : TextRangeKt.TextRange(TextRange.m7057getMaximpl(m7223getSelectiond9O1mEE$ui_text), TextRange.m7058getMinimpl(m7223getSelectiond9O1mEE$ui_text)), this.mBuffer.m7222getCompositionMzsxiRA$ui_text(), (dq) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final EditingBuffer getMBuffer$ui_text() {
        return this.mBuffer;
    }

    public final TextFieldValue getMBufferState$ui_text() {
        return this.mBufferState;
    }

    public final void reset(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        boolean b = q10.b(textFieldValue.m7309getCompositionMzsxiRA(), this.mBuffer.m7222getCompositionMzsxiRA$ui_text());
        boolean z = true;
        boolean z2 = false;
        if (!q10.b(this.mBufferState.getAnnotatedString().getText(), textFieldValue.getAnnotatedString().getText())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m7310getSelectiond9O1mEE(), (dq) null);
        } else if (TextRange.m7053equalsimpl0(this.mBufferState.m7310getSelectiond9O1mEE(), textFieldValue.m7310getSelectiond9O1mEE())) {
            z = false;
        } else {
            this.mBuffer.setSelection$ui_text(TextRange.m7058getMinimpl(textFieldValue.m7310getSelectiond9O1mEE()), TextRange.m7057getMaximpl(textFieldValue.m7310getSelectiond9O1mEE()));
            z2 = true;
            z = false;
        }
        if (textFieldValue.m7309getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text();
        } else if (!TextRange.m7054getCollapsedimpl(textFieldValue.m7309getCompositionMzsxiRA().m7064unboximpl())) {
            this.mBuffer.setComposition$ui_text(TextRange.m7058getMinimpl(textFieldValue.m7309getCompositionMzsxiRA().m7064unboximpl()), TextRange.m7057getMaximpl(textFieldValue.m7309getCompositionMzsxiRA().m7064unboximpl()));
        }
        if (z || (!z2 && !b)) {
            this.mBuffer.commitComposition$ui_text();
            textFieldValue = TextFieldValue.m7305copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValue;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValue);
        }
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
