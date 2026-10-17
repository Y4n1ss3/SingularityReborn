package androidx.compose.ui.layout;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface LayoutInfo {
    LayoutCoordinates getCoordinates();

    Density getDensity();

    int getHeight();

    LayoutDirection getLayoutDirection();

    List<ModifierInfo> getModifierInfo();

    LayoutInfo getParentInfo();

    int getSemanticsId();

    ViewConfiguration getViewConfiguration();

    int getWidth();

    boolean isAttached();

    default boolean isDeactivated() {
        return false;
    }

    boolean isPlaced();
}
