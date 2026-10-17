package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuModifier_androidKt {
    public static final Modifier addTextContextMenuComponentsWithContext(Modifier modifier, my myVar) {
        return modifier.then(new AddTextContextMenuDataComponentsWithContextElement(myVar));
    }
}
