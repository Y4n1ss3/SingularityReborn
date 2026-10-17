package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SingleElementListIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 8;
    private final E element;

    public SingleElementListIterator(E e, int i) {
        super(i, 1);
        this.element = e;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        checkHasNext$runtime();
        setIndex(getIndex() + 1);
        return this.element;
    }

    @Override // java.util.ListIterator
    public E previous() {
        checkHasPrevious$runtime();
        setIndex(getIndex() - 1);
        return this.element;
    }
}
