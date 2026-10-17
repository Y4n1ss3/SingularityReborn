package androidx.compose.ui.node;

import java.util.Comparator;
import java.util.TreeSet;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SortedSet<E> extends TreeSet<E> {
    public static final int $stable = 8;

    public SortedSet(Comparator<? super E> comparator) {
        super(comparator);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
