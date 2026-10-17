package androidx.compose.foundation.lazy.grid;

import defpackage.ky;
import defpackage.lu0;
import defpackage.my;
import defpackage.ny;
import defpackage.oy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@LazyGridScopeMarker
/* loaded from: classes.dex */
public interface LazyGridScope {
    static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, ky kyVar, Object obj2, ny nyVar, int i, Object obj3) {
        if (obj3 != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: item");
            return;
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            kyVar = null;
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        lazyGridScope.item(obj, kyVar, obj2, nyVar);
    }

    static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i, ky kyVar, my myVar, ky kyVar2, oy oyVar, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: items");
            return;
        }
        if ((i2 & 2) != 0) {
            kyVar = null;
        }
        if ((i2 & 4) != 0) {
            myVar = null;
        }
        if ((i2 & 8) != 0) {
            kyVar2 = new ky() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope$items$1
                @Override // defpackage.ky
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }

                public final Void invoke(int i3) {
                    return null;
                }
            };
        }
        lazyGridScope.items(i, kyVar, myVar, kyVar2, oyVar);
    }

    static /* synthetic */ void stickyHeader$default(LazyGridScope lazyGridScope, Object obj, Object obj2, oy oyVar, int i, Object obj3) {
        if (obj3 != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: stickyHeader");
            return;
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyGridScope.stickyHeader(obj, obj2, oyVar);
    }

    void item(Object obj, ky kyVar, Object obj2, ny nyVar);

    void items(int i, ky kyVar, my myVar, ky kyVar2, oy oyVar);

    void stickyHeader(Object obj, Object obj2, oy oyVar);
}
