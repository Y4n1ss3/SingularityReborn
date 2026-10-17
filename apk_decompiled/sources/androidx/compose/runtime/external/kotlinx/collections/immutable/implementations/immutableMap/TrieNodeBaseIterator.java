package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import defpackage.n20;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, n20 {
    public static final int $stable = 8;
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime().getBuffer$runtime();
    private int dataSize;
    private int index;

    public final K currentKey() {
        CommonFunctionsKt.m4094assert(hasNextKey());
        return (K) this.buffer[this.index];
    }

    public final TrieNode<? extends K, ? extends V> currentNode() {
        CommonFunctionsKt.m4094assert(hasNextNode());
        Object obj = this.buffer[this.index];
        obj.getClass();
        return (TrieNode) obj;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }

    public final boolean hasNextKey() {
        return this.index < this.dataSize;
    }

    public final boolean hasNextNode() {
        CommonFunctionsKt.m4094assert(this.index >= this.dataSize);
        return this.index < this.buffer.length;
    }

    public final void moveToNextKey() {
        CommonFunctionsKt.m4094assert(hasNextKey());
        this.index += 2;
    }

    public final void moveToNextNode() {
        CommonFunctionsKt.m4094assert(hasNextNode());
        this.index++;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(Object[] objArr, int i, int i2) {
        this.buffer = objArr;
        this.dataSize = i;
        this.index = i2;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void reset(Object[] objArr, int i) {
        reset(objArr, i, 0);
    }
}
