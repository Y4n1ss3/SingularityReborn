package androidx.compose.ui.text.input;

import androidx.compose.ui.text.CharHelpers_androidKt;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MoveCursorCommand implements EditCommand {
    public static final int $stable = 0;
    private final int amount;

    public MoveCursorCommand(int i) {
        this.amount = i;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.getCursor$ui_text() == -1) {
            editingBuffer.setCursor$ui_text(editingBuffer.getSelectionStart$ui_text());
        }
        int selectionStart$ui_text = editingBuffer.getSelectionStart$ui_text();
        String editingBuffer2 = editingBuffer.toString();
        int i = this.amount;
        int i2 = 0;
        if (i <= 0) {
            int i3 = -i;
            while (i2 < i3) {
                int findPrecedingBreak = CharHelpers_androidKt.findPrecedingBreak(editingBuffer2, selectionStart$ui_text);
                if (findPrecedingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart$ui_text = findPrecedingBreak;
            }
        } else {
            while (i2 < i) {
                int findFollowingBreak = CharHelpers_androidKt.findFollowingBreak(editingBuffer2, selectionStart$ui_text);
                if (findFollowingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart$ui_text = findFollowingBreak;
            }
        }
        editingBuffer.setCursor$ui_text(selectionStart$ui_text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) obj).amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return this.amount;
    }

    public String toString() {
        return fc.e(new StringBuilder("MoveCursorCommand(amount="), this.amount, ')');
    }
}
