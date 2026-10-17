package defpackage;

import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class yb0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ DrawerState f;
    public final /* synthetic */ un g;

    public /* synthetic */ yb0(String str, DrawerState drawerState, un unVar, int i) {
        this.d = i;
        this.e = str;
        this.f = drawerState;
        this.g = unVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21;
        w01 DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32;
        int i = this.d;
        un unVar = this.g;
        DrawerState drawerState = this.f;
        String str = this.e;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21(str, drawerState, unVar, semanticsPropertyReceiver);
                return ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21;
            default:
                DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32(str, drawerState, unVar, semanticsPropertyReceiver);
                return DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32;
        }
    }
}
