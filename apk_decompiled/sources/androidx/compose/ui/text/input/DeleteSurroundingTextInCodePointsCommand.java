package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        boolean isSurrogatePair;
        boolean isSurrogatePair2;
        int i = this.lengthBeforeCursor;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 < i) {
                int i5 = i4 + 1;
                if (editingBuffer.getSelectionStart$ui_text() <= i5) {
                    i4 = editingBuffer.getSelectionStart$ui_text();
                    break;
                } else {
                    isSurrogatePair2 = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text((editingBuffer.getSelectionStart$ui_text() - i5) - 1), editingBuffer.get$ui_text(editingBuffer.getSelectionStart$ui_text() - i5));
                    i4 = isSurrogatePair2 ? i4 + 2 : i5;
                    i3++;
                }
            } else {
                break;
            }
        }
        int i6 = this.lengthAfterCursor;
        int i7 = 0;
        while (true) {
            if (i2 >= i6) {
                break;
            }
            int i8 = i7 + 1;
            if (editingBuffer.getSelectionEnd$ui_text() + i8 >= editingBuffer.getLength$ui_text()) {
                i7 = editingBuffer.getLength$ui_text() - editingBuffer.getSelectionEnd$ui_text();
                break;
            } else {
                isSurrogatePair = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text((editingBuffer.getSelectionEnd$ui_text() + i8) - 1), editingBuffer.get$ui_text(editingBuffer.getSelectionEnd$ui_text() + i8));
                i7 = isSurrogatePair ? i7 + 2 : i8;
                i2++;
            }
        }
        editingBuffer.delete$ui_text(editingBuffer.getSelectionEnd$ui_text(), editingBuffer.getSelectionEnd$ui_text() + i7);
        editingBuffer.delete$ui_text(editingBuffer.getSelectionStart$ui_text() - i4, editingBuffer.getSelectionStart$ui_text());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
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
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        return fc.e(sb, this.lengthAfterCursor, ')');
    }
}
