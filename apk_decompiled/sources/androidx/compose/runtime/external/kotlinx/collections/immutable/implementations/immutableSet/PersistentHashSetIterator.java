package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import defpackage.n20;
import defpackage.o;
import defpackage.y80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, n20 {
    public static final int $stable = 8;
    private boolean hasNext;
    private final List<TrieNodeIterator<E>> path;
    private int pathLastIndex;

    public PersistentHashSetIterator(TrieNode<E> trieNode) {
        ArrayList G = y80.G(new TrieNodeIterator());
        this.path = G;
        this.hasNext = true;
        TrieNodeIterator.reset$default((TrieNodeIterator) G.get(0), trieNode.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        ensureNextElementIsReady();
    }

    private final void ensureNextElementIsReady() {
        if (this.path.get(this.pathLastIndex).hasNextElement()) {
            return;
        }
        for (int i = this.pathLastIndex; -1 < i; i--) {
            int moveToNextNodeWithData = moveToNextNodeWithData(i);
            if (moveToNextNodeWithData == -1 && this.path.get(i).hasNextCell()) {
                this.path.get(i).moveToNextCell();
                moveToNextNodeWithData = moveToNextNodeWithData(i);
            }
            if (moveToNextNodeWithData != -1) {
                this.pathLastIndex = moveToNextNodeWithData;
                return;
            }
            if (i > 0) {
                this.path.get(i - 1).moveToNextCell();
            }
            this.path.get(i).reset(TrieNode.Companion.getEMPTY$runtime().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private final int moveToNextNodeWithData(int i) {
        if (this.path.get(i).hasNextElement()) {
            return i;
        }
        if (!this.path.get(i).hasNextNode()) {
            return -1;
        }
        TrieNode<? extends E> currentNode = this.path.get(i).currentNode();
        int i2 = i + 1;
        if (i2 == this.path.size()) {
            this.path.add(new TrieNodeIterator<>());
        }
        TrieNodeIterator.reset$default(this.path.get(i2), currentNode.getBuffer(), 0, 2, null);
        return moveToNextNodeWithData(i2);
    }

    public final E currentElement() {
        CommonFunctionsKt.m4094assert(hasNext());
        return this.path.get(this.pathLastIndex).currentElement();
    }

    public final List<TrieNodeIterator<E>> getPath() {
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
    public E next() {
        if (!this.hasNext) {
            o.q();
            return null;
        }
        E nextElement = this.path.get(this.pathLastIndex).nextElement();
        ensureNextElementIsReady();
        return nextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPathLastIndex(int i) {
        this.pathLastIndex = i;
    }
}
