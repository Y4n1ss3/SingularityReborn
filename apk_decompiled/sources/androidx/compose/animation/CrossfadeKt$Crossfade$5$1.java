package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.f30;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.uo;
import defpackage.w01;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CrossfadeKt$Crossfade$5$1 extends f30 implements my {
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ ny $content;
    final /* synthetic */ T $stateForContent;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1(Transition<T> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, T t, ny nyVar) {
        super(2);
        this.$this_Crossfade = transition;
        this.$animationSpec = finiteAnimationSpec;
        this.$stateForContent = t;
        this.$content = nyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public final void invoke(Composer composer, int i) {
        Object currentState;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-934471669, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
        }
        final Transition<T> transition = this.$this_Crossfade;
        CrossfadeKt$Crossfade$5$1$alpha$2 crossfadeKt$Crossfade$5$1$alpha$2 = new CrossfadeKt$Crossfade$5$1$alpha$2(this.$animationSpec);
        T t = this.$stateForContent;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zv.a);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean changed = composer.changed(transition);
            currentState = composer.rememberedValue();
            if (changed || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    Object currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        composer.startReplaceGroup(1378811975);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        float f = q10.b(currentState, t) ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Float valueOf = Float.valueOf(f);
        boolean changed2 = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new iy() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$invoke$$inlined$animateFloat$1
                /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
                @Override // defpackage.iy
                public final T invoke() {
                    return Transition.this.getTargetState();
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        Object value = ((State) rememberedValue).getValue();
        composer.startReplaceGroup(1378811975);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        float f2 = q10.b(value, t) ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Float valueOf2 = Float.valueOf(f2);
        boolean changed3 = composer.changed(transition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new iy() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$invoke$$inlined$animateFloat$2
                @Override // defpackage.iy
                public final Transition.Segment<T> invoke() {
                    return Transition.this.getSegment();
                }
            });
            composer.updateRememberedValue(rememberedValue2);
        }
        State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf, valueOf2, (FiniteAnimationSpec) crossfadeKt$Crossfade$5$1$alpha$2.invoke(((State) rememberedValue2).getValue(), (Object) composer, (Object) 0), vectorConverter, "FloatAnimation", composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        boolean changed4 = composer.changed(createTransitionAnimation);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed4 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new CrossfadeKt$Crossfade$5$1$1$1(createTransitionAnimation);
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (ky) rememberedValue3);
        ny nyVar = this.$content;
        Object obj = this.$stateForContent;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, graphicsLayer);
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        iy constructor = companion3.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
        uo.h(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        nyVar.invoke(obj, composer, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
