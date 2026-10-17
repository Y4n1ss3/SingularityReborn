package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.ConstraintsKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchStateKt {
    private static final String TraversablePrefetchStateNodeKey = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";
    public static final int UnspecifiedNestedPrefetchCount = -1;
    private static final long ZeroConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);

    public static final Modifier traversablePrefetchState(Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        Modifier then;
        return (lazyLayoutPrefetchState == null || (then = modifier.then(new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState))) == null) ? modifier : then;
    }
}
