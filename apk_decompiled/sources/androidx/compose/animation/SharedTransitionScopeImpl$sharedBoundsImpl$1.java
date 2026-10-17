package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import defpackage.f30;
import defpackage.ky;
import defpackage.ny;
import defpackage.p01;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$sharedBoundsImpl$1 extends f30 implements ny {
    final /* synthetic */ BoundsTransform $boundsTransform;
    final /* synthetic */ SharedTransitionScope.OverlayClip $clipInOverlayDuringTransition;
    final /* synthetic */ Transition<T> $parentTransition;
    final /* synthetic */ SharedTransitionScope.PlaceholderSize $placeholderSize;
    final /* synthetic */ boolean $renderInOverlayDuringTransition;
    final /* synthetic */ boolean $renderOnlyWhenVisible;
    final /* synthetic */ SharedTransitionScope.SharedContentState $sharedContentState;
    final /* synthetic */ ky $visible;
    final /* synthetic */ float $zIndexInOverlay;
    final /* synthetic */ SharedTransitionScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedBoundsImpl$1(SharedTransitionScope.SharedContentState sharedContentState, Transition<T> transition, ky kyVar, SharedTransitionScopeImpl sharedTransitionScopeImpl, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, SharedTransitionScope.OverlayClip overlayClip, float f, boolean z2, BoundsTransform boundsTransform) {
        super(3);
        this.$sharedContentState = sharedContentState;
        this.$parentTransition = transition;
        this.$visible = kyVar;
        this.this$0 = sharedTransitionScopeImpl;
        this.$placeholderSize = placeholderSize;
        this.$renderOnlyWhenVisible = z;
        this.$clipInOverlayDuringTransition = overlayClip;
        this.$zIndexInOverlay = f;
        this.$renderInOverlayDuringTransition = z2;
        this.$boundsTransform = boundsTransform;
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Transition rememberTransition;
        Composer composer2;
        SharedElementEntry rememberSharedElementState;
        Composer composer3 = composer;
        composer3.startReplaceGroup(-1539505585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1539505585, i, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:1225)");
        }
        Object key = this.$sharedContentState.getKey();
        composer3.startMovableGroup(-1996110529, key);
        SharedTransitionScopeImpl sharedTransitionScopeImpl = this.this$0;
        Object rememberedValue = composer3.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = sharedTransitionScopeImpl.sharedElementsFor(key);
            composer3.updateRememberedValue(rememberedValue);
        }
        SharedElement sharedElement = (SharedElement) rememberedValue;
        composer3.startMovableGroup(-1996106748, this.$parentTransition);
        boolean z = false;
        if (this.$parentTransition != null) {
            composer3.startReplaceGroup(-1749734647);
            Transition<T> transition = this.$parentTransition;
            String obj = key.toString();
            ky kyVar = this.$visible;
            boolean changed = composer3.changed(transition);
            Object rememberedValue2 = composer3.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = transition.getCurrentState();
                composer3.updateRememberedValue(rememberedValue2);
            }
            if (transition.isSeeking()) {
                rememberedValue2 = transition.getCurrentState();
            }
            composer3.startReplaceGroup(1498260051);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1498260051, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:1234)");
            }
            Boolean bool = (Boolean) kyVar.invoke(rememberedValue2);
            bool.getClass();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer3.endReplaceGroup();
            Object targetState = transition.getTargetState();
            composer3.startReplaceGroup(1498260051);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1498260051, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:1234)");
            }
            Boolean bool2 = (Boolean) kyVar.invoke(targetState);
            bool2.getClass();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer3.endReplaceGroup();
            rememberTransition = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, bool, bool2, obj, composer3, 0);
            Composer composer4 = composer3;
            composer4.endReplaceGroup();
            composer2 = composer4;
        } else {
            composer3.startReplaceGroup(-1749482679);
            ky kyVar2 = this.$visible;
            kyVar2.getClass();
            p01.f(1, kyVar2);
            Boolean bool3 = (Boolean) kyVar2.invoke(w01.a);
            boolean booleanValue = bool3.booleanValue();
            Object rememberedValue3 = composer3.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                if (sharedElement.getEnabledEntries().isEmpty()) {
                    z = booleanValue;
                } else if (!booleanValue) {
                    z = true;
                }
                rememberedValue3 = new MutableTransitionState(Boolean.valueOf(z));
                composer3.updateRememberedValue(rememberedValue3);
            }
            MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue3;
            mutableTransitionState.setTargetState$animation_core(bool3);
            rememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, null, composer3, MutableTransitionState.$stable, 2);
            composer3.endReplaceGroup();
            composer2 = composer3;
        }
        composer2.startMovableGroup(-1996043323, Boolean.valueOf(this.this$0.isTransitionActive()));
        Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(rememberTransition, VectorConvertersKt.getVectorConverter(Rect.Companion), null, composer2, 0, 2);
        composer2.endMovableGroup();
        boolean changed2 = composer2.changed(rememberTransition);
        SharedTransitionScopeImpl sharedTransitionScopeImpl2 = this.this$0;
        BoundsTransform boundsTransform = this.$boundsTransform;
        Object rememberedValue4 = composer2.rememberedValue();
        if (changed2 || rememberedValue4 == companion.getEmpty()) {
            Object boundsAnimation = new BoundsAnimation(sharedTransitionScopeImpl2, rememberTransition, createDeferredAnimation, boundsTransform, sharedElement.getMomentumAnimationOffset());
            composer2.updateRememberedValue(boundsAnimation);
            rememberedValue4 = boundsAnimation;
        }
        BoundsAnimation boundsAnimation2 = (BoundsAnimation) rememberedValue4;
        boundsAnimation2.updateAnimation(createDeferredAnimation, this.$boundsTransform);
        composer2.endMovableGroup();
        rememberSharedElementState = this.this$0.rememberSharedElementState(sharedElement, boundsAnimation2, this.$placeholderSize, this.$renderOnlyWhenVisible, this.$sharedContentState, this.$clipInOverlayDuringTransition, this.$zIndexInOverlay, this.$renderInOverlayDuringTransition, composer, 0);
        composer.endMovableGroup();
        Modifier then = modifier.then(new SharedBoundsNodeElement(rememberSharedElementState));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return then;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
