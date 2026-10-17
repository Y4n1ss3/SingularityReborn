package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.dq;
import defpackage.e10;
import defpackage.lu0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class LazyListMeasuredItemProvider extends LazyLayoutMeasuredItemProvider<LazyListMeasuredItem> {
    public static final int $stable = 8;
    private final long childConstraints;
    private final LazyListItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    private LazyListMeasuredItemProvider(long j, boolean z, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.itemProvider = lazyListItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.childConstraints = ConstraintsKt.Constraints$default(0, z ? Constraints.m7564getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : Constraints.m7563getMaxHeightimpl(j), 5, null);
    }

    /* renamed from: getAndMeasure-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ LazyListMeasuredItem m872getAndMeasure0kLqBqw$default(LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i, long j, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
            return null;
        }
        if ((i2 & 2) != 0) {
            j = lazyListMeasuredItemProvider.childConstraints;
        }
        return lazyListMeasuredItemProvider.m874getAndMeasure0kLqBqw(i, j);
    }

    /* renamed from: createItem-X9ElhV4 */
    public abstract LazyListMeasuredItem mo862createItemX9ElhV4(int i, Object obj, Object obj2, List<? extends Placeable> list, long j);

    /* renamed from: getAndMeasure-0kLqBqw, reason: not valid java name */
    public final LazyListMeasuredItem m874getAndMeasure0kLqBqw(int i, long j) {
        return mo862createItemX9ElhV4(i, this.itemProvider.getKey(i), this.itemProvider.getContentType(i), m929getPlaceables3p2s80s(this.measureScope, i, j), j);
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m875getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    public final e10 getHeaderIndexes() {
        return this.itemProvider.getHeaderIndexes();
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }

    public final void keepAround(int i) {
        this.measureScope.compose(i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* renamed from: getAndMeasure--hBUhpc, reason: not valid java name */
    public LazyListMeasuredItem mo873getAndMeasurehBUhpc(int i, int i2, int i3, long j) {
        return m874getAndMeasure0kLqBqw(i, j);
    }

    public /* synthetic */ LazyListMeasuredItemProvider(long j, boolean z, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, dq dqVar) {
        this(j, z, lazyListItemProvider, lazyLayoutMeasureScope);
    }
}
