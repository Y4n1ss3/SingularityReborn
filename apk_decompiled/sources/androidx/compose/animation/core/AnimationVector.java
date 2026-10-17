package androidx.compose.animation.core;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class AnimationVector {
    public static final int $stable = 0;

    public /* synthetic */ AnimationVector(dq dqVar) {
        this();
    }

    public abstract float get$animation_core(int i);

    public abstract int getSize$animation_core();

    public abstract AnimationVector newVector$animation_core();

    public abstract void reset$animation_core();

    public abstract void set$animation_core(int i, float f);

    private AnimationVector() {
    }
}
