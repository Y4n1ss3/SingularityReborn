package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda$-1759434350$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$Wrapper_androidKt$lambda$1759434350$1 extends f30 implements my {
    public static final ComposableSingletons$Wrapper_androidKt$lambda$1759434350$1 INSTANCE = new ComposableSingletons$Wrapper_androidKt$lambda$1759434350$1();

    public ComposableSingletons$Wrapper_androidKt$lambda$1759434350$1() {
        super(2);
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1759434350, i, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda$-1759434350.<anonymous> (Wrapper.android.kt:103)");
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
