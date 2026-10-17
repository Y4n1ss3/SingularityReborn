package androidx.compose.runtime;

import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.System_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import defpackage.ad0;
import defpackage.dq;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.ta0;
import defpackage.w01;
import defpackage.zc0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {
    private final iy calculation;
    private ResultRecord<T> first = new ResultRecord<>(SnapshotKt.currentSnapshot().getSnapshotId());
    private final SnapshotMutationPolicy<T> policy;

    public DerivedSnapshotState(iy iyVar, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.calculation = iyVar;
        this.policy = snapshotMutationPolicy;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> resultRecord, Snapshot snapshot, boolean z, iy iyVar) {
        int i;
        Snapshot.Companion companion;
        SnapshotMutationPolicy<T> policy;
        int i2;
        ResultRecord<T> resultRecord2 = resultRecord;
        int i3 = 0;
        if (!resultRecord2.isValid(this, snapshot)) {
            final ta0 ta0Var = new ta0();
            final IntRef intRef = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
            if (intRef == null) {
                i = 0;
                intRef = new IntRef(0);
                SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef);
            } else {
                i = 0;
            }
            final int element = intRef.getElement();
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr = derivedStateObservers.content;
            int size = derivedStateObservers.getSize();
            for (int i4 = i; i4 < size; i4++) {
                derivedStateObserverArr[i4].start(this);
            }
            try {
                intRef.setElement(element + 1);
                Object observe = Snapshot.Companion.observe(new ky() { // from class: androidx.compose.runtime.c
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 currentRecord$lambda$1$0$0;
                        currentRecord$lambda$1$0$0 = DerivedSnapshotState.currentRecord$lambda$1$0$0(DerivedSnapshotState.this, intRef, ta0Var, element, obj);
                        return currentRecord$lambda$1$0$0;
                    }
                }, null, iyVar);
                intRef.setElement(element);
                DerivedStateObserver[] derivedStateObserverArr2 = derivedStateObservers.content;
                int size2 = derivedStateObservers.getSize();
                while (i < size2) {
                    derivedStateObserverArr2[i].done(this);
                    i++;
                }
                synchronized (SnapshotKt.getLock()) {
                    try {
                        companion = Snapshot.Companion;
                        Snapshot current = companion.getCurrent();
                        if (resultRecord2.getResult() == ResultRecord.Companion.getUnset() || (policy = getPolicy()) == 0 || !policy.equivalent(observe, resultRecord2.getResult())) {
                            resultRecord2 = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                            resultRecord2.setDependencies(ta0Var);
                            resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                            resultRecord2.setResult(observe);
                        } else {
                            resultRecord2.setDependencies(ta0Var);
                            resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                IntRef intRef2 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                if (intRef2 == null || intRef2.getElement() != 0) {
                    return resultRecord2;
                }
                companion.notifyObjectsInitialized();
                synchronized (SnapshotKt.getLock()) {
                    Snapshot current2 = companion.getCurrent();
                    resultRecord2.setValidSnapshotId(current2.getSnapshotId());
                    resultRecord2.setValidSnapshotWriteCount(current2.getWriteCount$runtime());
                }
                return resultRecord2;
            } catch (Throwable th2) {
                DerivedStateObserver[] derivedStateObserverArr3 = derivedStateObservers.content;
                int size3 = derivedStateObservers.getSize();
                while (i < size3) {
                    derivedStateObserverArr3[i].done(this);
                    i++;
                }
                throw th2;
            }
        }
        if (z) {
            MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr4 = derivedStateObservers2.content;
            int size4 = derivedStateObservers2.getSize();
            for (int i5 = 0; i5 < size4; i5++) {
                derivedStateObserverArr4[i5].start(this);
            }
            try {
                zc0 dependencies = resultRecord2.getDependencies();
                IntRef intRef3 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr = dependencies.b;
                int[] iArr = dependencies.c;
                long[] jArr = dependencies.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            while (i3 < i8) {
                                if ((j & 255) < 128) {
                                    int i9 = (i6 << 3) + i3;
                                    i2 = i7;
                                    StateObject stateObject = (StateObject) objArr[i9];
                                    intRef3.setElement(element2 + iArr[i9]);
                                    ky readObserver = snapshot.getReadObserver();
                                    if (readObserver != null) {
                                        readObserver.invoke(stateObject);
                                    }
                                } else {
                                    i2 = i7;
                                }
                                j >>= i2;
                                i3++;
                                i7 = i2;
                            }
                            if (i8 != i7) {
                                break;
                            }
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        i3 = 0;
                    }
                }
                intRef3.setElement(element2);
                DerivedStateObserver[] derivedStateObserverArr5 = derivedStateObservers2.content;
                int size5 = derivedStateObservers2.getSize();
                for (int i10 = 0; i10 < size5; i10++) {
                    derivedStateObserverArr5[i10].done(this);
                }
            } catch (Throwable th3) {
                DerivedStateObserver[] derivedStateObserverArr6 = derivedStateObservers2.content;
                int size6 = derivedStateObservers2.getSize();
                for (int i11 = 0; i11 < size6; i11++) {
                    derivedStateObserverArr6[i11].done(this);
                }
                throw th3;
            }
        }
        return resultRecord2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 currentRecord$lambda$1$0$0(DerivedSnapshotState derivedSnapshotState, IntRef intRef, ta0 ta0Var, int i, Object obj) {
        if (obj == derivedSnapshotState) {
            o.f("A derived state calculation cannot read itself");
            return null;
        }
        if (obj instanceof StateObject) {
            int element = intRef.getElement() - i;
            int a = ta0Var.a(obj);
            ta0Var.h(Math.min(element, a >= 0 ? ta0Var.c[a] : Integer.MAX_VALUE), obj);
        }
        return w01.a;
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        return resultRecord.isValid(this, Snapshot.Companion.getCurrent()) ? String.valueOf(resultRecord.getResult()) : "<Not calculated>";
    }

    public final ResultRecord<?> current(Snapshot snapshot) {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    @Override // androidx.compose.runtime.DerivedState
    public DerivedState.Record<T> getCurrentRecord() {
        Snapshot current = Snapshot.Companion.getCurrent();
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, false, this.calculation);
    }

    public final T getDebuggerDisplayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return (T) resultRecord.getResult();
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.DerivedState
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Snapshot.Companion companion = Snapshot.Companion;
        ky readObserver = companion.getCurrent().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        Snapshot current = companion.getCurrent();
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.first = (ResultRecord) stateRecord;
    }

    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {
        private zc0 dependencies;
        private Object result;
        private int resultHash;
        private long validSnapshotId;
        private int validSnapshotWriteCount;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Object Unset = new Object();

        public ResultRecord(long j) {
            super(j);
            ta0 ta0Var = ad0.a;
            ta0Var.getClass();
            this.dependencies = ta0Var;
            this.result = Unset;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            stateRecord.getClass();
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.result;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public zc0 getDependencies() {
            return this.dependencies;
        }

        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final long getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final boolean isValid(DerivedState<?> derivedState, Snapshot snapshot) {
            boolean z;
            boolean z2;
            synchronized (SnapshotKt.getLock()) {
                z = true;
                if (this.validSnapshotId == snapshot.getSnapshotId()) {
                    if (this.validSnapshotWriteCount == snapshot.getWriteCount$runtime()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.result == Unset || (z2 && this.resultHash != readableHash(derivedState, snapshot))) {
                z = false;
            }
            if (!z || !z2) {
                return z;
            }
            synchronized (SnapshotKt.getLock()) {
                this.validSnapshotId = snapshot.getSnapshotId();
                this.validSnapshotWriteCount = snapshot.getWriteCount$runtime();
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.runtime.DerivedSnapshotState$ResultRecord] */
        /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.runtime.snapshots.StateRecord] */
        /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.runtime.snapshots.StateRecord, java.lang.Object] */
        public final int readableHash(DerivedState<?> derivedState, Snapshot snapshot) {
            zc0 dependencies;
            int i;
            long[] jArr;
            int i2;
            Object[] objArr;
            int[] iArr;
            long[] jArr2;
            int i3;
            Object[] objArr2;
            int[] iArr2;
            long j;
            long j2;
            int i4;
            ?? current;
            synchronized (SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            int i5 = 7;
            if (dependencies.e == 0) {
                return 7;
            }
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr = derivedStateObservers.content;
            int size = derivedStateObservers.getSize();
            for (int i6 = 0; i6 < size; i6++) {
                derivedStateObserverArr[i6].start(derivedState);
            }
            try {
                Object[] objArr3 = dependencies.b;
                int[] iArr3 = dependencies.c;
                long[] jArr3 = dependencies.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    i = 7;
                    int i7 = 0;
                    while (true) {
                        long j3 = jArr3[i7];
                        long j4 = -9187201950435737472L;
                        if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            i2 = i5;
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j3 & 255) < 128) {
                                    int i11 = (i7 << 3) + i10;
                                    j2 = j4;
                                    StateObject stateObject = (StateObject) objArr3[i11];
                                    int i12 = i8;
                                    if (iArr3[i11] != 1) {
                                        jArr2 = jArr3;
                                        i3 = i10;
                                        objArr2 = objArr3;
                                        iArr2 = iArr3;
                                        j = j3;
                                    } else {
                                        if (stateObject instanceof DerivedSnapshotState) {
                                            current = ((DerivedSnapshotState) stateObject).current(snapshot);
                                            zc0 dependencies2 = current.getDependencies();
                                            Object[] objArr4 = dependencies2.b;
                                            long[] jArr4 = dependencies2.a;
                                            jArr2 = jArr3;
                                            int length2 = jArr4.length - 2;
                                            i3 = i10;
                                            objArr2 = objArr3;
                                            iArr2 = iArr3;
                                            if (length2 >= 0) {
                                                int i13 = 0;
                                                while (true) {
                                                    long j5 = jArr4[i13];
                                                    j = j3;
                                                    int i14 = i;
                                                    if ((((~j5) << i2) & j5 & j2) != j2) {
                                                        int i15 = 8 - ((~(i13 - length2)) >>> 31);
                                                        for (int i16 = 0; i16 < i15; i16++) {
                                                            if ((j5 & 255) < 128) {
                                                                i14 = (i14 * 31) + System_jvmKt.identityHashCode((StateObject) objArr4[(i13 << 3) + i16]);
                                                            }
                                                            j5 >>= i12;
                                                        }
                                                        if (i15 != i12) {
                                                            i = i14;
                                                            break;
                                                        }
                                                    }
                                                    i = i14;
                                                    if (i13 == length2) {
                                                        break;
                                                    }
                                                    i13++;
                                                    j3 = j;
                                                    i12 = 8;
                                                }
                                            } else {
                                                j = j3;
                                            }
                                        } else {
                                            jArr2 = jArr3;
                                            i3 = i10;
                                            objArr2 = objArr3;
                                            iArr2 = iArr3;
                                            j = j3;
                                            current = SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                                        }
                                        i = (((i * 31) + System_jvmKt.identityHashCode(current)) * 31) + Long.hashCode(current.getSnapshotId$runtime());
                                    }
                                    i4 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i3 = i10;
                                    objArr2 = objArr3;
                                    iArr2 = iArr3;
                                    j = j3;
                                    j2 = j4;
                                    i4 = i8;
                                }
                                j3 = j >> i4;
                                i10 = i3 + 1;
                                i8 = i4;
                                jArr3 = jArr2;
                                j4 = j2;
                                objArr3 = objArr2;
                                iArr3 = iArr2;
                            }
                            jArr = jArr3;
                            objArr = objArr3;
                            iArr = iArr3;
                            if (i9 != i8) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                            i2 = i5;
                            objArr = objArr3;
                            iArr = iArr3;
                        }
                        if (i7 == length) {
                            i5 = i;
                            break;
                        }
                        i7++;
                        i5 = i2;
                        jArr3 = jArr;
                        objArr3 = objArr;
                        iArr3 = iArr;
                    }
                }
                i = i5;
                DerivedStateObserver[] derivedStateObserverArr2 = derivedStateObservers.content;
                int size2 = derivedStateObservers.getSize();
                for (int i17 = 0; i17 < size2; i17++) {
                    derivedStateObserverArr2[i17].done(derivedState);
                }
                return i;
            } catch (Throwable th) {
                DerivedStateObserver[] derivedStateObserverArr3 = derivedStateObservers.content;
                int size3 = derivedStateObservers.getSize();
                for (int i18 = 0; i18 < size3; i18++) {
                    derivedStateObserverArr3[i18].done(derivedState);
                }
                throw th;
            }
        }

        public void setDependencies(zc0 zc0Var) {
            this.dependencies = zc0Var;
        }

        public final void setResult(Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i) {
            this.resultHash = i;
        }

        public final void setValidSnapshotId(long j) {
            this.validSnapshotId = j;
        }

        public final void setValidSnapshotWriteCount(int i) {
            this.validSnapshotWriteCount = i;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            public final Object getUnset() {
                return ResultRecord.Unset;
            }

            private Companion() {
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j) {
            return new ResultRecord(j);
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }
}
