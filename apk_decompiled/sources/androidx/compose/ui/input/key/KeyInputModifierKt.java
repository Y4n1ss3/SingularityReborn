package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyInputModifierKt {
    public static final Modifier onKeyEvent(Modifier modifier, ky kyVar) {
        return modifier.then(new KeyInputElement(kyVar, null));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, ky kyVar) {
        return modifier.then(new KeyInputElement(null, kyVar));
    }
}
