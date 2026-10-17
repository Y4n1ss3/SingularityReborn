package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean updateMenuItems$lambda$0$0;
        boolean addLegacyMenuItem$lambda$0;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                updateMenuItems$lambda$0$0 = AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl.updateMenuItems$lambda$0$0((TextContextMenuItem) obj2, (AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl) obj, menuItem);
                return updateMenuItems$lambda$0$0;
            default:
                addLegacyMenuItem$lambda$0 = TextToolbarHelperApi28.addLegacyMenuItem$lambda$0((Context) obj2, (TextClassification) obj, menuItem);
                return addLegacyMenuItem$lambda$0;
        }
    }
}
