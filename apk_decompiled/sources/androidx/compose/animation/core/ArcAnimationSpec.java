package androidx.compose.animation.core;

import defpackage.dq;
import defpackage.f10;
import defpackage.h10;
import defpackage.ma0;
import defpackage.na0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArcAnimationSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delayMillis;
    private final int durationMillis;
    private final Easing easing;
    private final int mode;

    public /* synthetic */ ArcAnimationSpec(int i, int i2, int i3, Easing easing, int i4, dq dqVar) {
        this((i4 & 1) != 0 ? ArcMode.Companion.m150getArcBelow9TMq4() : i, (i4 & 2) != 0 ? 300 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? EasingKt.getFastOutSlowInEasing() : easing, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcAnimationSpec)) {
            return false;
        }
        ArcAnimationSpec arcAnimationSpec = (ArcAnimationSpec) obj;
        if (ArcMode.m145equalsimpl0(this.mode, arcAnimationSpec.mode) && this.durationMillis == arcAnimationSpec.durationMillis && this.delayMillis == arcAnimationSpec.delayMillis) {
            return q10.b(this.easing, arcAnimationSpec.easing);
        }
        return false;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    /* renamed from: getMode--9T-Mq4, reason: not valid java name */
    public final int m141getMode9TMq4() {
        return this.mode;
    }

    public int hashCode() {
        return this.easing.hashCode() + (((((ArcMode.m146hashCodeimpl(this.mode) * 31) + this.durationMillis) * 31) + this.delayMillis) * 31);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        int i = this.durationMillis;
        ma0 ma0Var = f10.a;
        ma0 ma0Var2 = new ma0(2);
        ma0Var2.e(0);
        ma0Var2.e(i);
        na0 na0Var = h10.a;
        na0Var.getClass();
        return new VectorizedKeyframesSpec(ma0Var2, na0Var, this.durationMillis, this.delayMillis, this.easing, this.mode, null);
    }

    private ArcAnimationSpec(int i, int i2, int i3, Easing easing) {
        this.mode = i;
        this.durationMillis = i2;
        this.delayMillis = i3;
        this.easing = easing;
    }

    public /* synthetic */ ArcAnimationSpec(int i, int i2, int i3, Easing easing, dq dqVar) {
        this(i, i2, i3, easing);
    }
}
