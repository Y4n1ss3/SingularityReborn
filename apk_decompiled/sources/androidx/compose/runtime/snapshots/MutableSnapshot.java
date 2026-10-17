package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import androidx.compose.runtime.tooling.ComposeToolingFlags;
import defpackage.dq;
import defpackage.gb0;
import defpackage.iy;
import defpackage.ky;
import defpackage.lu0;
import defpackage.my;
import defpackage.o;
import defpackage.q10;
import defpackage.sl0;
import defpackage.ut;
import defpackage.xe0;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;
    private List<? extends StateObject> merged;
    private gb0 modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final ky readObserver;
    private int snapshots;
    private int writeCount;
    private final ky writeObserver;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyIntArray = new int[0];

    public MutableSnapshot(long j, SnapshotIdSet snapshotIdSet, ky kyVar, ky kyVar2) {
        super(j, snapshotIdSet, (dq) null);
        this.readObserver = kyVar;
        this.writeObserver = kyVar2;
        this.previousIds = SnapshotIdSet.Companion.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    private final void abandon() {
        long j;
        gb0 modified$runtime = getModified$runtime();
        if (modified$runtime != null) {
            validateNotApplied();
            setModified$runtime(null);
            long snapshotId = getSnapshotId();
            Object[] objArr = modified$runtime.b;
            long[] jArr = modified$runtime.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j2 = jArr[i];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j2) < 128) {
                                for (StateRecord firstStateRecord = ((StateObject) objArr[(i << 3) + i3]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime()) {
                                    if (firstStateRecord.getSnapshotId$runtime() == snapshotId || yi.m0(this.previousIds, Long.valueOf(firstStateRecord.getSnapshotId$runtime()))) {
                                        j = SnapshotKt.INVALID_SNAPSHOT;
                                        firstStateRecord.setSnapshotId$runtime(j);
                                    }
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        closeAndReleasePinning$runtime();
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i = 0; i < length; i++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i]);
        }
    }

    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, ky kyVar, ky kyVar2, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
            return null;
        }
        if ((i & 1) != 0) {
            kyVar = null;
        }
        if ((i & 2) != 0) {
            kyVar2 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(kyVar, kyVar2);
    }

    private final void validateNotApplied() {
        if (this.applied) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void validateNotAppliedOrPinned() {
        if (!this.applied || ((Snapshot) this).pinningTrackingHandle >= 0) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
    }

    public final <T> T advance$runtime(iy iyVar) {
        long j;
        long j2;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime(getSnapshotId());
        T t = (T) iyVar.invoke();
        if (getApplied$runtime() || getDisposed$runtime()) {
            return t;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            j = SnapshotKt.nextSnapshotId;
            j2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j2 + 1;
            setSnapshotId$runtime(j);
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(getSnapshotId());
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, getSnapshotId()));
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d1 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:65:0x013d, B:67:0x014d, B:70:0x0159, B:72:0x0165, B:74:0x016f, B:76:0x0175, B:78:0x0183, B:84:0x0194, B:87:0x019e, B:89:0x01a8, B:91:0x01b2, B:93:0x01b8, B:95:0x01c2, B:101:0x01ca, B:103:0x01cd, B:105:0x01d1, B:107:0x01d8, B:109:0x01e4, B:115:0x018b), top: B:64:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0194 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:65:0x013d, B:67:0x014d, B:70:0x0159, B:72:0x0165, B:74:0x016f, B:76:0x0175, B:78:0x0183, B:84:0x0194, B:87:0x019e, B:89:0x01a8, B:91:0x01b2, B:93:0x01b8, B:95:0x01c2, B:101:0x01ca, B:103:0x01cd, B:105:0x01d1, B:107:0x01d8, B:109:0x01e4, B:115:0x018b), top: B:64:0x013d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SnapshotApplyResult apply() {
        Map<StateRecord, ? extends StateRecord> map;
        GlobalSnapshot globalSnapshot;
        ky kyVar;
        List list;
        gb0 gb0Var;
        List list2;
        long j;
        long j2;
        List<? extends StateObject> list3;
        Object beginSection;
        GlobalSnapshot globalSnapshot2;
        long j3;
        SnapshotIdSet snapshotIdSet;
        ky kyVar2;
        GlobalSnapshot globalSnapshot3;
        SnapshotIdSet snapshotIdSet2;
        Map<StateRecord, ? extends StateRecord> optimisticMerges;
        gb0 modified$runtime = getModified$runtime();
        if (modified$runtime != null) {
            globalSnapshot3 = SnapshotKt.globalSnapshot;
            long snapshotId = globalSnapshot3.getSnapshotId();
            snapshotIdSet2 = SnapshotKt.openSnapshots;
            optimisticMerges = SnapshotKt.optimisticMerges(snapshotId, this, snapshotIdSet2.clear(globalSnapshot3.getSnapshotId()));
            map = optimisticMerges;
        } else {
            map = null;
        }
        ut utVar = ut.d;
        synchronized (SnapshotKt.getLock()) {
            try {
                SnapshotKt.validateOpen(this);
                if (modified$runtime != null && modified$runtime.d != 0) {
                    globalSnapshot2 = SnapshotKt.globalSnapshot;
                    j3 = SnapshotKt.nextSnapshotId;
                    snapshotIdSet = SnapshotKt.openSnapshots;
                    SnapshotApplyResult innerApplyLocked$runtime = innerApplyLocked$runtime(j3, modified$runtime, map, snapshotIdSet.clear(globalSnapshot2.getSnapshotId()));
                    if (!q10.b(innerApplyLocked$runtime, SnapshotApplyResult.Success.INSTANCE)) {
                        return innerApplyLocked$runtime;
                    }
                    closeLocked$runtime();
                    gb0Var = globalSnapshot2.getModified$runtime();
                    kyVar2 = SnapshotKt.emptyLambda;
                    SnapshotKt.resetGlobalSnapshotLocked(globalSnapshot2, kyVar2);
                    setModified$runtime(null);
                    globalSnapshot2.setModified$runtime(null);
                    list = SnapshotKt.applyObservers;
                    this.applied = true;
                    if (gb0Var != null) {
                        Set wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(gb0Var);
                        if (!wrapIntoSet.isEmpty()) {
                            if (ComposeToolingFlags.isVerboseTracingEnabled) {
                                beginSection = Trace.INSTANCE.beginSection("Compose:applyObservers");
                                try {
                                    int size = list.size();
                                    for (int i = 0; i < size; i++) {
                                        ((my) list.get(i)).invoke(wrapIntoSet, this);
                                    }
                                } finally {
                                }
                            } else {
                                int size2 = list.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    ((my) list.get(i2)).invoke(wrapIntoSet, this);
                                }
                            }
                        }
                    }
                    if (modified$runtime != null && modified$runtime.c()) {
                        Set wrapIntoSet2 = ScatterSetWrapperKt.wrapIntoSet(modified$runtime);
                        if (ComposeToolingFlags.isVerboseTracingEnabled) {
                            int size3 = list.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                ((my) list.get(i3)).invoke(wrapIntoSet2, this);
                            }
                        } else {
                            beginSection = Trace.INSTANCE.beginSection("Compose:applyObservers");
                            try {
                                int size4 = list.size();
                                for (int i4 = 0; i4 < size4; i4++) {
                                    ((my) list.get(i4)).invoke(wrapIntoSet2, this);
                                }
                            } finally {
                            }
                        }
                    }
                    SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime);
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            releasePinnedSnapshotsForCloseLocked$runtime();
                            SnapshotKt.checkAndOverwriteUnusedRecordsLocked();
                            if (gb0Var != null) {
                                Object[] objArr = gb0Var.b;
                                long[] jArr = gb0Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i5];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                                            for (int i7 = 0; i7 < i6; i7++) {
                                                if ((j4 & 255) < 128) {
                                                    SnapshotKt.processForUnusedRecordsLocked((StateObject) objArr[(i5 << 3) + i7]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i6 != 8) {
                                                break;
                                            }
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                    }
                                    if (modified$runtime != null) {
                                        Object[] objArr2 = modified$runtime.b;
                                        long[] jArr2 = modified$runtime.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i8 = 0;
                                            while (true) {
                                                long j5 = jArr2[i8];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                    for (int i10 = 0; i10 < i9; i10++) {
                                                        if ((j5 & j2) < j) {
                                                            SnapshotKt.processForUnusedRecordsLocked((StateObject) objArr2[(i8 << 3) + i10]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i9 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i8 == length2) {
                                                    break;
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    list3 = this.merged;
                                    if (list3 != null) {
                                        int size5 = list3.size();
                                        for (int i11 = 0; i11 < size5; i11++) {
                                            SnapshotKt.processForUnusedRecordsLocked(list3.get(i11));
                                        }
                                    }
                                    this.merged = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (modified$runtime != null) {
                            }
                            list3 = this.merged;
                            if (list3 != null) {
                            }
                            this.merged = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return SnapshotApplyResult.Success.INSTANCE;
                }
                closeLocked$runtime();
                globalSnapshot = SnapshotKt.globalSnapshot;
                gb0 modified$runtime2 = globalSnapshot.getModified$runtime();
                kyVar = SnapshotKt.emptyLambda;
                SnapshotKt.resetGlobalSnapshotLocked(globalSnapshot, kyVar);
                if (modified$runtime2 == null || !modified$runtime2.c()) {
                    list = utVar;
                    gb0Var = null;
                } else {
                    list2 = SnapshotKt.applyObservers;
                    list = list2;
                    gb0Var = modified$runtime2;
                }
                this.applied = true;
                if (gb0Var != null) {
                }
                if (modified$runtime != null) {
                    Set wrapIntoSet22 = ScatterSetWrapperKt.wrapIntoSet(modified$runtime);
                    if (ComposeToolingFlags.isVerboseTracingEnabled) {
                    }
                }
                SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime);
                synchronized (SnapshotKt.getLock()) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getSnapshotId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime()) {
            return;
        }
        super.dispose();
        mo4151nestedDeactivated$runtime(this);
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    public final boolean getApplied$runtime() {
        return this.applied;
    }

    public final List<StateObject> getMerged$runtime() {
        return this.merged;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public gb0 getModified$runtime() {
        return this.modified;
    }

    public final SnapshotIdSet getPreviousIds$runtime() {
        return this.previousIds;
    }

    public final int[] getPreviousPinnedSnapshots$runtime() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime */
    public ky getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public ky getWriteObserver$runtime() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        gb0 modified$runtime = getModified$runtime();
        return modified$runtime != null && modified$runtime.c();
    }

    public final SnapshotApplyResult innerApplyLocked$runtime(long j, gb0 gb0Var, Map<StateRecord, ? extends StateRecord> map, SnapshotIdSet snapshotIdSet) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        StateRecord readable;
        ArrayList arrayList4;
        StateRecord readable2;
        StateRecord readable3;
        StateRecord mergeRecords;
        SnapshotIdSet or = getInvalid$runtime().set(getSnapshotId()).or(this.previousIds);
        Object[] objArr3 = gb0Var.b;
        long[] jArr3 = gb0Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            StateObject stateObject = (StateObject) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            readable = SnapshotKt.readable(firstStateRecord, j, snapshotIdSet);
                            if (readable == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                readable2 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), or);
                                if (readable2 != null && readable2.getSnapshotId$runtime() != SnapshotId_jvmKt.toSnapshotId(1) && !readable.equals(readable2)) {
                                    snapshotIdSet3 = or;
                                    readable3 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), getInvalid$runtime());
                                    if (readable3 == null) {
                                        SnapshotKt.readError();
                                        o.j();
                                        return null;
                                    }
                                    if (map == null || (mergeRecords = map.get(readable)) == null) {
                                        mergeRecords = stateObject.mergeRecords(readable2, readable, readable3);
                                    }
                                    if (mergeRecords == null) {
                                        return new SnapshotApplyResult.Failure(this);
                                    }
                                    if (!mergeRecords.equals(readable3)) {
                                        if (mergeRecords.equals(readable)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new xe0(stateObject, readable.create(getSnapshotId())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(stateObject);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!mergeRecords.equals(readable2) ? new xe0(stateObject, mergeRecords) : new xe0(stateObject, readable2.create(getSnapshotId())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            snapshotIdSet3 = or;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            snapshotIdSet3 = or;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        or = snapshotIdSet3;
                    }
                    snapshotIdSet2 = or;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    snapshotIdSet2 = or;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                or = snapshotIdSet2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            advance$runtime();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                xe0 xe0Var = (xe0) arrayList3.get(i5);
                StateObject stateObject2 = (StateObject) xe0Var.d;
                StateRecord stateRecord = (StateRecord) xe0Var.e;
                stateRecord.setSnapshotId$runtime(j);
                synchronized (SnapshotKt.getLock()) {
                    stateRecord.setNext$runtime(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                gb0Var.m((StateObject) arrayList2.get(i6));
            }
            List<? extends StateObject> list = this.merged;
            if (list != null) {
                arrayList2 = yi.A0(list, arrayList2);
            }
            this.merged = arrayList2;
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime */
    public void mo4150nestedActivated$runtime(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime */
    public void mo4151nestedDeactivated$runtime(Snapshot snapshot) {
        if (!(this.snapshots > 0)) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        if (this.applied || getDisposed$runtime()) {
            return;
        }
        advance$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime */
    public void mo4152recordModified$runtime(StateObject stateObject) {
        gb0 modified$runtime = getModified$runtime();
        if (modified$runtime == null) {
            gb0 gb0Var = sl0.a;
            modified$runtime = new gb0();
            setModified$runtime(modified$runtime);
        }
        modified$runtime.d(stateObject);
    }

    public final void recordPrevious$runtime(long j) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(j);
        }
    }

    public final void recordPreviousList$runtime(SnapshotIdSet snapshotIdSet) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshotIdSet);
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime(int i) {
        if (i >= 0) {
            int[] iArr = this.previousPinnedSnapshots;
            iArr.getClass();
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length + 1);
            copyOf[length] = i;
            this.previousPinnedSnapshots = copyOf;
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.previousPinnedSnapshots;
        if (iArr2.length != 0) {
            int length = iArr2.length;
            int length2 = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr2, length + length2);
            System.arraycopy(iArr, 0, copyOf, length, length2);
            iArr = copyOf;
        }
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime();
    }

    public final void setApplied$runtime(boolean z) {
        this.applied = z;
    }

    public final void setMerged$runtime(List<? extends StateObject> list) {
        this.merged = list;
    }

    public void setModified$runtime(gb0 gb0Var) {
        this.modified = gb0Var;
    }

    public final void setPreviousIds$runtime(SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime(int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime(int i) {
        this.writeCount = i;
    }

    public MutableSnapshot takeNestedMutableSnapshot(ky kyVar, ky kyVar2) {
        Map map;
        long j;
        long j2;
        SnapshotIdSet snapshotIdSet;
        NestedMutableSnapshot nestedMutableSnapshot;
        long j3;
        long j4;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime();
        validateNotAppliedOrPinned();
        PersistentList persistentList = SnapshotObserverKt.observers;
        ky kyVar3 = kyVar;
        ky kyVar4 = kyVar2;
        if (persistentList != null) {
            xe0 mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, false, kyVar3, kyVar4);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) mergeObservers.d;
            ky readObserver = snapshotInstanceObservers.getReadObserver();
            kyVar4 = snapshotInstanceObservers.getWriteObserver();
            map = (Map) mergeObservers.e;
            kyVar3 = readObserver;
        } else {
            map = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            j = SnapshotKt.nextSnapshotId;
            j2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j2 + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(j);
            SnapshotIdSet invalid$runtime = getInvalid$runtime();
            setInvalid$runtime(invalid$runtime.set(j));
            nestedMutableSnapshot = new NestedMutableSnapshot(j, SnapshotKt.addRange(invalid$runtime, getSnapshotId() + 1, j), SnapshotKt.mergedReadObserver$default(kyVar3, getReadObserver(), false, 4, null), SnapshotKt.mergedWriteObserver(kyVar4, getWriteObserver$runtime()), this);
        }
        if (!getApplied$runtime() && !getDisposed$runtime()) {
            long snapshotId = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                j3 = SnapshotKt.nextSnapshotId;
                j4 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = j4 + 1;
                setSnapshotId$runtime(j3);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getSnapshotId());
            }
            setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedMutableSnapshot, map);
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(ky kyVar) {
        ky kyVar2;
        Map map;
        long j;
        long j2;
        SnapshotIdSet snapshotIdSet;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        long j3;
        long j4;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime();
        validateNotAppliedOrPinned();
        long snapshotId = getSnapshotId();
        MutableSnapshot mutableSnapshot = this instanceof GlobalSnapshot ? null : this;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            xe0 mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, mutableSnapshot, true, kyVar, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) mergeObservers.d;
            ky readObserver = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            kyVar2 = readObserver;
            map = (Map) mergeObservers.e;
        } else {
            kyVar2 = kyVar;
            map = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            j = SnapshotKt.nextSnapshotId;
            j2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j2 + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(j);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(j, SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, j), SnapshotKt.mergedReadObserver$default(kyVar2, getReadObserver(), false, 4, null), this);
        }
        if (!getApplied$runtime() && !getDisposed$runtime()) {
            long snapshotId2 = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                j3 = SnapshotKt.nextSnapshotId;
                j4 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = j4 + 1;
                setSnapshotId$runtime(j3);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getSnapshotId());
            }
            setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId2 + 1, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, mutableSnapshot, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    public final void advance$runtime() {
        long j;
        long j2;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime(getSnapshotId());
        if (getApplied$runtime() || getDisposed$runtime()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            j = SnapshotKt.nextSnapshotId;
            j2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j2 + 1;
            setSnapshotId$runtime(j);
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(getSnapshotId());
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, getSnapshotId()));
    }
}
