package androidx.compose.animation.core;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransitionKt$animateValue$targetValue$1$1 implements iy {
    final /* synthetic */ Transition<S> $this_animateValue;

    public TransitionKt$animateValue$targetValue$1$1(Transition<S> transition) {
        this.$this_animateValue = transition;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [S, java.lang.Object] */
    @Override // defpackage.iy
    public final S invoke() {
        return this.$this_animateValue.getTargetState();
    }
}
