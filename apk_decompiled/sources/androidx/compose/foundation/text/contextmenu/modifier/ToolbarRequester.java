package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.internal.InlineClassHelperKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class ToolbarRequester {
    public static final int $stable = 8;
    private TextContextMenuToolbarHandlerNode toolbarHandlerNode;
    private ToolbarHandlerState toolbarHandlerState = ToolbarHandlerState.Uninitialized;

    public final TextContextMenuToolbarHandlerNode getToolbarHandlerNode$foundation() {
        return this.toolbarHandlerNode;
    }

    public final ToolbarHandlerState getToolbarHandlerState$foundation() {
        return this.toolbarHandlerState;
    }

    public abstract void hide();

    public final TextContextMenuToolbarHandlerNode requireInitialized$foundation() {
        if (!(this.toolbarHandlerState != ToolbarHandlerState.Uninitialized)) {
            InlineClassHelperKt.throwIllegalStateException("ToolbarRequester is not initialized.");
        }
        return this.toolbarHandlerNode;
    }

    public final void setToolbarHandlerNode$foundation(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        this.toolbarHandlerNode = textContextMenuToolbarHandlerNode;
    }

    public final void setToolbarHandlerState$foundation(ToolbarHandlerState toolbarHandlerState) {
        this.toolbarHandlerState = toolbarHandlerState;
    }

    public abstract void show();
}
