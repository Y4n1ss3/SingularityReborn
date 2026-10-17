package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import defpackage.ac;
import defpackage.o;
import defpackage.p01;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E> {
    public static final int $stable = 8;
    private final PersistentHashSetBuilder<E> builder;
    private int expectedModCount;
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    public PersistentHashSetMutableIterator(PersistentHashSetBuilder<E> persistentHashSetBuilder) {
        super(persistentHashSetBuilder.getNode$runtime());
        this.builder = persistentHashSetBuilder;
        this.expectedModCount = persistentHashSetBuilder.getModCount$runtime();
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

    private final boolean isCollision(TrieNode<?> trieNode) {
        return trieNode.getBitmap() == 0;
    }

    private final void resetPath(int i, TrieNode<?> trieNode, E e, int i2) {
        if (isCollision(trieNode)) {
            int g0 = ac.g0(trieNode.getBuffer(), e);
            CommonFunctionsKt.m4094assert(g0 != -1);
            getPath().get(i2).reset(trieNode.getBuffer(), g0);
            setPathLastIndex(i2);
            return;
        }
        int indexOfCellAt$runtime = trieNode.indexOfCellAt$runtime(1 << TrieNodeKt.indexSegment(i, i2 * 5));
        getPath().get(i2).reset(trieNode.getBuffer(), indexOfCellAt$runtime);
        Object obj = trieNode.getBuffer()[indexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            resetPath(i, (TrieNode) obj, e, i2 + 1);
        } else {
            setPathLastIndex(i2);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public E next() {
        checkForComodification();
        E e = (E) super.next();
        this.lastIteratedElement = e;
        this.nextWasInvoked = true;
        return e;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            E currentElement = currentElement();
            p01.b(this.builder).remove(this.lastIteratedElement);
            resetPath(currentElement != null ? currentElement.hashCode() : 0, this.builder.getNode$runtime(), currentElement, 0);
        } else {
            p01.b(this.builder).remove(this.lastIteratedElement);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime();
    }
}
