package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.dq;
import defpackage.e10;
import defpackage.g10;
import defpackage.ma0;
import defpackage.na0;
import defpackage.q10;
import defpackage.xe0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private ArcSpline arcSpline;
    private final Easing defaultEasing;
    private final int delayMillis;
    private final int durationMillis;
    private final int initialArcMode;
    private final g10 keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private int[] modes;
    private float[] posArray;
    private float[] slopeArray;
    private float[] times;
    private final e10 timestamps;
    private V valueVector;
    private V velocityVector;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VectorizedKeyframesSpec(Map<Integer, ? extends xe0> map, int i, int i2) {
        this(r1, r2, i, i2, EasingKt.getLinearEasing(), ArcMode.Companion.m151getArcLinear9TMq4(), null);
        ma0 ma0Var = new ma0(map.size() + 2);
        Iterator<Map.Entry<Integer, ? extends xe0>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            ma0Var.e(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            ma0Var.d();
        }
        if (!map.containsKey(Integer.valueOf(i))) {
            ma0Var.e(i);
        }
        int i3 = ma0Var.b;
        if (i3 != 0) {
            int[] iArr = ma0Var.a;
            iArr.getClass();
            Arrays.sort(iArr, 0, i3);
        }
        na0 na0Var = new na0();
        for (Map.Entry<Integer, ? extends xe0> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            xe0 value = entry.getValue();
            na0Var.i(intValue, new VectorizedKeyframeSpecElementInfo((AnimationVector) value.d, (Easing) value.e, ArcMode.Companion.m151getArcLinear9TMq4(), null));
        }
    }

    private final int findEntryForTimeMillis(int i) {
        int a = e10.a(this.timestamps, i);
        return a < -1 ? -(a + 2) : a;
    }

    private final float getEasedTime(int i) {
        return getEasedTimeFromIndex(findEntryForTimeMillis(i), i, false);
    }

    private final float getEasedTimeFromIndex(int i, int i2, boolean z) {
        Easing easing;
        float f;
        e10 e10Var = this.timestamps;
        if (i >= e10Var.b - 1) {
            f = i2;
        } else {
            int b = e10Var.b(i);
            int b2 = this.timestamps.b(i + 1);
            if (i2 != b) {
                int i3 = b2 - b;
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.keyframes.b(b);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f2 = i3;
                float transform = easing.transform((i2 - b) / f2);
                return z ? transform : ((f2 * transform) + b) / 1000.0f;
            }
            f = b;
        }
        return f / 1000.0f;
    }

    private final void init(V v, V v2, V v3) {
        ArcSpline arcSpline;
        ArcSpline arcSpline2;
        float[] fArr;
        ArcSpline arcSpline3 = this.arcSpline;
        arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
        boolean z = arcSpline3 != arcSpline;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v3);
            int i = this.timestamps.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = this.timestamps.b(i2) / 1000.0f;
            }
            this.times = fArr2;
            int i3 = this.timestamps.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.keyframes.b(this.timestamps.b(i4));
                int m190getArcMode9TMq4 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.m190getArcMode9TMq4() : this.initialArcMode;
                if (!ArcMode.m145equalsimpl0(m190getArcMode9TMq4, ArcMode.Companion.m151getArcLinear9TMq4())) {
                    z = true;
                }
                iArr[i4] = m190getArcMode9TMq4;
            }
            this.modes = iArr;
        }
        if (z) {
            ArcSpline arcSpline4 = this.arcSpline;
            arcSpline2 = VectorizedAnimationSpecKt.EmptyArcSpline;
            if (arcSpline4 != arcSpline2 && q10.b(this.lastInitialValue, v) && q10.b(this.lastTargetValue, v2)) {
                return;
            }
            this.lastInitialValue = v;
            this.lastTargetValue = v2;
            int size$animation_core = v.getSize$animation_core() + (v.getSize$animation_core() % 2);
            this.posArray = new float[size$animation_core];
            this.slopeArray = new float[size$animation_core];
            int i5 = this.timestamps.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int b = this.timestamps.b(i6);
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo2 = (VectorizedKeyframeSpecElementInfo) this.keyframes.b(b);
                if (b == 0 && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size$animation_core];
                    for (int i7 = 0; i7 < size$animation_core; i7++) {
                        fArr[i7] = v.get$animation_core(i7);
                    }
                } else if (b == getDurationMillis() && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size$animation_core];
                    for (int i8 = 0; i8 < size$animation_core; i8++) {
                        fArr[i8] = v2.get$animation_core(i8);
                    }
                } else {
                    vectorizedKeyframeSpecElementInfo2.getClass();
                    AnimationVector vectorValue = vectorizedKeyframeSpecElementInfo2.getVectorValue();
                    float[] fArr4 = new float[size$animation_core];
                    for (int i9 = 0; i9 < size$animation_core; i9++) {
                        fArr4[i9] = vectorValue.get$animation_core(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.arcSpline = new ArcSpline(this.modes, this.times, fArr3);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.animation.core.AnimationVector] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.animation.core.AnimationVector] */
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        ArcSpline arcSpline;
        ?? vectorValue;
        ?? vectorValue2;
        int clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j / AnimationKt.MillisToNanos);
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.keyframes.b(clampPlayTime);
        if (vectorizedKeyframeSpecElementInfo != null) {
            return (V) vectorizedKeyframeSpecElementInfo.getVectorValue();
        }
        if (clampPlayTime >= getDurationMillis()) {
            return v2;
        }
        if (clampPlayTime <= 0) {
            return v;
        }
        init(v, v2, v3);
        V v4 = this.valueVector;
        v4.getClass();
        ArcSpline arcSpline2 = this.arcSpline;
        arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
        int i = 0;
        if (arcSpline2 != arcSpline) {
            float easedTime = getEasedTime(clampPlayTime);
            float[] fArr = this.posArray;
            this.arcSpline.getPos(easedTime, fArr);
            int length = fArr.length;
            while (i < length) {
                v4.set$animation_core(i, fArr[i]);
                i++;
            }
        } else {
            int findEntryForTimeMillis = findEntryForTimeMillis(clampPlayTime);
            float easedTimeFromIndex = getEasedTimeFromIndex(findEntryForTimeMillis, clampPlayTime, true);
            VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo2 = (VectorizedKeyframeSpecElementInfo) this.keyframes.b(this.timestamps.b(findEntryForTimeMillis));
            if (vectorizedKeyframeSpecElementInfo2 != null && (vectorValue2 = vectorizedKeyframeSpecElementInfo2.getVectorValue()) != 0) {
                v = vectorValue2;
            }
            VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo3 = (VectorizedKeyframeSpecElementInfo) this.keyframes.b(this.timestamps.b(findEntryForTimeMillis + 1));
            if (vectorizedKeyframeSpecElementInfo3 != null && (vectorValue = vectorizedKeyframeSpecElementInfo3.getVectorValue()) != 0) {
                v2 = vectorValue;
            }
            int size$animation_core = v4.getSize$animation_core();
            while (i < size$animation_core) {
                v4.set$animation_core(i, (v2.get$animation_core(i) * easedTimeFromIndex) + ((1.0f - easedTimeFromIndex) * v.get$animation_core(i)));
                i++;
            }
        }
        return v4;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        ArcSpline arcSpline;
        long clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j / AnimationKt.MillisToNanos);
        if (clampPlayTime < 0) {
            return v3;
        }
        init(v, v2, v3);
        V v4 = this.velocityVector;
        v4.getClass();
        ArcSpline arcSpline2 = this.arcSpline;
        arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
        int i = 0;
        if (arcSpline2 != arcSpline) {
            float easedTime = getEasedTime((int) clampPlayTime);
            float[] fArr = this.slopeArray;
            this.arcSpline.getSlope(easedTime, fArr);
            int length = fArr.length;
            while (i < length) {
                v4.set$animation_core(i, fArr[i]);
                i++;
            }
        } else {
            AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime - 1, v, v2, v3);
            AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime, v, v2, v3);
            int size$animation_core = valueFromMillis.getSize$animation_core();
            while (i < size$animation_core) {
                v4.set$animation_core(i, (valueFromMillis.get$animation_core(i) - valueFromMillis2.get$animation_core(i)) * 1000.0f);
                i++;
            }
        }
        return v4;
    }

    private VectorizedKeyframesSpec(e10 e10Var, g10 g10Var, int i, int i2, Easing easing, int i3) {
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        ArcSpline arcSpline;
        this.timestamps = e10Var;
        this.keyframes = g10Var;
        this.durationMillis = i;
        this.delayMillis = i2;
        this.defaultEasing = easing;
        this.initialArcMode = i3;
        iArr = VectorizedAnimationSpecKt.EmptyIntArray;
        this.modes = iArr;
        fArr = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.times = fArr;
        fArr2 = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.posArray = fArr2;
        fArr3 = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.slopeArray = fArr3;
        arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
        this.arcSpline = arcSpline;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i, int i2, int i3, dq dqVar) {
        this(map, i, (i3 & 4) != 0 ? 0 : i2);
    }

    public /* synthetic */ VectorizedKeyframesSpec(e10 e10Var, g10 g10Var, int i, int i2, Easing easing, int i3, dq dqVar) {
        this(e10Var, g10Var, i, i2, easing, i3);
    }
}
