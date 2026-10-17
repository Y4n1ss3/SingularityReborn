package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TrieNodeIterator<E> {
    public static final int $stable = 8;
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime().getBuffer();
    private int index;

    public static /* synthetic */ void reset$default(TrieNodeIterator trieNodeIterator, Object[] objArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        trieNodeIterator.reset(objArr, i);
    }

    public final E currentElement() {
        CommonFunctionsKt.m4094assert(hasNextElement());
        return (E) this.buffer[this.index];
    }

    public final TrieNode<? extends E> currentNode() {
        CommonFunctionsKt.m4094assert(hasNextNode());
        Object obj = this.buffer[this.index];
        obj.getClass();
        return (TrieNode) obj;
    }

    public final boolean hasNextCell() {
        return this.index < this.buffer.length;
    }

    public final boolean hasNextElement() {
        return hasNextCell() && !(this.buffer[this.index] instanceof TrieNode);
    }

    public final boolean hasNextNode() {
        return hasNextCell() && (this.buffer[this.index] instanceof TrieNode);
    }

    public final void moveToNextCell() {
        CommonFunctionsKt.m4094assert(hasNextCell());
        this.index++;
    }

    public final E nextElement() {
        CommonFunctionsKt.m4094assert(hasNextElement());
        Object[] objArr = this.buffer;
        int i = this.index;
        this.index = i + 1;
        return (E) objArr[i];
    }

    public final void reset(Object[] objArr, int i) {
        this.buffer = objArr;
        this.index = i;
    }
}
