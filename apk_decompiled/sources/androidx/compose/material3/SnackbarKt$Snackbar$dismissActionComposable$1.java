package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.iy;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$dismissActionComposable$1 implements my {
    final /* synthetic */ SnackbarData $snackbarData;

    public SnackbarKt$Snackbar$dismissActionComposable$1(SnackbarData snackbarData) {
        this.$snackbarData = snackbarData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$1$lambda$0(SnackbarData snackbarData) {
        snackbarData.dismiss();
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 2;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1812633777, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:223)");
        }
        boolean changed = composer.changed(this.$snackbarData);
        SnackbarData snackbarData = this.$snackbarData;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new c1(snackbarData, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        IconButtonKt.IconButton((iy) rememberedValue, null, false, null, null, null, ComposableSingletons$SnackbarKt.INSTANCE.getLambda$984817901$material3(), composer, 1572864, 62);
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
