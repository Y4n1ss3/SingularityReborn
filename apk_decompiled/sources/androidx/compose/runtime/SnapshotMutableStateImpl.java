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
public class SnapshotMutableStateImpl<T> extends StateObjectImpl implements SnapshotMutableState<T> {
    public static final int $stable = 0;
    private StateStateRecord<T> next;
    private final SnapshotMutationPolicy<T> policy;

    public SnapshotMutableStateImpl(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.policy = snapshotMutationPolicy;
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateStateRecord<T> stateStateRecord = new StateStateRecord<>(currentSnapshot.getSnapshotId(), t);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateStateRecord.setNext$runtime(new StateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), t));
        }
        this.next = stateStateRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 component2$lambda$0(SnapshotMutableStateImpl snapshotMutableStateImpl, Object obj) {
        snapshotMutableStateImpl.setValue(obj);
        return w01.a;
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public ky component2() {
        return new mb0(this, 26);
    }

    public final T getDebuggerDisplayValue() {
        return (T) ((StateStateRecord) SnapshotKt.current(this.next)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return (T) ((StateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        stateRecord.getClass();
        StateStateRecord stateStateRecord = (StateStateRecord) stateRecord;
        stateRecord2.getClass();
        StateStateRecord stateStateRecord2 = (StateStateRecord) stateRecord2;
        stateRecord3.getClass();
        StateStateRecord stateStateRecord3 = (StateStateRecord) stateRecord3;
        if (getPolicy().equivalent(stateStateRecord2.getValue(), stateStateRecord3.getValue())) {
            return stateRecord2;
        }
        Object merge = getPolicy().merge(stateStateRecord.getValue(), stateStateRecord2.getValue(), stateStateRecord3.getValue());
        if (merge == null) {
            return null;
        }
        StateStateRecord create = stateStateRecord3.create(stateStateRecord3.getSnapshotId$runtime());
        create.setValue(merge);
        return create;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.next = (StateStateRecord) stateRecord;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t) {
        Snapshot current;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.current(this.next);
        if (getPolicy().equivalent(stateStateRecord.getValue(), t)) {
            return;
        }
        StateStateRecord<T> stateStateRecord2 = this.next;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            ((StateStateRecord) SnapshotKt.overwritableRecord(stateStateRecord2, this, current, stateStateRecord)).setValue(t);
        }
        SnapshotKt.notifyWrite(current, this);
    }

    public String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class StateStateRecord<T> extends StateRecord {
        private T value;

        public StateStateRecord(long j, T t) {
            super(j);
            this.value = t;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            stateRecord.getClass();
            this.value = ((StateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateStateRecord<T> create() {
            return new StateStateRecord<>(SnapshotKt.currentSnapshot().getSnapshotId(), this.value);
        }

        public final T getValue() {
            return this.value;
        }

        public final void setValue(T t) {
            this.value = t;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateStateRecord<T> create(long j) {
            return new StateStateRecord<>(SnapshotKt.currentSnapshot().getSnapshotId(), this.value);
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
