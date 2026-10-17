package androidx.compose.animation.core;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import defpackage.fo0;
import defpackage.hm;
import defpackage.ji0;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.ss0;
import defpackage.te0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z30;
import defpackage.z4;
import defpackage.zv;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SuspendAnimationKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4 A[Catch: CancellationException -> 0x0042, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0042, blocks: (B:16:0x003d, B:18:0x00d7, B:20:0x00e4, B:25:0x0107), top: B:15:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, V extends AnimationVector> Object animate(AnimationState<T, V> animationState, Animation<T, V> animation, long j, final ky kyVar, hm hmVar) {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$42;
        int i;
        vn vnVar;
        final ji0 ji0Var;
        final AnimationState<T, V> animationState2;
        AnimationState<T, V> animationState3;
        final float durationScale;
        ji0 ji0Var2;
        ky kyVar2;
        AnimationScope animationScope;
        AnimationScope animationScope2;
        Object obj;
        ky kyVar3;
        final Animation<T, V> animation2 = animation;
        if (hmVar instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) hmVar;
            int i2 = suspendAnimationKt$animate$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.label = i2 - Integer.MIN_VALUE;
                suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
                Object obj2 = suspendAnimationKt$animate$42.result;
                i = suspendAnimationKt$animate$42.label;
                int i3 = 0;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj2);
                    final T valueFromNanos = animation2.getValueFromNanos(0L);
                    final V velocityVectorFromNanos = animation2.getVelocityVectorFromNanos(0L);
                    ji0Var = new ji0();
                    if (j == Long.MIN_VALUE) {
                        try {
                            durationScale = getDurationScale(suspendAnimationKt$animate$42.getContext());
                            animationState2 = animationState;
                        } catch (CancellationException e) {
                            e = e;
                            animationState2 = animationState;
                        }
                        try {
                            ky kyVar4 = new ky() { // from class: rs0
                                @Override // defpackage.ky
                                public final Object invoke(Object obj3) {
                                    w01 animate$lambda$3;
                                    animate$lambda$3 = SuspendAnimationKt.animate$lambda$3(ji0.this, valueFromNanos, animation2, velocityVectorFromNanos, animationState2, durationScale, kyVar, ((Long) obj3).longValue());
                                    return animate$lambda$3;
                                }
                            };
                            ji0Var2 = ji0Var;
                            try {
                                suspendAnimationKt$animate$42.L$0 = animationState2;
                                suspendAnimationKt$animate$42.L$1 = animation2;
                                suspendAnimationKt$animate$42.L$2 = kyVar;
                                suspendAnimationKt$animate$42.L$3 = ji0Var2;
                                suspendAnimationKt$animate$42.label = 1;
                                if (callWithFrameNanos(animation2, kyVar4, suspendAnimationKt$animate$42) != vnVar) {
                                    animationState3 = animationState2;
                                    kyVar2 = kyVar;
                                }
                                return vnVar;
                            } catch (CancellationException e2) {
                                e = e2;
                                animationState3 = animationState2;
                                ji0Var = ji0Var2;
                                animationScope = (AnimationScope) ji0Var.d;
                                if (animationScope != null) {
                                    animationScope.setRunning$animation_core(false);
                                }
                                animationScope2 = (AnimationScope) ji0Var.d;
                                if (animationScope2 != null && animationScope2.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                                    animationState3.setRunning$animation_core(false);
                                }
                                throw e;
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            animationState3 = animationState2;
                            animationScope = (AnimationScope) ji0Var.d;
                            if (animationScope != null) {
                            }
                            animationScope2 = (AnimationScope) ji0Var.d;
                            if (animationScope2 != null) {
                            }
                            throw e;
                        }
                    }
                    ji0Var2 = ji0Var;
                    try {
                        AnimationScope animationScope3 = new AnimationScope(valueFromNanos, animation2.getTypeConverter(), velocityVectorFromNanos, j, animation2.getTargetValue(), j, true, new ss0(i3, animationState));
                        doAnimationFrameWithScale(animationScope3, j, getDurationScale(suspendAnimationKt$animate$42.getContext()), animation2, animationState, kyVar);
                        ji0Var2.d = animationScope3;
                        animationState3 = animationState;
                        animation2 = animation;
                        kyVar2 = kyVar;
                    } catch (CancellationException e4) {
                        e = e4;
                        animationState3 = animationState;
                        ji0Var = ji0Var2;
                        animationScope = (AnimationScope) ji0Var.d;
                        if (animationScope != null) {
                        }
                        animationScope2 = (AnimationScope) ji0Var.d;
                        if (animationScope2 != null) {
                            animationState3.setRunning$animation_core(false);
                        }
                        throw e;
                    }
                    ji0Var = ji0Var2;
                } else {
                    if (i != 1 && i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ji0Var = (ji0) suspendAnimationKt$animate$42.L$3;
                    kyVar2 = (ky) suspendAnimationKt$animate$42.L$2;
                    animation2 = (Animation) suspendAnimationKt$animate$42.L$1;
                    animationState3 = (AnimationState) suspendAnimationKt$animate$42.L$0;
                    try {
                        p10.Q(obj2);
                    } catch (CancellationException e5) {
                        e = e5;
                        animationScope = (AnimationScope) ji0Var.d;
                        if (animationScope != null) {
                        }
                        animationScope2 = (AnimationScope) ji0Var.d;
                        if (animationScope2 != null) {
                        }
                        throw e;
                    }
                }
                do {
                    obj = ji0Var.d;
                    obj.getClass();
                    if (((AnimationScope) obj).isRunning()) {
                        return w01.a;
                    }
                    final float durationScale2 = getDurationScale(suspendAnimationKt$animate$42.getContext());
                    final ji0 ji0Var3 = ji0Var;
                    final ky kyVar5 = kyVar2;
                    final Animation<T, V> animation3 = animation2;
                    final AnimationState<T, V> animationState4 = animationState3;
                    try {
                        kyVar3 = new ky() { // from class: ts0
                            @Override // defpackage.ky
                            public final Object invoke(Object obj3) {
                                w01 animate$lambda$6;
                                animate$lambda$6 = SuspendAnimationKt.animate$lambda$6(ji0.this, durationScale2, animation3, animationState4, kyVar5, ((Long) obj3).longValue());
                                return animate$lambda$6;
                            }
                        };
                        ji0Var = ji0Var3;
                        animation2 = animation3;
                        animationState3 = animationState4;
                        kyVar2 = kyVar5;
                        suspendAnimationKt$animate$42.L$0 = animationState3;
                        suspendAnimationKt$animate$42.L$1 = animation2;
                        suspendAnimationKt$animate$42.L$2 = kyVar2;
                        suspendAnimationKt$animate$42.L$3 = ji0Var;
                        suspendAnimationKt$animate$42.label = 2;
                    } catch (CancellationException e6) {
                        e = e6;
                        ji0Var = ji0Var3;
                        animationState3 = animationState4;
                        animationScope = (AnimationScope) ji0Var.d;
                        if (animationScope != null) {
                        }
                        animationScope2 = (AnimationScope) ji0Var.d;
                        if (animationScope2 != null) {
                        }
                        throw e;
                    }
                } while (callWithFrameNanos(animation2, kyVar3, suspendAnimationKt$animate$42) != vnVar);
                return vnVar;
            }
        }
        suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(hmVar);
        suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
        Object obj22 = suspendAnimationKt$animate$42.result;
        i = suspendAnimationKt$animate$42.label;
        int i32 = 0;
        vnVar = vn.d;
        if (i != 0) {
        }
        do {
            obj = ji0Var.d;
            obj.getClass();
            if (((AnimationScope) obj).isRunning()) {
            }
        } while (callWithFrameNanos(animation2, kyVar3, suspendAnimationKt$animate$42) != vnVar);
        return vnVar;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j, ky kyVar, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            kyVar = new fo0(6);
        }
        return animate(animationState, animation, j2, kyVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animate$lambda$1(my myVar, TwoWayConverter twoWayConverter, AnimationScope animationScope) {
        myVar.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animate$lambda$2(AnimationScope animationScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animate$lambda$3(ji0 ji0Var, Object obj, Animation animation, AnimationVector animationVector, AnimationState animationState, float f, ky kyVar, long j) {
        AnimationScope animationScope = new AnimationScope(obj, animation.getTypeConverter(), animationVector, j, animation.getTargetValue(), j, true, new ss0(1, animationState));
        doAnimationFrameWithScale(animationScope, j, f, animation, animationState, kyVar);
        ji0Var.d = animationScope;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animate$lambda$3$0(AnimationState animationState) {
        animationState.setRunning$animation_core(false);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animate$lambda$4(AnimationState animationState) {
        animationState.setRunning$animation_core(false);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animate$lambda$6(ji0 ji0Var, float f, Animation animation, AnimationState animationState, ky kyVar, long j) {
        Object obj = ji0Var.d;
        obj.getClass();
        doAnimationFrameWithScale((AnimationScope) obj, j, f, animation, animationState, kyVar);
        return w01.a;
    }

    public static final <T, V extends AnimationVector> Object animateDecay(AnimationState<T, V> animationState, DecayAnimationSpec<T> decayAnimationSpec, boolean z, ky kyVar, hm hmVar) {
        Object animate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) animationState.getTypeConverter(), (Object) animationState.getValue(), (AnimationVector) animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, kyVar, hmVar);
        return animate == vn.d ? animate : w01.a;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z, ky kyVar, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            kyVar = new fo0(5);
        }
        return animateDecay(animationState, decayAnimationSpec, z, kyVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateDecay$lambda$0(my myVar, AnimationScope animationScope) {
        myVar.invoke(animationScope.getValue(), Float.valueOf(((AnimationVector1D) animationScope.getVelocityVector()).getValue()));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateDecay$lambda$1(AnimationScope animationScope) {
        return w01.a;
    }

    public static final <T, V extends AnimationVector> Object animateTo(AnimationState<T, V> animationState, T t, AnimationSpec<T> animationSpec, boolean z, ky kyVar, hm hmVar) {
        Object animate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t, animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, kyVar, hmVar);
        return animate == vn.d ? animate : w01.a;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, ky kyVar, hm hmVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            kyVar = new fo0(7);
        }
        return animateTo(animationState, obj, animationSpec2, z2, kyVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateTo$lambda$0(AnimationScope animationScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, ky kyVar, hm hmVar) {
        return animation.isInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(kyVar, hmVar) : MonotonicFrameClockKt.withFrameNanos(new z4(kyVar, 9), hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object callWithFrameNanos$lambda$0(ky kyVar, long j) {
        return kyVar.invoke(Long.valueOf(j));
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j, long j2, Animation<T, V> animation, AnimationState<T, V> animationState, ky kyVar) {
        animationScope.setLastFrameTimeNanos$animation_core(j);
        animationScope.setValue$animation_core(animation.getValueFromNanos(j2));
        animationScope.setVelocityVector$animation_core(animation.getVelocityVectorFromNanos(j2));
        if (animation.isFinishedFromNanos(j2)) {
            animationScope.setFinishedTimeNanos$animation_core(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core(false);
        }
        updateState(animationScope, animationState);
        kyVar.invoke(animationScope);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j, float f, Animation<T, V> animation, AnimationState<T, V> animationState, ky kyVar) {
        doAnimationFrame(animationScope, j, f == 0.0f ? animation.getDurationNanos() : (long) ((j - animationScope.getStartTimeNanos()) / f), animation, animationState, kyVar);
    }

    public static final float getDurationScale(kn knVar) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) knVar.get(MotionDurationScale.Key);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (!(scaleFactor >= 0.0f)) {
            PreconditionsKt.throwIllegalStateException("negative scale factor");
        }
        return scaleFactor;
    }

    public static final <T, V extends AnimationVector> void updateState(AnimationScope<T, V> animationScope, AnimationState<T, V> animationState) {
        animationState.setValue$animation_core(animationScope.getValue());
        AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core(animationScope.isRunning());
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, my myVar, hm hmVar, int i, Object obj4) {
        if ((i & 8) != 0) {
            obj3 = null;
        }
        if ((i & 16) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(twoWayConverter, obj, obj2, obj3, animationSpec, myVar, hmVar);
    }

    public static /* synthetic */ Object animate$default(float f, float f2, float f3, AnimationSpec animationSpec, my myVar, hm hmVar, int i, Object obj) {
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f, f2, f3, animationSpec, myVar, hmVar);
    }

    public static final Object animateDecay(float f, float f2, FloatDecayAnimationSpec floatDecayAnimationSpec, my myVar, hm hmVar) {
        Object animate$default = animate$default(AnimationStateKt.AnimationState$default(f, f2, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f, f2), 0L, new z30(1, myVar), hmVar, 2, null);
        return animate$default == vn.d ? animate$default : w01.a;
    }

    public static final <T, V extends AnimationVector> Object animate(TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3, AnimationSpec<T> animationSpec, my myVar, hm hmVar) {
        AnimationVector newInstance;
        if (t3 == null || (newInstance = (AnimationVector) twoWayConverter.getConvertToVector().invoke(t3)) == null) {
            newInstance = AnimationVectorsKt.newInstance((AnimationVector) twoWayConverter.getConvertToVector().invoke(t));
        }
        AnimationVector animationVector = newInstance;
        Object animate$default = animate$default(new AnimationState(twoWayConverter, t, animationVector, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t, t2, animationVector), 0L, new te0(12, myVar, twoWayConverter), hmVar, 2, null);
        return animate$default == vn.d ? animate$default : w01.a;
    }

    public static final Object animate(float f, float f2, float f3, AnimationSpec<Float> animationSpec, my myVar, hm hmVar) {
        Object animate = animate(VectorConvertersKt.getVectorConverter(zv.a), new Float(f), new Float(f2), new Float(f3), animationSpec, myVar, hmVar);
        return animate == vn.d ? animate : w01.a;
    }
}
