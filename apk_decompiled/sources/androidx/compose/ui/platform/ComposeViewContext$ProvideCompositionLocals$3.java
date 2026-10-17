package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ComposeViewContext$ProvideCompositionLocals$3 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ my $content;
    final /* synthetic */ AndroidComposeView $owner;
    final /* synthetic */ ComposeViewContext $tmp4_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewContext$ProvideCompositionLocals$3(ComposeViewContext composeViewContext, AndroidComposeView androidComposeView, my myVar, int i) {
        super(2);
        this.$tmp4_rcvr = composeViewContext;
        this.$owner = androidComposeView;
        this.$content = myVar;
        this.$$changed = i;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp4_rcvr.ProvideCompositionLocals$ui(this.$owner, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
