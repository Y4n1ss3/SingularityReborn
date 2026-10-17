package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import defpackage.ad0;
import defpackage.q10;
import defpackage.ta0;
import defpackage.ya0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {
    private final ta0 countPerType;
    private final LazyLayoutItemContentFactory factory;

    public LazyLayoutItemReusePolicy(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.factory = lazyLayoutItemContentFactory;
        ta0 ta0Var = ad0.a;
        this.countPerType = new ta0();
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        return q10.b(this.factory.getContentType(obj), this.factory.getContentType(obj2));
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        this.countPerType.c();
        ya0 set = slotIdsSet.getSet();
        Object[] objArr = set.b;
        long[] jArr = set.c;
        int i = set.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object contentType = this.factory.getContentType(obj);
            ta0 ta0Var = this.countPerType;
            int a = ta0Var.a(contentType);
            int i3 = a >= 0 ? ta0Var.c[a] : 0;
            if (i3 == 7) {
                slotIdsSet.remove(obj);
            } else {
                this.countPerType.h(i3 + 1, contentType);
            }
            i = i2;
        }
    }
}
