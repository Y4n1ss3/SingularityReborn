package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.k00;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListState$prefetchScope$1 implements LazyListPrefetchScope {
    final /* synthetic */ LazyListState this$0;

    public LazyListState$prefetchScope$1(LazyListState lazyListState) {
        this.this$0 = lazyListState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 schedulePrefetch$lambda$1(ky kyVar, int i, LazyListMeasureResult lazyListMeasureResult, LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope) {
        if (kyVar != null) {
            int placeablesCount = prefetchResultScope.getPlaceablesCount();
            int i2 = 0;
            for (int i3 = 0; i3 < placeablesCount; i3++) {
                i2 += (int) (lazyListMeasureResult.getOrientation() == Orientation.Vertical ? prefetchResultScope.mo937getSizeYEO4UFw(i3) & 4294967295L : prefetchResultScope.mo937getSizeYEO4UFw(i3) >> 32);
            }
            kyVar.invoke(new LazyListPrefetchResultScopeImpl(i, i2));
        }
        return w01.a;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchScope
    public LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch(int i, ky kyVar) {
        MutableState mutableState;
        boolean z;
        Snapshot.Companion companion = Snapshot.Companion;
        LazyListState lazyListState = this.this$0;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            mutableState = lazyListState.layoutInfoState;
            LazyListMeasureResult lazyListMeasureResult = (LazyListMeasureResult) mutableState.getValue();
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            LazyLayoutPrefetchState prefetchState$foundation = this.this$0.getPrefetchState$foundation();
            long m867getChildConstraintsmsEJaDk = lazyListMeasureResult.m867getChildConstraintsmsEJaDk();
            z = this.this$0.executeRequestsInHighPriorityMode;
            return prefetchState$foundation.m935schedulePrecompositionAndPremeasure_EkL_Y$foundation(i, m867getChildConstraintsmsEJaDk, z, new k00(kyVar, i, lazyListMeasureResult, 1));
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
