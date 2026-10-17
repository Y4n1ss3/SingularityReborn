package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class k6 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider e;

    public /* synthetic */ k6(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, int i) {
        this.d = i;
        this.e = androidTextContextMenuToolbarProvider;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 snapshotStateObserver$lambda$0;
        w01 onDataChange$lambda$0;
        w01 onPositionChange$lambda$0;
        DisposableEffectResult platformTextContextMenuToolbarProvider$lambda$1$0;
        int i = this.d;
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.e;
        switch (i) {
            case 0:
                snapshotStateObserver$lambda$0 = AndroidTextContextMenuToolbarProvider.snapshotStateObserver$lambda$0(androidTextContextMenuToolbarProvider, (iy) obj);
                return snapshotStateObserver$lambda$0;
            case 1:
                onDataChange$lambda$0 = AndroidTextContextMenuToolbarProvider.onDataChange$lambda$0(androidTextContextMenuToolbarProvider, obj);
                return onDataChange$lambda$0;
            case 2:
                onPositionChange$lambda$0 = AndroidTextContextMenuToolbarProvider.onPositionChange$lambda$0(androidTextContextMenuToolbarProvider, obj);
                return onPositionChange$lambda$0;
            default:
                platformTextContextMenuToolbarProvider$lambda$1$0 = AndroidTextContextMenuToolbarProvider_androidKt.platformTextContextMenuToolbarProvider$lambda$1$0(androidTextContextMenuToolbarProvider, (DisposableEffectScope) obj);
                return platformTextContextMenuToolbarProvider$lambda$1$0;
        }
    }
}
