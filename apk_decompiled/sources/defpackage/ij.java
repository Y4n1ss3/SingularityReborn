package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ij implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ ContextMenuState e;

    public /* synthetic */ ij(ContextMenuState contextMenuState, int i) {
        this.d = i;
        this.e = contextMenuState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 CommonContextMenuArea$lambda$2$0;
        w01 CommonContextMenuArea$lambda$13$0;
        w01 CommonContextMenuArea$lambda$9$0;
        int i = this.d;
        ContextMenuState contextMenuState = this.e;
        switch (i) {
            case 0:
                CommonContextMenuArea$lambda$2$0 = CommonContextMenuAreaKt.CommonContextMenuArea$lambda$2$0(contextMenuState);
                return CommonContextMenuArea$lambda$2$0;
            case 1:
                CommonContextMenuArea$lambda$13$0 = CommonContextMenuAreaKt.CommonContextMenuArea$lambda$13$0(contextMenuState);
                return CommonContextMenuArea$lambda$13$0;
            default:
                CommonContextMenuArea$lambda$9$0 = CommonContextMenuAreaKt.CommonContextMenuArea$lambda$9$0(contextMenuState);
                return CommonContextMenuArea$lambda$9$0;
        }
    }
}
