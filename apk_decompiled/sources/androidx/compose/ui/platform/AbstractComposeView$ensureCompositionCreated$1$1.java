package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AbstractComposeView$ensureCompositionCreated$1$1 extends f30 implements my {
    final /* synthetic */ AbstractComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractComposeView$ensureCompositionCreated$1$1(AbstractComposeView abstractComposeView) {
        super(2);
        this.this$0 = abstractComposeView;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1003123809, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous>.<anonymous> (ComposeView.android.kt:340)");
        }
        this.this$0.Content(composer, 0);
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
