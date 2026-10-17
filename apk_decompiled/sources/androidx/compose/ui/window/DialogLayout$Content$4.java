package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DialogLayout$Content$4 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DialogLayout $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogLayout$Content$4(DialogLayout dialogLayout, int i) {
        super(2);
        this.$tmp0_rcvr = dialogLayout;
        this.$$changed = i;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.Content(composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
