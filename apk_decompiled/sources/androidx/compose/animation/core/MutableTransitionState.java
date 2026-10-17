package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MutableTransitionState<S> extends TransitionState<S> {
    public static final int $stable = 0;
    private final MutableState currentState$delegate;
    private final MutableState targetState$delegate;

    public MutableTransitionState(S s) {
        super(null);
        this.currentState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final boolean isIdle() {
        return q10.b(getCurrentState(), getTargetState()) && !isRunning$animation_core();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core(S s) {
        this.currentState$delegate.setValue(s);
    }

    @Override // androidx.compose.animation.core.TransitionState
    /* renamed from: setTargetState, reason: merged with bridge method [inline-methods] */
    public void setTargetState$animation_core(S s) {
        this.targetState$delegate.setValue(s);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core() {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core(Transition<S> transition) {
    }
}
