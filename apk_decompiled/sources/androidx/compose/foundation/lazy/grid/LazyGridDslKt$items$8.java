package androidx.compose.foundation.lazy.grid;

import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$8 implements my {
    final /* synthetic */ T[] $items;
    final /* synthetic */ my $span;

    public LazyGridDslKt$items$8(my myVar, T[] tArr) {
        this.$span = myVar;
        this.$items = tArr;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m878boximpl(m888invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m888invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items[i])).m885unboximpl();
    }
}
