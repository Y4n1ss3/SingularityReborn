package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@LazyScopeMarker
/* loaded from: classes.dex */
public interface LazyItemScope {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier animateItem(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, FiniteAnimationSpec<Float> finiteAnimationSpec3) {
            return LazyItemScope.super.animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier animateItem$default(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: animateItem");
            return null;
        }
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec2 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec3 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        return lazyItemScope.animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    static /* synthetic */ Modifier fillParentMaxHeight$default(LazyItemScope lazyItemScope, Modifier modifier, float f, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
            return null;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope.fillParentMaxHeight(modifier, f);
    }

    static /* synthetic */ Modifier fillParentMaxSize$default(LazyItemScope lazyItemScope, Modifier modifier, float f, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
            return null;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope.fillParentMaxSize(modifier, f);
    }

    static /* synthetic */ Modifier fillParentMaxWidth$default(LazyItemScope lazyItemScope, Modifier modifier, float f, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
            return null;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope.fillParentMaxWidth(modifier, f);
    }

    Modifier fillParentMaxHeight(Modifier modifier, float f);

    Modifier fillParentMaxSize(Modifier modifier, float f);

    Modifier fillParentMaxWidth(Modifier modifier, float f);

    default Modifier animateItem(Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        return modifier;
    }
}
