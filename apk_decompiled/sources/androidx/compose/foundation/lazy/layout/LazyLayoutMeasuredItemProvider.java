package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import defpackage.gy;
import defpackage.h10;
import defpackage.na0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class LazyLayoutMeasuredItemProvider<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private final na0 placeablesCache;

    public LazyLayoutMeasuredItemProvider() {
        na0 na0Var = h10.a;
        this.placeablesCache = new na0();
    }

    /* renamed from: getAndMeasure--hBUhpc */
    public abstract T mo873getAndMeasurehBUhpc(int i, int i2, int i3, long j);

    /* renamed from: getPlaceables-3p2s80s, reason: not valid java name */
    public final List<Placeable> m929getPlaceables3p2s80s(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j) {
        List<Placeable> list = (List) this.placeablesCache.b(i);
        if (list != null) {
            return list;
        }
        List<Measurable> compose = lazyLayoutMeasureScope.compose(i);
        int size = compose.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 0;
        while (i2 < size) {
            i2 = gy.a(compose.get(i2), j, arrayList, i2, 1);
        }
        this.placeablesCache.i(i, arrayList);
        return arrayList;
    }
}
