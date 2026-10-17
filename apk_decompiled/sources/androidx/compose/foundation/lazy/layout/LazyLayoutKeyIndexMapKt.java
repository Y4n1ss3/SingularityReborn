package androidx.compose.foundation.lazy.layout;

import defpackage.k10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutKeyIndexMapKt {
    public static final LazyLayoutKeyIndexMap LazyLayoutKeyIndexMap(k10 k10Var, LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        return new NearestRangeKeyIndexMap(k10Var, lazyLayoutIntervalContent);
    }
}
