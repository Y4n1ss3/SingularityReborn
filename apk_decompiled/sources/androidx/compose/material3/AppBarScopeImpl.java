package androidx.compose.material3;

import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppBarScopeImpl implements AppBarScope, AppBarItemProvider {
    public static final int $stable = 8;
    private final List<AppBarItem> items = new ArrayList();

    @Override // androidx.compose.material3.AppBarScope
    public void clickableItem(iy iyVar, my myVar, String str, boolean z) {
        getItems().add(new ClickableAppBarItem(iyVar, myVar, z, str));
    }

    @Override // androidx.compose.material3.AppBarScope
    public void customItem(my myVar, ny nyVar) {
        getItems().add(new CustomAppBarItem(myVar, nyVar));
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public List<AppBarItem> getItems() {
        return this.items;
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public int getItemsCount() {
        return getItems().size();
    }

    @Override // androidx.compose.material3.AppBarScope
    public void toggleableItem(boolean z, ky kyVar, my myVar, String str, boolean z2) {
        getItems().add(new ToggleableAppBarItem(z, kyVar, myVar, z2, str));
    }
}
