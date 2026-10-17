package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LazyStaggeredGridSlotCache implements LazyGridStaggeredGridSlotsProvider {
    private long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private float cachedDensity;
    private LazyStaggeredGridSlots cachedSizes;
    private final my calculation;

    public LazyStaggeredGridSlotCache(my myVar) {
        this.calculation = myVar;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider
    /* renamed from: invoke-0kLqBqw */
    public LazyStaggeredGridSlots mo959invoke0kLqBqw(Density density, long j) {
        if (this.cachedSizes != null && Constraints.m7557equalsimpl0(this.cachedConstraints, j) && this.cachedDensity == density.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.cachedSizes;
            lazyStaggeredGridSlots.getClass();
            return lazyStaggeredGridSlots;
        }
        this.cachedConstraints = j;
        this.cachedDensity = density.getDensity();
        LazyStaggeredGridSlots lazyStaggeredGridSlots2 = (LazyStaggeredGridSlots) this.calculation.invoke(density, Constraints.m7551boximpl(j));
        this.cachedSizes = lazyStaggeredGridSlots2;
        return lazyStaggeredGridSlots2;
    }
}
