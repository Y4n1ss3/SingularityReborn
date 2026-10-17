package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import defpackage.f30;
import defpackage.ky;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1 extends f30 implements ky {
    final /* synthetic */ Comparable $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1(Comparable comparable) {
        super(1);
        this.$key = comparable;
    }

    @Override // defpackage.ky
    public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem) {
        return Integer.valueOf(p01.i(Integer.valueOf(spannedItem.getIndex()), this.$key));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((LazyStaggeredGridLaneInfo.SpannedItem) obj);
    }
}
