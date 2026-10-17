package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StateListStateRecord<T> extends StateRecord {
    public static final int $stable = 8;
    private PersistentList<? extends T> list;
    private int modification;
    private int structuralChange;

    public StateListStateRecord(long j, PersistentList<? extends T> persistentList) {
        super(j);
        this.list = persistentList;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public void assign(StateRecord stateRecord) {
        synchronized (SnapshotStateListKt.sync) {
            stateRecord.getClass();
            this.list = ((StateListStateRecord) stateRecord).list;
            this.modification = ((StateListStateRecord) stateRecord).modification;
            this.structuralChange = ((StateListStateRecord) stateRecord).structuralChange;
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public StateRecord create() {
        return create(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    public final PersistentList<T> getList$runtime() {
        return this.list;
    }

    public final int getModification$runtime() {
        return this.modification;
    }

    public final int getStructuralChange$runtime() {
        return this.structuralChange;
    }

    public final void setList$runtime(PersistentList<? extends T> persistentList) {
        this.list = persistentList;
    }

    public final void setModification$runtime(int i) {
        this.modification = i;
    }

    public final void setStructuralChange$runtime(int i) {
        this.structuralChange = i;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public StateRecord create(long j) {
        return new StateListStateRecord(j, this.list);
    }
}
