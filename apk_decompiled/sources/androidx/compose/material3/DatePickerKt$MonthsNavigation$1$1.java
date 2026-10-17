package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerKt$MonthsNavigation$1$1 implements my {
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ String $yearPickerText;

    public DatePickerKt$MonthsNavigation$1$1(String str, DatePickerColors datePickerColors) {
        this.$yearPickerText = str;
        this.$colors = datePickerColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6846setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m6820getPolite0phEisY());
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 1;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(619076006, i, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2204)");
        }
        String str = this.$yearPickerText;
        Modifier.Companion companion = Modifier.Companion;
        boolean changed = composer.changed(str);
        String str2 = this.$yearPickerText;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new s(str2, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        TextKt.m2607TextNvy7gAk(str, SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue, 1, null), this.$colors.m1866getNavigationContentColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262136);
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
