package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import defpackage.o;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T> {
    public static final int $stable = 8;
    private final PersistentVectorBuilder<T> builder;
    private int expectedModCount;
    private int lastIteratedIndex;
    private TrieIterator<? extends T> trieIterator;

    public PersistentVectorMutableIterator(PersistentVectorBuilder<T> persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.size());
        this.builder = persistentVectorBuilder;
        this.expectedModCount = persistentVectorBuilder.getModCount$runtime();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    private final void checkForComodification() {
        if (this.expectedModCount == this.builder.getModCount$runtime()) {
            return;
        }
        o.a();
    }

    private final void checkHasIterated() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    private final void reset() {
        setSize(this.builder.size());
        this.expectedModCount = this.builder.getModCount$runtime();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    private final void setupTrieIterator() {
        Object[] root$runtime = this.builder.getRoot$runtime();
        if (root$runtime == null) {
            this.trieIterator = null;
            return;
        }
        int rootSize = UtilsKt.rootSize(this.builder.size());
        int index = getIndex();
        if (index > rootSize) {
            index = rootSize;
        }
        int rootShift$runtime = (this.builder.getRootShift$runtime() / 5) + 1;
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            this.trieIterator = new TrieIterator<>(root$runtime, index, rootSize, rootShift$runtime);
        } else {
            trieIterator.getClass();
            trieIterator.reset$runtime(root$runtime, index, rootSize, rootShift$runtime);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void add(T t) {
        checkForComodification();
        this.builder.add(getIndex(), t);
        setIndex(getIndex() + 1);
        reset();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        checkHasNext$runtime();
        this.lastIteratedIndex = getIndex();
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            Object[] tail$runtime = this.builder.getTail$runtime();
            int index = getIndex();
            setIndex(index + 1);
            return (T) tail$runtime[index];
        }
        if (trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return trieIterator.next();
        }
        Object[] tail$runtime2 = this.builder.getTail$runtime();
        int index2 = getIndex();
        setIndex(index2 + 1);
        return (T) tail$runtime2[index2 - trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkForComodification();
        checkHasPrevious$runtime();
        this.lastIteratedIndex = getIndex() - 1;
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            Object[] tail$runtime = this.builder.getTail$runtime();
            setIndex(getIndex() - 1);
            return (T) tail$runtime[getIndex()];
        }
        if (getIndex() <= trieIterator.getSize()) {
            setIndex(getIndex() - 1);
            return trieIterator.previous();
        }
        Object[] tail$runtime2 = this.builder.getTail$runtime();
        setIndex(getIndex() - 1);
        return (T) tail$runtime2[getIndex() - trieIterator.getSize()];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public void remove() {
        checkForComodification();
        checkHasIterated();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            setIndex(this.lastIteratedIndex);
        }
        reset();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void set(T t) {
        checkForComodification();
        checkHasIterated();
        this.builder.set(this.lastIteratedIndex, t);
        this.expectedModCount = this.builder.getModCount$runtime();
        setupTrieIterator();
    }
}
