package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.AndroidTrace_androidKt;
import defpackage.d41;
import defpackage.dq;
import defpackage.ji0;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.ps;
import defpackage.q10;
import defpackage.qs;
import defpackage.rs;
import defpackage.y80;
import defpackage.z90;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrefetchHandleProvider {
    public static final int $stable = 8;
    private final PrefetchScheduler executor;
    private boolean isStateActive = true;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private boolean shouldPauseBetweenPrecompositionAndPremeasure;
    private final SubcomposeLayoutState subcomposeLayoutState;

    public PrefetchHandleProvider(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.executor = prefetchScheduler;
    }

    public final PrefetchRequest createNestedPrefetchRequest(int i, PrefetchMetrics prefetchMetrics) {
        PrefetchScheduler prefetchScheduler = this.executor;
        return new HandleAndRequestImpl(i, prefetchMetrics, prefetchScheduler instanceof PriorityPrefetchScheduler ? (PriorityPrefetchScheduler) prefetchScheduler : null, null);
    }

    /* renamed from: createNestedPrefetchRequest-VKLhPVY, reason: not valid java name */
    public final PrefetchRequest m949createNestedPrefetchRequestVKLhPVY(int i, long j, PrefetchMetrics prefetchMetrics) {
        PrefetchScheduler prefetchScheduler = this.executor;
        return new HandleAndRequestImpl(this, i, j, prefetchMetrics, prefetchScheduler instanceof PriorityPrefetchScheduler ? (PriorityPrefetchScheduler) prefetchScheduler : null, null, null);
    }

    public final void executeWithPriority(PrefetchScheduler prefetchScheduler, PrefetchRequest prefetchRequest, boolean z) {
        if (!(prefetchScheduler instanceof PriorityPrefetchScheduler)) {
            prefetchScheduler.schedulePrefetch(prefetchRequest);
        } else if (z) {
            ((PriorityPrefetchScheduler) prefetchScheduler).scheduleHighPriorityPrefetch(prefetchRequest);
        } else {
            ((PriorityPrefetchScheduler) prefetchScheduler).scheduleLowPriorityPrefetch(prefetchRequest);
        }
    }

    public final boolean getShouldPauseBetweenPrecompositionAndPremeasure$foundation() {
        return this.shouldPauseBetweenPrecompositionAndPremeasure;
    }

    public final void onDisposed() {
        this.isStateActive = false;
    }

    public final LazyLayoutPrefetchState.PrefetchHandle schedulePrecomposition(int i, boolean z, PrefetchMetrics prefetchMetrics) {
        PrefetchScheduler prefetchScheduler = this.executor;
        HandleAndRequestImpl handleAndRequestImpl = new HandleAndRequestImpl(i, prefetchMetrics, prefetchScheduler instanceof PriorityPrefetchScheduler ? (PriorityPrefetchScheduler) prefetchScheduler : null, null);
        executeWithPriority(this.executor, handleAndRequestImpl, z);
        AndroidTrace_androidKt.traceValue("compose:lazy:schedule_prefetch:index", i);
        return handleAndRequestImpl;
    }

    /* renamed from: schedulePremeasure-m8Kt_7k, reason: not valid java name */
    public final LazyLayoutPrefetchState.PrefetchHandle m950schedulePremeasurem8Kt_7k(int i, long j, PrefetchMetrics prefetchMetrics, boolean z, ky kyVar) {
        PrefetchScheduler prefetchScheduler = this.executor;
        HandleAndRequestImpl handleAndRequestImpl = new HandleAndRequestImpl(this, i, j, prefetchMetrics, prefetchScheduler instanceof PriorityPrefetchScheduler ? (PriorityPrefetchScheduler) prefetchScheduler : null, kyVar, null);
        executeWithPriority(this.executor, handleAndRequestImpl, z);
        AndroidTrace_androidKt.traceValue("compose:lazy:schedule_prefetch:index", i);
        return handleAndRequestImpl;
    }

    public final void setShouldPauseBetweenPrecompositionAndPremeasure$foundation(boolean z) {
        this.shouldPauseBetweenPrecompositionAndPremeasure = z;
    }

    public static /* synthetic */ void getShouldPauseBetweenPrecompositionAndPremeasure$foundation$annotations() {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle, PrefetchRequest, LazyLayoutPrefetchState.PrefetchResultScope {
        private long availableTimeNanos;
        private long elapsedTimeNanos;
        private boolean hasResolvedNestedPrefetches;
        private final int index;
        private boolean isApplied;
        private boolean isCanceled;
        private boolean isMeasured;
        private boolean isUrgent;
        private Object keyUsedForComposition;
        private NestedPrefetchController nestedPrefetchController;
        private final ky onItemPremeasured;
        private boolean pauseRequested;
        private SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition;
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;
        private final PrefetchMetrics prefetchMetrics;
        private Constraints premeasureConstraints;
        private final PriorityPrefetchScheduler priorityPrefetchScheduler;
        private long startTime;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public final class NestedPrefetchController {
            private boolean executedNestedPrefetch;
            private int requestIndex;
            private final List<PrefetchRequest>[] requestsByState;
            private int stateIndex;
            private final List<LazyLayoutPrefetchState> states;

            public NestedPrefetchController(List<LazyLayoutPrefetchState> list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    InlineClassHelperKt.throwIllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final int collectIdealNestedPrefetchCount() {
                List<LazyLayoutPrefetchState> list = this.states;
                int size = list.size();
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < size; i2++) {
                    i = Math.min(i, list.get(i2).getIdealNestedPrefetchCount$foundation());
                }
                if (i == Integer.MAX_VALUE) {
                    return 0;
                }
                return i;
            }

            public final int collectNestedPrefetchedItemsCount() {
                List<LazyLayoutPrefetchState> list = this.states;
                int size = list.size();
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < size; i2++) {
                    i = Math.min(i, list.get(i2).getLastNumberOfNestedPrefetchItems$foundation());
                }
                if (i == Integer.MAX_VALUE) {
                    return 0;
                }
                return i;
            }

            public final boolean executeNestedPrefetches(PrefetchRequestScope prefetchRequestScope, int i, boolean z) {
                if (this.stateIndex >= this.states.size()) {
                    return false;
                }
                if (HandleAndRequestImpl.this.isCanceled) {
                    InlineClassHelperKt.throwIllegalStateException("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                try {
                    List<LazyLayoutPrefetchState> list = this.states;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.get(i2).setRealizedNestedPrefetchCount$foundation(i);
                    }
                    Trace.endSection();
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (this.stateIndex < this.states.size()) {
                        try {
                            if (this.requestsByState[this.stateIndex] == null) {
                                if (prefetchRequestScope.availableTimeNanos() <= 0) {
                                    return true;
                                }
                                List<PrefetchRequest>[] listArr = this.requestsByState;
                                int i3 = this.stateIndex;
                                listArr[i3] = this.states.get(i3).collectNestedPrefetchRequests$foundation();
                            }
                            List<PrefetchRequest> list2 = this.requestsByState[this.stateIndex];
                            list2.getClass();
                            while (this.requestIndex < list2.size()) {
                                PrefetchRequest prefetchRequest = list2.get(this.requestIndex);
                                if (z) {
                                    HandleAndRequestImpl handleAndRequestImpl = prefetchRequest instanceof HandleAndRequestImpl ? (HandleAndRequestImpl) prefetchRequest : null;
                                    if (handleAndRequestImpl != null) {
                                        handleAndRequestImpl.markAsUrgent();
                                    }
                                }
                                this.executedNestedPrefetch = true;
                                if (prefetchRequest.execute(prefetchRequestScope)) {
                                    return true;
                                }
                                this.requestIndex++;
                            }
                            this.requestIndex = 0;
                            this.stateIndex++;
                        } finally {
                        }
                    }
                    return false;
                } finally {
                }
            }

            public final boolean getExecutedNestedPrefetch() {
                return this.executedNestedPrefetch;
            }

            public final void setExecutedNestedPrefetch(boolean z) {
                this.executedNestedPrefetch = z;
            }
        }

        public HandleAndRequestImpl(int i, PrefetchMetrics prefetchMetrics, PriorityPrefetchScheduler priorityPrefetchScheduler, ky kyVar) {
            this.index = i;
            this.prefetchMetrics = prefetchMetrics;
            this.priorityPrefetchScheduler = priorityPrefetchScheduler;
            this.onItemPremeasured = kyVar;
            int i2 = z90.b;
            this.startTime = System.nanoTime() - z90.a;
        }

        private final void cleanUp() {
            SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.pausedPrecomposition;
            if (pausedPrecomposition != null) {
                pausedPrecomposition.cancel();
            }
            this.pausedPrecomposition = null;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.precomposeHandle = null;
            this.nestedPrefetchController = null;
        }

        private final boolean executeRequest(PrefetchRequestScope prefetchRequestScope) {
            AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", getIndex());
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) PrefetchHandleProvider.this.itemContentFactory.getItemProvider().invoke();
            if (!this.isCanceled) {
                int itemCount = lazyLayoutItemProvider.getItemCount();
                int index = getIndex();
                if (index >= 0 && index < itemCount) {
                    Object key = lazyLayoutItemProvider.getKey(getIndex());
                    Object obj = this.keyUsedForComposition;
                    if (obj != null && !q10.b(key, obj)) {
                        cleanUp();
                        return false;
                    }
                    Object contentType = lazyLayoutItemProvider.getContentType(getIndex());
                    Averages average = this.prefetchMetrics.getAverage(contentType);
                    boolean isComposed = isComposed();
                    resetAvailableTimeTo(prefetchRequestScope.availableTimeNanos());
                    if (!isComposed()) {
                        boolean z = ComposeFoundationFlags.isPausableCompositionInPrefetchEnabled;
                        long j = this.availableTimeNanos;
                        if (z) {
                            if (shouldExecute(j, average.getResumeTimeNanos() + average.getPauseTimeNanos())) {
                                Trace.beginSection("compose:lazy:prefetch:compose");
                                try {
                                    performPausableComposition(prefetchRequestScope, key, contentType, average);
                                } finally {
                                }
                            }
                        } else if (shouldExecute(j, average.getCompositionTimeNanos())) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                performFullComposition(key, contentType);
                                Trace.endSection();
                                updateElapsedAndAvailableTime();
                                average.saveCompositionTimeNanos(this.elapsedTimeNanos);
                            } finally {
                            }
                        }
                        if (!isComposed()) {
                            return true;
                        }
                    }
                    if (this.pausedPrecomposition != null) {
                        if (!shouldExecute(this.availableTimeNanos, average.getApplyTimeNanos())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            performApply();
                            Trace.endSection();
                            updateElapsedAndAvailableTime();
                            average.saveApplyTimeNanos(this.elapsedTimeNanos);
                        } finally {
                        }
                    }
                    if (!this.hasResolvedNestedPrefetches) {
                        if (this.availableTimeNanos <= 0) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.nestedPrefetchController = resolveNestedPrefetchStates();
                            this.hasResolvedNestedPrefetches = true;
                        } finally {
                        }
                    }
                    NestedPrefetchController nestedPrefetchController = this.nestedPrefetchController;
                    if (nestedPrefetchController != null ? nestedPrefetchController.executeNestedPrefetches(prefetchRequestScope, average.getNestedPrefetchCount(), this.isUrgent) : false) {
                        return true;
                    }
                    NestedPrefetchController nestedPrefetchController2 = this.nestedPrefetchController;
                    if (nestedPrefetchController2 != null && nestedPrefetchController2.getExecutedNestedPrefetch()) {
                        updateElapsedAndAvailableTime();
                        AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", getIndex());
                        NestedPrefetchController nestedPrefetchController3 = this.nestedPrefetchController;
                        if (nestedPrefetchController3 != null) {
                            nestedPrefetchController3.setExecutedNestedPrefetch(false);
                        }
                    }
                    Constraints constraints = this.premeasureConstraints;
                    if (!this.isMeasured && constraints != null) {
                        if ((PrefetchHandleProvider.this.getShouldPauseBetweenPrecompositionAndPremeasure$foundation() && !isComposed) || !shouldExecute(this.availableTimeNanos, average.getMeasureTimeNanos())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            m951performMeasureBRTryo0(constraints.m7570unboximpl());
                            Trace.endSection();
                            updateElapsedAndAvailableTime();
                            average.saveMeasureTimeNanos(this.elapsedTimeNanos);
                            ky kyVar = this.onItemPremeasured;
                            if (kyVar != null) {
                                kyVar.invoke(this);
                            }
                        } finally {
                        }
                    }
                    NestedPrefetchController nestedPrefetchController4 = this.nestedPrefetchController;
                    if (this.isMeasured && this.hasResolvedNestedPrefetches && nestedPrefetchController4 != null) {
                        int collectIdealNestedPrefetchCount = nestedPrefetchController4.collectIdealNestedPrefetchCount();
                        average.saveNestedPrefetchCount(collectIdealNestedPrefetchCount);
                        if (nestedPrefetchController4.collectNestedPrefetchedItemsCount() < collectIdealNestedPrefetchCount) {
                            average.clearMeasureTime();
                        }
                    }
                    return false;
                }
            }
            cleanUp();
            return false;
        }

        private final boolean isComposed() {
            SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition;
            return this.isApplied || ((pausedPrecomposition = this.pausedPrecomposition) != null && pausedPrecomposition.isComplete());
        }

        private final void performApply() {
            SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.pausedPrecomposition;
            if (pausedPrecomposition == null) {
                o.m("Nothing to apply!");
                return;
            }
            this.precomposeHandle = pausedPrecomposition.apply();
            this.pausedPrecomposition = null;
            this.isApplied = true;
        }

        private final void performFullComposition(Object obj, Object obj2) {
            if (!(this.precomposeHandle == null)) {
                InlineClassHelperKt.throwIllegalArgumentException("Request was already composed!");
            }
            my content = PrefetchHandleProvider.this.itemContentFactory.getContent(getIndex(), obj, obj2);
            this.keyUsedForComposition = obj;
            this.precomposeHandle = PrefetchHandleProvider.this.subcomposeLayoutState.precompose(obj, content);
            this.isApplied = true;
        }

        /* renamed from: performMeasure-BRTryo0, reason: not valid java name */
        private final void m951performMeasureBRTryo0(long j) {
            if (this.isCanceled) {
                InlineClassHelperKt.throwIllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.isMeasured) {
                InlineClassHelperKt.throwIllegalArgumentException("Request was already measured!");
            }
            this.isMeasured = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("performComposition() must be called before performMeasure()");
                o.j();
                return;
            }
            int placeablesCount = precomposedSlotHandle.getPlaceablesCount();
            for (int i = 0; i < placeablesCount; i++) {
                precomposedSlotHandle.mo6262premeasure0kLqBqw(i, j);
            }
        }

        private final void performPausableComposition(PrefetchRequestScope prefetchRequestScope, Object obj, Object obj2, final Averages averages) {
            SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.pausedPrecomposition;
            if (pausedPrecomposition == null) {
                PrefetchHandleProvider prefetchHandleProvider = PrefetchHandleProvider.this;
                pausedPrecomposition = prefetchHandleProvider.subcomposeLayoutState.createPausedPrecomposition(obj, prefetchHandleProvider.itemContentFactory.getContent(getIndex(), obj, obj2));
                this.pausedPrecomposition = pausedPrecomposition;
                this.keyUsedForComposition = obj;
            }
            this.pauseRequested = false;
            while (!pausedPrecomposition.isComplete() && !this.pauseRequested) {
                pausedPrecomposition.resume(new ShouldPauseCallback() { // from class: androidx.compose.foundation.lazy.layout.i
                    @Override // androidx.compose.runtime.ShouldPauseCallback
                    public final boolean shouldPause() {
                        boolean performPausableComposition$lambda$1;
                        performPausableComposition$lambda$1 = PrefetchHandleProvider.HandleAndRequestImpl.performPausableComposition$lambda$1(PrefetchHandleProvider.HandleAndRequestImpl.this, averages);
                        return performPausableComposition$lambda$1;
                    }
                });
            }
            updateElapsedAndAvailableTime();
            boolean z = this.pauseRequested;
            long j = this.elapsedTimeNanos;
            if (z) {
                averages.savePauseTimeNanos(j);
            } else {
                averages.saveResumeTimeNanos(j);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean performPausableComposition$lambda$1(HandleAndRequestImpl handleAndRequestImpl, Averages averages) {
            boolean z = handleAndRequestImpl.pauseRequested;
            if (z) {
                return z;
            }
            handleAndRequestImpl.updateElapsedAndAvailableTime();
            averages.saveResumeTimeNanos(handleAndRequestImpl.elapsedTimeNanos);
            boolean z2 = !handleAndRequestImpl.shouldExecute(handleAndRequestImpl.availableTimeNanos, averages.getPauseTimeNanos() + averages.getResumeTimeNanos());
            handleAndRequestImpl.pauseRequested = z2;
            return z2;
        }

        private final void resetAvailableTimeTo(long j) {
            this.availableTimeNanos = j;
            int i = z90.b;
            this.startTime = System.nanoTime() - z90.a;
            this.elapsedTimeNanos = 0L;
            AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", j);
        }

        private final NestedPrefetchController resolveNestedPrefetchStates() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Should precompose before resolving nested prefetch states");
                o.j();
                return null;
            }
            ji0 ji0Var = new ji0();
            precomposedSlotHandle.traverseDescendants("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new d(ji0Var, 3));
            List list = (List) ji0Var.d;
            if (list != null) {
                return new NestedPrefetchController(list);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TraversableNode.Companion.TraverseDescendantsAction resolveNestedPrefetchStates$lambda$1(ji0 ji0Var, TraversableNode traversableNode) {
            traversableNode.getClass();
            LazyLayoutPrefetchState prefetchState = ((TraversablePrefetchStateNode) traversableNode).getPrefetchState();
            List list = (List) ji0Var.d;
            if (list != null) {
                list.add(prefetchState);
            } else {
                list = y80.G(prefetchState);
            }
            ji0Var.d = list;
            return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }

        private final boolean shouldExecute(long j, long j2) {
            if (this.isUrgent) {
                j2 = 0;
            }
            return j > j2;
        }

        private final void updateElapsedAndAvailableTime() {
            long L;
            int i = z90.b;
            long nanoTime = System.nanoTime() - z90.a;
            long j = this.startTime;
            long j2 = 0;
            if (((j - 1) | 1) != SnapshotId_jvmKt.SnapshotIdMax) {
                if ((1 | (nanoTime - 1)) == SnapshotId_jvmKt.SnapshotIdMax) {
                    L = nanoTime < 0 ? ps.e : ps.d;
                } else {
                    long j3 = nanoTime - j;
                    long j4 = (~(j3 ^ j)) & (j3 ^ nanoTime);
                    rs rsVar = rs.NANOSECONDS;
                    if (j4 < 0) {
                        rs rsVar2 = rs.MILLISECONDS;
                        if (rsVar.compareTo(rsVar2) < 0) {
                            long j5 = (nanoTime / AnimationKt.MillisToNanos) - (j / AnimationKt.MillisToNanos);
                            long j6 = (nanoTime % AnimationKt.MillisToNanos) - (j % AnimationKt.MillisToNanos);
                            int i2 = ps.f;
                            long L2 = d41.L(j5, rsVar2);
                            L = d41.L(j6, rsVar);
                            if (ps.b(L2)) {
                                if (!ps.b(L) || (L ^ L2) >= 0) {
                                    j2 = L2;
                                } else {
                                    o.m("Summing infinite durations of different signs yields an undefined result.");
                                }
                            } else if (!ps.b(L)) {
                                int i3 = ((int) L2) & 1;
                                if (i3 == (((int) L) & 1)) {
                                    long j7 = (L2 >> 1) + (L >> 1);
                                    if (i3 != 0) {
                                        L = d41.v(j7);
                                    } else if (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) {
                                        L = d41.u(j7 / AnimationKt.MillisToNanos);
                                    } else {
                                        L = j7 << 1;
                                        int i4 = qs.a;
                                    }
                                } else {
                                    L = i3 == 1 ? ps.a(L2 >> 1, L >> 1) : ps.a(L >> 1, L2 >> 1);
                                }
                            }
                        } else {
                            j2 = ps.c(j3 < 0 ? ps.e : ps.d);
                        }
                    } else {
                        j2 = d41.L(j3, rsVar);
                    }
                }
                j2 = L;
            } else if (nanoTime == j) {
                int i5 = ps.f;
            } else {
                j2 = ps.c(j < 0 ? ps.e : ps.d);
            }
            long j8 = j2 >> 1;
            int i6 = ps.f;
            long j9 = (((int) j2) & 1) == 0 ? j8 : j8 > 9223372036854L ? SnapshotId_jvmKt.SnapshotIdMax : j8 < -9223372036854L ? Long.MIN_VALUE : j8 * AnimationKt.MillisToNanos;
            this.elapsedTimeNanos = j9;
            long j10 = this.availableTimeNanos - j9;
            this.availableTimeNanos = j10;
            this.startTime = nanoTime;
            AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", j10);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            cleanUp();
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequest
        public boolean execute(PrefetchRequestScope prefetchRequestScope) {
            boolean executeRequest;
            if (!PrefetchHandleProvider.this.isStateActive) {
                return false;
            }
            if (this.isUrgent) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    executeRequest = executeRequest(prefetchRequestScope);
                } finally {
                    Trace.endSection();
                }
            } else {
                executeRequest = executeRequest(prefetchRequestScope);
            }
            AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", -1L);
            return executeRequest;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope
        public int getIndex() {
            return this.index;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope
        public int getPlaceablesCount() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle != null) {
                return precomposedSlotHandle.getPlaceablesCount();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope
        /* renamed from: getSize-YEO4UFw */
        public long mo937getSizeYEO4UFw(int i) {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            return precomposedSlotHandle != null ? precomposedSlotHandle.mo6261getSizeYEO4UFw(i) : IntSize.Companion.m7787getZeroYbymL2g();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void markAsUrgent() {
            this.isUrgent = true;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + getIndex() + ", constraints = " + this.premeasureConstraints + ", isComposed = " + isComposed() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }

        public /* synthetic */ HandleAndRequestImpl(PrefetchHandleProvider prefetchHandleProvider, int i, long j, PrefetchMetrics prefetchMetrics, PriorityPrefetchScheduler priorityPrefetchScheduler, ky kyVar, dq dqVar) {
            this(prefetchHandleProvider, i, j, prefetchMetrics, priorityPrefetchScheduler, kyVar);
        }

        private HandleAndRequestImpl(PrefetchHandleProvider prefetchHandleProvider, int i, long j, PrefetchMetrics prefetchMetrics, PriorityPrefetchScheduler priorityPrefetchScheduler, ky kyVar) {
            this(i, prefetchMetrics, priorityPrefetchScheduler, kyVar);
            this.premeasureConstraints = Constraints.m7551boximpl(j);
        }
    }
}
