package androidx.compose.ui.window;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PopupLayout$Companion$onCommitAffectingPopupPosition$1 extends f30 implements ky {
    public static final PopupLayout$Companion$onCommitAffectingPopupPosition$1 INSTANCE = new PopupLayout$Companion$onCommitAffectingPopupPosition$1();

    public PopupLayout$Companion$onCommitAffectingPopupPosition$1() {
        super(1);
    }

    public final void invoke(PopupLayout popupLayout) {
        if (popupLayout.isAttachedToWindow()) {
            popupLayout.updatePosition();
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PopupLayout) obj);
        return w01.a;
    }
}
