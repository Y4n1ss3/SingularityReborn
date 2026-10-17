package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.DateRangeInputKt;
import androidx.compose.material3.InputIdentifier;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import defpackage.iy;
import defpackage.k10;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.qk;
import defpackage.w01;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateRangeInputKt {
    private static final float TextFieldSpacing = Dp.m7611constructorimpl(8.0f);

    public static final void DateRangeInputContent(final Long l, final Long l2, final my myVar, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        k10 k10Var2;
        final my myVar2;
        Composer composer2;
        Object dateInputValidator;
        int i3;
        boolean z;
        Composer startRestartGroup = composer.startRestartGroup(1372713366);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            k10Var2 = k10Var;
            i2 |= startRestartGroup.changedInstance(k10Var2) ? Fields.Clip : 8192;
        } else {
            k10Var2 = k10Var;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & Fields.ColorFilter) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= startRestartGroup.changed(focusRequester) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (startRestartGroup.shouldExecute((i2 & 38347923) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1372713366, i2, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:44)");
            }
            boolean changed = startRestartGroup.changed(calendarModel.getLocale());
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = calendarModel.getDateInputFormat(calendarModel.getLocale());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DateInputFormat dateInputFormat = (DateInputFormat) rememberedValue;
            Strings.Companion companion = Strings.Companion;
            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_invalid_for_pattern), startRestartGroup, 0);
            String m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_invalid_year_range), startRestartGroup, 0);
            String m2983getString2EP1pXo3 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_invalid_not_allowed), startRestartGroup, 0);
            String m2983getString2EP1pXo4 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_input_invalid_range_input), startRestartGroup, 0);
            boolean changed2 = startRestartGroup.changed(dateInputFormat) | ((i2 & 458752) == 131072 || ((i2 & Fields.ColorFilter) != 0 && startRestartGroup.changed(datePickerFormatter)));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                i3 = i2;
                dateInputValidator = new DateInputValidator(k10Var2, selectableDates, dateInputFormat, datePickerFormatter, m2983getString2EP1pXo, m2983getString2EP1pXo2, m2983getString2EP1pXo3, m2983getString2EP1pXo4);
                dateInputFormat = dateInputFormat;
                startRestartGroup.updateRememberedValue(dateInputValidator);
            } else {
                dateInputValidator = rememberedValue2;
                i3 = i2;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) dateInputValidator;
            dateInputValidator2.setCurrentStartDateMillis(l);
            dateInputValidator2.setCurrentEndDateMillis(l2);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier padding = PaddingKt.padding(companion2, DateInputKt.getInputTextFieldPadding());
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(TextFieldSpacing), Alignment.Companion.getTop(), startRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
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
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String m2983getString2EP1pXo5 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_picker_start_headline), startRestartGroup, 0);
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion2, 0.5f, false, 2, null);
            InputIdentifier.Companion companion4 = InputIdentifier.Companion;
            int m2087getStartDateInputJ2x2o4M = companion4.m2087getStartDateInputJ2x2o4M();
            Locale locale = calendarModel.getLocale();
            int i4 = i3 & 896;
            int i5 = i3 & 112;
            boolean z2 = (i5 == 32) | (i4 == 256);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                final int i6 = 0;
                rememberedValue3 = new ky() { // from class: wp
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 DateRangeInputContent$lambda$7$lambda$4$lambda$3;
                        w01 DateRangeInputContent$lambda$7$lambda$6$lambda$5;
                        switch (i6) {
                            case 0:
                                DateRangeInputContent$lambda$7$lambda$4$lambda$3 = DateRangeInputKt.DateRangeInputContent$lambda$7$lambda$4$lambda$3(myVar, l2, (Long) obj);
                                return DateRangeInputContent$lambda$7$lambda$4$lambda$3;
                            default:
                                DateRangeInputContent$lambda$7$lambda$6$lambda$5 = DateRangeInputKt.DateRangeInputContent$lambda$7$lambda$6$lambda$5(myVar, l2, (Long) obj);
                                return DateRangeInputContent$lambda$7$lambda$6$lambda$5;
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            int i7 = i3 & 7168;
            int i8 = i3 >> 21;
            int i9 = i8 & 14;
            int i10 = i3;
            composer2 = startRestartGroup;
            DateInputKt.m1849DateInputTextFieldxJ3Ic0Y(weight$default, l, (ky) rememberedValue3, calendarModel, ComposableLambdaKt.rememberComposableLambda(1740538748, true, new DateRangeInputKt$DateRangeInputContent$2$2(m2983getString2EP1pXo5, upperCase), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1229526589, true, new DateRangeInputKt$DateRangeInputContent$2$3(upperCase), startRestartGroup, 54), m2087getStartDateInputJ2x2o4M, dateInputValidator2, dateInputFormat, locale, datePickerColors, focusRequester, composer2, ((i3 << 3) & 112) | 1794048 | i7, i8 & 126);
            String m2983getString2EP1pXo6 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_picker_end_headline), composer2, 0);
            Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, companion2, 0.5f, false, 2, null);
            int m2085getEndDateInputJ2x2o4M = companion4.m2085getEndDateInputJ2x2o4M();
            Locale locale2 = calendarModel.getLocale();
            boolean z3 = (i4 == 256) | ((i10 & 14) == 4);
            Object rememberedValue4 = composer2.rememberedValue();
            if (z3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                myVar2 = myVar;
                z = true;
                final char c = 1 == true ? 1 : 0;
                rememberedValue4 = new ky() { // from class: wp
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 DateRangeInputContent$lambda$7$lambda$4$lambda$3;
                        w01 DateRangeInputContent$lambda$7$lambda$6$lambda$5;
                        switch (c) {
                            case 0:
                                DateRangeInputContent$lambda$7$lambda$4$lambda$3 = DateRangeInputKt.DateRangeInputContent$lambda$7$lambda$4$lambda$3(myVar2, l, (Long) obj);
                                return DateRangeInputContent$lambda$7$lambda$4$lambda$3;
                            default:
                                DateRangeInputContent$lambda$7$lambda$6$lambda$5 = DateRangeInputKt.DateRangeInputContent$lambda$7$lambda$6$lambda$5(myVar2, l, (Long) obj);
                                return DateRangeInputContent$lambda$7$lambda$6$lambda$5;
                        }
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            } else {
                myVar2 = myVar;
                z = true;
            }
            DateInputKt.m1849DateInputTextFieldxJ3Ic0Y(weight$default2, l2, (ky) rememberedValue4, calendarModel, ComposableLambdaKt.rememberComposableLambda(-882370893, z, new DateRangeInputKt$DateRangeInputContent$2$5(m2983getString2EP1pXo6, upperCase), composer2, 54), ComposableLambdaKt.rememberComposableLambda(1956183348, z, new DateRangeInputKt$DateRangeInputContent$2$6(upperCase), composer2, 54), m2085getEndDateInputJ2x2o4M, dateInputValidator2, dateInputFormat, locale2, datePickerColors, null, composer2, i5 | 1794048 | i7, i9 | 48);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            myVar2 = myVar;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new qk(l, l2, myVar2, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateRangeInputContent$lambda$7$lambda$4$lambda$3(my myVar, Long l, Long l2) {
        myVar.invoke(l2, l);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateRangeInputContent$lambda$7$lambda$6$lambda$5(my myVar, Long l, Long l2) {
        myVar.invoke(l, l2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateRangeInputContent$lambda$8(Long l, Long l2, my myVar, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i, Composer composer, int i2) {
        DateRangeInputContent(l, l2, myVar, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }
}
