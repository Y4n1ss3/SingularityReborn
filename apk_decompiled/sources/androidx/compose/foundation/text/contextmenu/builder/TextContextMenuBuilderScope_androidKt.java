package androidx.compose.foundation.text.contextmenu.builder;

import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuBuilderScope_androidKt {
    public static final void item(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, String str, int i, ky kyVar) {
        textContextMenuBuilderScope.addComponent$foundation(new TextContextMenuItem(obj, str, i, kyVar));
    }

    public static /* synthetic */ void item$default(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, String str, int i, ky kyVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        item(textContextMenuBuilderScope, obj, str, i, kyVar);
    }

    public static final void textClassificationItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, TextClassification textClassification, int i) {
        textContextMenuBuilderScope.addComponent$foundation(new TextContextMenuTextClassificationItem(obj, textClassification, i));
    }
}
