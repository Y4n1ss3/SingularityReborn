package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotStateListKt {
    private static final Object sync = new Object();

    public static final <T> SnapshotStateList<T> SnapshotStateList(int i, ky kyVar) {
        if (i == 0) {
            return new SnapshotStateList<>();
        }
        PersistentList.Builder builder = ExtensionsKt.persistentListOf().builder();
        for (int i2 = 0; i2 < i; i2++) {
            builder.add(kyVar.invoke(Integer.valueOf(i2)));
        }
        return new SnapshotStateList<>(builder.build());
    }

    public static final <T> boolean attemptUpdate(StateListStateRecord<T> stateListStateRecord, int i, PersistentList<? extends T> persistentList, boolean z) {
        boolean z2;
        synchronized (sync) {
            try {
                if (stateListStateRecord.getModification$runtime() == i) {
                    stateListStateRecord.setList$runtime(persistentList);
                    z2 = true;
                    if (z) {
                        stateListStateRecord.setStructuralChange$runtime(stateListStateRecord.getStructuralChange$runtime() + 1);
                    }
                    stateListStateRecord.setModification$runtime(stateListStateRecord.getModification$runtime() + 1);
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final <T> void clearImpl(SnapshotStateList<T> snapshotStateList) {
        Snapshot current;
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        firstStateRecord.getClass();
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, snapshotStateList, current);
            synchronized (sync) {
                stateListStateRecord2.setList$runtime(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime(stateListStateRecord2.getModification$runtime() + 1);
                stateListStateRecord2.setStructuralChange$runtime(stateListStateRecord2.getStructuralChange$runtime() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, snapshotStateList);
    }

    public static final <T> boolean conditionalUpdate(SnapshotStateList<T> snapshotStateList, boolean z, ky kyVar) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList persistentList = (PersistentList) kyVar.invoke(list$runtime);
            if (q10.b(persistentList, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, persistentList, z);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
        return true;
    }

    public static boolean conditionalUpdate$default(SnapshotStateList snapshotStateList, boolean z, ky kyVar, int i, Object obj) {
        int modification$runtime;
        PersistentList list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        if ((i & 1) != 0) {
            z = true;
        }
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList persistentList = (PersistentList) kyVar.invoke(list$runtime);
            if (q10.b(persistentList, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, persistentList, z);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
        return true;
    }

    public static final <T> StateListStateRecord<T> getReadable(SnapshotStateList<T> snapshotStateList) {
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        firstStateRecord.getClass();
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, snapshotStateList);
    }

    public static final <T> int getStructure(SnapshotStateList<T> snapshotStateList) {
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        firstStateRecord.getClass();
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getStructuralChange$runtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void invalidIteratorSet() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final <R, T> R mutate(SnapshotStateList<T> snapshotStateList, ky kyVar) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        R r;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList.Builder<T> builder = list$runtime.builder();
            r = (R) kyVar.invoke(builder);
            PersistentList<T> build = builder.build();
            if (q10.b(build, list$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, build, true);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
        return r;
    }

    public static final <T> boolean mutateBoolean(SnapshotStateList<T> snapshotStateList, ky kyVar) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Object invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList.Builder<T> builder = list$runtime.builder();
            invoke = kyVar.invoke(builder);
            PersistentList<T> build = builder.build();
            if (q10.b(build, list$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, build, true);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
        return ((Boolean) invoke).booleanValue();
    }

    public static final <T> StateRecord stateRecordWith(SnapshotStateList<T> snapshotStateList, PersistentList<? extends T> persistentList) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(currentSnapshot.getSnapshotId(), persistentList);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateListStateRecord.setNext$runtime(new StateListStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentList));
        }
        return stateListStateRecord;
    }

    public static final <T> void update(SnapshotStateList<T> snapshotStateList, boolean z, ky kyVar) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList persistentList = (PersistentList) kyVar.invoke(list$runtime);
            if (q10.b(persistentList, list$runtime)) {
                return;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, persistentList, z);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
    }

    public static void update$default(SnapshotStateList snapshotStateList, boolean z, ky kyVar, int i, Object obj) {
        int modification$runtime;
        PersistentList list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        if ((i & 1) != 0) {
            z = true;
        }
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList persistentList = (PersistentList) kyVar.invoke(list$runtime);
            if (q10.b(persistentList, list$runtime)) {
                return;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, persistentList, z);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateRange(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final <R, T> R withCurrent(SnapshotStateList<T> snapshotStateList, ky kyVar) {
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        firstStateRecord.getClass();
        return (R) kyVar.invoke(SnapshotKt.current((StateListStateRecord) firstStateRecord));
    }

    public static final <R, T> R writable(SnapshotStateList<T> snapshotStateList, ky kyVar) {
        Snapshot current;
        R r;
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        firstStateRecord.getClass();
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            r = (R) kyVar.invoke(SnapshotKt.writableRecord(stateListStateRecord, snapshotStateList, current));
        }
        SnapshotKt.notifyWrite(current, snapshotStateList);
        return r;
    }

    public static /* synthetic */ void getReadable$annotations(SnapshotStateList snapshotStateList) {
    }
}
