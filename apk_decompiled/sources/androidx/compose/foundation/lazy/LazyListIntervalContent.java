package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.e10;
import defpackage.f10;
import defpackage.k30;
import defpackage.ky;
import defpackage.m30;
import defpackage.ma0;
import defpackage.ny;
import defpackage.oy;
import defpackage.w01;
import defpackage.zy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {
    public static final int $stable = 8;
    private ma0 _headerIndexes;
    private final MutableIntervalList<LazyListInterval> intervals = new MutableIntervalList<>();

    public LazyListIntervalContent(ky kyVar) {
        kyVar.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 item$lambda$2(ny nyVar, LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.changed(lazyItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i2 & 131) != 130, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857469575, i2, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:56)");
            }
            nyVar.invoke(lazyItemScope, composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 stickyHeader$lambda$1(oy oyVar, int i, LazyItemScope lazyItemScope, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.changed(lazyItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1588696110, i2, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.<anonymous> (LazyListIntervalContent.kt:70)");
            }
            oyVar.invoke(lazyItemScope, Integer.valueOf(i), composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    public final e10 getHeaderIndexes() {
        ma0 ma0Var = this._headerIndexes;
        return ma0Var != null ? ma0Var : f10.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(Object obj, Object obj2, ny nyVar) {
        getIntervals().addInterval(1, new LazyListInterval(obj != null ? new zy(obj, 3) : null, new zy(obj2, 4), ComposableLambdaKt.composableLambdaInstance(-857469575, true, new m30(nyVar, 1))));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int i, ky kyVar, ky kyVar2, oy oyVar) {
        getIntervals().addInterval(i, new LazyListInterval(kyVar, kyVar2, oyVar));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void stickyHeader(Object obj, Object obj2, oy oyVar) {
        ma0 ma0Var = this._headerIndexes;
        if (ma0Var == null) {
            ma0Var = new ma0();
            this._headerIndexes = ma0Var;
        }
        ma0Var.e(getIntervals().getSize());
        item(obj, obj2, ComposableLambdaKt.composableLambdaInstance(-1588696110, true, new k30(oyVar, getIntervals().getSize(), 1)));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<LazyListInterval> getIntervals() {
        return this.intervals;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object item$lambda$0(Object obj, int i) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object item$lambda$1(Object obj, int i) {
        return obj;
    }
}
