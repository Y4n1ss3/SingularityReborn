package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import defpackage.dq;
import defpackage.er;
import defpackage.fo0;
import defpackage.g7;
import defpackage.hm;
import defpackage.hm0;
import defpackage.iy;
import defpackage.ky;
import defpackage.ll0;
import defpackage.s4;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SheetState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private AnimationSpec<Float> anchoredDraggableMotionSpec;
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;
    private final ky confirmValueChange;
    private FiniteAnimationSpec<Float> hideMotionSpec;
    private FiniteAnimationSpec<Float> showMotionSpec;
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;

    public SheetState(boolean z, iy iyVar, iy iyVar2, SheetValue sheetValue, ky kyVar, boolean z2) {
        AnimationSpec<Float> animationSpec;
        this.skipPartiallyExpanded = z;
        this.confirmValueChange = kyVar;
        this.skipHiddenState = z2;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            defpackage.o.m("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        if (z2 && sheetValue == SheetValue.Hidden) {
            defpackage.o.m("The initial value must not be set to Hidden if skipHiddenState is set to true.");
            throw null;
        }
        animationSpec = SheetDefaultsKt.BottomSheetAnimationSpec;
        this.anchoredDraggableMotionSpec = animationSpec;
        this.anchoredDraggableState = new AnchoredDraggableState<>(sheetValue, new g7(9, iyVar), iyVar2, new hm0(this, 6), kyVar);
        this.showMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
        this.hideMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(SheetValue sheetValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _init_$lambda$11(Density density) {
        return density.mo367toPx0680j_4(BottomSheetDefaults.INSTANCE.m1646getVelocityThresholdD9Ej5fM$material3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$7(SheetValue sheetValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _init_$lambda$9(Density density) {
        return density.mo367toPx0680j_4(BottomSheetDefaults.INSTANCE.m1643getPositionalThresholdD9Ej5fM$material3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float anchoredDraggableState$lambda$5(iy iyVar, float f) {
        return ((Number) iyVar.invoke()).floatValue();
    }

    public static /* synthetic */ Object animateTo$material3$default(SheetState sheetState, SheetValue sheetValue, FiniteAnimationSpec finiteAnimationSpec, float f, hm hmVar, int i, Object obj) {
        if ((i & 4) != 0) {
            f = sheetState.anchoredDraggableState.getLastVelocity();
        }
        return sheetState.animateTo$material3(sheetValue, finiteAnimationSpec, f, hmVar);
    }

    public final Object animateTo$material3(SheetValue sheetValue, FiniteAnimationSpec<Float> finiteAnimationSpec, float f, hm hmVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, sheetValue, null, new SheetState$animateTo$2(this, f, finiteAnimationSpec, null), hmVar, 2, null);
        return anchoredDrag$default == vn.d ? anchoredDrag$default : w01.a;
    }

    public final Object expand(hm hmVar) {
        Object animateTo$material3$default;
        ky kyVar = this.confirmValueChange;
        SheetValue sheetValue = SheetValue.Expanded;
        return (((Boolean) kyVar.invoke(sheetValue)).booleanValue() && (animateTo$material3$default = animateTo$material3$default(this, sheetValue, this.showMotionSpec, 0.0f, hmVar, 4, null)) == vn.d) ? animateTo$material3$default : w01.a;
    }

    public final AnimationSpec<Float> getAnchoredDraggableMotionSpec$material3() {
        return this.anchoredDraggableMotionSpec;
    }

    public final AnchoredDraggableState<SheetValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    public final ky getConfirmValueChange$material3() {
        return this.confirmValueChange;
    }

    public final SheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final boolean getHasExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.PartiallyExpanded);
    }

    public final FiniteAnimationSpec<Float> getHideMotionSpec$material3() {
        return this.hideMotionSpec;
    }

    public final float getOffset$material3() {
        return this.anchoredDraggableState.getOffset();
    }

    public final FiniteAnimationSpec<Float> getShowMotionSpec$material3() {
        return this.showMotionSpec;
    }

    public final boolean getSkipHiddenState$material3() {
        return this.skipHiddenState;
    }

    public final boolean getSkipPartiallyExpanded$material3() {
        return this.skipPartiallyExpanded;
    }

    public final SheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final Object hide(hm hmVar) {
        Object animateTo$material3$default;
        if (this.skipHiddenState) {
            defpackage.o.f("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        ky kyVar = this.confirmValueChange;
        SheetValue sheetValue = SheetValue.Hidden;
        return (((Boolean) kyVar.invoke(sheetValue)).booleanValue() && (animateTo$material3$default = animateTo$material3$default(this, sheetValue, this.hideMotionSpec, 0.0f, hmVar, 4, null)) == vn.d) ? animateTo$material3$default : w01.a;
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != SheetValue.Hidden;
    }

    public final Object partialExpand(hm hmVar) {
        Object animateTo$material3$default;
        if (this.skipPartiallyExpanded) {
            defpackage.o.f("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        ky kyVar = this.confirmValueChange;
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        return (((Boolean) kyVar.invoke(sheetValue)).booleanValue() && (animateTo$material3$default = animateTo$material3$default(this, sheetValue, this.hideMotionSpec, 0.0f, hmVar, 4, null)) == vn.d) ? animateTo$material3$default : w01.a;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setAnchoredDraggableMotionSpec$material3(AnimationSpec<Float> animationSpec) {
        this.anchoredDraggableMotionSpec = animationSpec;
    }

    public final void setAnchoredDraggableState$material3(AnchoredDraggableState<SheetValue> anchoredDraggableState) {
        this.anchoredDraggableState = anchoredDraggableState;
    }

    public final void setHideMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.hideMotionSpec = finiteAnimationSpec;
    }

    public final void setShowMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.showMotionSpec = finiteAnimationSpec;
    }

    public final Object settle$material3(float f, hm hmVar) {
        Object obj = this.anchoredDraggableState.settle(f, hmVar);
        return obj == vn.d ? obj : w01.a;
    }

    public final Object show(hm hmVar) {
        Object animateTo$material3$default;
        SheetValue sheetValue = getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded;
        return (((Boolean) this.confirmValueChange.invoke(sheetValue)).booleanValue() && (animateTo$material3$default = animateTo$material3$default(this, sheetValue, this.showMotionSpec, 0.0f, hmVar, 4, null)) == vn.d) ? animateTo$material3$default : w01.a;
    }

    public final Object snapTo$material3(SheetValue sheetValue, hm hmVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, sheetValue, hmVar);
        return snapTo == vn.d ? snapTo : w01.a;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SheetValue Saver$lambda$0(SaverScope saverScope, SheetState sheetState) {
            return sheetState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SheetState Saver$lambda$1(boolean z, iy iyVar, iy iyVar2, ky kyVar, boolean z2, SheetValue sheetValue) {
            return new SheetState(z, iyVar, iyVar2, sheetValue, kyVar, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float Saver$lambda$3(Density density) {
            return density.mo367toPx0680j_4(BottomSheetDefaults.INSTANCE.m1643getPositionalThresholdD9Ej5fM$material3());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float Saver$lambda$5(Density density) {
            return density.mo367toPx0680j_4(BottomSheetDefaults.INSTANCE.m1646getVelocityThresholdD9Ej5fM$material3());
        }

        public final Saver<SheetState, SheetValue> Saver(final boolean z, final iy iyVar, final iy iyVar2, final ky kyVar, final boolean z2) {
            return SaverKt.Saver(new ll0(21), new ky() { // from class: hp0
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    SheetState Saver$lambda$1;
                    Saver$lambda$1 = SheetState.Companion.Saver$lambda$1(z, iyVar, iyVar2, kyVar, z2, (SheetValue) obj);
                    return Saver$lambda$1;
                }
            });
        }

        private Companion() {
        }

        @er
        public final /* synthetic */ Saver Saver(boolean z, ky kyVar, Density density, boolean z2) {
            return Saver(z, new s4(density, 4), new s4(density, 5), kyVar, z2);
        }
    }

    public /* synthetic */ SheetState(boolean z, iy iyVar, iy iyVar2, SheetValue sheetValue, ky kyVar, boolean z2, int i, dq dqVar) {
        this(z, iyVar, iyVar2, (i & 8) != 0 ? SheetValue.Hidden : sheetValue, (i & 16) != 0 ? new fo0(2) : kyVar, (i & 32) != 0 ? false : z2);
    }

    public /* synthetic */ SheetState(boolean z, Density density, SheetValue sheetValue, ky kyVar, boolean z2, int i, dq dqVar) {
        this(z, density, (i & 4) != 0 ? SheetValue.Hidden : sheetValue, (i & 8) != 0 ? new fo0(3) : kyVar, (i & 16) != 0 ? false : z2);
    }

    @er
    public /* synthetic */ SheetState(boolean z, Density density, SheetValue sheetValue, ky kyVar, boolean z2) {
        this(z, new s4(density, 2), new s4(density, 3), sheetValue, kyVar, z2);
    }
}
