package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt {
    public static final float estimatedLazyMaxScrollOffset(int i, int i2, boolean z) {
        return z ? estimatedLazyScrollOffset(i, i2) + 100.0f : estimatedLazyScrollOffset(i, i2);
    }

    public static final float estimatedLazyScrollOffset(int i, int i2) {
        return (i * 500) + i2;
    }

    public static final Modifier lazyLayoutSemantics(Modifier modifier, iy iyVar, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1070136913, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        Modifier then = modifier.then(new LazyLayoutSemanticsModifier(iyVar, lazyLayoutSemanticState, orientation, z, z2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return then;
    }
}
