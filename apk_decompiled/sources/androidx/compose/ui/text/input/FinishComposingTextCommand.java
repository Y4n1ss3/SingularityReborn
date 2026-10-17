package androidx.compose.ui.text.input;

import defpackage.ki0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FinishComposingTextCommand implements EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        editingBuffer.commitComposition$ui_text();
    }

    public boolean equals(Object obj) {
        return obj instanceof FinishComposingTextCommand;
    }

    public int hashCode() {
        return ki0.a(FinishComposingTextCommand.class).hashCode();
    }

    public String toString() {
        return "FinishComposingTextCommand()";
    }
}
