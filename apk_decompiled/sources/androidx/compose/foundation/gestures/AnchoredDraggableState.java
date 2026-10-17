package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.d1;
import defpackage.dq;
import defpackage.er;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.ny;
import defpackage.oy;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;
import defpackage.w4;
import defpackage.y4;
import defpackage.y80;
import defpackage.z4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState$anchoredDragScope$1 anchoredDragScope;
    private final MutableState anchors$delegate;
    private ky confirmValueChange;
    private final MutableState currentValue$delegate;
    public DecayAnimationSpec<Float> decayAnimationSpec;
    private final MutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    public ky positionalThreshold;
    private final State progress$delegate;
    private final MutableState settledValue$delegate;
    public AnimationSpec<Float> snapAnimationSpec;
    private final State targetValue$delegate;
    public iy velocityThreshold;

    public AnchoredDraggableState(T t) {
        this.confirmValueChange = new d1(10);
        this.dragMutex = new MutatorMutex();
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.settledValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        final int i = 0;
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new iy(this) { // from class: t4
            public final /* synthetic */ AnchoredDraggableState e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                Object targetValue_delegate$lambda$0;
                float progress_delegate$lambda$0;
                int i2 = i;
                AnchoredDraggableState anchoredDraggableState = this.e;
                switch (i2) {
                    case 0:
                        targetValue_delegate$lambda$0 = AnchoredDraggableState.targetValue_delegate$lambda$0(anchoredDraggableState);
                        return targetValue_delegate$lambda$0;
                    default:
                        progress_delegate$lambda$0 = AnchoredDraggableState.progress_delegate$lambda$0(anchoredDraggableState);
                        return Float.valueOf(progress_delegate$lambda$0);
                }
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        final int i2 = 1;
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new iy(this) { // from class: t4
            public final /* synthetic */ AnchoredDraggableState e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                Object targetValue_delegate$lambda$0;
                float progress_delegate$lambda$0;
                int i22 = i2;
                AnchoredDraggableState anchoredDraggableState = this.e;
                switch (i22) {
                    case 0:
                        targetValue_delegate$lambda$0 = AnchoredDraggableState.targetValue_delegate$lambda$0(anchoredDraggableState);
                        return targetValue_delegate$lambda$0;
                    default:
                        progress_delegate$lambda$0 = AnchoredDraggableState.progress_delegate$lambda$0(anchoredDraggableState);
                        return Float.valueOf(progress_delegate$lambda$0);
                }
            }
        });
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Object obj) {
        return true;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, ny nyVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, nyVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean confirmValueChange$lambda$0(Object obj) {
        return true;
    }

    private final T getDragTarget() {
        return this.dragTarget$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float progress_delegate$lambda$0(AnchoredDraggableState anchoredDraggableState) {
        float positionOf = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getSettledValue());
        float positionOf2 = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getTargetValue()) - positionOf;
        float abs = Math.abs(positionOf2);
        if (Float.isNaN(abs) || abs <= 1.0E-6f) {
            return 1.0f;
        }
        float requireOffset = (anchoredDraggableState.requireOffset() - positionOf) / positionOf2;
        if (requireOffset < 1.0E-6f) {
            return 0.0f;
        }
        if (requireOffset > 0.999999f) {
            return 1.0f;
        }
        return requireOffset;
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors$delegate.setValue(draggableAnchors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue$delegate.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragTarget(T t) {
        this.dragTarget$delegate.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity$delegate.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f) {
        this.offset$delegate.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSettledValue(T t) {
        this.settledValue$delegate.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object targetValue_delegate$lambda$0(AnchoredDraggableState anchoredDraggableState) {
        Object dragTarget = anchoredDraggableState.getDragTarget();
        if (dragTarget != null) {
            return dragTarget;
        }
        if (Float.isNaN(anchoredDraggableState.getOffset())) {
            return anchoredDraggableState.getCurrentValue();
        }
        T closestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
        return closestAnchor == null ? anchoredDraggableState.getCurrentValue() : closestAnchor;
    }

    private final boolean trySnapTo(T t) {
        MutatorMutex mutatorMutex = this.dragMutex;
        boolean tryLock = mutatorMutex.tryLock();
        if (!tryLock) {
            return tryLock;
        }
        try {
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.anchoredDragScope;
            float positionOf = getAnchors().positionOf(t);
            if (!Float.isNaN(positionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDraggableState$anchoredDragScope$1, positionOf, 0.0f, 2, null);
                setDragTarget(null);
            }
            setCurrentValue(t);
            setSettledValue(t);
            mutatorMutex.unlock();
            return tryLock;
        } catch (Throwable th) {
            mutatorMutex.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            if (Float.isNaN(anchoredDraggableState.getOffset())) {
                obj = anchoredDraggableState.getTargetValue();
            } else {
                obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset());
                if (obj == null) {
                    obj = anchoredDraggableState.getTargetValue();
                }
            }
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(T t, MutatePriority mutatePriority, oy oyVar, hm hmVar) {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        int i;
        try {
            if (hmVar instanceof AnchoredDraggableState$anchoredDrag$3) {
                anchoredDraggableState$anchoredDrag$3 = (AnchoredDraggableState$anchoredDrag$3) hmVar;
                int i2 = anchoredDraggableState$anchoredDrag$3.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableState$anchoredDrag$3.label = i2 - Integer.MIN_VALUE;
                    Object obj = anchoredDraggableState$anchoredDrag$3.result;
                    i = anchoredDraggableState$anchoredDrag$3.label;
                    if (i != 0) {
                        p10.Q(obj);
                        if (!getAnchors().hasPositionFor(t)) {
                            if (((Boolean) this.confirmValueChange.invoke(t)).booleanValue()) {
                                setSettledValue(t);
                                setCurrentValue(t);
                            }
                            return w01.a;
                        }
                        MutatorMutex mutatorMutex = this.dragMutex;
                        AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new AnchoredDraggableState$anchoredDrag$4(this, t, oyVar, null);
                        anchoredDraggableState$anchoredDrag$3.label = 1;
                        Object mutate = mutatorMutex.mutate(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3);
                        vn vnVar = vn.d;
                        if (mutate == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    return w01.a;
                }
            }
            if (i != 0) {
            }
            return w01.a;
        } finally {
            setDragTarget(null);
        }
        anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, hmVar);
        Object obj2 = anchoredDraggableState$anchoredDrag$3.result;
        i = anchoredDraggableState$anchoredDrag$3.label;
    }

    public final float dispatchRawDelta(float f) {
        float newOffsetForDelta$foundation = newOffsetForDelta$foundation(f);
        float requireOffset = newOffsetForDelta$foundation - requireOffset();
        AnchoredDragScope.dragTo$default(this.anchoredDragScope, newOffsetForDelta$foundation, 0.0f, 2, null);
        return requireOffset;
    }

    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    public final ky getConfirmValueChange$foundation() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        DecayAnimationSpec<Float> decayAnimationSpec = this.decayAnimationSpec;
        if (decayAnimationSpec != null) {
            return decayAnimationSpec;
        }
        q10.H("decayAnimationSpec");
        throw null;
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    public final ky getPositionalThreshold$foundation() {
        ky kyVar = this.positionalThreshold;
        if (kyVar != null) {
            return kyVar;
        }
        q10.H("positionalThreshold");
        throw null;
    }

    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getSettledValue() {
        return this.settledValue$delegate.getValue();
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        AnimationSpec<Float> animationSpec = this.snapAnimationSpec;
        if (animationSpec != null) {
            return animationSpec;
        }
        q10.H("snapAnimationSpec");
        throw null;
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final boolean getUsePreModifierChangeBehavior$foundation() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    public final iy getVelocityThreshold$foundation() {
        iy iyVar = this.velocityThreshold;
        if (iyVar != null) {
            return iyVar;
        }
        q10.H("velocityThreshold");
        throw null;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$foundation(float f) {
        return y80.g((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f, getAnchors().minPosition(), getAnchors().maxPosition());
    }

    public final float progress(T t, T t2) {
        float positionOf = getAnchors().positionOf(t);
        float positionOf2 = getAnchors().positionOf(t2);
        float g = (y80.g(getOffset(), Math.min(positionOf, positionOf2), Math.max(positionOf, positionOf2)) - positionOf) / (positionOf2 - positionOf);
        if (Float.isNaN(g)) {
            return 1.0f;
        }
        if (g < 1.0E-6f) {
            return 0.0f;
        }
        if (g > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(g);
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            InlineClassHelperKt.throwIllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    public final void setConfirmValueChange$foundation(ky kyVar) {
        this.confirmValueChange = kyVar;
    }

    public final void setDecayAnimationSpec$foundation(DecayAnimationSpec<Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    public final void setPositionalThreshold$foundation(ky kyVar) {
        this.positionalThreshold = kyVar;
    }

    public final void setSnapAnimationSpec$foundation(AnimationSpec<Float> animationSpec) {
        this.snapAnimationSpec = animationSpec;
    }

    public final void setVelocityThreshold$foundation(iy iyVar) {
        this.velocityThreshold = iyVar;
    }

    @er
    public final Object settle(float f, hm hmVar) {
        if (!getUsePreModifierChangeBehavior$foundation()) {
            InlineClassHelperKt.throwIllegalArgumentException("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T currentValue = getCurrentValue();
        Object computeTarget = AnchoredDraggableKt.computeTarget(getAnchors(), requireOffset(), f, getPositionalThreshold$foundation(), getVelocityThreshold$foundation());
        return ((Boolean) this.confirmValueChange.invoke(computeTarget)).booleanValue() ? AnchoredDraggableKt.animateToWithDecay$default(this, computeTarget, f, null, null, hmVar, 12, null) : AnchoredDraggableKt.animateToWithDecay$default(this, currentValue, f, null, null, hmVar, 12, null);
    }

    public final void updateAnchors(DraggableAnchors<T> draggableAnchors, T t) {
        if (q10.b(getAnchors(), draggableAnchors)) {
            return;
        }
        setAnchors(draggableAnchors);
        if (trySnapTo(t)) {
            return;
        }
        setDragTarget(t);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public static /* synthetic */ Saver Saver$default(Companion companion, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, ky kyVar, iy iyVar, ky kyVar2, int i, Object obj) {
            if ((i & 16) != 0) {
                kyVar2 = new d1(14);
            }
            return companion.Saver(animationSpec, decayAnimationSpec, kyVar, iyVar, kyVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object Saver$lambda$0(SaverScope saverScope, AnchoredDraggableState anchoredDraggableState) {
            return anchoredDraggableState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AnchoredDraggableState Saver$lambda$1(Object obj) {
            return new AnchoredDraggableState(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean Saver$lambda$2(Object obj) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object Saver$lambda$3(SaverScope saverScope, AnchoredDraggableState anchoredDraggableState) {
            return anchoredDraggableState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AnchoredDraggableState Saver$lambda$4(ky kyVar, Object obj) {
            return new AnchoredDraggableState(obj, kyVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean Saver$lambda$5(Object obj) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object Saver$lambda$6(SaverScope saverScope, AnchoredDraggableState anchoredDraggableState) {
            return anchoredDraggableState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AnchoredDraggableState Saver$lambda$7(ky kyVar, iy iyVar, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, ky kyVar2, Object obj) {
            return AnchoredDraggableKt.AnchoredDraggableState(obj, kyVar, iyVar, animationSpec, decayAnimationSpec, kyVar2);
        }

        @er
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, ky kyVar, iy iyVar, ky kyVar2) {
            return SaverKt.Saver(new w4(1), new y4(animationSpec, decayAnimationSpec, kyVar, iyVar, kyVar2));
        }

        private Companion() {
        }

        @er
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(ky kyVar) {
            return SaverKt.Saver(new w4(2), new z4(kyVar, 0));
        }

        public static /* synthetic */ Saver Saver$default(Companion companion, ky kyVar, int i, Object obj) {
            if ((i & 1) != 0) {
                kyVar = new d1(13);
            }
            return companion.Saver(kyVar);
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver() {
            return SaverKt.Saver(new w4(3), new d1(15));
        }
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, oy oyVar, hm hmVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, oyVar, hmVar);
    }

    @er
    public static /* synthetic */ void getDecayAnimationSpec$annotations() {
    }

    @er
    public static /* synthetic */ void getProgress$annotations() {
    }

    @er
    public static /* synthetic */ void getSnapAnimationSpec$annotations() {
    }

    public static /* synthetic */ void getUsePreModifierChangeBehavior$foundation$annotations() {
    }

    public final Object settle(AnimationSpec<Float> animationSpec, hm hmVar) {
        T currentValue = getCurrentValue();
        T closestAnchor = getAnchors().closestAnchor(requireOffset());
        vn vnVar = vn.d;
        w01 w01Var = w01.a;
        if (closestAnchor != null && ((Boolean) this.confirmValueChange.invoke(closestAnchor)).booleanValue()) {
            Object animateTo = AnchoredDraggableKt.animateTo(this, closestAnchor, animationSpec, hmVar);
            return animateTo == vnVar ? animateTo : w01Var;
        }
        Object animateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, animationSpec, hmVar);
        return animateTo2 == vnVar ? animateTo2 : w01Var;
    }

    public AnchoredDraggableState(T t, DraggableAnchors<T> draggableAnchors) {
        this(t);
        setAnchors(draggableAnchors);
        trySnapTo(t);
    }

    @er
    public AnchoredDraggableState(T t, ky kyVar) {
        this(t);
        this.confirmValueChange = kyVar;
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, ky kyVar, int i, dq dqVar) {
        this(obj, draggableAnchors, (i & 4) != 0 ? new d1(12) : kyVar);
    }

    @er
    public AnchoredDraggableState(T t, DraggableAnchors<T> draggableAnchors, ky kyVar) {
        this(t, kyVar);
        setAnchors(draggableAnchors);
        trySnapTo(t);
    }

    public final Object anchoredDrag(MutatePriority mutatePriority, ny nyVar, hm hmVar) {
        Object mutate = this.dragMutex.mutate(mutatePriority, new AnchoredDraggableState$anchoredDrag$2(this, nyVar, null), hmVar);
        return mutate == vn.d ? mutate : w01.a;
    }
}
