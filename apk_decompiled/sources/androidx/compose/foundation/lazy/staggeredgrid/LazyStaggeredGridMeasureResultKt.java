package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.p10;
import defpackage.st;
import defpackage.ut;
import defpackage.vt;
import defpackage.y80;
import defpackage.yi;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResultKt {
    private static final int[] EmptyArray;
    private static final LazyStaggeredGridMeasureResult EmptyLazyStaggeredGridLayoutInfo;

    static {
        int[] iArr = new int[0];
        EmptyArray = iArr;
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1
            private final Map<AlignmentLine, Integer> alignmentLines = vt.d;
            private final int height;
            private final int width;

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
        long m7787getZeroYbymL2g = IntSize.Companion.m7787getZeroYbymL2g();
        EmptyLazyStaggeredGridLayoutInfo = new LazyStaggeredGridMeasureResult(iArr, iArr, 0.0f, measureResult, 0.0f, false, false, false, new LazyStaggeredGridSlots(iArr, iArr), new LazyStaggeredGridSpanProvider(new MutableIntervalList()), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, ut.d, m7787getZeroYbymL2g, 0, 0, 0, 0, 0, p10.a(st.d), null);
    }

    public static final int calculateContentSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i) {
        int afterContentPadding = lazyStaggeredGridLayoutInfo.getAfterContentPadding() + lazyStaggeredGridLayoutInfo.getBeforeContentPadding();
        if (lazyStaggeredGridLayoutInfo.getTotalItemsCount() == 0 || i <= 0) {
            return afterContentPadding;
        }
        return (((lazyStaggeredGridLayoutInfo.getTotalItemsCount() * visibleItemsAverageSize(lazyStaggeredGridLayoutInfo)) / i) - lazyStaggeredGridLayoutInfo.getMainAxisItemSpacing()) + afterContentPadding;
    }

    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i) {
        int i2;
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) yi.p0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i > ((LazyStaggeredGridItemInfo) yi.v0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i) {
            return null;
        }
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        y80.J(visibleItemsInfo.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int findVisibleItem$lambda$0 = findVisibleItem$lambda$0(i, visibleItemsInfo.get(i2));
            if (findVisibleItem$lambda$0 >= 0) {
                if (findVisibleItem$lambda$0 <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        return (LazyStaggeredGridItemInfo) yi.r0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), i2);
    }

    private static final int findVisibleItem$lambda$0(int i, LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
        return lazyStaggeredGridItemInfo.getIndex() - i;
    }

    public static final LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return EmptyLazyStaggeredGridLayoutInfo;
    }

    public static final int getSingleAxisViewportSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        return (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridLayoutInfo.mo967getViewportSizeYbymL2g() & 4294967295L : lazyStaggeredGridLayoutInfo.mo967getViewportSizeYbymL2g() >> 32);
    }

    public static final int visibleItemsAverageSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size = visibleItemsInfo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i2);
            i += (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridItemInfo.mo965getSizeYbymL2g() & 4294967295L : lazyStaggeredGridItemInfo.mo965getSizeYbymL2g() >> 32);
        }
        return lazyStaggeredGridLayoutInfo.getMainAxisItemSpacing() + (i / visibleItemsInfo.size());
    }
}
