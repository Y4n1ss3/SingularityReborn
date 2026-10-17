package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import defpackage.ae;
import defpackage.bp;
import defpackage.fc;
import defpackage.hm;
import defpackage.iy;
import defpackage.j3;
import defpackage.jw;
import defpackage.k10;
import defpackage.k4;
import defpackage.kg;
import defpackage.ky;
import defpackage.mp;
import defpackage.my;
import defpackage.n6;
import defpackage.ny;
import defpackage.oy;
import defpackage.p01;
import defpackage.pp;
import defpackage.q10;
import defpackage.q6;
import defpackage.qk;
import defpackage.qo;
import defpackage.rp;
import defpackage.sp;
import defpackage.st;
import defpackage.tp;
import defpackage.un;
import defpackage.uo;
import defpackage.vn;
import defpackage.w01;
import defpackage.w5;
import defpackage.wd;
import defpackage.xe0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerKt {
    private static final int MaxCalendarRows = 6;
    private static final int YearsInRow = 3;
    private static final float RecommendedSizeForAccessibility = Dp.m7611constructorimpl(48.0f);
    private static final float MonthYearHeight = Dp.m7611constructorimpl(56.0f);
    private static final float DatePickerHorizontalPadding = Dp.m7611constructorimpl(12.0f);
    private static final PaddingValues DatePickerModeTogglePadding = PaddingKt.m759PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m7611constructorimpl(12.0f), Dp.m7611constructorimpl(12.0f), 3, null);
    private static final PaddingValues DatePickerTitlePadding = PaddingKt.m759PaddingValuesa9UjIt4$default(Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(16.0f), Dp.m7611constructorimpl(12.0f), 0.0f, 8, null);
    private static final PaddingValues DatePickerHeadlinePadding = PaddingKt.m759PaddingValuesa9UjIt4$default(Dp.m7611constructorimpl(24.0f), 0.0f, Dp.m7611constructorimpl(12.0f), Dp.m7611constructorimpl(12.0f), 2, null);
    private static final float YearsVerticalPadding = Dp.m7611constructorimpl(16.0f);

    /* renamed from: DateEntryContainer-au3_HiA, reason: not valid java name */
    public static final void m1882DateEntryContainerau3_HiA(final Modifier modifier, final my myVar, final my myVar2, final my myVar3, final DatePickerColors datePickerColors, final TextStyle textStyle, final float f, final my myVar4, Composer composer, final int i) {
        int i2;
        my myVar5;
        my myVar6;
        my myVar7;
        DatePickerColors datePickerColors2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1539132883);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            myVar5 = myVar;
            i2 |= startRestartGroup.changedInstance(myVar5) ? 32 : 16;
        } else {
            myVar5 = myVar;
        }
        if ((i & 384) == 0) {
            myVar6 = myVar2;
            i2 |= startRestartGroup.changedInstance(myVar6) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            myVar6 = myVar2;
        }
        if ((i & 3072) == 0) {
            myVar7 = myVar3;
            i2 |= startRestartGroup.changedInstance(myVar7) ? Fields.CameraDistance : Fields.RotationZ;
        } else {
            myVar7 = myVar3;
        }
        if ((i & 24576) == 0) {
            datePickerColors2 = datePickerColors;
            i2 |= startRestartGroup.changed(datePickerColors2) ? Fields.Clip : 8192;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar4) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539132883, i2, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1351)");
            }
            Modifier m811sizeInqDBjuR0$default = SizeKt.m811sizeInqDBjuR0$default(modifier, DatePickerModalTokens.INSTANCE.m3209getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new qo(4);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(SemanticsModifierKt.semantics$default(m811sizeInqDBjuR0$default, false, (ky) rememberedValue, 1, null), datePickerColors2.m1853getContainerColor0d7_KjU(), null, 2, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m227backgroundbw27NRU$default);
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
            final my myVar8 = myVar5;
            final my myVar9 = myVar6;
            final my myVar10 = myVar7;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            m1883DatePickerHeaderpc5RIQQ(Modifier.Companion, myVar, datePickerColors2.m1872getTitleContentColor0d7_KjU(), datePickerColors2.m1865getHeadlineContentColor0d7_KjU(), f, ComposableLambdaKt.rememberComposableLambda(-1658370654, true, new my() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1
                public final void invoke(Composer composer3, int i3) {
                    if (!composer3.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1658370654, i3, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1371)");
                    }
                    Modifier.Companion companion2 = Modifier.Companion;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    final my myVar11 = my.this;
                    my myVar12 = myVar10;
                    my myVar13 = myVar8;
                    DatePickerColors datePickerColors4 = datePickerColors3;
                    TextStyle textStyle2 = textStyle;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.Companion;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    iy constructor2 = companion4.getConstructor();
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
                    my b2 = k4.b(companion4, m3878constructorimpl2, columnMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                    if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                    }
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion4.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Arrangement.Horizontal start = (myVar11 == null || myVar12 == null) ? myVar11 != null ? arrangement.getStart() : arrangement.getEnd() : arrangement.getSpaceBetween();
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion3.getCenterVertically(), composer3, 48);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
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
                    my b3 = k4.b(companion4, m3878constructorimpl3, rowMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                    if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                    }
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion4.getSetModifier());
                    final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (myVar11 != null) {
                        composer3.startReplaceGroup(-516028300);
                        TextKt.ProvideTextStyle(textStyle2, ComposableLambdaKt.rememberComposableLambda(-738208900, true, new my() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1$1$1$1
                            public final void invoke(Composer composer4, int i4) {
                                if (!composer4.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-738208900, i4, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1385)");
                                }
                                Modifier weight$default = RowScope.weight$default(RowScope.this, Modifier.Companion, 1.0f, false, 2, null);
                                my myVar14 = myVar11;
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, weight$default);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                                iy constructor4 = companion5.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor4);
                                } else {
                                    composer4.useNode();
                                }
                                Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer4);
                                my b4 = k4.b(companion5, m3878constructorimpl4, maybeCachedBoxMeasurePolicy, m3878constructorimpl4, currentCompositionLocalMap4);
                                if (m3878constructorimpl4.getInserting() || !q10.b(m3878constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    k4.j(b4, currentCompositeKeyHash4, m3878constructorimpl4, currentCompositeKeyHash4);
                                }
                                Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, companion5.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (fc.l(myVar14, composer4, 0)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.my
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return w01.a;
                            }
                        }, composer3, 54), composer3, 48);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-515838022);
                        composer3.endReplaceGroup();
                    }
                    if (myVar12 == null) {
                        composer3.startReplaceGroup(-515799087);
                    } else {
                        composer3.startReplaceGroup(260455984);
                        myVar12.invoke(composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (myVar13 == null && myVar11 == null && myVar12 == null) {
                        composer3.startReplaceGroup(-250277930);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-250360576);
                        DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors4.m1864getDividerColor0d7_KjU(), composer3, 0, 3);
                        composer3.endReplaceGroup();
                    }
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
            }, startRestartGroup, 54), startRestartGroup, (i2 & 112) | 196614 | (57344 & (i2 >> 6)));
            composer2 = startRestartGroup;
            if (fc.l(myVar4, composer2, (i2 >> 21) & 14)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: up
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 DateEntryContainer_au3_HiA$lambda$10;
                    int intValue = ((Integer) obj2).intValue();
                    DateEntryContainer_au3_HiA$lambda$10 = DatePickerKt.DateEntryContainer_au3_HiA$lambda$10(Modifier.this, myVar, myVar2, myVar3, datePickerColors, textStyle, f, myVar4, i, (Composer) obj, intValue);
                    return DateEntryContainer_au3_HiA$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateEntryContainer_au3_HiA$lambda$10(Modifier modifier, my myVar, my myVar2, my myVar3, DatePickerColors datePickerColors, TextStyle textStyle, float f, my myVar4, int i, Composer composer, int i2) {
        m1882DateEntryContainerau3_HiA(modifier, myVar, myVar2, myVar3, datePickerColors, textStyle, f, myVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateEntryContainer_au3_HiA$lambda$8$lambda$7(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DatePicker(final DatePickerState datePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, my myVar, my myVar2, boolean z, FocusRequester focusRequester, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        DatePickerColors datePickerColors2;
        int i4;
        my myVar3;
        int i5;
        my myVar4;
        int i6;
        boolean z2;
        int i7;
        Composer composer2;
        DatePickerFormatter datePickerFormatter2;
        FocusRequester focusRequester2;
        Modifier modifier3;
        DatePickerColors datePickerColors3;
        my myVar5;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        final DatePickerFormatter datePickerFormatter3;
        final DatePickerColors datePickerColors4;
        boolean z4;
        int i8;
        my myVar6;
        boolean z5;
        DatePickerColors datePickerColors5;
        Modifier modifier4;
        int i9;
        FocusRequester focusRequester3;
        DatePickerFormatter datePickerFormatter4;
        ComposableLambda composableLambda;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1105472031);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(datePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    if ((i & Fields.RotationY) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter)) {
                        i11 = Fields.RotationX;
                        i3 |= i11;
                    }
                }
                i11 = Fields.SpotShadowColor;
                i3 |= i11;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    datePickerColors2 = datePickerColors;
                    if (startRestartGroup.changed(datePickerColors2)) {
                        i10 = Fields.CameraDistance;
                        i3 |= i10;
                    }
                } else {
                    datePickerColors2 = datePickerColors;
                }
                i10 = Fields.RotationZ;
                i3 |= i10;
            } else {
                datePickerColors2 = datePickerColors;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                myVar3 = myVar;
                i3 |= startRestartGroup.changedInstance(myVar3) ? Fields.Clip : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    myVar4 = myVar2;
                    i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 1048576 : Fields.BlendMode;
                        i7 = i2 & Fields.SpotShadowColor;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(focusRequester) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i12 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if ((i2 & 4) != 0) {
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    datePickerFormatter3 = (DatePickerFormatter) rememberedValue;
                                    i3 &= -897;
                                } else {
                                    datePickerFormatter3 = datePickerFormatter;
                                }
                                if ((i2 & 8) != 0) {
                                    datePickerColors4 = DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i3 &= -7169;
                                } else {
                                    datePickerColors4 = datePickerColors2;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                    myVar3 = ComposableLambdaKt.rememberComposableLambda(1655706771, true, new my() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                        public final void invoke(Composer composer3, int i13) {
                                            PaddingValues paddingValues;
                                            if (!composer3.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1655706771, i13, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:173)");
                                            }
                                            DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
                                            int mo1891getDisplayModejFl4v0 = DatePickerState.this.mo1891getDisplayModejFl4v0();
                                            Modifier.Companion companion = Modifier.Companion;
                                            paddingValues = DatePickerKt.DatePickerTitlePadding;
                                            datePickerDefaults.m1878DatePickerTitleFNtVw6o(mo1891getDisplayModejFl4v0, PaddingKt.padding(companion, paddingValues), datePickerColors4.m1872getTitleContentColor0d7_KjU(), composer3, 3120, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54);
                                    i8 = 54;
                                } else {
                                    z4 = true;
                                    i8 = 54;
                                }
                                my rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(1439279037, z4, new my() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
                                    public final void invoke(Composer composer3, int i13) {
                                        PaddingValues paddingValues;
                                        if (!composer3.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1439279037, i13, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:180)");
                                        }
                                        DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
                                        Long selectedDateMillis = DatePickerState.this.getSelectedDateMillis();
                                        int mo1891getDisplayModejFl4v0 = DatePickerState.this.mo1891getDisplayModejFl4v0();
                                        DatePickerFormatter datePickerFormatter5 = datePickerFormatter3;
                                        Modifier.Companion companion = Modifier.Companion;
                                        paddingValues = DatePickerKt.DatePickerHeadlinePadding;
                                        datePickerDefaults.m1877DatePickerHeadlineISIPfiY(selectedDateMillis, mo1891getDisplayModejFl4v0, datePickerFormatter5, PaddingKt.padding(companion, paddingValues), datePickerColors4.m1865getHeadlineContentColor0d7_KjU(), composer3, 199680, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, i8) : myVar4;
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                if (i7 != 0) {
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = new FocusRequester();
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    int i13 = i3;
                                    focusRequester3 = (FocusRequester) rememberedValue2;
                                    z5 = z2;
                                    datePickerColors5 = datePickerColors4;
                                    i9 = i13;
                                    myVar4 = rememberComposableLambda;
                                    myVar6 = myVar3;
                                    modifier4 = modifier2;
                                } else {
                                    myVar4 = rememberComposableLambda;
                                    myVar6 = myVar3;
                                    z5 = z2;
                                    datePickerColors5 = datePickerColors4;
                                    modifier4 = modifier2;
                                    i9 = i3;
                                    focusRequester3 = focusRequester;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                datePickerFormatter3 = datePickerFormatter;
                                i9 = i3;
                                myVar6 = myVar3;
                                z5 = z2;
                                focusRequester3 = focusRequester;
                                modifier4 = modifier2;
                                datePickerColors5 = datePickerColors2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1105472031, i9, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                            }
                            boolean changed = startRestartGroup.changed(datePickerState.getLocale());
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = datePickerState instanceof BaseDatePickerStateImpl ? ((BaseDatePickerStateImpl) datePickerState).getCalendarModel() : CalendarModel_androidKt.createCalendarModel(datePickerState.getLocale());
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            CalendarModel calendarModel = (CalendarModel) rememberedValue3;
                            if (z5) {
                                startRestartGroup.startReplaceGroup(-690551113);
                                datePickerFormatter4 = datePickerFormatter3;
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(-1483431603, true, new DatePickerKt$DatePicker$5(datePickerState, datePickerColors5), startRestartGroup, 54);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                datePickerFormatter4 = datePickerFormatter3;
                                startRestartGroup.startReplaceGroup(-690163489);
                                startRestartGroup.endReplaceGroup();
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda2 = composableLambda;
                            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                            TextStyle value = TypographyKt.getValue(datePickerModalTokens.getHeaderHeadlineFont(), startRestartGroup, 6);
                            float m3215getHeaderContainerHeightD9Ej5fM = datePickerModalTokens.m3215getHeaderContainerHeightD9Ej5fM();
                            FocusRequester focusRequester4 = focusRequester3;
                            DatePickerFormatter datePickerFormatter5 = datePickerFormatter4;
                            int i14 = i9 >> 9;
                            composer2 = startRestartGroup;
                            m1882DateEntryContainerau3_HiA(modifier4, myVar6, myVar4, composableLambda2, datePickerColors5, value, m3215getHeaderContainerHeightD9Ej5fM, ComposableLambdaKt.rememberComposableLambda(-1346903698, true, new DatePickerKt$DatePicker$6(datePickerState, calendarModel, datePickerFormatter4, datePickerColors5, focusRequester4), startRestartGroup, 54), composer2, ((i9 >> 3) & 14) | 14155776 | (i14 & 112) | (i14 & 896) | ((i9 << 3) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            datePickerFormatter2 = datePickerFormatter5;
                            focusRequester2 = focusRequester4;
                            z3 = z5;
                            modifier3 = modifier4;
                            myVar5 = myVar6;
                            datePickerColors3 = datePickerColors5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            datePickerFormatter2 = datePickerFormatter;
                            focusRequester2 = focusRequester;
                            modifier3 = modifier2;
                            datePickerColors3 = datePickerColors2;
                            myVar5 = myVar3;
                            z3 = z2;
                        }
                        my myVar7 = myVar4;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kg(datePickerState, modifier3, datePickerFormatter2, datePickerColors3, myVar5, myVar7, z3, focusRequester2, i, i2, 2));
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    i7 = i2 & Fields.SpotShadowColor;
                    if (i7 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    my myVar72 = myVar4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar4 = myVar2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z2 = z;
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                my myVar722 = myVar4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar3 = myVar;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            myVar4 = myVar2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            my myVar7222 = myVar4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        myVar3 = myVar;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        myVar4 = myVar2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        my myVar72222 = myVar4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DatePicker$lambda$3(DatePickerState datePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, my myVar, my myVar2, boolean z, FocusRequester focusRequester, int i, int i2, Composer composer, int i3) {
        DatePicker(datePickerState, modifier, datePickerFormatter, datePickerColors, myVar, myVar2, z, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0246, code lost:
    
        if (r15 == r1.getEmpty()) goto L128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DatePickerContent(final Long l, final long j, final ky kyVar, final ky kyVar2, final CalendarModel calendarModel, final k10 k10Var, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        un unVar;
        Composer startRestartGroup = composer.startRestartGroup(-434467002);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(k10Var) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434467002, i2, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1537)");
            }
            CalendarMonth month = calendarModel.getMonth(j);
            int indexIn = month.indexIn(k10Var);
            if (indexIn < 0) {
                indexIn = 0;
            }
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(indexIn, 0, startRestartGroup, 0, 2);
            Integer valueOf = Integer.valueOf(indexIn);
            boolean changed = startRestartGroup.changed(rememberLazyListState) | startRestartGroup.changed(indexIn);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DatePickerKt$DatePickerContent$1$1(rememberLazyListState, indexIn, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.LaunchedEffect(valueOf, (my) rememberedValue, startRestartGroup, 0);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            un unVar2 = (un) rememberedValue2;
            Object[] objArr = new Object[0];
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new defpackage.e1(19);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (iy) rememberedValue3, startRestartGroup, 48);
            Modifier.Companion companion2 = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            int i3 = i2;
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
            float f = DatePickerHorizontalPadding;
            Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(companion2, f, 0.0f, 2, null);
            boolean canScrollForward = rememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = rememberLazyListState.getCanScrollBackward();
            boolean DatePickerContent$lambda$26 = DatePickerContent$lambda$26(mutableState);
            String formatMonthYear = datePickerFormatter.formatMonthYear(Long.valueOf(j), calendarModel.getLocale());
            if (formatMonthYear == null) {
                formatMonthYear = "-";
            }
            boolean changedInstance = startRestartGroup.changedInstance(unVar2) | startRestartGroup.changed(rememberLazyListState);
            String str = formatMonthYear;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new pp(unVar2, rememberLazyListState, 0);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            iy iyVar = (iy) rememberedValue4;
            boolean changedInstance2 = startRestartGroup.changedInstance(unVar2) | startRestartGroup.changed(rememberLazyListState);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new pp(unVar2, rememberLazyListState, 1);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            iy iyVar2 = (iy) rememberedValue5;
            boolean changed2 = startRestartGroup.changed(mutableState);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed2) {
                unVar = unVar2;
            } else {
                unVar = unVar2;
            }
            rememberedValue6 = new j3(mutableState, 7);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            int i4 = i3 & 234881024;
            MonthsNavigation(m764paddingVpY3zN4$default, canScrollForward, canScrollBackward, DatePickerContent$lambda$26, str, iyVar, iyVar2, (iy) rememberedValue6, datePickerColors, startRestartGroup, i4 | 6);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
            Modifier m764paddingVpY3zN4$default2 = PaddingKt.m764paddingVpY3zN4$default(companion2, f, 0.0f, 2, null);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m764paddingVpY3zN4$default2);
            iy constructor3 = companion4.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl3 = Updater.m3878constructorimpl(startRestartGroup);
            my b3 = k4.b(companion4, m3878constructorimpl3, columnMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
            if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
            }
            Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion4.getSetModifier());
            WeekDays(datePickerColors, calendarModel, startRestartGroup, ((i3 >> 24) & 14) | ((i3 >> 9) & 112));
            HorizontalMonthsList(rememberLazyListState, l, kyVar, kyVar2, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, startRestartGroup, ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128) | i4);
            startRestartGroup.endNode();
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultEffects;
            FiniteAnimationSpec value = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
            FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            FiniteAnimationSpec value3 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
            AnimatedVisibilityKt.AnimatedVisibility(DatePickerContent$lambda$26(mutableState), ClipKt.clipToBounds(companion2), EnterExitTransitionKt.expandVertically$default(value3, null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn(value, 0.6f)), EnterExitTransitionKt.shrinkVertically$default(value3, null, false, null, 14, null).plus(EnterExitTransitionKt.fadeOut$default(value2, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(1193716082, true, new DatePickerKt$DatePickerContent$2$4$2(j, mutableState, unVar, rememberLazyListState, k10Var, month, selectableDates, calendarModel, datePickerColors), startRestartGroup, 54), startRestartGroup, 196656, 16);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: qp
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 DatePickerContent$lambda$37;
                    int intValue = ((Integer) obj2).intValue();
                    DatePickerContent$lambda$37 = DatePickerKt.DatePickerContent$lambda$37(l, j, kyVar, kyVar2, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, i, (Composer) obj, intValue);
                    return DatePickerContent$lambda$37;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState DatePickerContent$lambda$25$lambda$24() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DatePickerContent$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DatePickerContent$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DatePickerContent$lambda$36$lambda$29$lambda$28(un unVar, LazyListState lazyListState) {
        p01.t(unVar, null, null, new DatePickerKt$DatePickerContent$2$1$1$1(lazyListState, null), 3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DatePickerContent$lambda$36$lambda$31$lambda$30(un unVar, LazyListState lazyListState) {
        p01.t(unVar, null, null, new DatePickerKt$DatePickerContent$2$2$1$1(lazyListState, null), 3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DatePickerContent$lambda$36$lambda$33$lambda$32(MutableState mutableState) {
        DatePickerContent$lambda$27(mutableState, !DatePickerContent$lambda$26(mutableState));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DatePickerContent$lambda$37(Long l, long j, ky kyVar, ky kyVar2, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        DatePickerContent(l, j, kyVar, kyVar2, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0107, code lost:
    
        if (defpackage.q10.b(r1.rememberedValue(), java.lang.Integer.valueOf(r12)) == false) goto L71;
     */
    /* renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1883DatePickerHeaderpc5RIQQ(final Modifier modifier, final my myVar, final long j, final long j2, final float f, final my myVar2, Composer composer, final int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(2020490761);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(j2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(f) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? Fields.RenderEffect : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2020490761, i2, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1677)");
            }
            Modifier then = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(myVar != null ? SizeKt.m792defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, f, 1, null) : Modifier.Companion);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getStart(), startRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
            if (m3878constructorimpl.getInserting()) {
                i3 = i2;
            } else {
                i3 = i2;
            }
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (myVar != null) {
                startRestartGroup.startReplaceGroup(396894187);
                ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getHeaderSupportingTextFont(), startRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1344395458, true, new my() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$1$1
                    public final void invoke(Composer composer2, int i4) {
                        if (!composer2.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1344395458, i4, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1692)");
                        }
                        Alignment bottomStart = Alignment.Companion.getBottomStart();
                        my myVar3 = my.this;
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomStart, false);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                        my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                        if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                        }
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (fc.l(myVar3, composer2, 0)) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 6) & 14) | 384);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(397163267);
                startRestartGroup.endReplaceGroup();
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j2)), myVar2, startRestartGroup, ProvidedValue.$stable | ((i3 >> 12) & 112));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: hp
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 DatePickerHeader_pc5RIQQ$lambda$39;
                    int intValue = ((Integer) obj2).intValue();
                    DatePickerHeader_pc5RIQQ$lambda$39 = DatePickerKt.DatePickerHeader_pc5RIQQ$lambda$39(Modifier.this, myVar, j, j2, f, myVar2, i, (Composer) obj, intValue);
                    return DatePickerHeader_pc5RIQQ$lambda$39;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DatePickerHeader_pc5RIQQ$lambda$39(Modifier modifier, my myVar, long j, long j2, float f, my myVar2, int i, Composer composer, int i2) {
        m1883DatePickerHeaderpc5RIQQ(modifier, myVar, j, j2, f, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* renamed from: DatePickerState-sHin3Bw, reason: not valid java name */
    public static final DatePickerState m1884DatePickerStatesHin3Bw(Locale locale, Long l, Long l2, k10 k10Var, int i, SelectableDates selectableDates) {
        return new DatePickerStateImpl(l, l2, k10Var, i, selectableDates, locale, null);
    }

    /* renamed from: DatePickerState-sHin3Bw$default, reason: not valid java name */
    public static /* synthetic */ DatePickerState m1885DatePickerStatesHin3Bw$default(Locale locale, Long l, Long l2, k10 k10Var, int i, SelectableDates selectableDates, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        if ((i2 & 4) != 0) {
            l2 = l;
        }
        if ((i2 & 8) != 0) {
            k10Var = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i2 & 16) != 0) {
            i = DisplayMode.Companion.m1931getPickerjFl4v0();
        }
        if ((i2 & 32) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        SelectableDates selectableDates2 = selectableDates;
        k10 k10Var2 = k10Var;
        return m1884DatePickerStatesHin3Bw(locale, l, l2, k10Var2, i, selectableDates2);
    }

    private static final void Day(final String str, final Modifier modifier, final boolean z, final iy iyVar, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final String str2, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        boolean z6;
        boolean z7;
        boolean z8;
        DatePickerColors datePickerColors2;
        Composer startRestartGroup = composer.startRestartGroup(-945355136);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            z6 = z2;
            i2 |= startRestartGroup.changed(z6) ? Fields.Clip : 8192;
        } else {
            z6 = z2;
        }
        if ((196608 & i) == 0) {
            z7 = z3;
            i2 |= startRestartGroup.changed(z7) ? Fields.RenderEffect : 65536;
        } else {
            z7 = z3;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(z4) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            z8 = z5;
            i2 |= startRestartGroup.changed(z8) ? GroupFlagsKt.IsNodeFlag : 4194304;
        } else {
            z8 = z5;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(str2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            datePickerColors2 = datePickerColors;
            i2 |= startRestartGroup.changed(datePickerColors2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if (startRestartGroup.shouldExecute((306783379 & i2) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-945355136, i2, -1, "androidx.compose.material3.Day (DatePicker.kt:2003)");
            }
            boolean z9 = (234881024 & i2) == 67108864;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new wd(str2, 11);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (ky) rememberedValue);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            int i3 = i2 >> 6;
            SurfaceKt.m2465Surfaced85dljk(z, iyVar, semantics, z3, ShapesKt.getValue(datePickerModalTokens.getDateContainerShape(), startRestartGroup, 6), datePickerColors2.dayContainerColor$material3(z, z7, z6, startRestartGroup, (i3 & 14) | ((i2 >> 12) & 112) | (i3 & 896) | ((i2 >> 18) & 7168)).getValue().m4771unboximpl(), 0L, 0.0f, 0.0f, (!z4 || z) ? null : BorderStrokeKt.m253BorderStrokecXLIe8U(datePickerModalTokens.m3214getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m1874getTodayDateBorderColor0d7_KjU()), (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(1126347158, true, new DatePickerKt$Day$2(str, datePickerColors, z4, z, z8, z3), startRestartGroup, 54), startRestartGroup, i3 & 7294, 48, 1472);
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: jp
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 Day$lambda$62;
                    int intValue = ((Integer) obj2).intValue();
                    Day$lambda$62 = DatePickerKt.Day$lambda$62(str, modifier, z, iyVar, z2, z3, z4, z5, str2, datePickerColors, i, (Composer) obj, intValue);
                    return Day$lambda$62;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final w01 Day$lambda$61$lambda$60(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, 2, 0 == true ? 1 : 0));
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6828getButtono7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Day$lambda$62(String str, Modifier modifier, boolean z, iy iyVar, boolean z2, boolean z3, boolean z4, boolean z5, String str2, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        Day(str, modifier, z, iyVar, z2, z3, z4, z5, str2, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* renamed from: DisplayModeToggleButton-iUJLfQg, reason: not valid java name */
    public static final void m1886DisplayModeToggleButtoniUJLfQg(Modifier modifier, int i, ky kyVar, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1461252485);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(datePickerColors) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1461252485, i3, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1406)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(datePickerColors.m1865getHeadlineContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-1734512197, true, new DatePickerKt$DisplayModeToggleButton$1(i, kyVar, modifier), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new defpackage.g1(modifier, i, kyVar, datePickerColors, i2, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DisplayModeToggleButton_iUJLfQg$lambda$11(Modifier modifier, int i, ky kyVar, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        m1886DisplayModeToggleButtoniUJLfQg(modifier, i, kyVar, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return w01.a;
    }

    private static final void HorizontalMonthsList(LazyListState lazyListState, Long l, ky kyVar, ky kyVar2, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Long l2;
        ky kyVar3;
        SelectableDates selectableDates2;
        DatePickerColors datePickerColors2;
        Object datePickerKt$HorizontalMonthsList$2$1;
        LazyListState lazyListState2 = lazyListState;
        Composer startRestartGroup = composer.startRestartGroup(-1994757941);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(lazyListState2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l2 = l;
            i2 |= startRestartGroup.changed(l2) ? 32 : 16;
        } else {
            l2 = l;
        }
        if ((i & 384) == 0) {
            kyVar3 = kyVar;
            i2 |= startRestartGroup.changedInstance(kyVar3) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            kyVar3 = kyVar;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(k10Var) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            selectableDates2 = selectableDates;
            i2 |= startRestartGroup.changed(selectableDates2) ? GroupFlagsKt.IsNodeFlag : 4194304;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((100663296 & i) == 0) {
            datePickerColors2 = datePickerColors;
            i2 |= startRestartGroup.changed(datePickerColors2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if (startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1994757941, i2, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1711)");
            }
            CalendarDate today = calendarModel.getToday();
            boolean changed = startRestartGroup.changed(k10Var);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = calendarModel.getMonth(k10Var.d, 1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i3 = i2;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), startRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1504086906, true, new DatePickerKt$HorizontalMonthsList$1(lazyListState2, k10Var, calendarModel, (CalendarMonth) rememberedValue, kyVar3, today, l2, datePickerFormatter, selectableDates2, datePickerColors2), startRestartGroup, 54), startRestartGroup, 48);
            int i4 = i3 & 14;
            boolean changedInstance = (i4 == 4) | ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(calendarModel) | startRestartGroup.changedInstance(k10Var);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                lazyListState2 = lazyListState;
                datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState2, kyVar2, calendarModel, k10Var, null);
                startRestartGroup.updateRememberedValue(datePickerKt$HorizontalMonthsList$2$1);
            } else {
                datePickerKt$HorizontalMonthsList$2$1 = rememberedValue2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.LaunchedEffect(lazyListState2, (my) datePickerKt$HorizontalMonthsList$2$1, startRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new qk(lazyListState2, l, kyVar, kyVar2, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalMonthsList$lambda$42(LazyListState lazyListState, Long l, ky kyVar, ky kyVar2, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        HorizontalMonthsList(lazyListState, l, kyVar, kyVar2, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButtonWithTooltip(iy iyVar, ImageVector imageVector, final String str, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        final iy iyVar2;
        int i3;
        final ImageVector imageVector2;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-368059805);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else if ((i & 6) == 0) {
            iyVar2 = iyVar;
            i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
        } else {
            iyVar2 = iyVar;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            imageVector2 = imageVector;
            i3 |= startRestartGroup.changed(imageVector2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(str) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                    } else {
                        Modifier modifier4 = i4 != 0 ? Modifier.Companion : modifier2;
                        boolean z4 = i5 != 0 ? true : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368059805, i3, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                        }
                        final Modifier modifier5 = modifier4;
                        final boolean z5 = z4;
                        TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m2786rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.Companion.m2773getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), ComposableLambdaKt.rememberComposableLambda(-456272562, true, new ny() { // from class: androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$1
                            public final void invoke(TooltipScope tooltipScope, Composer composer2, int i6) {
                                int i7;
                                if ((i6 & 6) == 0) {
                                    i7 = i6 | ((i6 & 8) == 0 ? composer2.changed(tooltipScope) : composer2.changedInstance(tooltipScope) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if (!composer2.shouldExecute((i7 & 19) != 18, i7 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-456272562, i7, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2283)");
                                }
                                final String str2 = str;
                                TooltipKt.m2789PlainTooltipgv3ox5I(tooltipScope, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1905952188, true, new my() { // from class: androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$1.1
                                    public final void invoke(Composer composer3, int i8) {
                                        if (!composer3.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1905952188, i8, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2283)");
                                        }
                                        TextKt.m2607TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, composer2, 54), composer2, (i7 & 14) | 805306368, 255);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.ny
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((TooltipScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return w01.a;
                            }
                        }, startRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-1124908186, true, new my() { // from class: androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$2
                            public final void invoke(Composer composer2, int i6) {
                                if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1124908186, i6, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2286)");
                                }
                                iy iyVar3 = iy.this;
                                Modifier modifier6 = modifier5;
                                boolean z6 = z5;
                                final ImageVector imageVector3 = imageVector2;
                                final String str2 = str;
                                IconButtonKt.IconButton(iyVar3, modifier6, z6, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1301085432, true, new my() { // from class: androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$2.1
                                    public final void invoke(Composer composer3, int i7) {
                                        if (!composer3.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1301085432, i7, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2287)");
                                        }
                                        IconKt.m2055Iconww6aTOc(ImageVector.this, str2, (Modifier) null, 0L, composer3, 0, 12);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, composer2, 54), composer2, 1572864, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.my
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return w01.a;
                            }
                        }, startRestartGroup, 54), startRestartGroup, 100663344, 248);
                        startRestartGroup = startRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        z3 = z5;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new tp(iyVar, imageVector, str, modifier3, z3, i, i2));
                        return;
                    }
                    return;
                }
                z2 = z;
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z2 = z;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        imageVector2 = imageVector;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z2 = z;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconButtonWithTooltip$lambda$71(iy iyVar, ImageVector imageVector, String str, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        IconButtonWithTooltip(iyVar, imageVector, str, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b5, code lost:
    
        if (defpackage.q10.b(r5.rememberedValue(), java.lang.Integer.valueOf(r15)) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0238, code lost:
    
        if (defpackage.q10.b(r4.rememberedValue(), java.lang.Integer.valueOf(r15)) == false) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Month(CalendarMonth calendarMonth, ky kyVar, long j, Long l, Long l2, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Locale locale, Composer composer, int i) {
        CalendarMonth calendarMonth2;
        int i2;
        Composer composer2;
        int i3;
        Modifier.Companion companion;
        Modifier modifier;
        ComposeUiNode.Companion companion2;
        ComposeUiNode.Companion companion3;
        int i4;
        int i5;
        int i6;
        Composer composer3;
        int i7;
        boolean z;
        int i8;
        boolean z2;
        int i9;
        char c;
        Object obj;
        boolean z3;
        boolean z4;
        boolean z5;
        Object a;
        Locale locale2 = locale;
        Composer startRestartGroup = composer.startRestartGroup(-333300603);
        if ((i & 6) == 0) {
            calendarMonth2 = calendarMonth;
            i2 = (startRestartGroup.changed(calendarMonth2) ? 4 : 2) | i;
        } else {
            calendarMonth2 = calendarMonth;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(l) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(l2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(selectedRangeInfo) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(locale2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i10 = i2;
        if (startRestartGroup.shouldExecute((306783379 & i10) != 306783378, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-333300603, i10, -1, "androidx.compose.material3.Month (DatePicker.kt:1844)");
            }
            if (selectedRangeInfo != null) {
                startRestartGroup.startReplaceGroup(606579709);
                companion = Modifier.Companion;
                i3 = 458752;
                boolean z6 = ((i10 & 458752) == 131072) | ((234881024 & i10) == 67108864);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new defpackage.g(14, selectedRangeInfo, datePickerColors);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                modifier = DrawModifierKt.drawWithContent(companion, (ky) rememberedValue);
                startRestartGroup.endReplaceGroup();
            } else {
                i3 = 458752;
                startRestartGroup.startReplaceGroup(606771165);
                startRestartGroup.endReplaceGroup();
                companion = Modifier.Companion;
                modifier = companion;
            }
            Modifier then = SizeKt.m796requiredHeight3ABfNKs(companion, Dp.m7611constructorimpl(RecommendedSizeForAccessibility * 6.0f)).then(modifier);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getStart(), startRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
            if (m3878constructorimpl.getInserting()) {
                companion2 = companion4;
            } else {
                companion2 = companion4;
            }
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-680088486);
            int i11 = 0;
            int i12 = 0;
            while (i12 < 6) {
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getCenterVertically(), startRestartGroup, 54);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                int i13 = i11;
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                int i14 = i12;
                iy constructor2 = companion5.getConstructor();
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
                my b2 = k4.b(companion5, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                if (m3878constructorimpl2.getInserting()) {
                    companion3 = companion5;
                } else {
                    companion3 = companion5;
                }
                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(1542622325);
                int i15 = i13;
                int i16 = 0;
                while (i16 < 7) {
                    if (i15 >= calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth()) {
                        if (i15 < calendarMonth2.getNumberOfDays() + calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth()) {
                            startRestartGroup.startReplaceGroup(577914947);
                            int daysFromStartOfWeekToFirstOfMonth = i15 - calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth();
                            int i17 = i16;
                            long startUtcTimeMillis = (daysFromStartOfWeekToFirstOfMonth * CalendarModelKt.MillisecondsIn24Hours) + calendarMonth2.getStartUtcTimeMillis();
                            boolean z7 = startUtcTimeMillis == j;
                            if (l != null && startUtcTimeMillis == l.longValue()) {
                                i7 = i10;
                                z = true;
                            } else {
                                i7 = i10;
                                z = false;
                            }
                            if (l2 != null && startUtcTimeMillis == l2.longValue()) {
                                i8 = i7;
                                z2 = true;
                            } else {
                                i8 = i7;
                                z2 = false;
                            }
                            if (selectedRangeInfo != null) {
                                i4 = i15;
                                startRestartGroup.startReplaceGroup(578361347);
                                i9 = daysFromStartOfWeekToFirstOfMonth;
                                boolean changed = ((i8 & i3) == 131072) | startRestartGroup.changed(startUtcTimeMillis);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    if (startUtcTimeMillis >= (l != null ? l.longValue() : SnapshotId_jvmKt.SnapshotIdMax)) {
                                        if (startUtcTimeMillis <= (l2 != null ? l2.longValue() : Long.MIN_VALUE)) {
                                            z5 = true;
                                            i5 = i17;
                                            c = 2;
                                            obj = null;
                                            a = uo.a(z5, null, 2, null, startRestartGroup);
                                        }
                                    }
                                    z5 = false;
                                    i5 = i17;
                                    c = 2;
                                    obj = null;
                                    a = uo.a(z5, null, 2, null, startRestartGroup);
                                } else {
                                    a = rememberedValue2;
                                    i5 = i17;
                                    c = 2;
                                    obj = null;
                                }
                                boolean booleanValue = ((Boolean) ((MutableState) a).getValue()).booleanValue();
                                startRestartGroup.endReplaceGroup();
                                z3 = booleanValue;
                            } else {
                                i4 = i15;
                                i9 = daysFromStartOfWeekToFirstOfMonth;
                                i5 = i17;
                                c = 2;
                                obj = null;
                                startRestartGroup.startReplaceGroup(578890300);
                                startRestartGroup.endReplaceGroup();
                                z3 = false;
                            }
                            Composer composer4 = startRestartGroup;
                            int i18 = i8;
                            boolean z8 = z3;
                            String dayContentDescription = dayContentDescription(selectedRangeInfo != null, z7, z, z2, z8, composer4, 0);
                            boolean z9 = z7;
                            boolean z10 = z;
                            boolean z11 = z2;
                            String formatDate = datePickerFormatter.formatDate(Long.valueOf(startUtcTimeMillis), locale2, true);
                            if (formatDate == null) {
                                formatDate = "";
                            }
                            String str = formatDate;
                            String localString$default = CalendarLocale_jvmKt.toLocalString$default(i9 + 1, 0, 0, false, locale, 7, null);
                            Modifier.Companion companion6 = Modifier.Companion;
                            boolean z12 = z10 || z11;
                            boolean changed2 = ((i18 & 112) == 32) | composer4.changed(startUtcTimeMillis);
                            Object rememberedValue3 = composer4.rememberedValue();
                            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                z4 = true;
                                rememberedValue3 = new n6(1 == true ? 1 : 0, startUtcTimeMillis, kyVar);
                                composer4.updateRememberedValue(rememberedValue3);
                            } else {
                                z4 = true;
                            }
                            iy iyVar = (iy) rememberedValue3;
                            i6 = i18;
                            boolean changed3 = composer4.changed(startUtcTimeMillis) | ((i18 & 29360128) == 8388608 ? z4 : false);
                            Object rememberedValue4 = composer4.rememberedValue();
                            if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                rememberedValue4 = Boolean.valueOf((selectableDates.isSelectableYear(calendarMonth.getYear()) && selectableDates.isSelectableDate(startUtcTimeMillis)) ? z4 : false);
                                composer4.updateRememberedValue(rememberedValue4);
                            }
                            boolean booleanValue2 = ((Boolean) rememberedValue4).booleanValue();
                            if (dayContentDescription != null) {
                                str = uo.d(dayContentDescription, ", ", str);
                            }
                            Day(localString$default, companion6, z12, iyVar, z10, booleanValue2, z9, z8, str, datePickerColors, composer4, ((i6 << 3) & 1879048192) | 48);
                            composer3 = composer4;
                            composer3.endReplaceGroup();
                            i15 = i4 + 1;
                            calendarMonth2 = calendarMonth;
                            locale2 = locale;
                            i16 = i5 + 1;
                            startRestartGroup = composer3;
                            i10 = i6;
                        }
                    }
                    i4 = i15;
                    i5 = i16;
                    i6 = i10;
                    composer3 = startRestartGroup;
                    composer3.startReplaceGroup(576825328);
                    Modifier.Companion companion7 = Modifier.Companion;
                    DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m809sizeVpY3zN4(SizeKt.m811sizeInqDBjuR0$default(companion7, datePickerModalTokens.m3211getDateContainerWidthD9Ej5fM(), datePickerModalTokens.m3210getDateContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), ((Dp) composer3.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl(), ((Dp) composer3.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl()), composer3, 0);
                    composer3.endReplaceGroup();
                    i15 = i4 + 1;
                    calendarMonth2 = calendarMonth;
                    locale2 = locale;
                    i16 = i5 + 1;
                    startRestartGroup = composer3;
                    i10 = i6;
                }
                int i19 = i10;
                Composer composer5 = startRestartGroup;
                composer5.endReplaceGroup();
                composer5.endNode();
                calendarMonth2 = calendarMonth;
                locale2 = locale;
                i12 = i14 + 1;
                i11 = i15;
                i10 = i19;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceGroup();
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
            endRestartGroup.updateScope(new sp(calendarMonth, kyVar, j, l, l2, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, locale, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Month$lambda$51$lambda$50(SelectedRangeInfo selectedRangeInfo, DatePickerColors datePickerColors, ContentDrawScope contentDrawScope) {
        DateRangePickerKt.m1906drawRangeBackgroundmxwnekA(contentDrawScope, selectedRangeInfo, datePickerColors.m1856getDayInSelectionRangeContainerColor0d7_KjU());
        contentDrawScope.drawContent();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Month$lambda$58$lambda$57$lambda$54$lambda$53(ky kyVar, long j) {
        kyVar.invoke(Long.valueOf(j));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Month$lambda$59(CalendarMonth calendarMonth, ky kyVar, long j, Long l, Long l2, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Locale locale, int i, Composer composer, int i2) {
        Month(calendarMonth, kyVar, j, l, l2, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, locale, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final void MonthsNavigation(final Modifier modifier, final boolean z, final boolean z2, final boolean z3, final String str, final iy iyVar, final iy iyVar2, final iy iyVar3, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        iy iyVar4;
        Composer startRestartGroup = composer.startRestartGroup(-773929258);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(str) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            iyVar4 = iyVar3;
            i2 |= startRestartGroup.changedInstance(iyVar4) ? GroupFlagsKt.IsNodeFlag : 4194304;
        } else {
            iyVar4 = iyVar3;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-773929258, i2, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2191)");
            }
            Modifier m796requiredHeight3ABfNKs = SizeKt.m796requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), MonthYearHeight);
            int i3 = i2;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(z3 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m796requiredHeight3ABfNKs);
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
            YearPickerMenuButton(iyVar4, z3, null, ComposableLambdaKt.rememberComposableLambda(619076006, true, new DatePickerKt$MonthsNavigation$1$1(str, datePickerColors), startRestartGroup, 54), startRestartGroup, ((i3 >> 21) & 14) | 3072 | ((i3 >> 6) & 112), 4);
            if (z3) {
                startRestartGroup.startReplaceGroup(282432080);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(281624840);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(datePickerColors.m1866getNavigationContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-128317193, true, new my() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$2
                    public final void invoke(Composer composer2, int i4) {
                        if (!composer2.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-128317193, i4, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2220)");
                        }
                        iy iyVar5 = iy.this;
                        boolean z4 = z2;
                        iy iyVar6 = iyVar;
                        boolean z5 = z;
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, 0);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                        my b2 = k4.b(companion3, m3878constructorimpl2, rowMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                        if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                        }
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        Icons.AutoMirrored.Filled filled = Icons.AutoMirrored.Filled.INSTANCE;
                        ImageVector keyboardArrowLeft$material3 = filled.getKeyboardArrowLeft$material3();
                        Strings.Companion companion4 = Strings.Companion;
                        DatePickerKt.IconButtonWithTooltip(iyVar5, keyboardArrowLeft$material3, Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_switch_to_previous_month), composer2, 0), null, z4, composer2, 0, 8);
                        DatePickerKt.IconButtonWithTooltip(iyVar6, filled.getKeyboardArrowRight$material3(), Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_switch_to_next_month), composer2, 0), null, z5, composer2, 0, 8);
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
                }, startRestartGroup, 54), startRestartGroup, 48 | ProvidedValue.$stable);
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
            endRestartGroup.updateScope(new my() { // from class: kp
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 MonthsNavigation$lambda$69;
                    int intValue = ((Integer) obj2).intValue();
                    MonthsNavigation$lambda$69 = DatePickerKt.MonthsNavigation$lambda$69(Modifier.this, z, z2, z3, str, iyVar, iyVar2, iyVar3, datePickerColors, i, (Composer) obj, intValue);
                    return MonthsNavigation$lambda$69;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MonthsNavigation$lambda$69(Modifier modifier, boolean z, boolean z2, boolean z3, String str, iy iyVar, iy iyVar2, iy iyVar3, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        MonthsNavigation(modifier, z, z2, z3, str, iyVar, iyVar2, iyVar3, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwitchableDateEntryContent-KaiTk9E, reason: not valid java name */
    public static final void m1887SwitchableDateEntryContentKaiTk9E(final Long l, final long j, final int i, final ky kyVar, final ky kyVar2, final CalendarModel calendarModel, final k10 k10Var, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final FocusRequester focusRequester, Composer composer, final int i2, final int i3) {
        int i4;
        CalendarModel calendarModel2;
        k10 k10Var2;
        SelectableDates selectableDates2;
        int i5;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-2053685029);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(i) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar2) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            calendarModel2 = calendarModel;
            i4 |= startRestartGroup.changedInstance(calendarModel2) ? Fields.RenderEffect : 65536;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((1572864 & i2) == 0) {
            k10Var2 = k10Var;
            i4 |= startRestartGroup.changedInstance(k10Var2) ? 1048576 : Fields.BlendMode;
        } else {
            k10Var2 = k10Var;
        }
        if ((12582912 & i2) == 0) {
            i4 |= (16777216 & i2) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i2) == 0) {
            selectableDates2 = selectableDates;
            i4 |= startRestartGroup.changed(selectableDates2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(focusRequester) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2053685029, i4, i5, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1443)");
            }
            int i6 = -((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo361roundToPx0680j_4(Dp.m7611constructorimpl(48.0f));
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6);
            FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            int i7 = i4;
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
            FiniteAnimationSpec value3 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
            FiniteAnimationSpec value4 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
            DisplayMode m1923boximpl = DisplayMode.m1923boximpl(i);
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = new qo(3);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue, 1, null);
            boolean changedInstance = startRestartGroup.changedInstance(value3) | startRestartGroup.changedInstance(value) | startRestartGroup.changedInstance(value2) | startRestartGroup.changed(i6) | startRestartGroup.changedInstance(value4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new mp(value3, value, value2, i6, value4);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ky kyVar3 = (ky) rememberedValue2;
            final SelectableDates selectableDates3 = selectableDates2;
            final CalendarModel calendarModel3 = calendarModel2;
            final k10 k10Var3 = k10Var2;
            composer2 = startRestartGroup;
            AnimatedContentKt.AnimatedContent(m1923boximpl, semantics$default, kyVar3, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.rememberComposableLambda(1838500091, true, new oy() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$3
                @Override // defpackage.oy
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    m1890invokefYndouo((AnimatedContentScope) obj, ((DisplayMode) obj2).m1929unboximpl(), (Composer) obj3, ((Number) obj4).intValue());
                    return w01.a;
                }

                /* renamed from: invoke-fYndouo, reason: not valid java name */
                public final void m1890invokefYndouo(AnimatedContentScope animatedContentScope, int i8, Composer composer3, int i9) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1838500091, i9, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1498)");
                    }
                    DisplayMode.Companion companion3 = DisplayMode.Companion;
                    if (DisplayMode.m1926equalsimpl0(i8, companion3.m1931getPickerjFl4v0())) {
                        composer3.startReplaceGroup(1567031954);
                        DatePickerKt.DatePickerContent(l, j, kyVar, kyVar2, calendarModel3, k10Var3, datePickerFormatter, selectableDates3, datePickerColors, composer3, 0);
                        composer3.endReplaceGroup();
                    } else if (DisplayMode.m1926equalsimpl0(i8, companion3.m1930getInputjFl4v0())) {
                        composer3.startReplaceGroup(1567050592);
                        DateInputKt.DateInputContent(l, kyVar, calendarModel3, k10Var3, datePickerFormatter, selectableDates3, datePickerColors, focusRequester, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1334373351);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), composer2, ((i7 >> 6) & 14) | 1597440, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: np
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 SwitchableDateEntryContent_KaiTk9E$lambda$22;
                    int intValue = ((Integer) obj2).intValue();
                    SwitchableDateEntryContent_KaiTk9E$lambda$22 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$22(l, j, i, kyVar, kyVar2, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i2, i3, (Composer) obj, intValue);
                    return SwitchableDateEntryContent_KaiTk9E$lambda$22;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SwitchableDateEntryContent_KaiTk9E$lambda$14$lambda$13(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, final int i, FiniteAnimationSpec finiteAnimationSpec4, AnimatedContentTransitionScope animatedContentTransitionScope) {
        ContentTransform contentTransform;
        final int i2 = 1;
        int i3 = 2;
        if (DisplayMode.m1926equalsimpl0(((DisplayMode) animatedContentTransitionScope.getTargetState()).m1929unboximpl(), DisplayMode.Companion.m1930getInputjFl4v0())) {
            final int i4 = 0;
            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new qo(i2)).plus(EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 2, null)), EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec3, 0.0f, 2, null).plus(EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new ky() { // from class: lp
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    int SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16;
                    int i5 = i4;
                    int i6 = i;
                    int intValue = ((Integer) obj).intValue();
                    switch (i5) {
                        case 0:
                            SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16(i6, intValue);
                            break;
                        default:
                            SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$17(i6, intValue);
                            break;
                    }
                    return Integer.valueOf(SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16);
                }
            })));
        } else {
            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new ky() { // from class: lp
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    int SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16;
                    int i5 = i2;
                    int i6 = i;
                    int intValue = ((Integer) obj).intValue();
                    switch (i5) {
                        case 0:
                            SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16(i6, intValue);
                            break;
                        default:
                            SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$17(i6, intValue);
                            break;
                    }
                    return Integer.valueOf(SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16);
                }
            }).plus(EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new qo(i3)).plus(EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec3, 0.0f, 2, null)));
        }
        return animatedContentTransitionScope.using(contentTransform, AnimatedContentKt.SizeTransform(true, new w5(finiteAnimationSpec4, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SwitchableDateEntryContent_KaiTk9E$lambda$22(Long l, long j, int i, ky kyVar, ky kyVar2, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2, int i3, Composer composer, int i4) {
        m1887SwitchableDateEntryContentKaiTk9E(l, j, i, kyVar, kyVar2, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return w01.a;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void WeekDays(DatePickerColors datePickerColors, CalendarModel calendarModel, Composer composer, int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1849465391);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(datePickerColors) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 32 : 16;
        }
        ?? r8 = 0;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i2, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1782)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<xe0> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i3 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i4 = i3; i4 < size; i4++) {
                arrayList.add(weekdayNames.get(i4));
            }
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList.add(weekdayNames.get(i5));
            }
            TextStyle value = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont(), startRestartGroup, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m792defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, RecommendedSizeForAccessibility, 1, null), 0.0f, 1, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getCenterVertically(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            startRestartGroup.startReplaceGroup(24563235);
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                xe0 xe0Var = (xe0) arrayList.get(i6);
                Modifier.Companion companion2 = Modifier.Companion;
                boolean changed = startRestartGroup.changed(xe0Var);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new defpackage.h(xe0Var, 14);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion2, (ky) rememberedValue);
                DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                Modifier m809sizeVpY3zN4 = SizeKt.m809sizeVpY3zN4(SizeKt.m811sizeInqDBjuR0$default(clearAndSetSemantics, datePickerModalTokens.m3211getDateContainerWidthD9Ej5fM(), datePickerModalTokens.m3210getDateContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), ((Dp) startRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl(), ((Dp) startRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl());
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), r8);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, r8);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m809sizeVpY3zN4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
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
                Composer composer3 = startRestartGroup;
                TextKt.m2607TextNvy7gAk((String) xe0Var.e, SizeKt.wrapContentSize$default(companion2, null, false, 3, null), datePickerColors.m1875getWeekdayContentColor0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7482boximpl(TextAlign.Companion.m7489getCentere0LSkKk()), 0L, 0, false, 0, 0, null, value, composer3, 48, 0, 130040);
                composer3.endNode();
                i6++;
                startRestartGroup = composer3;
                arrayList = arrayList;
                r8 = 0;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceGroup();
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
            endRestartGroup.updateScope(new q6(datePickerColors, calendarModel, i, 12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 WeekDays$lambda$48$lambda$47$lambda$45$lambda$44(xe0 xe0Var, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) xe0Var.d);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 WeekDays$lambda$49(DatePickerColors datePickerColors, CalendarModel calendarModel, int i, Composer composer, int i2) {
        WeekDays(datePickerColors, calendarModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Year(final String str, final Modifier modifier, final boolean z, final boolean z2, final iy iyVar, final boolean z3, final String str2, final DatePickerColors datePickerColors, Composer composer, final int i) {
        String str3;
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1153850597);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (startRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z3) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1153850597, i2, -1, "androidx.compose.material3.Year (DatePicker.kt:2128)");
            }
            boolean z4 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = (!z2 || z) ? null : BorderStrokeKt.m253BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m3214getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m1874getTodayDateBorderColor0d7_KjU());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BorderStroke borderStroke = (BorderStroke) rememberedValue;
            boolean z5 = (3670016 & i2) == 1048576;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new wd(str2, 12);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            int i3 = i2 >> 6;
            int i4 = i3 & 14;
            composer2 = startRestartGroup;
            SurfaceKt.m2465Surfaced85dljk(z, iyVar, SemanticsModifierKt.semantics(modifier, true, (ky) rememberedValue2), z3, ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), startRestartGroup, 6), datePickerColors.yearContainerColor$material3(z, z3, startRestartGroup, i4 | ((i2 >> 12) & 112) | ((i2 >> 15) & 896)).getValue().m4771unboximpl(), 0L, 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-564400443, true, new DatePickerKt$Year$2(str3, datePickerColors, z2, z, z3), startRestartGroup, 54), composer2, i4 | ((i2 >> 9) & 112) | (i3 & 7168), 48, 1472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: op
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 Year$lambda$67;
                    int intValue = ((Integer) obj2).intValue();
                    Year$lambda$67 = DatePickerKt.Year$lambda$67(str, modifier, z, z2, iyVar, z3, str2, datePickerColors, i, (Composer) obj, intValue);
                    return Year$lambda$67;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final w01 Year$lambda$66$lambda$65(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, 2, 0 == true ? 1 : 0));
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6828getButtono7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Year$lambda$67(String str, Modifier modifier, boolean z, boolean z2, iy iyVar, boolean z3, String str2, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        Year(str, modifier, z, z2, iyVar, z3, str2, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void YearPicker(final Modifier modifier, final long j, final ky kyVar, final SelectableDates selectableDates, final CalendarModel calendarModel, final k10 k10Var, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1286899812);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(k10Var) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 1048576 : Fields.BlendMode;
        }
        if (startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1286899812, i2, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2068)");
            }
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont(), startRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1301915789, true, new DatePickerKt$YearPicker$1(calendarModel, j, k10Var, modifier, datePickerColors, kyVar, selectableDates), startRestartGroup, 54), startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: ip
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 YearPicker$lambda$63;
                    int intValue = ((Integer) obj2).intValue();
                    YearPicker$lambda$63 = DatePickerKt.YearPicker$lambda$63(Modifier.this, j, kyVar, selectableDates, calendarModel, k10Var, datePickerColors, i, (Composer) obj, intValue);
                    return YearPicker$lambda$63;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 YearPicker$lambda$63(Modifier modifier, long j, ky kyVar, SelectableDates selectableDates, CalendarModel calendarModel, k10 k10Var, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        YearPicker(modifier, j, kyVar, selectableDates, calendarModel, k10Var, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void YearPickerMenuButton(iy iyVar, final boolean z, Modifier modifier, final my myVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-709923073);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else if ((i & 6) == 0) {
            iyVar2 = iyVar;
            i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
        } else {
            iyVar2 = iyVar;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-709923073, i3, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2247)");
                }
                modifier2 = modifier3;
                ButtonKt.TextButton(iyVar2, modifier2, false, RoundedCornerShapeKt.getCircleShape(), ButtonDefaults.INSTANCE.m1669textButtonColorsro_MJ88(0L, ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl(), 0L, 0L, startRestartGroup, 24576, 13), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1899489890, true, new ny() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1
                    public final void invoke(RowScope rowScope, Composer composer2, int i5) {
                        String m2983getString2EP1pXo;
                        if (!composer2.shouldExecute((i5 & 17) != 16, i5 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1899489890, i5, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2256)");
                        }
                        my.this.invoke(composer2, 0);
                        Modifier.Companion companion = Modifier.Companion;
                        SpacerKt.Spacer(SizeKt.m807size3ABfNKs(companion, ButtonDefaults.INSTANCE.m1665getIconSpacingD9Ej5fM()), composer2, 6);
                        ImageVector arrowDropDown$material3 = Icons.Filled.INSTANCE.getArrowDropDown$material3();
                        if (z) {
                            composer2.startReplaceGroup(1509384391);
                            Strings.Companion companion2 = Strings.Companion;
                            m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_switch_to_day_selection), composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1509478662);
                            Strings.Companion companion3 = Strings.Companion;
                            m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_switch_to_year_selection), composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        IconKt.m2055Iconww6aTOc(arrowDropDown$material3, m2983getString2EP1pXo, RotateKt.rotate(companion, z ? 180.0f : 0.0f), 0L, composer2, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.ny
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return w01.a;
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 807075840 | ((i3 >> 3) & 112), 388);
                startRestartGroup = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            Modifier modifier4 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new ae(iyVar, z, modifier4, myVar, i, i2));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        Modifier modifier42 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 YearPickerMenuButton$lambda$70(iy iyVar, boolean z, Modifier modifier, my myVar, int i, int i2, Composer composer, int i3) {
        YearPickerMenuButton(iyVar, z, modifier, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final String dayContentDescription(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1972)");
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            composer.startReplaceGroup(974450583);
            if (z3) {
                composer.startReplaceGroup(1416909399);
                Strings.Companion companion = Strings.Companion;
                sb.append(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_picker_start_headline), composer, 0));
                composer.endReplaceGroup();
            } else if (z4) {
                composer.startReplaceGroup(1416913397);
                Strings.Companion companion2 = Strings.Companion;
                sb.append(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_picker_end_headline), composer, 0));
                composer.endReplaceGroup();
            } else if (z5) {
                composer.startReplaceGroup(1416917332);
                Strings.Companion companion3 = Strings.Companion;
                sb.append(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_picker_day_in_range), composer, 0));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(974832875);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(974838827);
            composer.endReplaceGroup();
        }
        if (z2) {
            composer.startReplaceGroup(1416920485);
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Strings.Companion companion4 = Strings.Companion;
            sb.append(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_today_description), composer, 0));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(975029291);
            composer.endReplaceGroup();
        }
        String sb2 = sb.length() == 0 ? null : sb.toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sb2;
    }

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    public static final int numberOfMonthsInRange(k10 k10Var) {
        return ((k10Var.e - k10Var.d) + 1) * 12;
    }

    /* renamed from: rememberDatePickerState-EU0dCGE, reason: not valid java name */
    public static final DatePickerState m1889rememberDatePickerStateEU0dCGE(Long l, Long l2, k10 k10Var, int i, SelectableDates selectableDates, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            l = null;
        }
        Long l3 = l;
        Long l4 = (i3 & 2) != 0 ? l3 : l2;
        if ((i3 & 4) != 0) {
            k10Var = DatePickerDefaults.INSTANCE.getYearRange();
        }
        k10 k10Var2 = k10Var;
        if ((i3 & 8) != 0) {
            i = DisplayMode.Companion.m1931getPickerjFl4v0();
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        SelectableDates selectableDates2 = selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2065763010, i2, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:373)");
        }
        Locale defaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DatePickerStateImpl, Object> Saver = DatePickerStateImpl.Companion.Saver(selectableDates2, defaultLocale);
        boolean z = true;
        boolean changedInstance = ((((i2 & 14) ^ 6) > 4 && composer.changed(l3)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(l4)) || (i2 & 48) == 32) | composer.changedInstance(k10Var2) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(i4)) || (i2 & 3072) == 2048);
        if ((((57344 & i2) ^ 24576) <= 16384 || !composer.changed(selectableDates2)) && (i2 & 24576) != 16384) {
            z = false;
        }
        boolean changedInstance2 = changedInstance | z | composer.changedInstance(defaultLocale);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance2 || rememberedValue == Composer.Companion.getEmpty()) {
            Object bpVar = new bp(l3, l4, k10Var2, i4, selectableDates2, defaultLocale);
            composer.updateRememberedValue(bpVar);
            rememberedValue = bpVar;
        }
        DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue, composer, 0);
        datePickerStateImpl.setSelectableDates(selectableDates2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return datePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DatePickerStateImpl rememberDatePickerState_EU0dCGE$lambda$5$lambda$4(Long l, Long l2, k10 k10Var, int i, SelectableDates selectableDates, Locale locale) {
        return new DatePickerStateImpl(l, l2, k10Var, i, selectableDates, locale, null);
    }

    public static final Object updateDisplayedMonth(final LazyListState lazyListState, final ky kyVar, final CalendarModel calendarModel, final k10 k10Var, hm hmVar) {
        Object collect = SnapshotStateKt.snapshotFlow(new rp(lazyListState, 0)).collect(new jw() { // from class: androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3
            public final Object emit(int i, hm hmVar2) {
                int firstVisibleItemIndex = LazyListState.this.getFirstVisibleItemIndex() / 12;
                kyVar.invoke(new Long(calendarModel.getMonth(k10Var.d + firstVisibleItemIndex, (LazyListState.this.getFirstVisibleItemIndex() % 12) + 1).getStartUtcTimeMillis()));
                return w01.a;
            }

            @Override // defpackage.jw
            public /* bridge */ /* synthetic */ Object emit(Object obj, hm hmVar2) {
                return emit(((Number) obj).intValue(), hmVar2);
            }
        }, hmVar);
        return collect == vn.d ? collect : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$15(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$18(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16(int i, int i2) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$17(int i, int i2) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$19(FiniteAnimationSpec finiteAnimationSpec, IntSize intSize, IntSize intSize2) {
        return finiteAnimationSpec;
    }
}
