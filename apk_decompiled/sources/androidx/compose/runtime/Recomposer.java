package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot;
import androidx.compose.runtime.snapshots.TransparentObserverSnapshot;
import androidx.compose.runtime.tooling.ComposeStackTraceMode;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.CompositionObserverKt;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import androidx.compose.runtime.tooling.ObservableComposition;
import defpackage.b20;
import defpackage.bo0;
import defpackage.bu;
import defpackage.cd0;
import defpackage.cq;
import defpackage.d41;
import defpackage.dd0;
import defpackage.dj;
import defpackage.dq;
import defpackage.er;
import defpackage.fb0;
import defpackage.fg;
import defpackage.gb0;
import defpackage.gg;
import defpackage.h20;
import defpackage.hm;
import defpackage.i20;
import defpackage.iw;
import defpackage.iy;
import defpackage.kb0;
import defpackage.kn;
import defpackage.ky;
import defpackage.mb0;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.p10;
import defpackage.pj;
import defpackage.pl0;
import defpackage.q10;
import defpackage.rl0;
import defpackage.sl0;
import defpackage.sw;
import defpackage.te0;
import defpackage.ts;
import defpackage.uc0;
import defpackage.ur0;
import defpackage.ut;
import defpackage.v4;
import defpackage.vn;
import defpackage.w01;
import defpackage.wr0;
import defpackage.xa0;
import defpackage.xe0;
import defpackage.y80;
import defpackage.yi;
import defpackage.z10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final kb0 _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final MutableVector<ControlledComposition> compositionInvalidations;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private gb0 compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final kn effectCoroutineContext;
    private final pj effectJob;
    private kb0 errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final List<MovableContentStateReference> movableContentAwaitingInsert;
    private final fb0 movableContentNestedExtractionsPending;
    private final NestedContentMap movableContentNestedStatesAvailable;
    private final fb0 movableContentRemoved;
    private final fb0 movableContentStatesAvailable;
    private final NextFrameEndCallbackQueue nextFrameEndCallbackQueue;
    private final SnapshotThreadLocal<gb0> pausedScopes;
    private final RecomposerInfoImpl recomposerInfo;
    private xa0 registrationObservers;
    private z10 runnerJob;
    private gb0 snapshotInvalidations;
    private final Object stateLock;
    private fg workContinuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final kb0 _runningRecomposers = p10.b(ExtensionsKt.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class HotReloadable {
        private my composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m3835getLambda$1091980426$runtime());
            }
        }

        public final void recompose() {
            if (this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RecomposerErrorState implements RecomposerErrorInfo, RecomposerErrorInformation {
        private final Throwable cause;
        private final boolean isRecoverable;

        public RecomposerErrorState(Throwable th, boolean z) {
            this.cause = th;
            this.isRecoverable = z;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo, androidx.compose.runtime.RecomposerErrorInformation
        public Throwable getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return isRecoverable();
        }

        @Override // androidx.compose.runtime.RecomposerErrorInformation
        public boolean isRecoverable() {
            return this.isRecoverable;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class State {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ShutDown = new State("ShutDown", 0);
        public static final State ShuttingDown = new State("ShuttingDown", 1);
        public static final State Inactive = new State("Inactive", 2);
        public static final State InactivePendingWork = new State("InactivePendingWork", 3);
        public static final State Idle = new State("Idle", 4);
        public static final State PendingWork = new State("PendingWork", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private State(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public Recomposer(kn knVar) {
        final int i = 0;
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new iy(this) { // from class: bi0
            public final /* synthetic */ Recomposer e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                w01 broadcastFrameClock$lambda$0;
                w01 nextFrameEndCallbackQueue$lambda$0;
                int i2 = i;
                Recomposer recomposer = this.e;
                switch (i2) {
                    case 0:
                        broadcastFrameClock$lambda$0 = Recomposer.broadcastFrameClock$lambda$0(recomposer);
                        return broadcastFrameClock$lambda$0;
                    default:
                        nextFrameEndCallbackQueue$lambda$0 = Recomposer.nextFrameEndCallbackQueue$lambda$0(recomposer);
                        return nextFrameEndCallbackQueue$lambda$0;
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        final int i2 = 1;
        this.nextFrameEndCallbackQueue = new NextFrameEndCallbackQueue(new iy(this) { // from class: bi0
            public final /* synthetic */ Recomposer e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                w01 broadcastFrameClock$lambda$0;
                w01 nextFrameEndCallbackQueue$lambda$0;
                int i22 = i2;
                Recomposer recomposer = this.e;
                switch (i22) {
                    case 0:
                        broadcastFrameClock$lambda$0 = Recomposer.broadcastFrameClock$lambda$0(recomposer);
                        return broadcastFrameClock$lambda$0;
                    default:
                        nextFrameEndCallbackQueue$lambda$0 = Recomposer.nextFrameEndCallbackQueue$lambda$0(recomposer);
                        return nextFrameEndCallbackQueue$lambda$0;
                }
            }
        });
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new gb0();
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m3895constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = new fb0();
        this.movableContentNestedExtractionsPending = MultiValueMap.m3895constructorimpl$default(null, 1, null);
        this.errorState = p10.b(null);
        this._state = p10.b(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal<>();
        b20 b20Var = new b20((z10) knVar.get(ts.l));
        b20Var.h(new mb0(this, 9));
        this.effectJob = b20Var;
        this.effectCoroutineContext = knVar.plus(broadcastFrameClock).plus(b20Var);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void addKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.add(controlledComposition);
        this._knownCompositionsCache = null;
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(hm hmVar) {
        gg ggVar;
        if (getHasSchedulingWork()) {
            return w01.a;
        }
        gg ggVar2 = new gg(1, d41.C(hmVar));
        ggVar2.u();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                ggVar = ggVar2;
            } else {
                this.workContinuation = ggVar2;
                ggVar = null;
            }
        }
        if (ggVar != null) {
            ggVar.resumeWith(w01.a);
        }
        Object s = ggVar2.s();
        return s == vn.d ? s : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 broadcastFrameClock$lambda$0(Recomposer recomposer) {
        recomposer.onNewFrameAwaiter();
        return w01.a;
    }

    private final void clearKnownCompositionsLocked() {
        List<ControlledComposition> knownCompositionsLocked = knownCompositionsLocked();
        int size = knownCompositionsLocked.size();
        for (int i = 0; i < size; i++) {
            unregisterCompositionLocked(knownCompositionsLocked.get(i));
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = ut.d;
    }

    private final <T> T composing(ControlledComposition controlledComposition, gb0 gb0Var, iy iyVar) {
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, gb0Var));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            try {
                return (T) iyVar.invoke();
            } finally {
                takeMutableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            applyAndCheck(takeMutableSnapshot);
        }
    }

    private static final void deletedMovableContent$lambda$0$recordNestedStatesOf(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List<MovableContentStateReference> nestedReferences$runtime = movableContentStateReference2.getNestedReferences$runtime();
        if (nestedReferences$runtime != null) {
            int size = nestedReferences$runtime.size();
            for (int i = 0; i < size; i++) {
                MovableContentStateReference movableContentStateReference3 = nestedReferences$runtime.get(i);
                recomposer.movableContentNestedStatesAvailable.add(movableContentStateReference3.getContent$runtime(), new NestedMovableContent(movableContentStateReference3, movableContentStateReference));
                deletedMovableContent$lambda$0$recordNestedStatesOf(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fg deriveStateLocked() {
        State state;
        if (((State) ((wr0) this._state).getValue()).compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new gb0();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            fg fgVar = this.workContinuation;
            if (fgVar != null) {
                fgVar.l(null);
            }
            this.workContinuation = null;
            ((wr0) this.errorState).i(null);
            return null;
        }
        if (((wr0) this.errorState).getValue() != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new gb0();
            this.compositionInvalidations.clear();
            state = (getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked()) ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.c() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !getHasBroadcastFrameClockAwaitersLocked() && !getHasNextFrameEndAwaitersLocked() && !MultiValueMap.m3904isNotEmptyimpl(this.movableContentRemoved)) ? State.Idle : State.PendingWork;
        }
        ((wr0) this._state).i(state);
        if (state != State.PendingWork) {
            return null;
        }
        fg fgVar2 = this.workContinuation;
        this.workContinuation = null;
        return fgVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        int i;
        xa0 xa0Var;
        synchronized (this.stateLock) {
            try {
                if (MultiValueMap.m3904isNotEmptyimpl(this.movableContentRemoved)) {
                    cd0 m3909valuesimpl = MultiValueMap.m3909valuesimpl(this.movableContentRemoved);
                    MultiValueMap.m3893clearimpl(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.clear();
                    MultiValueMap.m3893clearimpl(this.movableContentNestedExtractionsPending);
                    xa0Var = new xa0(m3909valuesimpl.b);
                    Object[] objArr = m3909valuesimpl.a;
                    int i2 = m3909valuesimpl.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i3];
                        xa0Var.g(new xe0(movableContentStateReference, this.movableContentStatesAvailable.d(movableContentStateReference)));
                    }
                    this.movableContentStatesAvailable.f();
                } else {
                    xa0Var = dd0.b;
                    xa0Var.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = xa0Var.a;
        int i4 = xa0Var.b;
        for (i = 0; i < i4; i++) {
            xe0 xe0Var = (xe0) objArr2[i];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) xe0Var.d;
            MovableContentState movableContentState = (MovableContentState) xe0Var.e;
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 effectJob$lambda$0$0(Recomposer recomposer, Throwable th) {
        fg fgVar;
        fg fgVar2;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th);
        synchronized (recomposer.stateLock) {
            try {
                z10 z10Var = recomposer.runnerJob;
                fgVar = null;
                if (z10Var != null) {
                    ((wr0) recomposer._state).i(State.ShuttingDown);
                    if (recomposer.isClosed) {
                        fgVar2 = recomposer.workContinuation;
                        if (fgVar2 != null) {
                            recomposer.workContinuation = null;
                            z10Var.h(new te0(2, recomposer, th));
                            fgVar = fgVar2;
                        }
                    } else {
                        z10Var.cancel(cancellationException);
                    }
                    fgVar2 = null;
                    recomposer.workContinuation = null;
                    z10Var.h(new te0(2, recomposer, th));
                    fgVar = fgVar2;
                } else {
                    recomposer.closeCause = cancellationException;
                    ((wr0) recomposer._state).i(State.ShutDown);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (fgVar != null) {
            fgVar.resumeWith(w01.a);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 effectJob$lambda$0$0$0$0(Recomposer recomposer, Throwable th, Throwable th2) {
        synchronized (recomposer.stateLock) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                try {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        d41.c(th, th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            recomposer.closeCause = th;
            ((wr0) recomposer._state).i(State.ShutDown);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked() || MultiValueMap.m3904isNotEmptyimpl(this.movableContentRemoved);
    }

    private final boolean getHasNextFrameEndAwaitersLocked() {
        return !this.frameClockPaused && this.nextFrameEndCallbackQueue.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.c() && this.compositionInvalidations.getSize() == 0 && !getHasBroadcastFrameClockAwaitersLocked()) {
                z = getHasNextFrameEndAwaitersLocked();
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (!z) {
            return true;
        }
        i20 i20Var = (i20) this.effectJob;
        i20Var.getClass();
        bo0 y = p10.y(new h20(null, i20Var));
        while (y.hasNext()) {
            if (((z10) y.next()).isActive()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositions() {
        List<ControlledComposition> knownCompositionsLocked;
        synchronized (this.stateLock) {
            knownCompositionsLocked = knownCompositionsLocked();
        }
        return knownCompositionsLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositionsLocked() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        List<ControlledComposition> list2 = this._knownCompositions;
        List<ControlledComposition> arrayList = list2.isEmpty() ? ut.d : new ArrayList(list2);
        this._knownCompositionsCache = arrayList;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 nextFrameEndCallbackQueue$lambda$0(Recomposer recomposer) {
        recomposer.onNewFrameAwaiter();
        return w01.a;
    }

    private final void onNewFrameAwaiter() {
        fg deriveStateLocked;
        synchronized (this.stateLock) {
            deriveStateLocked = deriveStateLocked();
            if (((State) ((wr0) this._state).getValue()).compareTo(State.ShuttingDown) <= 0) {
                Throwable th = this.closeCause;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (deriveStateLocked != null) {
            deriveStateLocked.resumeWith(w01.a);
        }
    }

    private final void performInitialMovableContentInserts(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (q10.b(list.get(i).getComposition$runtime(), controlledComposition)) {
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<MovableContentStateReference> it = recomposer.movableContentAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference next = it.next();
                if (q10.b(next.getComposition$runtime(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0136, code lost:
    
        if (r4 >= r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
    
        if (((defpackage.xe0) r10.get(r4)).e == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0153, code lost:
    
        if (r9 >= r4) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0155, code lost:
    
        r11 = (defpackage.xe0) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
    
        if (r11.e != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015f, code lost:
    
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0167, code lost:
    
        if (r11 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0169, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016c, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0166, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        r4 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0171, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0172, code lost:
    
        defpackage.dj.d0(r16.movableContentAwaitingInsert, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0177, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0178, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0186, code lost:
    
        if (r9 >= r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0191, code lost:
    
        if (((defpackage.xe0) r11).e == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0193, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0196, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0199, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> list, gb0 gb0Var) {
        ArrayList arrayList;
        NestedMovableContent removeLast;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MovableContentStateReference movableContentStateReference = list.get(i);
            ControlledComposition composition$runtime = movableContentStateReference.getComposition$runtime();
            Object obj = hashMap.get(composition$runtime);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(composition$runtime, obj);
            }
            ((ArrayList) obj).add(movableContentStateReference);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list2 = (List) entry.getValue();
            if (controlledComposition.isComposing()) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, gb0Var));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list2.get(i2);
                                Object m3906removeLastimpl = MultiValueMap.m3906removeLastimpl(this.movableContentRemoved, movableContentStateReference2.getContent$runtime());
                                MovableContentStateReference movableContentStateReference3 = (MovableContentStateReference) m3906removeLastimpl;
                                if (movableContentStateReference3 != null) {
                                    this.movableContentNestedStatesAvailable.usedContainer(movableContentStateReference3);
                                }
                                arrayList.add(new xe0(movableContentStateReference2, m3906removeLastimpl));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                xe0 xe0Var = (xe0) arrayList.get(i3);
                                if (xe0Var.e == null && this.movableContentNestedStatesAvailable.contains(((MovableContentStateReference) xe0Var.d).getContent$runtime())) {
                                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                                    int size4 = arrayList.size();
                                    for (int i4 = 0; i4 < size4; i4++) {
                                        xe0 xe0Var2 = (xe0) arrayList.get(i4);
                                        if (xe0Var2.e == null && (removeLast = this.movableContentNestedStatesAvailable.removeLast(((MovableContentStateReference) xe0Var2.d).getContent$runtime())) != null) {
                                            MovableContentStateReference content = removeLast.getContent();
                                            MultiValueMap.m3891addimpl(this.movableContentNestedExtractionsPending, removeLast.getContainer(), content);
                                            xe0Var2 = new xe0(xe0Var2.d, content);
                                        }
                                        arrayList2.add(xe0Var2);
                                    }
                                    arrayList = arrayList2;
                                } else {
                                    i3++;
                                }
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((xe0) arrayList.get(i5)).e != null) {
                            break;
                        }
                        i5++;
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                } catch (Throwable th) {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        }
        return yi.I0(hashMap.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(ControlledComposition controlledComposition, gb0 gb0Var) {
        if (controlledComposition.isComposing() || controlledComposition.isDisposed()) {
            return null;
        }
        gb0 gb0Var2 = this.compositionsRemoved;
        if (gb0Var2 != null && gb0Var2.a(controlledComposition)) {
            return null;
        }
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, gb0Var));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            if (gb0Var != null) {
                try {
                    if (gb0Var.c()) {
                        controlledComposition.prepareCompose(new v4(27, gb0Var, controlledComposition));
                    }
                } catch (Throwable th) {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            }
            boolean recompose = controlledComposition.recompose();
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            if (recompose) {
                return controlledComposition;
            }
            return null;
        } finally {
            applyAndCheck(takeMutableSnapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 performRecompose$lambda$0$0(gb0 gb0Var, ControlledComposition controlledComposition) {
        Object[] objArr = gb0Var.b;
        long[] jArr = gb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            controlledComposition.recordWriteOf(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return w01.a;
    }

    private final void processCompositionError(Throwable th, ControlledComposition controlledComposition, boolean z) {
        if (!_hotReloadEnabled.get().booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                Utils_androidKt.logError("Error was captured in composition.", th);
                RecomposerErrorState recomposerErrorState = (RecomposerErrorState) ((wr0) this.errorState).getValue();
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                kb0 kb0Var = this.errorState;
                RecomposerErrorState recomposerErrorState2 = new RecomposerErrorState(th, false);
                wr0 wr0Var = (wr0) kb0Var;
                wr0Var.getClass();
                wr0Var.j(null, recomposerErrorState2);
            }
            throw th;
        }
        synchronized (this.stateLock) {
            try {
                Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", th);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new gb0();
                this.movableContentAwaitingInsert.clear();
                MultiValueMap.m3893clearimpl(this.movableContentRemoved);
                this.movableContentStatesAvailable.f();
                kb0 kb0Var2 = this.errorState;
                RecomposerErrorState recomposerErrorState3 = new RecomposerErrorState(th, z);
                wr0 wr0Var2 = (wr0) kb0Var2;
                wr0Var2.getClass();
                wr0Var2.j(null, recomposerErrorState3);
                if (controlledComposition != null) {
                    recordFailedCompositionLocked(controlledComposition);
                }
                if (deriveStateLocked() != null) {
                    ComposerKt.composeImmediateRuntimeError("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th, ControlledComposition controlledComposition, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(th, controlledComposition, z);
    }

    private final ky readObserverOf(ControlledComposition controlledComposition) {
        return new mb0(controlledComposition, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 readObserverOf$lambda$0(ControlledComposition controlledComposition, Object obj) {
        controlledComposition.recordReadOf(obj);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(ny nyVar, hm hmVar) {
        Object H = p01.H(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, nyVar, MonotonicFrameClockKt.getMonotonicFrameClock(hmVar.getContext()), null), hmVar);
        return H == vn.d ? H : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.b()) {
                return getHasFrameWorkLocked();
            }
            List<ControlledComposition> knownCompositionsLocked = knownCompositionsLocked();
            Set<? extends Object> wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            this.snapshotInvalidations = new gb0();
            try {
                int size = knownCompositionsLocked.size();
                for (int i = 0; i < size; i++) {
                    knownCompositionsLocked.get(i).recordModificationsOf(wrapIntoSet);
                    if (((State) ((wr0) this._state).getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    gb0 gb0Var = this.snapshotInvalidations;
                    Set<? extends Object> set = wrapIntoSet;
                    gb0Var.getClass();
                    set.getClass();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        gb0Var.l(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition controlledComposition) {
        List list = this.failedCompositions;
        if (list == null) {
            list = new ArrayList();
            this.failedCompositions = list;
        }
        if (!list.contains(controlledComposition)) {
            list.add(controlledComposition);
        }
        removeKnownCompositionLocked(controlledComposition);
    }

    private final void registerCompositionLocked(ControlledComposition controlledComposition) {
        xa0 xa0Var = this.registrationObservers;
        if (xa0Var != null) {
            Object[] objArr = xa0Var.a;
            int i = xa0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i2];
                if (controlledComposition instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionRegistered((ObservableComposition) controlledComposition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(z10 z10Var) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (((State) ((wr0) this._state).getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = z10Var;
            if (deriveStateLocked() != null) {
                ComposerKt.composeImmediateRuntimeError("called outside of runRecomposeAndApplyChanges");
            }
        }
    }

    private final void removeKnownCompositionLocked(ControlledComposition controlledComposition) {
        if (this._knownCompositions.remove(controlledComposition)) {
            this._knownCompositionsCache = null;
            unregisterCompositionLocked(controlledComposition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        Object value;
        fg fgVar;
        synchronized (this.stateLock) {
            value = ((wr0) this.errorState).getValue();
            fgVar = null;
            if (value != null) {
                ((wr0) this.errorState).i(null);
                fgVar = deriveStateLocked();
            }
        }
        if (fgVar != null) {
            fgVar.resumeWith(w01.a);
        }
        return (RecomposerErrorState) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        int i;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (true) {
            i = 0;
            try {
                if (list.isEmpty()) {
                    break;
                }
                ControlledComposition controlledComposition = (ControlledComposition) dj.k0(list);
                if (controlledComposition instanceof CompositionImpl) {
                    ((CompositionImpl) controlledComposition).invalidateAll();
                    ((CompositionImpl) controlledComposition).setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (((wr0) this.errorState).getValue() != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        int size = list.size();
                        while (i < size) {
                            recordFailedCompositionLocked(list.get(i));
                            i++;
                        }
                    }
                }
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.stateLock) {
            int size2 = list.size();
            while (i < size2) {
                recordFailedCompositionLocked(list.get(i));
                i++;
            }
        }
    }

    private final void unregisterCompositionLocked(ControlledComposition controlledComposition) {
        xa0 xa0Var = this.registrationObservers;
        if (xa0Var != null) {
            Object[] objArr = xa0Var.a;
            int i = xa0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i2];
                if (controlledComposition instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionUnregistered((ObservableComposition) controlledComposition);
                }
            }
        }
    }

    private final void withTransparentSnapshot(iy iyVar) {
        Snapshot current = Snapshot.Companion.getCurrent();
        Snapshot transparentObserverMutableSnapshot = current instanceof MutableSnapshot ? new TransparentObserverMutableSnapshot((MutableSnapshot) current, null, null, true, false) : new TransparentObserverSnapshot(current, null, true, false);
        try {
            Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
            try {
                iyVar.invoke();
                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                transparentObserverMutableSnapshot.dispose();
            } catch (Throwable th) {
                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                throw th;
            }
        } catch (Throwable th2) {
            transparentObserverMutableSnapshot.dispose();
            throw th2;
        }
    }

    private final ky writeObserverOf(ControlledComposition controlledComposition, gb0 gb0Var) {
        return new te0(3, controlledComposition, gb0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 writeObserverOf$lambda$0(ControlledComposition controlledComposition, gb0 gb0Var, Object obj) {
        controlledComposition.recordWriteOf(obj);
        if (gb0Var != null) {
            gb0Var.d(obj);
        }
        return w01.a;
    }

    public final CompositionObserverHandle addCompositionRegistrationObserver$runtime(final CompositionRegistrationObserver compositionRegistrationObserver) {
        synchronized (this.stateLock) {
            try {
                xa0 xa0Var = this.registrationObservers;
                if (xa0Var == null) {
                    xa0Var = new xa0();
                    this.registrationObservers = xa0Var;
                }
                xa0Var.g(compositionRegistrationObserver);
                List<ControlledComposition> list = this._knownCompositions;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ControlledComposition controlledComposition = list.get(i);
                    if (controlledComposition instanceof ObservableComposition) {
                        compositionRegistrationObserver.onCompositionRegistered((ObservableComposition) controlledComposition);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.Recomposer$addCompositionRegistrationObserver$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                xa0 xa0Var2;
                Object obj = Recomposer.this.stateLock;
                Recomposer recomposer = Recomposer.this;
                CompositionRegistrationObserver compositionRegistrationObserver2 = compositionRegistrationObserver;
                synchronized (obj) {
                    xa0Var2 = recomposer.registrationObservers;
                    if (xa0Var2 != null) {
                        xa0Var2.k(compositionRegistrationObserver2);
                    }
                }
            }
        };
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final Object awaitIdle(hm hmVar) {
        Object collect = new sw(getCurrentState(), new Recomposer$awaitIdle$2(null), 1).collect(uc0.d, hmVar);
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        if (collect != vnVar) {
            collect = w01Var;
        }
        return collect == vnVar ? collect : w01Var;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (((State) ((wr0) this._state).getValue()).compareTo(State.Idle) >= 0) {
                ((wr0) this._state).i(State.ShuttingDown);
            }
        }
        ((i20) this.effectJob).cancel(null);
    }

    public final void close() {
        if (((b20) this.effectJob).K(w01.a)) {
            synchronized (this.stateLock) {
                this.isClosed = true;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime(ControlledComposition controlledComposition, my myVar) {
        State state;
        boolean z;
        Recomposer recomposer;
        boolean isComposing = controlledComposition.isComposing();
        synchronized (this.stateLock) {
            State state2 = (State) ((wr0) this._state).getValue();
            state = State.ShuttingDown;
            if (state2.compareTo(state) > 0) {
                boolean contains = knownCompositionsLocked().contains(controlledComposition);
                z = !contains;
                if (!contains) {
                    registerCompositionLocked(controlledComposition);
                }
            } else {
                z = true;
            }
        }
        try {
            Snapshot.Companion companion = Snapshot.Companion;
            MutableSnapshot takeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, null));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    controlledComposition.composeContent(myVar);
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    applyAndCheck(takeMutableSnapshot);
                    synchronized (this.stateLock) {
                        try {
                            if (((State) ((wr0) this._state).getValue()).compareTo(state) <= 0) {
                                unregisterCompositionLocked(controlledComposition);
                            } else if (!knownCompositionsLocked().contains(controlledComposition)) {
                                addKnownCompositionLocked(controlledComposition);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!isComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    try {
                        performInitialMovableContentInserts(controlledComposition);
                        try {
                            controlledComposition.applyChanges();
                            controlledComposition.applyLateChanges();
                            if (isComposing) {
                                return;
                            }
                            companion.notifyObjectsInitialized();
                        } catch (Throwable th2) {
                            processCompositionError$default(this, th2, null, false, 6, null);
                        }
                    } catch (Throwable th3) {
                        processCompositionError(th3, controlledComposition, true);
                    }
                } catch (Throwable th4) {
                    recomposer = this;
                    try {
                        takeMutableSnapshot.restoreCurrent(makeCurrent);
                        throw th4;
                    } catch (Throwable th5) {
                        th = th5;
                        Throwable th6 = th;
                        try {
                            recomposer.applyAndCheck(takeMutableSnapshot);
                            throw th6;
                        } catch (Throwable th7) {
                            th = th7;
                            Throwable th8 = th;
                            if (z) {
                                synchronized (recomposer.stateLock) {
                                    recomposer.unregisterCompositionLocked(controlledComposition);
                                }
                            }
                            recomposer.processCompositionError(th8, controlledComposition, true);
                        }
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                recomposer = this;
            }
        } catch (Throwable th10) {
            th = th10;
            recomposer = this;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public rl0 composeInitialPaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, my myVar) {
        try {
            ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
            try {
                composeInitial$runtime(controlledComposition, myVar);
                gb0 gb0Var = this.pausedScopes.get();
                if (gb0Var == null) {
                    gb0Var = sl0.a;
                    gb0Var.getClass();
                }
                return gb0Var;
            } finally {
                controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime(MovableContentStateReference movableContentStateReference) {
        fg deriveStateLocked;
        synchronized (this.stateLock) {
            try {
                MultiValueMap.m3891addimpl(this.movableContentRemoved, movableContentStateReference.getContent$runtime(), movableContentStateReference);
                if (movableContentStateReference.getNestedReferences$runtime() != null) {
                    deletedMovableContent$lambda$0$recordNestedStatesOf(this, movableContentStateReference, movableContentStateReference);
                }
                deriveStateLocked = deriveStateLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (deriveStateLocked != null) {
            deriveStateLocked.resumeWith(w01.a);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime() {
        return ComposeStackTraceMode.m4170equalsimpl0(ComposerKt.getComposeStackTraceMode(), ComposeStackTraceMode.Companion.m4177getSourceInformationMD5MrJc());
    }

    @Override // androidx.compose.runtime.CompositionContext
    public long getCompositeKeyHashCode$runtime() {
        return 1000L;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public Composition getComposition$runtime() {
        return null;
    }

    public final ur0 getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public kn getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.c() && this.compositionInvalidations.getSize() == 0 && this.concurrentCompositionsOutstanding <= 0 && this.compositionsAwaitingApply.isEmpty() && !getHasBroadcastFrameClockAwaitersLocked() && !getHasNextFrameEndAwaitersLocked()) {
                z = MultiValueMap.m3904isNotEmptyimpl(this.movableContentRemoved);
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getStackTraceEnabled$runtime() {
        return !ComposeStackTraceMode.m4170equalsimpl0(ComposerKt.getComposeStackTraceMode(), ComposeStackTraceMode.Companion.m4176getNoneMD5MrJc());
    }

    public final iw getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime(MovableContentStateReference movableContentStateReference) {
        fg deriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(movableContentStateReference);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            deriveStateLocked.resumeWith(w01.a);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime(ControlledComposition controlledComposition) {
        fg fgVar;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(controlledComposition)) {
                fgVar = null;
            } else {
                this.compositionInvalidations.add(controlledComposition);
                fgVar = deriveStateLocked();
            }
        }
        if (fgVar != null) {
            fgVar.resumeWith(w01.a);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
        fg deriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.d(recomposeScopeImpl);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            deriveStateLocked.resumeWith(w01.a);
        }
    }

    public final Object join(hm hmVar) {
        Object p = cq.p(getCurrentState(), new Recomposer$join$2(null), hmVar);
        return p == vn.d ? p : w01.a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier<?> applier) {
        synchronized (this.stateLock) {
            this.movableContentStatesAvailable.l(movableContentStateReference, movableContentState);
            cd0 m3901getimpl = MultiValueMap.m3901getimpl(this.movableContentNestedExtractionsPending, movableContentStateReference);
            if (m3901getimpl.e()) {
                pl0 extractNestedStates = movableContentState.getSlotStorage$runtime().extractNestedStates(applier, m3901getimpl);
                Object[] objArr = extractNestedStates.b;
                Object[] objArr2 = extractNestedStates.c;
                long[] jArr = extractNestedStates.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = objArr[i4];
                                    this.movableContentStatesAvailable.l((MovableContentStateReference) obj, (MovableContentState) objArr2[i4]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference) {
        MovableContentState movableContentState;
        synchronized (this.stateLock) {
            movableContentState = (MovableContentState) this.movableContentStatesAvailable.j(movableContentStateReference);
        }
        return movableContentState;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public rl0 recomposePaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, rl0 rl0Var) {
        try {
            recordComposerModifications();
            controlledComposition.recordModificationsOf(ScatterSetWrapperKt.wrapIntoSet(rl0Var));
            ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
            try {
                ControlledComposition performRecompose = performRecompose(controlledComposition, null);
                if (performRecompose != null) {
                    performInitialMovableContentInserts(controlledComposition);
                    performRecompose.applyChanges();
                    performRecompose.applyLateChanges();
                }
                gb0 gb0Var = this.pausedScopes.get();
                if (gb0Var == null) {
                    gb0Var = sl0.a;
                    gb0Var.getClass();
                }
                return gb0Var;
            } finally {
                controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
        gb0 gb0Var = this.pausedScopes.get();
        if (gb0Var == null) {
            gb0 gb0Var2 = sl0.a;
            gb0Var = new gb0();
            this.pausedScopes.set(gb0Var);
        }
        gb0Var.d(recomposeScopeImpl);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            try {
                gb0 gb0Var = this.compositionsRemoved;
                if (gb0Var == null) {
                    gb0 gb0Var2 = sl0.a;
                    gb0Var = new gb0();
                    this.compositionsRemoved = gb0Var;
                }
                gb0Var.d(controlledComposition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        fg fgVar;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                fgVar = deriveStateLocked();
            } else {
                fgVar = null;
            }
        }
        if (fgVar != null) {
            fgVar.resumeWith(w01.a);
        }
    }

    public final Object runRecomposeAndApplyChanges(hm hmVar) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(this, null), hmVar);
        return recompositionRunner == vn.d ? recompositionRunner : w01.a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CancellationHandle scheduleFrameEndCallback(iy iyVar) {
        return this.nextFrameEndCallbackQueue.scheduleFrameEndCallback(iyVar);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(controlledComposition);
            this.compositionInvalidations.remove(controlledComposition);
            this.compositionsAwaitingApply.remove(controlledComposition);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            Object add;
            wr0 wr0Var;
            do {
                persistentSet = (PersistentSet) ((wr0) Recomposer._runningRecomposers).getValue();
                add = persistentSet.add((PersistentSet) recomposerInfoImpl);
                if (persistentSet == add) {
                    return;
                }
                wr0Var = (wr0) Recomposer._runningRecomposers;
                wr0Var.getClass();
                Object obj = y80.e;
                if (add == null) {
                    add = obj;
                }
            } while (!wr0Var.j(persistentSet, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            Object remove;
            wr0 wr0Var;
            do {
                persistentSet = (PersistentSet) ((wr0) Recomposer._runningRecomposers).getValue();
                remove = persistentSet.remove((PersistentSet) recomposerInfoImpl);
                if (persistentSet == remove) {
                    return;
                }
                wr0Var = (wr0) Recomposer._runningRecomposers;
                wr0Var.getClass();
                Object obj = y80.e;
                if (remove == null) {
                    remove = obj;
                }
            } while (!wr0Var.j(persistentSet, remove));
        }

        public final void clearErrors$runtime() {
            Iterable iterable = (Iterable) ((wr0) Recomposer._runningRecomposers).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState resetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (resetErrorState != null) {
                    arrayList.add(resetErrorState);
                }
            }
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime() {
            Iterable iterable = (Iterable) ((wr0) Recomposer._runningRecomposers).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInformation currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                RecomposerErrorInfo recomposerErrorInfo = currentError instanceof RecomposerErrorInfo ? (RecomposerErrorInfo) currentError : null;
                if (recomposerErrorInfo != null) {
                    arrayList.add(recomposerErrorInfo);
                }
            }
            return arrayList;
        }

        public final List<RecomposerErrorInformation> getRecomposerErrors$runtime() {
            Iterable iterable = (Iterable) ((wr0) Recomposer._runningRecomposers).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInformation currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final ur0 getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime(int i) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) ((wr0) Recomposer._runningRecomposers).getValue()) {
                RecomposerErrorInformation currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.isRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(i);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime(Object obj) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) ((wr0) Recomposer._runningRecomposers).getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            obj.getClass();
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((HotReloadable) list.get(i)).resetContent();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((HotReloadable) list.get(i2)).recompose();
            }
            Iterator it2 = ((Iterable) ((wr0) Recomposer._runningRecomposers).getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        public final Object saveStateAndDisposeForHotReload$runtime() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) ((wr0) Recomposer._runningRecomposers).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                dj.d0(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime(boolean z) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(z));
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        public final RecomposerErrorInformation getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = (RecomposerErrorState) ((wr0) recomposer.errorState).getValue();
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public ur0 getErrorState() {
            return Recomposer.this.errorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public iw getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int i) {
            List knownCompositions = Recomposer.this.knownCompositions();
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i2 = 0; i2 < size; i2++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i2);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((CompositionImpl) arrayList.get(i3)).invalidateGroupsWithKey(i);
            }
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public CompositionObserverHandle observe(CompositionRegistrationObserver compositionRegistrationObserver) {
            return CompositionObserverKt.observe(Recomposer.this, compositionRegistrationObserver);
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List knownCompositions = Recomposer.this.knownCompositions();
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i2));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }

        public static /* synthetic */ void getCurrentError$annotations() {
        }

        public static /* synthetic */ void getErrorState$annotations() {
        }
    }

    private static /* synthetic */ void getRegistrationObservers$annotations() {
    }

    @er
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime(Set<CompositionData> set) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime(ControlledComposition controlledComposition) {
    }
}
