package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.bl;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableSingletons$RecomposerKt {
    public static final ComposableSingletons$RecomposerKt INSTANCE = new ComposableSingletons$RecomposerKt();

    /* renamed from: lambda$-1091980426, reason: not valid java name */
    private static my f98lambda$1091980426 = ComposableLambdaKt.composableLambdaInstance(-1091980426, false, new bl(13));

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda__1091980426$lambda$0(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091980426, i, -1, "androidx.compose.runtime.ComposableSingletons$RecomposerKt.lambda$-1091980426.<anonymous> (Recomposer.kt:469)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* renamed from: getLambda$-1091980426$runtime, reason: not valid java name */
    public final my m3835getLambda$1091980426$runtime() {
        return f98lambda$1091980426;
    }
}
