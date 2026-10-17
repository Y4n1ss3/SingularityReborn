package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import defpackage.dq;
import defpackage.gb0;
import defpackage.gy;
import defpackage.ky;
import defpackage.tj;
import defpackage.xe0;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NestedReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    private final Snapshot parent;
    private final ky readObserver;

    public NestedReadonlySnapshot(long j, SnapshotIdSet snapshotIdSet, ky kyVar, Snapshot snapshot) {
        super(j, snapshotIdSet, (dq) null);
        this.readObserver = kyVar;
        this.parent = snapshot;
        snapshot.mo4150nestedActivated$runtime(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime()) {
            return;
        }
        if (getSnapshotId() != this.parent.getSnapshotId()) {
            closeAndReleasePinning$runtime();
        }
        this.parent.mo4151nestedDeactivated$runtime(this);
        super.dispose();
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public gb0 getModified$runtime() {
        return null;
    }

    public final Snapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public ky getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public ky getWriteObserver$runtime() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
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
    /* renamed from: recordModified$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo4152recordModified$runtime(StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new tj();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public NestedReadonlySnapshot takeNestedSnapshot(ky kyVar) {
        Map map;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            xe0 mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, true, kyVar, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) mergeObservers.d;
            ky readObserver = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) mergeObservers.e;
            kyVar = readObserver;
        } else {
            map = null;
        }
        NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(getSnapshotId(), getInvalid$runtime(), SnapshotKt.mergedReadObserver$default(kyVar, getReadObserver(), false, 4, null), getParent());
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
    }
}
