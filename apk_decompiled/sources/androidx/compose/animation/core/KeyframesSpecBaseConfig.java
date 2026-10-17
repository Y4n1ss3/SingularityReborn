package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframeBaseEntity;
import defpackage.dq;
import defpackage.h10;
import defpackage.na0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {
    public static final int $stable = 8;
    private int delayMillis;
    private int durationMillis;
    private final na0 keyframes;

    private KeyframesSpecBaseConfig() {
        this.durationMillis = 300;
        na0 na0Var = h10.a;
        this.keyframes = new na0();
    }

    public E at(T t, int i) {
        E createEntityFor$animation_core = createEntityFor$animation_core(t);
        this.keyframes.i(i, createEntityFor$animation_core);
        return createEntityFor$animation_core;
    }

    public E atFraction(T t, float f) {
        return at(t, Math.round(this.durationMillis * f));
    }

    public abstract E createEntityFor$animation_core(T t);

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final na0 getKeyframes$animation_core() {
        return this.keyframes;
    }

    public final void setDelayMillis(int i) {
        this.delayMillis = i;
    }

    public final void setDurationMillis(int i) {
        this.durationMillis = i;
    }

    public final E using(E e, Easing easing) {
        e.setEasing$animation_core(easing);
        return e;
    }

    public /* synthetic */ KeyframesSpecBaseConfig(dq dqVar) {
        this();
    }
}
