package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material3.internal.AnchoredDraggableState;
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
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.ny;
import defpackage.o;
import defpackage.oy;
import defpackage.p10;
import defpackage.q10;
import defpackage.v4;
import defpackage.vn;
import defpackage.w01;
import defpackage.w4;
import defpackage.x4;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDragScope anchoredDragScope;
    private final MutableState anchors$delegate;
    private final iy animationSpec;
    private final State closestValue$delegate;
    private final ky confirmValueChange;
    private final MutableState currentValue$delegate;
    private final InternalMutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final DraggableState draggableState;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    private final ky positionalThreshold;
    private final State progress$delegate;
    private final State targetValue$delegate;
    private final iy velocityThreshold;

    public AnchoredDraggableState(T t, ky kyVar, iy iyVar, iy iyVar2, ky kyVar2) {
        MapDraggableAnchors emptyDraggableAnchors;
        this.positionalThreshold = kyVar;
        this.velocityThreshold = iyVar;
        this.animationSpec = iyVar2;
        this.confirmValueChange = kyVar2;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        final int i = 0;
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new iy(this) { // from class: u4
            public final /* synthetic */ AnchoredDraggableState e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                Object targetValue_delegate$lambda$3;
                Object closestValue_delegate$lambda$5;
                float progress_delegate$lambda$7;
                int i2 = i;
                AnchoredDraggableState anchoredDraggableState = this.e;
                switch (i2) {
                    case 0:
                        targetValue_delegate$lambda$3 = AnchoredDraggableState.targetValue_delegate$lambda$3(anchoredDraggableState);
                        return targetValue_delegate$lambda$3;
                    case 1:
                        closestValue_delegate$lambda$5 = AnchoredDraggableState.closestValue_delegate$lambda$5(anchoredDraggableState);
                        return closestValue_delegate$lambda$5;
                    default:
                        progress_delegate$lambda$7 = AnchoredDraggableState.progress_delegate$lambda$7(anchoredDraggableState);
                        return Float.valueOf(progress_delegate$lambda$7);
                }
            }
        });
        final int i2 = 1;
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new iy(this) { // from class: u4
            public final /* synthetic */ AnchoredDraggableState e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                Object targetValue_delegate$lambda$3;
                Object closestValue_delegate$lambda$5;
                float progress_delegate$lambda$7;
                int i22 = i2;
                AnchoredDraggableState anchoredDraggableState = this.e;
                switch (i22) {
                    case 0:
                        targetValue_delegate$lambda$3 = AnchoredDraggableState.targetValue_delegate$lambda$3(anchoredDraggableState);
                        return targetValue_delegate$lambda$3;
                    case 1:
                        closestValue_delegate$lambda$5 = AnchoredDraggableState.closestValue_delegate$lambda$5(anchoredDraggableState);
                        return closestValue_delegate$lambda$5;
                    default:
                        progress_delegate$lambda$7 = AnchoredDraggableState.progress_delegate$lambda$7(anchoredDraggableState);
                        return Float.valueOf(progress_delegate$lambda$7);
                }
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        final int i3 = 2;
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new iy(this) { // from class: u4
            public final /* synthetic */ AnchoredDraggableState e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                Object targetValue_delegate$lambda$3;
                Object closestValue_delegate$lambda$5;
                float progress_delegate$lambda$7;
                int i22 = i3;
                AnchoredDraggableState anchoredDraggableState = this.e;
                switch (i22) {
                    case 0:
                        targetValue_delegate$lambda$3 = AnchoredDraggableState.targetValue_delegate$lambda$3(anchoredDraggableState);
                        return targetValue_delegate$lambda$3;
                    case 1:
                        closestValue_delegate$lambda$5 = AnchoredDraggableState.closestValue_delegate$lambda$5(anchoredDraggableState);
                        return closestValue_delegate$lambda$5;
                    default:
                        progress_delegate$lambda$7 = AnchoredDraggableState.progress_delegate$lambda$7(anchoredDraggableState);
                        return Float.valueOf(progress_delegate$lambda$7);
                }
            }
        });
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        emptyDraggableAnchors = AnchoredDraggableKt.emptyDraggableAnchors();
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(emptyDraggableAnchors, null, 2, null);
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material3.internal.AnchoredDragScope
            public void dragTo(float f, float f2) {
                this.this$0.setOffset(f);
                this.this$0.setLastVelocity(f2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(Object obj) {
        return true;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, ny nyVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, nyVar, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object closestValue_delegate$lambda$5(AnchoredDraggableState anchoredDraggableState) {
        Object dragTarget = anchoredDraggableState.getDragTarget();
        if (dragTarget != null) {
            return dragTarget;
        }
        float offset = anchoredDraggableState.getOffset();
        return !Float.isNaN(offset) ? anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue()) : anchoredDraggableState.getCurrentValue();
    }

    private final T computeTarget(float f, T t, float f2) {
        DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(t);
        float floatValue = ((Number) this.velocityThreshold.invoke()).floatValue();
        if (positionOf == f) {
            return t;
        }
        if (!Float.isNaN(positionOf)) {
            if (positionOf < f) {
                if (f2 >= floatValue) {
                    T closestAnchor = anchors.closestAnchor(f, true);
                    closestAnchor.getClass();
                    return closestAnchor;
                }
                T closestAnchor2 = anchors.closestAnchor(f, true);
                closestAnchor2.getClass();
                if (f >= Math.abs(Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(closestAnchor2) - positionOf)))).floatValue()) + positionOf)) {
                    return closestAnchor2;
                }
            } else {
                if (f2 <= (-floatValue)) {
                    T closestAnchor3 = anchors.closestAnchor(f, false);
                    closestAnchor3.getClass();
                    return closestAnchor3;
                }
                T closestAnchor4 = anchors.closestAnchor(f, false);
                closestAnchor4.getClass();
                float abs = Math.abs(positionOf - Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(positionOf - anchors.positionOf(closestAnchor4))))).floatValue()));
                if (f >= 0.0f ? f <= abs : Math.abs(f) >= abs) {
                    return closestAnchor4;
                }
            }
        }
        return t;
    }

    private final T computeTargetWithoutThresholds(float f, T t) {
        DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(t);
        if (positionOf == f) {
            return t;
        }
        if (!Float.isNaN(positionOf)) {
            if (positionOf < f) {
                T closestAnchor = anchors.closestAnchor(f, true);
                if (closestAnchor != null) {
                    return closestAnchor;
                }
            } else {
                T closestAnchor2 = anchors.closestAnchor(f, false);
                if (closestAnchor2 != null) {
                    return closestAnchor2;
                }
            }
        }
        return t;
    }

    private final T getDragTarget() {
        return this.dragTarget$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float progress_delegate$lambda$7(AnchoredDraggableState anchoredDraggableState) {
        float positionOf = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getCurrentValue());
        float positionOf2 = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getClosestValue$material3()) - positionOf;
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

    private final void setCurrentValue(T t) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object targetValue_delegate$lambda$3(AnchoredDraggableState anchoredDraggableState) {
        Object dragTarget = anchoredDraggableState.getDragTarget();
        if (dragTarget != null) {
            return dragTarget;
        }
        float offset = anchoredDraggableState.getOffset();
        return !Float.isNaN(offset) ? anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f) : anchoredDraggableState.getCurrentValue();
    }

    private final boolean trySnapTo(T t) {
        return this.dragMutex.tryMutate(new v4(0, this, t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final w01 trySnapTo$lambda$9(AnchoredDraggableState anchoredDraggableState, Object obj) {
        AnchoredDragScope anchoredDragScope = anchoredDraggableState.anchoredDragScope;
        float positionOf = anchoredDraggableState.getAnchors().positionOf(obj);
        if (!Float.isNaN(positionOf)) {
            AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
            anchoredDraggableState.setDragTarget(null);
        }
        anchoredDraggableState.setCurrentValue(obj);
        return w01.a;
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(T t, MutatePriority mutatePriority, oy oyVar, hm hmVar) {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        int i;
        T closestAnchor;
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
                        if (!getAnchors().hasAnchorFor(t)) {
                            setCurrentValue(t);
                            return w01.a;
                        }
                        InternalMutatorMutex internalMutatorMutex = this.dragMutex;
                        AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new AnchoredDraggableState$anchoredDrag$4(this, t, oyVar, null);
                        anchoredDraggableState$anchoredDrag$3.label = 1;
                        Object mutate = internalMutatorMutex.mutate(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3);
                        vn vnVar = vn.d;
                        if (mutate == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    if (closestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && ((Boolean) this.confirmValueChange.invoke(closestAnchor)).booleanValue()) {
                        setCurrentValue(closestAnchor);
                    }
                    return w01.a;
                }
            }
            if (i != 0) {
            }
            if (closestAnchor != null) {
                setCurrentValue(closestAnchor);
            }
            return w01.a;
        } finally {
            setDragTarget(null);
            closestAnchor = getAnchors().closestAnchor(getOffset());
            if (closestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && ((Boolean) this.confirmValueChange.invoke(closestAnchor)).booleanValue()) {
                setCurrentValue(closestAnchor);
            }
        }
        anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, hmVar);
        Object obj2 = anchoredDraggableState$anchoredDrag$3.result;
        i = anchoredDraggableState$anchoredDrag$3.label;
    }

    public final float dispatchRawDelta(float f) {
        float newOffsetForDelta$material3 = newOffsetForDelta$material3(f);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(newOffsetForDelta$material3);
        return newOffsetForDelta$material3 - offset;
    }

    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    public final iy getAnimationSpec() {
        return this.animationSpec;
    }

    public final T getClosestValue$material3() {
        return (T) this.closestValue$delegate.getValue();
    }

    public final ky getConfirmValueChange$material3() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final DraggableState getDraggableState$material3() {
        return this.draggableState;
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    public final ky getPositionalThreshold$material3() {
        return this.positionalThreshold;
    }

    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final iy getVelocityThreshold$material3() {
        return this.velocityThreshold;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$material3(float f) {
        return y80.g((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float requireOffset() {
        if (!Float.isNaN(getOffset())) {
            return getOffset();
        }
        o.f("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final Object settle(float f, hm hmVar) {
        T currentValue = getCurrentValue();
        T computeTarget = computeTarget(requireOffset(), currentValue, f);
        boolean booleanValue = ((Boolean) this.confirmValueChange.invoke(computeTarget)).booleanValue();
        vn vnVar = vn.d;
        w01 w01Var = w01.a;
        if (booleanValue) {
            Object animateTo = AnchoredDraggableKt.animateTo(this, computeTarget, f, hmVar);
            return animateTo == vnVar ? animateTo : w01Var;
        }
        Object animateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f, hmVar);
        return animateTo2 == vnVar ? animateTo2 : w01Var;
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object Saver$lambda$0(SaverScope saverScope, AnchoredDraggableState anchoredDraggableState) {
            return anchoredDraggableState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AnchoredDraggableState Saver$lambda$1(ky kyVar, iy iyVar, iy iyVar2, ky kyVar2, Object obj) {
            return new AnchoredDraggableState(obj, kyVar, iyVar, iyVar2, kyVar2);
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(iy iyVar, ky kyVar, ky kyVar2, iy iyVar2) {
            return SaverKt.Saver(new w4(0), new x4(iyVar2, kyVar2, kyVar, iyVar));
        }

        private Companion() {
        }
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, oy oyVar, hm hmVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, oyVar, hmVar);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, ky kyVar, iy iyVar, iy iyVar2, ky kyVar2, int i, dq dqVar) {
        this(obj, kyVar, iyVar, iyVar2, (i & 16) != 0 ? new d1(9) : kyVar2);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, ky kyVar, iy iyVar, iy iyVar2, ky kyVar2, int i, dq dqVar) {
        this(obj, draggableAnchors, kyVar, iyVar, iyVar2, (i & 32) != 0 ? new d1(11) : kyVar2);
    }

    public AnchoredDraggableState(T t, DraggableAnchors<T> draggableAnchors, ky kyVar, iy iyVar, iy iyVar2, ky kyVar2) {
        this(t, kyVar, iyVar, iyVar2, kyVar2);
        setAnchors(draggableAnchors);
        trySnapTo(t);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(MutatePriority mutatePriority, ny nyVar, hm hmVar) {
        AnchoredDraggableState$anchoredDrag$1 anchoredDraggableState$anchoredDrag$1;
        int i;
        T closestAnchor;
        try {
            if (hmVar instanceof AnchoredDraggableState$anchoredDrag$1) {
                anchoredDraggableState$anchoredDrag$1 = (AnchoredDraggableState$anchoredDrag$1) hmVar;
                int i2 = anchoredDraggableState$anchoredDrag$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableState$anchoredDrag$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = anchoredDraggableState$anchoredDrag$1.result;
                    i = anchoredDraggableState$anchoredDrag$1.label;
                    if (i != 0) {
                        p10.Q(obj);
                        InternalMutatorMutex internalMutatorMutex = this.dragMutex;
                        AnchoredDraggableState$anchoredDrag$2 anchoredDraggableState$anchoredDrag$2 = new AnchoredDraggableState$anchoredDrag$2(this, nyVar, null);
                        anchoredDraggableState$anchoredDrag$1.label = 1;
                        Object mutate = internalMutatorMutex.mutate(mutatePriority, anchoredDraggableState$anchoredDrag$2, anchoredDraggableState$anchoredDrag$1);
                        vn vnVar = vn.d;
                        if (mutate == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    if (closestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && ((Boolean) this.confirmValueChange.invoke(closestAnchor)).booleanValue()) {
                        setCurrentValue(closestAnchor);
                    }
                    return w01.a;
                }
            }
            if (i != 0) {
            }
            if (closestAnchor != null) {
                setCurrentValue(closestAnchor);
            }
            return w01.a;
        } finally {
            closestAnchor = getAnchors().closestAnchor(getOffset());
            if (closestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && ((Boolean) this.confirmValueChange.invoke(closestAnchor)).booleanValue()) {
                setCurrentValue(closestAnchor);
            }
        }
        anchoredDraggableState$anchoredDrag$1 = new AnchoredDraggableState$anchoredDrag$1(this, hmVar);
        Object obj2 = anchoredDraggableState$anchoredDrag$1.result;
        i = anchoredDraggableState$anchoredDrag$1.label;
    }
}
