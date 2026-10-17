package androidx.compose.material3;

import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppBarColumnScopeImpl implements AppBarColumnScope, AppBarScope, AppBarItemProvider {
    private final AppBarScopeImpl impl;

    public AppBarColumnScopeImpl(AppBarScopeImpl appBarScopeImpl) {
        this.impl = appBarScopeImpl;
    }

    @Override // androidx.compose.material3.AppBarScope
    public void clickableItem(iy iyVar, my myVar, String str, boolean z) {
        this.impl.clickableItem(iyVar, myVar, str, z);
    }

    @Override // androidx.compose.material3.AppBarScope
    public void customItem(my myVar, ny nyVar) {
        this.impl.customItem(myVar, nyVar);
    }

    public final AppBarScopeImpl getImpl() {
        return this.impl;
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public List<AppBarItem> getItems() {
        return this.impl.getItems();
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public int getItemsCount() {
        return this.impl.getItemsCount();
    }

    @Override // androidx.compose.material3.AppBarScope
    public void toggleableItem(boolean z, ky kyVar, my myVar, String str, boolean z2) {
        this.impl.toggleableItem(z, kyVar, myVar, str, z2);
    }
}
