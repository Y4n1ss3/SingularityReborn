package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntOffset;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimationKt {
    private static final SpringSpec<IntOffset> InterruptionSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
}
