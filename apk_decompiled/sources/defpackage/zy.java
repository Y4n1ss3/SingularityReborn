package defpackage;

import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.LinkComposer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class zy implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zy(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        boolean stackTraceForValue$lambda$0;
        Object item$lambda$0$0;
        Object item$lambda$2;
        Object item$lambda$0;
        Object item$lambda$1;
        Object item$lambda$0$02;
        Object item$lambda$12;
        boolean stackTraceForValue$lambda$02;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                stackTraceForValue$lambda$0 = GapComposer.stackTraceForValue$lambda$0(obj2, obj);
                return Boolean.valueOf(stackTraceForValue$lambda$0);
            case 1:
                item$lambda$0$0 = LazyGridIntervalContent.item$lambda$0$0(obj2, ((Integer) obj).intValue());
                return item$lambda$0$0;
            case 2:
                item$lambda$2 = LazyGridIntervalContent.item$lambda$2(obj2, ((Integer) obj).intValue());
                return item$lambda$2;
            case 3:
                item$lambda$0 = LazyListIntervalContent.item$lambda$0(obj2, ((Integer) obj).intValue());
                return item$lambda$0;
            case 4:
                item$lambda$1 = LazyListIntervalContent.item$lambda$1(obj2, ((Integer) obj).intValue());
                return item$lambda$1;
            case 5:
                item$lambda$0$02 = LazyStaggeredGridIntervalContent.item$lambda$0$0(obj2, ((Integer) obj).intValue());
                return item$lambda$0$02;
            case 6:
                item$lambda$12 = LazyStaggeredGridIntervalContent.item$lambda$1(obj2, ((Integer) obj).intValue());
                return item$lambda$12;
            default:
                stackTraceForValue$lambda$02 = LinkComposer.stackTraceForValue$lambda$0(obj2, obj);
                return Boolean.valueOf(stackTraceForValue$lambda$02);
        }
    }
}
