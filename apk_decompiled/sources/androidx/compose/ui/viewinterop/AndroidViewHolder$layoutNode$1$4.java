package androidx.compose.ui.viewinterop;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidViewHolder$layoutNode$1$4 extends f30 implements ky {
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$4(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$this_run = androidViewHolder;
    }

    public final void invoke(Owner owner) {
        if (ComposeUiFlags.isViewFocusFixEnabled && this.$this_run.hasFocus()) {
            owner.getFocusOwner().clearFocus(true);
        }
        AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
        if (androidComposeView != null) {
            androidComposeView.removeAndroidView(this.$this_run);
        }
        this.$this_run.removeAllViewsInLayout();
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Owner) obj);
        return w01.a;
    }
}
