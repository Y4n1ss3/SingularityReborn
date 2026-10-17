package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import defpackage.o;
import defpackage.p01;
import defpackage.q10;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T> {
    public static final int $stable = 8;
    private final PersistentHashMapBuilder<K, V> builder;
    private int expectedModCount;
    private K lastIteratedKey;
    private boolean nextWasInvoked;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.getNode$runtime(), trieNodeBaseIteratorArr);
        this.builder = persistentHashMapBuilder;
        this.expectedModCount = persistentHashMapBuilder.getModCount$runtime();
    }

    private final void checkForComodification() {
        if (this.builder.getModCount$runtime() == this.expectedModCount) {
            return;
        }
        o.a();
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void resetPath(int i, TrieNode<?, ?> trieNode, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            getPath()[i2].reset(trieNode.getBuffer$runtime(), trieNode.getBuffer$runtime().length, 0);
            while (!q10.b(getPath()[i2].currentKey(), k)) {
                getPath()[i2].moveToNextKey();
            }
            setPathLastIndex(i2);
            return;
        }
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i3);
        if (trieNode.hasEntryAt$runtime(indexSegment)) {
            getPath()[i2].reset(trieNode.getBuffer$runtime(), trieNode.entryCount$runtime() * 2, trieNode.entryKeyIndex$runtime(indexSegment));
            setPathLastIndex(i2);
        } else {
            int nodeIndex$runtime = trieNode.nodeIndex$runtime(indexSegment);
            TrieNode<?, ?> nodeAtIndex$runtime = trieNode.nodeAtIndex$runtime(nodeIndex$runtime);
            getPath()[i2].reset(trieNode.getBuffer$runtime(), trieNode.entryCount$runtime() * 2, nodeIndex$runtime);
            resetPath(i, nodeAtIndex$runtime, k, i2 + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        this.lastIteratedKey = currentKey();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            K currentKey = currentKey();
            p01.c(this.builder).remove(this.lastIteratedKey);
            resetPath(currentKey != null ? currentKey.hashCode() : 0, this.builder.getNode$runtime(), currentKey, 0);
        } else {
            p01.c(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime();
    }

    public final void setValue(K k, V v) {
        if (this.builder.containsKey(k)) {
            if (hasNext()) {
                K currentKey = currentKey();
                this.builder.put(k, v);
                resetPath(currentKey != null ? currentKey.hashCode() : 0, this.builder.getNode$runtime(), currentKey, 0);
            } else {
                this.builder.put(k, v);
            }
            this.expectedModCount = this.builder.getModCount$runtime();
        }
    }
}
