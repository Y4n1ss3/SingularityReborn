package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import defpackage.ky;
import defpackage.q10;
import defpackage.q20;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, q20 {
    public static final int $stable = 0;
    private final Set<Map.Entry<K, V>> entries;
    private StateRecord firstStateRecord;
    private final Set<K> keys;
    private final Collection<V> values;

    public SnapshotStateMap() {
        PersistentMap persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(currentSnapshot.getSnapshotId(), persistentHashMapOf);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateMapStateRecord.setNext$runtime(new StateMapStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentHashMapOf));
        }
        this.firstStateRecord = stateMapStateRecord;
        this.entries = new SnapshotMapEntrySet(this);
        this.keys = new SnapshotMapKeySet(this);
        this.values = new SnapshotMapValueSet(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean attemptUpdate(StateMapStateRecord<K, V> stateMapStateRecord, int i, PersistentMap<K, ? extends V> persistentMap) {
        Object obj;
        boolean z;
        obj = SnapshotStateMapKt.sync;
        synchronized (obj) {
            if (stateMapStateRecord.getModification$runtime() == i) {
                stateMapStateRecord.setMap$runtime(persistentMap);
                z = true;
                stateMapStateRecord.setModification$runtime(stateMapStateRecord.getModification$runtime() + 1);
            } else {
                z = false;
            }
        }
        return z;
    }

    private final int commitUpdate(StateMapStateRecord<K, V> stateMapStateRecord, PersistentMap<K, ? extends V> persistentMap) {
        Object obj;
        int modification$runtime;
        obj = SnapshotStateMapKt.sync;
        synchronized (obj) {
            stateMapStateRecord.setMap$runtime(persistentMap);
            modification$runtime = stateMapStateRecord.getModification$runtime();
            stateMapStateRecord.setModification$runtime(modification$runtime + 1);
        }
        return modification$runtime;
    }

    private final <R> R mutate(ky kyVar) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification$runtime;
        R r;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification$runtime = stateMapStateRecord.getModification$runtime();
            }
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder = map$runtime.builder();
            r = (R) kyVar.invoke(builder);
            PersistentMap<K, V> build = builder.build();
            if (q10.b(build, map$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return r;
    }

    private final void update(ky kyVar) {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        PersistentMap<K, ? extends V> persistentMap = (PersistentMap) kyVar.invoke(stateMapStateRecord.getMap$runtime());
        if (persistentMap != stateMapStateRecord.getMap$runtime()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), persistentMap);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    private final <R> R withCurrent(ky kyVar) {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return (R) kyVar.invoke(SnapshotKt.current((StateMapStateRecord) firstStateRecord));
    }

    private final <R> R writable(ky kyVar) {
        Snapshot current;
        R r;
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            r = (R) kyVar.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
        }
        SnapshotKt.notifyWrite(current, this);
        return r;
    }

    public final boolean all$runtime(ky kyVar) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime().getMap$runtime().entrySet()).iterator();
        while (it.hasNext()) {
            if (!((Boolean) kyVar.invoke((Map.Entry) it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime(ky kyVar) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime().getMap$runtime().entrySet()).iterator();
        while (it.hasNext()) {
            if (((Boolean) kyVar.invoke((Map.Entry) it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap$runtime();
        PersistentMap<K, ? extends V> persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentHashMapOf != stateMapStateRecord.getMap$runtime()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), persistentHashMapOf);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getReadable$runtime().getMap$runtime().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getReadable$runtime().getMap$runtime().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return getReadable$runtime().getMap$runtime().get(obj);
    }

    public final Map<K, V> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime();
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime() {
        return getReadable$runtime().getModification$runtime();
    }

    public final StateMapStateRecord<K, V> getReadable$runtime() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime().getMap$runtime().size();
    }

    public Collection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime().getMap$runtime().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.firstStateRecord = (StateMapStateRecord) stateRecord;
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification$runtime;
        V put;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification$runtime = stateMapStateRecord.getModification$runtime();
            }
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder = map$runtime.builder();
            put = builder.put(k, v);
            PersistentMap<K, V> build = builder.build();
            if (q10.b(build, map$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification$runtime = stateMapStateRecord.getModification$runtime();
            }
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder = map$runtime.builder();
            builder.putAll(map);
            PersistentMap<K, V> build = builder.build();
            if (q10.b(build, map$runtime)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        Object obj2;
        PersistentMap<K, V> map$runtime;
        int modification$runtime;
        V remove;
        Snapshot current;
        boolean attemptUpdate;
        do {
            obj2 = SnapshotStateMapKt.sync;
            synchronized (obj2) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification$runtime = stateMapStateRecord.getModification$runtime();
            }
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder = map$runtime.builder();
            remove = builder.remove(obj);
            PersistentMap<K, V> build = builder.build();
            if (q10.b(build, map$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return remove;
    }

    public final boolean removeIf$runtime(ky kyVar) {
        Object obj;
        PersistentMap<K, V> map$runtime;
        int modification$runtime;
        Snapshot current;
        boolean attemptUpdate;
        boolean z = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification$runtime = stateMapStateRecord.getModification$runtime();
            }
            map$runtime.getClass();
            PersistentMap.Builder<K, V> builder = map$runtime.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (((Boolean) kyVar.invoke(entry)).booleanValue()) {
                    builder.remove(entry.getKey());
                    z = true;
                }
            }
            PersistentMap<K, V> build = builder.build();
            if (q10.b(build, map$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime, build);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!attemptUpdate);
        return z;
    }

    public final boolean removeValue$runtime(V v) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (q10.b(((Map.Entry) obj).getValue(), v)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final Map<K, V> toMap() {
        return getReadable$runtime().getMap$runtime();
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        public static final int $stable = 8;
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(long j, PersistentMap<K, ? extends V> persistentMap) {
            super(j);
            this.map = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            Object obj;
            stateRecord.getClass();
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateMapStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.map);
        }

        public final PersistentMap<K, V> getMap$runtime() {
            return this.map;
        }

        public final int getModification$runtime() {
            return this.modification;
        }

        public final void setMap$runtime(PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        public final void setModification$runtime(int i) {
            this.modification = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j) {
            return new StateMapStateRecord(j, this.map);
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime$annotations() {
    }
}
