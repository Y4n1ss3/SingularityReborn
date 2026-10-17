package defpackage;

import androidx.compose.foundation.lazy.LazyListPrefetchStrategy;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class v30 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v30(int i, int i2, int i3, Object obj) {
        this.d = i3;
        this.e = i;
        this.f = i2;
        this.g = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        LazyGridState rememberLazyGridState$lambda$2$0;
        LazyListState rememberLazyListState$lambda$2$0;
        switch (this.d) {
            case 0:
                rememberLazyGridState$lambda$2$0 = LazyGridStateKt.rememberLazyGridState$lambda$2$0(this.e, this.f, (LazyGridPrefetchStrategy) this.g);
                return rememberLazyGridState$lambda$2$0;
            default:
                rememberLazyListState$lambda$2$0 = LazyListStateKt.rememberLazyListState$lambda$2$0(this.e, this.f, (LazyListPrefetchStrategy) this.g);
                return rememberLazyListState$lambda$2$0;
        }
    }
}
