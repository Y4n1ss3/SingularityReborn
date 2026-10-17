package androidx.compose.ui.viewinterop;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidViewHolder$layoutNode$1$coreModifier$4 extends f30 implements ky {
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$4(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$this_run = androidViewHolder;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ky) obj);
        return w01.a;
    }

    public final void invoke(ky kyVar) {
        this.$this_run.bringIntoViewRequester = kyVar;
    }
}
