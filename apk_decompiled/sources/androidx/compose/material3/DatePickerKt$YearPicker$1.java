package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import defpackage.d10;
import defpackage.j10;
import defpackage.k10;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerKt$YearPicker$1 implements my {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ long $displayedMonthMillis;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ky $onYearSelected;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ k10 $yearRange;

    public DatePickerKt$YearPicker$1(CalendarModel calendarModel, long j, k10 k10Var, Modifier modifier, DatePickerColors datePickerColors, ky kyVar, SelectableDates selectableDates) {
        this.$calendarModel = calendarModel;
        this.$displayedMonthMillis = j;
        this.$yearRange = k10Var;
        this.$modifier = modifier;
        this.$colors = datePickerColors;
        this.$onYearSelected = kyVar;
        this.$selectableDates = selectableDates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final w01 invoke$lambda$1$lambda$0(k10 k10Var, CalendarModel calendarModel, int i, int i2, ky kyVar, SelectableDates selectableDates, DatePickerColors datePickerColors, LazyGridScope lazyGridScope) {
        int i3;
        k10Var.getClass();
        if (k10Var instanceof Collection) {
            i3 = ((Collection) k10Var).size();
        } else {
            Iterator it = k10Var.iterator();
            i3 = 0;
            while (((j10) it).f) {
                ((d10) it).next();
                i3++;
                if (i3 < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        LazyGridScope.items$default(lazyGridScope, i3, null, null, null, ComposableLambdaKt.composableLambdaInstance(674613074, true, new DatePickerKt$YearPicker$1$1$1$1(k10Var, calendarModel, i, i2, kyVar, selectableDates, datePickerColors)), 14, null);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        float f;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1301915789, i, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2070)");
        }
        CalendarModel calendarModel = this.$calendarModel;
        int year = calendarModel.getMonth(calendarModel.getToday()).getYear();
        int year2 = this.$calendarModel.getMonth(this.$displayedMonthMillis).getYear();
        LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - this.$yearRange.d) - 3), 0, composer, 0, 2);
        GridCells.Fixed fixed = new GridCells.Fixed(3);
        Modifier m227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(this.$modifier, this.$colors.m1853getContainerColor0d7_KjU(), null, 2, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
        f = DatePickerKt.YearsVerticalPadding;
        Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = arrangement.m647spacedBy0680j_4(f);
        boolean changedInstance = composer.changedInstance(this.$yearRange) | composer.changedInstance(this.$calendarModel) | composer.changed(year2) | composer.changed(year) | composer.changed(this.$onYearSelected) | composer.changed(this.$selectableDates) | composer.changed(this.$colors);
        k10 k10Var = this.$yearRange;
        CalendarModel calendarModel2 = this.$calendarModel;
        ky kyVar = this.$onYearSelected;
        SelectableDates selectableDates = this.$selectableDates;
        DatePickerColors datePickerColors = this.$colors;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            x xVar = new x(k10Var, calendarModel2, year2, year, kyVar, selectableDates, datePickerColors);
            composer.updateRememberedValue(xVar);
            rememberedValue = xVar;
        }
        LazyGridDslKt.LazyVerticalGrid(fixed, m227backgroundbw27NRU$default, rememberLazyGridState, null, false, m647spacedBy0680j_4, spaceEvenly, null, false, null, (ky) rememberedValue, composer, 1769472, 0, 920);
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
