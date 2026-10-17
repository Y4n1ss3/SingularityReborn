package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import defpackage.p01;
import defpackage.un;
import defpackage.y80;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ScrollableTabData {
    private final FiniteAnimationSpec<Float> animationSpec;
    private final un coroutineScope;
    private final ScrollState scrollState;
    private Integer selectedTab;

    public ScrollableTabData(ScrollState scrollState, un unVar, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.scrollState = scrollState;
        this.coroutineScope = unVar;
        this.animationSpec = finiteAnimationSpec;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i, List<TabPosition> list) {
        int mo361roundToPx0680j_4 = density.mo361roundToPx0680j_4(((TabPosition) yi.v0(list)).m2502getRightD9Ej5fM()) + i;
        int maxValue = mo361roundToPx0680j_4 - this.scrollState.getMaxValue();
        int mo361roundToPx0680j_42 = density.mo361roundToPx0680j_4(tabPosition.m2501getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo361roundToPx0680j_4(tabPosition.m2503getWidthD9Ej5fM()) / 2));
        int i2 = mo361roundToPx0680j_4 - maxValue;
        if (i2 < 0) {
            i2 = 0;
        }
        return y80.h(mo361roundToPx0680j_42, 0, i2);
    }

    public final void onLaidOut(Density density, int i, List<TabPosition> list, int i2) {
        int calculateTabOffset;
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == i2) {
            return;
        }
        this.selectedTab = Integer.valueOf(i2);
        TabPosition tabPosition = (TabPosition) yi.r0(list, i2);
        if (tabPosition == null || this.scrollState.getValue() == (calculateTabOffset = calculateTabOffset(tabPosition, density, i, list))) {
            return;
        }
        p01.t(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, calculateTabOffset, null), 3);
    }
}
