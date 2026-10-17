package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SystemGestureExclusionKt {
    private static final Modifier excludeFromSystemGestureQ(ky kyVar) {
        return new ExcludeFromSystemGestureElement(kyVar);
    }

    public static final Modifier systemGestureExclusion(Modifier modifier) {
        return modifier.then(new ExcludeFromSystemGestureElement(null));
    }

    public static final Modifier systemGestureExclusion(Modifier modifier, ky kyVar) {
        return modifier.then(new ExcludeFromSystemGestureElement(kyVar));
    }
}
