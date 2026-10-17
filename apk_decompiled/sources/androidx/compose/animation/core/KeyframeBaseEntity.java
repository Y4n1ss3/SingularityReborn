package androidx.compose.animation.core;

import defpackage.dq;
import defpackage.ky;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class KeyframeBaseEntity<T> {
    public static final int $stable = 8;
    private Easing easing;
    private final T value;

    private KeyframeBaseEntity(T t, Easing easing) {
        this.value = t;
        this.easing = easing;
    }

    public final Easing getEasing$animation_core() {
        return this.easing;
    }

    public final T getValue$animation_core() {
        return this.value;
    }

    public final void setEasing$animation_core(Easing easing) {
        this.easing = easing;
    }

    public final <V extends AnimationVector> xe0 toPair$animation_core(ky kyVar) {
        return new xe0(kyVar.invoke(this.value), this.easing);
    }

    public /* synthetic */ KeyframeBaseEntity(Object obj, Easing easing, dq dqVar) {
        this(obj, easing);
    }
}
