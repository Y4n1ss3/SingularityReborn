package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateInputKt$DateInputContent$2 implements my {
    final /* synthetic */ String $labelText;
    final /* synthetic */ String $pattern;

    public DateInputKt$DateInputContent$2(String str, String str2) {
        this.$labelText = str;
        this.$pattern = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(String str, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str + ", " + str2);
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 0;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-752164549, i, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:93)");
        }
        String str = this.$labelText;
        Modifier.Companion companion = Modifier.Companion;
        boolean changed = composer.changed(str) | composer.changed(this.$pattern);
        String str2 = this.$labelText;
        String str3 = this.$pattern;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new p(i2, str2, str3);
            composer.updateRememberedValue(rememberedValue);
        }
        TextKt.m2607TextNvy7gAk(str, SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262140);
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
