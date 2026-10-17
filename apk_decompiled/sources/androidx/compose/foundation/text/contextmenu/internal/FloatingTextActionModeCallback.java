package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FloatingTextActionModeCallback extends ActionMode.Callback2 implements ActionMode.Callback {
    private final TextActionModeCallback textActionModeCallback;

    public FloatingTextActionModeCallback(TextActionModeCallback textActionModeCallback) {
        this.textActionModeCallback = textActionModeCallback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.textActionModeCallback.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.textActionModeCallback.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.textActionModeCallback.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        androidx.compose.ui.geometry.Rect onGetContentRect = this.textActionModeCallback.onGetContentRect(actionMode, view);
        rect.set(Math.round(onGetContentRect.getLeft()), Math.round(onGetContentRect.getTop()), Math.round(onGetContentRect.getRight()), Math.round(onGetContentRect.getBottom()));
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.textActionModeCallback.onPrepareActionMode(actionMode, menu);
    }
}
