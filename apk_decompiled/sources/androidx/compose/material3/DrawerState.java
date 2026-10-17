package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import defpackage.bl;
import defpackage.dq;
import defpackage.er;
import defpackage.hm;
import defpackage.i2;
import defpackage.ky;
import defpackage.qo;
import defpackage.vn;
import defpackage.w01;
import defpackage.z4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private FiniteAnimationSpec<Float> anchoredDraggableMotionSpec;
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;
    private FiniteAnimationSpec<Float> closeDrawerMotionSpec;
    private final ky confirmStateChange;
    private final MutableState density$delegate;
    private final State<Float> offset;
    private FiniteAnimationSpec<Float> openDrawerMotionSpec;

    public DrawerState(DrawerValue drawerValue, ky kyVar) {
        TweenSpec tweenSpec;
        this.confirmStateChange = kyVar;
        tweenSpec = NavigationDrawerKt.AnchoredDraggableDefaultAnimationSpec;
        this.anchoredDraggableMotionSpec = tweenSpec;
        this.anchoredDraggableState = AnchoredDraggableKt.AnchoredDraggableState(drawerValue, new qo(18), new i2(this, 16), tweenSpec, AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec(), kyVar);
        this.offset = new State<Float>() { // from class: androidx.compose.material3.DrawerState$offset$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.State
            public Float getValue() {
                return Float.valueOf(DrawerState.this.getAnchoredDraggableState$material3().getOffset());
            }
        };
        this.density$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.openDrawerMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
        this.closeDrawerMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(DrawerValue drawerValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float anchoredDraggableState$lambda$1(float f) {
        float f2;
        f2 = NavigationDrawerKt.DrawerPositionalThreshold;
        return f2 * f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float anchoredDraggableState$lambda$3(DrawerState drawerState) {
        float f;
        Density requireDensity = drawerState.requireDensity();
        f = NavigationDrawerKt.DrawerVelocityThreshold;
        return requireDensity.mo367toPx0680j_4(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, float f, hm hmVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, drawerValue, null, new DrawerState$animateTo$3(this, f, animationSpec, null), hmVar, 2, null);
        return anchoredDrag$default == vn.d ? anchoredDrag$default : w01.a;
    }

    public static /* synthetic */ Object animateTo$default(DrawerState drawerState, DrawerValue drawerValue, AnimationSpec animationSpec, float f, hm hmVar, int i, Object obj) {
        if ((i & 4) != 0) {
            f = drawerState.anchoredDraggableState.getLastVelocity();
        }
        return drawerState.animateTo(drawerValue, animationSpec, f, hmVar);
    }

    private final Density requireDensity() {
        Density density$material3 = getDensity$material3();
        if (density$material3 != null) {
            return density$material3;
        }
        defpackage.o.h("The density on DrawerState (", this, ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?");
        return null;
    }

    public final Object close(hm hmVar) {
        Object animateTo$default = animateTo$default(this, DrawerValue.Closed, this.closeDrawerMotionSpec, 0.0f, hmVar, 4, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    public final FiniteAnimationSpec<Float> getAnchoredDraggableMotionSpec$material3() {
        return this.anchoredDraggableMotionSpec;
    }

    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    public final FiniteAnimationSpec<Float> getCloseDrawerMotionSpec$material3() {
        return this.closeDrawerMotionSpec;
    }

    public final ky getConfirmStateChange$material3() {
        return this.confirmStateChange;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getSettledValue();
    }

    public final Density getDensity$material3() {
        return (Density) this.density$delegate.getValue();
    }

    public final State<Float> getOffset() {
        return this.offset;
    }

    public final FiniteAnimationSpec<Float> getOpenDrawerMotionSpec$material3() {
        return this.openDrawerMotionSpec;
    }

    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    public final Object open(hm hmVar) {
        Object animateTo$default = animateTo$default(this, DrawerValue.Open, this.openDrawerMotionSpec, 0.0f, hmVar, 4, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    public final float requireOffset$material3() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setAnchoredDraggableMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.anchoredDraggableMotionSpec = finiteAnimationSpec;
    }

    public final void setCloseDrawerMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.closeDrawerMotionSpec = finiteAnimationSpec;
    }

    public final void setDensity$material3(Density density) {
        this.density$delegate.setValue(density);
    }

    public final void setOpenDrawerMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.openDrawerMotionSpec = finiteAnimationSpec;
    }

    public final Object snapTo(DrawerValue drawerValue, hm hmVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, hmVar);
        return snapTo == vn.d ? snapTo : w01.a;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DrawerValue Saver$lambda$0(SaverScope saverScope, DrawerState drawerState) {
            return drawerState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DrawerState Saver$lambda$1(ky kyVar, DrawerValue drawerValue) {
            return new DrawerState(drawerValue, kyVar);
        }

        public final Saver<DrawerState, DrawerValue> Saver(ky kyVar) {
            return SaverKt.Saver(new bl(26), new z4(kyVar, 1));
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAnchoredDraggableState$material3$annotations() {
    }

    @er
    public static /* synthetic */ void getOffset$annotations() {
    }

    @er
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, hm hmVar) {
        Object animateTo$default = animateTo$default(this, drawerValue, animationSpec, 0.0f, hmVar, 4, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, ky kyVar, int i, dq dqVar) {
        this(drawerValue, (i & 2) != 0 ? new qo(17) : kyVar);
    }
}
