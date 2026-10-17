package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.iy;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$actionComposable$1 implements my {
    final /* synthetic */ long $actionColor;
    final /* synthetic */ String $actionLabel;
    final /* synthetic */ SnackbarData $snackbarData;

    public SnackbarKt$Snackbar$actionComposable$1(long j, SnackbarData snackbarData, String str) {
        this.$actionColor = j;
        this.$snackbarData = snackbarData;
        this.$actionLabel = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(SnackbarData snackbarData) {
        snackbarData.performAction();
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 1;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1378313599, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:211)");
        }
        ButtonColors m1669textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1669textButtonColorsro_MJ88(0L, this.$actionColor, 0L, 0L, composer, 24576, 13);
        boolean changed = composer.changed(this.$snackbarData);
        SnackbarData snackbarData = this.$snackbarData;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new c1(snackbarData, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        final String str = this.$actionLabel;
        ButtonKt.TextButton((iy) rememberedValue, null, false, null, m1669textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(521110564, true, new ny() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
            public final void invoke(RowScope rowScope, Composer composer2, int i3) {
                if (!composer2.shouldExecute((i3 & 17) != 16, i3 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(521110564, i3, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:214)");
                }
                TextKt.m2607TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.ny
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return w01.a;
            }
        }, composer, 54), composer, 805306368, 494);
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
