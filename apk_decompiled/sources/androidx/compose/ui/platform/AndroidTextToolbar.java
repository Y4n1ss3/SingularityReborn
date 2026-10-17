package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;
    private ActionMode actionMode;
    private final View view;
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this), null, null, null, null, null, null, 126, null);
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(Rect rect, iy iyVar, iy iyVar2, iy iyVar3, iy iyVar4, iy iyVar5) {
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(iyVar);
        this.textActionModeCallback.setOnCutRequested(iyVar3);
        this.textActionModeCallback.setOnPasteRequested(iyVar2);
        this.textActionModeCallback.setOnSelectAllRequested(iyVar4);
        this.textActionModeCallback.setOnAutofillRequested(iyVar5);
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        } else {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        }
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(Rect rect, iy iyVar, iy iyVar2, iy iyVar3, iy iyVar4) {
        showMenu(rect, iyVar, iyVar2, iyVar3, iyVar4, null);
    }
}
