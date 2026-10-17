package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import defpackage.iy;
import defpackage.k10;
import defpackage.ky;
import defpackage.oy;
import defpackage.w01;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerKt$YearPicker$1$1$1$1 implements oy {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ int $currentYear;
    final /* synthetic */ int $displayedYear;
    final /* synthetic */ ky $onYearSelected;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ k10 $yearRange;

    public DatePickerKt$YearPicker$1$1$1$1(k10 k10Var, CalendarModel calendarModel, int i, int i2, ky kyVar, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        this.$yearRange = k10Var;
        this.$calendarModel = calendarModel;
        this.$displayedYear = i;
        this.$currentYear = i2;
        this.$onYearSelected = kyVar;
        this.$selectableDates = selectableDates;
        this.$colors = datePickerColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(ky kyVar, int i) {
        kyVar.invoke(Integer.valueOf(i));
        return w01.a;
    }

    public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
        int i3;
        String str;
        Modifier modifier;
        boolean z;
        String str2;
        boolean z2;
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (!composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(674613074, i3, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2088)");
        }
        final int i4 = i + this.$yearRange.d;
        String localString$default = CalendarLocale_jvmKt.toLocalString$default(i4, 0, 0, false, this.$calendarModel.getLocale(), 7, null);
        Modifier.Companion companion = Modifier.Companion;
        DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
        Modifier m801requiredSizeVpY3zN4 = SizeKt.m801requiredSizeVpY3zN4(companion, datePickerModalTokens.m3221getSelectionYearContainerWidthD9Ej5fM(), datePickerModalTokens.m3220getSelectionYearContainerHeightD9Ej5fM());
        if (i4 == this.$displayedYear) {
            str = localString$default;
            modifier = m801requiredSizeVpY3zN4;
            z = true;
        } else {
            str = localString$default;
            modifier = m801requiredSizeVpY3zN4;
            z = false;
        }
        if (i4 == this.$currentYear) {
            str2 = str;
            z2 = true;
        } else {
            str2 = str;
            z2 = false;
        }
        boolean changed = composer.changed(this.$onYearSelected) | composer.changed(i4);
        final ky kyVar = this.$onYearSelected;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new iy() { // from class: androidx.compose.material3.y
                @Override // defpackage.iy
                public final Object invoke() {
                    w01 invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = DatePickerKt$YearPicker$1$1$1$1.invoke$lambda$1$lambda$0(ky.this, i4);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        boolean isSelectableYear = this.$selectableDates.isSelectableYear(i4);
        Strings.Companion companion2 = Strings.Companion;
        DatePickerKt.Year(str2, modifier, z, z2, (iy) rememberedValue, isSelectableYear, String.format(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_navigate_to_year_description), composer, 0), Arrays.copyOf(new Object[]{str2}, 1)), this.$colors, composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.oy
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return w01.a;
    }
}
