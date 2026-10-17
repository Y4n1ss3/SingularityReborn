package androidx.compose.animation.core;

import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimationVector3D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float v1;
    private float v2;
    private float v3;

    public AnimationVector3D(float f, float f2, float f3) {
        super(null);
        this.v1 = f;
        this.v2 = f2;
        this.v3 = f3;
        this.size = 3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector3D)) {
            return false;
        }
        AnimationVector3D animationVector3D = (AnimationVector3D) obj;
        return animationVector3D.v1 == this.v1 && animationVector3D.v2 == this.v2 && animationVector3D.v3 == this.v3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core(int i) {
        if (i == 0) {
            return this.v1;
        }
        if (i == 1) {
            return this.v2;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.v3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core() {
        return this.size;
    }

    public final float getV1() {
        return this.v1;
    }

    public final float getV2() {
        return this.v2;
    }

    public final float getV3() {
        return this.v3;
    }

    public int hashCode() {
        return Float.hashCode(this.v3) + bv.a(this.v2, Float.hashCode(this.v1) * 31, 31);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector3D newVector$animation_core() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core(int i, float f) {
        if (i == 0) {
            this.v1 = f;
        } else if (i == 1) {
            this.v2 = f;
        } else {
            if (i != 2) {
                return;
            }
            this.v3 = f;
        }
    }

    public final void setV1$animation_core(float f) {
        this.v1 = f;
    }

    public final void setV2$animation_core(float f) {
        this.v2 = f;
    }

    public final void setV3$animation_core(float f) {
        this.v3 = f;
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3;
    }
}
