package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ScrollConfig {
    /* renamed from: calculateMouseWheelScroll-8xgXZGE */
    long mo387calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j);

    default boolean isPreciseWheelScroll(PointerEvent pointerEvent) {
        return false;
    }

    default boolean isSmoothScrollingEnabled() {
        return true;
    }
}
