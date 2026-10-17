package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class u30 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ u30(int i, int i2, int i3) {
        this.d = i3;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        LazyGridState rememberLazyGridState$lambda$0$0;
        LazyListState rememberLazyListState$lambda$0$0;
        LazyStaggeredGridState rememberLazyStaggeredGridState$lambda$0$0;
        switch (this.d) {
            case 0:
                rememberLazyGridState$lambda$0$0 = LazyGridStateKt.rememberLazyGridState$lambda$0$0(this.e, this.f);
                return rememberLazyGridState$lambda$0$0;
            case 1:
                rememberLazyListState$lambda$0$0 = LazyListStateKt.rememberLazyListState$lambda$0$0(this.e, this.f);
                return rememberLazyListState$lambda$0$0;
            default:
                rememberLazyStaggeredGridState$lambda$0$0 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState$lambda$0$0(this.e, this.f);
                return rememberLazyStaggeredGridState$lambda$0$0;
        }
    }
}
