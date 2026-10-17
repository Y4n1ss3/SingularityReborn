package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.fc;
import defpackage.q10;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CommitTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public CommitTextCommand(String str, int i) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), i);
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text()) {
            editingBuffer.replace$ui_text(editingBuffer.getCompositionStart$ui_text(), editingBuffer.getCompositionEnd$ui_text(), getText());
        } else {
            editingBuffer.replace$ui_text(editingBuffer.getSelectionStart$ui_text(), editingBuffer.getSelectionEnd$ui_text(), getText());
        }
        int cursor$ui_text = editingBuffer.getCursor$ui_text();
        int i = this.newCursorPosition;
        editingBuffer.setCursor$ui_text(y80.h(i > 0 ? (cursor$ui_text + i) - 1 : (cursor$ui_text + i) - getText().length(), 0, editingBuffer.getLength$ui_text()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        return q10.b(getText(), commitTextCommand.getText()) && this.newCursorPosition == commitTextCommand.newCursorPosition;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(getText());
        sb.append("', newCursorPosition=");
        return fc.e(sb, this.newCursorPosition, ')');
    }

    public CommitTextCommand(AnnotatedString annotatedString, int i) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i;
    }
}
