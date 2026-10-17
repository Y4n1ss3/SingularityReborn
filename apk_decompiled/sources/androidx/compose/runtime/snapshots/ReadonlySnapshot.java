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
public final class ReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    private final ky readObserver;
    private int snapshots;

    public ReadonlySnapshot(long j, SnapshotIdSet snapshotIdSet, ky kyVar) {
        super(j, snapshotIdSet, (dq) null);
        this.readObserver = kyVar;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime()) {
            return;
        }
        mo4151nestedDeactivated$runtime(this);
        super.dispose();
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public gb0 getModified$runtime() {
        return null;
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
    public ky getWriteObserver$runtime() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime */
    public void mo4150nestedActivated$runtime(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime */
    public void mo4151nestedDeactivated$runtime(Snapshot snapshot) {
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i == 0) {
            closeAndReleasePinning$runtime();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime */
    public void mo4152recordModified$runtime(StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new tj();
    }

    public void setModified$runtime(gb0 gb0Var) {
        throw gy.b();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(ky kyVar) {
        Map map;
        SnapshotKt.validateOpen(this);
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
        NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(getSnapshotId(), getInvalid$runtime(), SnapshotKt.mergedReadObserver$default(kyVar, getReadObserver(), false, 4, null), this);
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
    }
}
