package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface IntrinsicMeasureScope extends Density {
    LayoutDirection getLayoutDirection();

    default boolean isLookingAhead() {
        return false;
    }
}
