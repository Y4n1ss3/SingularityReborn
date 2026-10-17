package androidx.compose.foundation.lazy.grid;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$7 implements ky {
    final /* synthetic */ T[] $items;
    final /* synthetic */ ky $key;

    public LazyGridDslKt$items$7(ky kyVar, T[] tArr) {
        this.$key = kyVar;
        this.$items = tArr;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$key.invoke(this.$items[i]);
    }
}
