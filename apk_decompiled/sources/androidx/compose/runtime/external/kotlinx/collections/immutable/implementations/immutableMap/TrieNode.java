package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import defpackage.dq;
import defpackage.i10;
import defpackage.ky;
import defpackage.py;
import defpackage.q10;
import defpackage.y80;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TrieNode<K, V> {
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(TrieNode<K, V> trieNode, int i) {
            this.node = trieNode;
            this.sizeDelta = i;
        }

        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final ModificationResult<K, V> replaceNode(ky kyVar) {
            setNode((TrieNode) kyVar.invoke(getNode()));
            return this;
        }

        public final void setNode(TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }
    }

    public TrieNode(int i, int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    private final void accept(py pyVar, int i, int i2) {
        pyVar.invoke(this, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i3 = this.nodeMap;
        while (i3 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i3);
            nodeAtIndex$runtime(nodeIndex$runtime(lowestOneBit)).accept(pyVar, (Integer.numberOfTrailingZeros(lowestOneBit) << i2) + i, i2 + 5);
            i3 -= lowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, MutabilityOwnership mutabilityOwnership) {
        Object[] replaceEntryWithNode;
        K keyAtIndex = keyAtIndex(i);
        replaceEntryWithNode = TrieNodeKt.replaceEntryWithNode(this.buffer, i, nodeIndex$runtime(i2) + 1, makeNode(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex(i), i3, k, v, i4 + 5, mutabilityOwnership));
        return replaceEntryWithNode;
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$runtime(i).calculateSize();
        }
        return bitCount;
    }

    private final boolean collisionContainsKey(K k) {
        i10 T = y80.T(y80.W(0, this.buffer.length), 2);
        int i = T.d;
        int i2 = T.e;
        int i3 = T.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!q10.b(k, this.buffer[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k) {
        i10 T = y80.T(y80.W(0, this.buffer.length), 2);
        int i = T.d;
        int i2 = T.e;
        int i3 = T.f;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return null;
        }
        while (!q10.b(k, keyAtIndex(i))) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return valueAtKeyIndex(i);
    }

    private final ModificationResult<K, V> collisionPut(K k, V v) {
        Object[] insertEntryAtIndex;
        i10 T = y80.T(y80.W(0, this.buffer.length), 2);
        int i = T.d;
        int i2 = T.e;
        int i3 = T.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!q10.b(k, keyAtIndex(i))) {
                if (i != i2) {
                    i += i3;
                }
            }
            if (v == valueAtKeyIndex(i)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[i + 1] = v;
            return new TrieNode(0, 0, copyOf).asUpdateResult();
        }
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k, v);
        return new TrieNode(0, 0, insertEntryAtIndex).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K k, V v) {
        i10 T = y80.T(y80.W(0, this.buffer.length), 2);
        int i = T.d;
        int i2 = T.e;
        int i3 = T.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                if (!q10.b(k, keyAtIndex(i)) || !q10.b(v, valueAtKeyIndex(i))) {
                    if (i == i2) {
                        break;
                    }
                    i += i3;
                } else {
                    return collisionRemoveEntryAtIndex(i);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i) {
        Object[] removeEntryAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i);
        return new TrieNode<>(0, 0, removeEntryAtIndex);
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap != trieNode.nodeMap || this.dataMap != trieNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != trieNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNodeAt(int i) {
        return (this.nodeMap & i) != 0;
    }

    private final TrieNode<K, V> insertEntryAt(int i, K k, V v) {
        Object[] insertEntryAtIndex;
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime(i), k, v);
        return new TrieNode<>(i | this.dataMap, this.nodeMap, insertEntryAtIndex);
    }

    private final K keyAtIndex(int i) {
        return (K) this.buffer[i];
    }

    private final TrieNode<K, V> makeNode(int i, K k, V v, int i2, K k2, V v2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k, v, k2, v2}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i, i3);
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, indexSegment < indexSegment2 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, mutabilityOwnership);
        }
        return new TrieNode<>(0, 1 << indexSegment, new Object[]{makeNode(i, k, v, i2, k2, v2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<K, V> moveEntryToNode(int i, int i2, int i3, K k, V v, int i4) {
        return new TrieNode<>(this.dataMap ^ i2, this.nodeMap | i2, bufferMoveEntryToNode(i, i2, i3, k, v, i4, null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K k, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        Object[] insertEntryAtIndex;
        i10 T = y80.T(y80.W(0, this.buffer.length), 2);
        int i = T.d;
        int i2 = T.e;
        int i3 = T.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!q10.b(k, keyAtIndex(i))) {
                if (i != i2) {
                    i += i3;
                }
            }
            persistentHashMapBuilder.setOperationResult$runtime(valueAtKeyIndex(i));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
                this.buffer[i + 1] = v;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime(persistentHashMapBuilder.getModCount$runtime() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[i + 1] = v;
            return new TrieNode<>(0, 0, copyOf, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k, v);
        return new TrieNode<>(0, 0, insertEntryAtIndex, persistentHashMapBuilder.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        CommonFunctionsKt.m4094assert(this.nodeMap == 0);
        CommonFunctionsKt.m4094assert(this.dataMap == 0);
        CommonFunctionsKt.m4094assert(trieNode.nodeMap == 0);
        CommonFunctionsKt.m4094assert(trieNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        int length = this.buffer.length;
        i10 T = y80.T(y80.W(0, trieNode.buffer.length), 2);
        int i = T.d;
        int i2 = T.e;
        int i3 = T.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                if (collisionContainsKey(trieNode.buffer[i])) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = trieNode.buffer;
                    copyOf[length] = objArr2[i];
                    copyOf[length + 1] = objArr2[i + 1];
                    length += 2;
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        return length == this.buffer.length ? this : length == trieNode.buffer.length ? trieNode : length == copyOf.length ? new TrieNode<>(0, 0, copyOf, mutabilityOwnership) : new TrieNode<>(0, 0, Arrays.copyOf(copyOf, length), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        i10 T = y80.T(y80.W(0, this.buffer.length), 2);
        int i = T.d;
        int i2 = T.e;
        int i3 = T.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                if (!q10.b(k, keyAtIndex(i)) || !q10.b(v, valueAtKeyIndex(i))) {
                    if (i == i2) {
                        break;
                    }
                    i += i3;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(i, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        Object[] removeEntryAtIndex;
        Object[] removeEntryAtIndex2;
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        MutabilityOwnership mutabilityOwnership = this.ownedBy;
        MutabilityOwnership ownership = persistentHashMapBuilder.getOwnership();
        Object[] objArr = this.buffer;
        if (mutabilityOwnership != ownership) {
            removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i);
            return new TrieNode<>(0, 0, removeEntryAtIndex, persistentHashMapBuilder.getOwnership());
        }
        removeEntryAtIndex2 = TrieNodeKt.removeEntryAtIndex(objArr, i);
        this.buffer = removeEntryAtIndex2;
        return this;
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i, K k, V v, MutabilityOwnership mutabilityOwnership) {
        Object[] insertEntryAtIndex;
        Object[] insertEntryAtIndex2;
        int entryKeyIndex$runtime = entryKeyIndex$runtime(i);
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 != mutabilityOwnership) {
            insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(objArr, entryKeyIndex$runtime, k, v);
            return new TrieNode<>(i | this.dataMap, this.nodeMap, insertEntryAtIndex, mutabilityOwnership);
        }
        insertEntryAtIndex2 = TrieNodeKt.insertEntryAtIndex(objArr, entryKeyIndex$runtime, k, v);
        this.buffer = insertEntryAtIndex2;
        this.dataMap = i | this.dataMap;
        return this;
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(this.dataMap ^ i2, this.nodeMap | i2, bufferMoveEntryToNode(i, i2, i3, k, v, i4, mutabilityOwnership), mutabilityOwnership);
        }
        this.buffer = bufferMoveEntryToNode(i, i2, i3, k, v, i4, mutabilityOwnership);
        this.dataMap ^= i2;
        this.nodeMap |= i2;
        return this;
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i, int i2, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (hasNodeAt(i)) {
            TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(i));
            if (trieNode.hasNodeAt(i)) {
                return nodeAtIndex$runtime.mutablePutAll(trieNode.nodeAtIndex$runtime(trieNode.nodeIndex$runtime(i)), i2 + 5, deltaCounter, persistentHashMapBuilder);
            }
            if (!trieNode.hasEntryAt$runtime(i)) {
                return nodeAtIndex$runtime;
            }
            int entryKeyIndex$runtime = trieNode.entryKeyIndex$runtime(i);
            K keyAtIndex = trieNode.keyAtIndex(entryKeyIndex$runtime);
            V valueAtKeyIndex = trieNode.valueAtKeyIndex(entryKeyIndex$runtime);
            int size = persistentHashMapBuilder.size();
            TrieNode<K, V> mutablePut = nodeAtIndex$runtime.mutablePut(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex, i2 + 5, persistentHashMapBuilder);
            if (persistentHashMapBuilder.size() == size) {
                deltaCounter.setCount(deltaCounter.getCount() + 1);
            }
            return mutablePut;
        }
        if (!trieNode.hasNodeAt(i)) {
            int entryKeyIndex$runtime2 = entryKeyIndex$runtime(i);
            K keyAtIndex2 = keyAtIndex(entryKeyIndex$runtime2);
            V valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime2);
            int entryKeyIndex$runtime3 = trieNode.entryKeyIndex$runtime(i);
            K keyAtIndex3 = trieNode.keyAtIndex(entryKeyIndex$runtime3);
            return makeNode(keyAtIndex2 != null ? keyAtIndex2.hashCode() : 0, keyAtIndex2, valueAtKeyIndex2, keyAtIndex3 != null ? keyAtIndex3.hashCode() : 0, keyAtIndex3, trieNode.valueAtKeyIndex(entryKeyIndex$runtime3), i2 + 5, persistentHashMapBuilder.getOwnership());
        }
        TrieNode<K, V> nodeAtIndex$runtime2 = trieNode.nodeAtIndex$runtime(trieNode.nodeIndex$runtime(i));
        if (!hasEntryAt$runtime(i)) {
            return nodeAtIndex$runtime2;
        }
        int entryKeyIndex$runtime4 = entryKeyIndex$runtime(i);
        K keyAtIndex4 = keyAtIndex(entryKeyIndex$runtime4);
        int i3 = i2 + 5;
        if (!nodeAtIndex$runtime2.containsKey(keyAtIndex4 != null ? keyAtIndex4.hashCode() : 0, keyAtIndex4, i3)) {
            return nodeAtIndex$runtime2.mutablePut(keyAtIndex4 != null ? keyAtIndex4.hashCode() : 0, keyAtIndex4, valueAtKeyIndex(entryKeyIndex$runtime4), i3, persistentHashMapBuilder);
        }
        deltaCounter.setCount(deltaCounter.getCount() + 1);
        return nodeAtIndex$runtime2;
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        Object[] removeEntryAtIndex;
        Object[] removeEntryAtIndex2;
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        MutabilityOwnership mutabilityOwnership = this.ownedBy;
        MutabilityOwnership ownership = persistentHashMapBuilder.getOwnership();
        Object[] objArr = this.buffer;
        if (mutabilityOwnership != ownership) {
            removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i);
            return new TrieNode<>(i2 ^ this.dataMap, this.nodeMap, removeEntryAtIndex, persistentHashMapBuilder.getOwnership());
        }
        removeEntryAtIndex2 = TrieNodeKt.removeEntryAtIndex(objArr, i);
        this.buffer = removeEntryAtIndex2;
        this.dataMap ^= i2;
        return this;
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] removeNodeAtIndex;
        Object[] removeNodeAtIndex2;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != mutabilityOwnership) {
            removeNodeAtIndex = TrieNodeKt.removeNodeAtIndex(objArr, i);
            return new TrieNode<>(this.dataMap, this.nodeMap ^ i2, removeNodeAtIndex, mutabilityOwnership);
        }
        removeNodeAtIndex2 = TrieNodeKt.removeNodeAtIndex(objArr, i);
        this.buffer = removeNodeAtIndex2;
        this.nodeMap ^= i2;
        return this;
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i, int i2, MutabilityOwnership mutabilityOwnership) {
        return trieNode2 == null ? mutableRemoveNodeAtIndex(i, i2, mutabilityOwnership) : (this.ownedBy == mutabilityOwnership || trieNode != trieNode2) ? mutableUpdateNodeAtIndex(i, trieNode2, mutabilityOwnership) : this;
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        if (this.ownedBy == mutabilityOwnership) {
            objArr[i] = trieNode;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer[i + 1] = v;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime(persistentHashMapBuilder.getModCount$runtime() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i, int i2) {
        Object[] removeEntryAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i);
        return new TrieNode<>(i2 ^ this.dataMap, this.nodeMap, removeEntryAtIndex);
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i, int i2) {
        Object[] removeNodeAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        removeNodeAtIndex = TrieNodeKt.removeNodeAtIndex(objArr, i);
        return new TrieNode<>(this.dataMap, this.nodeMap ^ i2, removeNodeAtIndex);
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i, int i2) {
        return trieNode2 == null ? removeNodeAtIndex(i, i2) : trieNode != trieNode2 ? updateNodeAtIndex(i, i2, trieNode2) : this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i, int i2, TrieNode<K, V> trieNode) {
        Object[] replaceNodeWithEntry;
        Object[] objArr = trieNode.buffer;
        if (objArr.length != 2 || trieNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
        }
        if (this.buffer.length == 1) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        replaceNodeWithEntry = TrieNodeKt.replaceNodeWithEntry(this.buffer, i, entryKeyIndex$runtime(i2), objArr[0], objArr[1]);
        return new TrieNode<>(this.dataMap ^ i2, this.nodeMap ^ i2, replaceNodeWithEntry);
    }

    private final TrieNode<K, V> updateValueAtIndex(int i, V v) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final V valueAtKeyIndex(int i) {
        return (V) this.buffer[i + 1];
    }

    public final void accept$runtime(py pyVar) {
        accept(pyVar, 0, 0);
    }

    public final boolean containsKey(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            return q10.b(k, keyAtIndex(entryKeyIndex$runtime(indexSegment)));
        }
        if (!hasNodeAt(indexSegment)) {
            return false;
        }
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(indexSegment));
        return i2 == 30 ? nodeAtIndex$runtime.collisionContainsKey(k) : nodeAtIndex$runtime.containsKey(i, k, i2 + 5);
    }

    public final int entryCount$runtime() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime(int i) {
        return Integer.bitCount(this.dataMap & (i - 1)) * 2;
    }

    public final V get(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (q10.b(k, keyAtIndex(entryKeyIndex$runtime))) {
                return valueAtKeyIndex(entryKeyIndex$runtime);
            }
            return null;
        }
        if (!hasNodeAt(indexSegment)) {
            return null;
        }
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(indexSegment));
        return i2 == 30 ? nodeAtIndex$runtime.collisionGet(k) : nodeAtIndex$runtime.get(i, k, i2 + 5);
    }

    public final Object[] getBuffer$runtime() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime(int i) {
        return (this.dataMap & i) != 0;
    }

    public final TrieNode<K, V> mutablePut(int i, K k, V v, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (q10.b(k, keyAtIndex(entryKeyIndex$runtime))) {
                persistentHashMapBuilder.setOperationResult$runtime(valueAtKeyIndex(entryKeyIndex$runtime));
                return valueAtKeyIndex(entryKeyIndex$runtime) == v ? this : mutableUpdateValueAtIndex(entryKeyIndex$runtime, v, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$runtime, indexSegment, i, k, v, i2, persistentHashMapBuilder.getOwnership());
        }
        if (!hasNodeAt(indexSegment)) {
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableInsertEntryAt(indexSegment, k, v, persistentHashMapBuilder.getOwnership());
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        TrieNode<K, V> mutableCollisionPut = i2 == 30 ? nodeAtIndex$runtime.mutableCollisionPut(k, v, persistentHashMapBuilder) : nodeAtIndex$runtime.mutablePut(i, k, v, i2 + 5, persistentHashMapBuilder);
        return nodeAtIndex$runtime == mutableCollisionPut ? this : mutableUpdateNodeAtIndex(nodeIndex$runtime, mutableCollisionPut, persistentHashMapBuilder.getOwnership());
    }

    public final TrieNode<K, V> mutablePutAll(TrieNode<K, V> trieNode, int i, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        int i2 = i;
        if (i2 > 30) {
            return mutableCollisionPutAll(trieNode, deltaCounter, persistentHashMapBuilder.getOwnership());
        }
        int i3 = this.nodeMap | trieNode.nodeMap;
        int i4 = this.dataMap;
        int i5 = trieNode.dataMap;
        int i6 = (i4 ^ i5) & (~i3);
        int i7 = i4 & i5;
        while (i7 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i7);
            if (q10.b(keyAtIndex(entryKeyIndex$runtime(lowestOneBit)), trieNode.keyAtIndex(trieNode.entryKeyIndex$runtime(lowestOneBit)))) {
                i6 |= lowestOneBit;
            } else {
                i3 |= lowestOneBit;
            }
            i7 ^= lowestOneBit;
        }
        int i8 = 0;
        if (!((i3 & i6) == 0)) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        TrieNode<K, V> trieNode2 = (q10.b(this.ownedBy, persistentHashMapBuilder.getOwnership()) && this.dataMap == i6 && this.nodeMap == i3) ? this : new TrieNode<>(i6, i3, new Object[Integer.bitCount(i3) + (Integer.bitCount(i6) * 2)]);
        int i9 = i3;
        int i10 = 0;
        while (i9 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i9);
            Object[] objArr = trieNode2.buffer;
            objArr[(objArr.length - 1) - i10] = mutablePutAllFromOtherNodeCell(trieNode, lowestOneBit2, i2, deltaCounter, persistentHashMapBuilder);
            i10++;
            i9 ^= lowestOneBit2;
            i2 = i;
        }
        while (i6 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i6);
            int i11 = i8 * 2;
            if (trieNode.hasEntryAt$runtime(lowestOneBit3)) {
                int entryKeyIndex$runtime = trieNode.entryKeyIndex$runtime(lowestOneBit3);
                trieNode2.buffer[i11] = trieNode.keyAtIndex(entryKeyIndex$runtime);
                trieNode2.buffer[i11 + 1] = trieNode.valueAtKeyIndex(entryKeyIndex$runtime);
                if (hasEntryAt$runtime(lowestOneBit3)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
            } else {
                int entryKeyIndex$runtime2 = entryKeyIndex$runtime(lowestOneBit3);
                trieNode2.buffer[i11] = keyAtIndex(entryKeyIndex$runtime2);
                trieNode2.buffer[i11 + 1] = valueAtKeyIndex(entryKeyIndex$runtime2);
            }
            i8++;
            i6 ^= lowestOneBit3;
        }
        return elementsIdentityEquals(trieNode2) ? this : trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
    }

    public final TrieNode<K, V> mutableRemove(int i, K k, V v, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder2;
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            return (q10.b(k, keyAtIndex(entryKeyIndex$runtime)) && q10.b(v, valueAtKeyIndex(entryKeyIndex$runtime))) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime, indexSegment, persistentHashMapBuilder) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (i2 == 30) {
            mutableRemove = nodeAtIndex$runtime.mutableCollisionRemove(k, v, persistentHashMapBuilder);
            persistentHashMapBuilder2 = persistentHashMapBuilder;
        } else {
            persistentHashMapBuilder2 = persistentHashMapBuilder;
            mutableRemove = nodeAtIndex$runtime.mutableRemove(i, k, v, i2 + 5, persistentHashMapBuilder2);
        }
        return mutableReplaceNode(nodeAtIndex$runtime, mutableRemove, nodeIndex$runtime, indexSegment, persistentHashMapBuilder2.getOwnership());
    }

    public final TrieNode<K, V> nodeAtIndex$runtime(int i) {
        Object obj = this.buffer[i];
        obj.getClass();
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime(int i) {
        return (this.buffer.length - 1) - Integer.bitCount(this.nodeMap & (i - 1));
    }

    public final ModificationResult<K, V> put(int i, K k, V v, int i2) {
        ModificationResult<K, V> put;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (!q10.b(k, keyAtIndex(entryKeyIndex$runtime))) {
                return moveEntryToNode(entryKeyIndex$runtime, indexSegment, i, k, v, i2).asInsertResult();
            }
            if (valueAtKeyIndex(entryKeyIndex$runtime) == v) {
                return null;
            }
            return updateValueAtIndex(entryKeyIndex$runtime, v).asUpdateResult();
        }
        if (!hasNodeAt(indexSegment)) {
            return insertEntryAt(indexSegment, k, v).asInsertResult();
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (i2 == 30) {
            put = nodeAtIndex$runtime.collisionPut(k, v);
            if (put == null) {
                return null;
            }
        } else {
            put = nodeAtIndex$runtime.put(i, k, v, i2 + 5);
            if (put == null) {
                return null;
            }
        }
        put.setNode(updateNodeAtIndex(nodeIndex$runtime, indexSegment, put.getNode()));
        return put;
    }

    public final TrieNode<K, V> remove(int i, K k, V v, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            return (q10.b(k, keyAtIndex(entryKeyIndex$runtime)) && q10.b(v, valueAtKeyIndex(entryKeyIndex$runtime))) ? removeEntryAtIndex(entryKeyIndex$runtime, indexSegment) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        return replaceNode(nodeAtIndex$runtime, i2 == 30 ? nodeAtIndex$runtime.collisionRemove(k, v) : nodeAtIndex$runtime.remove(i, k, v, i2 + 5), nodeIndex$runtime, indexSegment);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final TrieNode getEMPTY$runtime() {
            return TrieNode.EMPTY;
        }

        private Companion() {
        }
    }

    public TrieNode(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }

    private final TrieNode<K, V> collisionRemove(K k) {
        i10 T = y80.T(y80.W(0, this.buffer.length), 2);
        int i = T.d;
        int i2 = T.e;
        int i3 = T.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!q10.b(k, keyAtIndex(i))) {
                if (i != i2) {
                    i += i3;
                }
            }
            return collisionRemoveEntryAtIndex(i);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        i10 T = y80.T(y80.W(0, this.buffer.length), 2);
        int i = T.d;
        int i2 = T.e;
        int i3 = T.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!q10.b(k, keyAtIndex(i))) {
                if (i != i2) {
                    i += i3;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(i, persistentHashMapBuilder);
        }
        return this;
    }

    public final TrieNode<K, V> remove(int i, K k, int i2) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            return q10.b(k, keyAtIndex(entryKeyIndex$runtime)) ? removeEntryAtIndex(entryKeyIndex$runtime, indexSegment) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (i2 == 30) {
            remove = nodeAtIndex$runtime.collisionRemove(k);
        } else {
            remove = nodeAtIndex$runtime.remove(i, k, i2 + 5);
        }
        return replaceNode(nodeAtIndex$runtime, remove, nodeIndex$runtime, indexSegment);
    }

    public final TrieNode<K, V> mutableRemove(int i, K k, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (q10.b(k, keyAtIndex(entryKeyIndex$runtime))) {
                return mutableRemoveEntryAtIndex(entryKeyIndex$runtime, indexSegment, persistentHashMapBuilder);
            }
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex$runtime.mutableCollisionRemove(k, persistentHashMapBuilder);
            } else {
                mutableRemove = nodeAtIndex$runtime.mutableRemove(i, k, i2 + 5, persistentHashMapBuilder);
            }
            return mutableReplaceNode(nodeAtIndex$runtime, mutableRemove, nodeIndex$runtime, indexSegment, persistentHashMapBuilder.getOwnership());
        }
        return this;
    }
}
