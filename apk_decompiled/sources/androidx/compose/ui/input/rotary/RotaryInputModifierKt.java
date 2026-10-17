package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RotaryInputModifierKt {
    public static final Modifier onPreRotaryScrollEvent(Modifier modifier, ky kyVar) {
        return modifier.then(new RotaryInputElement(null, kyVar));
    }

    public static final Modifier onRotaryScrollEvent(Modifier modifier, ky kyVar) {
        return modifier.then(new RotaryInputElement(kyVar, null));
    }
}
