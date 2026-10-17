package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuGesturesModifierKt {
    public static final Modifier showTextContextMenuOnSecondaryClick(Modifier modifier, my myVar) {
        return modifier.then(new TextContextMenuGestureElement(myVar));
    }

    public static /* synthetic */ Modifier showTextContextMenuOnSecondaryClick$default(Modifier modifier, my myVar, int i, Object obj) {
        if ((i & 1) != 0) {
            myVar = null;
        }
        return showTextContextMenuOnSecondaryClick(modifier, myVar);
    }
}
