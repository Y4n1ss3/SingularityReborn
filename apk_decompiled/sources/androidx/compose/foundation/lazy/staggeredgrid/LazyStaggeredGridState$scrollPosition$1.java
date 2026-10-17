package androidx.compose.foundation.lazy.staggeredgrid;

import defpackage.my;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends xy implements my {
    public LazyStaggeredGridState$scrollPosition$1(Object obj) {
        super(2, obj, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public final int[] invoke(int i, int i2) {
        int[] fillNearestIndices;
        fillNearestIndices = ((LazyStaggeredGridState) this.receiver).fillNearestIndices(i, i2);
        return fillNearestIndices;
    }
}
