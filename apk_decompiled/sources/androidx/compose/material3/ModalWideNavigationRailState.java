package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.hm;
import defpackage.hz;
import defpackage.i2;
import defpackage.s4;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModalWideNavigationRailState implements WideNavigationRailState {
    public static final int $stable = 8;
    private final /* synthetic */ WideNavigationRailState $$delegate_0;
    private final AnchoredDraggableState<WideNavigationRailValue> anchoredDraggableState;
    private final AnimationSpec<Float> animationSpec;

    public ModalWideNavigationRailState(WideNavigationRailState wideNavigationRailState, Density density, AnimationSpec<Float> animationSpec) {
        this.$$delegate_0 = wideNavigationRailState;
        this.animationSpec = animationSpec;
        this.anchoredDraggableState = new AnchoredDraggableState<>(wideNavigationRailState.getTargetValue(), new hz(24), new s4(density, 1), new i2(this, 23), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float anchoredDraggableState$lambda$0(float f) {
        return f * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float anchoredDraggableState$lambda$2(Density density) {
        return density.mo367toPx0680j_4(Dp.m7611constructorimpl(400.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateTo(WideNavigationRailValue wideNavigationRailValue, AnimationSpec<Float> animationSpec, float f, hm hmVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, wideNavigationRailValue, null, new ModalWideNavigationRailState$animateTo$2(this, f, animationSpec, null), hmVar, 2, null);
        return anchoredDrag$default == vn.d ? anchoredDrag$default : w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(ModalWideNavigationRailState modalWideNavigationRailState, WideNavigationRailValue wideNavigationRailValue, AnimationSpec animationSpec, float f, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = modalWideNavigationRailState.animationSpec;
        }
        if ((i & 4) != 0) {
            f = modalWideNavigationRailState.anchoredDraggableState.getLastVelocity();
        }
        return modalWideNavigationRailState.animateTo(wideNavigationRailValue, animationSpec, f, hmVar);
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object collapse(hm hmVar) {
        Object animateTo$default = animateTo$default(this, WideNavigationRailValue.Collapsed, null, 0.0f, hmVar, 6, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object expand(hm hmVar) {
        Object animateTo$default = animateTo$default(this, WideNavigationRailValue.Expanded, null, 0.0f, hmVar, 6, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    public final AnchoredDraggableState<WideNavigationRailValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public WideNavigationRailValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public WideNavigationRailValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public boolean isAnimating() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final Object settle$material3(float f, hm hmVar) {
        Object obj = this.anchoredDraggableState.settle(f, hmVar);
        return obj == vn.d ? obj : w01.a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object snapTo(WideNavigationRailValue wideNavigationRailValue, hm hmVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, wideNavigationRailValue, hmVar);
        return snapTo == vn.d ? snapTo : w01.a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object toggle(hm hmVar) {
        Object animateTo$default = animateTo$default(this, WideNavigationRailStateKt.not(getTargetValue()), null, 0.0f, hmVar, 6, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }
}
