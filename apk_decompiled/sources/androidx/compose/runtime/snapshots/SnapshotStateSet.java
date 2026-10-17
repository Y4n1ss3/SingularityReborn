package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import defpackage.a0;
import defpackage.d41;
import defpackage.dq;
import defpackage.q10;
import defpackage.t20;
import defpackage.yi;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotStateSet<T> implements Parcelable, StateObject, Set<T>, RandomAccess, t20 {
    public static final int $stable = 0;
    private StateRecord firstStateRecord = SnapshotStateSetKt.stateRecordWith(this, ExtensionsKt.persistentSetOf());
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new Parcelable.ClassLoaderCreator<SnapshotStateSet<Object>>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateSet$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public SnapshotStateSet<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            SnapshotStateSet<Object> snapshotStateSet = new SnapshotStateSet<>();
            if (classLoader == null) {
                classLoader = SnapshotStateSet.class.getClassLoader();
            }
            int readInt = parcel.readInt();
            for (int i = 0; i < readInt; i++) {
                snapshotStateSet.add(parcel.readValue(classLoader));
            }
            return snapshotStateSet;
        }

        @Override // android.os.Parcelable.Creator
        public SnapshotStateSet<Object>[] newArray(int i) {
            return new SnapshotStateSet[i];
        }

        @Override // android.os.Parcelable.Creator
        public SnapshotStateSet<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retainAll$lambda$0(Collection collection, Set set) {
        return set.retainAll(yi.L0(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t) {
        int modification$runtime;
        PersistentSet<T> set$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime = stateSetStateRecord.getModification$runtime();
                set$runtime = stateSetStateRecord.getSet$runtime();
            }
            set$runtime.getClass();
            PersistentSet<T> add = set$runtime.add((PersistentSet<T>) t);
            if (q10.b(add, set$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateSetKt.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime, add);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        int modification$runtime;
        PersistentSet<T> set$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime = stateSetStateRecord.getModification$runtime();
                set$runtime = stateSetStateRecord.getSet$runtime();
            }
            set$runtime.getClass();
            PersistentSet<T> addAll = set$runtime.addAll(collection);
            if (q10.b(addAll, set$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateSetKt.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime, addAll);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord, this, current);
            synchronized (SnapshotStateSetKt.sync) {
                stateSetStateRecord2.setSet$runtime(ExtensionsKt.persistentSetOf());
                stateSetStateRecord2.setModification$runtime(stateSetStateRecord2.getModification$runtime() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return SnapshotStateSetKt.getReadable(this).getSet$runtime().contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return SnapshotStateSetKt.getReadable(this).getSet$runtime().containsAll(collection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Set<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getSet$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public int getSize() {
        return SnapshotStateSetKt.getReadable(this).getSet$runtime().size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return SnapshotStateSetKt.getReadable(this).getSet$runtime().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new StateSetIterator(this, SnapshotStateSetKt.getReadable(this).getSet$runtime().iterator());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.setNext$runtime(getFirstStateRecord());
        this.firstStateRecord = (StateSetStateRecord) stateRecord;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int modification$runtime;
        PersistentSet<T> set$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime = stateSetStateRecord.getModification$runtime();
                set$runtime = stateSetStateRecord.getSet$runtime();
            }
            set$runtime.getClass();
            PersistentSet<T> remove = set$runtime.remove((PersistentSet<T>) obj);
            if (q10.b(remove, set$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateSetKt.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime, remove);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        int modification$runtime;
        PersistentSet<T> set$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime = stateSetStateRecord.getModification$runtime();
                set$runtime = stateSetStateRecord.getSet$runtime();
            }
            set$runtime.getClass();
            PersistentSet<T> removeAll = set$runtime.removeAll((Collection<? extends T>) collection);
            if (q10.b(removeAll, set$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateSetKt.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime, removeAll);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return SnapshotStateSetKt.mutateBoolean(this, new a0(4, collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return d41.J(this);
    }

    public final Set<T> toSet() {
        return SnapshotStateSetKt.getReadable(this).getSet$runtime();
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return "SnapshotStateSet(value=" + ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getSet$runtime() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Set<T> set = toSet();
        parcel.writeInt(size());
        Iterator<T> it = set.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d41.K(this, tArr);
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }
}
