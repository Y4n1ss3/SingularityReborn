package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.h;
import defpackage.ky;
import defpackage.m30;
import defpackage.ny;
import defpackage.oy;
import defpackage.w01;
import defpackage.zy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent<LazyStaggeredGridInterval> implements LazyStaggeredGridScope {
    public static final int $stable = 8;
    private final MutableIntervalList<LazyStaggeredGridInterval> intervals = new MutableIntervalList<>();
    private final LazyStaggeredGridSpanProvider spanProvider = new LazyStaggeredGridSpanProvider(getIntervals());

    public LazyStaggeredGridIntervalContent(ky kyVar) {
        kyVar.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 item$lambda$3(ny nyVar, LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.changed(lazyStaggeredGridItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i2 & 131) != 130, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1062451479, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:44)");
            }
            nyVar.invoke(lazyStaggeredGridItemScope, composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, ny nyVar) {
        items(1, obj != null ? new zy(obj, 5) : null, new zy(obj2, 6), staggeredGridItemSpan != null ? new h(staggeredGridItemSpan, 27) : null, ComposableLambdaKt.composableLambdaInstance(1062451479, true, new m30(nyVar, 3)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void items(int i, ky kyVar, ky kyVar2, ky kyVar3, oy oyVar) {
        getIntervals().addInterval(i, new LazyStaggeredGridInterval(kyVar, kyVar2, kyVar3, oyVar));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object item$lambda$0$0(Object obj, int i) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object item$lambda$1(Object obj, int i) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaggeredGridItemSpan item$lambda$2$0(StaggeredGridItemSpan staggeredGridItemSpan, int i) {
        return staggeredGridItemSpan;
    }
}
