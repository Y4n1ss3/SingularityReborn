package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HoverableKt {
    public static final Modifier hoverable(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z) {
        return modifier.then(z ? new HoverableElement(mutableInteractionSource) : Modifier.Companion);
    }

    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hoverable(modifier, mutableInteractionSource, z);
    }
}
