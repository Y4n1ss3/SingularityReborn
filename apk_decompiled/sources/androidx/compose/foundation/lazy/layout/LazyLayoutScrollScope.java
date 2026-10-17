package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyLayoutScrollScope extends ScrollScope {
    static /* synthetic */ int calculateDistanceTo$default(LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
            return 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyLayoutScrollScope.calculateDistanceTo(i, i2);
    }

    static /* synthetic */ void snapToItem$default(LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: snapToItem");
            return;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyLayoutScrollScope.snapToItem(i, i2);
    }

    int calculateDistanceTo(int i, int i2);

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    void snapToItem(int i, int i2);
}
