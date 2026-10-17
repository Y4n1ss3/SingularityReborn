package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.my;
import defpackage.w01;
import defpackage.w4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableSingletons$CompositionKt {
    public static final ComposableSingletons$CompositionKt INSTANCE = new ComposableSingletons$CompositionKt();
    private static my lambda$954879418 = ComposableLambdaKt.composableLambdaInstance(954879418, false, new w4(24));
    private static my lambda$1918065384 = ComposableLambdaKt.composableLambdaInstance(1918065384, false, new w4(25));

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda_1918065384$lambda$0(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1918065384, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$1918065384.<anonymous> (Composition.kt:917)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda_954879418$lambda$0(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(954879418, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$954879418.<anonymous> (Composition.kt:680)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    public final my getLambda$1918065384$runtime() {
        return lambda$1918065384;
    }

    public final my getLambda$954879418$runtime() {
        return lambda$954879418;
    }
}
