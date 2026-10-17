package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Thread_jvmKt;
import defpackage.dq;
import defpackage.dr0;
import defpackage.er;
import defpackage.gb0;
import defpackage.iy;
import defpackage.ky;
import defpackage.lu0;
import defpackage.my;
import defpackage.o;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class Snapshot {
    public static final int PreexistingSnapshotId = 1;
    private boolean disposed;
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    private long snapshotId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private Snapshot(long j, SnapshotIdSet snapshotIdSet) {
        long j2;
        this.invalid = snapshotIdSet;
        this.snapshotId = j;
        j2 = SnapshotKt.INVALID_SNAPSHOT;
        this.pinningTrackingHandle = j != j2 ? SnapshotKt.trackPinning(j, getInvalid$runtime()) : -1;
    }

    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, ky kyVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
            return null;
        }
        if ((i & 1) != 0) {
            kyVar = null;
        }
        return snapshot.takeNestedSnapshot(kyVar);
    }

    public final void closeAndReleasePinning$runtime() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime();
            releasePinnedSnapshotsForCloseLocked$runtime();
        }
    }

    public void closeLocked$runtime() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getSnapshotId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime();
        }
    }

    public final <T> T enter(iy iyVar) {
        Snapshot makeCurrent = makeCurrent();
        try {
            return (T) iyVar.invoke();
        } finally {
            restoreCurrent(makeCurrent);
        }
    }

    public final boolean getDisposed$runtime() {
        return this.disposed;
    }

    public int getId() {
        return (int) getSnapshotId();
    }

    public SnapshotIdSet getInvalid$runtime() {
        return this.invalid;
    }

    public abstract gb0 getModified$runtime();

    public abstract ky getReadObserver();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public long getSnapshotId() {
        return this.snapshotId;
    }

    public int getWriteCount$runtime() {
        return 0;
    }

    public abstract ky getWriteObserver$runtime();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime() {
        return this.pinningTrackingHandle >= 0;
    }

    public Snapshot makeCurrent() {
        SnapshotThreadLocal snapshotThreadLocal;
        SnapshotThreadLocal snapshotThreadLocal2;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
        snapshotThreadLocal2 = SnapshotKt.threadSnapshot;
        snapshotThreadLocal2.set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime */
    public abstract void mo4150nestedActivated$runtime(Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime */
    public abstract void mo4151nestedDeactivated$runtime(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime();

    /* renamed from: recordModified$runtime */
    public abstract void mo4152recordModified$runtime(StateObject stateObject);

    public final void releasePinnedSnapshotLocked$runtime() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            SnapshotKt.releasePinningLocked(i);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePinnedSnapshotLocked$runtime();
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotThreadLocal snapshotThreadLocal;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        snapshotThreadLocal.set(snapshot);
    }

    public final void setDisposed$runtime(boolean z) {
        this.disposed = z;
    }

    public void setInvalid$runtime(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setSnapshotId$runtime(long j) {
        this.snapshotId = j;
    }

    public void setWriteCount$runtime(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract Snapshot takeNestedSnapshot(ky kyVar);

    public final int takeoverPinnedSnapshot$runtime() {
        int i = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i;
    }

    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(Snapshot snapshot) {
        SnapshotThreadLocal snapshotThreadLocal;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        if (!(snapshotThreadLocal.get() == this)) {
            PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(snapshot);
    }

    public final void validateNotDisposed$runtime() {
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private final boolean getCanBeReused(TransparentObserverMutableSnapshot transparentObserverMutableSnapshot) {
            return transparentObserverMutableSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId();
        }

        public static /* synthetic */ Object observe$default(Companion companion, ky kyVar, ky kyVar2, iy iyVar, int i, Object obj) {
            if ((i & 1) != 0) {
                kyVar = null;
            }
            if ((i & 2) != 0) {
                kyVar2 = null;
            }
            return companion.observe(kyVar, kyVar2, iyVar);
        }

        public static Object observeInternal$runtime$default(Companion companion, ky kyVar, ky kyVar2, iy iyVar, int i, Object obj) {
            SnapshotThreadLocal snapshotThreadLocal;
            Snapshot transparentObserverMutableSnapshot;
            ky kyVar3 = (i & 1) != 0 ? null : kyVar;
            ky kyVar4 = (i & 2) != 0 ? null : kyVar2;
            if (kyVar3 == null && kyVar4 == null) {
                return iyVar.invoke();
            }
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    ky readObserver = transparentObserverMutableSnapshot2.getReadObserver();
                    ky writeObserver$runtime = transparentObserverMutableSnapshot2.getWriteObserver$runtime();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(kyVar3, readObserver, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(kyVar4, writeObserver$runtime));
                        return iyVar.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(readObserver);
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(writeObserver$runtime);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, kyVar3, kyVar4, true, false);
            } else {
                if (kyVar3 == null) {
                    return iyVar.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(kyVar3);
            }
            try {
                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    Object invoke = iyVar.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return invoke;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.dispose();
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$1(my myVar) {
            List list;
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.applyObservers;
                SnapshotKt.applyObservers = yi.z0(list, myVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$1(ky kyVar) {
            List list;
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.globalWriteObservers;
                SnapshotKt.globalWriteObservers = yi.z0(list, kyVar);
            }
            SnapshotKt.advanceGlobalSnapshot();
        }

        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, ky kyVar, ky kyVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                kyVar = null;
            }
            if ((i & 2) != 0) {
                kyVar2 = null;
            }
            return companion.takeMutableSnapshot(kyVar, kyVar2);
        }

        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, ky kyVar, int i, Object obj) {
            if ((i & 1) != 0) {
                kyVar = null;
            }
            return companion.takeSnapshot(kyVar);
        }

        public final Snapshot createNonObservableSnapshot() {
            SnapshotThreadLocal snapshotThreadLocal;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) snapshotThreadLocal.get(), null, false, 6, null);
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final Snapshot getCurrentThreadSnapshot() {
            SnapshotThreadLocal snapshotThreadLocal;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            return (Snapshot) snapshotThreadLocal.get();
        }

        public final <T> T global(iy iyVar) {
            Snapshot removeCurrent = removeCurrent();
            try {
                return (T) iyVar.invoke();
            } finally {
                restoreCurrent(removeCurrent);
            }
        }

        public final boolean isApplyObserverNotificationPending() {
            AtomicInt atomicInt;
            atomicInt = SnapshotKt.pendingApplyObserverCount;
            return atomicInt.get() > 0;
        }

        public final boolean isInSnapshot() {
            SnapshotThreadLocal snapshotThreadLocal;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            return snapshotThreadLocal.get() != null;
        }

        public final Snapshot makeCurrentNonObservable(Snapshot snapshot) {
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverMutableSnapshot.setReadObserver$runtime(null);
                    return snapshot;
                }
            }
            if (snapshot instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
                if (transparentObserverSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverSnapshot.setReadObserver$runtime(null);
                    return snapshot;
                }
            }
            Snapshot createTransparentSnapshotWithNoParentReadObserver$default = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default(snapshot, null, false, 6, null);
            createTransparentSnapshotWithNoParentReadObserver$default.makeCurrent();
            return createTransparentSnapshotWithNoParentReadObserver$default;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime();
        }

        public final <T> T observe(ky kyVar, ky kyVar2, iy iyVar) {
            SnapshotThreadLocal snapshotThreadLocal;
            Snapshot transparentObserverMutableSnapshot;
            if (kyVar == null && kyVar2 == null) {
                return (T) iyVar.invoke();
            }
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    ky readObserver = transparentObserverMutableSnapshot2.getReadObserver();
                    ky writeObserver$runtime = transparentObserverMutableSnapshot2.getWriteObserver$runtime();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(kyVar, readObserver, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(kyVar2, writeObserver$runtime));
                        return (T) iyVar.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(readObserver);
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(writeObserver$runtime);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, kyVar, kyVar2, true, false);
            } else {
                if (kyVar == null) {
                    return (T) iyVar.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(kyVar);
            }
            try {
                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T t = (T) iyVar.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return t;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.dispose();
                throw th2;
            }
        }

        public final <T> T observeInternal$runtime(ky kyVar, ky kyVar2, iy iyVar) {
            SnapshotThreadLocal snapshotThreadLocal;
            Snapshot transparentObserverMutableSnapshot;
            if (kyVar == null && kyVar2 == null) {
                return (T) iyVar.invoke();
            }
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    ky readObserver = transparentObserverMutableSnapshot2.getReadObserver();
                    ky writeObserver$runtime = transparentObserverMutableSnapshot2.getWriteObserver$runtime();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(kyVar, readObserver, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(kyVar2, writeObserver$runtime));
                        return (T) iyVar.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(readObserver);
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(writeObserver$runtime);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, kyVar, kyVar2, true, false);
            } else {
                if (kyVar == null) {
                    return (T) iyVar.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(kyVar);
            }
            try {
                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T t = (T) iyVar.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return t;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.dispose();
                throw th2;
            }
        }

        public final int openSnapshotCount() {
            SnapshotIdSet snapshotIdSet;
            snapshotIdSet = SnapshotKt.openSnapshots;
            return yi.I0(snapshotIdSet).size();
        }

        public final ObserverHandle registerApplyObserver(my myVar) {
            ky kyVar;
            List list;
            kyVar = SnapshotKt.emptyLambda;
            SnapshotKt.advanceGlobalSnapshot(kyVar);
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.applyObservers;
                SnapshotKt.applyObservers = yi.B0(list, myVar);
            }
            return new dr0(myVar, 0);
        }

        public final ObserverHandle registerGlobalWriteObserver(ky kyVar) {
            List list;
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.globalWriteObservers;
                SnapshotKt.globalWriteObservers = yi.B0(list, kyVar);
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new dr0(kyVar, 1);
        }

        public final Snapshot removeCurrent() {
            SnapshotThreadLocal snapshotThreadLocal;
            SnapshotThreadLocal snapshotThreadLocal2;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
            if (snapshot != null) {
                snapshotThreadLocal2 = SnapshotKt.threadSnapshot;
                snapshotThreadLocal2.set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(Snapshot snapshot) {
            SnapshotThreadLocal snapshotThreadLocal;
            if (snapshot != null) {
                snapshotThreadLocal = SnapshotKt.threadSnapshot;
                snapshotThreadLocal.set(snapshot);
            }
        }

        public final void restoreNonObservable(Snapshot snapshot, Snapshot snapshot2, ky kyVar) {
            if (snapshot != snapshot2) {
                snapshot2.restoreCurrent(snapshot);
                snapshot2.dispose();
            } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(kyVar);
            } else if (snapshot instanceof TransparentObserverSnapshot) {
                ((TransparentObserverSnapshot) snapshot).setReadObserver$runtime(kyVar);
            } else {
                o.p(snapshot, "Non-transparent snapshot was reused: ");
            }
        }

        public final void sendApplyNotifications() {
            GlobalSnapshot globalSnapshot;
            boolean hasPendingChanges;
            synchronized (SnapshotKt.getLock()) {
                globalSnapshot = SnapshotKt.globalSnapshot;
                hasPendingChanges = globalSnapshot.hasPendingChanges();
            }
            if (hasPendingChanges) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        public final MutableSnapshot takeMutableSnapshot(ky kyVar, ky kyVar2) {
            MutableSnapshot takeNestedMutableSnapshot;
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
            if (mutableSnapshot != null && (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(kyVar, kyVar2)) != null) {
                return takeNestedMutableSnapshot;
            }
            o.f("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }

        public final Snapshot takeSnapshot(ky kyVar) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(kyVar);
        }

        public final <R> R withMutableSnapshot(iy iyVar) {
            MutableSnapshot takeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot makeCurrent = takeMutableSnapshot$default.makeCurrent();
                try {
                    R r = (R) iyVar.invoke();
                    takeMutableSnapshot$default.apply().check();
                    return r;
                } finally {
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                }
            } finally {
            }
        }

        public final <T> T withoutReadObservation(iy iyVar) {
            Snapshot currentThreadSnapshot = getCurrentThreadSnapshot();
            ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return (T) iyVar.invoke();
            } finally {
                restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }

        private Companion() {
        }

        private final boolean getCanBeReused(TransparentObserverSnapshot transparentObserverSnapshot) {
            return transparentObserverSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId();
        }

        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }
    }

    @er
    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    public static /* synthetic */ void getReadObserver$annotations() {
    }

    public /* synthetic */ Snapshot(long j, SnapshotIdSet snapshotIdSet, dq dqVar) {
        this(j, snapshotIdSet);
    }

    public /* synthetic */ Snapshot(int i, SnapshotIdSet snapshotIdSet, dq dqVar) {
        this(i, snapshotIdSet);
    }

    @er
    private /* synthetic */ Snapshot(int i, SnapshotIdSet snapshotIdSet) {
        this(SnapshotId_jvmKt.toSnapshotId(i), snapshotIdSet, (dq) null);
    }
}
