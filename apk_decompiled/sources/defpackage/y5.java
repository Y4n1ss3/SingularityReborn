package defpackage;

import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.foundation.lazy.layout.PriorityTask;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.android.LayoutIntrinsics_androidKt;
import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ y5(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int prefetchRequests$lambda$0;
        int IntRangeComparator$lambda$0;
        int ZComparator$lambda$0;
        int LazyLayoutMeasuredItemIndexComparator$lambda$0;
        switch (this.a) {
            case 0:
                prefetchRequests$lambda$0 = AndroidPrefetchScheduler.prefetchRequests$lambda$0((PriorityTask) obj, (PriorityTask) obj2);
                return prefetchRequests$lambda$0;
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                IntRangeComparator$lambda$0 = LayoutIntrinsics_androidKt.IntRangeComparator$lambda$0((k10) obj, (k10) obj2);
                return IntRangeComparator$lambda$0;
            case 3:
                ZComparator$lambda$0 = LayoutNode.ZComparator$lambda$0((LayoutNode) obj, (LayoutNode) obj2);
                return ZComparator$lambda$0;
            default:
                LazyLayoutMeasuredItemIndexComparator$lambda$0 = LazyLayoutMeasuredItemKt.LazyLayoutMeasuredItemIndexComparator$lambda$0((LazyLayoutMeasuredItem) obj, (LazyLayoutMeasuredItem) obj2);
                return LazyLayoutMeasuredItemIndexComparator$lambda$0;
        }
    }
}
