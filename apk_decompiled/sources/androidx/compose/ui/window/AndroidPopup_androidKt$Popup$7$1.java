package androidx.compose.ui.window;

import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$Popup$7$1 extends f30 implements ky {
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$7$1(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        parentLayoutCoordinates.getClass();
        this.$popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return w01.a;
    }
}
