package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;

    public /* synthetic */ m0(int i, iy iyVar) {
        this.d = i;
        this.e = iyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$0;
        w01 invoke$lambda$02;
        int i = this.d;
        iy iyVar = this.e;
        Offset offset = (Offset) obj;
        switch (i) {
            case 0:
                invoke$lambda$0 = ModalBottomSheetKt$Scrim$dismissSheet$1$1.invoke$lambda$0(iyVar, offset);
                return invoke$lambda$0;
            default:
                invoke$lambda$02 = NavigationDrawerKt$Scrim$dismissDrawer$1$1.invoke$lambda$0(iyVar, offset);
                return invoke$lambda$02;
        }
    }
}
