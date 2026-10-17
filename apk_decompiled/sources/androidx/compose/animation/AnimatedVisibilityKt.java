package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:156:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedEnterExitImpl(Transition<T> transition, ky kyVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, my myVar, OnLookaheadMeasured onLookaheadMeasured, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer composer2;
        OnLookaheadMeasured onLookaheadMeasured2;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Modifier modifier2;
        OnLookaheadMeasured onLookaheadMeasured3 = onLookaheadMeasured;
        Composer startRestartGroup = composer.startRestartGroup(1912839215);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(enterTransition) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(exitTransition) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.RenderEffect : 65536;
        }
        int i6 = i2 & 64;
        int i7 = 1572864;
        if (i6 == 0) {
            if ((1572864 & i) == 0) {
                i7 = (i & 2097152) == 0 ? startRestartGroup.changed(onLookaheadMeasured3) : startRestartGroup.changedInstance(onLookaheadMeasured3) ? 1048576 : Fields.BlendMode;
            }
            if ((12582912 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
            }
            i4 = i3;
            boolean z = true;
            if (startRestartGroup.shouldExecute((4793491 & i4) == 4793490, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                onLookaheadMeasured2 = onLookaheadMeasured3;
            } else {
                if (i6 != 0) {
                    onLookaheadMeasured3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1912839215, i4, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:715)");
                }
                if (((Boolean) kyVar.invoke(transition.getTargetState())).booleanValue() || ((Boolean) kyVar.invoke(transition.getCurrentState())).booleanValue() || transition.isSeeking() || transition.getHasInitialValueAnimations()) {
                    startRestartGroup.startReplaceGroup(-232413539);
                    int i8 = i4 & 14;
                    int i9 = i8 | 48;
                    int i10 = i9 & 14;
                    boolean z2 = ((i10 ^ 6) > 4 && startRestartGroup.changed(transition)) || (i9 & 6) == 4;
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = transition.getCurrentState();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    if (transition.isSeeking()) {
                        rememberedValue = transition.getCurrentState();
                    }
                    startRestartGroup.startReplaceGroup(1844425648);
                    OnLookaheadMeasured onLookaheadMeasured4 = onLookaheadMeasured3;
                    if (ComposerKt.isTraceInProgress()) {
                        i5 = i8;
                        ComposerKt.traceEventStart(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:724)");
                    } else {
                        i5 = i8;
                    }
                    int i11 = i4 & 126;
                    EnterExitState targetEnterExit = targetEnterExit(transition, kyVar, rememberedValue, startRestartGroup, i11);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    T targetState = transition.getTargetState();
                    startRestartGroup.startReplaceGroup(1844425648);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:724)");
                    }
                    EnterExitState targetEnterExit2 = targetEnterExit(transition, kyVar, targetState, startRestartGroup, i11);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    int i12 = i5;
                    onLookaheadMeasured2 = onLookaheadMeasured4;
                    Transition createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, targetEnterExit, targetEnterExit2, "EnterExitTransition", startRestartGroup, i10 | 3072);
                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(myVar, startRestartGroup, (i4 >> 15) & 14);
                    Object invoke = myVar.invoke(createChildTransitionInternal.getCurrentState(), createChildTransitionInternal.getTargetState());
                    boolean changed = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(rememberUpdatedState);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(createChildTransitionInternal, rememberUpdatedState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    State produceState = SnapshotStateKt.produceState(invoke, (my) rememberedValue2, startRestartGroup, 0);
                    if (getExitFinished(createChildTransitionInternal) && AnimatedEnterExitImpl$lambda$3(produceState)) {
                        startRestartGroup.startReplaceGroup(-272333293);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                    } else {
                        startRestartGroup.startReplaceGroup(-231383533);
                        boolean z3 = i12 == 4;
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = new AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue3;
                        int i13 = i4 >> 6;
                        Modifier createModifier = EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, null, "Built-in", startRestartGroup, (i13 & 112) | 24576 | (i13 & 896), 4);
                        composer2 = startRestartGroup;
                        if (onLookaheadMeasured2 != null) {
                            composer2.startReplaceGroup(-230964196);
                            Modifier.Companion companion = Modifier.Companion;
                            if ((3670016 & i4) != 1048576 && ((i4 & 2097152) == 0 || !composer2.changedInstance(onLookaheadMeasured2))) {
                                z = false;
                            }
                            Object rememberedValue4 = composer2.rememberedValue();
                            if (z || rememberedValue4 == Composer.Companion.getEmpty()) {
                                rememberedValue4 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(onLookaheadMeasured2);
                                composer2.updateRememberedValue(rememberedValue4);
                            }
                            modifier2 = LayoutModifierKt.layout(companion, (ny) rememberedValue4);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-7432681);
                            composer2.endReplaceGroup();
                            modifier2 = Modifier.Companion;
                        }
                        Modifier then = modifier.then(createModifier.then(modifier2));
                        Object rememberedValue5 = composer2.rememberedValue();
                        if (rememberedValue5 == Composer.Companion.getEmpty()) {
                            rememberedValue5 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) rememberedValue5;
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, then);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        iy constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                        Updater.m3886setimpl(m3878constructorimpl, animatedEnterExitMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                        nyVar.invoke(animatedVisibilityScopeImpl, composer2, Integer.valueOf((i4 >> 18) & 112));
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-272333293);
                    startRestartGroup.endReplaceGroup();
                    onLookaheadMeasured2 = onLookaheadMeasured3;
                    composer2 = startRestartGroup;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedEnterExitImpl$4(transition, kyVar, modifier, enterTransition, exitTransition, myVar, onLookaheadMeasured2, nyVar, i, i2));
                return;
            }
            return;
        }
        i3 |= i7;
        if ((12582912 & i) == 0) {
        }
        i4 = i3;
        boolean z4 = true;
        if (startRestartGroup.shouldExecute((4793491 & i4) == 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final my AnimatedEnterExitImpl$lambda$1(State<? extends my> state) {
        return state.getValue();
    }

    private static final boolean AnimatedEnterExitImpl$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        Modifier modifier3;
        EnterTransition enterTransition3;
        ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(657024243);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(str) ? Fields.Clip : 8192;
                        if ((196608 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
                        }
                        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                            if (i8 != 0) {
                                modifier4 = Modifier.Companion;
                                i7 = i6;
                            } else {
                                i7 = i6;
                                modifier4 = modifier2;
                            }
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                            ExitTransition plus2 = i5 != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null)) : exitTransition2;
                            String str3 = i7 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                            }
                            Transition rememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str3, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = AnimatedVisibilityKt$AnimatedVisibility$7$1.INSTANCE;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ky kyVar = (ky) rememberedValue;
                            int i9 = i3 << 3;
                            AnimatedVisibilityImpl(rememberTransition, kyVar, modifier4, plus, plus2, nyVar, startRestartGroup, (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168) | (i3 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition3 = plus;
                            exitTransition3 = plus2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            str2 = str;
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$8(mutableTransitionState, modifier3, enterTransition3, exitTransition3, str2, nyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    if ((196608 & i) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((196608 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final <T> void AnimatedVisibilityImpl(Transition<T> transition, ky kyVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, ny nyVar, Composer composer, int i) {
        int i2;
        ExitTransition exitTransition2;
        Composer startRestartGroup = composer.startRestartGroup(1706321816);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(enterTransition) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            exitTransition2 = exitTransition;
            i2 |= startRestartGroup.changed(exitTransition2) ? Fields.Clip : 8192;
        } else {
            exitTransition2 = exitTransition;
        }
        if ((i & 196608) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1706321816, i2, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:677)");
            }
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(kyVar, transition);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier layout = LayoutModifierKt.layout(modifier, (ny) rememberedValue);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AnimatedEnterExitImpl(transition, kyVar, layout, enterTransition, exitTransition2, (my) rememberedValue2, null, nyVar, startRestartGroup, i3 | 196608 | i4 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibilityImpl$3(transition, kyVar, modifier, enterTransition, exitTransition, nyVar, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getExitFinished(Transition<EnterExitState> transition) {
        EnterExitState currentState = transition.getCurrentState();
        EnterExitState enterExitState = EnterExitState.PostExit;
        return currentState == enterExitState && transition.getTargetState() == enterExitState;
    }

    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, ky kyVar, T t, Composer composer, int i) {
        EnterExitState enterExitState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:833)");
        }
        composer.startMovableGroup(-422486745, transition);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(-212166497);
            composer.endReplaceGroup();
            enterExitState = ((Boolean) kyVar.invoke(t)).booleanValue() ? EnterExitState.Visible : ((Boolean) kyVar.invoke(transition.getCurrentState())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            composer.startReplaceGroup(-211892364);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (((Boolean) kyVar.invoke(transition.getCurrentState())).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            enterExitState = ((Boolean) kyVar.invoke(t)).booleanValue() ? EnterExitState.Visible : ((Boolean) mutableState.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            composer.endReplaceGroup();
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterExitState;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(RowScope rowScope, boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        Modifier modifier3;
        EnterTransition enterTransition3;
        ExitTransition exitTransition3;
        String str2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(234057107);
        if ((i & 48) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? Fields.Clip : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changed(str) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                        }
                        if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                            Modifier modifier4 = i7 != 0 ? Modifier.Companion : modifier2;
                            if (i4 != 0) {
                                enterTransition2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                            }
                            ExitTransition plus = i5 != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)) : exitTransition2;
                            String str3 = i6 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                            }
                            int i8 = i3 >> 3;
                            Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str3, startRestartGroup, (i8 & 14) | ((i3 >> 12) & 112), 0);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = AnimatedVisibilityKt$AnimatedVisibility$3$1.INSTANCE;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            EnterTransition enterTransition4 = enterTransition2;
                            AnimatedVisibilityImpl(updateTransition, (ky) rememberedValue, modifier4, enterTransition4, plus, nyVar, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransition4;
                            exitTransition3 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str2 = str;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$4(rowScope, z, modifier3, enterTransition3, exitTransition3, str2, nyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(ColumnScope columnScope, boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        Modifier modifier3;
        EnterTransition enterTransition3;
        ExitTransition exitTransition3;
        String str2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1799879339);
        if ((i & 48) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? Fields.Clip : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changed(str) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                        }
                        if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                            Modifier modifier4 = i7 != 0 ? Modifier.Companion : modifier2;
                            if (i4 != 0) {
                                enterTransition2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                            }
                            ExitTransition plus = i5 != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)) : exitTransition2;
                            String str3 = i6 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                            }
                            int i8 = i3 >> 3;
                            Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str3, startRestartGroup, (i8 & 14) | ((i3 >> 12) & 112), 0);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = AnimatedVisibilityKt$AnimatedVisibility$5$1.INSTANCE;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            EnterTransition enterTransition4 = enterTransition2;
                            AnimatedVisibilityImpl(updateTransition, (ky) rememberedValue, modifier4, enterTransition4, plus, nyVar, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransition4;
                            exitTransition3 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str2 = str;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$6(columnScope, z, modifier3, enterTransition3, exitTransition3, str2, nyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, ny nyVar, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        Modifier modifier3;
        EnterTransition enterTransition3;
        ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-1448730565);
        if ((i & 6) == 0) {
            z2 = z;
            i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(str) ? Fields.Clip : 8192;
                        if ((196608 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
                        }
                        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                            if (i8 != 0) {
                                modifier4 = Modifier.Companion;
                                i7 = i6;
                            } else {
                                i7 = i6;
                                modifier4 = modifier2;
                            }
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                            ExitTransition plus2 = i5 != 0 ? EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            String str3 = i7 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                            }
                            Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = AnimatedVisibilityKt$AnimatedVisibility$1$1.INSTANCE;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ky kyVar = (ky) rememberedValue;
                            int i9 = i3 << 3;
                            AnimatedVisibilityImpl(updateTransition, kyVar, modifier4, plus, plus2, nyVar, startRestartGroup, (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168) | (i3 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition3 = plus;
                            exitTransition3 = plus2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            str2 = str;
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$2(z2, modifier3, enterTransition3, exitTransition3, str2, nyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    if ((196608 & i) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((196608 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(RowScope rowScope, MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        Modifier modifier3;
        EnterTransition enterTransition3;
        ExitTransition exitTransition3;
        String str2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1763490971);
        if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? Fields.Clip : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changed(str) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                        }
                        if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                            Modifier modifier4 = i7 != 0 ? Modifier.Companion : modifier2;
                            if (i4 != 0) {
                                enterTransition2 = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                            }
                            ExitTransition plus = i5 != 0 ? EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            String str3 = i6 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                            }
                            int i8 = i3 >> 3;
                            Transition rememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str3, startRestartGroup, MutableTransitionState.$stable | (i8 & 14) | ((i3 >> 12) & 112), 0);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = AnimatedVisibilityKt$AnimatedVisibility$9$1.INSTANCE;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            EnterTransition enterTransition4 = enterTransition2;
                            AnimatedVisibilityImpl(rememberTransition, (ky) rememberedValue, modifier4, enterTransition4, plus, nyVar, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransition4;
                            exitTransition3 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str2 = str;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$10(rowScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, str2, nyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(ColumnScope columnScope, MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        Modifier modifier3;
        EnterTransition enterTransition3;
        ExitTransition exitTransition3;
        String str2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1238803325);
        if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? Fields.Clip : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changed(str) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                        }
                        if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                            Modifier modifier4 = i7 != 0 ? Modifier.Companion : modifier2;
                            if (i4 != 0) {
                                enterTransition2 = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                            }
                            ExitTransition plus = i5 != 0 ? EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            String str3 = i6 != 0 ? "AnimatedVisibility" : str;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                            }
                            int i8 = i3 >> 3;
                            Transition rememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str3, startRestartGroup, MutableTransitionState.$stable | (i8 & 14) | ((i3 >> 12) & 112), 0);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = AnimatedVisibilityKt$AnimatedVisibility$11$1.INSTANCE;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            EnterTransition enterTransition4 = enterTransition2;
                            AnimatedVisibilityImpl(rememberTransition, (ky) rememberedValue, modifier4, enterTransition4, plus, nyVar, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransition4;
                            exitTransition3 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str2 = str;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$12(columnScope, mutableTransitionState, modifier3, enterTransition3, exitTransition3, str2, nyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedVisibility(Transition<T> transition, ky kyVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        EnterTransition enterTransition3;
        ExitTransition exitTransition2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1699747442);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(exitTransition) ? Fields.Clip : 8192;
                    if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        Modifier modifier3 = i6 != 0 ? Modifier.Companion : modifier2;
                        EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                        ExitTransition plus2 = i5 != 0 ? EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1699747442, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
                        }
                        EnterTransition enterTransition4 = plus;
                        AnimatedVisibilityImpl(transition, kyVar, modifier3, enterTransition4, plus2, nyVar, startRestartGroup, i3 & 524286);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        enterTransition3 = enterTransition4;
                        exitTransition2 = plus2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        enterTransition3 = enterTransition2;
                        exitTransition2 = exitTransition;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedVisibility$13(transition, kyVar, modifier2, enterTransition3, exitTransition2, nyVar, i, i2));
                        return;
                    }
                    return;
                }
                if ((196608 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
