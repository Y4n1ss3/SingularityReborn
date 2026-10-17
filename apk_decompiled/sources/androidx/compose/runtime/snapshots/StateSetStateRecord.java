package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StateSetStateRecord<T> extends StateRecord {
    public static final int $stable = 8;
    private int modification;
    private PersistentSet<? extends T> set;

    public StateSetStateRecord(long j, PersistentSet<? extends T> persistentSet) {
        super(j);
        this.set = persistentSet;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public void assign(StateRecord stateRecord) {
        synchronized (SnapshotStateSetKt.sync) {
            stateRecord.getClass();
            this.set = ((StateSetStateRecord) stateRecord).set;
            this.modification = ((StateSetStateRecord) stateRecord).modification;
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public StateRecord create() {
        return new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.set);
    }

    public final int getModification$runtime() {
        return this.modification;
    }

    public final PersistentSet<T> getSet$runtime() {
        return this.set;
    }

    public final void setModification$runtime(int i) {
        this.modification = i;
    }

    public final void setSet$runtime(PersistentSet<? extends T> persistentSet) {
        this.set = persistentSet;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public StateRecord create(long j) {
        return new StateSetStateRecord(j, this.set);
    }
}
