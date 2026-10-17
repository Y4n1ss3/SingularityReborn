package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import defpackage.dq;
import defpackage.iy;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final iy onActionModeDestroy;
    private iy onAutofillRequested;
    private iy onCopyRequested;
    private iy onCutRequested;
    private iy onPasteRequested;
    private iy onSelectAllRequested;
    private Rect rect;

    public /* synthetic */ TextActionModeCallback(iy iyVar, Rect rect, iy iyVar2, iy iyVar3, iy iyVar4, iy iyVar5, iy iyVar6, int i, dq dqVar) {
        this((i & 1) != 0 ? null : iyVar, (i & 2) != 0 ? Rect.Companion.getZero() : rect, (i & 4) != 0 ? null : iyVar2, (i & 8) != 0 ? null : iyVar3, (i & 16) != 0 ? null : iyVar4, (i & 32) != 0 ? null : iyVar5, (i & 64) != 0 ? null : iyVar6);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, iy iyVar) {
        if (iyVar != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui(menu, menuItemOption);
        } else {
            if (iyVar != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final iy getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final iy getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    public final iy getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final iy getOnCutRequested() {
        return this.onCutRequested;
    }

    public final iy getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final iy getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            iy iyVar = this.onCopyRequested;
            if (iyVar != null) {
                iyVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            iy iyVar2 = this.onPasteRequested;
            if (iyVar2 != null) {
                iyVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            iy iyVar3 = this.onCutRequested;
            if (iyVar3 != null) {
                iyVar3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            iy iyVar4 = this.onSelectAllRequested;
            if (iyVar4 != null) {
                iyVar4.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            iy iyVar5 = this.onAutofillRequested;
            if (iyVar5 != null) {
                iyVar5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            o.m("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            o.m("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.SelectAll);
        }
        if (this.onAutofillRequested == null) {
            return true;
        }
        addMenuItem$ui(menu, MenuItemOption.Autofill);
        return true;
    }

    public final void onDestroyActionMode() {
        iy iyVar = this.onActionModeDestroy;
        if (iyVar != null) {
            iyVar.invoke();
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui(menu);
        return true;
    }

    public final void setOnAutofillRequested(iy iyVar) {
        this.onAutofillRequested = iyVar;
    }

    public final void setOnCopyRequested(iy iyVar) {
        this.onCopyRequested = iyVar;
    }

    public final void setOnCutRequested(iy iyVar) {
        this.onCutRequested = iyVar;
    }

    public final void setOnPasteRequested(iy iyVar) {
        this.onPasteRequested = iyVar;
    }

    public final void setOnSelectAllRequested(iy iyVar) {
        this.onSelectAllRequested = iyVar;
    }

    public final void setRect(Rect rect) {
        this.rect = rect;
    }

    public final void updateMenuItems$ui(Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }

    public TextActionModeCallback(iy iyVar, Rect rect, iy iyVar2, iy iyVar3, iy iyVar4, iy iyVar5, iy iyVar6) {
        this.onActionModeDestroy = iyVar;
        this.rect = rect;
        this.onCopyRequested = iyVar2;
        this.onPasteRequested = iyVar3;
        this.onCutRequested = iyVar4;
        this.onSelectAllRequested = iyVar5;
        this.onAutofillRequested = iyVar6;
    }

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
