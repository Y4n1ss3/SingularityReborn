package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1 implements my {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ List<CustomAccessibilityAction> $customAccessibilityAction;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ CalendarMonth $month;

    public DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1(DatePickerFormatter datePickerFormatter, CalendarMonth calendarMonth, CalendarModel calendarModel, List<CustomAccessibilityAction> list, DatePickerColors datePickerColors) {
        this.$dateFormatter = datePickerFormatter;
        this.$month = calendarMonth;
        this.$calendarModel = calendarModel;
        this.$customAccessibilityAction = list;
        this.$colors = datePickerColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(List list, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, list);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 1;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-577031469, i, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:858)");
        }
        String formatMonthYear = this.$dateFormatter.formatMonthYear(Long.valueOf(this.$month.getStartUtcTimeMillis()), this.$calendarModel.getLocale());
        if (formatMonthYear == null) {
            formatMonthYear = "-";
        }
        Modifier padding = PaddingKt.padding(Modifier.Companion, DateRangePickerKt.getCalendarMonthSubheadPadding());
        boolean changedInstance = composer.changedInstance(this.$customAccessibilityAction);
        List<CustomAccessibilityAction> list = this.$customAccessibilityAction;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new o(list, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        TextKt.m2607TextNvy7gAk(formatMonthYear, SemanticsModifierKt.semantics$default(padding, false, (ky) rememberedValue, 1, null), this.$colors.m1871getSubheadContentColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262136);
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
