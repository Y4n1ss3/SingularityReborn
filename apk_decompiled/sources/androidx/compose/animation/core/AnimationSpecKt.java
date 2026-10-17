package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.KeyframesWithSplineSpec;
import defpackage.dq;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t) {
        if (t == null) {
            return null;
        }
        return (V) twoWayConverter.getConvertToVector().invoke(t);
    }

    public static final <T> AnimationSpec<T> delayed(AnimationSpec<T> animationSpec, long j) {
        return new StartDelayAnimationSpec(animationSpec, j);
    }

    @er
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, StartOffset.m170constructorimpl$default(0, 0, 2, null), (dq) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i, Object obj) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    /* renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m137infiniteRepeatable9IiC70o(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        return new InfiniteRepeatableSpec<>(durationBasedAnimationSpec, repeatMode, j, (dq) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m138infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = StartOffset.m170constructorimpl$default(0, 0, 2, null);
        }
        return m137infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j);
    }

    public static final <T> KeyframesSpec<T> keyframes(ky kyVar) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        kyVar.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(ky kyVar) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        kyVar.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig);
    }

    @er
    public static final /* synthetic */ RepeatableSpec repeatable(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new RepeatableSpec(i, durationBasedAnimationSpec, repeatMode, StartOffset.m170constructorimpl$default(0, 0, 2, null), (dq) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i, durationBasedAnimationSpec, repeatMode);
    }

    /* renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> RepeatableSpec<T> m139repeatable91I0pcU(int i, DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        return new RepeatableSpec<>(i, durationBasedAnimationSpec, repeatMode, j, (dq) null);
    }

    /* renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m140repeatable91I0pcU$default(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i2 & 8) != 0) {
            j = StartOffset.m170constructorimpl$default(0, 0, 2, null);
        }
        return m139repeatable91I0pcU(i, durationBasedAnimationSpec, repeatMode, j);
    }

    public static final <T> SnapSpec<T> snap(int i) {
        return new SnapSpec<>(i);
    }

    public static /* synthetic */ SnapSpec snap$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return snap(i);
    }

    public static final <T> SpringSpec<T> spring(float f, float f2, T t) {
        return new SpringSpec<>(f, f2, t);
    }

    public static /* synthetic */ SpringSpec spring$default(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return spring(f, f2, obj);
    }

    public static final <T> TweenSpec<T> tween(int i, int i2, Easing easing) {
        return new TweenSpec<>(i, i2, easing);
    }

    public static /* synthetic */ TweenSpec tween$default(int i, int i2, Easing easing, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i, i2, easing);
    }

    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(float f, ky kyVar) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        kyVar.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig, f);
    }
}
