package androidx.compose.foundation.lazy.staggeredgrid;

import defpackage.ky;
import defpackage.lu0;
import defpackage.ny;
import defpackage.oy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@LazyStaggeredGridScopeMarker
/* loaded from: classes.dex */
public interface LazyStaggeredGridScope {
    static /* synthetic */ void item$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, ny nyVar, int i, Object obj3) {
        if (obj3 != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: item");
            return;
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        if ((i & 4) != 0) {
            staggeredGridItemSpan = null;
        }
        lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, nyVar);
    }

    static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, int i, ky kyVar, ky kyVar2, ky kyVar3, oy oyVar, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: items");
            return;
        }
        if ((i2 & 2) != 0) {
            kyVar = null;
        }
        if ((i2 & 4) != 0) {
            kyVar2 = new ky() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$items$1
                @Override // defpackage.ky
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }

                public final Void invoke(int i3) {
                    return null;
                }
            };
        }
        if ((i2 & 8) != 0) {
            kyVar3 = null;
        }
        lazyStaggeredGridScope.items(i, kyVar, kyVar2, kyVar3, oyVar);
    }

    void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, ny nyVar);

    void items(int i, ky kyVar, ky kyVar2, ky kyVar3, oy oyVar);
}
