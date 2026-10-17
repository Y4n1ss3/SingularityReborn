package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.Thread_jvmKt;
import defpackage.gb0;
import defpackage.gy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsParentSnapshot;
    private final MutableSnapshot parentSnapshot;
    private ky readObserver;
    private final long threadId;
    private ky writeObserver;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransparentObserverMutableSnapshot(MutableSnapshot mutableSnapshot, ky kyVar, ky kyVar2, boolean z, boolean z2) {
        super(r1, r3, r4, SnapshotKt.mergedWriteObserver(kyVar2, r8));
        long j;
        GlobalSnapshot globalSnapshot;
        ky readObserver;
        GlobalSnapshot globalSnapshot2;
        ky writeObserver$runtime;
        j = SnapshotKt.INVALID_SNAPSHOT;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        if (mutableSnapshot == null || (readObserver = mutableSnapshot.getReadObserver()) == null) {
            globalSnapshot = SnapshotKt.globalSnapshot;
            readObserver = globalSnapshot.getReadObserver();
        }
        ky mergedReadObserver = SnapshotKt.mergedReadObserver(kyVar, readObserver, z);
        if (mutableSnapshot == null || (writeObserver$runtime = mutableSnapshot.getWriteObserver$runtime()) == null) {
            globalSnapshot2 = SnapshotKt.globalSnapshot;
            writeObserver$runtime = globalSnapshot2.getWriteObserver$runtime();
        }
        this.parentSnapshot = mutableSnapshot;
        this.mergeParentObservers = z;
        this.ownsParentSnapshot = z2;
        this.readObserver = super.getReadObserver();
        this.writeObserver = super.getWriteObserver$runtime();
        this.threadId = Thread_jvmKt.currentThreadId();
    }

    private final MutableSnapshot getCurrentSnapshot() {
        GlobalSnapshot globalSnapshot;
        MutableSnapshot mutableSnapshot = this.parentSnapshot;
        if (mutableSnapshot != null) {
            return mutableSnapshot;
        }
        globalSnapshot = SnapshotKt.globalSnapshot;
        return globalSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        return getCurrentSnapshot().apply();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        MutableSnapshot mutableSnapshot;
        setDisposed$runtime(true);
        if (!this.ownsParentSnapshot || (mutableSnapshot = this.parentSnapshot) == null) {
            return;
        }
        mutableSnapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public SnapshotIdSet getInvalid$runtime() {
        return getCurrentSnapshot().getInvalid$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public gb0 getModified$runtime() {
        return getCurrentSnapshot().getModified$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public ky getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    public final long getThreadId$runtime() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime() {
        return getCurrentSnapshot().getWriteCount$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public ky getWriteObserver$runtime() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo4150nestedActivated$runtime(Snapshot snapshot) {
        throw gy.b();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo4151nestedDeactivated$runtime(Snapshot snapshot) {
        throw gy.b();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime */
    public void mo4152recordModified$runtime(StateObject stateObject) {
        getCurrentSnapshot().mo4152recordModified$runtime(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime(SnapshotIdSet snapshotIdSet) {
        throw gy.b();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
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

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime(int i) {
        getCurrentSnapshot().setWriteCount$runtime(i);
    }

    public void setWriteObserver$runtime(ky kyVar) {
        this.writeObserver = kyVar;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(ky kyVar, ky kyVar2) {
        ky mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(kyVar, getReadObserver(), false, 4, null);
        ky mergedWriteObserver = SnapshotKt.mergedWriteObserver(kyVar2, getWriteObserver$runtime());
        return !this.mergeParentObservers ? new TransparentObserverMutableSnapshot(getCurrentSnapshot().takeNestedMutableSnapshot(null, mergedWriteObserver), mergedReadObserver$default, mergedWriteObserver, false, true) : getCurrentSnapshot().takeNestedMutableSnapshot(mergedReadObserver$default, mergedWriteObserver);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
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
