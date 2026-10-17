package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import defpackage.lu0;
import defpackage.oy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TabIndicatorScope {
    static /* synthetic */ Modifier tabIndicatorOffset$default(TabIndicatorScope tabIndicatorScope, Modifier modifier, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: tabIndicatorOffset");
            return null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return tabIndicatorScope.tabIndicatorOffset(modifier, i, z);
    }

    Modifier tabIndicatorLayout(Modifier modifier, oy oyVar);

    Modifier tabIndicatorOffset(Modifier modifier, int i, boolean z);
}
