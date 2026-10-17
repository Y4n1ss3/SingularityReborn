package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransitionKt$animateValue$animationSpec$1$1 implements iy {
    final /* synthetic */ Transition<S> $this_animateValue;

    public TransitionKt$animateValue$animationSpec$1$1(Transition<S> transition) {
        this.$this_animateValue = transition;
    }

    @Override // defpackage.iy
    public final Transition.Segment<S> invoke() {
        return this.$this_animateValue.getSegment();
    }
}
