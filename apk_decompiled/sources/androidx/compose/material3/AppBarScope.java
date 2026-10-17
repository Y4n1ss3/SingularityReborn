package androidx.compose.material3;

import defpackage.iy;
import defpackage.ky;
import defpackage.lu0;
import defpackage.my;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface AppBarScope {
    static /* synthetic */ void clickableItem$default(AppBarScope appBarScope, iy iyVar, my myVar, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: clickableItem");
            return;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        appBarScope.clickableItem(iyVar, myVar, str, z);
    }

    static /* synthetic */ void toggleableItem$default(AppBarScope appBarScope, boolean z, ky kyVar, my myVar, String str, boolean z2, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: toggleableItem");
            return;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        appBarScope.toggleableItem(z, kyVar, myVar, str, z2);
    }

    void clickableItem(iy iyVar, my myVar, String str, boolean z);

    void customItem(my myVar, ny nyVar);

    void toggleableItem(boolean z, ky kyVar, my myVar, String str, boolean z2);
}
