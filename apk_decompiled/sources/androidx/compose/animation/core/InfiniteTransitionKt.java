package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import defpackage.er;
import defpackage.g;
import defpackage.iy;
import defpackage.ky;
import defpackage.q10;
import defpackage.ud;
import defpackage.w01;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InfiniteTransitionKt {
    public static final State<Float> animateFloat(InfiniteTransition infiniteTransition, float f, float f2, InfiniteRepeatableSpec<Float> infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-644770905, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i3 = i << 3;
        State<Float> animateValue = animateValue(infiniteTransition, Float.valueOf(f), Float.valueOf(f2), VectorConvertersKt.getVectorConverter(zv.a), infiniteRepeatableSpec, str2, composer, (i & 1022) | (57344 & i3) | (i3 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValue;
    }

    public static final <T, V extends AnimationVector> State<T> animateValue(InfiniteTransition infiniteTransition, T t, T t2, TwoWayConverter<T, V> twoWayConverter, InfiniteRepeatableSpec<T> infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        InfiniteTransition infiniteTransition2;
        Object obj;
        if ((i2 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            infiniteTransition2 = infiniteTransition;
            InfiniteTransition.TransitionAnimationState transitionAnimationState = infiniteTransition2.new TransitionAnimationState(t, t2, twoWayConverter, infiniteRepeatableSpec, str2);
            obj = t2;
            composer.updateRememberedValue(transitionAnimationState);
            rememberedValue = transitionAnimationState;
        } else {
            infiniteTransition2 = infiniteTransition;
            obj = t2;
        }
        InfiniteTransition.TransitionAnimationState transitionAnimationState2 = (InfiniteTransition.TransitionAnimationState) rememberedValue;
        boolean z = true;
        boolean z2 = ((((i & 112) ^ 48) > 32 && composer.changedInstance(t)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changedInstance(obj)) || (i & 384) == 256);
        if ((((57344 & i) ^ 24576) <= 16384 || !composer.changedInstance(infiniteRepeatableSpec)) && (i & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == companion.getEmpty()) {
            ud udVar = new ud(t, transitionAnimationState2, obj, infiniteRepeatableSpec, 3);
            composer.updateRememberedValue(udVar);
            rememberedValue2 = udVar;
        }
        EffectsKt.SideEffect((iy) rememberedValue2, composer, 0);
        boolean changedInstance = composer.changedInstance(infiniteTransition2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new g(23, infiniteTransition2, transitionAnimationState2);
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.DisposableEffect(transitionAnimationState2, (ky) rememberedValue3, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionAnimationState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateValue$lambda$1$0(Object obj, InfiniteTransition.TransitionAnimationState transitionAnimationState, Object obj2, InfiniteRepeatableSpec infiniteRepeatableSpec) {
        if (!q10.b(obj, transitionAnimationState.getInitialValue$animation_core()) || !q10.b(obj2, transitionAnimationState.getTargetValue$animation_core())) {
            transitionAnimationState.updateValues$animation_core(obj, obj2, infiniteRepeatableSpec);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult animateValue$lambda$2$0(final InfiniteTransition infiniteTransition, final InfiniteTransition.TransitionAnimationState transitionAnimationState, DisposableEffectScope disposableEffectScope) {
        infiniteTransition.addAnimation$animation_core(transitionAnimationState);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                InfiniteTransition.this.removeAnimation$animation_core(transitionAnimationState);
            }
        };
    }

    public static final InfiniteTransition rememberInfiniteTransition(String str, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1013651573, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InfiniteTransition(str);
            composer.updateRememberedValue(rememberedValue);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) rememberedValue;
        infiniteTransition.run$animation_core(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return infiniteTransition;
    }

    @er
    public static final /* synthetic */ InfiniteTransition rememberInfiniteTransition(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840193660, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:303)");
        }
        InfiniteTransition rememberInfiniteTransition = rememberInfiniteTransition("InfiniteTransition", composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberInfiniteTransition;
    }

    @er
    public static final /* synthetic */ State animateFloat(InfiniteTransition infiniteTransition, float f, float f2, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469472752, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:336)");
        }
        State<Float> animateFloat = animateFloat(infiniteTransition, f, f2, infiniteRepeatableSpec, "FloatAnimation", composer, (i & 14) | 24576 | (i & 112) | (i & 896) | (i & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateFloat;
    }

    @er
    public static final /* synthetic */ State animateValue(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1695411770, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:317)");
        }
        int i2 = (i >> 3) & 8;
        State animateValue = animateValue(infiniteTransition, obj, obj2, twoWayConverter, infiniteRepeatableSpec, "ValueAnimation", composer, (i & 14) | 196608 | (i2 << 3) | (i & 112) | (i2 << 6) | (i & 896) | (i & 7168) | (i & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValue;
    }
}
