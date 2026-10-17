package androidx.compose.foundation.lazy.grid;

import defpackage.ky;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$2 implements ky {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ ky $key;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$2(ky kyVar, List<? extends T> list) {
        this.$key = kyVar;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
