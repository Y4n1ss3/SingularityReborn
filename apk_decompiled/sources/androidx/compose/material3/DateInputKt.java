package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import defpackage.bp;
import defpackage.dq;
import defpackage.ds0;
import defpackage.i3;
import defpackage.iy;
import defpackage.k10;
import defpackage.ky;
import defpackage.mk;
import defpackage.my;
import defpackage.w01;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateInputKt {
    private static final PaddingValues InputTextFieldPadding = PaddingKt.m759PaddingValuesa9UjIt4$default(Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(10.0f), Dp.m7611constructorimpl(24.0f), 0.0f, 8, null);
    private static final float InputTextNonErroneousBottomPadding = Dp.m7611constructorimpl(16.0f);

    public static final void DateInputContent(Long l, ky kyVar, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        k10 k10Var2;
        SelectableDates selectableDates2;
        Composer composer2;
        int i3;
        DateInputFormat dateInputFormat;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-432341251);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            k10Var2 = k10Var;
            i2 |= startRestartGroup.changedInstance(k10Var2) ? Fields.CameraDistance : Fields.RotationZ;
        } else {
            k10Var2 = k10Var;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & Fields.CompositingStrategy) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            selectableDates2 = selectableDates;
            i2 |= startRestartGroup.changed(selectableDates2) ? Fields.RenderEffect : 65536;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(focusRequester) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-432341251, i2, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:67)");
            }
            boolean changed = startRestartGroup.changed(calendarModel.getLocale());
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = calendarModel.getDateInputFormat(calendarModel.getLocale());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) rememberedValue;
            Strings.Companion companion = Strings.Companion;
            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_invalid_for_pattern), startRestartGroup, 0);
            String m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_invalid_year_range), startRestartGroup, 0);
            String m2983getString2EP1pXo3 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_invalid_not_allowed), startRestartGroup, 0);
            boolean changed2 = startRestartGroup.changed(dateInputFormat2) | ((i2 & 57344) == 16384 || ((i2 & Fields.CompositingStrategy) != 0 && startRestartGroup.changed(datePickerFormatter)));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                i3 = i2;
                dateInputFormat = dateInputFormat2;
                i4 = 0;
                DateInputValidator dateInputValidator = new DateInputValidator(k10Var2, selectableDates2, dateInputFormat, datePickerFormatter, m2983getString2EP1pXo, m2983getString2EP1pXo2, m2983getString2EP1pXo3, "");
                startRestartGroup.updateRememberedValue(dateInputValidator);
                rememberedValue2 = dateInputValidator;
            } else {
                i3 = i2;
                dateInputFormat = dateInputFormat2;
                i4 = 0;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) rememberedValue2;
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String m2983getString2EP1pXo4 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_label), startRestartGroup, i4);
            Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), InputTextFieldPadding);
            int m2086getSingleDateInputJ2x2o4M = InputIdentifier.Companion.m2086getSingleDateInputJ2x2o4M();
            dateInputValidator2.setCurrentStartDateMillis(l);
            int i5 = i3 << 3;
            composer2 = startRestartGroup;
            DateInputFormat dateInputFormat3 = dateInputFormat;
            m1849DateInputTextFieldxJ3Ic0Y(padding, l, kyVar, calendarModel, ComposableLambdaKt.rememberComposableLambda(-752164549, true, new DateInputKt$DateInputContent$2(m2983getString2EP1pXo4, upperCase), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1179434278, true, new DateInputKt$DateInputContent$3(upperCase), startRestartGroup, 54), m2086getSingleDateInputJ2x2o4M, dateInputValidator2, dateInputFormat3, calendarModel.getLocale(), datePickerColors, focusRequester, composer2, (i5 & 7168) | (i5 & 112) | 1794054 | (i5 & 896), (i3 >> 18) & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new mk(l, kyVar, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateInputContent$lambda$3(Long l, ky kyVar, CalendarModel calendarModel, k10 k10Var, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i, Composer composer, int i2) {
        DateInputContent(l, kyVar, calendarModel, k10Var, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* renamed from: DateInputTextField-xJ3Ic0Y, reason: not valid java name */
    public static final void m1849DateInputTextFieldxJ3Ic0Y(final Modifier modifier, Long l, final ky kyVar, final CalendarModel calendarModel, final my myVar, final my myVar2, final int i, final DateInputValidator dateInputValidator, final DateInputFormat dateInputFormat, final Locale locale, final DatePickerColors datePickerColors, final FocusRequester focusRequester, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        int i6;
        int i7;
        MutableState mutableState;
        float m7611constructorimpl;
        boolean z;
        Object obj;
        final DateInputFormat dateInputFormat2;
        int i8;
        Object dateInputKt$DateInputTextField$5$1;
        Long l2 = l;
        final CalendarModel calendarModel2 = calendarModel;
        final Locale locale2 = locale;
        Composer startRestartGroup = composer.startRestartGroup(1456309913);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(calendarModel2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar) ? Fields.Clip : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar2) ? Fields.RenderEffect : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(i) ? 1048576 : Fields.BlendMode;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changed(dateInputValidator) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= startRestartGroup.changed(dateInputFormat) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changedInstance(locale2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        int i9 = i5;
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i9 & 19) == 18) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1456309913, i4, i9, "androidx.compose.material3.DateInputTextField (DateInput.kt:128)");
            }
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.Companion.getSaver();
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            int i10 = i4;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new defpackage.e1(18);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, startRestartGroup, 384);
            Object[] objArr2 = {DateInputTextField_xJ3Ic0Y$lambda$6(rememberSaveable)};
            int i11 = i10 & 29360128;
            int i12 = i10 & 234881024;
            int i13 = i10 & 3670016;
            boolean changed = startRestartGroup.changed(rememberSaveable) | (i11 == 8388608) | startRestartGroup.changedInstance(calendarModel2) | (i12 == 67108864) | startRestartGroup.changedInstance(locale2) | (i13 == 1048576);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                i6 = i10;
                i7 = i11;
                rememberedValue2 = new bp(dateInputValidator, calendarModel2, dateInputFormat, locale2, i, rememberSaveable);
                mutableState = rememberSaveable;
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                mutableState = rememberSaveable;
                i6 = i10;
                i7 = i11;
            }
            final MutableState mutableState2 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (iy) rememberedValue2, startRestartGroup, 0);
            if (ds0.n0((CharSequence) mutableState2.getValue())) {
                m7611constructorimpl = InputTextNonErroneousBottomPadding;
            } else {
                PaddingValues m2583supportingTextPaddinga9UjIt4$material3$default = TextFieldDefaults.m2583supportingTextPaddinga9UjIt4$material3$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                m7611constructorimpl = Dp.m7611constructorimpl(InputTextNonErroneousBottomPadding - Dp.m7611constructorimpl(m2583supportingTextPaddinga9UjIt4$material3$default.mo714calculateTopPaddingD9Ej5fM() + m2583supportingTextPaddinga9UjIt4$material3$default.mo711calculateBottomPaddingD9Ej5fM()));
            }
            float f = m7611constructorimpl;
            TextFieldValue DateInputTextField_xJ3Ic0Y$lambda$6 = DateInputTextField_xJ3Ic0Y$lambda$6(mutableState);
            boolean changed2 = (i13 == 1048576) | (i12 == 67108864) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2) | ((i6 & 896) == 256) | startRestartGroup.changedInstance(calendarModel2) | startRestartGroup.changedInstance(locale2) | (i7 == 8388608);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                z = 67108864;
                dateInputFormat2 = dateInputFormat;
                final MutableState mutableState3 = mutableState;
                i8 = i6;
                obj = new ky() { // from class: cp
                    @Override // defpackage.ky
                    public final Object invoke(Object obj2) {
                        w01 DateInputTextField_xJ3Ic0Y$lambda$12$lambda$11;
                        DateInputTextField_xJ3Ic0Y$lambda$12$lambda$11 = DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$12$lambda$11(DateInputFormat.this, mutableState2, kyVar, calendarModel2, locale2, dateInputValidator, i, mutableState3, (TextFieldValue) obj2);
                        return DateInputTextField_xJ3Ic0Y$lambda$12$lambda$11;
                    }
                };
                calendarModel2 = calendarModel2;
                locale2 = locale2;
                mutableState = mutableState3;
                startRestartGroup.updateRememberedValue(obj);
            } else {
                z = 67108864;
                obj = rememberedValue3;
                i8 = i6;
                dateInputFormat2 = dateInputFormat;
            }
            ky kyVar2 = (ky) obj;
            Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, f, 7, null);
            boolean changed3 = startRestartGroup.changed(mutableState2);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new i3(mutableState2, 7);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            OutlinedTextFieldKt.OutlinedTextField(DateInputTextField_xJ3Ic0Y$lambda$6, kyVar2, SemanticsModifierKt.semantics$default(m766paddingqDBjuR0$default, false, (ky) rememberedValue4, 1, null).then(focusRequester != null ? FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester) : Modifier.Companion), false, false, (TextStyle) null, myVar, myVar2, (my) null, (my) null, (my) null, (my) null, (my) ComposableLambdaKt.rememberComposableLambda(-357881838, true, new my() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$3
                public final void invoke(Composer composer3, int i14) {
                    Composer composer4 = composer3;
                    if (!composer4.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-357881838, i14, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:215)");
                    }
                    if (ds0.n0(mutableState2.getValue())) {
                        composer4.startReplaceGroup(-1548950640);
                    } else {
                        composer4.startReplaceGroup(-327061465);
                        TextKt.m2607TextNvy7gAk(mutableState2.getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
                        composer4 = composer3;
                    }
                    composer4.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), !ds0.n0((CharSequence) mutableState2.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat2), new KeyboardOptions(0, Boolean.FALSE, KeyboardType.Companion.m7298getNumberPjHm6EE(), ImeAction.Companion.m7242getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 113, (dq) null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, datePickerColors.getDateTextFieldColors(), startRestartGroup, (i8 << 6) & 33030144, 12779904, 0, 4001592);
            composer2 = startRestartGroup;
            boolean z2 = (i9 & 112) == 32;
            Object rememberedValue5 = composer2.rememberedValue();
            if (z2 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new DateInputKt$DateInputTextField$4$1(focusRequester, null);
                composer2.updateRememberedValue(rememberedValue5);
            }
            EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue5, composer2, 6);
            boolean changedInstance = ((i8 & 112) == 32) | composer2.changedInstance(calendarModel2) | (i12 == 67108864) | composer2.changedInstance(locale2) | composer2.changed(mutableState);
            Object rememberedValue6 = composer2.rememberedValue();
            if (changedInstance || rememberedValue6 == companion.getEmpty()) {
                l2 = l;
                dateInputKt$DateInputTextField$5$1 = new DateInputKt$DateInputTextField$5$1(l2, calendarModel2, dateInputFormat2, locale, mutableState, null);
                composer2.updateRememberedValue(dateInputKt$DateInputTextField$5$1);
            } else {
                dateInputKt$DateInputTextField$5$1 = rememberedValue6;
                l2 = l;
            }
            EffectsKt.LaunchedEffect(l2, (my) dateInputKt$DateInputTextField$5$1, composer2, (i8 >> 3) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Long l3 = l2;
            endRestartGroup.updateScope(new my() { // from class: dp
                @Override // defpackage.my
                public final Object invoke(Object obj2, Object obj3) {
                    w01 DateInputTextField_xJ3Ic0Y$lambda$17;
                    int intValue = ((Integer) obj3).intValue();
                    DateInputTextField_xJ3Ic0Y$lambda$17 = DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$17(Modifier.this, l3, kyVar, calendarModel, myVar, myVar2, i, dateInputValidator, dateInputFormat, locale, datePickerColors, focusRequester, i2, i3, (Composer) obj2, intValue);
                    return DateInputTextField_xJ3Ic0Y$lambda$17;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateInputTextField_xJ3Ic0Y$lambda$12$lambda$11(DateInputFormat dateInputFormat, MutableState mutableState, ky kyVar, CalendarModel calendarModel, Locale locale, DateInputValidator dateInputValidator, int i, MutableState mutableState2, TextFieldValue textFieldValue) {
        if (textFieldValue.getText().length() <= dateInputFormat.getPatternWithoutDelimiters().length()) {
            String text = textFieldValue.getText();
            int i2 = 0;
            while (true) {
                if (i2 >= text.length()) {
                    mutableState2.setValue(textFieldValue);
                    String obj = ds0.E0(textFieldValue.getText()).toString();
                    Long l = null;
                    if (obj.length() != 0 && obj.length() >= dateInputFormat.getPatternWithoutDelimiters().length()) {
                        CalendarDate parse = calendarModel.parse(obj, dateInputFormat.getPatternWithoutDelimiters(), locale);
                        mutableState.setValue(dateInputValidator.m1850validateXivgLIo(parse, i, locale));
                        if (((CharSequence) mutableState.getValue()).length() == 0 && parse != null) {
                            l = Long.valueOf(parse.getUtcTimeMillis());
                        }
                        kyVar.invoke(l);
                    } else {
                        mutableState.setValue("");
                        kyVar.invoke(null);
                    }
                } else {
                    if (!Character.isDigit(text.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateInputTextField_xJ3Ic0Y$lambda$14$lambda$13(MutableState mutableState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!ds0.n0((CharSequence) mutableState.getValue())) {
            SemanticsPropertiesKt.error(semanticsPropertyReceiver, (String) mutableState.getValue());
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateInputTextField_xJ3Ic0Y$lambda$17(Modifier modifier, Long l, ky kyVar, CalendarModel calendarModel, my myVar, my myVar2, int i, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2, int i3, Composer composer, int i4) {
        m1849DateInputTextFieldxJ3Ic0Y(modifier, l, kyVar, calendarModel, myVar, myVar2, i, dateInputValidator, dateInputFormat, locale, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState DateInputTextField_xJ3Ic0Y$lambda$5$lambda$4() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (dq) null), null, 2, null);
    }

    private static final TextFieldValue DateInputTextField_xJ3Ic0Y$lambda$6(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState DateInputTextField_xJ3Ic0Y$lambda$9$lambda$8(DateInputValidator dateInputValidator, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale, int i, MutableState mutableState) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DateInputTextField_xJ3Ic0Y$lambda$6(mutableState).getText().length() > 0 ? dateInputValidator.m1850validateXivgLIo(calendarModel.parse(DateInputTextField_xJ3Ic0Y$lambda$6(mutableState).getText(), dateInputFormat.getPatternWithoutDelimiters(), locale), i, locale) : "", null, 2, null);
    }

    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }
}
