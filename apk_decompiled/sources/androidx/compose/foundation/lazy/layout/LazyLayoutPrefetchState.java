package androidx.compose.foundation.lazy.layout;

import defpackage.dq;
import defpackage.er;
import defpackage.ky;
import defpackage.ut;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState {
    public static final int $stable = 0;
    private int idealNestedPrefetchCount;
    private int lastNumberOfNestedPrefetchItems;
    private ky onNestedPrefetch;
    private PrefetchHandleProvider prefetchHandleProvider;
    private final PrefetchMetrics prefetchMetrics;
    private PrefetchScheduler prefetchScheduler;
    private int realizedNestedPrefetchCount;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class NestedPrefetchScopeImpl implements NestedPrefetchScope {
        private final List<PrefetchRequest> _requests = new ArrayList();
        private final int nestedPrefetchItemCount;

        public NestedPrefetchScopeImpl(int i) {
            this.nestedPrefetchItemCount = i;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public int getNestedPrefetchItemCount() {
            return this.nestedPrefetchItemCount;
        }

        public final List<PrefetchRequest> getRequests() {
            return this._requests;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public void schedulePrecomposition(int i) {
            PrefetchHandleProvider prefetchHandleProvider$foundation = LazyLayoutPrefetchState.this.getPrefetchHandleProvider$foundation();
            if (prefetchHandleProvider$foundation == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider$foundation.createNestedPrefetchRequest(i, LazyLayoutPrefetchState.this.prefetchMetrics));
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* renamed from: schedulePrecompositionAndPremeasure-0kLqBqw, reason: not valid java name */
        public void mo936schedulePrecompositionAndPremeasure0kLqBqw(int i, long j) {
            PrefetchHandleProvider prefetchHandleProvider$foundation = LazyLayoutPrefetchState.this.getPrefetchHandleProvider$foundation();
            if (prefetchHandleProvider$foundation == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider$foundation.m949createNestedPrefetchRequestVKLhPVY(i, j, LazyLayoutPrefetchState.this.prefetchMetrics));
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface PrefetchHandle {
        void cancel();

        void markAsUrgent();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface PrefetchResultScope {
        int getIndex();

        int getPlaceablesCount();

        /* renamed from: getSize-YEO4UFw, reason: not valid java name */
        long mo937getSizeYEO4UFw(int i);
    }

    public LazyLayoutPrefetchState() {
        this.prefetchMetrics = new PrefetchMetrics();
        this.realizedNestedPrefetchCount = -1;
        this.idealNestedPrefetchCount = -1;
    }

    /* renamed from: schedulePrecompositionAndPremeasure-VKLhPVY$default, reason: not valid java name */
    public static /* synthetic */ PrefetchHandle m932schedulePrecompositionAndPremeasureVKLhPVY$default(LazyLayoutPrefetchState lazyLayoutPrefetchState, int i, long j, ky kyVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            kyVar = null;
        }
        return lazyLayoutPrefetchState.m934schedulePrecompositionAndPremeasureVKLhPVY(i, j, kyVar);
    }

    /* renamed from: schedulePrecompositionAndPremeasure-_EkL_-Y$foundation$default, reason: not valid java name */
    public static /* synthetic */ PrefetchHandle m933schedulePrecompositionAndPremeasure_EkL_Y$foundation$default(LazyLayoutPrefetchState lazyLayoutPrefetchState, int i, long j, boolean z, ky kyVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            kyVar = null;
        }
        return lazyLayoutPrefetchState.m935schedulePrecompositionAndPremeasure_EkL_Y$foundation(i, j, z, kyVar);
    }

    public final List<PrefetchRequest> collectNestedPrefetchRequests$foundation() {
        ky kyVar = this.onNestedPrefetch;
        if (kyVar == null) {
            return ut.d;
        }
        NestedPrefetchScopeImpl nestedPrefetchScopeImpl = new NestedPrefetchScopeImpl(this.realizedNestedPrefetchCount);
        kyVar.invoke(nestedPrefetchScopeImpl);
        List<PrefetchRequest> requests = nestedPrefetchScopeImpl.getRequests();
        this.lastNumberOfNestedPrefetchItems = requests.size();
        return requests;
    }

    public final int getIdealNestedPrefetchCount$foundation() {
        return this.idealNestedPrefetchCount;
    }

    public final int getLastNumberOfNestedPrefetchItems$foundation() {
        return this.lastNumberOfNestedPrefetchItems;
    }

    public final PrefetchHandleProvider getPrefetchHandleProvider$foundation() {
        return this.prefetchHandleProvider;
    }

    public final PrefetchScheduler getPrefetchScheduler$foundation() {
        return this.prefetchScheduler;
    }

    public final int getRealizedNestedPrefetchCount$foundation() {
        return this.realizedNestedPrefetchCount;
    }

    public final PrefetchHandle schedulePrecomposition(int i) {
        return schedulePrecomposition$foundation(i, true);
    }

    public final PrefetchHandle schedulePrecomposition$foundation(int i, boolean z) {
        PrefetchHandle schedulePrecomposition;
        PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return (prefetchHandleProvider == null || (schedulePrecomposition = prefetchHandleProvider.schedulePrecomposition(i, z, this.prefetchMetrics)) == null) ? DummyHandle.INSTANCE : schedulePrecomposition;
    }

    /* renamed from: schedulePrecompositionAndPremeasure-VKLhPVY, reason: not valid java name */
    public final PrefetchHandle m934schedulePrecompositionAndPremeasureVKLhPVY(int i, long j, ky kyVar) {
        return m935schedulePrecompositionAndPremeasure_EkL_Y$foundation(i, j, true, kyVar);
    }

    /* renamed from: schedulePrecompositionAndPremeasure-_EkL_-Y$foundation, reason: not valid java name */
    public final PrefetchHandle m935schedulePrecompositionAndPremeasure_EkL_Y$foundation(int i, long j, boolean z, ky kyVar) {
        PrefetchHandle m950schedulePremeasurem8Kt_7k;
        PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return (prefetchHandleProvider == null || (m950schedulePremeasurem8Kt_7k = prefetchHandleProvider.m950schedulePremeasurem8Kt_7k(i, j, this.prefetchMetrics, z, kyVar)) == null) ? DummyHandle.INSTANCE : m950schedulePremeasurem8Kt_7k;
    }

    public final void setIdealNestedPrefetchCount$foundation(int i) {
        this.idealNestedPrefetchCount = i;
    }

    public final void setLastNumberOfNestedPrefetchItems$foundation(int i) {
        this.lastNumberOfNestedPrefetchItems = i;
    }

    public final void setPrefetchHandleProvider$foundation(PrefetchHandleProvider prefetchHandleProvider) {
        this.prefetchHandleProvider = prefetchHandleProvider;
    }

    public final void setPrefetchScheduler$foundation(PrefetchScheduler prefetchScheduler) {
        this.prefetchScheduler = prefetchScheduler;
    }

    public final void setRealizedNestedPrefetchCount$foundation(int i) {
        this.realizedNestedPrefetchCount = i;
    }

    public /* synthetic */ LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, ky kyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? null : prefetchScheduler, (i & 2) != 0 ? null : kyVar);
    }

    @er
    public LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, ky kyVar) {
        this();
        this.prefetchScheduler = prefetchScheduler;
        this.onNestedPrefetch = kyVar;
    }

    private static /* synthetic */ void getOnNestedPrefetch$annotations() {
    }

    public static /* synthetic */ void getPrefetchHandleProvider$foundation$annotations() {
    }

    public static /* synthetic */ void getPrefetchScheduler$foundation$annotations() {
    }

    public LazyLayoutPrefetchState(ky kyVar) {
        this();
        this.onNestedPrefetch = kyVar;
    }

    public /* synthetic */ LazyLayoutPrefetchState(ky kyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? null : kyVar);
    }
}
