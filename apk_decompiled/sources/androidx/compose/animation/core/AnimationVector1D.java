package androidx.compose.animation.core;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimationVector1D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float value;

    public AnimationVector1D(float f) {
        super(null);
        this.value = f;
        this.size = 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnimationVector1D) && ((AnimationVector1D) obj).value == this.value;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core(int i) {
        if (i == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core() {
        return this.size;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector1D newVector$animation_core() {
        return new AnimationVector1D(0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core(int i, float f) {
        if (i == 0) {
            this.value = f;
        }
    }

    public final void setValue$animation_core(float f) {
        this.value = f;
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }
}
