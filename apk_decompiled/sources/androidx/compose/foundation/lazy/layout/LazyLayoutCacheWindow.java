package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyLayoutCacheWindow {
    default int calculateAheadWindow(Density density, int i) {
        return 0;
    }

    default int calculateBehindWindow(Density density, int i) {
        return 0;
    }
}
