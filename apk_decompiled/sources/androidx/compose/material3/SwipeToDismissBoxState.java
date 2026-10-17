package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import defpackage.dq;
import defpackage.er;
import defpackage.fo0;
import defpackage.hm;
import defpackage.ky;
import defpackage.ll0;
import defpackage.q10;
import defpackage.s4;
import defpackage.vn;
import defpackage.w01;
import defpackage.z4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeToDismissBoxState {
    private final AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableState;
    public ky positionalThreshold;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @er
    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, ky kyVar, ky kyVar2) {
        AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
        this.anchoredDraggableState = AnchoredDraggableKt.AnchoredDraggableState(swipeToDismissBoxValue, kyVar2, new s4(density, 6), anchoredDraggableDefaults.getSnapAnimationSpec(), anchoredDraggableDefaults.getDecayAnimationSpec(), kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(SwipeToDismissBoxValue swipeToDismissBoxValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _init_$lambda$2(Density density) {
        float f;
        f = SwipeToDismissBoxKt.DismissVelocityThreshold;
        return density.mo367toPx0680j_4(f);
    }

    public final Object dismiss(SwipeToDismissBoxValue swipeToDismissBoxValue, hm hmVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, swipeToDismissBoxValue, null, hmVar, 2, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    public final AnchoredDraggableState<SwipeToDismissBoxValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    public final SwipeToDismissBoxValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final SwipeToDismissBoxValue getDismissDirection() {
        return (getOffset$material3() == 0.0f || Float.isNaN(getOffset$material3())) ? SwipeToDismissBoxValue.Settled : getOffset$material3() > 0.0f ? SwipeToDismissBoxValue.StartToEnd : SwipeToDismissBoxValue.EndToStart;
    }

    public final float getOffset$material3() {
        return this.anchoredDraggableState.getOffset();
    }

    public final ky getPositionalThreshold$material3() {
        ky kyVar = this.positionalThreshold;
        if (kyVar != null) {
            return kyVar;
        }
        q10.H("positionalThreshold");
        throw null;
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final SwipeToDismissBoxValue getSettledValue() {
        return this.anchoredDraggableState.getSettledValue();
    }

    public final SwipeToDismissBoxValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean getUseFlingBehavior$material3() {
        return this.positionalThreshold != null;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final Object reset(hm hmVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SwipeToDismissBoxValue.Settled, null, hmVar, 2, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    public final void setPositionalThreshold$material3(ky kyVar) {
        this.positionalThreshold = kyVar;
    }

    public final Object snapTo(SwipeToDismissBoxValue swipeToDismissBoxValue, hm hmVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, swipeToDismissBoxValue, hmVar);
        return snapTo == vn.d ? snapTo : w01.a;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SwipeToDismissBoxValue Saver$lambda$0(SaverScope saverScope, SwipeToDismissBoxState swipeToDismissBoxState) {
            return swipeToDismissBoxState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SwipeToDismissBoxState Saver$lambda$1(Density density, ky kyVar, ky kyVar2, SwipeToDismissBoxValue swipeToDismissBoxValue) {
            return new SwipeToDismissBoxState(swipeToDismissBoxValue, density, kyVar, kyVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SwipeToDismissBoxValue Saver$lambda$2(SaverScope saverScope, SwipeToDismissBoxState swipeToDismissBoxState) {
            return swipeToDismissBoxState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SwipeToDismissBoxState Saver$lambda$3(ky kyVar, SwipeToDismissBoxValue swipeToDismissBoxValue) {
            return new SwipeToDismissBoxState(swipeToDismissBoxValue, kyVar);
        }

        @er
        public final Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver(ky kyVar, ky kyVar2, Density density) {
            return SaverKt.Saver(new ll0(24), new defpackage.f1(density, kyVar, kyVar2, 19));
        }

        private Companion() {
        }

        public final Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver(ky kyVar) {
            return SaverKt.Saver(new ll0(23), new z4(kyVar, 10));
        }
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public /* synthetic */ SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, ky kyVar, ky kyVar2, int i, dq dqVar) {
        this(swipeToDismissBoxValue, density, (i & 4) != 0 ? new fo0(11) : kyVar, kyVar2);
    }

    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, ky kyVar) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(swipeToDismissBoxValue);
        setPositionalThreshold$material3(kyVar);
    }
}
