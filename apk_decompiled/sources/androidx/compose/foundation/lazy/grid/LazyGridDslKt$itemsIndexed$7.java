package androidx.compose.foundation.lazy.grid;

import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$7 implements ky {
    final /* synthetic */ T[] $items;
    final /* synthetic */ my $key;

    public LazyGridDslKt$itemsIndexed$7(my myVar, T[] tArr) {
        this.$key = myVar;
        this.$items = tArr;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(Integer.valueOf(i), this.$items[i]);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
