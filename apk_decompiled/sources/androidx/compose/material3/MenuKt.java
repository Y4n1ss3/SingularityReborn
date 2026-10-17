package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import defpackage.a90;
import defpackage.fc;
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
public final class MenuKt {
    public static final float ClosedAlphaTarget = 0.0f;
    public static final float ClosedScaleTarget = 0.8f;
    public static final float ExpandedAlphaTarget = 1.0f;
    public static final float ExpandedScaleTarget = 1.0f;
    private static final float MenuVerticalMargin = Dp.m7611constructorimpl(48.0f);
    private static final float MenuListItemContainerHeight = Dp.m7611constructorimpl(48.0f);
    private static final float DropdownMenuItemHorizontalPadding = Dp.m7611constructorimpl(12.0f);
    private static final float DropdownMenuVerticalPadding = Dp.m7611constructorimpl(8.0f);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m7611constructorimpl(112.0f);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m7611constructorimpl(280.0f);

    /* renamed from: DropdownMenuContent-Qj0Zi0g, reason: not valid java name */
    public static final void m2143DropdownMenuContentQj0Zi0g(final Modifier modifier, final MutableTransitionState<Boolean> mutableTransitionState, final MutableState<TransformOrigin> mutableState, final ScrollState scrollState, final Shape shape, final long j, final float f, final float f2, final BorderStroke borderStroke, final ny nyVar, Composer composer, final int i) {
        int i2;
        Composer composer2;
        boolean z;
        Object a90Var;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(848986741);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(scrollState) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(j) ? Fields.RenderEffect : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= startRestartGroup.changed(f) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= startRestartGroup.changed(borderStroke) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(848986741, i2, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:369)");
            }
            Transition updateTransition = TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, "DropDownMenu", startRestartGroup, MutableTransitionState.$stable | 48 | ((i2 >> 3) & 14), 0);
            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            ny nyVar2 = new ny() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2
                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer3, int i4) {
                    composer3.startReplaceGroup(-745957716);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-745957716, i4, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:376)");
                    }
                    FiniteAnimationSpec<Float> finiteAnimationSpec = value;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return finiteAnimationSpec;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
            zv zvVar = zv.a;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zvVar);
            boolean booleanValue = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceGroup(143964305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:377)");
            }
            float f3 = booleanValue ? 1.0f : 0.8f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf = Float.valueOf(f3);
            boolean booleanValue2 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceGroup(143964305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:377)");
            }
            float f4 = booleanValue2 ? 1.0f : 0.8f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f4), (FiniteAnimationSpec) nyVar2.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            ny nyVar3 = new ny() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2
                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer3, int i4) {
                    composer3.startReplaceGroup(2839488);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2839488, i4, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
                    }
                    FiniteAnimationSpec<Float> finiteAnimationSpec = value2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return finiteAnimationSpec;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(zvVar);
            boolean booleanValue3 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceGroup(892761509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:382)");
            }
            float f5 = booleanValue3 ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf2 = Float.valueOf(f5);
            boolean booleanValue4 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceGroup(892761509);
            if (ComposerKt.isTraceInProgress()) {
                z = false;
                ComposerKt.traceEventStart(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:382)");
            } else {
                z = false;
            }
            float f6 = booleanValue4 ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            boolean z2 = z;
            State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f6), (FiniteAnimationSpec) nyVar3.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
            boolean booleanValue5 = ((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            Modifier.Companion companion = Modifier.Companion;
            boolean changed = startRestartGroup.changed(booleanValue5) | startRestartGroup.changed(createTransitionAnimation) | (((i2 & 112) == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(mutableTransitionState))) ? true : z2) | startRestartGroup.changed(createTransitionAnimation2);
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            boolean z3 = changed | z2;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
                i3 = i2;
                a90Var = new a90(booleanValue5, mutableTransitionState, mutableState, createTransitionAnimation, createTransitionAnimation2);
                startRestartGroup.updateRememberedValue(a90Var);
            } else {
                a90Var = rememberedValue;
                i3 = i2;
            }
            int i4 = i3 >> 9;
            int i5 = i3 >> 6;
            SurfaceKt.m2464SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(companion, (ky) a90Var), shape, j, 0L, f, f2, borderStroke, ComposableLambdaKt.rememberComposableLambda(-1463404422, true, new my() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                public final void invoke(Composer composer3, int i6) {
                    if (!composer3.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1463404422, i6, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:406)");
                    }
                    Modifier verticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m764paddingVpY3zN4$default(Modifier.this, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), IntrinsicSize.Max), scrollState, false, null, false, 14, null);
                    ny nyVar4 = nyVar;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, verticalScroll$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                    my b = k4.b(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                    nyVar4.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
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
            }, startRestartGroup, 54), startRestartGroup, (i4 & 896) | (i4 & 112) | 12582912 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 8);
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: b90
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 DropdownMenuContent_Qj0Zi0g$lambda$6;
                    int intValue = ((Integer) obj2).intValue();
                    DropdownMenuContent_Qj0Zi0g$lambda$6 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$6(Modifier.this, mutableTransitionState, mutableState, scrollState, shape, j, f, f2, borderStroke, nyVar, i, (Composer) obj, intValue);
                    return DropdownMenuContent_Qj0Zi0g$lambda$6;
                }
            });
        }
    }

    private static final float DropdownMenuContent_Qj0Zi0g$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float DropdownMenuContent_Qj0Zi0g$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DropdownMenuContent_Qj0Zi0g$lambda$5$lambda$4(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2, GraphicsLayerScope graphicsLayerScope) {
        float f = 0.8f;
        float f2 = 1.0f;
        graphicsLayerScope.setScaleX(!z ? DropdownMenuContent_Qj0Zi0g$lambda$1(state) : ((Boolean) mutableTransitionState.getTargetState()).booleanValue() ? 1.0f : 0.8f);
        if (!z) {
            f = DropdownMenuContent_Qj0Zi0g$lambda$1(state);
        } else if (((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
            f = 1.0f;
        }
        graphicsLayerScope.setScaleY(f);
        if (!z) {
            f2 = DropdownMenuContent_Qj0Zi0g$lambda$3(state2);
        } else if (!((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
            f2 = 0.0f;
        }
        graphicsLayerScope.setAlpha(f2);
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(((TransformOrigin) mutableState.getValue()).m5173unboximpl());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DropdownMenuContent_Qj0Zi0g$lambda$6(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j, float f, float f2, BorderStroke borderStroke, ny nyVar, int i, Composer composer, int i2) {
        m2143DropdownMenuContentQj0Zi0g(modifier, mutableTransitionState, mutableState, scrollState, shape, j, f, f2, borderStroke, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final void DropdownMenuItemContent(final my myVar, final iy iyVar, final Modifier modifier, final my myVar2, final my myVar3, final boolean z, final MenuItemColors menuItemColors, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i) {
        my myVar4;
        int i2;
        iy iyVar2;
        my myVar5;
        my myVar6;
        MenuItemColors menuItemColors2;
        MutableInteractionSource mutableInteractionSource2;
        Composer startRestartGroup = composer.startRestartGroup(-1325192924);
        if ((i & 6) == 0) {
            myVar4 = myVar;
            i2 = (startRestartGroup.changedInstance(myVar4) ? 4 : 2) | i;
        } else {
            myVar4 = myVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            iyVar2 = iyVar;
            i2 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
        } else {
            iyVar2 = iyVar;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            myVar5 = myVar2;
            i2 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
        } else {
            myVar5 = myVar2;
        }
        if ((i & 24576) == 0) {
            myVar6 = myVar3;
            i2 |= startRestartGroup.changedInstance(myVar6) ? Fields.Clip : 8192;
        } else {
            myVar6 = myVar3;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            menuItemColors2 = menuItemColors;
            i2 |= startRestartGroup.changed(menuItemColors2) ? 1048576 : Fields.BlendMode;
        } else {
            menuItemColors2 = menuItemColors;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i) == 0) {
            mutableInteractionSource2 = mutableInteractionSource;
            i2 |= startRestartGroup.changed(mutableInteractionSource2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1325192924, i2, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:428)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m811sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m258clickableO2vRcR0$default(modifier, mutableInteractionSource2, RippleKt.m2297rippleH2RKhps$default(true, 0.0f, 0L, 6, null), z, null, null, iyVar2, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, MenuListItemContainerHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
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
            my b = k4.b(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            final my myVar7 = myVar4;
            final my myVar8 = myVar6;
            final MenuItemColors menuItemColors3 = menuItemColors2;
            final my myVar9 = myVar5;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(865999929, true, new my() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1
                public final void invoke(Composer composer2, int i3) {
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(865999929, i3, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:450)");
                    }
                    if (my.this != null) {
                        composer2.startReplaceGroup(-864613220);
                        ProvidedValue<Color> provides = ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(menuItemColors3.m2140leadingIconColorvNxB06k$material3(z)));
                        final my myVar10 = my.this;
                        CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(1241781204, true, new my() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.1
                            public final void invoke(Composer composer3, int i4) {
                                if (!composer3.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1241781204, i4, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:454)");
                                }
                                Modifier m792defaultMinSizeVpY3zN4$default = SizeKt.m792defaultMinSizeVpY3zN4$default(Modifier.Companion, ListTokens.INSTANCE.m3404getListItemLeadingIconSizeD9Ej5fM(), 0.0f, 2, null);
                                my myVar11 = my.this;
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m792defaultMinSizeVpY3zN4$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                iy constructor2 = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                                my b2 = k4.b(companion2, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                }
                                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (fc.l(myVar11, composer3, 0)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.my
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return w01.a;
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-864293207);
                        composer2.endReplaceGroup();
                    }
                    ProvidedValue<Color> provides2 = ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(menuItemColors3.m2141textColorvNxB06k$material3(z)));
                    final RowScope rowScope = rowScopeInstance;
                    final my myVar11 = my.this;
                    final my myVar12 = myVar8;
                    final my myVar13 = myVar7;
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-893579015, true, new my() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.2
                        public final void invoke(Composer composer3, int i4) {
                            if (!composer3.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-893579015, i4, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:460)");
                            }
                            Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(RowScope.weight$default(RowScope.this, Modifier.Companion, 1.0f, false, 2, null), myVar11 != null ? MenuKt.DropdownMenuItemHorizontalPadding : Dp.m7611constructorimpl(0.0f), 0.0f, myVar12 != null ? MenuKt.DropdownMenuItemHorizontalPadding : Dp.m7611constructorimpl(0.0f), 0.0f, 10, null);
                            my myVar14 = myVar13;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m766paddingqDBjuR0$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            iy constructor2 = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                            my b2 = k4.b(companion2, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                            }
                            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (fc.l(myVar14, composer3, 0)) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, composer2, 54);
                    int i4 = ProvidedValue.$stable;
                    CompositionLocalKt.CompositionLocalProvider(provides2, rememberComposableLambda, composer2, i4 | 48);
                    if (myVar8 != null) {
                        composer2.startReplaceGroup(-863394951);
                        ProvidedValue<Color> provides3 = ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(menuItemColors3.m2142trailingIconColorvNxB06k$material3(z)));
                        final my myVar14 = myVar8;
                        CompositionLocalKt.CompositionLocalProvider(provides3, ComposableLambdaKt.rememberComposableLambda(-782441013, true, new my() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.3
                            public final void invoke(Composer composer3, int i5) {
                                if (!composer3.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-782441013, i5, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:484)");
                                }
                                Modifier m792defaultMinSizeVpY3zN4$default = SizeKt.m792defaultMinSizeVpY3zN4$default(Modifier.Companion, ListTokens.INSTANCE.m3412getListItemTrailingIconSizeD9Ej5fM(), 0.0f, 2, null);
                                my myVar15 = my.this;
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m792defaultMinSizeVpY3zN4$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                iy constructor2 = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                                my b2 = k4.b(companion2, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                }
                                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (fc.l(myVar15, composer3, 0)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.my
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return w01.a;
                            }
                        }, composer2, 54), composer2, i4 | 48);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-863072055);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, 48);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: z80
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 DropdownMenuItemContent$lambda$8;
                    int intValue = ((Integer) obj2).intValue();
                    DropdownMenuItemContent$lambda$8 = MenuKt.DropdownMenuItemContent$lambda$8(my.this, iyVar, modifier, myVar2, myVar3, z, menuItemColors, paddingValues, mutableInteractionSource, i, (Composer) obj, intValue);
                    return DropdownMenuItemContent$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DropdownMenuItemContent$lambda$8(my myVar, iy iyVar, Modifier modifier, my myVar2, my myVar3, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, Composer composer, int i2) {
        DropdownMenuItemContent(myVar, iyVar, modifier, myVar2, myVar3, z, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long calculateTransformOrigin(IntRect intRect, IntRect intRect2) {
        float min;
        float f = 1.0f;
        if (intRect2.getLeft() < intRect.getRight()) {
            if (intRect2.getRight() <= intRect.getLeft()) {
                min = 1.0f;
            } else if (intRect2.getWidth() != 0) {
                min = (((Math.min(intRect.getRight(), intRect2.getRight()) + Math.max(intRect.getLeft(), intRect2.getLeft())) / 2) - intRect2.getLeft()) / intRect2.getWidth();
            }
            if (intRect2.getTop() < intRect.getBottom()) {
                if (intRect2.getBottom() > intRect.getTop()) {
                    if (intRect2.getHeight() != 0) {
                        f = (((Math.min(intRect.getBottom(), intRect2.getBottom()) + Math.max(intRect.getTop(), intRect2.getTop())) / 2) - intRect2.getTop()) / intRect2.getHeight();
                    }
                }
                return TransformOriginKt.TransformOrigin(min, f);
            }
            f = 0.0f;
            return TransformOriginKt.TransformOrigin(min, f);
        }
        min = 0.0f;
        if (intRect2.getTop() < intRect.getBottom()) {
        }
        f = 0.0f;
        return TransformOriginKt.TransformOrigin(min, f);
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}
