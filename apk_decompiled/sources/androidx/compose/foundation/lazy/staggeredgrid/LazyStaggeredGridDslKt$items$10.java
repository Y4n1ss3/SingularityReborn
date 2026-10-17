package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.oy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$10 implements oy {
    final /* synthetic */ oy $itemContent;
    final /* synthetic */ T[] $items;

    public LazyStaggeredGridDslKt$items$10(oy oyVar, T[] tArr) {
        this.$itemContent = oyVar;
        this.$items = tArr;
    }

    public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1775984467, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:472)");
        }
        this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items[i], composer, Integer.valueOf(i3 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.oy
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return w01.a;
    }
}
