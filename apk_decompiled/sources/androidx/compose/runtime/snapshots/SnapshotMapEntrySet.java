package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import defpackage.gy;
import defpackage.n20;
import defpackage.p20;
import defpackage.p80;
import defpackage.q10;
import defpackage.zi;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SnapshotMapEntrySet<K, V> extends SnapshotMapSet<K, V, Map.Entry<K, V>> {
    public SnapshotMapEntrySet(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if (!(obj instanceof n20) || (obj instanceof p20)) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new StateMapMutableEntriesIterator(getMap(), ((ImmutableSet) getMap().getReadable$runtime().getMap$runtime().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if (!(obj instanceof n20) || (obj instanceof p20)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (getMap().remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification$runtime;
        Snapshot current;
        boolean attemptUpdate;
        Collection<?> collection2 = collection;
        int L = p80.L(zi.a0(collection2, 10));
        if (L < 16) {
            L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(L);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
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
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !q10.b(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder2.remove(entry2.getKey());
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
    public Void addAll(Collection<? extends Map.Entry<K, V>> collection) {
        throw gy.b();
    }

    public Void add(Map.Entry<K, V> entry) {
        throw gy.b();
    }

    public boolean contains(Map.Entry<K, V> entry) {
        return q10.b(getMap().get(entry.getKey()), entry.getValue());
    }

    public boolean remove(Map.Entry<K, V> entry) {
        return getMap().remove(entry.getKey()) != null;
    }
}
