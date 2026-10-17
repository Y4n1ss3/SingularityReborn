package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@LayoutScopeMarker
@er
/* loaded from: classes.dex */
public interface ContextualFlowColumnScope extends ColumnScope {
    static /* synthetic */ Modifier fillMaxColumnWidth$default(ContextualFlowColumnScope contextualFlowColumnScope, Modifier modifier, float f, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: fillMaxColumnWidth");
            return null;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return contextualFlowColumnScope.fillMaxColumnWidth(modifier, f);
    }

    Modifier fillMaxColumnWidth(Modifier modifier, float f);

    int getIndexInLine();

    int getLineIndex();

    /* renamed from: getMaxHeightInLine-D9Ej5fM, reason: not valid java name */
    float mo680getMaxHeightInLineD9Ej5fM();

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    float mo681getMaxWidthD9Ej5fM();
}
