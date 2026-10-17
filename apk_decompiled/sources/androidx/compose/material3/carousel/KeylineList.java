package androidx.compose.material3.carousel;

import defpackage.d41;
import defpackage.dq;
import defpackage.j10;
import defpackage.k10;
import defpackage.n20;
import defpackage.q10;
import defpackage.ut;
import defpackage.yi;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeylineList implements List<Keyline>, n20 {
    private final /* synthetic */ List<Keyline> $$delegate_0;
    private final int firstFocalIndex;
    private final int firstNonAnchorIndex;
    private final int focalCount;
    private final int lastFocalIndex;
    private final int lastNonAnchorIndex;
    private final int pivotIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KeylineList Empty = new KeylineList(ut.d);

    public KeylineList(List<Keyline> list) {
        int i;
        int i2;
        this.$$delegate_0 = list;
        Iterator<Keyline> it = iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i4 = -1;
                break;
            } else if (it.next().isPivot()) {
                break;
            } else {
                i4++;
            }
        }
        this.pivotIndex = i4;
        Iterator<Keyline> it2 = iterator();
        int i5 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i5 = -1;
                break;
            } else if (!it2.next().isAnchor()) {
                break;
            } else {
                i5++;
            }
        }
        this.firstNonAnchorIndex = i5;
        ListIterator<Keyline> listIterator = listIterator(size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i2 = -1;
                break;
            } else if (!listIterator.previous().isAnchor()) {
                i2 = listIterator.nextIndex();
                break;
            }
        }
        this.lastNonAnchorIndex = i2;
        Iterator<Keyline> it3 = iterator();
        while (true) {
            if (!it3.hasNext()) {
                i3 = -1;
                break;
            } else if (it3.next().isFocal()) {
                break;
            } else {
                i3++;
            }
        }
        this.firstFocalIndex = i3;
        ListIterator<Keyline> listIterator2 = listIterator(size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (listIterator2.previous().isFocal()) {
                i = listIterator2.nextIndex();
                break;
            }
        }
        this.lastFocalIndex = i;
        this.focalCount = (i - this.firstFocalIndex) + 1;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Keyline) {
            return contains((Keyline) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.$$delegate_0.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeylineList)) {
            return false;
        }
        KeylineList keylineList = (KeylineList) obj;
        if (size() != keylineList.size()) {
            return false;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (!q10.b(get(i), keylineList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int firstIndexAfterFocalRangeWithSize(float f) {
        Object obj;
        Iterator it = new k10(this.lastFocalIndex, size() - 1, 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (get(((Number) obj).intValue()).getSize() == f) {
                break;
            }
        }
        Integer num = (Integer) obj;
        return num != null ? num.intValue() : size() - 1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Keyline get(int i) {
        return this.$$delegate_0.get(i);
    }

    public final Keyline getFirstFocal() {
        Keyline keyline = (Keyline) yi.r0(this, this.firstFocalIndex);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int getFirstFocalIndex() {
        return this.firstFocalIndex;
    }

    public final Keyline getFirstNonAnchor() {
        return get(this.firstNonAnchorIndex);
    }

    public final int getFirstNonAnchorIndex() {
        return this.firstNonAnchorIndex;
    }

    public final int getFocalCount() {
        return this.focalCount;
    }

    public final Keyline getKeylineAfter(float f) {
        Keyline keyline;
        int size = size();
        int i = 0;
        while (true) {
            if (i >= size) {
                keyline = null;
                break;
            }
            keyline = get(i);
            if (keyline.getUnadjustedOffset() >= f) {
                break;
            }
            i++;
        }
        Keyline keyline2 = keyline;
        return keyline2 == null ? (Keyline) yi.v0(this) : keyline2;
    }

    public final Keyline getKeylineBefore(float f) {
        int size = size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Keyline keyline = get(size);
                if (keyline.getUnadjustedOffset() < f) {
                    return keyline;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return (Keyline) yi.p0(this);
    }

    public final Keyline getLastFocal() {
        Keyline keyline = (Keyline) yi.r0(this, this.lastFocalIndex);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int getLastFocalIndex() {
        return this.lastFocalIndex;
    }

    public final Keyline getLastNonAnchor() {
        return get(this.lastNonAnchorIndex);
    }

    public final int getLastNonAnchorIndex() {
        return this.lastNonAnchorIndex;
    }

    public final Keyline getPivot() {
        return get(this.pivotIndex);
    }

    public final int getPivotIndex() {
        return this.pivotIndex;
    }

    public int getSize() {
        return this.$$delegate_0.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += get(i2).hashCode() * 31;
        }
        return i;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Keyline) {
            return indexOf((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    public final boolean isFirstFocalItemAtStartOfContainer() {
        return getFirstFocal().getOffset() - (getFirstFocal().getSize() / 2.0f) >= 0.0f && q10.b(getFirstFocal(), getFirstNonAnchor());
    }

    public final boolean isLastFocalItemAtEndOfContainer(float f) {
        return (getLastFocal().getSize() / 2.0f) + getLastFocal().getOffset() <= f && q10.b(getLastFocal(), getLastNonAnchor());
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Keyline> iterator() {
        return this.$$delegate_0.iterator();
    }

    public final int lastIndexBeforeFocalRangeWithSize(float f) {
        Object obj;
        int i = this.firstFocalIndex - 1;
        j10 j10Var = new j10(i, q10.s(i, 0, -1), -1);
        while (true) {
            if (!j10Var.f) {
                obj = null;
                break;
            }
            obj = j10Var.next();
            if (get(((Number) obj).intValue()).getSize() == f) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Keyline) {
            return lastIndexOf((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Keyline> listIterator() {
        return this.$$delegate_0.listIterator();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Keyline remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Keyline removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Keyline removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Keyline> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Keyline set2(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Keyline> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Keyline> subList(int i, int i2) {
        return this.$$delegate_0.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return d41.J(this);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final KeylineList getEmpty() {
            return KeylineList.Empty;
        }

        private Companion() {
        }
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d41.K(this, tArr);
    }

    @Override // java.util.List
    public ListIterator<Keyline> listIterator(int i) {
        return this.$$delegate_0.listIterator(i);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m2873removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m2874removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline set(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Keyline keyline) {
        return this.$$delegate_0.contains(keyline);
    }

    public int indexOf(Keyline keyline) {
        return this.$$delegate_0.indexOf(keyline);
    }

    public int lastIndexOf(Keyline keyline) {
        return this.$$delegate_0.lastIndexOf(keyline);
    }
}
