package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.iy;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$sharedBounds$2 extends f30 implements ny {
    final /* synthetic */ AnimatedVisibilityScope $animatedVisibilityScope;
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ SharedTransitionScope.ResizeMode $resizeMode;
    final /* synthetic */ SharedTransitionScope.SharedContentState $sharedContentState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedBounds$2(AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.ResizeMode resizeMode) {
        super(3);
        this.$animatedVisibilityScope = animatedVisibilityScope;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$sharedContentState = sharedContentState;
        this.$resizeMode = resizeMode;
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        composer.startReplaceGroup(-233734437);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-233734437, i, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:1053)");
        }
        Transition<EnterExitState> transition = this.$animatedVisibilityScope.getTransition();
        EnterTransition enterTransition = this.$enter;
        ExitTransition exitTransition = this.$exit;
        boolean changedInstance = composer.changedInstance(this.$sharedContentState);
        SharedTransitionScope.SharedContentState sharedContentState = this.$sharedContentState;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SharedTransitionScopeImpl$sharedBounds$2$1$1(sharedContentState);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier createModifier = EnterExitTransitionKt.createModifier(transition, enterTransition, exitTransition, (iy) rememberedValue, "enter/exit for " + this.$sharedContentState.getKey(), composer, 0, 0);
        if (this.$resizeMode instanceof ScaleToBoundsImpl) {
            composer.startReplaceGroup(-1039792755);
            Modifier.Companion companion = Modifier.Companion;
            ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) this.$resizeMode;
            boolean changedInstance2 = composer.changedInstance(this.$sharedContentState);
            SharedTransitionScope.SharedContentState sharedContentState2 = this.$sharedContentState;
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new SharedTransitionScopeImpl$sharedBounds$2$2$1(sharedContentState2);
                composer.updateRememberedValue(rememberedValue2);
            }
            modifier2 = SkipToLookaheadSizeNodeKt.createContentScaleModifier(companion, scaleToBoundsImpl, (iy) rememberedValue2);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1039175545);
            composer.endReplaceGroup();
            modifier2 = Modifier.Companion;
        }
        Modifier then = createModifier.then(modifier2);
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
