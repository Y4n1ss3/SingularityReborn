package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableSingletons$SearchBarKt {
    public static final ComposableSingletons$SearchBarKt INSTANCE = new ComposableSingletons$SearchBarKt();
    private static my lambda$1165377840 = ComposableLambdaKt.composableLambdaInstance(1165377840, false, new my() { // from class: androidx.compose.material3.ComposableSingletons$SearchBarKt$lambda$1165377840$1
        public final void invoke(Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1165377840, i, -1, "androidx.compose.material3.ComposableSingletons$SearchBarKt.lambda$1165377840.<anonymous> (SearchBar.kt:2125)");
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
    });

    /* renamed from: lambda$-1146652811, reason: not valid java name */
    private static my f89lambda$1146652811 = ComposableLambdaKt.composableLambdaInstance(-1146652811, false, new my() { // from class: androidx.compose.material3.ComposableSingletons$SearchBarKt$lambda$-1146652811$1
        public final void invoke(Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1146652811, i, -1, "androidx.compose.material3.ComposableSingletons$SearchBarKt.lambda$-1146652811.<anonymous> (SearchBar.kt:2474)");
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
    });

    /* renamed from: getLambda$-1146652811$material3, reason: not valid java name */
    public final my m1839getLambda$1146652811$material3() {
        return f89lambda$1146652811;
    }

    public final my getLambda$1165377840$material3() {
        return lambda$1165377840;
    }
}
