package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$5 implements my {
    final /* synthetic */ float $endPadding;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ my $icon;
    final /* synthetic */ float $iconPadding;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ float $minWidth;
    final /* synthetic */ float $startPadding;
    final /* synthetic */ my $text;

    public FloatingActionButtonKt$ExtendedFloatingActionButton$5(boolean z, float f, float f2, float f3, float f4, my myVar, float f5, my myVar2) {
        this.$expanded = z;
        this.$minWidth = f;
        this.$minHeight = f2;
        this.$startPadding = f3;
        this.$endPadding = f4;
        this.$icon = myVar;
        this.$iconPadding = f5;
        this.$text = myVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$12$lambda$10$lambda$9(State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) state.getValue()).floatValue());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$12$lambda$6$lambda$5(Transition transition) {
        return ((Number) transition.getCurrentState()).floatValue() == 0.0f && !transition.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$12$lambda$8$lambda$7(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult invoke$lambda$4$lambda$3(float f, State state, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int lerp = MathHelpersKt.lerp(measureScope.mo361roundToPx0680j_4(f), measurable.maxIntrinsicWidth(Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl())), ((Number) state.getValue()).floatValue());
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        return MeasureScope.layout$default(measureScope, lerp, mo6234measureBRTryo0.getHeight(), null, new h0(0, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$4$lambda$3$lambda$2(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d9, code lost:
    
        if (defpackage.q10.b(r11.rememberedValue(), java.lang.Integer.valueOf(r13)) == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        Alignment.Companion companion;
        int i2;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-827388388, i, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:464)");
        }
        Transition updateTransition = TransitionKt.updateTransition(Float.valueOf(this.$expanded ? 1.0f : 0.0f), "expanded state", composer, 48, 0);
        final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
        final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
        ny nyVar = new ny() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$expandedWidthProgress$1
            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Float> segment, Composer composer2, int i3) {
                composer2.startReplaceGroup(-1114419602);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1114419602, i3, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
                }
                FiniteAnimationSpec<Float> finiteAnimationSpec = value;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return finiteAnimationSpec;
            }

            @Override // defpackage.ny
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Transition.Segment<Float>) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        };
        zv zvVar = zv.a;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zvVar);
        float floatValue = ((Number) updateTransition.getCurrentState()).floatValue();
        composer.startReplaceGroup(-157343033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-157343033, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Float valueOf = Float.valueOf(floatValue);
        float floatValue2 = ((Number) updateTransition.getTargetState()).floatValue();
        composer.startReplaceGroup(-157343033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-157343033, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(floatValue2), (FiniteAnimationSpec) nyVar.invoke(updateTransition.getSegment(), composer, 0), vectorConverter, "FloatAnimation", composer, 0);
        ny nyVar2 = new ny() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$expandedAlphaProgress$1
            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Float> segment, Composer composer2, int i3) {
                composer2.startReplaceGroup(-781713402);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-781713402, i3, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
                }
                FiniteAnimationSpec<Float> finiteAnimationSpec = value2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return finiteAnimationSpec;
            }

            @Override // defpackage.ny
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Transition.Segment<Float>) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        };
        TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(zvVar);
        float floatValue3 = ((Number) updateTransition.getCurrentState()).floatValue();
        composer.startReplaceGroup(175363167);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(175363167, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Float valueOf2 = Float.valueOf(floatValue3);
        float floatValue4 = ((Number) updateTransition.getTargetState()).floatValue();
        composer.startReplaceGroup(175363167);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(175363167, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(floatValue4), (FiniteAnimationSpec) nyVar2.invoke(updateTransition.getSegment(), composer, 0), vectorConverter2, "FloatAnimation", composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        boolean changed = composer.changed(this.$minWidth) | composer.changed(createTransitionAnimation);
        final float f = this.$minWidth;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ny() { // from class: androidx.compose.material3.f0
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MeasureResult invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = FloatingActionButtonKt$ExtendedFloatingActionButton$5.invoke$lambda$4$lambda$3(f, createTransitionAnimation, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(SizeKt.m811sizeInqDBjuR0$default(LayoutModifierKt.layout(companion2, (ny) rememberedValue), this.$minWidth, this.$minHeight, 0.0f, 0.0f, 12, null), this.$startPadding, 0.0f, this.$endPadding, 0.0f, 10, null);
        Alignment.Companion companion3 = Alignment.Companion;
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        my myVar = this.$icon;
        float f2 = this.$iconPadding;
        my myVar2 = this.$text;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m766paddingqDBjuR0$default);
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        iy constructor = companion4.getConstructor();
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
        my b = k4.b(companion4, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting()) {
            companion = companion3;
        } else {
            companion = companion3;
        }
        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        myVar.invoke(composer, 0);
        boolean changed2 = composer.changed(updateTransition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new f(updateTransition, 2));
            composer.updateRememberedValue(rememberedValue2);
        }
        if (((Boolean) ((State) rememberedValue2).getValue()).booleanValue()) {
            composer.startReplaceGroup(65953058);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(65675329);
            Object rememberedValue3 = composer.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (rememberedValue3 == companion5.getEmpty()) {
                rememberedValue3 = new d(12);
                composer.updateRememberedValue(rememberedValue3);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion2, (ky) rememberedValue3);
            boolean changed3 = composer.changed(createTransitionAnimation2);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == companion5.getEmpty()) {
                i2 = 0;
                rememberedValue4 = new g0(createTransitionAnimation2, i2);
                composer.updateRememberedValue(rememberedValue4);
            } else {
                i2 = 0;
            }
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(clearAndSetSemantics, (ky) rememberedValue4);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer, i2);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, i2);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, graphicsLayer);
            iy constructor2 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer);
            my b2 = k4.b(companion4, m3878constructorimpl2, rowMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion4.getSetModifier());
            SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion2, f2), composer, 0);
            myVar2.invoke(composer, 0);
            composer.endNode();
            composer.endReplaceGroup();
        }
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
