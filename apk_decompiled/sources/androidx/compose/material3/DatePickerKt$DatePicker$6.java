package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.focus.FocusRequester;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerKt$DatePicker$6 implements my {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ DatePickerState $state;

    public DatePickerKt$DatePicker$6(DatePickerState datePickerState, CalendarModel calendarModel, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, FocusRequester focusRequester) {
        this.$state = datePickerState;
        this.$calendarModel = calendarModel;
        this.$dateFormatter = datePickerFormatter;
        this.$colors = datePickerColors;
        this.$focusRequester = focusRequester;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(DatePickerState datePickerState, Long l) {
        datePickerState.setSelectedDateMillis(l);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$3$lambda$2(DatePickerState datePickerState, long j) {
        datePickerState.setDisplayedMonthMillis(j);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 1;
        int i3 = 2;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1346903698, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:220)");
        }
        Long selectedDateMillis = this.$state.getSelectedDateMillis();
        long displayedMonthMillis = this.$state.getDisplayedMonthMillis();
        int mo1891getDisplayModejFl4v0 = this.$state.mo1891getDisplayModejFl4v0();
        boolean changed = composer.changed(this.$state);
        DatePickerState datePickerState = this.$state;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new q(datePickerState, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        ky kyVar = (ky) rememberedValue;
        boolean changed2 = composer.changed(this.$state);
        DatePickerState datePickerState2 = this.$state;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new q(datePickerState2, i3);
            composer.updateRememberedValue(rememberedValue2);
        }
        DatePickerKt.m1887SwitchableDateEntryContentKaiTk9E(selectedDateMillis, displayedMonthMillis, mo1891getDisplayModejFl4v0, kyVar, (ky) rememberedValue2, this.$calendarModel, this.$state.getYearRange(), this.$dateFormatter, this.$state.getSelectableDates(), this.$colors, this.$focusRequester, composer, 0, 0);
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
