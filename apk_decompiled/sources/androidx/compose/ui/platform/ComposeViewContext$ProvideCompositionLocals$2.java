package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.MediaQueryKt;
import androidx.compose.ui.adaptive.MediaQuery_androidKt;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ComposeViewContext$ProvideCompositionLocals$2 extends f30 implements my {
    final /* synthetic */ my $content;
    final /* synthetic */ AndroidComposeView $owner;
    final /* synthetic */ ComposeViewContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewContext$ProvideCompositionLocals$2(AndroidComposeView androidComposeView, ComposeViewContext composeViewContext, my myVar) {
        super(2);
        this.$owner = androidComposeView;
        this.this$0 = composeViewContext;
        this.$content = myVar;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1317454175, i, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals.<anonymous> (ComposeViewContext.android.kt:436)");
        }
        if (ComposeUiFlags.isMediaQueryIntegrationEnabled) {
            composer.startReplaceGroup(866239106);
            CompositionLocalKt.CompositionLocalProvider(MediaQueryKt.getLocalUiMediaScope().provides(MediaQuery_androidKt.obtainUiMediaScope(this.$owner.getContext(), this.$owner.getView(), this.$owner.getWindowInfo(), composer, 0)), ComposableLambdaKt.rememberComposableLambda(-1423844166, true, new AnonymousClass1(this.$owner, this.this$0, this.$content), composer, 54), composer, ProvidedValue.$stable | 48);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(866651995);
            CompositionLocalsKt.ProvideCommonCompositionLocals(this.$owner, this.this$0.getUriHandler$ui(), this.$content, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements my {
        final /* synthetic */ my $content;
        final /* synthetic */ AndroidComposeView $owner;
        final /* synthetic */ ComposeViewContext this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidComposeView androidComposeView, ComposeViewContext composeViewContext, my myVar) {
            super(2);
            this.$owner = androidComposeView;
            this.this$0 = composeViewContext;
            this.$content = myVar;
        }

        public final void invoke(Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1423844166, i, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals.<anonymous>.<anonymous> (ComposeViewContext.android.kt:439)");
            }
            CompositionLocalsKt.ProvideCommonCompositionLocals(this.$owner, this.this$0.getUriHandler$ui(), this.$content, composer, 0);
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

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
