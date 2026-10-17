package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import defpackage.n20;
import defpackage.o;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, n20 {
    public static final int $stable = 8;
    private boolean hasNext = true;
    private final TrieNodeBaseIterator<K, V, T>[] path;
    private int pathLastIndex;

    public PersistentHashMapBaseIterator(TrieNode<K, V> trieNode, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        this.path = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].reset(trieNode.getBuffer$runtime(), trieNode.entryCount$runtime() * 2);
        this.pathLastIndex = 0;
        ensureNextEntryIsReady();
    }

    private final void checkHasNext() {
        if (hasNext()) {
            return;
        }
        o.q();
    }

    private final void ensureNextEntryIsReady() {
        if (this.path[this.pathLastIndex].hasNextKey()) {
            return;
        }
        for (int i = this.pathLastIndex; -1 < i; i--) {
            int moveToNextNodeWithData = moveToNextNodeWithData(i);
            if (moveToNextNodeWithData == -1 && this.path[i].hasNextNode()) {
                this.path[i].moveToNextNode();
                moveToNextNodeWithData = moveToNextNodeWithData(i);
            }
            if (moveToNextNodeWithData != -1) {
                this.pathLastIndex = moveToNextNodeWithData;
                return;
            }
            if (i > 0) {
                this.path[i - 1].moveToNextNode();
            }
            this.path[i].reset(TrieNode.Companion.getEMPTY$runtime().getBuffer$runtime(), 0);
        }
        this.hasNext = false;
    }

    private final int moveToNextNodeWithData(int i) {
        if (this.path[i].hasNextKey()) {
            return i;
        }
        if (!this.path[i].hasNextNode()) {
            return -1;
        }
        TrieNode<? extends K, ? extends V> currentNode = this.path[i].currentNode();
        TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr = this.path;
        if (i == 6) {
            trieNodeBaseIteratorArr[i + 1].reset(currentNode.getBuffer$runtime(), currentNode.getBuffer$runtime().length);
        } else {
            trieNodeBaseIteratorArr[i + 1].reset(currentNode.getBuffer$runtime(), currentNode.entryCount$runtime() * 2);
        }
        return moveToNextNodeWithData(i + 1);
    }

    public final K currentKey() {
        checkHasNext();
        return this.path[this.pathLastIndex].currentKey();
    }

    public final TrieNodeBaseIterator<K, V, T>[] getPath() {
        return this.path;
    }

    public final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public T next() {
        checkHasNext();
        T next = this.path[this.pathLastIndex].next();
        ensureNextEntryIsReady();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPathLastIndex(int i) {
        this.pathLastIndex = i;
    }
}
