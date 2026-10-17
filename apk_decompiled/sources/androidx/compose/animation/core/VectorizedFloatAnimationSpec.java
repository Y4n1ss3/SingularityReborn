package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int i) {
                return FloatAnimationSpec.this;
            }
        });
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v, V v2, V v3) {
        int size$animation_core = v.getSize$animation_core();
        long j = 0;
        for (int i = 0; i < size$animation_core; i++) {
            j = Math.max(j, this.anims.get(i).getDurationNanos(v.get$animation_core(i), v2.get$animation_core(i), v3.get$animation_core(i)));
        }
        return j;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V v, V v2, V v3) {
        V v4 = this.endVelocityVector;
        if (v4 == null) {
            v4 = (V) AnimationVectorsKt.newInstance(v3);
            this.endVelocityVector = v4;
        }
        if (v4 == null) {
            q10.H("endVelocityVector");
            throw null;
        }
        int size$animation_core = v4.getSize$animation_core();
        int i = 0;
        while (true) {
            V v5 = this.endVelocityVector;
            if (i >= size$animation_core) {
                if (v5 != null) {
                    return v5;
                }
                q10.H("endVelocityVector");
                throw null;
            }
            if (v5 == null) {
                q10.H("endVelocityVector");
                throw null;
            }
            v5.set$animation_core(i, this.anims.get(i).getEndVelocity(v.get$animation_core(i), v2.get$animation_core(i), v3.get$animation_core(i)));
            i++;
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        V v4 = this.valueVector;
        if (v4 == null) {
            v4 = (V) AnimationVectorsKt.newInstance(v);
            this.valueVector = v4;
        }
        if (v4 == null) {
            q10.H("valueVector");
            throw null;
        }
        int size$animation_core = v4.getSize$animation_core();
        int i = 0;
        while (true) {
            V v5 = this.valueVector;
            if (i >= size$animation_core) {
                if (v5 != null) {
                    return v5;
                }
                q10.H("valueVector");
                throw null;
            }
            if (v5 == null) {
                q10.H("valueVector");
                throw null;
            }
            v5.set$animation_core(i, this.anims.get(i).getValueFromNanos(j, v.get$animation_core(i), v2.get$animation_core(i), v3.get$animation_core(i)));
            i++;
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        V v4 = this.velocityVector;
        if (v4 == null) {
            v4 = (V) AnimationVectorsKt.newInstance(v3);
            this.velocityVector = v4;
        }
        if (v4 == null) {
            q10.H("velocityVector");
            throw null;
        }
        int size$animation_core = v4.getSize$animation_core();
        int i = 0;
        while (true) {
            V v5 = this.velocityVector;
            if (i >= size$animation_core) {
                if (v5 != null) {
                    return v5;
                }
                q10.H("velocityVector");
                throw null;
            }
            if (v5 == null) {
                q10.H("velocityVector");
                throw null;
            }
            v5.set$animation_core(i, this.anims.get(i).getVelocityFromNanos(j, v.get$animation_core(i), v2.get$animation_core(i), v3.get$animation_core(i)));
            i++;
        }
    }

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.anims = animations;
    }
}
