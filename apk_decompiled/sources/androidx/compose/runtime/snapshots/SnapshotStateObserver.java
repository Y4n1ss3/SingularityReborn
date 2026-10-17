package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import defpackage.ac;
import defpackage.er;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.hm0;
import defpackage.iy;
import defpackage.ky;
import defpackage.mb0;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.rl0;
import defpackage.ta0;
import defpackage.uf;
import defpackage.w01;
import defpackage.w5;
import defpackage.y80;
import defpackage.yi;
import defpackage.zc0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final ky onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);
    private final my applyObserver = new w5(this, 15);
    private final ky readObserver = new mb0(this, 27);
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private final Object observedScopeMapsLock = new Object();
    private long currentMapThreadId = -1;

    public SnapshotStateObserver(ky kyVar) {
        this.onChangedExecutor = kyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addChanges(Set<? extends Object> set) {
        Set<? extends Object> A0;
        while (true) {
            Object obj = this.pendingChanges.get();
            if (obj == null) {
                A0 = set;
            } else if (obj instanceof Set) {
                A0 = y80.E(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    report();
                    o.j();
                    return;
                }
                A0 = yi.A0((Collection) obj, y80.D(set));
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (!atomicReference.compareAndSet(obj, A0)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 applyObserver$lambda$0(SnapshotStateObserver snapshotStateObserver, Set set, Snapshot snapshot) {
        snapshotStateObserver.addChanges(set);
        if (snapshotStateObserver.drainChanges()) {
            snapshotStateObserver.sendNotifications();
        }
        return w01.a;
    }

    private final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMapsLock) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> removeChanges = removeChanges();
            if (removeChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMapsLock) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    z2 = observedScopeMapArr[i].recordInvalidation(removeChanges) || z2;
                }
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(ky kyVar) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i = 0;
        while (true) {
            if (i >= size) {
                observedScopeMap = null;
                break;
            }
            observedScopeMap = observedScopeMapArr[i];
            if (observedScopeMap.getOnChanged() == kyVar) {
                break;
            }
            i++;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        kyVar.getClass();
        p01.f(1, kyVar);
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap(kyVar);
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    private final void forEachScopeMap(ky kyVar) {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                kyVar.invoke(observedScopeMapArr[i]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 readObserver$lambda$0(SnapshotStateObserver snapshotStateObserver, Object obj) {
        if (!snapshotStateObserver.isPaused) {
            synchronized (snapshotStateObserver.observedScopeMapsLock) {
                ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                observedScopeMap.getClass();
                observedScopeMap.recordRead(obj);
            }
        }
        return w01.a;
    }

    private final Set<Object> removeChanges() {
        Set<Object> set;
        while (true) {
            Object obj = this.pendingChanges.get();
            Object obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    report();
                    o.j();
                    return null;
                }
                List list = (List) obj;
                set = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
            }
            Object obj3 = obj2;
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (!atomicReference.compareAndSet(obj, obj3)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return set;
        }
    }

    private final void removeScopeMapIf(ky kyVar) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                int i2 = 0;
                while (true) {
                    ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                    if (i < size) {
                        if (((Boolean) kyVar.invoke(observedScopeMapArr[i])).booleanValue()) {
                            i2++;
                        } else if (i2 > 0) {
                            ObservedScopeMap[] observedScopeMapArr2 = mutableVector.content;
                            observedScopeMapArr2[i - i2] = observedScopeMapArr2[i];
                        }
                        i++;
                    } else {
                        int i3 = size - i2;
                        ac.X(observedScopeMapArr, i3, size, null);
                        mutableVector.setSize(i3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Void report() {
        throw uf.a("Unexpected notification");
    }

    private final void sendNotifications() {
        this.onChangedExecutor.invoke(new hm0(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 sendNotifications$lambda$0(SnapshotStateObserver snapshotStateObserver) {
        do {
            synchronized (snapshotStateObserver.observedScopeMapsLock) {
                try {
                    if (!snapshotStateObserver.sendingNotifications) {
                        snapshotStateObserver.sendingNotifications = true;
                        try {
                            MutableVector<ObservedScopeMap> mutableVector = snapshotStateObserver.observedScopeMaps;
                            ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                            int size = mutableVector.getSize();
                            for (int i = 0; i < size; i++) {
                                observedScopeMapArr[i].notifyInvalidatedScopes();
                            }
                            snapshotStateObserver.sendingNotifications = false;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (snapshotStateObserver.drainChanges());
        return w01.a;
    }

    private final <T> T withScopeMapLock(iy iyVar) {
        T t;
        synchronized (this.observedScopeMapsLock) {
            t = (T) iyVar.invoke();
        }
        return t;
    }

    public final void clear(Object obj) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                int i2 = 0;
                while (true) {
                    ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                    if (i < size) {
                        ObservedScopeMap observedScopeMap = observedScopeMapArr[i];
                        observedScopeMap.clearScopeObservations(obj);
                        if (!observedScopeMap.hasScopeObservations()) {
                            i2++;
                        } else if (i2 > 0) {
                            ObservedScopeMap[] observedScopeMapArr2 = mutableVector.content;
                            observedScopeMapArr2[i - i2] = observedScopeMapArr2[i];
                        }
                        i++;
                    } else {
                        int i3 = size - i2;
                        ac.X(observedScopeMapArr, i3, size, null);
                        mutableVector.setSize(i3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearIf(ky kyVar) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                int i2 = 0;
                while (true) {
                    ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                    if (i < size) {
                        ObservedScopeMap observedScopeMap = observedScopeMapArr[i];
                        observedScopeMap.removeScopeIf(kyVar);
                        if (!observedScopeMap.hasScopeObservations()) {
                            i2++;
                        } else if (i2 > 0) {
                            ObservedScopeMap[] observedScopeMapArr2 = mutableVector.content;
                            observedScopeMapArr2[i - i2] = observedScopeMapArr2[i];
                        }
                        i++;
                    } else {
                        int i3 = size - i2;
                        ac.X(observedScopeMapArr, i3, size, null);
                        mutableVector.setSize(i3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void notifyChanges(Set<? extends Object> set, Snapshot snapshot) {
        this.applyObserver.invoke(set, snapshot);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    public final <T> void observeReads(T t, ky kyVar, iy iyVar) {
        ObservedScopeMap ensureMap;
        boolean z;
        ObservedScopeMap observedScopeMap;
        long j;
        MutableVector<DerivedStateObserver> mutableVector;
        SnapshotThreadLocal snapshotThreadLocal;
        long j2;
        Snapshot transparentObserverMutableSnapshot;
        Snapshot makeCurrent;
        long currentThreadId = Thread_jvmKt.currentThreadId();
        synchronized (this.observedScopeMapsLock) {
            ensureMap = ensureMap(kyVar);
            z = this.isPaused;
            observedScopeMap = this.currentMap;
            j = this.currentMapThreadId;
        }
        long j3 = 0;
        if (j != -1) {
            if (!(j == currentThreadId)) {
                PreconditionsKt.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + currentThreadId + ", name=" + Thread_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            synchronized (this.observedScopeMapsLock) {
                try {
                    this.isPaused = false;
                    this.currentMap = ensureMap;
                    this.currentMapThreadId = currentThreadId;
                } catch (Throwable th) {
                    th = th;
                }
            }
            ky kyVar2 = this.readObserver;
            Object obj = ensureMap.currentScope;
            ta0 ta0Var = ensureMap.currentScopeReads;
            int i = ensureMap.currentToken;
            ensureMap.currentScope = t;
            ensureMap.currentScopeReads = (ta0) ensureMap.scopeToValues.d(t);
            if (ensureMap.currentToken == -1) {
                ensureMap.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            }
            DerivedStateObserver derivedStateObserver = ensureMap.getDerivedStateObserver();
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.Companion companion = Snapshot.Companion;
                if (kyVar2 == null) {
                    iyVar.invoke();
                    j2 = j;
                    mutableVector = derivedStateObservers;
                } else {
                    snapshotThreadLocal = SnapshotKt.threadSnapshot;
                    Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
                    try {
                        if (snapshot instanceof TransparentObserverMutableSnapshot) {
                            try {
                                if (((TransparentObserverMutableSnapshot) snapshot).getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                                    ky readObserver = ((TransparentObserverMutableSnapshot) snapshot).getReadObserver();
                                    ky writeObserver$runtime = ((TransparentObserverMutableSnapshot) snapshot).getWriteObserver$runtime();
                                    try {
                                        j2 = j;
                                        try {
                                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(kyVar2, readObserver, false, 4, null));
                                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(null, writeObserver$runtime));
                                            iyVar.invoke();
                                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(readObserver);
                                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(writeObserver$runtime);
                                            mutableVector = derivedStateObservers;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(readObserver);
                                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(writeObserver$runtime);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j2 = j;
                                mutableVector = derivedStateObservers;
                                mutableVector.removeAt(mutableVector.getSize() - 1);
                                throw th;
                            }
                        }
                        j2 = j;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    try {
                        try {
                            try {
                                if (snapshot != null && !(snapshot instanceof MutableSnapshot)) {
                                    transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(kyVar2);
                                    mutableVector = derivedStateObservers;
                                    makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                                    iyVar.invoke();
                                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                    transparentObserverMutableSnapshot.dispose();
                                }
                                iyVar.invoke();
                                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                transparentObserverMutableSnapshot.dispose();
                            } catch (Throwable th6) {
                                try {
                                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                    throw th6;
                                } catch (Throwable th7) {
                                    th = th7;
                                    try {
                                        transparentObserverMutableSnapshot.dispose();
                                        throw th;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        mutableVector.removeAt(mutableVector.getSize() - 1);
                                        throw th;
                                    }
                                }
                            }
                            makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                        } catch (Throwable th9) {
                            th = th9;
                        }
                        transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, kyVar2, null, true, false);
                    } catch (Throwable th10) {
                        th = th10;
                        mutableVector.removeAt(mutableVector.getSize() - 1);
                        throw th;
                    }
                    mutableVector = derivedStateObservers;
                }
                try {
                    mutableVector.removeAt(mutableVector.getSize() - 1);
                    Object obj2 = ensureMap.currentScope;
                    obj2.getClass();
                    ensureMap.clearObsoleteStateReads(obj2);
                    ensureMap.currentScope = obj;
                    ensureMap.currentScopeReads = ta0Var;
                    ensureMap.currentToken = i;
                    synchronized (this.observedScopeMapsLock) {
                        this.currentMap = observedScopeMap;
                        this.isPaused = z;
                        this.currentMapThreadId = j2;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    j3 = j2;
                    synchronized (this.observedScopeMapsLock) {
                        this.currentMap = observedScopeMap;
                        this.isPaused = z;
                        this.currentMapThreadId = j3;
                    }
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
                mutableVector = derivedStateObservers;
            }
        } catch (Throwable th13) {
            th = th13;
            j3 = j;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    @er
    public final void withNoObservations(iy iyVar) {
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            iyVar.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                observedScopeMapArr[i].clear();
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ObservedScopeMap {
        private Object currentScope;
        private ta0 currentScopeReads;
        private int deriveStateScopeCount;
        private final ky onChanged;
        private boolean readingDerivedStates;
        private int currentToken = -1;
        private final fb0 valueToScopes = ScopeMap.m3918constructorimpl$default(null, 1, null);
        private final fb0 scopeToValues = new fb0();
        private final gb0 invalidated = new gb0();
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                int i;
                i = SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount;
                SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount = i - 1;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                int i;
                i = SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount;
                SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount = i + 1;
            }
        };
        private final fb0 dependencyToDerivedStates = ScopeMap.m3918constructorimpl$default(null, 1, null);
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(ky kyVar) {
            this.onChanged = kyVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearObsoleteStateReads(Object obj) {
            int i = this.currentToken;
            ta0 ta0Var = this.currentScopeReads;
            if (ta0Var == null) {
                return;
            }
            long[] jArr = ta0Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = ta0Var.b[i5];
                            boolean z = ta0Var.c[i5] != i;
                            if (z) {
                                removeObservation(obj, obj2);
                            }
                            if (z) {
                                ta0Var.g(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void recordRead(Object obj, int i, Object obj2, ta0 ta0Var) {
            int i2;
            int i3;
            int i4;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int e = ta0Var.e(obj);
            if (e < 0) {
                e = ~e;
                i2 = -1;
            } else {
                i2 = ta0Var.c[e];
            }
            ta0Var.b[e] = obj;
            ta0Var.c[e] = i;
            int i5 = 2;
            if ((obj instanceof DerivedState) && i2 != i) {
                DerivedState.Record currentRecord = ((DerivedState) obj).getCurrentRecord();
                this.recordedDerivedStateValues.put(obj, currentRecord.getCurrentValue());
                zc0 dependencies = currentRecord.getDependencies();
                fb0 fb0Var = this.dependencyToDerivedStates;
                ScopeMap.m3933removeScopeimpl(fb0Var, obj);
                Object[] objArr = dependencies.b;
                long[] jArr = dependencies.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    i4 = i5;
                                    StateObject stateObject = (StateObject) objArr[(i6 << 3) + i8];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ((StateObjectImpl) stateObject).m4166recordReadInh_f27i8$runtime(ReaderKind.m4154constructorimpl(i4));
                                    }
                                    ScopeMap.m3911addimpl(fb0Var, stateObject, obj);
                                } else {
                                    i4 = i5;
                                }
                                j >>= 8;
                                i8++;
                                i5 = i4;
                            }
                            i3 = i5;
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            i3 = i5;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        i5 = i3;
                    }
                    if (i2 != -1) {
                        if (obj instanceof StateObjectImpl) {
                            ((StateObjectImpl) obj).m4166recordReadInh_f27i8$runtime(ReaderKind.m4154constructorimpl(i3));
                        }
                        ScopeMap.m3911addimpl(this.valueToScopes, obj, obj2);
                        return;
                    }
                    return;
                }
            }
            i3 = 2;
            if (i2 != -1) {
            }
        }

        private final void removeObservation(Object obj, Object obj2) {
            ScopeMap.m3931removeimpl(this.valueToScopes, obj2, obj);
            if (!(obj2 instanceof DerivedState) || ScopeMap.m3919containsimpl(this.valueToScopes, obj2)) {
                return;
            }
            ScopeMap.m3933removeScopeimpl(this.dependencyToDerivedStates, obj2);
            this.recordedDerivedStateValues.remove(obj2);
        }

        public final void clear() {
            ScopeMap.m3916clearimpl(this.valueToScopes);
            this.scopeToValues.f();
            ScopeMap.m3916clearimpl(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(Object obj) {
            ta0 ta0Var = (ta0) this.scopeToValues.j(obj);
            if (ta0Var == null) {
                return;
            }
            Object[] objArr = ta0Var.b;
            int[] iArr = ta0Var.c;
            long[] jArr = ta0Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            removeObservation(obj, obj2);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final ky getOnChanged() {
            return this.onChanged;
        }

        public final boolean getReadingDerivedStates() {
            return this.readingDerivedStates;
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.e != 0;
        }

        public final void notifyInvalidatedScopes() {
            gb0 gb0Var = this.invalidated;
            ky kyVar = this.onChanged;
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
                                kyVar.invoke(objArr[(i << 3) + i3]);
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
            gb0Var.f();
        }

        public final void observe(Object obj, ky kyVar, iy iyVar) {
            SnapshotThreadLocal snapshotThreadLocal;
            Snapshot transparentObserverMutableSnapshot;
            Snapshot makeCurrent;
            Object obj2 = this.currentScope;
            ta0 ta0Var = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = obj;
            this.currentScopeReads = (ta0) this.scopeToValues.d(obj);
            if (this.currentToken == -1) {
                this.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            }
            DerivedStateObserver derivedStateObserver = getDerivedStateObserver();
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.Companion companion = Snapshot.Companion;
                if (kyVar == null) {
                    iyVar.invoke();
                } else {
                    snapshotThreadLocal = SnapshotKt.threadSnapshot;
                    Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
                    if ((snapshot instanceof TransparentObserverMutableSnapshot) && ((TransparentObserverMutableSnapshot) snapshot).getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                        ky readObserver = ((TransparentObserverMutableSnapshot) snapshot).getReadObserver();
                        ky writeObserver$runtime = ((TransparentObserverMutableSnapshot) snapshot).getWriteObserver$runtime();
                        try {
                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(kyVar, readObserver, false, 4, null));
                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(null, writeObserver$runtime));
                            iyVar.invoke();
                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(readObserver);
                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(writeObserver$runtime);
                        } catch (Throwable th) {
                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(readObserver);
                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(writeObserver$runtime);
                            throw th;
                        }
                    } else {
                        try {
                            try {
                                if (snapshot != null && !(snapshot instanceof MutableSnapshot)) {
                                    transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(kyVar);
                                    makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                                    iyVar.invoke();
                                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                    transparentObserverMutableSnapshot.dispose();
                                }
                                iyVar.invoke();
                                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                transparentObserverMutableSnapshot.dispose();
                            } catch (Throwable th2) {
                                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                                throw th2;
                            }
                            makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                        } catch (Throwable th3) {
                            transparentObserverMutableSnapshot.dispose();
                            throw th3;
                        }
                        transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, kyVar, null, true, false);
                    }
                }
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                Object obj3 = this.currentScope;
                obj3.getClass();
                clearObsoleteStateReads(obj3);
                this.currentScope = obj2;
                this.currentScopeReads = ta0Var;
                this.currentToken = i;
            } catch (Throwable th4) {
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                throw th4;
            }
        }

        public final boolean recordInvalidation(Set<? extends Object> set) {
            boolean z;
            Iterator it;
            fb0 fb0Var;
            int i;
            Object[] objArr;
            long[] jArr;
            Iterator it2;
            fb0 fb0Var2;
            int i2;
            Object[] objArr2;
            long j;
            long[] jArr2;
            boolean z2;
            long[] jArr3;
            long[] jArr4;
            long[] jArr5;
            Object[] objArr3;
            int i3;
            long[] jArr6;
            Object[] objArr4;
            int i4;
            int i5;
            long j2;
            int i6;
            int i7;
            Object obj;
            long[] jArr7;
            long[] jArr8;
            Object obj2;
            int i8;
            int i9;
            long j3;
            int i10;
            boolean z3;
            int i11;
            fb0 fb0Var3 = this.dependencyToDerivedStates;
            HashMap<DerivedState<?>, Object> hashMap = this.recordedDerivedStateValues;
            fb0 fb0Var4 = this.valueToScopes;
            gb0 gb0Var = this.invalidated;
            int i12 = 8;
            if (set instanceof ScatterSetWrapper) {
                rl0 set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
                Object[] objArr5 = set$runtime.b;
                long[] jArr9 = set$runtime.a;
                int length = jArr9.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    z = false;
                    while (true) {
                        long j4 = jArr9[i13];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j4 & 255) < 128) {
                                    Object obj3 = objArr5[(i13 << 3) + i15];
                                    int i16 = i12;
                                    if (!(obj3 instanceof StateObjectImpl) || ((StateObjectImpl) obj3).m4165isReadInh_f27i8$runtime(ReaderKind.m4154constructorimpl(2))) {
                                        if (this.readingDerivedStates || !ScopeMap.m3919containsimpl(fb0Var3, obj3)) {
                                            jArr6 = jArr9;
                                            objArr4 = objArr5;
                                            obj = obj3;
                                            i4 = length;
                                            i5 = i13;
                                            j2 = j4;
                                            i6 = i15;
                                        } else {
                                            this.readingDerivedStates = true;
                                            try {
                                                Object d = fb0Var3.d(obj3);
                                                if (d != null) {
                                                    if (d instanceof gb0) {
                                                        gb0 gb0Var2 = (gb0) d;
                                                        Object[] objArr6 = gb0Var2.b;
                                                        long[] jArr10 = gb0Var2.a;
                                                        jArr6 = jArr9;
                                                        int length2 = jArr10.length - 2;
                                                        objArr4 = objArr5;
                                                        if (length2 >= 0) {
                                                            j2 = j4;
                                                            int i17 = 0;
                                                            while (true) {
                                                                long j5 = jArr10[i17];
                                                                i6 = i15;
                                                                Object[] objArr7 = objArr6;
                                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                                    int i19 = 0;
                                                                    while (i19 < i18) {
                                                                        if ((j5 & 255) < 128) {
                                                                            jArr8 = jArr10;
                                                                            DerivedState<?> derivedState = (DerivedState) objArr7[(i17 << 3) + i19];
                                                                            derivedState.getClass();
                                                                            j3 = j5;
                                                                            Object obj4 = hashMap.get(derivedState);
                                                                            SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                                                                            if (policy == null) {
                                                                                policy = SnapshotStateKt.structuralEqualityPolicy();
                                                                            }
                                                                            i10 = i19;
                                                                            if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj4)) {
                                                                                obj2 = obj3;
                                                                                i8 = length;
                                                                                i9 = i13;
                                                                                this.statesToReread.add(derivedState);
                                                                            } else {
                                                                                Object d2 = fb0Var4.d(derivedState);
                                                                                if (d2 != null) {
                                                                                    if (d2 instanceof gb0) {
                                                                                        gb0 gb0Var3 = (gb0) d2;
                                                                                        Object[] objArr8 = gb0Var3.b;
                                                                                        long[] jArr11 = gb0Var3.a;
                                                                                        int length3 = jArr11.length - 2;
                                                                                        if (length3 >= 0) {
                                                                                            i8 = length;
                                                                                            i9 = i13;
                                                                                            int i20 = 0;
                                                                                            while (true) {
                                                                                                long j6 = jArr11[i20];
                                                                                                long[] jArr12 = jArr11;
                                                                                                obj2 = obj3;
                                                                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                                    int i21 = 8 - ((~(i20 - length3)) >>> 31);
                                                                                                    int i22 = 0;
                                                                                                    while (i22 < i21) {
                                                                                                        if ((j6 & 255) < 128) {
                                                                                                            i11 = i22;
                                                                                                            gb0Var.d(objArr8[(i20 << 3) + i22]);
                                                                                                            z = true;
                                                                                                        } else {
                                                                                                            i11 = i22;
                                                                                                        }
                                                                                                        j6 >>= i16;
                                                                                                        i22 = i11 + 1;
                                                                                                    }
                                                                                                    if (i21 != i16) {
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (i20 == length3) {
                                                                                                    break;
                                                                                                }
                                                                                                i20++;
                                                                                                obj3 = obj2;
                                                                                                jArr11 = jArr12;
                                                                                                i16 = 8;
                                                                                            }
                                                                                            z3 = z;
                                                                                            z = z3;
                                                                                        }
                                                                                    } else {
                                                                                        obj2 = obj3;
                                                                                        i8 = length;
                                                                                        i9 = i13;
                                                                                        gb0Var.d(d2);
                                                                                        z3 = true;
                                                                                        z = z3;
                                                                                    }
                                                                                }
                                                                                obj2 = obj3;
                                                                                i8 = length;
                                                                                i9 = i13;
                                                                                z3 = z;
                                                                                z = z3;
                                                                            }
                                                                        } else {
                                                                            jArr8 = jArr10;
                                                                            obj2 = obj3;
                                                                            i8 = length;
                                                                            i9 = i13;
                                                                            j3 = j5;
                                                                            i10 = i19;
                                                                        }
                                                                        j5 = j3 >> 8;
                                                                        i19 = i10 + 1;
                                                                        i16 = 8;
                                                                        length = i8;
                                                                        jArr10 = jArr8;
                                                                        i13 = i9;
                                                                        obj3 = obj2;
                                                                    }
                                                                    jArr7 = jArr10;
                                                                    obj = obj3;
                                                                    i4 = length;
                                                                    i5 = i13;
                                                                    if (i18 != i16) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr7 = jArr10;
                                                                    obj = obj3;
                                                                    i4 = length;
                                                                    i5 = i13;
                                                                }
                                                                if (i17 == length2) {
                                                                    break;
                                                                }
                                                                i17++;
                                                                i15 = i6;
                                                                objArr6 = objArr7;
                                                                length = i4;
                                                                jArr10 = jArr7;
                                                                i13 = i5;
                                                                obj3 = obj;
                                                                i16 = 8;
                                                            }
                                                        }
                                                    } else {
                                                        jArr6 = jArr9;
                                                        objArr4 = objArr5;
                                                        obj = obj3;
                                                        i4 = length;
                                                        i5 = i13;
                                                        j2 = j4;
                                                        i6 = i15;
                                                        DerivedState<?> derivedState2 = (DerivedState) d;
                                                        Object obj5 = hashMap.get(derivedState2);
                                                        SnapshotMutationPolicy<?> policy2 = derivedState2.getPolicy();
                                                        if (policy2 == null) {
                                                            policy2 = SnapshotStateKt.structuralEqualityPolicy();
                                                        }
                                                        if (policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj5)) {
                                                            this.statesToReread.add(derivedState2);
                                                        } else {
                                                            Object d3 = fb0Var4.d(derivedState2);
                                                            if (d3 != null) {
                                                                if (d3 instanceof gb0) {
                                                                    gb0 gb0Var4 = (gb0) d3;
                                                                    Object[] objArr9 = gb0Var4.b;
                                                                    long[] jArr13 = gb0Var4.a;
                                                                    int length4 = jArr13.length - 2;
                                                                    if (length4 >= 0) {
                                                                        int i23 = 0;
                                                                        while (true) {
                                                                            long j7 = jArr13[i23];
                                                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i24 = 8 - ((~(i23 - length4)) >>> 31);
                                                                                for (int i25 = 0; i25 < i24; i25++) {
                                                                                    if ((j7 & 255) < 128) {
                                                                                        gb0Var.d(objArr9[(i23 << 3) + i25]);
                                                                                        z = true;
                                                                                    }
                                                                                    j7 >>= 8;
                                                                                }
                                                                                if (i24 != 8) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (i23 == length4) {
                                                                                break;
                                                                            }
                                                                            i23++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    gb0Var.d(d3);
                                                                    z = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    this.readingDerivedStates = false;
                                                } else {
                                                    jArr6 = jArr9;
                                                    objArr4 = objArr5;
                                                }
                                                obj = obj3;
                                                i4 = length;
                                                i5 = i13;
                                                j2 = j4;
                                                i6 = i15;
                                                this.readingDerivedStates = false;
                                            } finally {
                                            }
                                        }
                                        Object d4 = fb0Var4.d(obj);
                                        if (d4 != null) {
                                            if (d4 instanceof gb0) {
                                                gb0 gb0Var5 = (gb0) d4;
                                                Object[] objArr10 = gb0Var5.b;
                                                long[] jArr14 = gb0Var5.a;
                                                int length5 = jArr14.length - 2;
                                                if (length5 >= 0) {
                                                    int i26 = 0;
                                                    while (true) {
                                                        long j8 = jArr14[i26];
                                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i27 = 8 - ((~(i26 - length5)) >>> 31);
                                                            long j9 = j8;
                                                            for (int i28 = 0; i28 < i27; i28++) {
                                                                if ((j9 & 255) < 128) {
                                                                    gb0Var.d(objArr10[(i26 << 3) + i28]);
                                                                    z = true;
                                                                }
                                                                j9 >>= 8;
                                                            }
                                                            if (i27 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i26 == length5) {
                                                            break;
                                                        }
                                                        i26++;
                                                    }
                                                }
                                            } else {
                                                gb0Var.d(d4);
                                                z = true;
                                            }
                                        }
                                    } else {
                                        jArr6 = jArr9;
                                        objArr4 = objArr5;
                                        i4 = length;
                                        i5 = i13;
                                        j2 = j4;
                                        i6 = i15;
                                    }
                                    i7 = 8;
                                } else {
                                    jArr6 = jArr9;
                                    objArr4 = objArr5;
                                    i4 = length;
                                    i5 = i13;
                                    j2 = j4;
                                    i6 = i15;
                                    i7 = i12;
                                }
                                j4 = j2 >> i7;
                                i15 = i6 + 1;
                                jArr9 = jArr6;
                                i12 = i7;
                                objArr5 = objArr4;
                                length = i4;
                                i13 = i5;
                            }
                            jArr5 = jArr9;
                            objArr3 = objArr5;
                            int i29 = length;
                            int i30 = i13;
                            if (i14 != i12) {
                                break;
                            }
                            length = i29;
                            i3 = i30;
                        } else {
                            jArr5 = jArr9;
                            objArr3 = objArr5;
                            i3 = i13;
                        }
                        if (i3 == length) {
                            break;
                        }
                        i13 = i3 + 1;
                        jArr9 = jArr5;
                        objArr5 = objArr3;
                        i12 = 8;
                    }
                } else {
                    z = false;
                }
            } else {
                Iterator it3 = set.iterator();
                boolean z4 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof StateObjectImpl) || ((StateObjectImpl) next).m4165isReadInh_f27i8$runtime(ReaderKind.m4154constructorimpl(2))) {
                        if (this.readingDerivedStates || !ScopeMap.m3919containsimpl(fb0Var3, next)) {
                            it = it3;
                            fb0Var = fb0Var3;
                            i = 0;
                        } else {
                            this.readingDerivedStates = true;
                            try {
                                Object d5 = fb0Var3.d(next);
                                if (d5 != null) {
                                    if (d5 instanceof gb0) {
                                        gb0 gb0Var6 = (gb0) d5;
                                        Object[] objArr11 = gb0Var6.b;
                                        long[] jArr15 = gb0Var6.a;
                                        int length6 = jArr15.length - 2;
                                        if (length6 >= 0) {
                                            boolean z5 = z4;
                                            int i31 = 0;
                                            while (true) {
                                                long j10 = jArr15[i31];
                                                long[] jArr16 = jArr15;
                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i32 = 8 - ((~(i31 - length6)) >>> 31);
                                                    int i33 = 0;
                                                    while (i33 < i32) {
                                                        if ((j10 & 255) < 128) {
                                                            it2 = it3;
                                                            DerivedState<?> derivedState3 = (DerivedState) objArr11[(i31 << 3) + i33];
                                                            derivedState3.getClass();
                                                            fb0Var2 = fb0Var3;
                                                            Object obj6 = hashMap.get(derivedState3);
                                                            SnapshotMutationPolicy<?> policy3 = derivedState3.getPolicy();
                                                            if (policy3 == null) {
                                                                policy3 = SnapshotStateKt.structuralEqualityPolicy();
                                                            }
                                                            i2 = i33;
                                                            objArr2 = objArr11;
                                                            if (policy3.equivalent(derivedState3.getCurrentRecord().getCurrentValue(), obj6)) {
                                                                j = j10;
                                                                jArr2 = jArr16;
                                                                this.statesToReread.add(derivedState3);
                                                            } else {
                                                                Object d6 = fb0Var4.d(derivedState3);
                                                                if (d6 != null) {
                                                                    if (d6 instanceof gb0) {
                                                                        gb0 gb0Var7 = (gb0) d6;
                                                                        Object[] objArr12 = gb0Var7.b;
                                                                        long[] jArr17 = gb0Var7.a;
                                                                        int length7 = jArr17.length - 2;
                                                                        j = j10;
                                                                        if (length7 >= 0) {
                                                                            int i34 = 0;
                                                                            boolean z6 = z5;
                                                                            while (true) {
                                                                                long j11 = jArr17[i34];
                                                                                z2 = z6;
                                                                                jArr2 = jArr16;
                                                                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i35 = 8 - ((~(i34 - length7)) >>> 31);
                                                                                    long j12 = j11;
                                                                                    int i36 = 0;
                                                                                    while (i36 < i35) {
                                                                                        if ((j12 & 255) < 128) {
                                                                                            jArr4 = jArr17;
                                                                                            gb0Var.d(objArr12[(i34 << 3) + i36]);
                                                                                            z2 = true;
                                                                                        } else {
                                                                                            jArr4 = jArr17;
                                                                                        }
                                                                                        j12 >>= 8;
                                                                                        i36++;
                                                                                        jArr17 = jArr4;
                                                                                    }
                                                                                    jArr3 = jArr17;
                                                                                    if (i35 != 8) {
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    jArr3 = jArr17;
                                                                                }
                                                                                z6 = z2;
                                                                                if (i34 == length7) {
                                                                                    z5 = z6;
                                                                                    break;
                                                                                }
                                                                                i34++;
                                                                                jArr16 = jArr2;
                                                                                jArr17 = jArr3;
                                                                            }
                                                                            z2 = z5;
                                                                        }
                                                                    } else {
                                                                        j = j10;
                                                                        jArr2 = jArr16;
                                                                        gb0Var.d(d6);
                                                                        z2 = true;
                                                                    }
                                                                    z5 = z2;
                                                                } else {
                                                                    j = j10;
                                                                }
                                                                jArr2 = jArr16;
                                                                z2 = z5;
                                                                z5 = z2;
                                                            }
                                                        } else {
                                                            it2 = it3;
                                                            fb0Var2 = fb0Var3;
                                                            i2 = i33;
                                                            objArr2 = objArr11;
                                                            j = j10;
                                                            jArr2 = jArr16;
                                                        }
                                                        j10 = j >> 8;
                                                        i33 = i2 + 1;
                                                        it3 = it2;
                                                        fb0Var3 = fb0Var2;
                                                        jArr16 = jArr2;
                                                        objArr11 = objArr2;
                                                    }
                                                    it = it3;
                                                    fb0Var = fb0Var3;
                                                    objArr = objArr11;
                                                    jArr = jArr16;
                                                    if (i32 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    it = it3;
                                                    fb0Var = fb0Var3;
                                                    objArr = objArr11;
                                                    jArr = jArr16;
                                                }
                                                if (i31 == length6) {
                                                    break;
                                                }
                                                i31++;
                                                it3 = it;
                                                fb0Var3 = fb0Var;
                                                jArr15 = jArr;
                                                objArr11 = objArr;
                                            }
                                            z4 = z5;
                                        }
                                    } else {
                                        it = it3;
                                        fb0Var = fb0Var3;
                                        DerivedState<?> derivedState4 = (DerivedState) d5;
                                        Object obj7 = hashMap.get(derivedState4);
                                        SnapshotMutationPolicy<?> policy4 = derivedState4.getPolicy();
                                        if (policy4 == null) {
                                            policy4 = SnapshotStateKt.structuralEqualityPolicy();
                                        }
                                        if (policy4.equivalent(derivedState4.getCurrentRecord().getCurrentValue(), obj7)) {
                                            this.statesToReread.add(derivedState4);
                                        } else {
                                            Object d7 = fb0Var4.d(derivedState4);
                                            if (d7 != null) {
                                                if (d7 instanceof gb0) {
                                                    gb0 gb0Var8 = (gb0) d7;
                                                    Object[] objArr13 = gb0Var8.b;
                                                    long[] jArr18 = gb0Var8.a;
                                                    int length8 = jArr18.length - 2;
                                                    if (length8 >= 0) {
                                                        boolean z7 = z4;
                                                        int i37 = 0;
                                                        while (true) {
                                                            long j13 = jArr18[i37];
                                                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i38 = 8 - ((~(i37 - length8)) >>> 31);
                                                                long j14 = j13;
                                                                boolean z8 = z7;
                                                                for (int i39 = 0; i39 < i38; i39++) {
                                                                    if ((j14 & 255) < 128) {
                                                                        gb0Var.d(objArr13[(i37 << 3) + i39]);
                                                                        z8 = true;
                                                                    }
                                                                    j14 >>= 8;
                                                                }
                                                                if (i38 != 8) {
                                                                    z4 = z8;
                                                                    break;
                                                                }
                                                                z7 = z8;
                                                            }
                                                            if (i37 == length8) {
                                                                z4 = z7;
                                                                break;
                                                            }
                                                            i37++;
                                                        }
                                                    }
                                                } else {
                                                    gb0Var.d(d7);
                                                    z4 = true;
                                                }
                                            }
                                        }
                                    }
                                    i = 0;
                                    this.readingDerivedStates = false;
                                }
                                it = it3;
                                fb0Var = fb0Var3;
                                i = 0;
                                this.readingDerivedStates = false;
                            } finally {
                            }
                        }
                        Object d8 = fb0Var4.d(next);
                        if (d8 != null) {
                            if (d8 instanceof gb0) {
                                gb0 gb0Var9 = (gb0) d8;
                                Object[] objArr14 = gb0Var9.b;
                                long[] jArr19 = gb0Var9.a;
                                int length9 = jArr19.length - 2;
                                if (length9 >= 0) {
                                    boolean z9 = z4;
                                    int i40 = i;
                                    while (true) {
                                        long j15 = jArr19[i40];
                                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i41 = 8 - ((~(i40 - length9)) >>> 31);
                                            long j16 = j15;
                                            boolean z10 = z9;
                                            for (int i42 = i; i42 < i41; i42++) {
                                                if ((j16 & 255) < 128) {
                                                    gb0Var.d(objArr14[(i40 << 3) + i42]);
                                                    z10 = true;
                                                }
                                                j16 >>= 8;
                                            }
                                            if (i41 != 8) {
                                                z4 = z10;
                                                break;
                                            }
                                            z9 = z10;
                                        }
                                        if (i40 == length9) {
                                            z4 = z9;
                                            break;
                                        }
                                        i40++;
                                    }
                                }
                            } else {
                                gb0Var.d(d8);
                                z4 = true;
                            }
                            it3 = it;
                            fb0Var3 = fb0Var;
                        }
                    } else {
                        it = it3;
                        fb0Var = fb0Var3;
                    }
                    it3 = it;
                    fb0Var3 = fb0Var;
                }
                z = z4;
            }
            if (!this.readingDerivedStates && this.statesToReread.getSize() != 0) {
                MutableVector<DerivedState<?>> mutableVector = this.statesToReread;
                DerivedState<?>[] derivedStateArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i43 = 0; i43 < size; i43++) {
                    rereadDerivedState(derivedStateArr[i43]);
                }
                this.statesToReread.clear();
            }
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void removeScopeIf(ky kyVar) {
            long[] jArr;
            long[] jArr2;
            long j;
            char c;
            long j2;
            int i;
            long j3;
            fb0 fb0Var = this.scopeToValues;
            long[] jArr3 = fb0Var.a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j4 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = fb0Var.b[i6];
                            j2 = j5;
                            ta0 ta0Var = (ta0) fb0Var.c[i6];
                            Boolean bool = (Boolean) kyVar.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = ta0Var.b;
                                int[] iArr = ta0Var.c;
                                long[] jArr4 = ta0Var.a;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j4;
                                    int i8 = 0;
                                    while (true) {
                                        long j6 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j6 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    j3 = j6;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    removeObservation(obj, obj2);
                                                } else {
                                                    j3 = j6;
                                                }
                                                j6 = j3 >> i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                    if (bool.booleanValue()) {
                                        fb0Var.k(i6);
                                    }
                                    i = 8;
                                }
                            }
                            jArr2 = jArr3;
                            j = j4;
                            if (bool.booleanValue()) {
                            }
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j4 = j >> i;
                        c2 = c;
                        j5 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        public final void rereadDerivedState(DerivedState<?> derivedState) {
            fb0 fb0Var = this.scopeToValues;
            int hashCode = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            Object d = this.valueToScopes.d(derivedState);
            if (d == null) {
                return;
            }
            if (!(d instanceof gb0)) {
                ta0 ta0Var = (ta0) fb0Var.d(d);
                if (ta0Var == null) {
                    ta0Var = new ta0();
                    fb0Var.l(d, ta0Var);
                }
                recordRead(derivedState, hashCode, d, ta0Var);
                return;
            }
            gb0 gb0Var = (gb0) d;
            Object[] objArr = gb0Var.b;
            long[] jArr = gb0Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            ta0 ta0Var2 = (ta0) fb0Var.d(obj);
                            if (ta0Var2 == null) {
                                ta0Var2 = new ta0();
                                fb0Var.l(obj, ta0Var2);
                            }
                            recordRead(derivedState, hashCode, obj, ta0Var2);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        public final void setReadingDerivedStates(boolean z) {
            this.readingDerivedStates = z;
        }

        public final void recordRead(Object obj) {
            Object obj2 = this.currentScope;
            obj2.getClass();
            int i = this.currentToken;
            ta0 ta0Var = this.currentScopeReads;
            if (ta0Var == null) {
                ta0Var = new ta0();
                this.currentScopeReads = ta0Var;
                this.scopeToValues.l(obj2, ta0Var);
            }
            recordRead(obj, i, obj2, ta0Var);
        }
    }
}
