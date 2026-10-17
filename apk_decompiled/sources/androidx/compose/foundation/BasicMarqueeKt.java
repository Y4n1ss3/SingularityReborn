package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import defpackage.pc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicMarqueeKt {
    /* renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m230MarqueeSpacing0680j_4(float f) {
        return new pc(f, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MarqueeSpacing_0680j_4$lambda$0(float f, Density density, int i, int i2) {
        return density.mo361roundToPx0680j_4(f);
    }

    /* renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m232basicMarquee1Mj1MLw(Modifier modifier, int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f) {
        return modifier.then(new MarqueeModifierElement(i, i2, i3, i4, marqueeSpacing, f, null));
    }

    /* renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m233basicMarquee1Mj1MLw$default(Modifier modifier, int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = MarqueeDefaults.INSTANCE.getIterations();
        }
        if ((i5 & 2) != 0) {
            i2 = MarqueeAnimationMode.Companion.m304getImmediatelyZbEOnfQ();
        }
        if ((i5 & 4) != 0) {
            i3 = MarqueeDefaults.INSTANCE.getRepeatDelayMillis();
        }
        if ((i5 & 8) != 0) {
            i4 = MarqueeAnimationMode.m300equalsimpl0(i2, MarqueeAnimationMode.Companion.m304getImmediatelyZbEOnfQ()) ? i3 : 0;
        }
        if ((i5 & 16) != 0) {
            marqueeSpacing = MarqueeDefaults.INSTANCE.getSpacing();
        }
        if ((i5 & 32) != 0) {
            f = MarqueeDefaults.INSTANCE.m306getVelocityD9Ej5fM();
        }
        return m232basicMarquee1Mj1MLw(modifier, i, i2, i3, i4, marqueeSpacing, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m234createMarqueeAnimationSpecZ4HSEVQ(int i, float f, int i2, int i3, float f2, Density density) {
        TweenSpec<Float> velocityBasedTween = velocityBasedTween(Math.abs(density.mo367toPx0680j_4(f2)), f, i3);
        long m170constructorimpl$default = StartOffset.m170constructorimpl$default((-i3) + i2, 0, 2, null);
        return i == Integer.MAX_VALUE ? AnimationSpecKt.m138infiniteRepeatable9IiC70o$default(velocityBasedTween, null, m170constructorimpl$default, 2, null) : AnimationSpecKt.m140repeatable91I0pcU$default(i, velocityBasedTween, null, m170constructorimpl$default, 4, null);
    }

    private static final TweenSpec<Float> velocityBasedTween(float f, float f2, int i) {
        return AnimationSpecKt.tween((int) Math.ceil(f2 / (f / 1000.0f)), i, EasingKt.getLinearEasing());
    }
}
