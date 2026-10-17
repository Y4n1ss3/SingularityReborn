package androidx.compose.ui.window;

import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PopupLayout$canCalculatePosition$2 extends f30 implements iy {
    final /* synthetic */ PopupLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.this$0 = popupLayout;
    }

    @Override // defpackage.iy
    public final Boolean invoke() {
        LayoutCoordinates parentLayoutCoordinates;
        parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.isAttached()) {
            parentLayoutCoordinates = null;
        }
        return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m7877getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
