package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusableKt {
    public static final Modifier focusGroup(Modifier modifier) {
        return modifier.then(FocusGroupElement.INSTANCE);
    }

    public static final Modifier focusable(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource) {
        return modifier.then(z ? new FocusableElement(mutableInteractionSource) : Modifier.Companion);
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }
}
