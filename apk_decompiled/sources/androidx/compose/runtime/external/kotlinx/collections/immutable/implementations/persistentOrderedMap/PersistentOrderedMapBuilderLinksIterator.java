package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import defpackage.n20;
import defpackage.o;
import defpackage.p01;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, n20 {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilder<K, V> builder;
    private int expectedModCount;
    private int index;
    private Object lastIteratedKey = EndOfChain.INSTANCE;
    private Object nextKey;
    private boolean nextWasInvoked;

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.nextKey = obj;
        this.builder = persistentOrderedMapBuilder;
        this.expectedModCount = persistentOrderedMapBuilder.getHashMapBuilder$runtime().getModCount$runtime();
    }

    private final void checkForComodification() {
        if (this.builder.getHashMapBuilder$runtime().getModCount$runtime() == this.expectedModCount) {
            return;
        }
        o.a();
    }

    private final void checkHasNext() {
        if (hasNext()) {
            return;
        }
        o.q();
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    public final PersistentOrderedMapBuilder<K, V> getBuilder$runtime() {
        return this.builder;
    }

    public final int getIndex$runtime() {
        return this.index;
    }

    public final Object getLastIteratedKey$runtime() {
        return this.lastIteratedKey;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.builder.size();
    }

    @Override // java.util.Iterator
    public LinkedValue<V> next() {
        checkForComodification();
        checkHasNext();
        this.lastIteratedKey = this.nextKey;
        this.nextWasInvoked = true;
        this.index++;
        LinkedValue<V> linkedValue = this.builder.getHashMapBuilder$runtime().get(this.nextKey);
        if (linkedValue != null) {
            LinkedValue<V> linkedValue2 = linkedValue;
            this.nextKey = linkedValue2.getNext();
            return linkedValue2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        p01.c(this.builder).remove(this.lastIteratedKey);
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$runtime().getModCount$runtime();
        this.index--;
    }

    public final void setIndex$runtime(int i) {
        this.index = i;
    }

    public final void setLastIteratedKey$runtime(Object obj) {
        this.lastIteratedKey = obj;
    }
}
