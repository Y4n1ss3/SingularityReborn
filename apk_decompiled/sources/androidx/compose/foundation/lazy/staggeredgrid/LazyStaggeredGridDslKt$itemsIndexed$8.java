package androidx.compose.foundation.lazy.staggeredgrid;

import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$8 implements ky {
    final /* synthetic */ my $contentType;
    final /* synthetic */ T[] $items;

    public LazyStaggeredGridDslKt$itemsIndexed$8(my myVar, T[] tArr) {
        this.$contentType = myVar;
        this.$items = tArr;
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(Integer.valueOf(i), this.$items[i]);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
