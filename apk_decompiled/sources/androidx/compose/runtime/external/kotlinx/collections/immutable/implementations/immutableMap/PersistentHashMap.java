package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import defpackage.dq;
import defpackage.v;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class PersistentHashMap<K, V> extends v implements PersistentMap<K, V> {
    private final TrieNode<K, V> node;
    private final int size;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.Companion.getEMPTY$runtime(), 0);

    public PersistentHashMap(TrieNode<K, V> trieNode, int i) {
        this.node = trieNode;
        this.size = i;
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder */
    public PersistentHashMapBuilder<K, V> builder2() {
        return new PersistentHashMapBuilder<>(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.node.containsKey(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.v, java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.node.get(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.v, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // defpackage.v, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<K> getKeys() {
        return new PersistentHashMapKeys(this);
    }

    public final TrieNode<K, V> getNode$runtime() {
        return this.node;
    }

    @Override // defpackage.v
    public int getSize() {
        return this.size;
    }

    @Override // defpackage.v, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableCollection<V> getValues() {
        return new PersistentHashMapValues(this);
    }

    @Override // defpackage.v, java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    @Override // defpackage.v, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentHashMap<K, V> put(K k, V v) {
        TrieNode.ModificationResult<K, V> put = this.node.put(k != null ? k.hashCode() : 0, k, v, 0);
        if (put == null) {
            return this;
        }
        return new PersistentHashMap<>(put.getNode(), put.getSizeDelta() + size());
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map) {
        PersistentMap.Builder<K, V> builder2 = builder2();
        builder2.putAll(map);
        return builder2.build2();
    }

    @Override // defpackage.v, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentHashMap<K, V> remove(K k) {
        TrieNode<K, V> remove = this.node.remove(k != null ? k.hashCode() : 0, k, 0);
        return this.node == remove ? this : remove == null ? Companion.emptyOf$runtime() : new PersistentHashMap<>(remove, size() - 1);
    }

    @Override // defpackage.v, java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final <K, V> PersistentHashMap<K, V> emptyOf$runtime() {
            PersistentHashMap<K, V> persistentHashMap = PersistentHashMap.EMPTY;
            persistentHashMap.getClass();
            return persistentHashMap;
        }

        private Companion() {
        }
    }

    @Override // defpackage.v, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap put(Object obj, Object obj2) {
        return put((PersistentHashMap<K, V>) obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj, Object obj2) {
        return remove((PersistentHashMap<K, V>) obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj) {
        return remove((PersistentHashMap<K, V>) obj);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentHashMap<K, V> remove(K k, V v) {
        TrieNode<K, V> remove = this.node.remove(k != null ? k.hashCode() : 0, k, v, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return Companion.emptyOf$runtime();
        }
        return new PersistentHashMap<>(remove, size() - 1);
    }
}
