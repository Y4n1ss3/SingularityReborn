package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureKt {
    @er
    public static final Modifier excludeFromSystemGesture(Modifier modifier) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    @er
    public static final Modifier excludeFromSystemGesture(Modifier modifier, ky kyVar) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, kyVar);
    }
}
