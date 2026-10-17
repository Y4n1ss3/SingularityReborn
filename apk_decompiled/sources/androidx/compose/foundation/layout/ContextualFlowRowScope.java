package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@LayoutScopeMarker
@er
/* loaded from: classes.dex */
public interface ContextualFlowRowScope extends RowScope {
    static /* synthetic */ Modifier fillMaxRowHeight$default(ContextualFlowRowScope contextualFlowRowScope, Modifier modifier, float f, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
            return null;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return contextualFlowRowScope.fillMaxRowHeight(modifier, f);
    }

    Modifier fillMaxRowHeight(Modifier modifier, float f);

    int getIndexInLine();

    int getLineIndex();

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    float mo683getMaxHeightD9Ej5fM();

    /* renamed from: getMaxWidthInLine-D9Ej5fM, reason: not valid java name */
    float mo684getMaxWidthInLineD9Ej5fM();
}
