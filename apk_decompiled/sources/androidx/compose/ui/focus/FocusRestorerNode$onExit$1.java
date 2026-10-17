package androidx.compose.ui.focus;

import androidx.compose.ui.ComposeUiFlags;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusRestorerNode$onExit$1 extends f30 implements ky {
    final /* synthetic */ FocusRestorerNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRestorerNode$onExit$1(FocusRestorerNode focusRestorerNode) {
        super(1);
        this.this$0 = focusRestorerNode;
    }

    public final void invoke(FocusEnterExitScope focusEnterExitScope) {
        if (ComposeUiFlags.isFocusRestorationEnabled) {
            return;
        }
        FocusRequesterModifierNodeKt.saveFocusedChild(this.this$0);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusEnterExitScope) obj);
        return w01.a;
    }
}
