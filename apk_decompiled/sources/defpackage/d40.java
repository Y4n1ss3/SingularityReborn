package defpackage;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d40 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ StaggeredGridCells e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ LazyStaggeredGridState g;
    public final /* synthetic */ PaddingValues h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float j;
    public final /* synthetic */ FlingBehavior k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ ky m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ d40(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2) {
        this.e = staggeredGridCells;
        this.f = modifier;
        this.g = lazyStaggeredGridState;
        this.h = paddingValues;
        this.i = z;
        this.j = f;
        this.p = horizontal;
        this.k = flingBehavior;
        this.l = z2;
        this.m = kyVar;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 LazyHorizontalStaggeredGrid_cJHQLPU$lambda$0;
        w01 LazyVerticalStaggeredGrid_zadm560$lambda$0;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LazyHorizontalStaggeredGrid_cJHQLPU$lambda$0 = LazyStaggeredGridDslKt.LazyHorizontalStaggeredGrid_cJHQLPU$lambda$0(this.e, this.f, this.g, this.h, this.i, (Arrangement.Vertical) this.p, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue);
                return LazyHorizontalStaggeredGrid_cJHQLPU$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LazyVerticalStaggeredGrid_zadm560$lambda$0 = LazyStaggeredGridDslKt.LazyVerticalStaggeredGrid_zadm560$lambda$0(this.e, this.f, this.g, this.h, this.i, this.j, (Arrangement.Horizontal) this.p, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue2);
                return LazyVerticalStaggeredGrid_zadm560$lambda$0;
        }
    }

    public /* synthetic */ d40(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2) {
        this.e = staggeredGridCells;
        this.f = modifier;
        this.g = lazyStaggeredGridState;
        this.h = paddingValues;
        this.i = z;
        this.p = vertical;
        this.j = f;
        this.k = flingBehavior;
        this.l = z2;
        this.m = kyVar;
        this.n = i;
        this.o = i2;
    }
}
