package androidx.compose.foundation.text.contextmenu.modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ToolbarRequesterImpl extends ToolbarRequester {
    public static final int $stable = 8;

    @Override // androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester
    public void hide() {
        TextContextMenuToolbarHandlerNode toolbarHandlerNode$foundation = getToolbarHandlerNode$foundation();
        if (toolbarHandlerNode$foundation != null) {
            toolbarHandlerNode$foundation.hide();
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester
    public void show() {
        TextContextMenuToolbarHandlerNode requireInitialized$foundation = requireInitialized$foundation();
        if (requireInitialized$foundation != null) {
            requireInitialized$foundation.show();
        }
    }
}
