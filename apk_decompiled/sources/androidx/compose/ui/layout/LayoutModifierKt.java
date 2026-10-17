package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayoutModifierKt {
    public static final Modifier layout(Modifier modifier, ny nyVar) {
        return modifier.then(new LayoutElement(nyVar));
    }
}
