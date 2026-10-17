package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.Thread_jvmKt;
import defpackage.dq;
import defpackage.gb0;
import defpackage.gy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransparentObserverSnapshot extends Snapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsParentSnapshot;
    private final Snapshot parentSnapshot;
    private ky readObserver;
    private final Snapshot root;
    private final long threadId;
    private final ky writeObserver;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransparentObserverSnapshot(Snapshot snapshot, ky kyVar, boolean z, boolean z2) {
        super(r0, SnapshotIdSet.Companion.getEMPTY(), (dq) null);
        long j;
        GlobalSnapshot globalSnapshot;
        ky readObserver;
        j = SnapshotKt.INVALID_SNAPSHOT;
        this.parentSnapshot = snapshot;
        this.mergeParentObservers = z;
        this.ownsParentSnapshot = z2;
        if (snapshot == null || (readObserver = snapshot.getReadObserver()) == null) {
            globalSnapshot = SnapshotKt.globalSnapshot;
            readObserver = globalSnapshot.getReadObserver();
        }
        this.readObserver = SnapshotKt.mergedReadObserver(kyVar, readObserver, z);
        this.threadId = Thread_jvmKt.currentThreadId();
        this.root = this;
    }

    private final Snapshot getCurrentSnapshot() {
        GlobalSnapshot globalSnapshot;
        Snapshot snapshot = this.parentSnapshot;
        if (snapshot != null) {
            return snapshot;
        }
        globalSnapshot = SnapshotKt.globalSnapshot;
        return globalSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        Snapshot snapshot;
        setDisposed$runtime(true);
        if (!this.ownsParentSnapshot || (snapshot = this.parentSnapshot) == null) {
            return;
        }
        snapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public SnapshotIdSet getInvalid$runtime() {
        return getCurrentSnapshot().getInvalid$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public gb0 getModified$runtime() {
        return getCurrentSnapshot().getModified$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public ky getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    public final long getThreadId$runtime() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public ky getWriteObserver$runtime() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo4150nestedActivated$runtime(Snapshot snapshot) {
        throw gy.b();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo4151nestedDeactivated$runtime(Snapshot snapshot) {
        throw gy.b();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime */
    public void mo4152recordModified$runtime(StateObject stateObject) {
        getCurrentSnapshot().mo4152recordModified$runtime(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime(SnapshotIdSet snapshotIdSet) {
        throw gy.b();
    }

    public void setModified$runtime(gb0 gb0Var) {
        throw gy.b();
    }

    public void setReadObserver$runtime(ky kyVar) {
        this.readObserver = kyVar;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setSnapshotId$runtime(long j) {
        throw gy.b();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(ky kyVar) {
        Snapshot createTransparentSnapshotWithNoParentReadObserver;
        ky mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(kyVar, getReadObserver(), false, 4, null);
        if (this.mergeParentObservers) {
            return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
        }
        createTransparentSnapshotWithNoParentReadObserver = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver$default, true);
        return createTransparentSnapshotWithNoParentReadObserver;
    }
}
