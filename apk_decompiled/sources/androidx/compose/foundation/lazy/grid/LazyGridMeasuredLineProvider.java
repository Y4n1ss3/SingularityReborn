package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredLineProvider {
    public static final int $stable = 8;
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyGridMeasuredItemProvider measuredItemProvider;
    private final LazyGridSlots slots;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridMeasuredLineProvider(boolean z, LazyGridSlots lazyGridSlots, int i, int i2, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.isVertical = z;
        this.slots = lazyGridSlots;
        this.gridItemsCount = i;
        this.spaceBetweenLines = i2;
        this.measuredItemProvider = lazyGridMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation, reason: not valid java name */
    public final long m899childConstraintsJhjzzOo$foundation(int i, int i2) {
        int i3;
        LazyGridSlots lazyGridSlots = this.slots;
        if (i2 == 1) {
            i3 = lazyGridSlots.getSizes()[i];
        } else {
            int i4 = (i2 + i) - 1;
            i3 = (lazyGridSlots.getPositions()[i4] + this.slots.getSizes()[i4]) - this.slots.getPositions()[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        return this.isVertical ? Constraints.Companion.m7576fixedWidthOenEA2s(i3) : Constraints.Companion.m7575fixedHeightOenEA2s(i3);
    }

    public abstract LazyGridMeasuredLine createLine(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i2);

    public final LazyGridMeasuredLine getAndMeasure(int i) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i);
        int size = lineConfiguration.getSpans().size();
        int i2 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int m882getCurrentLineSpanimpl = GridItemSpan.m882getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i4).m885unboximpl());
            LazyGridMeasuredItem m898getAndMeasurem8Kt_7k = this.measuredItemProvider.m898getAndMeasurem8Kt_7k(lineConfiguration.getFirstItemIndex() + i4, m899childConstraintsJhjzzOo$foundation(i3, m882getCurrentLineSpanimpl), i3, m882getCurrentLineSpanimpl, i2);
            i3 += m882getCurrentLineSpanimpl;
            lazyGridMeasuredItemArr[i4] = m898getAndMeasurem8Kt_7k;
        }
        return createLine(i, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i2);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.measuredItemProvider.getKeyIndexMap();
    }

    public final LazyGridMeasuredLine keepAround(int i) {
        return getAndMeasure(i);
    }

    public final int spanOf(int i) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return lazyGridSpanLayoutProvider.spanOf(i, lazyGridSpanLayoutProvider.getSlotsPerLine());
    }
}
