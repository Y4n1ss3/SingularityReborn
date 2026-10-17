package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import defpackage.gy;
import defpackage.ky;
import defpackage.qo;
import defpackage.w01;
import defpackage.xe0;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GlobalSnapshot extends MutableSnapshot {
    public static final int $stable = 8;

    public GlobalSnapshot(long j, SnapshotIdSet snapshotIdSet) {
        super(j, snapshotIdSet, null, new qo(29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$0(Object obj) {
        List list;
        synchronized (SnapshotKt.getLock()) {
            list = SnapshotKt.globalWriteObservers;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((ky) list.get(i)).invoke(obj);
            }
        }
        return w01.a;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime();
        }
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
        SnapshotKt.advanceGlobalSnapshot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(final ky kyVar, ky kyVar2) {
        final ky kyVar3;
        Map map;
        Snapshot takeNewSnapshot;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            xe0 mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, null, false, kyVar, kyVar2);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) mergeObservers.d;
            ky readObserver = snapshotInstanceObservers.getReadObserver();
            ky writeObserver = snapshotInstanceObservers.getWriteObserver();
            map = (Map) mergeObservers.e;
            kyVar = readObserver;
            kyVar3 = writeObserver;
        } else {
            kyVar3 = kyVar2;
            map = null;
        }
        takeNewSnapshot = SnapshotKt.takeNewSnapshot(new ky() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1$1
            @Override // defpackage.ky
            public final MutableSnapshot invoke(SnapshotIdSet snapshotIdSet) {
                long j;
                long j2;
                synchronized (SnapshotKt.getLock()) {
                    j = SnapshotKt.nextSnapshotId;
                    j2 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = j2 + 1;
                }
                return new MutableSnapshot(j, snapshotIdSet, ky.this, kyVar3);
            }
        });
        MutableSnapshot mutableSnapshot = (MutableSnapshot) takeNewSnapshot;
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, null, mutableSnapshot, map);
        }
        return mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(final ky kyVar) {
        Map map;
        Snapshot takeNewSnapshot;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            xe0 mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, null, true, kyVar, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) mergeObservers.d;
            ky readObserver = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) mergeObservers.e;
            kyVar = readObserver;
        } else {
            map = null;
        }
        takeNewSnapshot = SnapshotKt.takeNewSnapshot(new ky() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1$1
            @Override // defpackage.ky
            public final ReadonlySnapshot invoke(SnapshotIdSet snapshotIdSet) {
                long j;
                long j2;
                synchronized (SnapshotKt.getLock()) {
                    j = SnapshotKt.nextSnapshotId;
                    j2 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = j2 + 1;
                }
                return new ReadonlySnapshot(j, snapshotIdSet, ky.this);
            }
        });
        ReadonlySnapshot readonlySnapshot = (ReadonlySnapshot) takeNewSnapshot;
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, null, readonlySnapshot, map);
        }
        return readonlySnapshot;
    }
}
