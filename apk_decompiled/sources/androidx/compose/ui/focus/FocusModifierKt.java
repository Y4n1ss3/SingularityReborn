package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusModifierKt {
    @er
    public static final Modifier focusModifier(Modifier modifier) {
        return focusTarget(modifier);
    }

    public static final Modifier focusTarget(Modifier modifier) {
        return modifier.then(FocusTargetNode.FocusTargetElement.INSTANCE);
    }
}
