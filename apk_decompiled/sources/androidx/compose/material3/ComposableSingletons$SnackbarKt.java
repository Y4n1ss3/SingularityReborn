package androidx.compose.material3;

import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableSingletons$SnackbarKt {
    public static final ComposableSingletons$SnackbarKt INSTANCE = new ComposableSingletons$SnackbarKt();
    private static my lambda$984817901 = ComposableLambdaKt.composableLambdaInstance(984817901, false, new my() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarKt$lambda$984817901$1
        public final void invoke(Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984817901, i, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda$984817901.<anonymous> (Snackbar.kt:226)");
            }
            ImageVector close$material3 = Icons.Filled.INSTANCE.getClose$material3();
            Strings.Companion companion = Strings.Companion;
            IconKt.m2055Iconww6aTOc(close$material3, Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_snackbar_dismiss), composer, 0), (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // defpackage.my
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return w01.a;
        }
    });

    public final my getLambda$984817901$material3() {
        return lambda$984817901;
    }
}
