package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface FlowRowScope extends RowScope {
    static /* synthetic */ Modifier fillMaxRowHeight$default(FlowRowScope flowRowScope, Modifier modifier, float f, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
            return null;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return flowRowScope.fillMaxRowHeight(modifier, f);
    }

    Modifier fillMaxRowHeight(Modifier modifier, float f);
}
