package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AbstractComposeView;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ AbstractComposeView f;

    public /* synthetic */ i0(AbstractComposeView abstractComposeView, int i, int i2) {
        this.d = i2;
        this.f = abstractComposeView;
        this.e = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Content$lambda$0;
        w01 Content$lambda$02;
        int i = this.d;
        int i2 = this.e;
        AbstractComposeView abstractComposeView = this.f;
        switch (i) {
            case 0:
                Content$lambda$0 = ModalBottomSheetDialogLayout.Content$lambda$0((ModalBottomSheetDialogLayout) abstractComposeView, i2, (Composer) obj, ((Integer) obj2).intValue());
                return Content$lambda$0;
            default:
                Content$lambda$02 = ModalWideNavigationRailDialogLayout.Content$lambda$0((ModalWideNavigationRailDialogLayout) abstractComposeView, i2, (Composer) obj, ((Integer) obj2).intValue());
                return Content$lambda$02;
        }
    }
}
