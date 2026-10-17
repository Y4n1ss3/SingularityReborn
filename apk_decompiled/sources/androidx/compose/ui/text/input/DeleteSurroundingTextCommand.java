package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int selectionEnd$ui_text = editingBuffer.getSelectionEnd$ui_text();
        int i = this.lengthAfterCursor;
        int i2 = selectionEnd$ui_text + i;
        if (((selectionEnd$ui_text ^ i2) & (i ^ i2)) < 0) {
            i2 = editingBuffer.getLength$ui_text();
        }
        editingBuffer.delete$ui_text(editingBuffer.getSelectionEnd$ui_text(), Math.min(i2, editingBuffer.getLength$ui_text()));
        int selectionStart$ui_text = editingBuffer.getSelectionStart$ui_text();
        int i3 = this.lengthBeforeCursor;
        int i4 = selectionStart$ui_text - i3;
        if (((i3 ^ selectionStart$ui_text) & (selectionStart$ui_text ^ i4)) < 0) {
            i4 = 0;
        }
        editingBuffer.delete$ui_text(Math.max(0, i4), editingBuffer.getSelectionStart$ui_text());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextCommand.lengthAfterCursor;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        return fc.e(sb, this.lengthAfterCursor, ')');
    }
}
