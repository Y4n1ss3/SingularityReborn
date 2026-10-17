package androidx.compose.runtime.snapshots;

import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class StateRecord {
    public static final int $stable = 8;
    private StateRecord next;
    private long snapshotId;

    public StateRecord() {
        this(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    public abstract void assign(StateRecord stateRecord);

    public abstract StateRecord create();

    @er
    public /* synthetic */ StateRecord create(int i) {
        StateRecord create = create();
        create.snapshotId = SnapshotId_jvmKt.toSnapshotId(i);
        return create;
    }

    public final StateRecord getNext$runtime() {
        return this.next;
    }

    public final long getSnapshotId$runtime() {
        return this.snapshotId;
    }

    public final void setNext$runtime(StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public final void setSnapshotId$runtime(long j) {
        this.snapshotId = j;
    }

    public StateRecord create(long j) {
        StateRecord create = create();
        create.snapshotId = j;
        return create;
    }

    public StateRecord(long j) {
        this.snapshotId = j;
    }

    @er
    public StateRecord(int i) {
        this(SnapshotId_jvmKt.toSnapshotId(i));
    }
}
