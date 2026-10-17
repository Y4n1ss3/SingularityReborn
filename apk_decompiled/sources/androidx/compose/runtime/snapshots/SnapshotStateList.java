package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import defpackage.a0;
import defpackage.d41;
import defpackage.dq;
import defpackage.l00;
import defpackage.o20;
import defpackage.q10;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements Parcelable, StateObject, List<T>, RandomAccess, o20 {
    public static final int $stable = 0;
    private StateRecord firstStateRecord;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new SnapshotStateList$Companion$CREATOR$1();

    public SnapshotStateList(PersistentList<? extends T> persistentList) {
        this.firstStateRecord = SnapshotStateListKt.stateRecordWith(this, persistentList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addAll$lambda$0(int i, Collection collection, List list) {
        return list.addAll(i, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retainAll$lambda$0(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList<T> add = list$runtime.add((PersistentList<T>) t);
            if (q10.b(add, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime, add, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList<T> addAll = list$runtime.addAll(collection);
            if (q10.b(addAll, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime, addAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            synchronized (SnapshotStateListKt.sync) {
                stateListStateRecord2.setList$runtime(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime(stateListStateRecord2.getModification$runtime() + 1);
                stateListStateRecord2.setStructuralChange$runtime(stateListStateRecord2.getStructuralChange$runtime() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return SnapshotStateListKt.getReadable(this).getList$runtime().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return SnapshotStateListKt.getReadable(this).getList$runtime().containsAll(collection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public T get(int i) {
        return SnapshotStateListKt.getReadable(this).getList$runtime().get(i);
    }

    public final List<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public int getSize() {
        return SnapshotStateListKt.getReadable(this).getList$runtime().size();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return SnapshotStateListKt.getReadable(this).getList$runtime().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return SnapshotStateListKt.getReadable(this).getList$runtime().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return SnapshotStateListKt.getReadable(this).getList$runtime().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.setNext$runtime(getFirstStateRecord());
        this.firstStateRecord = (StateListStateRecord) stateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList<T> remove = list$runtime.remove((PersistentList<T>) obj);
            if (q10.b(remove, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime, remove, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList<T> removeAll = list$runtime.removeAll((Collection<? extends T>) collection);
            if (q10.b(removeAll, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime, removeAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return true;
    }

    public T removeAt(int i) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        T t = get(i);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList<T> removeAt = list$runtime.removeAt(i);
            if (q10.b(removeAt, list$runtime)) {
                return t;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime, removeAt, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return t;
    }

    public final void removeRange(int i, int i2) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList.Builder<T> builder = list$runtime.builder();
            builder.subList(i, i2).clear();
            PersistentList<T> build = builder.build();
            if (q10.b(build, list$runtime)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime, build, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return SnapshotStateListKt.mutateBoolean(this, new a0(3, collection));
    }

    public final int retainAllInRange$runtime(Collection<? extends T> collection, int i, int i2) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        int size = size();
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList.Builder<T> builder = list$runtime.builder();
            builder.subList(i, i2).retainAll(collection);
            PersistentList<T> build = builder.build();
            if (q10.b(build, list$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime, build, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return size - size();
    }

    @Override // java.util.List
    public T set(int i, T t) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        T t2 = get(i);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList<T> persistentList = list$runtime.set(i, (int) t);
            if (q10.b(persistentList, list$runtime)) {
                return t2;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime, persistentList, false);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return d41.J(this);
    }

    public final List<T> toList() {
        return SnapshotStateListKt.getReadable(this).getList$runtime();
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List<T> list = toList();
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(list.get(i2));
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

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d41.K(this, tArr);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        return new StateListIterator(this, i);
    }

    public SnapshotStateList() {
        this(ExtensionsKt.persistentListOf());
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // java.util.List
    public void add(int i, T t) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList<T> add = list$runtime.add(i, (int) t);
            if (q10.b(add, list$runtime)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = SnapshotStateListKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime, add, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        return SnapshotStateListKt.mutateBoolean(this, new l00(i, collection));
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }
}
