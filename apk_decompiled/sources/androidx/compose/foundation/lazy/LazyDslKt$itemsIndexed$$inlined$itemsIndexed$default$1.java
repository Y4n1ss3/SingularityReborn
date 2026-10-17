package androidx.compose.foundation.lazy;

import defpackage.ky;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1 implements ky {
    final /* synthetic */ List $items;

    public LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(List list) {
        this.$items = list;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        this.$items.get(i);
        return null;
    }
}
