package androidx.compose.material3;

import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ AppBarMenuState e;

    public /* synthetic */ b(AppBarMenuState appBarMenuState, int i) {
        this.d = i;
        this.e = appBarMenuState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 invoke$lambda$2$lambda$1$lambda$0;
        w01 invoke$lambda$2$lambda$1$lambda$02;
        int i = this.d;
        AppBarMenuState appBarMenuState = this.e;
        switch (i) {
            case 0:
                invoke$lambda$2$lambda$1$lambda$0 = AppBarColumnKt$AppBarColumn$2.invoke$lambda$2$lambda$1$lambda$0(appBarMenuState);
                return invoke$lambda$2$lambda$1$lambda$0;
            default:
                invoke$lambda$2$lambda$1$lambda$02 = AppBarRowKt$AppBarRow$2.invoke$lambda$2$lambda$1$lambda$0(appBarMenuState);
                return invoke$lambda$2$lambda$1$lambda$02;
        }
    }
}
