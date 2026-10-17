package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class t30 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ LazyLayoutCacheWindow e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ t30(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2, int i3) {
        this.d = i3;
        this.e = lazyLayoutCacheWindow;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        LazyGridState rememberLazyGridState$lambda$3$0;
        LazyListState rememberLazyListState$lambda$3$0;
        switch (this.d) {
            case 0:
                rememberLazyGridState$lambda$3$0 = LazyGridStateKt.rememberLazyGridState$lambda$3$0(this.e, this.f, this.g);
                return rememberLazyGridState$lambda$3$0;
            default:
                rememberLazyListState$lambda$3$0 = LazyListStateKt.rememberLazyListState$lambda$3$0(this.e, this.f, this.g);
                return rememberLazyListState$lambda$3$0;
        }
    }
}
