package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.node.Owner;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CompositionLocalsKt$ProvideCommonCompositionLocals$1 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ my $content;
    final /* synthetic */ Owner $owner;
    final /* synthetic */ UriHandler $uriHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionLocalsKt$ProvideCommonCompositionLocals$1(Owner owner, UriHandler uriHandler, my myVar, int i) {
        super(2);
        this.$owner = owner;
        this.$uriHandler = uriHandler;
        this.$content = myVar;
        this.$$changed = i;
    }

    public final void invoke(Composer composer, int i) {
        CompositionLocalsKt.ProvideCommonCompositionLocals(this.$owner, this.$uriHandler, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
