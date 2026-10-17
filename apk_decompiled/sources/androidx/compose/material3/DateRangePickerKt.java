package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aq;
import defpackage.ik;
import defpackage.iy;
import defpackage.k10;
import defpackage.k4;
import defpackage.kg;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.pp;
import defpackage.qo;
import defpackage.sp;
import defpackage.un;
import defpackage.w01;
import defpackage.y80;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateRangePickerKt {
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m759PaddingValuesa9UjIt4$default(Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(20.0f), 0.0f, Dp.m7611constructorimpl(8.0f), 4, null);
    private static final PaddingValues DateRangePickerTitlePadding = PaddingKt.m759PaddingValuesa9UjIt4$default(Dp.m7611constructorimpl(64.0f), 0.0f, Dp.m7611constructorimpl(12.0f), 0.0f, 10, null);
    private static final PaddingValues DateRangePickerHeadlinePadding = PaddingKt.m759PaddingValuesa9UjIt4$default(Dp.m7611constructorimpl(64.0f), 0.0f, Dp.m7611constructorimpl(12.0f), Dp.m7611constructorimpl(12.0f), 2, null);
    private static final float HeaderHeightOffset = Dp.m7611constructorimpl(60.0f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0290  */
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
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DateRangePicker(final DateRangePickerState dateRangePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, my myVar, my myVar2, boolean z, FocusRequester focusRequester, Composer composer, int i, int i2) {
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
        Composer startRestartGroup = composer.startRestartGroup(1969726368);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i;
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
                                    myVar3 = ComposableLambdaKt.rememberComposableLambda(-803011924, true, new my() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$2
                                        public final void invoke(Composer composer3, int i13) {
                                            PaddingValues paddingValues;
                                            if (!composer3.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-803011924, i13, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:105)");
                                            }
                                            DateRangePickerDefaults dateRangePickerDefaults = DateRangePickerDefaults.INSTANCE;
                                            int mo1909getDisplayModejFl4v0 = DateRangePickerState.this.mo1909getDisplayModejFl4v0();
                                            Modifier.Companion companion = Modifier.Companion;
                                            paddingValues = DateRangePickerKt.DateRangePickerTitlePadding;
                                            dateRangePickerDefaults.m1901DateRangePickerTitleFNtVw6o(mo1909getDisplayModejFl4v0, PaddingKt.padding(companion, paddingValues), datePickerColors4.m1872getTitleContentColor0d7_KjU(), composer3, 3120, 0);
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
                                my rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(-331385278, z4, new my() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$3
                                    public final void invoke(Composer composer3, int i13) {
                                        PaddingValues paddingValues;
                                        if (!composer3.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-331385278, i13, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:112)");
                                        }
                                        DateRangePickerDefaults dateRangePickerDefaults = DateRangePickerDefaults.INSTANCE;
                                        Long selectedStartDateMillis = DateRangePickerState.this.getSelectedStartDateMillis();
                                        Long selectedEndDateMillis = DateRangePickerState.this.getSelectedEndDateMillis();
                                        int mo1909getDisplayModejFl4v0 = DateRangePickerState.this.mo1909getDisplayModejFl4v0();
                                        DatePickerFormatter datePickerFormatter5 = datePickerFormatter3;
                                        Modifier.Companion companion = Modifier.Companion;
                                        paddingValues = DateRangePickerKt.DateRangePickerHeadlinePadding;
                                        dateRangePickerDefaults.m1900DateRangePickerHeadlineqS89cEg(selectedStartDateMillis, selectedEndDateMillis, mo1909getDisplayModejFl4v0, datePickerFormatter5, PaddingKt.padding(companion, paddingValues), datePickerColors4.m1865getHeadlineContentColor0d7_KjU(), composer3, 1597440, 0);
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
                                ComposerKt.traceEventStart(1969726368, i9, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                            }
                            boolean changed = startRestartGroup.changed(dateRangePickerState.getLocale());
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = dateRangePickerState instanceof BaseDatePickerStateImpl ? ((BaseDatePickerStateImpl) dateRangePickerState).getCalendarModel() : CalendarModel_androidKt.createCalendarModel(dateRangePickerState.getLocale());
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            CalendarModel calendarModel = (CalendarModel) rememberedValue3;
                            if (z5) {
                                startRestartGroup.startReplaceGroup(-2018438858);
                                datePickerFormatter4 = datePickerFormatter3;
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(1343236786, true, new DateRangePickerKt$DateRangePicker$5(dateRangePickerState, datePickerColors5), startRestartGroup, 54);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                datePickerFormatter4 = datePickerFormatter3;
                                startRestartGroup.startReplaceGroup(-2018051234);
                                startRestartGroup.endReplaceGroup();
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda2 = composableLambda;
                            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                            TextStyle value = TypographyKt.getValue(datePickerModalTokens.getRangeSelectionHeaderHeadlineFont(), startRestartGroup, 6);
                            float m7611constructorimpl = Dp.m7611constructorimpl(datePickerModalTokens.m3219getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset);
                            FocusRequester focusRequester4 = focusRequester3;
                            DatePickerFormatter datePickerFormatter5 = datePickerFormatter4;
                            int i14 = i9 >> 9;
                            composer2 = startRestartGroup;
                            DatePickerKt.m1882DateEntryContainerau3_HiA(modifier4, myVar6, myVar4, composableLambda2, datePickerColors5, value, m7611constructorimpl, ComposableLambdaKt.rememberComposableLambda(684885105, true, new DateRangePickerKt$DateRangePicker$6(dateRangePickerState, calendarModel, datePickerFormatter4, datePickerColors5, focusRequester4), startRestartGroup, 54), composer2, ((i9 >> 3) & 14) | 14155776 | (i14 & 112) | (i14 & 896) | ((i9 << 3) & 57344));
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
                            endRestartGroup.updateScope(new kg(dateRangePickerState, modifier3, datePickerFormatter2, datePickerColors3, myVar5, myVar7, z3, focusRequester2, i, i2, 3));
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
    public static final w01 DateRangePicker$lambda$3(DateRangePickerState dateRangePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, my myVar, my myVar2, boolean z, FocusRequester focusRequester, int i, int i2, Composer composer, int i3) {
        DateRangePicker(dateRangePickerState, modifier, datePickerFormatter, datePickerColors, myVar, myVar2, z, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a7, code lost:
    
        if (defpackage.q10.b(r6.rememberedValue(), java.lang.Integer.valueOf(r3)) == false) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DateRangePickerContent(Long l, Long l2, long j, my myVar, ky kyVar, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Long l3;
        my myVar2;
        ky kyVar2;
        SelectableDates selectableDates2;
        Object obj;
        ComposeUiNode.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-787063721);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l3 = l2;
            i2 |= startRestartGroup.changed(l3) ? 32 : 16;
        } else {
            l3 = l2;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            myVar2 = myVar;
            i2 |= startRestartGroup.changedInstance(myVar2) ? Fields.CameraDistance : Fields.RotationZ;
        } else {
            myVar2 = myVar;
        }
        if ((i & 24576) == 0) {
            kyVar2 = kyVar;
            i2 |= startRestartGroup.changedInstance(kyVar2) ? Fields.Clip : 8192;
        } else {
            kyVar2 = kyVar;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(k10Var) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i) == 0) {
            selectableDates2 = selectableDates;
            i2 |= startRestartGroup.changed(selectableDates2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787063721, i2, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:764)");
            }
            int indexIn = calendarModel.getMonth(j).indexIn(k10Var);
            if (indexIn < 0) {
                indexIn = 0;
            }
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(indexIn, 0, startRestartGroup, 0, 2);
            Integer valueOf = Integer.valueOf(indexIn);
            boolean changed = startRestartGroup.changed(rememberLazyListState) | startRestartGroup.changed(indexIn);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                obj = null;
                rememberedValue = new DateRangePickerKt$DateRangePickerContent$1$1(rememberLazyListState, indexIn, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                obj = null;
            }
            EffectsKt.LaunchedEffect(valueOf, (my) rememberedValue, startRestartGroup, 0);
            Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(Modifier.Companion, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, obj);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m764paddingVpY3zN4$default);
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
            my b = k4.b(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting()) {
                companion = companion2;
            } else {
                companion = companion2;
            }
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            DatePickerKt.WeekDays(datePickerColors, calendarModel, startRestartGroup, ((i2 >> 27) & 14) | ((i2 >> 12) & 112));
            VerticalMonthsList(rememberLazyListState, l, l3, myVar2, kyVar2, calendarModel, k10Var, datePickerFormatter, selectableDates2, datePickerColors, startRestartGroup, ((i2 << 3) & 1008) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | (1879048192 & i2));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new sp(l, l2, j, myVar, kyVar, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateRangePickerContent$lambda$12(Long l, Long l2, long j, my myVar, ky kyVar, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        DateRangePickerContent(l, l2, j, myVar, kyVar, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final DateRangePickerState m1902DateRangePickerStateHVP43zI(Locale locale, Long l, Long l2, Long l3, k10 k10Var, int i, SelectableDates selectableDates) {
        return new DateRangePickerStateImpl(l, l2, l3, k10Var, i, selectableDates, locale, null);
    }

    /* renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ DateRangePickerState m1903DateRangePickerStateHVP43zI$default(Locale locale, Long l, Long l2, Long l3, k10 k10Var, int i, SelectableDates selectableDates, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        if ((i2 & 4) != 0) {
            l2 = null;
        }
        if ((i2 & 8) != 0) {
            l3 = l;
        }
        if ((i2 & 16) != 0) {
            k10Var = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i2 & 32) != 0) {
            i = DisplayMode.Companion.m1931getPickerjFl4v0();
        }
        if ((i2 & 64) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m1902DateRangePickerStateHVP43zI(locale, l, l2, l3, k10Var, i, selectableDates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwitchableDateEntryContent-eVtQiho, reason: not valid java name */
    public static final void m1904SwitchableDateEntryContenteVtQiho(final Long l, final Long l2, final long j, final int i, final my myVar, final ky kyVar, final CalendarModel calendarModel, final k10 k10Var, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final FocusRequester focusRequester, Composer composer, final int i2, final int i3) {
        int i4;
        Long l3;
        my myVar2;
        ky kyVar2;
        int i5;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(621028059);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            l3 = l2;
            i4 |= startRestartGroup.changed(l3) ? 32 : 16;
        } else {
            l3 = l2;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            myVar2 = myVar;
            i4 |= startRestartGroup.changedInstance(myVar2) ? Fields.Clip : 8192;
        } else {
            myVar2 = myVar;
        }
        if ((196608 & i2) == 0) {
            kyVar2 = kyVar;
            i4 |= startRestartGroup.changedInstance(kyVar2) ? Fields.RenderEffect : 65536;
        } else {
            kyVar2 = kyVar;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(calendarModel) ? 1048576 : Fields.BlendMode;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(k10Var) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= (i2 & GroupFlagsKt.HasRecompositionRequiredFlag) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(selectableDates) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        int i6 = i5;
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(621028059, i4, i6, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:708)");
            }
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new qo(5);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Long l4 = l3;
            final my myVar3 = myVar2;
            final ky kyVar3 = kyVar2;
            composer2 = startRestartGroup;
            CrossfadeKt.Crossfade(DisplayMode.m1923boximpl(i), SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue, 1, null), (FiniteAnimationSpec<Float>) value, (String) null, ComposableLambdaKt.rememberComposableLambda(-773828161, true, new ny() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$2
                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m1908invokeQujVXRc(((DisplayMode) obj).m1929unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
                    return w01.a;
                }

                /* renamed from: invoke-QujVXRc, reason: not valid java name */
                public final void m1908invokeQujVXRc(int i7, Composer composer3, int i8) {
                    int i9;
                    if ((i8 & 6) == 0) {
                        i9 = i8 | (composer3.changed(i7) ? 4 : 2);
                    } else {
                        i9 = i8;
                    }
                    if (!composer3.shouldExecute((i9 & 19) != 18, i9 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-773828161, i9, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:721)");
                    }
                    DisplayMode.Companion companion2 = DisplayMode.Companion;
                    if (DisplayMode.m1926equalsimpl0(i7, companion2.m1931getPickerjFl4v0())) {
                        composer3.startReplaceGroup(-619517270);
                        DateRangePickerKt.DateRangePickerContent(l, l4, j, myVar3, kyVar3, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, composer3, 0);
                        composer3.endReplaceGroup();
                    } else if (DisplayMode.m1926equalsimpl0(i7, companion2.m1930getInputjFl4v0())) {
                        composer3.startReplaceGroup(-619495944);
                        DateRangeInputKt.DateRangeInputContent(l, l4, myVar3, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-2023979101);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: zp
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 SwitchableDateEntryContent_eVtQiho$lambda$9;
                    int intValue = ((Integer) obj2).intValue();
                    SwitchableDateEntryContent_eVtQiho$lambda$9 = DateRangePickerKt.SwitchableDateEntryContent_eVtQiho$lambda$9(l, l2, j, i, myVar, kyVar, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i2, i3, (Composer) obj, intValue);
                    return SwitchableDateEntryContent_eVtQiho$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SwitchableDateEntryContent_eVtQiho$lambda$8$lambda$7(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SwitchableDateEntryContent_eVtQiho$lambda$9(Long l, Long l2, long j, int i, my myVar, ky kyVar, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2, int i3, Composer composer, int i4) {
        m1904SwitchableDateEntryContenteVtQiho(l, l2, j, i, myVar, kyVar, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return w01.a;
    }

    private static final void VerticalMonthsList(LazyListState lazyListState, Long l, Long l2, my myVar, ky kyVar, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Long l3;
        Long l4;
        Object month;
        Object dateRangePickerKt$VerticalMonthsList$2$1;
        LazyListState lazyListState2 = lazyListState;
        Composer startRestartGroup = composer.startRestartGroup(1257365001);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(lazyListState2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l3 = l;
            i2 |= startRestartGroup.changed(l3) ? 32 : 16;
        } else {
            l3 = l;
        }
        if ((i & 384) == 0) {
            l4 = l2;
            i2 |= startRestartGroup.changed(l4) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            l4 = l2;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(k10Var) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257365001, i2, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:812)");
            }
            CalendarDate today = calendarModel.getToday();
            boolean changed = startRestartGroup.changed(k10Var);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                month = calendarModel.getMonth(k10Var.d, 1);
                startRestartGroup.updateRememberedValue(month);
            } else {
                month = rememberedValue;
            }
            int i3 = i2;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), startRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1090773432, true, new DateRangePickerKt$VerticalMonthsList$1(l3, l4, myVar, lazyListState2, k10Var, calendarModel, (CalendarMonth) month, datePickerFormatter, datePickerColors, today, selectableDates), startRestartGroup, 54), startRestartGroup, 48);
            int i4 = i3 & 14;
            boolean changedInstance = (i4 == 4) | ((i3 & 57344) == 16384) | startRestartGroup.changedInstance(calendarModel) | startRestartGroup.changedInstance(k10Var);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                lazyListState2 = lazyListState;
                dateRangePickerKt$VerticalMonthsList$2$1 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState2, kyVar, calendarModel, k10Var, null);
                startRestartGroup.updateRememberedValue(dateRangePickerKt$VerticalMonthsList$2$1);
            } else {
                dateRangePickerKt$VerticalMonthsList$2$1 = rememberedValue2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.LaunchedEffect(lazyListState2, (my) dateRangePickerKt$VerticalMonthsList$2$1, startRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ik(lazyListState2, l, l2, myVar, kyVar, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalMonthsList$lambda$15(LazyListState lazyListState, Long l, Long l2, my myVar, ky kyVar, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        VerticalMonthsList(lazyListState, l, l2, myVar, kyVar, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(LazyListState lazyListState, un unVar, String str, String str2) {
        return y80.E(new CustomAccessibilityAction(str, new pp(lazyListState, unVar, 2)), new CustomAccessibilityAction(str2, new pp(lazyListState, unVar, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean customScrollActions$lambda$16(LazyListState lazyListState, un unVar) {
        if (!lazyListState.getCanScrollBackward()) {
            return false;
        }
        p01.t(unVar, null, null, new DateRangePickerKt$customScrollActions$scrollUpAction$1$1(lazyListState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean customScrollActions$lambda$17(LazyListState lazyListState, un unVar) {
        if (!lazyListState.getCanScrollForward()) {
            return false;
        }
        p01.t(unVar, null, null, new DateRangePickerKt$customScrollActions$scrollDownAction$1$1(lazyListState, null), 3);
        return true;
    }

    /* renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m1906drawRangeBackgroundmxwnekA(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j) {
        float mo367toPx0680j_4 = contentDrawScope.mo367toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float mo367toPx0680j_42 = contentDrawScope.mo367toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float mo367toPx0680j_43 = (mo367toPx0680j_42 - contentDrawScope.mo367toPx0680j_4(DatePickerModalTokens.INSTANCE.m3212getDateStateLayerHeightD9Ej5fM())) / 2.0f;
        float intBitsToFloat = (Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32)) - (7.0f * mo367toPx0680j_4)) / 7.0f;
        long m2372getGridStartCoordinatesnOccac = selectedRangeInfo.m2372getGridStartCoordinatesnOccac();
        int m7739getXimpl = IntOffset.m7739getXimpl(m2372getGridStartCoordinatesnOccac);
        int m7740getYimpl = IntOffset.m7740getYimpl(m2372getGridStartCoordinatesnOccac);
        long m2371getGridEndCoordinatesnOccac = selectedRangeInfo.m2371getGridEndCoordinatesnOccac();
        int m7739getXimpl2 = IntOffset.m7739getXimpl(m2371getGridEndCoordinatesnOccac);
        int m7740getYimpl2 = IntOffset.m7740getYimpl(m2371getGridEndCoordinatesnOccac);
        float f = mo367toPx0680j_4 + intBitsToFloat;
        float f2 = intBitsToFloat / 2.0f;
        float f3 = (m7739getXimpl * f) + (selectedRangeInfo.getFirstIsSelectionStart() ? mo367toPx0680j_4 / 2.0f : 0.0f) + f2;
        float f4 = (m7740getYimpl * mo367toPx0680j_42) + mo367toPx0680j_43;
        float f5 = m7739getXimpl2 * f;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            mo367toPx0680j_4 /= 2.0f;
        }
        float f6 = f5 + mo367toPx0680j_4 + f2;
        float f7 = (m7740getYimpl2 * mo367toPx0680j_42) + mo367toPx0680j_43;
        boolean z = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z) {
            f3 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32)) - f3;
            f6 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32)) - f6;
        }
        float f8 = f6;
        DrawScope.m5329drawRectnJ9OG0$default(contentDrawScope, j, Offset.m4508constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L)), Size.m4576constructorimpl((Float.floatToRawIntBits(m7740getYimpl == m7740getYimpl2 ? f8 - f3 : z ? -f3 : Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32)) - f3) << 32) | (Float.floatToRawIntBits(r14) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        if (m7740getYimpl != m7740getYimpl2) {
            for (int i = (m7740getYimpl2 - m7740getYimpl) - 1; i > 0; i--) {
                DrawScope.m5329drawRectnJ9OG0$default(contentDrawScope, j, Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i * mo367toPx0680j_42) + f4) & 4294967295L)), Size.m4576constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(r14) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            }
            long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(contentDrawScope.getLayoutDirection() != LayoutDirection.Ltr ? Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32)) : 0.0f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
            if (z) {
                f8 -= Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32));
            }
            DrawScope.m5329drawRectnJ9OG0$default(contentDrawScope, j, m4508constructorimpl, Size.m4576constructorimpl((Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(r14) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        }
    }

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    /* renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final DateRangePickerState m1907rememberDateRangePickerStateIlFM19s(Long l, Long l2, Long l3, k10 k10Var, int i, SelectableDates selectableDates, Composer composer, int i2, int i3) {
        Long l4 = (i3 & 1) != 0 ? null : l;
        Long l5 = (i3 & 2) != 0 ? null : l2;
        Long l6 = (i3 & 4) != 0 ? l4 : l3;
        k10 yearRange = (i3 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : k10Var;
        int m1931getPickerjFl4v0 = (i3 & 16) != 0 ? DisplayMode.Companion.m1931getPickerjFl4v0() : i;
        SelectableDates allDates = (i3 & 32) != 0 ? DatePickerDefaults.INSTANCE.getAllDates() : selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012087461, i2, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:283)");
        }
        Locale defaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DateRangePickerStateImpl, Object> Saver = DateRangePickerStateImpl.Companion.Saver(allDates, defaultLocale);
        boolean z = true;
        boolean changedInstance = ((((i2 & 112) ^ 48) > 32 && composer.changed(l5)) || (i2 & 48) == 32) | ((((i2 & 14) ^ 6) > 4 && composer.changed(l4)) || (i2 & 6) == 4) | ((((i2 & 896) ^ 384) > 256 && composer.changed(l6)) || (i2 & 384) == 256) | composer.changedInstance(yearRange) | ((((57344 & i2) ^ 24576) > 16384 && composer.changed(m1931getPickerjFl4v0)) || (i2 & 24576) == 16384);
        if ((((458752 & i2) ^ 196608) <= 131072 || !composer.changed(allDates)) && (i2 & 196608) != 131072) {
            z = false;
        }
        boolean changedInstance2 = changedInstance | z | composer.changedInstance(defaultLocale);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance2 || rememberedValue == Composer.Companion.getEmpty()) {
            Object aqVar = new aq(l4, l5, l6, yearRange, m1931getPickerjFl4v0, allDates, defaultLocale);
            composer.updateRememberedValue(aqVar);
            rememberedValue = aqVar;
        }
        DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue, composer, 0);
        dateRangePickerStateImpl.setSelectableDates(allDates);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dateRangePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateRangePickerStateImpl rememberDateRangePickerState_IlFM19s$lambda$5$lambda$4(Long l, Long l2, Long l3, k10 k10Var, int i, SelectableDates selectableDates, Locale locale) {
        return new DateRangePickerStateImpl(l, l2, l3, k10Var, i, selectableDates, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDateSelection(long j, Long l, Long l2, my myVar) {
        if ((l == null && l2 == null) || (l != null && l2 != null)) {
            myVar.invoke(Long.valueOf(j), null);
        } else if (l == null || j < l.longValue()) {
            myVar.invoke(Long.valueOf(j), null);
        } else {
            myVar.invoke(l, Long.valueOf(j));
        }
    }
}
