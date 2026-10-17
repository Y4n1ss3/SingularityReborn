package defpackage;

import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class xb0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ DrawerState e;
    public final /* synthetic */ un f;

    public /* synthetic */ xb0(DrawerState drawerState, un unVar, int i) {
        this.d = i;
        this.e = drawerState;
        this.f = unVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        boolean ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20;
        int i = this.d;
        un unVar = this.f;
        DrawerState drawerState = this.e;
        switch (i) {
            case 0:
                ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20(drawerState, unVar);
                break;
            default:
                ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32$lambda$31(drawerState, unVar);
                break;
        }
        return Boolean.valueOf(ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20);
    }
}
