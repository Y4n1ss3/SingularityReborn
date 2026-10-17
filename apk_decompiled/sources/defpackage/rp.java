package defpackage;

import androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1;
import androidx.compose.foundation.lazy.LazyListState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class rp implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ LazyListState e;

    public /* synthetic */ rp(LazyListState lazyListState, int i) {
        this.d = i;
        this.e = lazyListState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int firstVisibleItemIndex;
        int i = this.d;
        LazyListState lazyListState = this.e;
        switch (i) {
            case 0:
                firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex();
                break;
            default:
                firstVisibleItemIndex = LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1.totalItemsCount_delegate$lambda$0(lazyListState);
                break;
        }
        return Integer.valueOf(firstVisibleItemIndex);
    }
}
