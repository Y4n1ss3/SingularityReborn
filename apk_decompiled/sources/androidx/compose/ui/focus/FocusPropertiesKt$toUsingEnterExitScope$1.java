package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusRequester;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusPropertiesKt$toUsingEnterExitScope$1 extends f30 implements ky {
    final /* synthetic */ ky $this_toUsingEnterExitScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusPropertiesKt$toUsingEnterExitScope$1(ky kyVar) {
        super(1);
        this.$this_toUsingEnterExitScope = kyVar;
    }

    public final void invoke(FocusEnterExitScope focusEnterExitScope) {
        FocusRequester focusRequester = (FocusRequester) this.$this_toUsingEnterExitScope.invoke(FocusDirection.m4385boximpl(focusEnterExitScope.mo4384getRequestedFocusDirectiondhqQ8s()));
        FocusRequester.Companion companion = FocusRequester.Companion;
        if (focusRequester == companion.getCancel()) {
            focusEnterExitScope.cancelFocusChange();
        } else if (focusRequester != companion.getDefault()) {
            FocusRequester.m4419requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusEnterExitScope) obj);
        return w01.a;
    }
}
