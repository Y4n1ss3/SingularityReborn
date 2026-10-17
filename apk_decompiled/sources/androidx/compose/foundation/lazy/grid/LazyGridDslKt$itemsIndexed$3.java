package androidx.compose.foundation.lazy.grid;

import defpackage.my;
import defpackage.ny;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$3 implements my {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ ny $span;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$3(ny nyVar, List<? extends T> list) {
        this.$span = nyVar;
        this.$items = list;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m878boximpl(m889invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m889invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.$items.get(i))).m885unboximpl();
    }
}
