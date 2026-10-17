package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateRangePickerKt$DateRangePicker$5 implements my {
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DateRangePickerState $state;

    public DateRangePickerKt$DateRangePicker$5(DateRangePickerState dateRangePickerState, DatePickerColors datePickerColors) {
        this.$state = dateRangePickerState;
        this.$colors = datePickerColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(DateRangePickerState dateRangePickerState, DisplayMode displayMode) {
        dateRangePickerState.mo1910setDisplayModevCnGnXg(displayMode.m1929unboximpl());
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 0;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1343236786, i, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:139)");
        }
        Modifier padding = PaddingKt.padding(Modifier.Companion, DatePickerKt.getDatePickerModeTogglePadding());
        int mo1909getDisplayModejFl4v0 = this.$state.mo1909getDisplayModejFl4v0();
        boolean changed = composer.changed(this.$state);
        DateRangePickerState dateRangePickerState = this.$state;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new z(dateRangePickerState, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        DatePickerKt.m1886DisplayModeToggleButtoniUJLfQg(padding, mo1909getDisplayModejFl4v0, (ky) rememberedValue, this.$colors, composer, 6);
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
