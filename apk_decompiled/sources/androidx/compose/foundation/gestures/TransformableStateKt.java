package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import defpackage.gi0;
import defpackage.hm;
import defpackage.ii0;
import defpackage.ji0;
import defpackage.ny;
import defpackage.vn;
import defpackage.w01;
import defpackage.x6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransformableStateKt {
    private static final AnimationData ZeroAnimationVelocity = new AnimationData(0.0f, Offset.Companion.m4532getZeroF1C5BW0(), 0.0f, null);

    public static final TransformableState TransformableState(ny nyVar) {
        return new DefaultTransformableState(nyVar);
    }

    /* renamed from: animateBy-Su4bsnU, reason: not valid java name */
    public static final Object m572animateBySu4bsnU(TransformableState transformableState, float f, long j, float f2, AnimationSpec<Float> animationSpec, AnimationSpec<Offset> animationSpec2, AnimationSpec<Float> animationSpec3, hm hmVar) {
        if (!(f > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        ji0 ji0Var = new ji0();
        ji0Var.d = new AnimationData(1.0f, Offset.Companion.m4532getZeroF1C5BW0(), 0.0f, null);
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateBy$3(ji0Var, new AnimationData(f, j, f2, null), new DelegatingAnimationSpec(animationSpec, animationSpec2, animationSpec3), null), hmVar, 1, null);
        return transform$default == vn.d ? transform$default : w01.a;
    }

    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m574animatePanByubNVwUQ(TransformableState transformableState, long j, AnimationSpec<Offset> animationSpec, hm hmVar) {
        ii0 ii0Var = new ii0();
        ii0Var.d = Offset.Companion.m4532getZeroF1C5BW0();
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animatePanBy$2(ii0Var, j, animationSpec, null), hmVar, 1, null);
        return transform$default == vn.d ? transform$default : w01.a;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m575animatePanByubNVwUQ$default(TransformableState transformableState, long j, AnimationSpec animationSpec, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m574animatePanByubNVwUQ(transformableState, j, animationSpec, hmVar);
    }

    public static final Object animateRotateBy(TransformableState transformableState, float f, AnimationSpec<Float> animationSpec, hm hmVar) {
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateRotateBy$2(new gi0(), f, animationSpec, null), hmVar, 1, null);
        return transform$default == vn.d ? transform$default : w01.a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f, AnimationSpec animationSpec, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f, animationSpec, hmVar);
    }

    public static final Object animateZoomBy(TransformableState transformableState, float f, AnimationSpec<Float> animationSpec, hm hmVar) {
        if (!(f > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        gi0 gi0Var = new gi0();
        gi0Var.d = 1.0f;
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateZoomBy$3(gi0Var, f, animationSpec, null), hmVar, 1, null);
        return transform$default == vn.d ? transform$default : w01.a;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f, AnimationSpec animationSpec, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f, animationSpec, hmVar);
    }

    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m576panByd4ec7I(TransformableState transformableState, long j, hm hmVar) {
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$panBy$2(j, null), hmVar, 1, null);
        return transform$default == vn.d ? transform$default : w01.a;
    }

    public static final TransformableState rememberTransformableState(ny nyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:122)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(nyVar, composer, i & 14);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TransformableState(new x6(rememberUpdatedState, 17));
            composer.updateRememberedValue(rememberedValue);
        }
        TransformableState transformableState = (TransformableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transformableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 rememberTransformableState$lambda$0$0(State state, float f, Offset offset, float f2) {
        ((ny) state.getValue()).invoke(Float.valueOf(f), offset, Float.valueOf(f2));
        return w01.a;
    }

    public static final Object rotateBy(TransformableState transformableState, float f, hm hmVar) {
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$rotateBy$2(f, null), hmVar, 1, null);
        return transform$default == vn.d ? transform$default : w01.a;
    }

    public static final Object stopTransformation(TransformableState transformableState, MutatePriority mutatePriority, hm hmVar) {
        Object transform = transformableState.transform(mutatePriority, new TransformableStateKt$stopTransformation$2(null), hmVar);
        return transform == vn.d ? transform : w01.a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, hmVar);
    }

    public static final Object zoomBy(TransformableState transformableState, float f, hm hmVar) {
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$zoomBy$2(f, null), hmVar, 1, null);
        return transform$default == vn.d ? transform$default : w01.a;
    }
}
