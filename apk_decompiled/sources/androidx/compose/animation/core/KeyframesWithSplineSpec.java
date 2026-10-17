package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import defpackage.ma0;
import defpackage.na0;
import defpackage.xe0;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyframesWithSplineSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final KeyframesWithSplineSpecConfig<T> config;
    private float periodicBias;

    public KeyframesWithSplineSpec(KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig) {
        this.config = keyframesWithSplineSpecConfig;
        this.periodicBias = Float.NaN;
    }

    public final KeyframesWithSplineSpecConfig<T> getConfig() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        na0 keyframes$animation_core = this.config.getKeyframes$animation_core();
        ma0 ma0Var = new ma0(keyframes$animation_core.e + 2);
        na0 na0Var = new na0(keyframes$animation_core.e);
        int[] iArr3 = keyframes$animation_core.b;
        Object[] objArr3 = keyframes$animation_core.c;
        long[] jArr = keyframes$animation_core.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            KeyframesSpec.KeyframeEntity keyframeEntity = (KeyframesSpec.KeyframeEntity) objArr3[i6];
                            ma0Var.e(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            na0Var.i(i7, new xe0(twoWayConverter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core()), keyframeEntity.getEasing$animation_core()));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!keyframes$animation_core.a(0)) {
            ma0Var.d();
        }
        if (!keyframes$animation_core.a(this.config.getDurationMillis())) {
            ma0Var.e(this.config.getDurationMillis());
        }
        int i8 = ma0Var.b;
        if (i8 != 0) {
            int[] iArr4 = ma0Var.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i8);
        }
        return new VectorizedMonoSplineKeyframesSpec(ma0Var, na0Var, this.config.getDurationMillis(), this.config.getDelayMillis(), this.periodicBias);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class KeyframesWithSplineSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframesSpec.KeyframeEntity<T>> {
        public static final int $stable = 8;

        public KeyframesWithSplineSpecConfig() {
            super(null);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframesSpec.KeyframeEntity<T> createEntityFor$animation_core(T t) {
            return new KeyframesSpec.KeyframeEntity<>(t, null, 0, 6, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core(Object obj) {
            return createEntityFor$animation_core((KeyframesWithSplineSpecConfig<T>) obj);
        }
    }

    public KeyframesWithSplineSpec(KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig, float f) {
        this(keyframesWithSplineSpecConfig);
        this.periodicBias = f;
    }
}
