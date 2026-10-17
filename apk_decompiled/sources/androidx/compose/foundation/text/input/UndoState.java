package androidx.compose.foundation.text.input;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UndoState {
    public static final int $stable = 0;
    private final TextFieldState state;

    public UndoState(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void clearHistory() {
        this.state.getTextUndoManager$foundation().clearHistory();
    }

    public final boolean getCanRedo() {
        return this.state.getTextUndoManager$foundation().getCanRedo();
    }

    public final boolean getCanUndo() {
        return this.state.getTextUndoManager$foundation().getCanUndo();
    }

    public final void redo() {
        this.state.getTextUndoManager$foundation().redo(this.state);
    }

    public final void undo() {
        this.state.getTextUndoManager$foundation().undo(this.state);
    }

    public static /* synthetic */ void getCanRedo$annotations() {
    }

    public static /* synthetic */ void getCanUndo$annotations() {
    }
}
