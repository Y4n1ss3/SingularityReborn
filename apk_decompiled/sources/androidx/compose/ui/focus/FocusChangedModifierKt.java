package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusChangedModifierKt {
    public static final Modifier onFocusChanged(Modifier modifier, ky kyVar) {
        return modifier.then(new FocusChangedElement(kyVar));
    }
}
