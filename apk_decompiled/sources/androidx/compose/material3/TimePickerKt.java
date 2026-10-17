package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.material3.TimePickerStateImpl;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cq;
import defpackage.dq;
import defpackage.e10;
import defpackage.en0;
import defpackage.f10;
import defpackage.fc;
import defpackage.ff;
import defpackage.fv0;
import defpackage.hm;
import defpackage.hv0;
import defpackage.iv0;
import defpackage.iy;
import defpackage.jv0;
import defpackage.k4;
import defpackage.ky;
import defpackage.lf;
import defpackage.ma0;
import defpackage.mv0;
import defpackage.my;
import defpackage.nc;
import defpackage.ny;
import defpackage.p01;
import defpackage.p10;
import defpackage.p9;
import defpackage.q10;
import defpackage.qu0;
import defpackage.st;
import defpackage.te0;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.wd;
import defpackage.wg;
import defpackage.xe0;
import defpackage.y80;
import defpackage.zd;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerKt {
    private static final float ClockDialMidContainerSize;
    private static final float ClockDialMinContainerSize;
    private static final float ClockDisplayBottomMargin;
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;
    private static final e10 ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final float HalfCircle = 3.1415927f;
    private static final e10 Hours;
    private static final float InnerCircleToSizeRatio;
    private static final float MaxDistance;
    private static final float MinimumInteractiveSize;
    private static final e10 Minutes;
    private static final float OuterCircleToSizeRatio;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float SupportLabelTop;
    private static final float TimeInputBottomPadding;
    private static final float TimePickerMaxHeight;
    private static final float TimePickerMidHeight;

    static {
        float m7611constructorimpl = Dp.m7611constructorimpl(101.0f);
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        OuterCircleToSizeRatio = m7611constructorimpl / timePickerTokens.m3707getClockDialContainerSizeD9Ej5fM();
        InnerCircleToSizeRatio = Dp.m7611constructorimpl(69.0f) / timePickerTokens.m3707getClockDialContainerSizeD9Ej5fM();
        ClockDisplayBottomMargin = Dp.m7611constructorimpl(36.0f);
        ClockFaceBottomMargin = Dp.m7611constructorimpl(24.0f);
        DisplaySeparatorWidth = Dp.m7611constructorimpl(24.0f);
        SupportLabelTop = Dp.m7611constructorimpl(7.0f);
        TimeInputBottomPadding = Dp.m7611constructorimpl(24.0f);
        MaxDistance = Dp.m7611constructorimpl(74.0f);
        MinimumInteractiveSize = Dp.m7611constructorimpl(48.0f);
        Minutes = f10.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        ma0 a = f10.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = a;
        ma0 ma0Var = new ma0(a.b);
        int[] iArr = a.a;
        int i = a.b;
        for (int i2 = 0; i2 < i; i2++) {
            ma0Var.e((iArr[i2] % 12) + 12);
        }
        ExtraHours = ma0Var;
        PeriodToggleMargin = Dp.m7611constructorimpl(12.0f);
        TimePickerMaxHeight = Dp.m7611constructorimpl(384.0f);
        TimePickerMidHeight = Dp.m7611constructorimpl(330.0f);
        ClockDialMidContainerSize = Dp.m7611constructorimpl(238.0f);
        ClockDialMinContainerSize = Dp.m7611constructorimpl(200.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircularLayout(Modifier modifier, float f, my myVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1041042571);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1041042571, i3, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1978)");
            }
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$CircularLayout$1$1(f);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int i5 = ((i3 >> 6) & 14) | ((i3 << 3) & 112);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
            int i6 = ((i5 << 6) & 896) | 6;
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
            my b = k4.b(companion, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            if (fc.l(myVar, startRestartGroup, (i6 >> 6) & 14)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new en0(modifier2, f, myVar, i, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularLayout$lambda$96(Modifier modifier, float f, my myVar, int i, int i2, Composer composer, int i3) {
        CircularLayout(modifier, f, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final void ClockDisplayNumbers(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-934561141);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i2, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1173)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont(), startRestartGroup, 6)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(-477913269, true, new my() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$1
                public final void invoke(Composer composer2, int i4) {
                    float f;
                    if (!composer2.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-477913269, i4, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1179)");
                    }
                    TimePickerState timePickerState2 = TimePickerState.this;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
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
                    my b = k4.b(companion2, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                    Modifier m809sizeVpY3zN4 = SizeKt.m809sizeVpY3zN4(companion, timePickerTokens.m3719getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m3718getTimeSelectorContainerHeightD9Ej5fM());
                    int hourForDisplay = TimePickerKt.getHourForDisplay(timePickerState2);
                    TimePickerSelectionMode.Companion companion3 = TimePickerSelectionMode.Companion;
                    TimePickerKt.m2649TimeSelectorSAnMeKU(m809sizeVpY3zN4, hourForDisplay, timePickerState2, companion3.m2677getHouryecRtBI(), timePickerColors2, composer2, 3078);
                    f = TimePickerKt.DisplaySeparatorWidth;
                    TimePickerKt.DisplaySeparator(SizeKt.m809sizeVpY3zN4(companion, f, timePickerTokens.m3715getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                    TimePickerKt.m2649TimeSelectorSAnMeKU(SizeKt.m809sizeVpY3zN4(companion, timePickerTokens.m3719getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m3718getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, companion3.m2678getMinuteyecRtBI(), timePickerColors2, composer2, 3078);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new iv0(timePickerState, timePickerColors, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ClockDisplayNumbers$lambda$35(TimePickerState timePickerState, TimePickerColors timePickerColors, int i, Composer composer, int i2) {
        ClockDisplayNumbers(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final void ClockFace(final Modifier modifier, AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors, final boolean z, Composer composer, final int i) {
        int i2;
        final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
        Composer startRestartGroup = composer.startRestartGroup(-478841003);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(analogTimePickerState2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-478841003, i2, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1591)");
            }
            analogTimePickerState2 = analogTimePickerState;
            CrossfadeKt.Crossfade(analogTimePickerState2.getClockFaceValues(), drawSelector(BackgroundKt.m226backgroundbw27NRU(modifier, timePickerColors.m2613getClockDialColor0d7_KjU(), RoundedCornerShapeKt.getCircleShape()).then(new ClockDialModifier(analogTimePickerState, z, analogTimePickerState.mo1597getSelectionyecRtBI(), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6), null)), analogTimePickerState2, timePickerColors), (FiniteAnimationSpec<Float>) MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), (String) null, ComposableLambdaKt.rememberComposableLambda(747010833, true, new TimePickerKt$ClockFace$1(timePickerColors, analogTimePickerState2, z), startRestartGroup, 54), startRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: ev0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 ClockFace$lambda$60;
                    int intValue = ((Integer) obj2).intValue();
                    ClockFace$lambda$60 = TimePickerKt.ClockFace$lambda$60(Modifier.this, analogTimePickerState2, timePickerColors, z, i, (Composer) obj, intValue);
                    return ClockFace$lambda$60;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ClockFace$lambda$60(Modifier modifier, AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, boolean z, int i, Composer composer, int i2) {
        ClockFace(modifier, analogTimePickerState, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText(Modifier modifier, final AnalogTimePickerState analogTimePickerState, int i, final boolean z, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-206784607);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(analogTimePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206784607, i4, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1727)");
            }
            TextStyle value = TypographyKt.getValue(TimePickerTokens.INSTANCE.getClockDialLabelTextFont(), startRestartGroup, 6);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final float mo367toPx0680j_4 = density.mo367toPx0680j_4(MaxDistance);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4505boximpl(Offset.Companion.m4532getZeroF1C5BW0()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m7730boximpl(IntOffset.Companion.m7750getZeronOccac()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Rect.Companion.getZero(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final un unVar = (un) rememberedValue4;
            String m2656numberContentDescriptiondSwYdS4 = m2656numberContentDescriptiondSwYdS4(analogTimePickerState.mo1597getSelectionyecRtBI(), analogTimePickerState.is24hour(), i, startRestartGroup, i4 & 896);
            String localString$default = CalendarLocale_jvmKt.toLocalString$default(i, 0, 0, false, null, 15, null);
            boolean changed = startRestartGroup.changed(analogTimePickerState);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt.derivedStateOf(new p9((Object) analogTimePickerState, (Object) density, mutableState3, 13));
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final State state = (State) rememberedValue5;
            Alignment center = Alignment.Companion.getCenter();
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new defpackage.f1(mutableState2, mutableState3, mutableState, 28);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            Modifier focusable$default = FocusableKt.focusable$default(SizeKt.m807size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (ky) rememberedValue6)), MinimumInteractiveSize), false, null, 3, null);
            boolean changedInstance = startRestartGroup.changedInstance(unVar) | startRestartGroup.changedInstance(analogTimePickerState) | startRestartGroup.changed(mo367toPx0680j_4) | ((i4 & 7168) == 2048) | startRestartGroup.changed(state);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue7 == companion.getEmpty()) {
                ky kyVar = new ky() { // from class: gv0
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 ClockText$lambda$80$lambda$79;
                        ClockText$lambda$80$lambda$79 = TimePickerKt.ClockText$lambda$80$lambda$79(un.this, analogTimePickerState, mo367toPx0680j_4, z, mutableState, mutableState2, state, (SemanticsPropertyReceiver) obj);
                        return ClockText$lambda$80$lambda$79;
                    }
                };
                startRestartGroup.updateRememberedValue(kyVar);
                rememberedValue7 = kyVar;
            }
            Modifier semantics = SemanticsModifierKt.semantics(focusable$default, true, (ky) rememberedValue7);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
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
            Modifier.Companion companion3 = Modifier.Companion;
            boolean changed2 = startRestartGroup.changed(m2656numberContentDescriptiondSwYdS4);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new wd(m2656numberContentDescriptiondSwYdS4, 22);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            composer2 = startRestartGroup;
            TextKt.m2607TextNvy7gAk(localString$default, SemanticsModifierKt.clearAndSetSemantics(companion3, (ky) rememberedValue8), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, composer2, 0, 0, 131068);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new nc(modifier, analogTimePickerState, i, z, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$64(MutableState<Offset> mutableState) {
        return mutableState.getValue().m4526unboximpl();
    }

    private static final void ClockText$lambda$65(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m4505boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$67(MutableState<IntOffset> mutableState) {
        return mutableState.getValue().m7748unboximpl();
    }

    private static final void ClockText$lambda$68(MutableState<IntOffset> mutableState, long j) {
        mutableState.setValue(IntOffset.m7730boximpl(j));
    }

    private static final Rect ClockText$lambda$70(MutableState<Rect> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ClockText$lambda$74$lambda$73(AnalogTimePickerState analogTimePickerState, Density density, MutableState mutableState) {
        long selectorPos = getSelectorPos(analogTimePickerState);
        float mo367toPx0680j_4 = density.mo367toPx0680j_4(DpOffset.m7672getXD9Ej5fM(selectorPos));
        float mo367toPx0680j_42 = density.mo367toPx0680j_4(DpOffset.m7674getYD9Ej5fM(selectorPos));
        return ClockText$lambda$70(mutableState).m4542containsk4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(mo367toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(mo367toPx0680j_4) << 32)));
    }

    private static final boolean ClockText$lambda$75(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ClockText$lambda$77$lambda$76(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentCoordinates = layoutCoordinates.getParentCoordinates();
        ClockText$lambda$68(mutableState, parentCoordinates != null ? IntSizeKt.m7788getCenterozmzZPI(parentCoordinates.mo6242getSizeYbymL2g()) : IntOffset.Companion.m7750getZeronOccac());
        mutableState2.setValue(LayoutCoordinatesKt.boundsInParent(layoutCoordinates));
        ClockText$lambda$65(mutableState3, ClockText$lambda$70(mutableState2).m4546getCenterF1C5BW0());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ClockText$lambda$80$lambda$79(final un unVar, final AnalogTimePickerState analogTimePickerState, final float f, final boolean z, final MutableState mutableState, final MutableState mutableState2, State state, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new iy() { // from class: nv0
            @Override // defpackage.iy
            public final Object invoke() {
                boolean ClockText$lambda$80$lambda$79$lambda$78;
                ClockText$lambda$80$lambda$79$lambda$78 = TimePickerKt.ClockText$lambda$80$lambda$79$lambda$78(un.this, analogTimePickerState, f, z, mutableState, mutableState2);
                return Boolean.valueOf(ClockText$lambda$80$lambda$79$lambda$78);
            }
        }, 1, null);
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, ClockText$lambda$75(state));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ClockText$lambda$80$lambda$79$lambda$78(un unVar, AnalogTimePickerState analogTimePickerState, float f, boolean z, MutableState mutableState, MutableState mutableState2) {
        p01.t(unVar, null, null, new TimePickerKt$ClockText$2$1$1$1(analogTimePickerState, f, z, mutableState, mutableState2, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ClockText$lambda$83$lambda$82$lambda$81(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ClockText$lambda$84(Modifier modifier, AnalogTimePickerState analogTimePickerState, int i, boolean z, int i2, Composer composer, int i3) {
        ClockText(modifier, analogTimePickerState, i, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisplaySeparator(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(2100674302);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i2, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1379)");
            }
            TextStyle m7073copyp1EtxEg$default = TextStyle.m7073copyp1EtxEg$default((TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m7489getCentere0LSkKk(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.Alignment.Companion.m7456getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m7478getBothEVpEnUU(), (dq) null), 0, 0, null, 15695871, null);
            Object rememberedValue = startRestartGroup.rememberedValue();
            int i4 = 6;
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new qu0(i4);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (ky) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics);
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
            my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            i3 = 1;
            TextKt.m2607TextNvy7gAk(":", null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), startRestartGroup, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, m7073copyp1EtxEg$default, composer2, 6, 0, 131066);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            i3 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new lf(modifier, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DisplaySeparator$lambda$52$lambda$51(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DisplaySeparator$lambda$54(Modifier modifier, int i, Composer composer, int i2) {
        DisplaySeparator(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final void HorizontalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(755539561);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i2, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1133)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), startRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            iy constructor = companion3.getConstructor();
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
            my b = k4.b(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, i2 & 126);
            if (timePickerState.is24hour()) {
                startRestartGroup.startReplaceGroup(999020143);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(998576161);
                Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m766paddingqDBjuR0$default);
                iy constructor2 = companion3.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                }
                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i4 = i2 << 3;
                HorizontalPeriodToggle(SizeKt.m809sizeVpY3zN4(companion, timePickerTokens.m3713getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), timePickerTokens.m3712getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i4 & 896) | (i4 & 112) | 6);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new iv0(timePickerState, timePickerColors, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalClockDisplay$lambda$31(TimePickerState timePickerState, TimePickerColors timePickerColors, int i, Composer composer, int i2) {
        HorizontalClockDisplay(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1261215927);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i2, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1206)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            value.getClass();
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, (MeasurePolicy) rememberedValue, ShapesKt.start$default(cornerBasedShape, null, 1, null), ShapesKt.end$default(cornerBasedShape, null, 1, null), startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new mv0(modifier, timePickerState, timePickerColors, i, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalPeriodToggle$lambda$37(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, int i, Composer composer, int i2) {
        HorizontalPeriodToggle(modifier, timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalTimePicker(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        boolean z2;
        Modifier modifier3;
        TimePickerColors timePickerColors3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        TimePickerColors timePickerColors4;
        Modifier modifier4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1432307537);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(analogTimePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    if (startRestartGroup.changed(timePickerColors2)) {
                        i5 = Fields.RotationX;
                        i3 |= i5;
                    }
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i5 = Fields.SpotShadowColor;
                i3 |= i5;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i6 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 4) != 0) {
                            modifier4 = modifier5;
                            i4 = i3 & (-897);
                            timePickerColors4 = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                        } else {
                            Modifier modifier6 = modifier5;
                            i4 = i3;
                            timePickerColors4 = timePickerColors2;
                            modifier4 = modifier6;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        i4 = i3;
                        timePickerColors4 = timePickerColors2;
                        modifier4 = modifier2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1432307537, i4, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:980)");
                    }
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new qu0(8);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier4, false, (ky) rememberedValue, 1, null);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
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
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    HorizontalClockDisplay(analogTimePickerState, timePickerColors4, startRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
                    Modifier.Companion companion2 = Modifier.Companion;
                    SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion2, ClockDisplayBottomMargin), startRestartGroup, 6);
                    ClockFace(companion2.then(new ClockFaceSizeModifier()), analogTimePickerState, timePickerColors4, z2, startRestartGroup, ((i4 << 3) & 112) | (i4 & 896) | (i4 & 7168));
                    startRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    timePickerColors3 = timePickerColors4;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    timePickerColors3 = timePickerColors2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new jv0(analogTimePickerState, modifier3, timePickerColors3, z, i, i2, 1));
                    return;
                }
                return;
            }
            z2 = z;
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        z2 = z;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalTimePicker$lambda$13$lambda$12(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalTimePicker$lambda$15(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, int i, int i2, Composer composer, int i3) {
        HorizontalTimePicker(analogTimePickerState, modifier, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final void PeriodToggleImpl(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, Composer composer, int i) {
        int i2;
        Shape shape3;
        Composer startRestartGroup = composer.startRestartGroup(1374241901);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(measurePolicy) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            shape3 = shape2;
            i2 |= startRestartGroup.changed(shape3) ? Fields.RenderEffect : 65536;
        } else {
            shape3 = shape2;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i2, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1301)");
            }
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            BorderStroke m253BorderStrokecXLIe8U = BorderStrokeKt.m253BorderStrokecXLIe8U(timePickerTokens.m3714getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.m2617getPeriodSelectorBorderColor0d7_KjU());
            Shape value = ShapesKt.getValue(timePickerTokens.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            value.getClass();
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            Strings.Companion companion = Strings.Companion;
            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_time_picker_period_toggle_description), startRestartGroup, 0);
            boolean changed = startRestartGroup.changed(m2983getString2EP1pXo);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new wd(m2983getString2EP1pXo, 23);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier border = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (ky) rememberedValue, 1, null)), m253BorderStrokecXLIe8U, cornerBasedShape);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, border);
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
            my b = k4.b(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            boolean z = !isPm(timePickerState);
            int i4 = i2 & 112;
            boolean z2 = i4 == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(timePickerState));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new hv0(i3, timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposableSingletons$TimePickerKt composableSingletons$TimePickerKt = ComposableSingletons$TimePickerKt.INSTANCE;
            int i5 = (i2 << 3) & 7168;
            ToggleItem(z, shape, (iy) rememberedValue2, timePickerColors, composableSingletons$TimePickerKt.getLambda$1425358052$material3(), startRestartGroup, ((i2 >> 9) & 112) | 24576 | i5);
            boolean z3 = false;
            SpacerKt.Spacer(BackgroundKt.m227backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.Companion, "Spacer"), SeparatorZIndex), 0.0f, 1, null), timePickerColors.m2617getPeriodSelectorBorderColor0d7_KjU(), null, 2, null), startRestartGroup, 0);
            boolean isPm = isPm(timePickerState);
            if (i4 == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(timePickerState))) {
                z3 = true;
            }
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new hv0(3, timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ToggleItem(isPm, shape3, (iy) rememberedValue3, timePickerColors, composableSingletons$TimePickerKt.m1847getLambda$1179219109$material3(), startRestartGroup, ((i2 >> 12) & 112) | 24576 | i5);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ff(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, i, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PeriodToggleImpl$lambda$41$lambda$40(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PeriodToggleImpl$lambda$46$lambda$43$lambda$42(TimePickerState timePickerState) {
        if (isPm(timePickerState)) {
            timePickerState.setHour(timePickerState.getHour() - 12);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PeriodToggleImpl$lambda$46$lambda$45$lambda$44(TimePickerState timePickerState) {
        if (!isPm(timePickerState)) {
            timePickerState.setHour(timePickerState.getHour() + 12);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PeriodToggleImpl$lambda$47(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, int i, Composer composer, int i2) {
        PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if ((r13 & 4) != 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeInput(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-760850373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(timePickerColors)) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.Companion;
                }
                if ((i2 & 4) != 0) {
                    timePickerColors = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                    i3 &= -897;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-760850373, i3, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:274)");
                }
                TimeInputImpl(modifier, timePickerColors, timePickerState, startRestartGroup, ((i3 >> 3) & 126) | ((i3 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        TimePickerColors timePickerColors2 = timePickerColors;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new defpackage.g1(timePickerState, modifier2, timePickerColors2, i, i2, 11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimeInput$lambda$5(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i, int i2, Composer composer, int i3) {
        TimeInput(timePickerState, modifier, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b0, code lost:
    
        if (defpackage.q10.b(r5.rememberedValue(), java.lang.Integer.valueOf(r2)) != false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TimeInputImpl(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        Object timePickerKt$TimeInputImpl$1$1;
        Ref ref;
        MutableState mutableState;
        MutableState mutableState2;
        TimePickerState timePickerState2 = timePickerState;
        Composer startRestartGroup = composer.startRestartGroup(-475657989);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & Fields.RotationY) == 0 ? startRestartGroup.changed(timePickerState2) : startRestartGroup.changedInstance(timePickerState2) ? 256 : Fields.SpotShadowColor;
        }
        int i4 = i2;
        int i5 = 0;
        if (startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i4, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:997)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.Companion;
            Saver<TextFieldValue, Object> saver = companion.getSaver();
            int i6 = i4 & 896;
            boolean z = i6 == 256 || ((i4 & Fields.RotationY) != 0 && startRestartGroup.changedInstance(timePickerState2));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new hv0(i5, timePickerState2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, startRestartGroup, 0);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = companion.getSaver();
            boolean z2 = i6 == 256 || ((i4 & Fields.RotationY) != 0 && startRestartGroup.changedInstance(timePickerState2));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new hv0(i3, timePickerState2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState rememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (iy) rememberedValue2, startRestartGroup, 0);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new Ref();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Ref ref2 = (Ref) rememberedValue3;
            Integer valueOf = Integer.valueOf(timePickerState2.getHour());
            Integer valueOf2 = Integer.valueOf(timePickerState2.getMinute());
            boolean changedInstance = startRestartGroup.changedInstance(ref2) | startRestartGroup.changed(rememberSaveable) | (i6 == 256 || ((i4 & Fields.RotationY) != 0 && startRestartGroup.changedInstance(timePickerState2))) | startRestartGroup.changed(rememberSaveable2);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == companion2.getEmpty()) {
                timePickerKt$TimeInputImpl$1$1 = new TimePickerKt$TimeInputImpl$1$1(ref2, timePickerState2, rememberSaveable, rememberSaveable2, null);
                ref = ref2;
                mutableState = rememberSaveable;
                mutableState2 = rememberSaveable2;
                startRestartGroup.updateRememberedValue(timePickerKt$TimeInputImpl$1$1);
            } else {
                mutableState = rememberSaveable;
                timePickerKt$TimeInputImpl$1$1 = rememberedValue4;
                ref = ref2;
                mutableState2 = rememberSaveable2;
            }
            EffectsKt.LaunchedEffect(valueOf, valueOf2, (my) timePickerKt$TimeInputImpl$1$1, startRestartGroup, 0);
            Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            modifier2 = modifier;
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion3.getTop(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m766paddingqDBjuR0$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            iy constructor = companion4.getConstructor();
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
            my b = k4.b(companion4, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting()) {
            }
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
            timePickerColors2 = timePickerColors;
            timePickerState2 = timePickerState;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TextStyle.m7073copyp1EtxEg$default(TypographyKt.getValue(timeInputTokens.getTimeFieldLabelTextFont(), startRestartGroup, 6), timePickerColors.m2630timeSelectorContentColorvNxB06k$material3(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m7489getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(1306700887, true, new TimePickerKt$TimeInputImpl$2$1(mutableState, timePickerState2, ref, timePickerColors2, mutableState2), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (timePickerState2.is24hour()) {
                startRestartGroup.startReplaceGroup(-1381607893);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1381942321);
                Modifier.Companion companion5 = Modifier.Companion;
                Modifier m766paddingqDBjuR0$default2 = PaddingKt.m766paddingqDBjuR0$default(companion5, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m766paddingqDBjuR0$default2);
                iy constructor2 = companion4.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                my b2 = k4.b(companion4, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                }
                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                VerticalPeriodToggle(SizeKt.m809sizeVpY3zN4(companion5, timeInputTokens.m3702getPeriodSelectorContainerWidthD9Ej5fM(), timeInputTokens.m3701getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState2, timePickerColors2, startRestartGroup, ((i4 >> 3) & 112) | 6 | ((i4 << 3) & 896));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            timePickerColors2 = timePickerColors;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new mv0(modifier2, timePickerColors2, timePickerState2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$hourTextValue(TimePickerState timePickerState) {
        return new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(getHourForDisplay(timePickerState), 2, 0, false, null, 14, null), 0L, (TextRange) null, 6, (dq) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TimeInputImpl$lambda$17$lambda$16(TimePickerState timePickerState) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TimeInputImpl$hourTextValue(timePickerState), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$18(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TimeInputImpl$lambda$21$lambda$20(TimePickerState timePickerState) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TimeInputImpl$minuteTextValue(timePickerState), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$22(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimeInputImpl$lambda$28(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, int i, Composer composer, int i2) {
        TimeInputImpl(modifier, timePickerColors, timePickerState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$minuteTextValue(TimePickerState timePickerState) {
        return new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(timePickerState.getMinute(), 2, 0, false, null, 14, null), 0L, (TextRange) null, 6, (dq) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0088  */
    /* renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2647TimePickermT9BvqQ(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        int i5;
        Composer composer2;
        Modifier modifier3;
        TimePickerColors timePickerColors3;
        int i6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        TimePickerColors timePickerColors4;
        int i7;
        TimePickerColors timePickerColors5;
        int m2632layoutTypesDNSZnc;
        Object rememberedValue;
        Composer.Companion companion;
        boolean z;
        Object rememberedValue2;
        AnalogTimePickerState analogTimePickerState;
        boolean changedInstance;
        Object rememberedValue3;
        TimePickerColors timePickerColors6;
        Modifier modifier5;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-619286452);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    if (startRestartGroup.changed(timePickerColors2)) {
                        i9 = Fields.RotationX;
                        i4 |= i9;
                    }
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i9 = Fields.SpotShadowColor;
                i4 |= i9;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    i5 = i;
                    if (startRestartGroup.changed(i5)) {
                        i8 = Fields.CameraDistance;
                        i4 |= i8;
                    }
                } else {
                    i5 = i;
                }
                i8 = Fields.RotationZ;
                i4 |= i8;
            } else {
                i5 = i;
            }
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                timePickerColors3 = timePickerColors2;
                i6 = i5;
            } else {
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier4 = i10 != 0 ? Modifier.Companion : modifier2;
                    if ((i3 & 4) != 0) {
                        timePickerColors4 = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                        i4 &= -897;
                    } else {
                        timePickerColors4 = timePickerColors2;
                    }
                    if ((i3 & 8) != 0) {
                        i7 = i4 & (-7169);
                        timePickerColors5 = timePickerColors4;
                        m2632layoutTypesDNSZnc = TimePickerDefaults.INSTANCE.m2632layoutTypesDNSZnc(startRestartGroup, 6);
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-619286452, i7, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:224)");
                        }
                        State<Boolean> rememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, false, startRestartGroup, 0, 7);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.Companion;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = new Ref();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        Ref ref = (Ref) rememberedValue;
                        int i11 = i7 & 14;
                        z = i11 != 4 || ((i7 & 8) != 0 && startRestartGroup.changed(timePickerState));
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = new AnalogTimePickerState(timePickerState, ref);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        analogTimePickerState = (AnalogTimePickerState) rememberedValue2;
                        Integer valueOf = Integer.valueOf(timePickerState.getHour());
                        Integer valueOf2 = Integer.valueOf(timePickerState.getMinute());
                        changedInstance = startRestartGroup.changedInstance(ref) | startRestartGroup.changedInstance(analogTimePickerState) | (i11 != 4 || ((i7 & 8) != 0 && startRestartGroup.changedInstance(timePickerState)));
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = new TimePickerKt$TimePicker$1$1(ref, analogTimePickerState, timePickerState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        EffectsKt.LaunchedEffect(valueOf, valueOf2, (my) rememberedValue3, startRestartGroup, 0);
                        if (TimePickerLayoutType.m2664equalsimpl0(m2632layoutTypesDNSZnc, TimePickerLayoutType.Companion.m2669getVerticalQJTpgSE())) {
                            timePickerColors6 = timePickerColors5;
                            modifier5 = modifier4;
                            startRestartGroup.startReplaceGroup(2017750673);
                            HorizontalTimePicker(analogTimePickerState, modifier5, timePickerColors6, !TimePicker_mT9BvqQ$lambda$0(rememberAccessibilityServiceState), startRestartGroup, i7 & 1008, 0);
                            composer2 = startRestartGroup;
                            composer2.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(2017551219);
                            timePickerColors6 = timePickerColors5;
                            modifier5 = modifier4;
                            VerticalTimePicker(analogTimePickerState, modifier5, timePickerColors6, !TimePicker_mT9BvqQ$lambda$0(rememberAccessibilityServiceState), startRestartGroup, i7 & 1008, 0);
                            composer2 = startRestartGroup;
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        timePickerColors3 = timePickerColors6;
                        i6 = m2632layoutTypesDNSZnc;
                    } else {
                        i7 = i4;
                        timePickerColors5 = timePickerColors4;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    i7 = i4;
                    modifier4 = modifier2;
                    timePickerColors5 = timePickerColors2;
                }
                m2632layoutTypesDNSZnc = i5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                State<Boolean> rememberAccessibilityServiceState2 = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, false, startRestartGroup, 0, 7);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                }
                Ref ref2 = (Ref) rememberedValue;
                int i112 = i7 & 14;
                if (i112 != 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue2 = new AnalogTimePickerState(timePickerState, ref2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                analogTimePickerState = (AnalogTimePickerState) rememberedValue2;
                Integer valueOf3 = Integer.valueOf(timePickerState.getHour());
                Integer valueOf22 = Integer.valueOf(timePickerState.getMinute());
                changedInstance = startRestartGroup.changedInstance(ref2) | startRestartGroup.changedInstance(analogTimePickerState) | (i112 != 4 || ((i7 & 8) != 0 && startRestartGroup.changedInstance(timePickerState)));
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue3 = new TimePickerKt$TimePicker$1$1(ref2, analogTimePickerState, timePickerState, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                EffectsKt.LaunchedEffect(valueOf3, valueOf22, (my) rememberedValue3, startRestartGroup, 0);
                if (TimePickerLayoutType.m2664equalsimpl0(m2632layoutTypesDNSZnc, TimePickerLayoutType.Companion.m2669getVerticalQJTpgSE())) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier5;
                timePickerColors3 = timePickerColors6;
                i6 = m2632layoutTypesDNSZnc;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new fv0(timePickerState, modifier3, timePickerColors3, i6, i2, i3));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final TimePickerState TimePickerState(int i, int i2, boolean z) {
        return new TimePickerStateImpl(i, i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03ce, code lost:
    
        if (defpackage.q10.b(r10.rememberedValue(), java.lang.Integer.valueOf(r15)) == false) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05aa  */
    /* renamed from: TimePickerTextField-1vLObsk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2648TimePickerTextField1vLObsk(final Modifier modifier, final TextFieldValue textFieldValue, final ky kyVar, TimePickerState timePickerState, int i, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final TimePickerColors timePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        KeyboardOptions keyboardOptions2;
        int i6;
        KeyboardActions keyboardActions2;
        int i7;
        final KeyboardActions keyboardActions3;
        ScopeUpdateScope endRestartGroup;
        final MutableInteractionSource mutableInteractionSource;
        int i8;
        FocusRequester focusRequester;
        Composer composer2;
        int i9;
        int m2904constructorimpl;
        ComposeUiNode.Companion companion;
        boolean z;
        boolean z2;
        Object rememberedValue;
        TimePickerState timePickerState2 = timePickerState;
        int i10 = i;
        Float valueOf = Float.valueOf(0.9f);
        Float valueOf2 = Float.valueOf(0.1f);
        Composer startRestartGroup = composer.startRestartGroup(1299172990);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= (i2 & Fields.TransformOrigin) == 0 ? startRestartGroup.changed(timePickerState2) : startRestartGroup.changedInstance(timePickerState2) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= startRestartGroup.changed(i10) ? Fields.Clip : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                keyboardOptions2 = keyboardOptions;
            } else {
                keyboardOptions2 = keyboardOptions;
                if ((i2 & 196608) == 0) {
                    i4 |= startRestartGroup.changed(keyboardOptions2) ? Fields.RenderEffect : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                keyboardActions2 = keyboardActions;
            } else {
                keyboardActions2 = keyboardActions;
                if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(keyboardActions2) ? 1048576 : Fields.BlendMode;
                }
            }
            if ((i3 & Fields.SpotShadowColor) == 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i4 |= startRestartGroup.changed(timePickerColors) ? GroupFlagsKt.IsNodeFlag : 4194304;
            }
            i7 = i4;
            if (startRestartGroup.shouldExecute((4793491 & i7) == 4793490, i7 & 1)) {
                startRestartGroup.skipToGroupEnd();
                keyboardActions3 = keyboardActions2;
            } else {
                KeyboardOptions keyboardOptions3 = i5 != 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions2;
                KeyboardActions keyboardActions4 = i6 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1299172990, i7, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1866)");
                }
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                if (rememberedValue2 == companion2.getEmpty()) {
                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == companion2.getEmpty()) {
                    rememberedValue3 = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                FocusRequester focusRequester2 = (FocusRequester) rememberedValue3;
                final TextFieldColors m2243colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2243colors0hiis_0(timePickerColors.m2630timeSelectorContentColorvNxB06k$material3(true), 0L, 0L, 0L, timePickerColors.m2629timeSelectorContainerColorvNxB06k$material3(true), timePickerColors.m2629timeSelectorContainerColorvNxB06k$material3(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
                boolean m2673equalsimpl0 = TimePickerSelectionMode.m2673equalsimpl0(i10, timePickerState2.mo1597getSelectionyecRtBI());
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion3 = Alignment.Companion;
                KeyboardOptions keyboardOptions4 = keyboardOptions3;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), startRestartGroup, 0);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                iy constructor = companion4.getConstructor();
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
                my b = k4.b(companion4, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                }
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (m2673equalsimpl0) {
                    mutableInteractionSource = mutableInteractionSource2;
                    i8 = 57344;
                    focusRequester = focusRequester2;
                    composer2 = startRestartGroup;
                    i9 = i10;
                    composer2.startReplaceGroup(2023879982);
                    composer2.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(2023424468);
                    Modifier.Companion companion5 = Modifier.Companion;
                    TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
                    int i11 = i7 >> 3;
                    mutableInteractionSource = mutableInteractionSource2;
                    i8 = 57344;
                    focusRequester = focusRequester2;
                    composer2 = startRestartGroup;
                    m2649TimeSelectorSAnMeKU(SizeKt.m809sizeVpY3zN4(companion5, timeInputTokens.m3705getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens.m3704getTimeFieldContainerHeightD9Ej5fM()), TimePickerSelectionMode.m2673equalsimpl0(i10, TimePickerSelectionMode.Companion.m2677getHouryecRtBI()) ? getHourForDisplay(timePickerState) : timePickerState.getMinute(), timePickerState, i10, timePickerColors, composer2, (i11 & 7168) | (i11 & 896) | 6 | ((i7 >> 9) & 57344));
                    i9 = i10;
                    composer2.endReplaceGroup();
                }
                TimePickerSelectionMode.Companion companion6 = TimePickerSelectionMode.Companion;
                if (TimePickerSelectionMode.m2673equalsimpl0(i9, companion6.m2678getMinuteyecRtBI())) {
                    Strings.Companion companion7 = Strings.Companion;
                    m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_picker_minute_text_field);
                } else {
                    Strings.Companion companion8 = Strings.Companion;
                    m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_picker_hour_text_field);
                }
                String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(m2904constructorimpl, composer2, 0);
                Modifier.Companion companion9 = Modifier.Companion;
                Modifier visible = visible(companion9, m2673equalsimpl0);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, visible);
                iy constructor2 = companion4.getConstructor();
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
                my b2 = k4.b(companion4, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                if (m3878constructorimpl2.getInserting()) {
                    companion = companion4;
                } else {
                    companion = companion4;
                }
                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier focusRequester3 = FocusRequesterModifierKt.focusRequester(companion9, focusRequester);
                TimeInputTokens timeInputTokens2 = TimeInputTokens.INSTANCE;
                Modifier m809sizeVpY3zN4 = SizeKt.m809sizeVpY3zN4(focusRequester3, timeInputTokens2.m3705getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens2.m3704getTimeFieldContainerHeightD9Ej5fM());
                boolean changed = composer2.changed(m2983getString2EP1pXo);
                Object rememberedValue4 = composer2.rememberedValue();
                if (changed || rememberedValue4 == companion2.getEmpty()) {
                    rememberedValue4 = new wd(m2983getString2EP1pXo, 24);
                    composer2.updateRememberedValue(rememberedValue4);
                }
                Modifier semantics$default = SemanticsModifierKt.semantics$default(m809sizeVpY3zN4, false, (ky) rememberedValue4, 1, null);
                TextStyle textStyle = (TextStyle) composer2.consume(TextKt.getLocalTextStyle());
                Brush.Companion companion10 = Brush.Companion;
                Float valueOf3 = Float.valueOf(0.0f);
                Color.Companion companion11 = Color.Companion;
                xe0 xe0Var = new xe0(valueOf3, Color.m4751boximpl(companion11.m4796getTransparent0d7_KjU()));
                xe0 xe0Var2 = new xe0(valueOf2, Color.m4751boximpl(companion11.m4796getTransparent0d7_KjU()));
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i12 = i7 >> 3;
                int i13 = i7 << 3;
                int i14 = (i12 & 112) | (i12 & 14) | 100666368 | (3670016 & i13) | (i13 & 29360128);
                FocusRequester focusRequester4 = focusRequester;
                Composer composer3 = composer2;
                KeyboardActions keyboardActions5 = keyboardActions4;
                BasicTextFieldKt.BasicTextField(textFieldValue, kyVar, semantics$default, true, false, textStyle, keyboardOptions4, keyboardActions5, true, 0, 0, (VisualTransformation) null, (ky) null, mutableInteractionSource, Brush.Companion.m4717verticalGradient8A3gB4$default(companion10, new xe0[]{xe0Var, xe0Var2, new xe0(valueOf2, Color.m4751boximpl(materialTheme.getColorScheme(composer2, 6).m1772getPrimary0d7_KjU())), new xe0(valueOf, Color.m4751boximpl(materialTheme.getColorScheme(composer2, 6).m1772getPrimary0d7_KjU())), new xe0(valueOf, Color.m4751boximpl(companion11.m4796getTransparent0d7_KjU())), new xe0(Float.valueOf(1.0f), Color.m4751boximpl(companion11.m4796getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), (ny) ComposableLambdaKt.rememberComposableLambda(1007938103, true, new ny() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
                    public final void invoke(my myVar, Composer composer4, int i15) {
                        my myVar2;
                        int i16;
                        if ((i15 & 6) == 0) {
                            myVar2 = myVar;
                            i16 = i15 | (composer4.changedInstance(myVar2) ? 4 : 2);
                        } else {
                            myVar2 = myVar;
                            i16 = i15;
                        }
                        if (!composer4.shouldExecute((i16 & 19) != 18, i16 & 1)) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1007938103, i16, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1925)");
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                        String text = TextFieldValue.this.getText();
                        VisualTransformation none = VisualTransformation.Companion.getNone();
                        PaddingValues m755PaddingValues0680j_4 = PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f));
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                        final TextFieldColors textFieldColors = m2243colors0hiis_0;
                        outlinedTextFieldDefaults.DecorationBox(text, myVar2, true, true, none, mutableInteractionSource3, false, null, null, null, null, null, null, null, textFieldColors, m755PaddingValues0680j_4, ComposableLambdaKt.rememberComposableLambda(769667466, true, new my() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2.1
                            public final void invoke(Composer composer5, int i17) {
                                if (!composer5.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(769667466, i17, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1935)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2241Container4EFweAY(true, false, MutableInteractionSource.this, null, textFieldColors, ShapesKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer5, 6), 0.0f, 0.0f, composer5, 100663734, ComposerKt.invocationKey);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.my
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return w01.a;
                            }
                        }, composer4, 54), composer4, ((i16 << 3) & 112) | 224640, 14352384, 16320);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.ny
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((my) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return w01.a;
                    }
                }, composer2, 54), composer3, i14, 199680, 7696);
                startRestartGroup = composer3;
                startRestartGroup.endNode();
                Modifier m722offsetVpY3zN4$default = OffsetKt.m722offsetVpY3zN4$default(companion9, 0.0f, SupportLabelTop, 1, null);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == companion2.getEmpty()) {
                    rememberedValue5 = new qu0(9);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                i10 = i;
                TextKt.m2607TextNvy7gAk(Strings_androidKt.m2983getString2EP1pXo(TimePickerSelectionMode.m2673equalsimpl0(i10, companion6.m2677getHouryecRtBI()) ? Strings.m2904constructorimpl(R.string.m3c_time_picker_hour) : Strings.m2904constructorimpl(R.string.m3c_time_picker_minute), startRestartGroup, 0), SemanticsModifierKt.clearAndSetSemantics(m722offsetVpY3zN4$default, (ky) rememberedValue5), ColorSchemeKt.getValue(timeInputTokens2.getTimeFieldSupportingTextColor(), startRestartGroup, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypographyKt.getValue(timeInputTokens2.getTimeFieldSupportingTextFont(), startRestartGroup, 6), startRestartGroup, 0, 0, 131064);
                startRestartGroup.endNode();
                TimePickerSelectionMode m2670boximpl = TimePickerSelectionMode.m2670boximpl(timePickerState.mo1597getSelectionyecRtBI());
                if ((i7 & 7168) != 2048) {
                    timePickerState2 = timePickerState;
                    if ((i7 & Fields.TransformOrigin) == 0 || !startRestartGroup.changedInstance(timePickerState2)) {
                        z = false;
                        z2 = z | ((i7 & i8) == 16384);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue == companion2.getEmpty()) {
                            rememberedValue = new TimePickerKt$TimePickerTextField$2$1(timePickerState2, i10, focusRequester4, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        EffectsKt.LaunchedEffect(m2670boximpl, (my) rememberedValue, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        keyboardOptions2 = keyboardOptions4;
                        keyboardActions3 = keyboardActions5;
                    }
                } else {
                    timePickerState2 = timePickerState;
                }
                z = true;
                z2 = z | ((i7 & i8) == 16384);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue = new TimePickerKt$TimePickerTextField$2$1(timePickerState2, i10, focusRequester4, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                EffectsKt.LaunchedEffect(m2670boximpl, (my) rememberedValue, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                keyboardOptions2 = keyboardOptions4;
                keyboardActions3 = keyboardActions5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final TimePickerState timePickerState3 = timePickerState2;
                final int i15 = i10;
                final KeyboardOptions keyboardOptions5 = keyboardOptions2;
                endRestartGroup.updateScope(new my() { // from class: ov0
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 TimePickerTextField_1vLObsk$lambda$94;
                        int intValue = ((Integer) obj2).intValue();
                        TimePickerTextField_1vLObsk$lambda$94 = TimePickerKt.TimePickerTextField_1vLObsk$lambda$94(Modifier.this, textFieldValue, kyVar, timePickerState3, i15, keyboardOptions5, keyboardActions3, timePickerColors, i2, i3, (Composer) obj, intValue);
                        return TimePickerTextField_1vLObsk$lambda$94;
                    }
                });
                return;
            }
            return;
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        if ((i3 & Fields.SpotShadowColor) == 0) {
        }
        i7 = i4;
        if (startRestartGroup.shouldExecute((4793491 & i7) == 4793490, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimePickerTextField_1vLObsk$lambda$92$lambda$89$lambda$88$lambda$87(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimePickerTextField_1vLObsk$lambda$92$lambda$91$lambda$90(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimePickerTextField_1vLObsk$lambda$94(Modifier modifier, TextFieldValue textFieldValue, ky kyVar, TimePickerState timePickerState, int i, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors timePickerColors, int i2, int i3, Composer composer, int i4) {
        m2648TimePickerTextField1vLObsk(modifier, textFieldValue, kyVar, timePickerState, i, keyboardOptions, keyboardActions, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimePicker_mT9BvqQ$lambda$4(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i, int i2, int i3, Composer composer, int i4) {
        m2647TimePickermT9BvqQ(timePickerState, modifier, timePickerColors, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TimeSelector-SAnMeKU, reason: not valid java name */
    public static final void m2649TimeSelectorSAnMeKU(Modifier modifier, int i, TimePickerState timePickerState, int i2, TimePickerColors timePickerColors, Composer composer, int i3) {
        int i4;
        Composer composer2;
        int m2904constructorimpl;
        Composer startRestartGroup = composer.startRestartGroup(-1148055889);
        if ((i3 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= (i3 & Fields.RotationY) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i3 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 2048 : Fields.RotationZ;
        }
        if ((i3 & 24576) == 0) {
            i4 |= startRestartGroup.changed(timePickerColors) ? Fields.Clip : 8192;
        }
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1148055889, i4, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1403)");
            }
            boolean m2673equalsimpl0 = TimePickerSelectionMode.m2673equalsimpl0(timePickerState.mo1597getSelectionyecRtBI(), i2);
            if (TimePickerSelectionMode.m2673equalsimpl0(i2, TimePickerSelectionMode.Companion.m2677getHouryecRtBI())) {
                Strings.Companion companion = Strings.Companion;
                m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_picker_hour_selection);
            } else {
                Strings.Companion companion2 = Strings.Companion;
                m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_picker_minute_selection);
            }
            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(m2904constructorimpl, startRestartGroup, 0);
            long m2629timeSelectorContainerColorvNxB06k$material3 = timePickerColors.m2629timeSelectorContainerColorvNxB06k$material3(m2673equalsimpl0);
            long m2630timeSelectorContentColorvNxB06k$material3 = timePickerColors.m2630timeSelectorContentColorvNxB06k$material3(m2673equalsimpl0);
            boolean changed = startRestartGroup.changed(m2983getString2EP1pXo);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new wd(m2983getString2EP1pXo, 25);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (ky) rememberedValue);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), startRestartGroup, 6);
            boolean z = ((i4 & 7168) == 2048) | ((i4 & 896) == 256 || ((i4 & Fields.RotationY) != 0 && startRestartGroup.changedInstance(timePickerState)));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new wg(i2, timePickerState, 3);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            SurfaceKt.m2465Surfaced85dljk(m2673equalsimpl0, (iy) rememberedValue2, semantics, false, value, m2629timeSelectorContainerColorvNxB06k$material3, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (my) ComposableLambdaKt.rememberComposableLambda(-1477282471, true, new TimePickerKt$TimeSelector$3(i2, timePickerState, i, m2630timeSelectorContentColorvNxB06k$material3), startRestartGroup, 54), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new fv0(modifier, i, timePickerState, i2, timePickerColors, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimeSelector_SAnMeKU$lambda$56$lambda$55(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6833getRadioButtono7Vup1c());
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimeSelector_SAnMeKU$lambda$58$lambda$57(int i, TimePickerState timePickerState) {
        if (!TimePickerSelectionMode.m2673equalsimpl0(i, timePickerState.mo1597getSelectionyecRtBI())) {
            timePickerState.mo1599setSelection6_8s6DQ(i);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TimeSelector_SAnMeKU$lambda$59(Modifier modifier, int i, TimePickerState timePickerState, int i2, TimePickerColors timePickerColors, int i3, Composer composer, int i4) {
        m2649TimeSelectorSAnMeKU(modifier, i, timePickerState, i2, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return w01.a;
    }

    private static final void ToggleItem(final boolean z, Shape shape, iy iyVar, TimePickerColors timePickerColors, ny nyVar, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1523811083);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? Fields.Clip : 8192;
        }
        if (startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1523811083, i2, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1359)");
            }
            long m2628periodSelectorContentColorvNxB06k$material3 = timePickerColors.m2628periodSelectorContentColorvNxB06k$material3(z);
            long m2627periodSelectorContainerColorvNxB06k$material3 = timePickerColors.m2627periodSelectorContainerColorvNxB06k$material3(z);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.Companion, z ? 0.0f : 1.0f), 0.0f, 1, null);
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ky() { // from class: kv0
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 ToggleItem$lambda$49$lambda$48;
                        ToggleItem$lambda$49$lambda$48 = TimePickerKt.ToggleItem$lambda$49$lambda$48(z, (SemanticsPropertyReceiver) obj);
                        return ToggleItem$lambda$49$lambda$48;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ButtonKt.TextButton(iyVar, SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (ky) rememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m1669textButtonColorsro_MJ88(m2627periodSelectorContainerColorvNxB06k$material3, m2628periodSelectorContentColorvNxB06k$material3, 0L, 0L, startRestartGroup, 24576, 12), null, null, PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)), null, nyVar, startRestartGroup, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 7168) | ((i2 << 15) & 1879048192), 356);
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
            endRestartGroup.updateScope(new zd(z, shape, iyVar, timePickerColors, nyVar, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ToggleItem$lambda$49$lambda$48(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ToggleItem$lambda$50(boolean z, Shape shape, iy iyVar, TimePickerColors timePickerColors, ny nyVar, int i, Composer composer, int i2) {
        ToggleItem(z, shape, iyVar, timePickerColors, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final void VerticalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2054675515);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i2, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1153)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), startRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            iy constructor = companion3.getConstructor();
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
            my b = k4.b(companion3, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, i2 & 126);
            if (timePickerState.is24hour()) {
                startRestartGroup.startReplaceGroup(1364727499);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1364287361);
                Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m766paddingqDBjuR0$default);
                iy constructor2 = companion3.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                }
                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i4 = i2 << 3;
                VerticalPeriodToggle(SizeKt.m809sizeVpY3zN4(companion, timePickerTokens.m3716getPeriodSelectorVerticalContainerWidthD9Ej5fM(), timePickerTokens.m3715getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, 6 | (i4 & 112) | (i4 & 896));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new iv0(timePickerState, timePickerColors, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalClockDisplay$lambda$34(TimePickerState timePickerState, TimePickerColors timePickerColors, int i, Composer composer, int i2) {
        VerticalClockDisplay(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1898918107);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i2, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1252)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            value.getClass();
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, (MeasurePolicy) rememberedValue, ShapesKt.top$default(cornerBasedShape, null, 1, null), ShapesKt.bottom$default(cornerBasedShape, null, 1, null), startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new mv0(modifier, timePickerState, timePickerColors, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalPeriodToggle$lambda$39(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, int i, Composer composer, int i2) {
        VerticalPeriodToggle(modifier, timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalTimePicker(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        boolean z2;
        Modifier modifier3;
        TimePickerColors timePickerColors3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        TimePickerColors timePickerColors4;
        Modifier modifier4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1249591487);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(analogTimePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    if (startRestartGroup.changed(timePickerColors2)) {
                        i5 = Fields.RotationX;
                        i3 |= i5;
                    }
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i5 = Fields.SpotShadowColor;
                i3 |= i5;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i6 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 4) != 0) {
                            modifier4 = modifier5;
                            i4 = i3 & (-897);
                            timePickerColors4 = TimePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                        } else {
                            Modifier modifier6 = modifier5;
                            i4 = i3;
                            timePickerColors4 = timePickerColors2;
                            modifier4 = modifier6;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        i4 = i3;
                        timePickerColors4 = timePickerColors2;
                        modifier4 = modifier2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1249591487, i4, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:957)");
                    }
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new qu0(7);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier4, false, (ky) rememberedValue, 1, null);
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), startRestartGroup, 48);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
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
                    my b = k4.b(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    VerticalClockDisplay(analogTimePickerState, timePickerColors4, startRestartGroup, (i4 & 14) | ((i4 >> 3) & 112));
                    Modifier.Companion companion2 = Modifier.Companion;
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion2, ClockDisplayBottomMargin), startRestartGroup, 6);
                    ClockFace(SizeKt.m807size3ABfNKs(companion2, TimePickerTokens.INSTANCE.m3707getClockDialContainerSizeD9Ej5fM()), analogTimePickerState, timePickerColors4, z2, startRestartGroup, ((i4 << 3) & 112) | 6 | (i4 & 896) | (i4 & 7168));
                    SpacerKt.Spacer(SizeKt.m793height3ABfNKs(companion2, ClockFaceBottomMargin), startRestartGroup, 6);
                    startRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    timePickerColors3 = timePickerColors4;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    timePickerColors3 = timePickerColors2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new jv0(analogTimePickerState, modifier3, timePickerColors3, z, i, i2, 0));
                    return;
                }
                return;
            }
            z2 = z;
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        z2 = z;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalTimePicker$lambda$11(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, int i, int i2, Composer composer, int i3) {
        VerticalTimePicker(analogTimePickerState, modifier, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalTimePicker$lambda$9$lambda$8(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float atan(float f, float f2) {
        float atan2 = ((float) Math.atan2(f, f2)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + FullCircle : atan2;
    }

    private static final float dist(float f, float f2, int i, int i2) {
        return (float) Math.hypot(i - f, i2 - f2);
    }

    private static final Modifier drawSelector(Modifier modifier, AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new te0(17, analogTimePickerState, timePickerColors));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawSelector$lambda$61(AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, ContentDrawScope contentDrawScope) {
        float mo367toPx0680j_4 = contentDrawScope.mo367toPx0680j_4(DpOffset.m7672getXD9Ej5fM(getSelectorPos(analogTimePickerState)));
        float mo367toPx0680j_42 = contentDrawScope.mo367toPx0680j_4(DpOffset.m7674getYD9Ej5fM(getSelectorPos(analogTimePickerState)));
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(mo367toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(mo367toPx0680j_4) << 32));
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        float mo367toPx0680j_43 = ((contentDrawScope.mo367toPx0680j_4(timePickerTokens.m3709getClockDialSelectorHandleContainerSizeD9Ej5fM()) / SeparatorZIndex) * contentDrawScope.mo361roundToPx0680j_4(analogTimePickerState.m1596getCurrentDiameterD9Ej5fM())) / contentDrawScope.mo361roundToPx0680j_4(timePickerTokens.m3707getClockDialContainerSizeD9Ej5fM());
        long m2622getSelectorColor0d7_KjU = timePickerColors.m2622getSelectorColor0d7_KjU();
        long m4787getBlack0d7_KjU = Color.Companion.m4787getBlack0d7_KjU();
        BlendMode.Companion companion = BlendMode.Companion;
        DrawScope.m5316drawCircleVaOC9Bg$default(contentDrawScope, m4787getBlack0d7_KjU, mo367toPx0680j_43, m4508constructorimpl, 0.0f, null, null, companion.m4674getClear0nO6VwU(), 56, null);
        contentDrawScope.drawContent();
        DrawScope.m5316drawCircleVaOC9Bg$default(contentDrawScope, m2622getSelectorColor0d7_KjU, mo367toPx0680j_43, m4508constructorimpl, 0.0f, null, null, companion.m4702getXor0nO6VwU(), 56, null);
        float mo367toPx0680j_44 = contentDrawScope.mo367toPx0680j_4(timePickerTokens.m3710getClockDialSelectorTrackContainerWidthD9Ej5fM());
        float cos = ((float) Math.cos(analogTimePickerState.getCurrentAngle())) * mo367toPx0680j_43;
        float sin = ((float) Math.sin(analogTimePickerState.getCurrentAngle())) * mo367toPx0680j_43;
        DrawScope.m5321drawLineNGM6Ib0$default(contentDrawScope, m2622getSelectorColor0d7_KjU, androidx.compose.ui.geometry.SizeKt.m4595getCenteruvyYCjk(contentDrawScope.mo5335getSizeNHjbRc()), Offset.m4520minusMKHz9U(m4508constructorimpl, Offset.m4508constructorimpl((Float.floatToRawIntBits(sin) & 4294967295L) | (Float.floatToRawIntBits(cos) << 32))), mo367toPx0680j_44, 0, null, 0.0f, null, companion.m4701getSrcOver0nO6VwU(), 240, null);
        DrawScope.m5316drawCircleVaOC9Bg$default(contentDrawScope, m2622getSelectorColor0d7_KjU, contentDrawScope.mo367toPx0680j_4(timePickerTokens.m3708getClockDialSelectorCenterContainerSizeD9Ej5fM()) / SeparatorZIndex, androidx.compose.ui.geometry.SizeKt.m4595getCenteruvyYCjk(contentDrawScope.mo5335getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
        DrawScope.m5316drawCircleVaOC9Bg$default(contentDrawScope, timePickerColors.m2611clockDialContentColorvNxB06k$material3(true), mo367toPx0680j_43, m4508constructorimpl, 0.0f, null, null, companion.m4684getDstOver0nO6VwU(), 56, null);
        return w01.a;
    }

    public static final float getClockDialMinContainerSize() {
        return ClockDialMinContainerSize;
    }

    public static final int getDefaultTimePickerLayoutType(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(435687004, i, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.kt:2051)");
        }
        int defaultTimePickerLayoutType = TimePicker_androidKt.defaultTimePickerLayoutType(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTimePickerLayoutType;
    }

    public static final int getHourForDisplay(TimePickerState timePickerState) {
        if (timePickerState.is24hour()) {
            return timePickerState.getHour() % 24;
        }
        if (timePickerState.getHour() % 12 == 0) {
            return 12;
        }
        return isPm(timePickerState) ? timePickerState.getHour() - 12 : timePickerState.getHour();
    }

    public static final long getSelectorPos(AnalogTimePickerState analogTimePickerState) {
        float m1596getCurrentDiameterD9Ej5fM = analogTimePickerState.m1596getCurrentDiameterD9Ej5fM();
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        float m7611constructorimpl = Dp.m7611constructorimpl(Dp.m7611constructorimpl(timePickerTokens.m3709getClockDialSelectorHandleContainerSizeD9Ej5fM() / SeparatorZIndex) * (m1596getCurrentDiameterD9Ej5fM / timePickerTokens.m3707getClockDialContainerSizeD9Ej5fM()));
        Dp m7609boximpl = Dp.m7609boximpl(Dp.m7611constructorimpl(((analogTimePickerState.is24hour() && isPm(analogTimePickerState) && TimePickerSelectionMode.m2673equalsimpl0(analogTimePickerState.mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2677getHouryecRtBI())) ? Dp.m7611constructorimpl(analogTimePickerState.m1596getCurrentDiameterD9Ej5fM() * InnerCircleToSizeRatio) : Dp.m7611constructorimpl(analogTimePickerState.m1596getCurrentDiameterD9Ej5fM() * OuterCircleToSizeRatio)) - m7611constructorimpl));
        Dp m7609boximpl2 = Dp.m7609boximpl(Dp.m7611constructorimpl(0.0f));
        m7609boximpl.getClass();
        m7609boximpl2.getClass();
        if (m7609boximpl.compareTo(m7609boximpl2) < 0) {
            m7609boximpl = m7609boximpl2;
        }
        float m7611constructorimpl2 = Dp.m7611constructorimpl(m7609boximpl.m7625unboximpl() + m7611constructorimpl);
        return DpOffset.m7667constructorimpl((Float.floatToRawIntBits(Dp.m7611constructorimpl(Dp.m7611constructorimpl(analogTimePickerState.m1596getCurrentDiameterD9Ej5fM() / SeparatorZIndex) + Dp.m7611constructorimpl(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * m7611constructorimpl2))) << 32) | (Float.floatToRawIntBits(Dp.m7611constructorimpl(Dp.m7611constructorimpl(analogTimePickerState.m1596getCurrentDiameterD9Ej5fM() / SeparatorZIndex) + Dp.m7611constructorimpl(m7611constructorimpl2 * ((float) Math.sin(analogTimePickerState.getCurrentAngle()))))) & 4294967295L));
    }

    public static final boolean isPm(TimePickerState timePickerState) {
        return timePickerState.getHour() >= 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveSelector-d3b8Pxo, reason: not valid java name */
    public static final void m2655moveSelectord3b8Pxo(TimePickerState timePickerState, float f, float f2, float f3, long j) {
        if (TimePickerSelectionMode.m2673equalsimpl0(timePickerState.mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2677getHouryecRtBI()) && timePickerState.is24hour()) {
            float dist = dist(f, f2, IntOffset.m7739getXimpl(j), IntOffset.m7740getYimpl(j));
            if (isPm(timePickerState)) {
                timePickerState.setHour(timePickerState.getHour() - (dist >= f3 ? 12 : 0));
            } else {
                timePickerState.setHour(timePickerState.getHour() + (dist < f3 ? 12 : 0));
            }
        }
    }

    /* renamed from: numberContentDescription-dSwYdS4, reason: not valid java name */
    public static final String m2656numberContentDescriptiondSwYdS4(int i, boolean z, int i2, Composer composer, int i3) {
        int m2904constructorimpl;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(194237364, i3, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:2019)");
        }
        if (TimePickerSelectionMode.m2673equalsimpl0(i, TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI())) {
            Strings.Companion companion = Strings.Companion;
            m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_picker_minute_suffix);
        } else if (z) {
            Strings.Companion companion2 = Strings.Companion;
            m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_picker_hour_24h_suffix);
        } else {
            Strings.Companion companion3 = Strings.Companion;
            m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_picker_hour_suffix);
        }
        String m2984getStringqBjtwXw = Strings_androidKt.m2984getStringqBjtwXw(m2904constructorimpl, new Object[]{Integer.valueOf(i2)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2984getStringqBjtwXw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: onTap-uYHVD98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2657onTapuYHVD98(AnalogTimePickerState analogTimePickerState, float f, float f2, float f3, boolean z, long j, AnimationSpec<Float> animationSpec, hm hmVar) {
        TimePickerKt$onTap$1 timePickerKt$onTap$1;
        TimePickerKt$onTap$1 timePickerKt$onTap$12;
        int i;
        vn vnVar;
        float f4;
        float rint;
        AnalogTimePickerState analogTimePickerState2;
        boolean z2;
        AnalogTimePickerState analogTimePickerState3;
        if (hmVar instanceof TimePickerKt$onTap$1) {
            timePickerKt$onTap$1 = (TimePickerKt$onTap$1) hmVar;
            int i2 = timePickerKt$onTap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                timePickerKt$onTap$1.label = i2 - Integer.MIN_VALUE;
                timePickerKt$onTap$12 = timePickerKt$onTap$1;
                Object obj = timePickerKt$onTap$12.result;
                i = timePickerKt$onTap$12.label;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    float atan = atan(f2 - IntOffset.m7740getYimpl(j), f - IntOffset.m7739getXimpl(j));
                    if (TimePickerSelectionMode.m2673equalsimpl0(analogTimePickerState.mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI())) {
                        f4 = RadiansPerMinute;
                        rint = ((float) Math.rint((atan / RadiansPerMinute) / 5.0f)) * 5.0f;
                    } else {
                        f4 = RadiansPerHour;
                        rint = (float) Math.rint(atan / RadiansPerHour);
                    }
                    float f5 = rint * f4;
                    m2655moveSelectord3b8Pxo(analogTimePickerState, f, f2, f3, j);
                    timePickerKt$onTap$12.L$0 = analogTimePickerState;
                    timePickerKt$onTap$12.Z$0 = z;
                    timePickerKt$onTap$12.label = 1;
                    if (analogTimePickerState.rotateTo(f5, animationSpec, true, timePickerKt$onTap$12) != vnVar) {
                        analogTimePickerState2 = analogTimePickerState;
                        z2 = z;
                    }
                    return vnVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = timePickerKt$onTap$12.Z$0;
                    analogTimePickerState3 = (AnalogTimePickerState) timePickerKt$onTap$12.L$0;
                    p10.Q(obj);
                    analogTimePickerState2 = analogTimePickerState3;
                    if (z2) {
                        analogTimePickerState2.mo1599setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI());
                    }
                    return w01.a;
                }
                z2 = timePickerKt$onTap$12.Z$0;
                AnalogTimePickerState analogTimePickerState4 = (AnalogTimePickerState) timePickerKt$onTap$12.L$0;
                p10.Q(obj);
                analogTimePickerState2 = analogTimePickerState4;
                if (TimePickerSelectionMode.m2673equalsimpl0(analogTimePickerState2.mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2677getHouryecRtBI()) && z2) {
                    timePickerKt$onTap$12.L$0 = analogTimePickerState2;
                    timePickerKt$onTap$12.Z$0 = z2;
                    timePickerKt$onTap$12.label = 2;
                    if (y80.p(100L, timePickerKt$onTap$12) != vnVar) {
                        analogTimePickerState3 = analogTimePickerState2;
                        analogTimePickerState2 = analogTimePickerState3;
                    }
                    return vnVar;
                }
                if (z2) {
                }
                return w01.a;
            }
        }
        timePickerKt$onTap$1 = new TimePickerKt$onTap$1(hmVar);
        timePickerKt$onTap$12 = timePickerKt$onTap$1;
        Object obj2 = timePickerKt$onTap$12.result;
        i = timePickerKt$onTap$12.label;
        vnVar = vn.d;
        if (i != 0) {
        }
        if (TimePickerSelectionMode.m2673equalsimpl0(analogTimePickerState2.mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2677getHouryecRtBI())) {
            timePickerKt$onTap$12.L$0 = analogTimePickerState2;
            timePickerKt$onTap$12.Z$0 = z2;
            timePickerKt$onTap$12.label = 2;
            if (y80.p(100L, timePickerKt$onTap$12) != vnVar) {
            }
            return vnVar;
        }
        if (z2) {
        }
        return w01.a;
    }

    public static final TimePickerState rememberTimePickerState(final int i, final int i2, final boolean z, Composer composer, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = TimeFormat_androidKt.is24HourFormat(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i3, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:587)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerStateImpl, ?> Saver = TimePickerStateImpl.Companion.Saver();
        boolean z2 = true;
        boolean z3 = ((((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i2)) || (i3 & 48) == 32);
        if ((((i3 & 896) ^ 384) <= 256 || !composer.changed(z)) && (i3 & 384) != 256) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new iy() { // from class: lv0
                @Override // defpackage.iy
                public final Object invoke() {
                    TimePickerStateImpl rememberTimePickerState$lambda$7$lambda$6;
                    rememberTimePickerState$lambda$7$lambda$6 = TimePickerKt.rememberTimePickerState$lambda$7$lambda$6(i, i2, z);
                    return rememberTimePickerState$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        TimePickerStateImpl timePickerStateImpl = (TimePickerStateImpl) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimePickerStateImpl rememberTimePickerState$lambda$7$lambda$6(int i, int i2, boolean z) {
        return new TimePickerStateImpl(i, i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: timeInputOnChange-_K77t-0, reason: not valid java name */
    public static final void m2658timeInputOnChange_K77t0(int i, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i2, Ref<Boolean> ref, ky kyVar) {
        ref.setValue(Boolean.FALSE);
        if (q10.b(textFieldValue.getText(), textFieldValue2.getText())) {
            kyVar.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            if (TimePickerSelectionMode.m2673equalsimpl0(i, TimePickerSelectionMode.Companion.m2677getHouryecRtBI())) {
                timePickerState.setHour((!isPm(timePickerState) || timePickerState.is24hour()) ? 0 : 12);
            } else {
                timePickerState.setMinute(0);
            }
            kyVar.invoke(TextFieldValue.m7306copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            int k = (textFieldValue.getText().length() == 3 && TextRange.m7060getStartimpl(textFieldValue.m7310getSelectiond9O1mEE()) == 1) ? cq.k(textFieldValue.getText().charAt(0)) : Integer.parseInt(textFieldValue.getText());
            if (k <= i2) {
                TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.Companion;
                if (TimePickerSelectionMode.m2673equalsimpl0(i, companion.m2677getHouryecRtBI())) {
                    if (k != 12 || !isPm(timePickerState)) {
                        if (k != 12 || isPm(timePickerState) || timePickerState.is24hour()) {
                            if (!isPm(timePickerState) || timePickerState.is24hour()) {
                                r13 = 0;
                            }
                            r13 += k;
                        } else {
                            r13 = 0;
                        }
                    }
                    timePickerState.setHour(r13);
                    if (k > 1 && !timePickerState.is24hour()) {
                        timePickerState.mo1599setSelection6_8s6DQ(companion.m2678getMinuteyecRtBI());
                    }
                } else {
                    timePickerState.setMinute(k);
                }
                kyVar.invoke(textFieldValue.getText().length() <= 2 ? textFieldValue : TextFieldValue.m7306copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null));
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    private static final Modifier visible(Modifier modifier, boolean z) {
        return modifier.then(new VisibleModifier(z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TimePickerKt$visible$$inlined$debugInspectorInfo$1(z) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ void getDefaultTimePickerLayoutType$annotations() {
    }
}
