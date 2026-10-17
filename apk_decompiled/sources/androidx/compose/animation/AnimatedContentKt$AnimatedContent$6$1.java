package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import defpackage.f30;
import defpackage.fb0;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.oy;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$6$1 extends f30 implements my {
    final /* synthetic */ oy $content;
    final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
    final /* synthetic */ S $stateForContent;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ ky $transitionSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1(Transition<S> transition, S s, ky kyVar, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, SnapshotStateList<S> snapshotStateList, oy oyVar) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$stateForContent = s;
        this.$transitionSpec = kyVar;
        this.$rootScope = animatedContentTransitionScopeImpl;
        this.$currentlyVisible = snapshotStateList;
        this.$content = oyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-23915175, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
        }
        ky kyVar = this.$transitionSpec;
        Object obj = this.$rootScope;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = (ContentTransform) kyVar.invoke(obj);
            composer.updateRememberedValue(rememberedValue);
        }
        ContentTransform contentTransform = (ContentTransform) rememberedValue;
        boolean changed = composer.changed(q10.b(this.$this_AnimatedContent.getSegment().getTargetState(), this.$stateForContent));
        Transition<S> transition = this.$this_AnimatedContent;
        S s = this.$stateForContent;
        ky kyVar2 = this.$transitionSpec;
        Object obj2 = this.$rootScope;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = q10.b(transition.getSegment().getTargetState(), s) ? ExitTransition.Companion.getNone() : ((ContentTransform) kyVar2.invoke(obj2)).getInitialContentExit();
            composer.updateRememberedValue(rememberedValue2);
        }
        ExitTransition exitTransition = (ExitTransition) rememberedValue2;
        S s2 = this.$stateForContent;
        Transition<S> transition2 = this.$this_AnimatedContent;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new AnimatedContentTransitionScopeImpl.ChildData(q10.b(s2, transition2.getTargetState()));
            composer.updateRememberedValue(rememberedValue3);
        }
        AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) rememberedValue3;
        EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
        Modifier.Companion companion2 = Modifier.Companion;
        boolean changedInstance = composer.changedInstance(contentTransform);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new AnimatedContentKt$AnimatedContent$6$1$1$1(contentTransform);
            composer.updateRememberedValue(rememberedValue4);
        }
        Modifier layout = LayoutModifierKt.layout(companion2, (ny) rememberedValue4);
        childData.setTarget(q10.b(this.$stateForContent, this.$this_AnimatedContent.getTargetState()));
        Modifier then = layout.then(childData);
        Transition<S> transition3 = this.$this_AnimatedContent;
        boolean changedInstance2 = composer.changedInstance(this.$stateForContent);
        S s3 = this.$stateForContent;
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new AnimatedContentKt$AnimatedContent$6$1$3$1(s3);
            composer.updateRememberedValue(rememberedValue5);
        }
        ky kyVar3 = (ky) rememberedValue5;
        boolean changed2 = composer.changed(exitTransition);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed2 || rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = new AnimatedContentKt$AnimatedContent$6$1$4$1(exitTransition);
            composer.updateRememberedValue(rememberedValue6);
        }
        AnimatedVisibilityKt.AnimatedEnterExitImpl(transition3, kyVar3, then, targetContentEnter, exitTransition, (my) rememberedValue6, null, ComposableLambdaKt.rememberComposableLambda(-143346359, true, new AnonymousClass5(this.$currentlyVisible, this.$stateForContent, this.$rootScope, this.$content), composer, 54), composer, 12582912, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5, reason: invalid class name */
    public static final class AnonymousClass5 extends f30 implements ny {
        final /* synthetic */ oy $content;
        final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
        final /* synthetic */ S $stateForContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(SnapshotStateList<S> snapshotStateList, S s, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, oy oyVar) {
            super(3);
            this.$currentlyVisible = snapshotStateList;
            this.$stateForContent = s;
            this.$rootScope = animatedContentTransitionScopeImpl;
            this.$content = oyVar;
        }

        public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(animatedVisibilityScope) : composer.changedInstance(animatedVisibilityScope) ? 4 : 2;
            }
            if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-143346359, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
            }
            boolean changed = composer.changed(this.$currentlyVisible) | composer.changedInstance(this.$stateForContent) | composer.changedInstance(this.$rootScope);
            SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
            S s = this.$stateForContent;
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.$rootScope;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedContentKt$AnimatedContent$6$1$5$1$1(snapshotStateList, s, animatedContentTransitionScopeImpl);
                composer.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(animatedVisibilityScope, (ky) rememberedValue, composer, i & 14);
            fb0 targetSizeMap$animation = this.$rootScope.getTargetSizeMap$animation();
            Object obj = this.$stateForContent;
            animatedVisibilityScope.getClass();
            targetSizeMap$animation.l(obj, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation());
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                composer.updateRememberedValue(rememberedValue2);
            }
            this.$content.invoke((AnimatedContentScopeImpl) rememberedValue2, this.$stateForContent, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // defpackage.ny
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return w01.a;
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
