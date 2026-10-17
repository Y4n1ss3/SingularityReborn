package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();

    /* renamed from: lambda$-1548712596, reason: not valid java name */
    private static ny f90lambda$1548712596 = ComposableLambdaKt.composableLambdaInstance(-1548712596, false, new ny() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda$-1548712596$1
        public final void invoke(SnackbarData snackbarData, Composer composer, int i) {
            SnackbarData snackbarData2;
            int i2;
            if ((i & 6) == 0) {
                snackbarData2 = snackbarData;
                i2 = i | (composer.changed(snackbarData2) ? 4 : 2);
            } else {
                snackbarData2 = snackbarData;
                i2 = i;
            }
            if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1548712596, i2, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda$-1548712596.<anonymous> (SnackbarHost.kt:219)");
            }
            SnackbarKt.m2450SnackbarsDKtq54(snackbarData2, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i2 & 14, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // defpackage.ny
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((SnackbarData) obj, (Composer) obj2, ((Number) obj3).intValue());
            return w01.a;
        }
    });

    /* renamed from: getLambda$-1548712596$material3, reason: not valid java name */
    public final ny m1840getLambda$1548712596$material3() {
        return f90lambda$1548712596;
    }
}
