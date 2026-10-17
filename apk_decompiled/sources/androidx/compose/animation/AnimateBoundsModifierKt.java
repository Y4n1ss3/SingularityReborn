package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LookaheadScope;
import defpackage.o6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimateBoundsModifierKt {
    private static final BoundsTransform DefaultBoundsTransform = new o6(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec DefaultBoundsTransform$lambda$0(Rect rect, Rect rect2) {
        return AnimationSpecKt.spring(1.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion));
    }

    public static final Modifier animateBounds(Modifier modifier, LookaheadScope lookaheadScope, Modifier modifier2, BoundsTransform boundsTransform, boolean z) {
        return modifier.then(new BoundsAnimationElement(lookaheadScope, boundsTransform, AnimateBoundsModifierKt$animateBounds$1.INSTANCE, z)).then(modifier2).then(new BoundsAnimationElement(lookaheadScope, boundsTransform, AnimateBoundsModifierKt$animateBounds$2.INSTANCE, z));
    }

    public static /* synthetic */ Modifier animateBounds$default(Modifier modifier, LookaheadScope lookaheadScope, Modifier modifier2, BoundsTransform boundsTransform, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            modifier2 = Modifier.Companion;
        }
        if ((i & 4) != 0) {
            boundsTransform = DefaultBoundsTransform;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return animateBounds(modifier, lookaheadScope, modifier2, boundsTransform, z);
    }
}
