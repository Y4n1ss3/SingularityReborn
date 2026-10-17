package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnGloballyPositionedModifierKt {
    public static final Modifier onGloballyPositioned(Modifier modifier, ky kyVar) {
        return modifier.then(new OnGloballyPositionedElement(kyVar));
    }
}
