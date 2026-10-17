package androidx.compose.ui.text.input;

import androidx.compose.ui.text.CharHelpers_androidKt;
import defpackage.ki0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BackspaceCommand implements EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text()) {
            editingBuffer.delete$ui_text(editingBuffer.getCompositionStart$ui_text(), editingBuffer.getCompositionEnd$ui_text());
            return;
        }
        if (editingBuffer.getCursor$ui_text() != -1) {
            if (editingBuffer.getCursor$ui_text() == 0) {
                return;
            }
            editingBuffer.delete$ui_text(CharHelpers_androidKt.findPrecedingBreak(editingBuffer.toString(), editingBuffer.getCursor$ui_text()), editingBuffer.getCursor$ui_text());
        } else {
            int selectionStart$ui_text = editingBuffer.getSelectionStart$ui_text();
            int selectionEnd$ui_text = editingBuffer.getSelectionEnd$ui_text();
            editingBuffer.setCursor$ui_text(editingBuffer.getSelectionStart$ui_text());
            editingBuffer.delete$ui_text(selectionStart$ui_text, selectionEnd$ui_text);
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof BackspaceCommand;
    }

    public int hashCode() {
        return ki0.a(BackspaceCommand.class).hashCode();
    }

    public String toString() {
        return "BackspaceCommand()";
    }
}
