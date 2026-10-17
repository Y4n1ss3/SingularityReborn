package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {
    public static final int $stable = 8;
    private final T[] tail;
    private final TrieIterator<T> trieIterator;

    public PersistentVectorIterator(Object[] objArr, T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        this.tail = tArr;
        int rootSize = UtilsKt.rootSize(i2);
        this.trieIterator = new TrieIterator<>(objArr, i > rootSize ? rootSize : i, rootSize, i3);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkHasNext$runtime();
        if (this.trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return this.trieIterator.next();
        }
        T[] tArr = this.tail;
        int index = getIndex();
        setIndex(index + 1);
        return tArr[index - this.trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkHasPrevious$runtime();
        if (getIndex() <= this.trieIterator.getSize()) {
            setIndex(getIndex() - 1);
            return this.trieIterator.previous();
        }
        T[] tArr = this.tail;
        setIndex(getIndex() - 1);
        return tArr[getIndex() - this.trieIterator.getSize()];
    }
}
