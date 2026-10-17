package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import defpackage.dq;
import defpackage.g5;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.p10;
import defpackage.te0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;
    private final VectorizedAnimationSpec<AnimationVector1D> vectorizedSpec;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);

    public UpdatableAnimationState(AnimationSpec<Float> animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(zv.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateToZero$lambda$1(UpdatableAnimationState updatableAnimationState, float f, ky kyVar, long j) {
        if (updatableAnimationState.lastFrameTime == Long.MIN_VALUE) {
            updatableAnimationState.lastFrameTime = j;
        }
        AnimationVector1D animationVector1D = new AnimationVector1D(updatableAnimationState.value);
        long durationNanos = f == 0.0f ? updatableAnimationState.vectorizedSpec.getDurationNanos(new AnimationVector1D(updatableAnimationState.value), ZeroVector, updatableAnimationState.lastVelocity) : y80.Q((j - updatableAnimationState.lastFrameTime) / f);
        VectorizedAnimationSpec<AnimationVector1D> vectorizedAnimationSpec = updatableAnimationState.vectorizedSpec;
        AnimationVector1D animationVector1D2 = ZeroVector;
        float value = vectorizedAnimationSpec.getValueFromNanos(durationNanos, animationVector1D, animationVector1D2, updatableAnimationState.lastVelocity).getValue();
        updatableAnimationState.lastVelocity = updatableAnimationState.vectorizedSpec.getVelocityFromNanos(durationNanos, animationVector1D, animationVector1D2, updatableAnimationState.lastVelocity);
        updatableAnimationState.lastFrameTime = j;
        float f2 = updatableAnimationState.value - value;
        updatableAnimationState.value = value;
        kyVar.invoke(Float.valueOf(f2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateToZero$lambda$2(UpdatableAnimationState updatableAnimationState, ky kyVar, long j) {
        float f = updatableAnimationState.value;
        updatableAnimationState.value = 0.0f;
        kyVar.invoke(Float.valueOf(f));
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r13 != 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r15, r0) == r9) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008f -> B:23:0x0092). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateToZero(ky kyVar, iy iyVar, hm hmVar) {
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$1;
        int i;
        ky kyVar2;
        float f;
        iy iyVar2;
        iy iyVar3;
        try {
            if (hmVar instanceof UpdatableAnimationState$animateToZero$1) {
                updatableAnimationState$animateToZero$1 = (UpdatableAnimationState$animateToZero$1) hmVar;
                int i2 = updatableAnimationState$animateToZero$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    updatableAnimationState$animateToZero$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = updatableAnimationState$animateToZero$1.result;
                    i = updatableAnimationState$animateToZero$1.label;
                    vn vnVar = vn.d;
                    if (i != 0) {
                        p10.Q(obj);
                        if (this.isRunning) {
                            InlineClassHelperKt.throwIllegalStateException("animateToZero called while previous animation is running");
                        }
                        MotionDurationScale motionDurationScale = (MotionDurationScale) updatableAnimationState$animateToZero$1.getContext().get(MotionDurationScale.Key);
                        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
                        this.isRunning = true;
                        kyVar2 = kyVar;
                        f = scaleFactor;
                        iyVar2 = iyVar;
                        if (!Companion.isZeroish(this.value)) {
                            g5 g5Var = new g5(this, f, kyVar2);
                            updatableAnimationState$animateToZero$1.L$0 = kyVar2;
                            updatableAnimationState$animateToZero$1.L$1 = iyVar2;
                            updatableAnimationState$animateToZero$1.F$0 = f;
                            updatableAnimationState$animateToZero$1.label = 1;
                            if (MonotonicFrameClockKt.withFrameNanos(g5Var, updatableAnimationState$animateToZero$1) == vnVar) {
                                return vnVar;
                            }
                            iyVar2.invoke();
                        }
                        iyVar3 = iyVar2;
                        if (Math.abs(this.value) == 0.0f) {
                            this.lastFrameTime = Long.MIN_VALUE;
                            this.lastVelocity = ZeroVector;
                            this.isRunning = false;
                            return w01.a;
                        }
                        te0 te0Var = new te0(24, this, kyVar2);
                        updatableAnimationState$animateToZero$1.L$0 = iyVar3;
                        updatableAnimationState$animateToZero$1.L$1 = null;
                        updatableAnimationState$animateToZero$1.label = 2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            iyVar3 = (iy) updatableAnimationState$animateToZero$1.L$0;
                            p10.Q(obj);
                            iyVar3.invoke();
                            this.lastFrameTime = Long.MIN_VALUE;
                            this.lastVelocity = ZeroVector;
                            this.isRunning = false;
                            return w01.a;
                        }
                        f = updatableAnimationState$animateToZero$1.F$0;
                        iy iyVar4 = (iy) updatableAnimationState$animateToZero$1.L$1;
                        ky kyVar3 = (ky) updatableAnimationState$animateToZero$1.L$0;
                        p10.Q(obj);
                        iyVar2 = iyVar4;
                        kyVar2 = kyVar3;
                        iyVar2.invoke();
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.lastFrameTime = Long.MIN_VALUE;
            this.lastVelocity = ZeroVector;
            this.isRunning = false;
            throw th;
        }
        updatableAnimationState$animateToZero$1 = new UpdatableAnimationState$animateToZero$1(this, hmVar);
        Object obj2 = updatableAnimationState$animateToZero$1.result;
        i = updatableAnimationState$animateToZero$1.label;
        vn vnVar2 = vn.d;
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f) {
            return Math.abs(f) < 0.01f;
        }

        private Companion() {
        }
    }
}
