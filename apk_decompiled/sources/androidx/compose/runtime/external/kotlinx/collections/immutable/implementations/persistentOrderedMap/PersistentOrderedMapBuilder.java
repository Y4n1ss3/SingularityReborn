package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import defpackage.q10;
import defpackage.y;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilder<K, V> extends y implements PersistentMap.Builder<K, V> {
    public static final int $stable = 8;
    private Object firstKey;
    private final PersistentHashMapBuilder<K, LinkedValue<V>> hashMapBuilder;
    private Object lastKey;
    private PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapBuilder(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
        this.firstKey = persistentOrderedMap.getFirstKey$runtime();
        this.lastKey = this.map.getLastKey$runtime();
        this.hashMapBuilder = this.map.getHashMap$runtime().builder();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public PersistentMap<K, V> build() {
        PersistentOrderedMap<K, V> persistentOrderedMap;
        PersistentHashMap<K, LinkedValue<V>> build = this.hashMapBuilder.build();
        if (build == this.map.getHashMap$runtime()) {
            CommonFunctionsKt.m4094assert(this.firstKey == this.map.getFirstKey$runtime());
            CommonFunctionsKt.m4094assert(this.lastKey == this.map.getLastKey$runtime());
            persistentOrderedMap = this.map;
        } else {
            persistentOrderedMap = new PersistentOrderedMap<>(this.firstKey, this.lastKey, build);
        }
        this.map = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstKey = endOfChain;
        this.lastKey = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // defpackage.y
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    public final Object getFirstKey$runtime() {
        return this.firstKey;
    }

    public final PersistentHashMapBuilder<K, LinkedValue<V>> getHashMapBuilder$runtime() {
        return this.hashMapBuilder;
    }

    @Override // defpackage.y
    public Set<K> getKeys() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // defpackage.y
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // defpackage.y
    public Collection<V> getValues() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(k);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v) {
                return v;
            }
            this.hashMapBuilder.put(k, linkedValue.withValue(v));
            return linkedValue.getValue();
        }
        if (isEmpty()) {
            this.firstKey = k;
            this.lastKey = k;
            this.hashMapBuilder.put(k, new LinkedValue<>(v));
            return null;
        }
        Object obj = this.lastKey;
        LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(obj);
        linkedValue2.getClass();
        CommonFunctionsKt.m4094assert(!r2.getHasNext());
        this.hashMapBuilder.put(obj, linkedValue2.withNext(k));
        this.hashMapBuilder.put(k, new LinkedValue<>(v, obj));
        this.lastKey = k;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        LinkedValue<V> remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return null;
        }
        if (remove.getHasPrevious()) {
            LinkedValue<V> linkedValue = this.hashMapBuilder.get(remove.getPrevious());
            linkedValue.getClass();
            this.hashMapBuilder.put(remove.getPrevious(), linkedValue.withNext(remove.getNext()));
        } else {
            this.firstKey = remove.getNext();
        }
        if (remove.getHasNext()) {
            LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(remove.getNext());
            linkedValue2.getClass();
            this.hashMapBuilder.put(remove.getNext(), linkedValue2.withPrevious(remove.getPrevious()));
        } else {
            this.lastKey = remove.getPrevious();
        }
        return remove.getValue();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue == null || !q10.b(linkedValue.getValue(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
