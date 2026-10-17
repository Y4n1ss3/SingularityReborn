package androidx.compose.foundation.lazy.staggeredgrid;

import defpackage.ky;
import defpackage.my;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$4$1 implements ky {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ my $span;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$4$1(my myVar, List<? extends T> list) {
        this.$span = myVar;
        this.$items = list;
    }

    public final StaggeredGridItemSpan invoke(int i) {
        return (StaggeredGridItemSpan) this.$span.invoke(Integer.valueOf(i), this.$items.get(i));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
