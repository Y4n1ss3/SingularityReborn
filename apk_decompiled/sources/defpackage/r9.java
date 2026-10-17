package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class r9 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ r9(boolean z, DrawerState drawerState, un unVar) {
        this.d = 2;
        this.e = z;
        this.g = drawerState;
        this.f = unVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 ModalNavigationDrawer_FHprtrg$lambda$24$lambda$14$lambda$13;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj = this.f;
        Object obj2 = this.g;
        boolean z = this.e;
        switch (i) {
            case 0:
                un unVar = (un) obj;
                Context context = (Context) obj2;
                if (z) {
                    p01.t(unVar, null, null, new z9(2, 3, null), 3);
                } else {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:com.android.settings"));
                    intent.setPackage("com.android.settings");
                    intent.addFlags(402653184);
                    context.startActivity(intent);
                }
                return w01Var;
            case 1:
                ky kyVar = (ky) obj;
                MutableState mutableState = (MutableState) obj2;
                if (z) {
                    kyVar.invoke(null);
                } else {
                    mutableState.setValue(Boolean.TRUE);
                }
                return w01Var;
            default:
                ModalNavigationDrawer_FHprtrg$lambda$24$lambda$14$lambda$13 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$14$lambda$13(z, (DrawerState) obj2, (un) obj);
                return ModalNavigationDrawer_FHprtrg$lambda$24$lambda$14$lambda$13;
        }
    }

    public /* synthetic */ r9(int i, Object obj, boolean z, Object obj2) {
        this.d = i;
        this.e = z;
        this.f = obj;
        this.g = obj2;
    }
}
