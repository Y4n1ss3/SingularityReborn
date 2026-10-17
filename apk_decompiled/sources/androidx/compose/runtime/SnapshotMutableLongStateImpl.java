package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import defpackage.ky;
import defpackage.mb0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class SnapshotMutableLongStateImpl extends StateObjectImpl implements MutableLongState, SnapshotMutableState<Long> {
    public static final int $stable = 0;
    private LongStateStateRecord next;

    public SnapshotMutableLongStateImpl(long j) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        LongStateStateRecord longStateStateRecord = new LongStateStateRecord(currentSnapshot.getSnapshotId(), j);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            longStateStateRecord.setNext$runtime(new LongStateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), j));
        }
        this.next = longStateStateRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 component2$lambda$0(SnapshotMutableLongStateImpl snapshotMutableLongStateImpl, long j) {
        snapshotMutableLongStateImpl.setLongValue(j);
        return w01.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Long component1() {
        return Long.valueOf(getLongValue());
    }

    @Override // androidx.compose.runtime.MutableState
    public ky component2() {
        return new mb0(this, 25);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public long getLongValue() {
        return ((LongStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Long> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        stateRecord2.getClass();
        stateRecord3.getClass();
        if (((LongStateStateRecord) stateRecord2).getValue() == ((LongStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.next = (LongStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableLongState
    public void setLongValue(long j) {
        Snapshot current;
        LongStateStateRecord longStateStateRecord = (LongStateStateRecord) SnapshotKt.current(this.next);
        if (longStateStateRecord.getValue() != j) {
            LongStateStateRecord longStateStateRecord2 = this.next;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((LongStateStateRecord) SnapshotKt.overwritableRecord(longStateStateRecord2, this, current, longStateStateRecord)).setValue(j);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    public String toString() {
        return "MutableLongState(value=" + ((LongStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class LongStateStateRecord extends StateRecord {
        private long value;

        public LongStateStateRecord(long j, long j2) {
            super(j);
            this.value = j2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            stateRecord.getClass();
            this.value = ((LongStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        public final long getValue() {
            return this.value;
        }

        public final void setValue(long j) {
            this.value = j;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j) {
            return new LongStateStateRecord(j, this.value);
        }
    }
}
