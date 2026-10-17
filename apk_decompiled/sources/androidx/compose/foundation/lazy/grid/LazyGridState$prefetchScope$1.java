package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;
import defpackage.hi0;
import defpackage.ky;
import defpackage.s30;
import defpackage.w01;
import defpackage.xe0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridState$prefetchScope$1 implements LazyGridPrefetchScope {
    final /* synthetic */ LazyGridState this$0;

    public LazyGridState$prefetchScope$1(LazyGridState lazyGridState) {
        this.this$0 = lazyGridState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 scheduleLinePrefetch$lambda$0$0$0$0(List list, hi0 hi0Var, List list2, ky kyVar, int i, LazyGridMeasureResult lazyGridMeasureResult, LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope) {
        int placeablesCount = prefetchResultScope.getPlaceablesCount();
        int i2 = 0;
        for (int i3 = 0; i3 < placeablesCount; i3++) {
            i2 += (int) (lazyGridMeasureResult.getOrientation() == Orientation.Vertical ? prefetchResultScope.mo937getSizeYEO4UFw(i3) & 4294967295L : prefetchResultScope.mo937getSizeYEO4UFw(i3) >> 32);
        }
        if (list != null) {
            list.add(Integer.valueOf(i2));
        }
        if (hi0Var.d != list2.size()) {
            hi0Var.d++;
        } else if (kyVar != null && list != null) {
            kyVar.invoke(new LazyGridPrefetchResultScopeImpl(i, list));
        }
        return w01.a;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope
    public List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int i, ky kyVar) {
        MutableState mutableState;
        LazyGridMeasureResult lazyGridMeasureResult;
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = kyVar == null ? null : new ArrayList();
        Snapshot.Companion companion = Snapshot.Companion;
        LazyGridState lazyGridState = this.this$0;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (lazyGridState.getHasLookaheadOccurred$foundation()) {
                lazyGridMeasureResult = lazyGridState.getApproachLayoutInfo$foundation();
            } else {
                mutableState = lazyGridState.layoutInfoState;
                lazyGridMeasureResult = (LazyGridMeasureResult) mutableState.getValue();
            }
            LazyGridMeasureResult lazyGridMeasureResult2 = lazyGridMeasureResult;
            if (lazyGridMeasureResult2 != null) {
                hi0 hi0Var = new hi0();
                hi0Var.d = 1;
                List list = (List) lazyGridMeasureResult2.getPrefetchInfoRetriever().invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    xe0 xe0Var = (xe0) list.get(i2);
                    LazyLayoutPrefetchState prefetchState$foundation = lazyGridState.getPrefetchState$foundation();
                    int intValue = ((Number) xe0Var.d).intValue();
                    long m7570unboximpl = ((Constraints) xe0Var.e).m7570unboximpl();
                    z = lazyGridState.executeRequestsInHighPriorityMode;
                    arrayList.add(prefetchState$foundation.m935schedulePrecompositionAndPremeasure_EkL_Y$foundation(intValue, m7570unboximpl, z, new s30(arrayList2, hi0Var, list, kyVar, i, lazyGridMeasureResult2)));
                }
            }
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            return arrayList;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope
    public List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int i) {
        return scheduleLinePrefetch(i, null);
    }
}
