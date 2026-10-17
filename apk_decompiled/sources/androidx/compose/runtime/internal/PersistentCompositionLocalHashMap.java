package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMapKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import defpackage.dq;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentCompositionLocalHashMap extends PersistentHashMap<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap {
    private static final PersistentCompositionLocalHashMap Empty;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        TrieNode eMPTY$runtime = TrieNode.Companion.getEMPTY$runtime();
        eMPTY$runtime.getClass();
        Empty = new PersistentCompositionLocalHashMap(eMPTY$runtime, 0);
    }

    public PersistentCompositionLocalHashMap(TrieNode<CompositionLocal<Object>, ValueHolder<Object>> trieNode, int i) {
        super(trieNode, i);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder, reason: merged with bridge method [inline-methods] */
    public PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2() {
        return new Builder(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof CompositionLocal) {
            return containsKey((CompositionLocal<Object>) obj);
        }
        return false;
    }

    @Override // defpackage.v, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof ValueHolder) {
            return containsValue((ValueHolder<Object>) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map
    public final /* bridge */ ValueHolder<Object> get(Object obj) {
        if (obj instanceof CompositionLocal) {
            return get((CompositionLocal<Object>) obj);
        }
        return null;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, defpackage.v, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<Map.Entry<CompositionLocal<Object>, ValueHolder<Object>>> getEntries() {
        return super.getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof CompositionLocal) ? obj2 : getOrDefault((CompositionLocal<Object>) obj, (ValueHolder<Object>) obj2);
    }

    @Override // androidx.compose.runtime.PersistentCompositionLocalMap
    public PersistentCompositionLocalMap putValue(CompositionLocal<Object> compositionLocal, ValueHolder<Object> valueHolder) {
        TrieNode.ModificationResult<CompositionLocal<Object>, ValueHolder<Object>> put = getNode$runtime().put(compositionLocal.hashCode(), compositionLocal, valueHolder, 0);
        if (put == null) {
            return this;
        }
        return new PersistentCompositionLocalHashMap(put.getNode(), put.getSizeDelta() + size());
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final PersistentCompositionLocalHashMap getEmpty() {
            return PersistentCompositionLocalHashMap.Empty;
        }

        private Companion() {
        }

        public static /* synthetic */ void getEmpty$annotations() {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Builder extends PersistentHashMapBuilder<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap.Builder {
        public static final int $stable = 8;
        private PersistentCompositionLocalHashMap map;

        public Builder(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            super(persistentCompositionLocalHashMap);
            this.map = persistentCompositionLocalHashMap;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public PersistentMap<CompositionLocal<Object>, ValueHolder<Object>> build2() {
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap;
            if (getNode$runtime() == this.map.getNode$runtime()) {
                persistentCompositionLocalHashMap = this.map;
            } else {
                setOwnership(new MutabilityOwnership());
                persistentCompositionLocalHashMap = new PersistentCompositionLocalHashMap(getNode$runtime(), size());
            }
            this.map = persistentCompositionLocalHashMap;
            return persistentCompositionLocalHashMap;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof CompositionLocal) {
                return containsKey((CompositionLocal<Object>) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof ValueHolder) {
                return containsValue((ValueHolder<Object>) obj);
            }
            return false;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ ValueHolder<Object> get(Object obj) {
            if (obj instanceof CompositionLocal) {
                return get((CompositionLocal<Object>) obj);
            }
            return null;
        }

        public final PersistentCompositionLocalHashMap getMap$runtime() {
            return this.map;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof CompositionLocal) ? obj2 : getOrDefault((CompositionLocal<Object>) obj, (ValueHolder<Object>) obj2);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ ValueHolder<Object> remove(Object obj) {
            if (obj instanceof CompositionLocal) {
                return remove((CompositionLocal<Object>) obj);
            }
            return null;
        }

        public final void setMap$runtime(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            this.map = persistentCompositionLocalHashMap;
        }

        public /* bridge */ boolean containsKey(CompositionLocal<Object> compositionLocal) {
            return super.containsKey((Object) compositionLocal);
        }

        public /* bridge */ boolean containsValue(ValueHolder<Object> valueHolder) {
            return super.containsValue((Object) valueHolder);
        }

        public /* bridge */ ValueHolder<Object> get(CompositionLocal<Object> compositionLocal) {
            return (ValueHolder) super.get((Object) compositionLocal);
        }

        public /* bridge */ ValueHolder<Object> remove(CompositionLocal<Object> compositionLocal) {
            return (ValueHolder) super.remove((Object) compositionLocal);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof CompositionLocal) {
                return get((CompositionLocal<Object>) obj);
            }
            return null;
        }

        public final /* bridge */ ValueHolder<Object> getOrDefault(Object obj, ValueHolder<Object> valueHolder) {
            return !(obj instanceof CompositionLocal) ? valueHolder : getOrDefault((CompositionLocal<Object>) obj, valueHolder);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof CompositionLocal) {
                return remove((CompositionLocal<Object>) obj);
            }
            return null;
        }

        public /* bridge */ ValueHolder<Object> getOrDefault(CompositionLocal<Object> compositionLocal, ValueHolder<Object> valueHolder) {
            return (ValueHolder) super.getOrDefault((Object) compositionLocal, (CompositionLocal<Object>) valueHolder);
        }
    }

    public /* bridge */ boolean containsKey(CompositionLocal<Object> compositionLocal) {
        return super.containsKey((Object) compositionLocal);
    }

    public /* bridge */ boolean containsValue(ValueHolder<Object> valueHolder) {
        return super.containsValue((Object) valueHolder);
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public /* bridge */ ValueHolder<Object> get(CompositionLocal<Object> compositionLocal) {
        return (ValueHolder) super.get((Object) compositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof CompositionLocal) {
            return get((CompositionLocal<Object>) obj);
        }
        return null;
    }

    public final /* bridge */ ValueHolder<Object> getOrDefault(Object obj, ValueHolder<Object> valueHolder) {
        return !(obj instanceof CompositionLocal) ? valueHolder : getOrDefault((CompositionLocal<Object>) obj, valueHolder);
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public <T> T get(CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(this, compositionLocal);
    }

    public /* bridge */ ValueHolder<Object> getOrDefault(CompositionLocal<Object> compositionLocal, ValueHolder<Object> valueHolder) {
        return (ValueHolder) super.getOrDefault((Object) compositionLocal, (CompositionLocal<Object>) valueHolder);
    }
}
