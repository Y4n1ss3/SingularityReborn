package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import defpackage.ky;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface ColumnScope {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Modifier weight$default(ColumnScope columnScope, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: weight");
            return null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return columnScope.weight(modifier, f, z);
    }

    Modifier align(Modifier modifier, Alignment.Horizontal horizontal);

    Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine);

    Modifier alignBy(Modifier modifier, ky kyVar);

    Modifier weight(Modifier modifier, float f, boolean z);
}
