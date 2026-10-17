package androidx.compose.material3;

import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerKt$DisplayModeToggleButton$1 implements my {
    final /* synthetic */ int $displayMode;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ky $onDisplayModeChange;

    public DatePickerKt$DisplayModeToggleButton$1(int i, ky kyVar, Modifier modifier) {
        this.$displayMode = i;
        this.$onDisplayModeChange = kyVar;
        this.$modifier = modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(ky kyVar) {
        kyVar.invoke(DisplayMode.m1923boximpl(DisplayMode.Companion.m1930getInputjFl4v0()));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$3$lambda$2(ky kyVar) {
        kyVar.invoke(DisplayMode.m1923boximpl(DisplayMode.Companion.m1931getPickerjFl4v0()));
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        final int i2 = 1;
        final int i3 = 0;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1734512197, i, -1, "androidx.compose.material3.DisplayModeToggleButton.<anonymous> (DatePicker.kt:1408)");
        }
        if (DisplayMode.m1926equalsimpl0(this.$displayMode, DisplayMode.Companion.m1931getPickerjFl4v0())) {
            composer.startReplaceGroup(-101264927);
            ImageVector edit$material3 = Icons.Filled.INSTANCE.getEdit$material3();
            Strings.Companion companion = Strings.Companion;
            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_switch_to_input_mode), composer, 0);
            boolean changed = composer.changed(this.$onDisplayModeChange);
            final ky kyVar = this.$onDisplayModeChange;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new iy() { // from class: androidx.compose.material3.u
                    @Override // defpackage.iy
                    public final Object invoke() {
                        w01 invoke$lambda$1$lambda$0;
                        w01 invoke$lambda$3$lambda$2;
                        int i4 = i3;
                        ky kyVar2 = kyVar;
                        switch (i4) {
                            case 0:
                                invoke$lambda$1$lambda$0 = DatePickerKt$DisplayModeToggleButton$1.invoke$lambda$1$lambda$0(kyVar2);
                                return invoke$lambda$1$lambda$0;
                            default:
                                invoke$lambda$3$lambda$2 = DatePickerKt$DisplayModeToggleButton$1.invoke$lambda$3$lambda$2(kyVar2);
                                return invoke$lambda$3$lambda$2;
                        }
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            DatePickerKt.IconButtonWithTooltip((iy) rememberedValue, edit$material3, m2983getString2EP1pXo, this.$modifier, false, composer, 0, 16);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-100967048);
            ImageVector dateRange$material3 = Icons.Filled.INSTANCE.getDateRange$material3();
            Strings.Companion companion2 = Strings.Companion;
            String m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_switch_to_calendar_mode), composer, 0);
            boolean changed2 = composer.changed(this.$onDisplayModeChange);
            final ky kyVar2 = this.$onDisplayModeChange;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new iy() { // from class: androidx.compose.material3.u
                    @Override // defpackage.iy
                    public final Object invoke() {
                        w01 invoke$lambda$1$lambda$0;
                        w01 invoke$lambda$3$lambda$2;
                        int i4 = i2;
                        ky kyVar22 = kyVar2;
                        switch (i4) {
                            case 0:
                                invoke$lambda$1$lambda$0 = DatePickerKt$DisplayModeToggleButton$1.invoke$lambda$1$lambda$0(kyVar22);
                                return invoke$lambda$1$lambda$0;
                            default:
                                invoke$lambda$3$lambda$2 = DatePickerKt$DisplayModeToggleButton$1.invoke$lambda$3$lambda$2(kyVar22);
                                return invoke$lambda$3$lambda$2;
                        }
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            DatePickerKt.IconButtonWithTooltip((iy) rememberedValue2, dateRange$material3, m2983getString2EP1pXo2, this.$modifier, false, composer, 0, 16);
            composer.endReplaceGroup();
        }
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
