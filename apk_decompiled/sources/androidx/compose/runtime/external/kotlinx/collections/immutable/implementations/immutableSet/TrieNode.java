package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import defpackage.ac;
import defpackage.dq;
import defpackage.q10;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TrieNode<E> {
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);

    public TrieNode(int i, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    private final TrieNode<E> addElementAt(int i, E e) {
        Object[] addElementAtIndex;
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime(i), e);
        return new TrieNode<>(this.bitmap | i, addElementAtIndex);
    }

    private final int calculateSize() {
        int i = this.bitmap;
        Object[] objArr = this.buffer;
        if (i == 0) {
            return objArr.length;
        }
        int i2 = 0;
        for (Object obj : objArr) {
            i2 += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
        }
        return i2;
    }

    private final TrieNode<E> collisionAdd(E e) {
        Object[] addElementAtIndex;
        if (collisionContainsElement(e)) {
            return this;
        }
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, 0, e);
        return new TrieNode<>(0, addElementAtIndex);
    }

    private final boolean collisionContainsElement(E e) {
        return ac.L(this.buffer, e);
    }

    private final TrieNode<E> collisionRemove(E e) {
        int g0 = ac.g0(this.buffer, e);
        return g0 != -1 ? collisionRemoveElementAtIndex(g0) : this;
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return new TrieNode<>(0, removeCellAtIndex);
    }

    private final E elementAtIndex(int i) {
        return (E) this.buffer[i];
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
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

    private final boolean hasNoCellAt(int i) {
        return (this.bitmap & i) == 0;
    }

    private final TrieNode<E> makeNode(int i, E e, int i2, E e2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode<>(0, new Object[]{e, e2}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i, i3);
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), indexSegment < indexSegment2 ? new Object[]{e, e2} : new Object[]{e2, e}, mutabilityOwnership);
        }
        return new TrieNode<>(1 << indexSegment, new Object[]{makeNode(i, e, i2, e2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i, int i2, E e, int i3, MutabilityOwnership mutabilityOwnership) {
        E elementAtIndex = elementAtIndex(i);
        return makeNode(elementAtIndex != null ? elementAtIndex.hashCode() : 0, elementAtIndex, i2, e, i3 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i, int i2, E e, int i3) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = makeNodeAtIndex(i, i2, e, i3, null);
        return new TrieNode<>(this.bitmap, copyOf);
    }

    private final TrieNode<E> mutableAddElementAt(int i, E e, MutabilityOwnership mutabilityOwnership) {
        Object[] addElementAtIndex;
        Object[] addElementAtIndex2;
        int indexOfCellAt$runtime = indexOfCellAt$runtime(i);
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 != mutabilityOwnership) {
            addElementAtIndex = TrieNodeKt.addElementAtIndex(objArr, indexOfCellAt$runtime, e);
            return new TrieNode<>(this.bitmap | i, addElementAtIndex, mutabilityOwnership);
        }
        addElementAtIndex2 = TrieNodeKt.addElementAtIndex(objArr, indexOfCellAt$runtime, e);
        this.buffer = addElementAtIndex2;
        this.bitmap = i | this.bitmap;
        return this;
    }

    private final TrieNode<E> mutableCollisionAdd(E e, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        Object[] addElementAtIndex;
        Object[] addElementAtIndex2;
        if (collisionContainsElement(e)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        MutabilityOwnership mutabilityOwnership = this.ownedBy;
        MutabilityOwnership ownership$runtime = persistentHashSetBuilder.getOwnership$runtime();
        Object[] objArr = this.buffer;
        if (mutabilityOwnership != ownership$runtime) {
            addElementAtIndex = TrieNodeKt.addElementAtIndex(objArr, 0, e);
            return new TrieNode<>(0, addElementAtIndex, persistentHashSetBuilder.getOwnership$runtime());
        }
        addElementAtIndex2 = TrieNodeKt.addElementAtIndex(objArr, 0, e);
        this.buffer = addElementAtIndex2;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (this == trieNode) {
            deltaCounter.plusAssign(objArr.length);
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i = 0;
        int i2 = 0;
        while (i < objArr2.length) {
            CommonFunctionsKt.m4094assert(i2 <= i);
            if (!collisionContainsElement(objArr2[i])) {
                copyOf[length + i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m4094assert(length + i2 <= copyOf.length);
            }
            i++;
        }
        int length2 = i2 + this.buffer.length;
        deltaCounter.plusAssign(copyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
        }
        if (!q10.b(this.ownedBy, mutabilityOwnership)) {
            return new TrieNode<>(0, copyOf, mutabilityOwnership);
        }
        this.buffer = copyOf;
        return this;
    }

    private final TrieNode<E> mutableCollisionRemove(E e, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int g0 = ac.g0(this.buffer, e);
        if (g0 == -1) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
        return mutableCollisionRemoveElementAtIndex(g0, persistentHashSetBuilder.getOwnership$runtime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        boolean b = q10.b(mutabilityOwnership, this.ownedBy);
        Object[] objArr = this.buffer;
        Object[] objArr2 = b ? objArr : new Object[objArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr.length) {
                break;
            }
            CommonFunctionsKt.m4094assert(i2 <= i);
            if (!trieNode.collisionContainsElement(objArr[i])) {
                objArr2[i2] = objArr[i];
                i2++;
                CommonFunctionsKt.m4094assert(i2 <= objArr2.length);
            }
            i++;
        }
        deltaCounter.plusAssign(this.buffer.length - i2);
        return i2 == 0 ? EMPTY : i2 == 1 ? objArr2[0] : i2 == this.buffer.length ? this : i2 == objArr2.length ? new TrieNode(0, objArr2, mutabilityOwnership) : new TrieNode(0, Arrays.copyOf(objArr2, i2), mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i, MutabilityOwnership mutabilityOwnership) {
        Object[] removeCellAtIndex;
        Object[] removeCellAtIndex2;
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 != mutabilityOwnership) {
            removeCellAtIndex = TrieNodeKt.removeCellAtIndex(objArr, i);
            return new TrieNode<>(0, removeCellAtIndex, mutabilityOwnership);
        }
        removeCellAtIndex2 = TrieNodeKt.removeCellAtIndex(objArr, i);
        this.buffer = removeCellAtIndex2;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        boolean b = q10.b(mutabilityOwnership, this.ownedBy);
        Object[] objArr = this.buffer;
        if (!b) {
            objArr = new Object[Math.min(objArr.length, trieNode.buffer.length)];
        }
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m4094assert(i2 <= i);
            if (trieNode.collisionContainsElement(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m4094assert(i2 <= objArr.length);
            }
            i++;
        }
        deltaCounter.plusAssign(i2);
        return i2 == 0 ? EMPTY : i2 == 1 ? objArr[0] : i2 == this.buffer.length ? this : i2 == trieNode.buffer.length ? trieNode : i2 == objArr.length ? new TrieNode(0, objArr, mutabilityOwnership) : new TrieNode(0, Arrays.copyOf(objArr, i2), mutabilityOwnership);
    }

    private final TrieNode<E> mutableMoveElementToNode(int i, int i2, E e, int i3, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 == mutabilityOwnership) {
            objArr[i] = makeNodeAtIndex(i, i2, e, i3, mutabilityOwnership);
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = makeNodeAtIndex(i, i2, e, i3, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] removeCellAtIndex;
        Object[] removeCellAtIndex2;
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 != mutabilityOwnership) {
            removeCellAtIndex = TrieNodeKt.removeCellAtIndex(objArr, i);
            return new TrieNode<>(this.bitmap ^ i2, removeCellAtIndex, mutabilityOwnership);
        }
        removeCellAtIndex2 = TrieNodeKt.removeCellAtIndex(objArr, i);
        this.buffer = removeCellAtIndex2;
        this.bitmap ^= i2;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final TrieNode<E> mutableUpdateNodeAtIndex(int i, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r0 = trieNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 == mutabilityOwnership) {
            objArr[i] = trieNode;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> nodeAtIndex(int i) {
        Object obj = this.buffer[i];
        obj.getClass();
        return (TrieNode) obj;
    }

    private final TrieNode<E> removeCellAtIndex(int i, int i2) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return new TrieNode<>(this.bitmap ^ i2, removeCellAtIndex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final TrieNode<E> updateNodeAtIndex(int i, TrieNode<E> trieNode) {
        ?? r0 = trieNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf);
    }

    public final TrieNode<E> add(int i, E e, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, e);
        }
        int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime);
            TrieNode<E> collisionAdd = i2 == 30 ? nodeAtIndex.collisionAdd(e) : nodeAtIndex.add(i, e, i2 + 5);
            if (nodeAtIndex != collisionAdd) {
                return updateNodeAtIndex(indexOfCellAt$runtime, collisionAdd);
            }
        } else if (!q10.b(e, obj)) {
            return moveElementToNode(indexOfCellAt$runtime, i, e, i2);
        }
        return this;
    }

    public final boolean contains(int i, E e, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime];
        if (!(obj instanceof TrieNode)) {
            return q10.b(e, obj);
        }
        TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime);
        return i2 == 30 ? nodeAtIndex.collisionContainsElement(e) : nodeAtIndex.contains(i, e, i2 + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(TrieNode<E> trieNode, int i) {
        if (this == trieNode) {
            return true;
        }
        if (i > 30) {
            for (Object obj : trieNode.buffer) {
                if (!ac.L(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i2 = this.bitmap;
        int i3 = trieNode.bitmap;
        int i4 = i2 & i3;
        if (i4 != i3) {
            return false;
        }
        while (i4 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i4);
            int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
            int indexOfCellAt$runtime2 = trieNode.indexOfCellAt$runtime(lowestOneBit);
            Object obj2 = this.buffer[indexOfCellAt$runtime];
            Object obj3 = trieNode.buffer[indexOfCellAt$runtime2];
            boolean z = obj2 instanceof TrieNode;
            boolean z2 = obj3 instanceof TrieNode;
            if (z && z2) {
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, i + 5)) {
                    return false;
                }
            } else if (z) {
                if (!((TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, i + 5)) {
                    return false;
                }
            } else if (z2 || !q10.b(obj2, obj3)) {
                return false;
            }
            i4 ^= lowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final int indexOfCellAt$runtime(int i) {
        return Integer.bitCount(this.bitmap & (i - 1));
    }

    public final TrieNode<E> mutableAdd(int i, E e, int i2, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableAddElementAt(indexSegment, e, persistentHashSetBuilder.getOwnership$runtime());
        }
        int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime);
            TrieNode<E> mutableCollisionAdd = i2 == 30 ? nodeAtIndex.mutableCollisionAdd(e, persistentHashSetBuilder) : nodeAtIndex.mutableAdd(i, e, i2 + 5, persistentHashSetBuilder);
            if (nodeAtIndex != mutableCollisionAdd) {
                return mutableUpdateNodeAtIndex(indexOfCellAt$runtime, mutableCollisionAdd, persistentHashSetBuilder.getOwnership$runtime());
            }
        } else if (!q10.b(e, obj)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableMoveElementToNode(indexOfCellAt$runtime, i, e, i2, persistentHashSetBuilder.getOwnership$runtime());
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TrieNode<E> mutableAddAll(TrieNode<E> trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        Object obj;
        Object[] objArr;
        if (this == trieNode) {
            deltaCounter.setCount(deltaCounter.getCount() + calculateSize());
            return this;
        }
        if (i > 30) {
            return mutableCollisionAddAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime());
        }
        int i2 = this.bitmap;
        int i3 = trieNode.bitmap | i2;
        TrieNode<E> trieNode2 = (i3 == i2 && q10.b(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime())) ? this : new TrieNode<>(i3, new Object[Integer.bitCount(i3)], persistentHashSetBuilder.getOwnership$runtime());
        int i4 = i3;
        int i5 = 0;
        while (i4 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i4);
            int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
            int indexOfCellAt$runtime2 = trieNode.indexOfCellAt$runtime(lowestOneBit);
            Object[] objArr2 = trieNode2.buffer;
            if (hasNoCellAt(lowestOneBit)) {
                obj = trieNode.buffer[indexOfCellAt$runtime2];
            } else {
                boolean hasNoCellAt = trieNode.hasNoCellAt(lowestOneBit);
                Object[] objArr3 = this.buffer;
                if (hasNoCellAt) {
                    obj = objArr3[indexOfCellAt$runtime];
                } else {
                    obj = objArr3[indexOfCellAt$runtime];
                    Object obj2 = trieNode.buffer[indexOfCellAt$runtime2];
                    boolean z = obj instanceof TrieNode;
                    boolean z2 = obj2 instanceof TrieNode;
                    if (z && z2) {
                        obj = ((TrieNode) obj).mutableAddAll((TrieNode) obj2, i + 5, deltaCounter, persistentHashSetBuilder);
                    } else if (z) {
                        TrieNode trieNode3 = (TrieNode) obj;
                        int size = persistentHashSetBuilder.size();
                        obj = trieNode3.mutableAdd(obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.size() == size) {
                            deltaCounter.setCount(deltaCounter.getCount() + 1);
                        }
                    } else if (z2) {
                        TrieNode trieNode4 = (TrieNode) obj2;
                        int size2 = persistentHashSetBuilder.size();
                        obj = trieNode4.mutableAdd(obj != null ? obj.hashCode() : 0, obj, i + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.size() == size2) {
                            deltaCounter.setCount(deltaCounter.getCount() + 1);
                        }
                    } else if (q10.b(obj, obj2)) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    } else {
                        objArr = objArr2;
                        obj = makeNode(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, persistentHashSetBuilder.getOwnership$runtime());
                        objArr[i5] = obj;
                        i5++;
                        i4 ^= lowestOneBit;
                    }
                }
            }
            objArr = objArr2;
            objArr[i5] = obj;
            i5++;
            i4 ^= lowestOneBit;
        }
        return elementsIdentityEquals(trieNode2) ? this : trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
    }

    public final TrieNode<E> mutableRemove(int i, E e, int i2, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime);
            TrieNode<E> mutableCollisionRemove = i2 == 30 ? nodeAtIndex.mutableCollisionRemove(e, persistentHashSetBuilder) : nodeAtIndex.mutableRemove(i, e, i2 + 5, persistentHashSetBuilder);
            return (this.ownedBy == persistentHashSetBuilder.getOwnership$runtime() || nodeAtIndex != mutableCollisionRemove) ? mutableUpdateNodeAtIndex(indexOfCellAt$runtime, mutableCollisionRemove, persistentHashSetBuilder.getOwnership$runtime()) : this;
        }
        if (!q10.b(e, obj)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
        return mutableRemoveCellAtIndex(indexOfCellAt$runtime, indexSegment, persistentHashSetBuilder.getOwnership$runtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mutableRemoveAll(TrieNode<E> trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> trieNode2;
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return EMPTY;
        }
        if (i > 30) {
            return mutableCollisionRemoveAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime());
        }
        int i2 = this.bitmap & trieNode.bitmap;
        if (i2 != 0) {
            if (q10.b(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime())) {
                trieNode2 = this;
            } else {
                int i3 = this.bitmap;
                Object[] objArr = this.buffer;
                trieNode2 = new TrieNode<>(i3, Arrays.copyOf(objArr, objArr.length), persistentHashSetBuilder.getOwnership$runtime());
            }
            int i4 = this.bitmap;
            while (i2 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i2);
                int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
                int indexOfCellAt$runtime2 = trieNode.indexOfCellAt$runtime(lowestOneBit);
                Object obj = this.buffer[indexOfCellAt$runtime];
                Object obj2 = trieNode.buffer[indexOfCellAt$runtime2];
                boolean z = obj instanceof TrieNode;
                boolean z2 = obj2 instanceof TrieNode;
                if (z && z2) {
                    obj = ((TrieNode) obj).mutableRemoveAll((TrieNode) obj2, i + 5, deltaCounter, persistentHashSetBuilder);
                } else if (z) {
                    TrieNode trieNode3 = (TrieNode) obj;
                    int size = persistentHashSetBuilder.size();
                    TrieNode mutableRemove = trieNode3.mutableRemove(obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, persistentHashSetBuilder);
                    if (size != persistentHashSetBuilder.size()) {
                        deltaCounter.plusAssign(1);
                        Object[] objArr2 = mutableRemove.buffer;
                        if (objArr2.length == 1) {
                            obj = objArr2[0];
                        }
                        obj = mutableRemove;
                    }
                } else if (z2) {
                    if (((TrieNode) obj2).contains(obj != null ? obj.hashCode() : 0, obj, i + 5)) {
                        deltaCounter.plusAssign(1);
                        obj = EMPTY;
                    }
                } else if (q10.b(obj, obj2)) {
                    deltaCounter.plusAssign(1);
                    obj = EMPTY;
                }
                if (obj == EMPTY) {
                    i4 ^= lowestOneBit;
                }
                trieNode2.buffer[indexOfCellAt$runtime] = obj;
                i2 ^= lowestOneBit;
            }
            int bitCount = Integer.bitCount(i4);
            if (i4 == 0) {
                return EMPTY;
            }
            if (i4 != this.bitmap) {
                if (bitCount == 1 && i != 0) {
                    Object obj3 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime(i4)];
                    return obj3 instanceof TrieNode ? new TrieNode(i4, new Object[]{obj3}, persistentHashSetBuilder.getOwnership$runtime()) : obj3;
                }
                Object[] objArr3 = new Object[bitCount];
                Object[] objArr4 = trieNode2.buffer;
                int i5 = 0;
                int i6 = 0;
                while (i5 < objArr4.length) {
                    CommonFunctionsKt.m4094assert(i6 <= i5);
                    if (objArr4[i5] != Companion.getEMPTY$runtime()) {
                        objArr3[i6] = objArr4[i5];
                        i6++;
                        CommonFunctionsKt.m4094assert(i6 <= bitCount);
                    }
                    i5++;
                }
                return new TrieNode(i4, objArr3, persistentHashSetBuilder.getOwnership$runtime());
            }
            if (!trieNode2.elementsIdentityEquals(this)) {
                return trieNode2;
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRetainAll(TrieNode<E> trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        if (i > 30) {
            return mutableCollisionRetainAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime());
        }
        int i2 = this.bitmap & trieNode.bitmap;
        if (i2 == 0) {
            return EMPTY;
        }
        TrieNode<E> trieNode2 = (q10.b(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime()) && i2 == this.bitmap) ? this : new TrieNode<>(i2, new Object[Integer.bitCount(i2)], persistentHashSetBuilder.getOwnership$runtime());
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (i3 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i3);
            int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
            int indexOfCellAt$runtime2 = trieNode.indexOfCellAt$runtime(lowestOneBit);
            Object obj = this.buffer[indexOfCellAt$runtime];
            Object obj2 = trieNode.buffer[indexOfCellAt$runtime2];
            boolean z = obj instanceof TrieNode;
            boolean z2 = obj2 instanceof TrieNode;
            if (z && z2) {
                obj = ((TrieNode) obj).mutableRetainAll((TrieNode) obj2, i + 5, deltaCounter, persistentHashSetBuilder);
            } else if (z) {
                if (((TrieNode) obj).contains(obj2 != null ? obj2.hashCode() : 0, obj2, i + 5)) {
                    deltaCounter.plusAssign(1);
                    obj = obj2;
                } else {
                    obj = EMPTY;
                }
            } else if (z2) {
                if (((TrieNode) obj2).contains(obj != null ? obj.hashCode() : 0, obj, i + 5)) {
                    deltaCounter.plusAssign(1);
                } else {
                    obj = EMPTY;
                }
            } else if (q10.b(obj, obj2)) {
                deltaCounter.plusAssign(1);
            } else {
                obj = EMPTY;
            }
            if (obj != EMPTY) {
                i4 |= lowestOneBit;
            }
            trieNode2.buffer[i5] = obj;
            i5++;
            i3 ^= lowestOneBit;
        }
        int bitCount = Integer.bitCount(i4);
        if (i4 == 0) {
            return EMPTY;
        }
        if (i4 == i2) {
            return trieNode2.elementsIdentityEquals(this) ? this : trieNode2.elementsIdentityEquals(trieNode) ? trieNode : trieNode2;
        }
        if (bitCount == 1 && i != 0) {
            Object obj3 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime(i4)];
            return obj3 instanceof TrieNode ? new TrieNode(i4, new Object[]{obj3}, persistentHashSetBuilder.getOwnership$runtime()) : obj3;
        }
        Object[] objArr = new Object[bitCount];
        Object[] objArr2 = trieNode2.buffer;
        int i6 = 0;
        int i7 = 0;
        while (i6 < objArr2.length) {
            CommonFunctionsKt.m4094assert(i7 <= i6);
            if (objArr2[i6] != Companion.getEMPTY$runtime()) {
                objArr[i7] = objArr2[i6];
                i7++;
                CommonFunctionsKt.m4094assert(i7 <= bitCount);
            }
            i6++;
        }
        return new TrieNode(i4, objArr, persistentHashSetBuilder.getOwnership$runtime());
    }

    public final TrieNode<E> remove(int i, E e, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime];
        if (!(obj instanceof TrieNode)) {
            return q10.b(e, obj) ? removeCellAtIndex(indexOfCellAt$runtime, indexSegment) : this;
        }
        TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime);
        TrieNode<E> collisionRemove = i2 == 30 ? nodeAtIndex.collisionRemove(e) : nodeAtIndex.remove(i, e, i2 + 5);
        return nodeAtIndex == collisionRemove ? this : updateNodeAtIndex(indexOfCellAt$runtime, collisionRemove);
    }

    public final void setBitmap(int i) {
        this.bitmap = i;
    }

    public final void setBuffer(Object[] objArr) {
        this.buffer = objArr;
    }

    public final void setOwnedBy(MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
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

    public TrieNode(int i, Object[] objArr) {
        this(i, objArr, null);
    }
}
