package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class r30 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ LazyLayoutCacheWindow e;

    public /* synthetic */ r30(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i) {
        this.d = i;
        this.e = lazyLayoutCacheWindow;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        LazyGridState saver$lambda$3;
        LazyListState saver$lambda$32;
        int i = this.d;
        LazyLayoutCacheWindow lazyLayoutCacheWindow = this.e;
        List list = (List) obj;
        switch (i) {
            case 0:
                saver$lambda$3 = LazyGridState.Companion.saver$lambda$3(lazyLayoutCacheWindow, list);
                return saver$lambda$3;
            default:
                saver$lambda$32 = LazyListState.Companion.saver$lambda$3(lazyLayoutCacheWindow, list);
                return saver$lambda$32;
        }
    }
}
