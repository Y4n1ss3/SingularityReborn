package androidx.compose.foundation.text.contextmenu.internal;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TextToolbarHelperApi28 {
    public static final TextToolbarHelperApi28 INSTANCE = new TextToolbarHelperApi28();

    private TextToolbarHelperApi28() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addLegacyMenuItem$lambda$0(Context context, TextClassification textClassification, MenuItem menuItem) {
        TextClassificationHelperApi28.INSTANCE.sendLegacyIntent(context, textClassification);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addMenuItem$lambda$0(RemoteAction remoteAction, MenuItem menuItem) {
        TextClassificationHelperApi28.INSTANCE.sendPendingIntent(remoteAction.getActionIntent());
        return true;
    }

    public final void addLegacyMenuItem(Menu menu, int i, Context context, TextClassification textClassification) {
        MenuItem add = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
        add.setShowAsAction(2);
        add.setIcon(textClassification.getIcon());
        add.setOnMenuItemClickListener(new a(1, context, textClassification));
    }

    public final void addMenuItem(Menu menu, int i, Context context, boolean z, final RemoteAction remoteAction) {
        MenuItem add = menu.add(R.id.textAssist, z ? 16908353 : 0, i, remoteAction.getTitle());
        add.setShowAsAction(z ? 2 : 0);
        if (z || remoteAction.shouldShowIcon()) {
            add.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.i
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean addMenuItem$lambda$0;
                addMenuItem$lambda$0 = TextToolbarHelperApi28.addMenuItem$lambda$0(remoteAction, menuItem);
                return addMenuItem$lambda$0;
            }
        });
    }

    public final void addMenuItem(Menu menu, int i, Context context, TextClassification textClassification, int i2) {
        if (i2 < 0) {
            addLegacyMenuItem(menu, i, context, textClassification);
        } else {
            addMenuItem(menu, i, context, i2 == 0, textClassification.getActions().get(i2));
        }
    }
}
