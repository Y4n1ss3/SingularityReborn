package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.p01;
import defpackage.q10;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeferredTargetAnimation<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final MutableState _pendingTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private Animatable<T, V> animatable;
    private final TwoWayConverter<T, V> vectorConverter;

    public DeferredTargetAnimation(TwoWayConverter<T, V> twoWayConverter) {
        this.vectorConverter = twoWayConverter;
    }

    private final T getTarget() {
        Animatable<T, V> animatable = this.animatable;
        if (animatable != null) {
            return animatable.getTargetValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T get_pendingTarget() {
        return this._pendingTarget$delegate.getValue();
    }

    private final void set_pendingTarget(T t) {
        this._pendingTarget$delegate.setValue(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateTarget$default(DeferredTargetAnimation deferredTargetAnimation, Object obj, un unVar, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj2) {
        if ((i & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return deferredTargetAnimation.updateTarget(obj, unVar, finiteAnimationSpec);
    }

    public final T getPendingTarget() {
        return get_pendingTarget();
    }

    public final boolean isIdle() {
        if (!q10.b(get_pendingTarget(), getTarget())) {
            return false;
        }
        Animatable<T, V> animatable = this.animatable;
        return animatable == null || !animatable.isRunning();
    }

    public final T updateTarget(T t, un unVar, FiniteAnimationSpec<T> finiteAnimationSpec) {
        T t2;
        Animatable<T, V> animatable;
        set_pendingTarget(t);
        Animatable<T, V> animatable2 = this.animatable;
        if (animatable2 == null) {
            Animatable<T, V> animatable3 = new Animatable<>(t, this.vectorConverter, null, null, 12, null);
            this.animatable = animatable3;
            animatable = animatable3;
            t2 = t;
        } else {
            t2 = t;
            animatable = animatable2;
        }
        p01.t(unVar, null, null, new DeferredTargetAnimation$updateTarget$1(animatable, this, t2, finiteAnimationSpec, null), 3);
        return animatable.getValue();
    }
}
