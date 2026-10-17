package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.e10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredItemProvider extends LazyLayoutMeasuredItemProvider<LazyGridMeasuredItem> {
    public static final int $stable = 8;
    private final int defaultMainAxisSpacing;
    private final LazyGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    public LazyGridMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        this.itemProvider = lazyGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.defaultMainAxisSpacing = i;
    }

    /* renamed from: createItem-O3s9Psw */
    public abstract LazyGridMeasuredItem mo893createItemO3s9Psw(int i, Object obj, Object obj2, int i2, int i3, List<? extends Placeable> list, long j, int i4, int i5);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* renamed from: getAndMeasure--hBUhpc */
    public LazyGridMeasuredItem mo873getAndMeasurehBUhpc(int i, int i2, int i3, long j) {
        return m898getAndMeasurem8Kt_7k(i, j, i2, i3, this.defaultMainAxisSpacing);
    }

    /* renamed from: getAndMeasure-m8Kt_7k, reason: not valid java name */
    public final LazyGridMeasuredItem m898getAndMeasurem8Kt_7k(int i, long j, int i2, int i3, int i4) {
        int m7565getMinHeightimpl;
        Object key = this.itemProvider.getKey(i);
        Object contentType = this.itemProvider.getContentType(i);
        List<Placeable> m929getPlaceables3p2s80s = m929getPlaceables3p2s80s(this.measureScope, i, j);
        if (Constraints.m7562getHasFixedWidthimpl(j)) {
            m7565getMinHeightimpl = Constraints.m7566getMinWidthimpl(j);
        } else {
            if (!Constraints.m7561getHasFixedHeightimpl(j)) {
                InlineClassHelperKt.throwIllegalArgumentException("does not have fixed height");
            }
            m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
        }
        return mo893createItemO3s9Psw(i, key, contentType, m7565getMinHeightimpl, i4, m929getPlaceables3p2s80s, j, i2, i3);
    }

    public final e10 getHeaderIndices() {
        return this.itemProvider.getHeaderIndexes();
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
