package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TextToolbarHelper {
    public static final TextToolbarHelper INSTANCE = new TextToolbarHelper();

    private TextToolbarHelper() {
    }

    public final void invalidateContentRect(ActionMode actionMode) {
        TextToolbarHelperApi23.INSTANCE.invalidateContentRect(actionMode);
    }

    public final ActionMode startActionMode(View view, TextActionModeCallback textActionModeCallback) {
        return TextToolbarHelperApi23.INSTANCE.startActionMode(view, new FloatingTextActionModeCallback(textActionModeCallback), 1);
    }
}
