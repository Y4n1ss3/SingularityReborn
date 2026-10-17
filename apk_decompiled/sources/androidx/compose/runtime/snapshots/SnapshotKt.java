package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.tooling.ComposeToolingFlags;
import defpackage.er0;
import defpackage.fo0;
import defpackage.gb0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.q10;
import defpackage.tj;
import defpackage.ut;
import defpackage.w01;
import defpackage.z4;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotKt {
    private static final long INVALID_SNAPSHOT = 0;
    private static List<? extends my> applyObservers;
    private static final SnapshotWeakSet<StateObject> extraStateObjects;
    private static final GlobalSnapshot globalSnapshot;
    private static List<? extends ky> globalWriteObservers;
    private static long nextSnapshotId;
    private static SnapshotIdSet openSnapshots;
    private static AtomicInt pendingApplyObserverCount;
    private static final SnapshotDoubleIndexHeap pinningTable;
    private static final Snapshot snapshotInitializer;
    private static final ky emptyLambda = new fo0(4);
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.Companion;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = SnapshotId_jvmKt.toSnapshotId(1) + 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet<>();
        ut utVar = ut.d;
        applyObservers = utVar;
        globalWriteObservers = utVar;
        long j = nextSnapshotId;
        nextSnapshotId = 1 + j;
        GlobalSnapshot globalSnapshot2 = new GlobalSnapshot(j, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot2.getSnapshotId());
        globalSnapshot = globalSnapshot2;
        snapshotInitializer = globalSnapshot2;
        pendingApplyObserverCount = new AtomicInt(0);
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, long j, long j2) {
        while (q10.i(j, j2) < 0) {
            snapshotIdSet = snapshotIdSet.set(j);
            j++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T advanceGlobalSnapshot(ky kyVar) {
        gb0 modified$runtime;
        T t;
        GlobalSnapshot globalSnapshot2 = globalSnapshot;
        synchronized (getLock()) {
            try {
                modified$runtime = globalSnapshot2.getModified$runtime();
                if (modified$runtime != null) {
                    pendingApplyObserverCount.add(1);
                }
                t = (T) resetGlobalSnapshotLocked(globalSnapshot2, kyVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (modified$runtime != null) {
            try {
                List<? extends my> list = applyObservers;
                Set wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(modified$runtime);
                if (ComposeToolingFlags.isVerboseTracingEnabled) {
                    Object beginSection = Trace.INSTANCE.beginSection("Compose:applyObservers");
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            list.get(i).invoke(wrapIntoSet, globalSnapshot2);
                        }
                        Trace.INSTANCE.endSection(beginSection);
                    } catch (Throwable th2) {
                        Trace.INSTANCE.endSection(beginSection);
                        throw th2;
                    }
                } else {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        list.get(i2).invoke(wrapIntoSet, globalSnapshot2);
                    }
                }
                pendingApplyObserverCount.add(-1);
            } catch (Throwable th3) {
                pendingApplyObserverCount.add(-1);
                throw th3;
            }
        }
        synchronized (getLock()) {
            checkAndOverwriteUnusedRecordsLocked();
            if (modified$runtime != null) {
                Object[] objArr = modified$runtime.b;
                long[] jArr = modified$runtime.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    processForUnusedRecordsLocked((StateObject) objArr[(i3 << 3) + i5]);
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime = snapshotWeakSet.getSize$runtime();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size$runtime) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime()[i];
            StateObject stateObject = weakReference != null ? weakReference.get() : null;
            if (stateObject != null && overwriteUnusedRecordsLocked(stateObject)) {
                if (i2 != i) {
                    snapshotWeakSet.getValues$runtime()[i2] = weakReference;
                    snapshotWeakSet.getHashes$runtime()[i2] = snapshotWeakSet.getHashes$runtime()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size$runtime; i3++) {
            snapshotWeakSet.getValues$runtime()[i3] = null;
            snapshotWeakSet.getHashes$runtime()[i3] = 0;
        }
        if (i2 != size$runtime) {
            snapshotWeakSet.setSize$runtime(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, ky kyVar, boolean z) {
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (z2 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z2 ? (MutableSnapshot) snapshot : null, kyVar, null, false, z);
        }
        return new TransparentObserverSnapshot(snapshot, kyVar, false, z);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, ky kyVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, kyVar, z);
    }

    public static final <T extends StateRecord> T current(T t) {
        T t2;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        T t3 = (T) readable(t, current.getSnapshotId(), current.getInvalid$runtime());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t2 = (T) readable(t, current2.getSnapshotId(), current2.getInvalid$runtime());
        }
        if (t2 != null) {
            return t2;
        }
        readError();
        o.j();
        return null;
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? globalSnapshot : snapshot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 emptyLambda$lambda$0(SnapshotIdSet snapshotIdSet) {
        return w01.a;
    }

    private static final StateRecord findYoungestOr(StateRecord stateRecord, ky kyVar) {
        StateRecord stateRecord2 = stateRecord;
        while (stateRecord != null) {
            if (((Boolean) kyVar.invoke(stateRecord)).booleanValue()) {
                return stateRecord;
            }
            if (q10.i(stateRecord2.getSnapshotId$runtime(), stateRecord.getSnapshotId$runtime()) < 0) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext$runtime();
        }
        return stateRecord2;
    }

    public static final Object getLock() {
        return lock;
    }

    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    public static final ky mergedReadObserver(ky kyVar, ky kyVar2, boolean z) {
        if (!z) {
            kyVar2 = null;
        }
        return (kyVar == null || kyVar2 == null || kyVar == kyVar2) ? kyVar == null ? kyVar2 : kyVar : new er0(0, kyVar, kyVar2);
    }

    public static /* synthetic */ ky mergedReadObserver$default(ky kyVar, ky kyVar2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return mergedReadObserver(kyVar, kyVar2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 mergedReadObserver$lambda$0(ky kyVar, ky kyVar2, Object obj) {
        kyVar.invoke(obj);
        kyVar2.invoke(obj);
        return w01.a;
    }

    public static final ky mergedWriteObserver(ky kyVar, ky kyVar2) {
        return (kyVar == null || kyVar2 == null || kyVar == kyVar2) ? kyVar == null ? kyVar2 : kyVar : new er0(1, kyVar, kyVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 mergedWriteObserver$lambda$0(ky kyVar, ky kyVar2, Object obj) {
        kyVar.invoke(obj);
        kyVar2.invoke(obj);
        return w01.a;
    }

    public static final <T extends StateRecord> T newOverwritableRecordLocked(T t, StateObject stateObject) {
        T t2 = (T) usedLocked(stateObject);
        if (t2 != null) {
            t2.setSnapshotId$runtime(SnapshotId_jvmKt.SnapshotIdMax);
            return t2;
        }
        T t3 = (T) t.create(SnapshotId_jvmKt.SnapshotIdMax);
        t3.setNext$runtime(stateObject.getFirstStateRecord());
        stateObject.prependStateRecord(t3);
        return t3;
    }

    public static final <T extends StateRecord> T newWritableRecord(T t, StateObject stateObject, Snapshot snapshot) {
        T t2;
        synchronized (getLock()) {
            t2 = (T) newWritableRecordLocked(t, stateObject, snapshot);
        }
        return t2;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t, StateObject stateObject, Snapshot snapshot) {
        T t2 = (T) newOverwritableRecordLocked(t, stateObject);
        t2.assign(t);
        t2.setSnapshotId$runtime(snapshot.getSnapshotId());
        return t2;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        snapshot.setWriteCount$runtime(snapshot.getWriteCount$runtime() + 1);
        ky writeObserver$runtime = snapshot.getWriteObserver$runtime();
        if (writeObserver$runtime != null) {
            writeObserver$runtime.invoke(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(long j, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        Map<StateRecord, StateRecord> map;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr;
        int i;
        long[] jArr2;
        Map<StateRecord, StateRecord> map2;
        SnapshotIdSet snapshotIdSet3;
        Object[] objArr2;
        int i2;
        int i3;
        gb0 modified$runtime = mutableSnapshot.getModified$runtime();
        Map<StateRecord, StateRecord> map3 = null;
        if (modified$runtime == null) {
            return null;
        }
        long snapshotId = mutableSnapshot.getSnapshotId();
        SnapshotIdSet or = mutableSnapshot.getInvalid$runtime().set(snapshotId).or(mutableSnapshot.getPreviousIds$runtime());
        Object[] objArr3 = modified$runtime.b;
        long[] jArr3 = modified$runtime.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap hashMap = null;
        int i4 = 0;
        while (true) {
            long j2 = jArr3[i4];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((255 & j2) < 128) {
                        StateObject stateObject = (StateObject) objArr3[(i4 << 3) + i7];
                        map2 = map3;
                        StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                        jArr2 = jArr3;
                        i2 = i4;
                        i3 = i5;
                        StateRecord readable = readable(firstStateRecord, j, snapshotIdSet);
                        if (readable == null) {
                            objArr2 = objArr3;
                        } else {
                            objArr2 = objArr3;
                            StateRecord readable2 = readable(firstStateRecord, snapshotId, or);
                            if (readable2 != null && !readable.equals(readable2)) {
                                snapshotIdSet3 = or;
                                StateRecord readable3 = readable(firstStateRecord, snapshotId, mutableSnapshot.getInvalid$runtime());
                                if (readable3 == null) {
                                    readError();
                                    o.j();
                                    return map2;
                                }
                                StateRecord mergeRecords = stateObject.mergeRecords(readable2, readable, readable3);
                                if (mergeRecords == null) {
                                    return map2;
                                }
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                hashMap.put(readable, mergeRecords);
                                hashMap = hashMap;
                            }
                        }
                        snapshotIdSet3 = or;
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        snapshotIdSet3 = or;
                        objArr2 = objArr3;
                        i2 = i4;
                        i3 = i5;
                    }
                    j2 >>= i3;
                    i7++;
                    map3 = map2;
                    i4 = i2;
                    i5 = i3;
                    jArr3 = jArr2;
                    objArr3 = objArr2;
                    or = snapshotIdSet3;
                }
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = or;
                objArr = objArr3;
                i = i4;
                if (i6 != i5) {
                    return hashMap;
                }
            } else {
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = or;
                objArr = objArr3;
                i = i4;
            }
            int i8 = i;
            if (i8 == length) {
                return hashMap;
            }
            i4 = i8 + 1;
            map3 = map;
            jArr3 = jArr;
            objArr3 = objArr;
            or = snapshotIdSet2;
        }
    }

    public static final <T extends StateRecord, R> R overwritable(T t, StateObject stateObject, T t2, ky kyVar) {
        Snapshot current;
        R r;
        synchronized (getLock()) {
            current = Snapshot.Companion.getCurrent();
            r = (R) kyVar.invoke(overwritableRecord(t, stateObject, current, t2));
        }
        notifyWrite(current, stateObject);
        return r;
    }

    public static final <T extends StateRecord> T overwritableRecord(T t, StateObject stateObject, Snapshot snapshot, T t2) {
        T t3;
        if (snapshot.getReadOnly()) {
            snapshot.mo4152recordModified$runtime(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        if (t2.getSnapshotId$runtime() == snapshotId) {
            return t2;
        }
        synchronized (getLock()) {
            t3 = (T) newOverwritableRecordLocked(t, stateObject);
        }
        t3.setSnapshotId$runtime(snapshotId);
        if (t2.getSnapshotId$runtime() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo4152recordModified$runtime(stateObject);
        }
        return t3;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        long lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        int i = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime()) {
            long snapshotId$runtime = firstStateRecord.getSnapshotId$runtime();
            if (snapshotId$runtime != INVALID_SNAPSHOT) {
                if (q10.i(snapshotId$runtime, lowestOrDefault) >= 0) {
                    i++;
                } else if (stateRecord2 == null) {
                    i++;
                    stateRecord2 = firstStateRecord;
                } else {
                    if (q10.i(firstStateRecord.getSnapshotId$runtime(), stateRecord2.getSnapshotId$runtime()) < 0) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord;
                    } else {
                        stateRecord = firstStateRecord;
                    }
                    if (stateRecord3 == null) {
                        stateRecord3 = stateObject.getFirstStateRecord();
                        StateRecord stateRecord4 = stateRecord3;
                        while (true) {
                            if (stateRecord3 == null) {
                                stateRecord3 = stateRecord4;
                                break;
                            }
                            if (q10.i(stateRecord3.getSnapshotId$runtime(), lowestOrDefault) >= 0) {
                                break;
                            }
                            if (q10.i(stateRecord4.getSnapshotId$runtime(), stateRecord3.getSnapshotId$runtime()) < 0) {
                                stateRecord4 = stateRecord3;
                            }
                            stateRecord3 = stateRecord3.getNext$runtime();
                        }
                    }
                    stateRecord2.setSnapshotId$runtime(INVALID_SNAPSHOT);
                    stateRecord2.assign(stateRecord3);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends StateRecord> T readable(T t, StateObject stateObject) {
        T t2;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        ky readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t3 = (T) readable(t, current.getSnapshotId(), current.getInvalid$runtime());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            firstStateRecord.getClass();
            t2 = (T) readable(firstStateRecord, current2.getSnapshotId(), current2.getInvalid$runtime());
            if (t2 == null) {
                readError();
                throw new tj();
            }
        }
        return t2;
    }

    public static final void releasePinningLocked(int i) {
        pinningTable.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, ky kyVar) {
        long snapshotId = globalSnapshot2.getSnapshotId();
        T t = (T) kyVar.invoke(openSnapshots.clear(snapshotId));
        long j = nextSnapshotId;
        nextSnapshotId = 1 + j;
        openSnapshots = openSnapshots.clear(snapshotId);
        globalSnapshot2.setSnapshotId$runtime(j);
        globalSnapshot2.setInvalid$runtime(openSnapshots);
        globalSnapshot2.setWriteCount$runtime(0);
        globalSnapshot2.setModified$runtime(null);
        globalSnapshot2.releasePinnedSnapshotLocked$runtime();
        openSnapshots = openSnapshots.set(j);
        return t;
    }

    public static final <T> T sync(iy iyVar) {
        T t;
        synchronized (getLock()) {
            t = (T) iyVar.invoke();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(ky kyVar) {
        return (T) advanceGlobalSnapshot(new z4(kyVar, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot takeNewSnapshot$lambda$0(ky kyVar, SnapshotIdSet snapshotIdSet) {
        Snapshot snapshot = (Snapshot) kyVar.invoke(snapshotIdSet);
        synchronized (getLock()) {
            openSnapshots = openSnapshots.set(snapshot.getSnapshotId());
        }
        return snapshot;
    }

    public static final int trackPinning(long j, SnapshotIdSet snapshotIdSet) {
        int add;
        long lowest = snapshotIdSet.lowest(j);
        synchronized (getLock()) {
            add = pinningTable.add(lowest);
        }
        return add;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        long lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime()) {
            if (firstStateRecord.getSnapshotId$runtime() != INVALID_SNAPSHOT) {
                if (valid(firstStateRecord, lowestOrDefault, empty)) {
                    if (stateRecord == null) {
                        stateRecord = firstStateRecord;
                    } else if (q10.i(firstStateRecord.getSnapshotId$runtime(), stateRecord.getSnapshotId$runtime()) >= 0) {
                        return stateRecord;
                    }
                }
            }
            return firstStateRecord;
        }
        return null;
    }

    private static final boolean valid(long j, long j2, SnapshotIdSet snapshotIdSet) {
        return (j2 == INVALID_SNAPSHOT || q10.i(j2, j) > 0 || snapshotIdSet.get(j2)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        long lowestOrDefault;
        if (openSnapshots.get(snapshot.getSnapshotId())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(snapshot.getSnapshotId());
        sb.append(", disposed=");
        sb.append(snapshot.getDisposed$runtime());
        sb.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied$runtime()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (getLock()) {
            lowestOrDefault = pinningTable.lowestOrDefault(-1L);
        }
        sb.append(lowestOrDefault);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final <T extends StateRecord, R> R withCurrent(T t, ky kyVar) {
        return (R) kyVar.invoke(current(t));
    }

    public static final <T extends StateRecord, R> R writable(T t, StateObject stateObject, ky kyVar) {
        Snapshot current;
        R r;
        synchronized (getLock()) {
            current = Snapshot.Companion.getCurrent();
            r = (R) kyVar.invoke(writableRecord(t, stateObject, current));
        }
        notifyWrite(current, stateObject);
        return r;
    }

    public static final <T extends StateRecord> T writableRecord(T t, StateObject stateObject, Snapshot snapshot) {
        T t2;
        if (snapshot.getReadOnly()) {
            snapshot.mo4152recordModified$runtime(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        T t3 = (T) readable(t, snapshotId, snapshot.getInvalid$runtime());
        if (t3 == null) {
            readError();
            o.j();
            return null;
        }
        if (t3.getSnapshotId$runtime() == snapshot.getSnapshotId()) {
            return t3;
        }
        synchronized (getLock()) {
            t2 = (T) readable(stateObject.getFirstStateRecord(), snapshotId, snapshot.getInvalid$runtime());
            if (t2 == null) {
                readError();
                throw new tj();
            }
            if (t2.getSnapshotId$runtime() != snapshotId) {
                t2 = (T) newWritableRecordLocked(t2, stateObject, snapshot);
            }
        }
        t2.getClass();
        if (t3.getSnapshotId$runtime() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo4152recordModified$runtime(stateObject);
        }
        return t2;
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    private static final boolean valid(StateRecord stateRecord, long j, SnapshotIdSet snapshotIdSet) {
        return valid(j, stateRecord.getSnapshotId$runtime(), snapshotIdSet);
    }

    public static final <T extends StateRecord, R> R writable(T t, StateObject stateObject, Snapshot snapshot, ky kyVar) {
        R r;
        synchronized (getLock()) {
            r = (R) kyVar.invoke(writableRecord(t, stateObject, snapshot));
        }
        notifyWrite(snapshot, stateObject);
        return r;
    }

    public static final <T extends StateRecord> T current(T t, Snapshot snapshot) {
        T t2;
        T t3 = (T) readable(t, snapshot.getSnapshotId(), snapshot.getInvalid$runtime());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            t2 = (T) readable(t, snapshot.getSnapshotId(), snapshot.getInvalid$runtime());
        }
        if (t2 != null) {
            return t2;
        }
        readError();
        o.j();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t, long j, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (valid(t, j, snapshotIdSet) && (t2 == null || q10.i(t2.getSnapshotId$runtime(), t.getSnapshotId$runtime()) < 0)) {
                t2 = t;
            }
            t = (T) t.getNext$runtime();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends StateRecord> T readable(T t, StateObject stateObject, Snapshot snapshot) {
        T t2;
        ky readObserver = snapshot.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t3 = (T) readable(t, snapshot.getSnapshotId(), snapshot.getInvalid$runtime());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            Snapshot current = Snapshot.Companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            firstStateRecord.getClass();
            t2 = (T) readable(firstStateRecord, current.getSnapshotId(), current.getInvalid$runtime());
            if (t2 == null) {
                readError();
                throw new tj();
            }
        }
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(emptyLambda);
    }
}
