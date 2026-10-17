package androidx.compose.foundation.lazy.staggeredgrid;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$9$1 implements ky {
    final /* synthetic */ T[] $items;
    final /* synthetic */ ky $span;

    public LazyStaggeredGridDslKt$items$9$1(ky kyVar, T[] tArr) {
        this.$span = kyVar;
        this.$items = tArr;
    }

    public final StaggeredGridItemSpan invoke(int i) {
        return (StaggeredGridItemSpan) this.$span.invoke(this.$items[i]);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
