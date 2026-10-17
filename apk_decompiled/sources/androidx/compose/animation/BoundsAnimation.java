package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import defpackage.iy;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoundsAnimation {
    public static final int $stable = 8;
    private final MutableState animation$delegate;
    private FiniteAnimationSpec<Rect> animationSpec;
    private final MutableState animationState$delegate;
    private final MutableState boundsTransform$delegate;
    private final iy momentumOffset;
    private final Transition<Boolean> transition;
    private final SharedTransitionScope transitionScope;

    public BoundsAnimation(SharedTransitionScope sharedTransitionScope, Transition<Boolean> transition, Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation, BoundsTransform boundsTransform, iy iyVar) {
        SpringSpec springSpec;
        this.transitionScope = sharedTransitionScope;
        this.transition = transition;
        this.momentumOffset = iyVar;
        this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(deferredAnimation, null, 2, null);
        this.boundsTransform$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsTransform, null, 2, null);
        springSpec = BoundsAnimationKt.DefaultBoundsAnimation;
        this.animationSpec = springSpec;
        this.animationState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static /* synthetic */ void animate$default(BoundsAnimation boundsAnimation, Rect rect, Rect rect2, BoundsTransform boundsTransform, int i, Object obj) {
        if ((i & 4) != 0) {
            boundsTransform = null;
        }
        boundsAnimation.animate(rect, rect2, boundsTransform);
    }

    private final BoundsTransform getBoundsTransform() {
        return (BoundsTransform) this.boundsTransform$delegate.getValue();
    }

    private final void setAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation) {
        this.animation$delegate.setValue(deferredAnimation);
    }

    private final void setBoundsTransform(BoundsTransform boundsTransform) {
        this.boundsTransform$delegate.setValue(boundsTransform);
    }

    public final void animate(Rect rect, Rect rect2, BoundsTransform boundsTransform) {
        if (this.transitionScope.isTransitionActive()) {
            if (getAnimationState() == null) {
                if (boundsTransform == null) {
                    boundsTransform = getBoundsTransform();
                }
                this.animationSpec = boundsTransform.createAnimationSpec(rect, rect2);
            }
            setAnimationState(getAnimation().animate(new BoundsAnimation$animate$1(this), new BoundsAnimation$animate$2(this, rect2, rect)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> getAnimation() {
        return (Transition.DeferredAnimation) this.animation$delegate.getValue();
    }

    public final FiniteAnimationSpec<Rect> getAnimationSpec() {
        return this.animationSpec;
    }

    public final State<Rect> getAnimationState() {
        return (State) this.animationState$delegate.getValue();
    }

    public final iy getMomentumOffset() {
        return this.momentumOffset;
    }

    public final boolean getTarget() {
        return this.transition.getTargetState().booleanValue();
    }

    public final Transition<Boolean> getTransition() {
        return this.transition;
    }

    public final SharedTransitionScope getTransitionScope() {
        return this.transitionScope;
    }

    public final Rect getValue() {
        State<Rect> animationState;
        Rect value;
        if (!this.transitionScope.isTransitionActive() || (animationState = getAnimationState()) == null || (value = animationState.getValue()) == null) {
            return null;
        }
        long m4526unboximpl = ((Offset) this.momentumOffset.invoke()).m4526unboximpl();
        return !Offset.m4513equalsimpl0(m4526unboximpl, Offset.Companion.m4532getZeroF1C5BW0()) ? value.m4553translatek4lQ0M(m4526unboximpl) : value;
    }

    public final boolean isRunning() {
        Transition transition = this.transition;
        while (transition.getParentTransition() != null) {
            transition = transition.getParentTransition();
            transition.getClass();
        }
        return !q10.b(transition.getCurrentState(), transition.getTargetState());
    }

    public final void setAnimationSpec(FiniteAnimationSpec<Rect> finiteAnimationSpec) {
        this.animationSpec = finiteAnimationSpec;
    }

    public final void setAnimationState(State<Rect> state) {
        this.animationState$delegate.setValue(state);
    }

    public final void updateAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation, BoundsTransform boundsTransform) {
        SpringSpec springSpec;
        if (!q10.b(getAnimation(), deferredAnimation)) {
            setAnimation(deferredAnimation);
            setAnimationState(null);
            springSpec = BoundsAnimationKt.DefaultBoundsAnimation;
            this.animationSpec = springSpec;
        }
        setBoundsTransform(boundsTransform);
    }
}
