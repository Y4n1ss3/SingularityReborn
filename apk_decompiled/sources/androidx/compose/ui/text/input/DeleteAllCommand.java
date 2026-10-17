package androidx.compose.ui.text.input;

import defpackage.ki0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DeleteAllCommand implements EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        editingBuffer.replace$ui_text(0, editingBuffer.getLength$ui_text(), "");
    }

    public boolean equals(Object obj) {
        return obj instanceof DeleteAllCommand;
    }

    public int hashCode() {
        return ki0.a(DeleteAllCommand.class).hashCode();
    }

    public String toString() {
        return "DeleteAllCommand()";
    }
}
