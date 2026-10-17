package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotStateSetKt {
    private static final Object sync = new Object();

    public static final <T> boolean attemptUpdate(StateSetStateRecord<T> stateSetStateRecord, int i, PersistentSet<? extends T> persistentSet) {
        boolean z;
        synchronized (sync) {
            if (stateSetStateRecord.getModification$runtime() == i) {
                stateSetStateRecord.setSet$runtime(persistentSet);
                z = true;
                stateSetStateRecord.setModification$runtime(stateSetStateRecord.getModification$runtime() + 1);
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final <T> void clearImpl(SnapshotStateSet<T> snapshotStateSet) {
        Snapshot current;
        StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
        firstStateRecord.getClass();
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord, snapshotStateSet, current);
            synchronized (sync) {
                stateSetStateRecord2.setSet$runtime(ExtensionsKt.persistentSetOf());
                stateSetStateRecord2.setModification$runtime(stateSetStateRecord2.getModification$runtime() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, snapshotStateSet);
    }

    public static final <T> boolean conditionalUpdate(SnapshotStateSet<T> snapshotStateSet, ky kyVar) {
        int modification$runtime;
        PersistentSet<T> set$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
                firstStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime = stateSetStateRecord.getModification$runtime();
                set$runtime = stateSetStateRecord.getSet$runtime();
            }
            set$runtime.getClass();
            PersistentSet persistentSet = (PersistentSet) kyVar.invoke(set$runtime);
            if (q10.b(persistentSet, set$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = snapshotStateSet.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, snapshotStateSet, current), modification$runtime, persistentSet);
            }
            SnapshotKt.notifyWrite(current, snapshotStateSet);
        } while (!attemptUpdate);
        return true;
    }

    public static final <T> int getModification(SnapshotStateSet<T> snapshotStateSet) {
        StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
        firstStateRecord.getClass();
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getModification$runtime();
    }

    public static final <T> StateSetStateRecord<T> getReadable(SnapshotStateSet<T> snapshotStateSet) {
        StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
        firstStateRecord.getClass();
        return (StateSetStateRecord) SnapshotKt.readable((StateSetStateRecord) firstStateRecord, snapshotStateSet);
    }

    public static final <R, T> R mutate(SnapshotStateSet<T> snapshotStateSet, ky kyVar) {
        int modification$runtime;
        PersistentSet<T> set$runtime;
        PersistentSet.Builder<T> builder;
        R r;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
                firstStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime = stateSetStateRecord.getModification$runtime();
                set$runtime = stateSetStateRecord.getSet$runtime();
            }
            if (set$runtime != null && (builder = set$runtime.builder()) != null) {
                r = (R) kyVar.invoke(builder);
                PersistentSet<T> build = builder.build();
                if (q10.b(build, set$runtime)) {
                    break;
                }
                StateRecord firstStateRecord2 = snapshotStateSet.getFirstStateRecord();
                firstStateRecord2.getClass();
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, snapshotStateSet, current), modification$runtime, build);
                }
                SnapshotKt.notifyWrite(current, snapshotStateSet);
            } else {
                o.f("No set to mutate");
                return null;
            }
        } while (!attemptUpdate);
        return r;
    }

    public static final <T> boolean mutateBoolean(SnapshotStateSet<T> snapshotStateSet, ky kyVar) {
        int modification$runtime;
        PersistentSet<T> set$runtime;
        PersistentSet.Builder<T> builder;
        Object invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
                firstStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime = stateSetStateRecord.getModification$runtime();
                set$runtime = stateSetStateRecord.getSet$runtime();
            }
            if (set$runtime != null && (builder = set$runtime.builder()) != null) {
                invoke = kyVar.invoke(builder);
                PersistentSet<T> build = builder.build();
                if (q10.b(build, set$runtime)) {
                    break;
                }
                StateRecord firstStateRecord2 = snapshotStateSet.getFirstStateRecord();
                firstStateRecord2.getClass();
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    attemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, snapshotStateSet, current), modification$runtime, build);
                }
                SnapshotKt.notifyWrite(current, snapshotStateSet);
            } else {
                o.f("No set to mutate");
                return false;
            }
        } while (!attemptUpdate);
        return ((Boolean) invoke).booleanValue();
    }

    public static final <T> StateRecord stateRecordWith(SnapshotStateSet<T> snapshotStateSet, PersistentSet<? extends T> persistentSet) {
        StateSetStateRecord stateSetStateRecord = new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), persistentSet);
        if (Snapshot.Companion.isInSnapshot()) {
            stateSetStateRecord.setNext$runtime(new StateSetStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentSet));
        }
        return stateSetStateRecord;
    }

    public static final <R, T> R withCurrent(SnapshotStateSet<T> snapshotStateSet, ky kyVar) {
        StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
        firstStateRecord.getClass();
        return (R) kyVar.invoke(SnapshotKt.current((StateSetStateRecord) firstStateRecord));
    }

    public static final <R, T> R writable(SnapshotStateSet<T> snapshotStateSet, ky kyVar) {
        Snapshot current;
        R r;
        StateRecord firstStateRecord = snapshotStateSet.getFirstStateRecord();
        firstStateRecord.getClass();
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            r = (R) kyVar.invoke(SnapshotKt.writableRecord(stateSetStateRecord, snapshotStateSet, current));
        }
        SnapshotKt.notifyWrite(current, snapshotStateSet);
        return r;
    }

    public static /* synthetic */ void getReadable$annotations(SnapshotStateSet snapshotStateSet) {
    }
}
