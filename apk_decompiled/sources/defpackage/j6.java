package defpackage;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class j6 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider e;
    public final /* synthetic */ TextContextMenuDataProvider f;

    public /* synthetic */ j6(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider, int i) {
        this.d = i;
        this.e = androidTextContextMenuToolbarProvider;
        this.f = textContextMenuDataProvider;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        TextContextMenuData observeAndGetData;
        Rect observeAndGetBounds;
        Rect observeAndGetBounds$lambda$0;
        int i = this.d;
        TextContextMenuDataProvider textContextMenuDataProvider = this.f;
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.e;
        switch (i) {
            case 0:
                observeAndGetData = androidTextContextMenuToolbarProvider.observeAndGetData(textContextMenuDataProvider);
                return observeAndGetData;
            case 1:
                observeAndGetBounds = androidTextContextMenuToolbarProvider.observeAndGetBounds(textContextMenuDataProvider);
                return observeAndGetBounds;
            default:
                observeAndGetBounds$lambda$0 = AndroidTextContextMenuToolbarProvider.observeAndGetBounds$lambda$0(androidTextContextMenuToolbarProvider, textContextMenuDataProvider);
                return observeAndGetBounds$lambda$0;
        }
    }
}
