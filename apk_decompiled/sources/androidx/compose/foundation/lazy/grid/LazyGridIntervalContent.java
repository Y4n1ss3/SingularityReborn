package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.dq;
import defpackage.e10;
import defpackage.f10;
import defpackage.hz;
import defpackage.k30;
import defpackage.ky;
import defpackage.l30;
import defpackage.m30;
import defpackage.ma0;
import defpackage.my;
import defpackage.n30;
import defpackage.ny;
import defpackage.oy;
import defpackage.w01;
import defpackage.zy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    private ma0 _headerIndexes;
    private boolean hasCustomSpans;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final my DefaultSpan = new n30(0);
    private final LazyGridSpanLayoutProvider spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
    private final MutableIntervalList<LazyGridInterval> intervals = new MutableIntervalList<>();

    public LazyGridIntervalContent(ky kyVar) {
        kyVar.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GridItemSpan DefaultSpan$lambda$0(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return GridItemSpan.m878boximpl(LazyGridSpanKt.GridItemSpan(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GridItemSpan item$lambda$1$0(ky kyVar, LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return (GridItemSpan) kyVar.invoke(lazyGridItemSpanScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 item$lambda$3(ny nyVar, LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.changed(lazyGridItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i2 & 131) != 130, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-291643851, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:55)");
            }
            nyVar.invoke(lazyGridItemScope, composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GridItemSpan stickyHeader$lambda$1(LazyGridItemSpanScope lazyGridItemSpanScope) {
        return GridItemSpan.m878boximpl(LazyGridSpanKt.GridItemSpan(lazyGridItemSpanScope.getMaxLineSpan()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 stickyHeader$lambda$2(oy oyVar, int i, LazyGridItemScope lazyGridItemScope, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.changed(lazyGridItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(46791243, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.<anonymous> (LazyGridIntervalContent.kt:88)");
            }
            oyVar.invoke(lazyGridItemScope, Integer.valueOf(i), composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    public final boolean getHasCustomSpans$foundation() {
        return this.hasCustomSpans;
    }

    public final e10 getHeaderIndexes() {
        ma0 ma0Var = this._headerIndexes;
        return ma0Var != null ? ma0Var : f10.a;
    }

    public final LazyGridSpanLayoutProvider getSpanLayoutProvider$foundation() {
        return this.spanLayoutProvider;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(Object obj, ky kyVar, Object obj2, ny nyVar) {
        ?? intervals = getIntervals();
        zy zyVar = obj != null ? new zy(obj, 1) : null;
        int i = 0;
        intervals.addInterval(1, new LazyGridInterval(zyVar, kyVar != null ? new l30(kyVar, i) : DefaultSpan, new zy(obj2, 2), ComposableLambdaKt.composableLambdaInstance(-291643851, true, new m30(nyVar, i))));
        if (kyVar != null) {
            this.hasCustomSpans = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int i, ky kyVar, my myVar, ky kyVar2, oy oyVar) {
        getIntervals().addInterval(i, new LazyGridInterval(kyVar, myVar == null ? DefaultSpan : myVar, kyVar2, oyVar));
        if (myVar != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation(boolean z) {
        this.hasCustomSpans = z;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void stickyHeader(Object obj, Object obj2, oy oyVar) {
        ma0 ma0Var = this._headerIndexes;
        if (ma0Var == null) {
            ma0Var = new ma0();
            this._headerIndexes = ma0Var;
        }
        int size = getIntervals().getSize();
        ma0Var.e(size);
        item(obj, new hz(8), obj2, ComposableLambdaKt.composableLambdaInstance(46791243, true, new k30(oyVar, size, 0)));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final my getDefaultSpan() {
            return LazyGridIntervalContent.DefaultSpan;
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<LazyGridInterval> getIntervals() {
        return this.intervals;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object item$lambda$0$0(Object obj, int i) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object item$lambda$2(Object obj, int i) {
        return obj;
    }
}
