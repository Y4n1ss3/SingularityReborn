package androidx.compose.animation.core;

import defpackage.dq;
import defpackage.er;
import defpackage.ma0;
import defpackage.na0;
import defpackage.q10;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final KeyframesSpecConfig<T> config;

    public KeyframesSpec(KeyframesSpecConfig<T> keyframesSpecConfig) {
        this.config = keyframesSpecConfig;
    }

    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i;
        ma0 ma0Var = new ma0(this.config.getKeyframes$animation_core().e + 2);
        na0 na0Var = new na0(this.config.getKeyframes$animation_core().e);
        na0 keyframes$animation_core = this.config.getKeyframes$animation_core();
        int[] iArr3 = keyframes$animation_core.b;
        Object[] objArr = keyframes$animation_core.c;
        long[] jArr3 = keyframes$animation_core.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            KeyframeEntity keyframeEntity = (KeyframeEntity) objArr[i6];
                            ma0Var.e(i7);
                            i = i3;
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            na0Var.i(i7, new VectorizedKeyframeSpecElementInfo((AnimationVector) twoWayConverter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core()), keyframeEntity.getEasing$animation_core(), keyframeEntity.m153getArcMode9TMq4$animation_core(), null));
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.config.getKeyframes$animation_core().a(0)) {
            ma0Var.d();
        }
        if (!this.config.getKeyframes$animation_core().a(this.config.getDurationMillis())) {
            ma0Var.e(this.config.getDurationMillis());
        }
        int i8 = ma0Var.b;
        if (i8 != 0) {
            int[] iArr4 = ma0Var.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i8);
        }
        return new VectorizedKeyframesSpec<>(ma0Var, na0Var, this.config.getDurationMillis(), this.config.getDelayMillis(), EasingKt.getLinearEasing(), ArcMode.Companion.m151getArcLinear9TMq4(), null);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public static final int $stable = 8;

        public KeyframesSpecConfig() {
            super(null);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> at(T t, int i) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t, null, 0, 6, null);
            getKeyframes$animation_core().i(i, keyframeEntity);
            return keyframeEntity;
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> atFraction(T t, float f) {
            return at((KeyframesSpecConfig<T>) t, Math.round(getDurationMillis() * f));
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> createEntityFor$animation_core(T t) {
            return new KeyframeEntity<>(t, null, 0, 6, null);
        }

        /* renamed from: using-ngzHuyU, reason: not valid java name */
        public final KeyframeEntity<T> m155usingngzHuyU(KeyframeEntity<T> keyframeEntity, int i) {
            keyframeEntity.m154setArcModeRur9ykg$animation_core(i);
            return keyframeEntity;
        }

        @er
        public final void with(KeyframeEntity<T> keyframeEntity, Easing easing) {
            keyframeEntity.setEasing$animation_core(easing);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core(Object obj) {
            return createEntityFor$animation_core((KeyframesSpecConfig<T>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity atFraction(Object obj, float f) {
            return atFraction((KeyframesSpecConfig<T>) obj, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity at(Object obj, int i) {
            return at((KeyframesSpecConfig<T>) obj, i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
        public static final int $stable = 8;
        private int arcMode;

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i, int i2, dq dqVar) {
            this(obj, (i2 & 2) != 0 ? EasingKt.getLinearEasing() : easing, (i2 & 4) != 0 ? ArcMode.Companion.m151getArcLinear9TMq4() : i, null);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyframeEntity)) {
                return false;
            }
            KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
            return q10.b(keyframeEntity.getValue$animation_core(), getValue$animation_core()) && q10.b(keyframeEntity.getEasing$animation_core(), getEasing$animation_core()) && ArcMode.m145equalsimpl0(keyframeEntity.arcMode, this.arcMode);
        }

        /* renamed from: getArcMode--9T-Mq4$animation_core, reason: not valid java name */
        public final int m153getArcMode9TMq4$animation_core() {
            return this.arcMode;
        }

        public int hashCode() {
            T value$animation_core = getValue$animation_core();
            int hashCode = value$animation_core != null ? value$animation_core.hashCode() : 0;
            return getEasing$animation_core().hashCode() + ((ArcMode.m146hashCodeimpl(this.arcMode) + (hashCode * 31)) * 31);
        }

        /* renamed from: setArcMode-Rur9ykg$animation_core, reason: not valid java name */
        public final void m154setArcModeRur9ykg$animation_core(int i) {
            this.arcMode = i;
        }

        private KeyframeEntity(T t, Easing easing, int i) {
            super(t, easing, null);
            this.arcMode = i;
        }

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i, dq dqVar) {
            this(obj, easing, i);
        }
    }
}
