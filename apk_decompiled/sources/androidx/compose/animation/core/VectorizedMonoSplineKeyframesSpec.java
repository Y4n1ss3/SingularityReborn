package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.e10;
import defpackage.g10;
import defpackage.q10;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final g10 keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private MonoSpline monoSpline;
    private final float periodicBias;
    private float[] times;
    private final e10 timestamps;
    private V valueVector;
    private float[][] values;
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(e10 e10Var, g10 g10Var, int i, int i2, float f) {
        this.timestamps = e10Var;
        this.keyframes = g10Var;
        this.durationMillis = i;
        this.delayMillis = i2;
        this.periodicBias = f;
    }

    private final int findEntryForTimeMillis(int i) {
        int a = e10.a(this.timestamps, i);
        return a < -1 ? -(a + 2) : a;
    }

    private final float getEasedTimeFromIndex(int i, int i2) {
        float transform;
        e10 e10Var = this.timestamps;
        if (i >= e10Var.b - 1) {
            transform = i2;
        } else {
            int b = e10Var.b(i);
            int b2 = this.timestamps.b(i + 1);
            if (i2 == b) {
                transform = b;
            } else {
                Easing easing = getEasing(i);
                float f = i2 - b;
                float f2 = b2 - b;
                transform = (easing.transform(f / f2) * f2) + b;
            }
        }
        return transform / 1000.0f;
    }

    private final Easing getEasing(int i) {
        Easing easing;
        xe0 xe0Var = (xe0) this.keyframes.b(this.timestamps.b(i));
        return (xe0Var == null || (easing = (Easing) xe0Var.e) == null) ? EasingKt.getLinearEasing() : easing;
    }

    private final void init(V v, V v2, V v3) {
        float[] fArr;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v3);
            int i = this.timestamps.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = this.timestamps.b(i2) / 1000.0f;
            }
            this.times = fArr2;
        }
        if (this.monoSpline != null && q10.b(this.lastInitialValue, v) && q10.b(this.lastTargetValue, v2)) {
            return;
        }
        boolean b = q10.b(this.lastInitialValue, v);
        boolean b2 = q10.b(this.lastTargetValue, v2);
        this.lastInitialValue = v;
        this.lastTargetValue = v2;
        int size$animation_core = v.getSize$animation_core();
        float[][] fArr3 = this.values;
        if (fArr3 == null) {
            int i3 = this.timestamps.b;
            fArr3 = new float[i3][];
            for (int i4 = 0; i4 < i3; i4++) {
                int b3 = this.timestamps.b(i4);
                xe0 xe0Var = (xe0) this.keyframes.b(b3);
                if (b3 == 0 && xe0Var == null) {
                    fArr = new float[size$animation_core];
                    for (int i5 = 0; i5 < size$animation_core; i5++) {
                        fArr[i5] = v.get$animation_core(i5);
                    }
                } else if (b3 == getDurationMillis() && xe0Var == null) {
                    fArr = new float[size$animation_core];
                    for (int i6 = 0; i6 < size$animation_core; i6++) {
                        fArr[i6] = v2.get$animation_core(i6);
                    }
                } else {
                    xe0Var.getClass();
                    AnimationVector animationVector = (AnimationVector) xe0Var.d;
                    float[] fArr4 = new float[size$animation_core];
                    for (int i7 = 0; i7 < size$animation_core; i7++) {
                        fArr4[i7] = animationVector.get$animation_core(i7);
                    }
                    fArr = fArr4;
                }
                fArr3[i4] = fArr;
            }
            this.values = fArr3;
        } else {
            if (!b && !this.keyframes.a(0)) {
                int a = e10.a(this.timestamps, 0);
                float[] fArr5 = new float[size$animation_core];
                for (int i8 = 0; i8 < size$animation_core; i8++) {
                    fArr5[i8] = v.get$animation_core(i8);
                }
                fArr3[a] = fArr5;
            }
            if (!b2 && !this.keyframes.a(getDurationMillis())) {
                int a2 = e10.a(this.timestamps, getDurationMillis());
                float[] fArr6 = new float[size$animation_core];
                for (int i9 = 0; i9 < size$animation_core; i9++) {
                    fArr6[i9] = v2.get$animation_core(i9);
                }
                fArr3[a2] = fArr6;
            }
        }
        float[] fArr7 = this.times;
        if (fArr7 == null) {
            q10.H("times");
            throw null;
        }
        this.monoSpline = new MonoSpline(fArr7, fArr3, this.periodicBias);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        int clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j / AnimationKt.MillisToNanos);
        xe0 xe0Var = (xe0) this.keyframes.b(clampPlayTime);
        if (xe0Var != null) {
            return (V) xe0Var.d;
        }
        if (clampPlayTime >= getDurationMillis()) {
            return v2;
        }
        if (clampPlayTime <= 0) {
            return v;
        }
        init(v, v2, v3);
        int findEntryForTimeMillis = findEntryForTimeMillis(clampPlayTime);
        V v4 = this.valueVector;
        v4.getClass();
        MonoSpline monoSpline = this.monoSpline;
        monoSpline.getClass();
        monoSpline.getPos(getEasedTimeFromIndex(findEntryForTimeMillis, clampPlayTime), v4, findEntryForTimeMillis);
        return v4;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        int clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j / AnimationKt.MillisToNanos);
        init(v, v2, v3);
        int findEntryForTimeMillis = findEntryForTimeMillis(clampPlayTime);
        V v4 = this.velocityVector;
        v4.getClass();
        MonoSpline monoSpline = this.monoSpline;
        monoSpline.getClass();
        monoSpline.getSlope(getEasedTimeFromIndex(findEntryForTimeMillis, clampPlayTime), v4, findEntryForTimeMillis);
        return v4;
    }
}
