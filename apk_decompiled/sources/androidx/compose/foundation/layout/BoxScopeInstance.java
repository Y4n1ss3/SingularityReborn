package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoxScopeInstance implements BoxScope {
    public static final int $stable = 0;
    public static final BoxScopeInstance INSTANCE = new BoxScopeInstance();

    private BoxScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier modifier, Alignment alignment) {
        return modifier.then(new BoxChildDataElement(alignment, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new BoxScopeInstance$align$$inlined$debugInspectorInfo$1(alignment) : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier modifier) {
        return modifier.then(new BoxChildDataElement(Alignment.Companion.getCenter(), true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo()));
    }
}
