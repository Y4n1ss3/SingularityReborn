package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$4$1 extends f30 implements ky {
    public static final AnimatedContentKt$AnimatedContent$4$1 INSTANCE = new AnimatedContentKt$AnimatedContent$4$1();

    public AnimatedContentKt$AnimatedContent$4$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m49scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
    }
}
