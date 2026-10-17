package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RulerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float mergeRulerValues(Placeable.PlacementScope placementScope, boolean z, Ruler[] rulerArr, float f) {
        float f2 = Float.NaN;
        for (Ruler ruler : rulerArr) {
            float current = placementScope.current(ruler, Float.NaN);
            if (!Float.isNaN(f2)) {
                int i = z != (current > f2) ? i + 1 : 0;
            }
            f2 = current;
        }
        return Float.isNaN(f2) ? f : f2;
    }
}
