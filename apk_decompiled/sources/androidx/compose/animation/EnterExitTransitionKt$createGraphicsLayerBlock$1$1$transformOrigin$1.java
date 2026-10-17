package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.graphics.TransformOrigin;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 extends f30 implements ky {
    public static final EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 INSTANCE = new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1();

    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final FiniteAnimationSpec<TransformOrigin> invoke(Transition.Segment<EnterExitState> segment) {
        return AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    }
}
