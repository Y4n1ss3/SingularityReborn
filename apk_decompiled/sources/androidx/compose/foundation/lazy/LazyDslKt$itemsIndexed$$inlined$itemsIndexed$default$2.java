package androidx.compose.foundation.lazy;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2 implements ky {
    final /* synthetic */ Object[] $items;

    public LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(Object[] objArr) {
        this.$items = objArr;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        Object obj = this.$items[i];
        return null;
    }
}
