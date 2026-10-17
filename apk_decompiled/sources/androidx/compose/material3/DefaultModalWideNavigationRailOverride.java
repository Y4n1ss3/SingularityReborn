package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import defpackage.d41;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import defpackage.q10;
import defpackage.q6;
import defpackage.st;
import defpackage.t6;
import defpackage.un;
import defpackage.v4;
import defpackage.w01;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultModalWideNavigationRailOverride implements ModalWideNavigationRailOverride {
    public static final int $stable = 0;
    public static final DefaultModalWideNavigationRailOverride INSTANCE = new DefaultModalWideNavigationRailOverride();

    private DefaultModalWideNavigationRailOverride() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRail$lambda$16$lambda$15(zg zgVar, ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope) {
        zgVar.m(Boolean.valueOf(WideNavigationRailStateKt.isExpanded(modalWideNavigationRailOverrideScope.getState().getTargetValue())));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRail$lambda$18$lambda$17(un unVar, ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope) {
        p01.t(unVar, null, null, new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$4$1$1(modalWideNavigationRailOverrideScope, null), 3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRail$lambda$20$lambda$19(un unVar, Animatable animatable, float f) {
        p01.t(unVar, null, null, new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$5$1$1(animatable, f, null), 3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRail$lambda$22$lambda$21(un unVar, Animatable animatable) {
        p01.t(unVar, null, null, new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$6$1$1(animatable, null), 3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRail$lambda$23(DefaultModalWideNavigationRailOverride defaultModalWideNavigationRailOverride, ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, int i, Composer composer, int i2) {
        defaultModalWideNavigationRailOverride.ModalWideNavigationRail(modalWideNavigationRailOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalWideNavigationRail$lambda$3$lambda$2(State state) {
        return ((Number) state.getValue()).floatValue() == 0.0f;
    }

    private static final boolean ModalWideNavigationRail$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalWideNavigationRail$lambda$6$lambda$5(State state) {
        return ((Number) state.getValue()).floatValue() >= 0.3f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalWideNavigationRail$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [hm, java.lang.Object, mf] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // androidx.compose.material3.ModalWideNavigationRailOverride
    public void ModalWideNavigationRail(final ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, Composer composer, int i) {
        int i2;
        ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope2;
        my myVar;
        int i3;
        ?? r4;
        boolean z;
        float f;
        Composer startRestartGroup = composer.startRestartGroup(1751235721);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(modalWideNavigationRailOverrideScope) : startRestartGroup.changedInstance(modalWideNavigationRailOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1751235721, i2, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail (WideNavigationRail.kt:503)");
            }
            if (modalWideNavigationRailOverrideScope.getShouldHideOnCollapse()) {
                startRestartGroup.startReplaceGroup(95781714);
                startRestartGroup.endReplaceGroup();
                myVar = modalWideNavigationRailOverrideScope.getContent();
            } else {
                startRestartGroup.startReplaceGroup(95826602);
                boolean changed = startRestartGroup.changed(modalWideNavigationRailOverrideScope.getContent());
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = MovableContentKt.movableContentOf(modalWideNavigationRailOverrideScope.getContent());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                myVar = (my) rememberedValue;
                startRestartGroup.endReplaceGroup();
            }
            final my myVar2 = myVar;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            boolean changed2 = startRestartGroup.changed(modalWideNavigationRailOverrideScope.getState());
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ModalWideNavigationRailState(modalWideNavigationRailOverrideScope.getState(), density, value);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final ModalWideNavigationRailState modalWideNavigationRailState = (ModalWideNavigationRailState) rememberedValue2;
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(!WideNavigationRailStateKt.isExpanded(modalWideNavigationRailOverrideScope.getState().getTargetValue()) ? 0.0f : 1.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt.derivedStateOf(new t6(animateFloatAsState, i4));
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            State state = (State) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.derivedStateOf(new t6(animateFloatAsState, 3));
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final State state2 = (State) rememberedValue4;
            int i5 = i2 & 14;
            boolean changedInstance = (i5 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(modalWideNavigationRailOverrideScope))) | startRestartGroup.changedInstance(modalWideNavigationRailState);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1(modalWideNavigationRailOverrideScope, modalWideNavigationRailState, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final ky kyVar = (ky) rememberedValue5;
            boolean changedInstance2 = (i5 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(modalWideNavigationRailOverrideScope))) | startRestartGroup.changedInstance(modalWideNavigationRailState);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(modalWideNavigationRailOverrideScope, modalWideNavigationRailState, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            final my myVar3 = (my) rememberedValue6;
            if (modalWideNavigationRailOverrideScope.getShouldHideOnCollapse() || !ModalWideNavigationRail$lambda$4(state)) {
                i3 = i5;
                r4 = 0;
                startRestartGroup.startReplaceGroup(97788313);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(97400069);
                i3 = i5;
                r4 = 0;
                WideNavigationRailKt.WideNavigationRailLayout(modalWideNavigationRailOverrideScope.getModifier(), false, false, modalWideNavigationRailOverrideScope.getColors(), modalWideNavigationRailOverrideScope.getCollapsedShape(), modalWideNavigationRailOverrideScope.getHeader(), modalWideNavigationRailOverrideScope.getWindowInsets(), modalWideNavigationRailOverrideScope.getArrangement(), myVar2, startRestartGroup, 432);
                startRestartGroup = startRestartGroup;
                startRestartGroup.endReplaceGroup();
            }
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = d41.b(-1, 6, r4);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            zg zgVar = (zg) rememberedValue7;
            if (modalWideNavigationRailOverrideScope.getShouldHideOnCollapse()) {
                startRestartGroup.startReplaceGroup(97908438);
                boolean changedInstance3 = startRestartGroup.changedInstance(zgVar) | startRestartGroup.changedInstance(modalWideNavigationRailState);
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue8 == companion.getEmpty()) {
                    rememberedValue8 = new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1(zgVar, modalWideNavigationRailState, r4);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                EffectsKt.LaunchedEffect(zgVar, (my) rememberedValue8, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(98341849);
                startRestartGroup.endReplaceGroup();
            }
            if (ModalWideNavigationRail$lambda$4(state)) {
                modalWideNavigationRailOverrideScope2 = modalWideNavigationRailOverrideScope;
                startRestartGroup.startReplaceGroup(101334713);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(98512256);
                if (modalWideNavigationRailOverrideScope.getShouldHideOnCollapse()) {
                    z = true;
                    startRestartGroup.startReplaceGroup(98809081);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(98472731);
                    Modifier m226backgroundbw27NRU = BackgroundKt.m226backgroundbw27NRU(Modifier.Companion, modalWideNavigationRailOverrideScope.getColors().m2838getContainerColor0d7_KjU(), modalWideNavigationRailOverrideScope.getCollapsedShape());
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m226backgroundbw27NRU);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
                    if (startRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                    my b = k4.b(companion2, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifier = modalWideNavigationRailOverrideScope.getModifier();
                    f = WideNavigationRailKt.CollapsedRailWidth;
                    Modifier m814widthInVpY3zN4$default = SizeKt.m814widthInVpY3zN4$default(modifier, f, 0.0f, 2, r4);
                    z = true;
                    SpacerKt.Spacer(SizeKt.fillMaxHeight$default(m814widthInVpY3zN4$default, 0.0f, 1, r4), startRestartGroup, 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                }
                Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == companion.getEmpty()) {
                    rememberedValue9 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                un unVar = (un) rememberedValue9;
                Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == companion.getEmpty()) {
                    rememberedValue10 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, r4);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                final Animatable animatable = (Animatable) rememberedValue10;
                Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (rememberedValue11 == companion.getEmpty()) {
                    rememberedValue11 = new RailPredictiveBackState();
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                final RailPredictiveBackState railPredictiveBackState = (RailPredictiveBackState) rememberedValue11;
                int i6 = i3;
                boolean changedInstance4 = startRestartGroup.changedInstance(zgVar) | ((i6 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(modalWideNavigationRailOverrideScope))) ? z : false);
                Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue12 == companion.getEmpty()) {
                    rememberedValue12 = new v4(11, zgVar, modalWideNavigationRailOverrideScope);
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                boolean z2 = false;
                EffectsKt.SideEffect((iy) rememberedValue12, startRestartGroup, 0);
                ModalWideNavigationRailProperties expandedProperties = modalWideNavigationRailOverrideScope.getExpandedProperties();
                boolean changedInstance5 = startRestartGroup.changedInstance(unVar);
                if (i6 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(modalWideNavigationRailOverrideScope))) {
                    z2 = z;
                }
                boolean z3 = changedInstance5 | z2;
                Object rememberedValue13 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue13 == companion.getEmpty()) {
                    rememberedValue13 = new v4(12, unVar, modalWideNavigationRailOverrideScope);
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                }
                iy iyVar = (iy) rememberedValue13;
                boolean changedInstance6 = startRestartGroup.changedInstance(unVar) | startRestartGroup.changedInstance(animatable);
                Object rememberedValue14 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue14 == companion.getEmpty()) {
                    rememberedValue14 = new defpackage.g(16, unVar, animatable);
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                }
                ky kyVar2 = (ky) rememberedValue14;
                boolean changedInstance7 = startRestartGroup.changedInstance(unVar) | startRestartGroup.changedInstance(animatable);
                Object rememberedValue15 = startRestartGroup.rememberedValue();
                if (changedInstance7 || rememberedValue15 == companion.getEmpty()) {
                    rememberedValue15 = new v4(13, unVar, animatable);
                    startRestartGroup.updateRememberedValue(rememberedValue15);
                }
                my myVar4 = new my() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7
                    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
                    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer2, int i7) {
                        boolean ModalWideNavigationRail$lambda$7;
                        boolean z4;
                        boolean z5;
                        float f2;
                        boolean ModalWideNavigationRail$lambda$72;
                        if (!composer2.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1345045690, i7, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail.<anonymous> (WideNavigationRail.kt:600)");
                        }
                        Modifier imePadding = WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null));
                        final ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope3 = ModalWideNavigationRailOverrideScope.this;
                        ModalWideNavigationRailState modalWideNavigationRailState2 = modalWideNavigationRailState;
                        ky kyVar3 = kyVar;
                        Animatable<Float, AnimationVector1D> animatable2 = animatable;
                        RailPredictiveBackState railPredictiveBackState2 = railPredictiveBackState;
                        my myVar5 = myVar3;
                        my myVar6 = myVar2;
                        State<Boolean> state3 = state2;
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, imePadding);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        iy constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer2);
                        my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                        if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                        }
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (modalWideNavigationRailOverrideScope3.getShouldHideOnCollapse()) {
                            z4 = modalWideNavigationRailState2.getTargetValue() != WideNavigationRailValue.Collapsed;
                        } else {
                            ModalWideNavigationRail$lambda$7 = DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$7(state3);
                            z4 = ModalWideNavigationRail$lambda$7;
                        }
                        WideNavigationRailKt.m2848Scrim3JVO9M(modalWideNavigationRailOverrideScope3.getColors().m2842getModalScrimColor0d7_KjU(), kyVar3, z4, composer2, 0);
                        if (!modalWideNavigationRailOverrideScope3.getShouldHideOnCollapse()) {
                            ModalWideNavigationRail$lambda$72 = DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$7(state3);
                            if (!ModalWideNavigationRail$lambda$72) {
                                z5 = false;
                                boolean shouldHideOnCollapse = modalWideNavigationRailOverrideScope3.getShouldHideOnCollapse();
                                Modifier modifier2 = modalWideNavigationRailOverrideScope3.getModifier();
                                WideNavigationRailColors colors = modalWideNavigationRailOverrideScope3.getColors();
                                Shape expandedShape = modalWideNavigationRailOverrideScope3.getExpandedShape();
                                f2 = WideNavigationRailKt.ExpandedRailMaxWidth;
                                WideNavigationRailKt.m2847ModalWideNavigationRailContentpU6N4AM(z5, shouldHideOnCollapse, animatable2, railPredictiveBackState2, myVar5, modifier2, modalWideNavigationRailState2, colors, expandedShape, f2, ComposableLambdaKt.rememberComposableLambda(208840989, true, new my() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7$1$1
                                    public final void invoke(Composer composer3, int i8) {
                                        if (!composer3.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(208840989, i8, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail.<anonymous>.<anonymous>.<anonymous> (WideNavigationRail.kt:626)");
                                        }
                                        Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(Modifier.Companion, 0.0f, ModalWideNavigationRailOverrideScope.this.m2153getExpandedHeaderTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                        ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope4 = ModalWideNavigationRailOverrideScope.this;
                                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m766paddingqDBjuR0$default);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                        iy constructor3 = companion4.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer3);
                                        my b3 = k4.b(companion4, m3878constructorimpl3, maybeCachedBoxMeasurePolicy3, m3878constructorimpl3, currentCompositionLocalMap3);
                                        if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                                        }
                                        Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion4.getSetModifier());
                                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                        my header = modalWideNavigationRailOverrideScope4.getHeader();
                                        if (header == null) {
                                            composer3.startReplaceGroup(-1627801290);
                                        } else {
                                            composer3.startReplaceGroup(-2130719701);
                                            header.invoke(composer3, 0);
                                        }
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, composer2, 54), modalWideNavigationRailOverrideScope3.getWindowInsets(), modalWideNavigationRailOverrideScope3.getShouldHideOnCollapse(), modalWideNavigationRailOverrideScope3.getArrangement(), myVar6, composer2, (Animatable.$stable << 6) | 805309440, 6);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    return;
                                }
                                ComposerKt.traceEventEnd();
                                return;
                            }
                        }
                        z5 = true;
                        boolean shouldHideOnCollapse2 = modalWideNavigationRailOverrideScope3.getShouldHideOnCollapse();
                        Modifier modifier22 = modalWideNavigationRailOverrideScope3.getModifier();
                        WideNavigationRailColors colors2 = modalWideNavigationRailOverrideScope3.getColors();
                        Shape expandedShape2 = modalWideNavigationRailOverrideScope3.getExpandedShape();
                        f2 = WideNavigationRailKt.ExpandedRailMaxWidth;
                        WideNavigationRailKt.m2847ModalWideNavigationRailContentpU6N4AM(z5, shouldHideOnCollapse2, animatable2, railPredictiveBackState2, myVar5, modifier22, modalWideNavigationRailState2, colors2, expandedShape2, f2, ComposableLambdaKt.rememberComposableLambda(208840989, true, new my() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7$1$1
                            public final void invoke(Composer composer3, int i8) {
                                if (!composer3.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(208840989, i8, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail.<anonymous>.<anonymous>.<anonymous> (WideNavigationRail.kt:626)");
                                }
                                Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(Modifier.Companion, 0.0f, ModalWideNavigationRailOverrideScope.this.m2153getExpandedHeaderTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope4 = ModalWideNavigationRailOverrideScope.this;
                                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m766paddingqDBjuR0$default);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                iy constructor3 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer3);
                                my b3 = k4.b(companion4, m3878constructorimpl3, maybeCachedBoxMeasurePolicy3, m3878constructorimpl3, currentCompositionLocalMap3);
                                if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                                }
                                Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                my header = modalWideNavigationRailOverrideScope4.getHeader();
                                if (header == null) {
                                    composer3.startReplaceGroup(-1627801290);
                                } else {
                                    composer3.startReplaceGroup(-2130719701);
                                    header.invoke(composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.my
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return w01.a;
                            }
                        }, composer2, 54), modalWideNavigationRailOverrideScope3.getWindowInsets(), modalWideNavigationRailOverrideScope3.getShouldHideOnCollapse(), modalWideNavigationRailOverrideScope3.getArrangement(), myVar6, composer2, (Animatable.$stable << 6) | 805309440, 6);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                };
                modalWideNavigationRailOverrideScope2 = modalWideNavigationRailOverrideScope;
                WideNavigationRail_androidKt.ModalWideNavigationRailDialog(iyVar, expandedProperties, kyVar2, (iy) rememberedValue15, railPredictiveBackState, ComposableLambdaKt.rememberComposableLambda(1345045690, z, myVar4, startRestartGroup, 54), startRestartGroup, 221184);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modalWideNavigationRailOverrideScope2 = modalWideNavigationRailOverrideScope;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, modalWideNavigationRailOverrideScope2, i, 14));
        }
    }
}
