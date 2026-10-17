package androidx.compose.animation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class EnterTransitionImpl extends EnterTransition {
    private final TransitionData data;

    public EnterTransitionImpl(TransitionData transitionData) {
        super(null);
        this.data = transitionData;
    }

    @Override // androidx.compose.animation.EnterTransition
    public TransitionData getData$animation() {
        return this.data;
    }
}
