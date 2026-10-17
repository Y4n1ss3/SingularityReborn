package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.a10;
import defpackage.d41;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.v4;
import defpackage.w01;
import defpackage.zg;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimateAsStateKt {
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m7609boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m4573boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m4505boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(a10.a)), 3, null);
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);

    /* renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final State<Dp> m127animateDpAsStateAjpBEmI(float f, AnimationSpec<Dp> animationSpec, String str, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec<Dp> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:111)");
        }
        int i3 = i << 6;
        State<Dp> animateValueAsState = animateValueAsState(Dp.m7609boximpl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, str2, kyVar2, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @er
    /* renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ State m128animateDpAsStateKz89ssw(float f, AnimationSpec animationSpec, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        State animateValueAsState = animateValueAsState(Dp.m7609boximpl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, null, kyVar2, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    public static final State<Float> animateFloatAsState(float f, AnimationSpec<Float> animationSpec, float f2, String str, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.01f;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        ky kyVar2 = (i2 & 16) != 0 ? null : kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:67)");
        }
        if (animationSpec == defaultAnimation) {
            composer.startReplaceGroup(1144089983);
            boolean z = (((i & 896) ^ 384) > 256 && composer.changed(f2)) || (i & 384) == 256;
            Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f2), 3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            animationSpec = (SpringSpec) rememberedValue;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1144199909);
            composer.endReplaceGroup();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        Float valueOf = Float.valueOf(f);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zv.a);
        Float valueOf2 = Float.valueOf(f2);
        int i3 = i << 3;
        State<Float> animateValueAsState = animateValueAsState(valueOf, vectorConverter, animationSpec2, valueOf2, str2, kyVar2, composer, (i & 14) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    public static final State<Integer> animateIntAsState(int i, AnimationSpec<Integer> animationSpec, String str, ky kyVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec<Integer> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:270)");
        }
        int i4 = i2 << 6;
        State<Integer> animateValueAsState = animateValueAsState(Integer.valueOf(i), VectorConvertersKt.getVectorConverter(a10.a), animationSpec2, null, str2, kyVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @er
    /* renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ State m129animateIntOffsetAsState8f6pmRE(long j, AnimationSpec animationSpec, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, i, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:552)");
        }
        State animateValueAsState = animateValueAsState(IntOffset.m7730boximpl(j), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, null, kyVar2, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final State<IntOffset> m130animateIntOffsetAsStateHyPO7BM(long j, AnimationSpec<IntOffset> animationSpec, String str, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec<IntOffset> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-696782904, i, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:309)");
        }
        int i3 = i << 6;
        State<IntOffset> animateValueAsState = animateValueAsState(IntOffset.m7730boximpl(j), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, str2, kyVar2, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final State<IntSize> m131animateIntSizeAsState4goxYXU(long j, AnimationSpec<IntSize> animationSpec, String str, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec<IntSize> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582576328, i, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:347)");
        }
        int i3 = i << 6;
        State<IntSize> animateValueAsState = animateValueAsState(IntSize.m7774boximpl(j), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, str2, kyVar2, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @er
    /* renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ State m132animateIntSizeAsStatezTRF_AQ(long j, AnimationSpec animationSpec, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749239765, i, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:570)");
        }
        State animateValueAsState = animateValueAsState(IntSize.m7774boximpl(j), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, null, kyVar2, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final State<Offset> m133animateOffsetAsState7362WCg(long j, AnimationSpec<Offset> animationSpec, String str, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec<Offset> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, i, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:191)");
        }
        int i3 = i << 6;
        State<Offset> animateValueAsState = animateValueAsState(Offset.m4505boximpl(j), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, str2, kyVar2, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @er
    /* renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ State m134animateOffsetAsStateN6fFfp4(long j, AnimationSpec animationSpec, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456513133, i, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        State animateValueAsState = animateValueAsState(Offset.m4505boximpl(j), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, null, kyVar2, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    public static final State<Rect> animateRectAsState(Rect rect, AnimationSpec<Rect> animationSpec, String str, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec<Rect> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536062978, i, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:232)");
        }
        int i3 = i << 6;
        State<Rect> animateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, str2, kyVar2, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @er
    /* renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ State m135animateSizeAsStateLjSzlW0(long j, AnimationSpec animationSpec, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875212471, i, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        State animateValueAsState = animateValueAsState(Size.m4573boximpl(j), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, null, kyVar2, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final State<Size> m136animateSizeAsStateYLp_XPw(long j, AnimationSpec<Size> animationSpec, String str, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec<Size> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1374633148, i, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:152)");
        }
        int i3 = i << 6;
        State<Size> animateValueAsState = animateValueAsState(Size.m4573boximpl(j), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, str2, kyVar2, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    public static final <T, V extends AnimationVector> State<T> animateValueAsState(T t, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, T t2, String str, ky kyVar, Composer composer, int i, int i2) {
        AnimationSpec<T> animationSpec2;
        if ((i2 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            animationSpec2 = (SpringSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        T t3 = (i2 & 8) != 0 ? null : t2;
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        ky kyVar2 = (i2 & 32) != 0 ? null : kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:395)");
        }
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        int i3 = 2;
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(t, twoWayConverter, t3, str2);
            composer.updateRememberedValue(rememberedValue3);
        }
        Animatable animatable = (Animatable) rememberedValue3;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(kyVar2, composer, (i >> 15) & 14);
        if (t3 != null && (animationSpec2 instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpec2;
            if (!q10.b(springSpec.getVisibilityThreshold(), t3)) {
                animationSpec2 = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t3);
            }
        }
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpec2, composer, 0);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = d41.b(-1, 6, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        zg zgVar = (zg) rememberedValue4;
        boolean changedInstance = ((((i & 14) ^ 6) > 4 && composer.changedInstance(t)) || (i & 6) == 4) | composer.changedInstance(zgVar);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new v4(i3, zgVar, t);
            composer.updateRememberedValue(rememberedValue5);
        }
        EffectsKt.SideEffect((iy) rememberedValue5, composer, 0);
        boolean changedInstance2 = composer.changedInstance(zgVar) | composer.changedInstance(animatable) | composer.changed(rememberUpdatedState2) | composer.changed(rememberUpdatedState);
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue6 == companion.getEmpty()) {
            Object animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(zgVar, animatable, rememberUpdatedState2, rememberUpdatedState, null);
            composer.updateRememberedValue(animateAsStateKt$animateValueAsState$3$1);
            rememberedValue6 = animateAsStateKt$animateValueAsState$3$1;
        }
        EffectsKt.LaunchedEffect(zgVar, (my) rememberedValue6, composer, 0);
        State<T> state = (State) mutableState.getValue();
        if (state == null) {
            state = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> ky animateValueAsState$lambda$3(State<? extends ky> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> AnimationSpec<T> animateValueAsState$lambda$5(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateValueAsState$lambda$7$0(zg zgVar, Object obj) {
        zgVar.m(obj);
        return w01.a;
    }

    @er
    public static final /* synthetic */ State animateRectAsState(Rect rect, AnimationSpec animationSpec, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782613967, i, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:516)");
        }
        State animateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, null, kyVar2, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @er
    public static final /* synthetic */ State animateIntAsState(int i, AnimationSpec animationSpec, ky kyVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-842612981, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:534)");
        }
        State animateValueAsState = animateValueAsState(Integer.valueOf(i), VectorConvertersKt.getVectorConverter(a10.a), animationSpec2, null, null, kyVar2, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @er
    public static final /* synthetic */ State animateFloatAsState(float f, AnimationSpec animationSpec, float f2, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            f2 = 0.01f;
        }
        float f3 = f2;
        if ((i2 & 8) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        State<Float> animateFloatAsState = animateFloatAsState(f, animationSpec2, f3, null, kyVar2, composer, (i & 1022) | ((i << 3) & 57344), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateFloatAsState;
    }

    @er
    public static final /* synthetic */ State animateValueAsState(Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Object obj2, ky kyVar, Composer composer, int i, int i2) {
        Composer composer2;
        if ((i2 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer2 = composer;
                composer2.updateRememberedValue(rememberedValue);
            } else {
                composer2 = composer;
            }
            animationSpec = (SpringSpec) rememberedValue;
        } else {
            composer2 = composer;
        }
        AnimationSpec animationSpec2 = animationSpec;
        Object obj3 = (i2 & 8) != 0 ? null : obj2;
        ky kyVar2 = (i2 & 16) != 0 ? null : kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846382129, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:591)");
        }
        int i3 = i & 8;
        State animateValueAsState = animateValueAsState(obj, twoWayConverter, animationSpec2, obj3, "ValueAnimation", kyVar2, composer2, (i3 << 9) | i3 | 24576 | (i & 14) | (i & 112) | (i & 896) | (i & 7168) | ((i << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }
}
