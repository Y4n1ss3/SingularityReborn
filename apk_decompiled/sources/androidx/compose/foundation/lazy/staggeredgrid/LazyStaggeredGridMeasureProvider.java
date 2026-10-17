package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class LazyStaggeredGridMeasureProvider extends LazyLayoutMeasuredItemProvider<LazyStaggeredGridMeasuredItem> {
    public static final int $stable = 8;
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridSlots resolvedSlots;

    public LazyStaggeredGridMeasureProvider(boolean z, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.isVertical = z;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.resolvedSlots = lazyStaggeredGridSlots;
    }

    /* renamed from: childConstraints-JhjzzOo, reason: not valid java name */
    private final long m978childConstraintsJhjzzOo(int i, int i2) {
        int i3;
        LazyStaggeredGridSlots lazyStaggeredGridSlots = this.resolvedSlots;
        if (i2 == 1) {
            i3 = lazyStaggeredGridSlots.getSizes()[i];
        } else {
            int i4 = lazyStaggeredGridSlots.getPositions()[i];
            int i5 = (i + i2) - 1;
            i3 = (this.resolvedSlots.getPositions()[i5] + this.resolvedSlots.getSizes()[i5]) - i4;
        }
        return this.isVertical ? Constraints.Companion.m7576fixedWidthOenEA2s(i3) : Constraints.Companion.m7575fixedHeightOenEA2s(i3);
    }

    /* renamed from: createItem-pitSLOA */
    public abstract LazyStaggeredGridMeasuredItem mo973createItempitSLOA(int i, int i2, int i3, Object obj, Object obj2, List<? extends Placeable> list, long j);

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* renamed from: getAndMeasure--hBUhpc, reason: avoid collision after fix types in other method */
    public LazyStaggeredGridMeasuredItem mo873getAndMeasurehBUhpc(int i, int i2, int i3, long j) {
        return mo973createItempitSLOA(i, i2, i3, this.itemProvider.getKey(i), this.itemProvider.getContentType(i), m929getPlaceables3p2s80s(this.measureScope, i, j), j);
    }

    /* renamed from: getAndMeasure-jy6DScQ, reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m979getAndMeasurejy6DScQ(int i, long j) {
        Object key = this.itemProvider.getKey(i);
        Object contentType = this.itemProvider.getContentType(i);
        int length = this.resolvedSlots.getSizes().length;
        int i2 = (int) (j >> 32);
        int i3 = length - 1;
        int i4 = i2 > i3 ? i3 : i2;
        int i5 = ((int) (j & 4294967295L)) - i2;
        int i6 = length - i4;
        int i7 = i5 > i6 ? i6 : i5;
        long m978childConstraintsJhjzzOo = m978childConstraintsJhjzzOo(i4, i7);
        return mo973createItempitSLOA(i, i4, i7, key, contentType, m929getPlaceables3p2s80s(this.measureScope, i, m978childConstraintsJhjzzOo), m978childConstraintsJhjzzOo);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
