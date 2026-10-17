package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import defpackage.gy;
import defpackage.q10;
import defpackage.yi;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SnapshotMapValueSet<K, V> extends SnapshotMapSet<K, V, V> {
    public SnapshotMapValueSet(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((SnapshotMapValueSet<K, V>) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return getMap().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!getMap().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public StateMapMutableValuesIterator<K, V> iterator() {
        return new StateMapMutableValuesIterator<>(getMap(), ((ImmutableSet) getMap().getReadable$runtime().getMap$runtime().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return getMap().removeValue$runtime(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification$runtime;
        Snapshot current;
        boolean attemptUpdate;
        Set L0 = yi.L0(collection);
        SnapshotStateMap<K, V> map = getMap();
        boolean z = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = map.getFirstStateRecord();
                firstStateRecord.getClass();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification$runtime = stateMapStateRecord.getModification$runtime();
            }
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder2 = map$runtime.builder2();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (L0.contains(entry.getValue())) {
                    builder2.remove(entry.getKey());
                    z = true;
                }
            }
            PersistentMap<K, V> build2 = builder2.build2();
            if (q10.b(build2, map$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = map.getFirstStateRecord();
            firstStateRecord2.getClass();
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = map.attemptUpdate((SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current), modification$runtime, build2);
            }
            SnapshotKt.notifyWrite(current, map);
        } while (!attemptUpdate);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification$runtime;
        Snapshot current;
        boolean attemptUpdate;
        Set L0 = yi.L0(collection);
        SnapshotStateMap<K, V> map = getMap();
        boolean z = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = map.getFirstStateRecord();
                firstStateRecord.getClass();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification$runtime = stateMapStateRecord.getModification$runtime();
            }
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder2 = map$runtime.builder2();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (!L0.contains(entry.getValue())) {
                    builder2.remove(entry.getKey());
                    z = true;
                }
            }
            PersistentMap<K, V> build2 = builder2.build2();
            if (q10.b(build2, map$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = map.getFirstStateRecord();
            firstStateRecord2.getClass();
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = map.attemptUpdate((SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current), modification$runtime, build2);
            }
            SnapshotKt.notifyWrite(current, map);
        } while (!attemptUpdate);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public Void add(V v) {
        throw gy.b();
    }

    @Override // java.util.Set, java.util.Collection
    public Void addAll(Collection<? extends V> collection) {
        throw gy.b();
    }
}
