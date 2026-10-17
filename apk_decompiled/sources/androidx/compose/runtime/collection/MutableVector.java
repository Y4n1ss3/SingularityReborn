package androidx.compose.runtime.collection;

import defpackage.ac;
import defpackage.d41;
import defpackage.k10;
import defpackage.ky;
import defpackage.my;
import defpackage.n20;
import defpackage.ny;
import defpackage.o;
import defpackage.o20;
import defpackage.q10;
import defpackage.tj;
import defpackage.y80;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;
    public T[] content;
    private List<T> list;
    private int size;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class VectorListIterator<T> implements ListIterator<T>, n20 {
        private int index;
        private final List<T> list;

        public VectorListIterator(List<T> list, int i) {
            this.list = list;
            this.index = i;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.list.add(this.index, t);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i = this.index;
            this.index = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.list.set(this.index, t);
        }
    }

    public MutableVector(T[] tArr, int i) {
        this.content = tArr;
        this.size = i;
    }

    public final void add(int i, T t) {
        int i2 = this.size + 1;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        if (i != i3) {
            System.arraycopy(tArr, i, tArr, i + 1, i3 - i);
        }
        tArr[i] = t;
        this.size++;
    }

    public final boolean addAll(int i, Collection<? extends T> collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.size + size;
        if (this.content.length < i3) {
            resizeStorage(i3);
        }
        T[] tArr = this.content;
        int i4 = this.size;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + size, i4 - i);
        }
        for (T t : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                y80.V();
                throw null;
            }
            tArr[i2 + i] = t;
            i2 = i5;
        }
        this.size += size;
        return true;
    }

    public final boolean any(ky kyVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            if (((Boolean) kyVar.invoke(tArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            tArr[i2] = null;
        }
        this.size = 0;
    }

    public final boolean contains(T t) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !q10.b(this.content[i], t); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(MutableVector<T> mutableVector) {
        k10 W = y80.W(0, mutableVector.getSize());
        int i = W.d;
        int i2 = W.e;
        if (i > i2) {
            return true;
        }
        while (contains(mutableVector.content[i])) {
            if (i == i2) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final boolean contentEquals(MutableVector<T> mutableVector) {
        if (mutableVector.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; q10.b(mutableVector.content[i], this.content[i]); i++) {
                if (i != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i) {
        if (this.content.length < i) {
            resizeStorage(i);
        }
    }

    public final T first(ky kyVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            T t = tArr[i];
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                return t;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        o.j();
        return null;
    }

    public final T firstOrNull(ky kyVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            T t = tArr[i];
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public final <R> R fold(R r, my myVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            r = (R) myVar.invoke(r, tArr[i]);
        }
        return r;
    }

    public final <R> R foldIndexed(R r, ny nyVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            r = (R) nyVar.invoke(Integer.valueOf(i), r, tArr[i]);
        }
        return r;
    }

    public final <R> R foldRight(R r, my myVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return r;
        }
        while (size >= 0) {
            r = (R) myVar.invoke(tArr[size], r);
            size--;
        }
        return r;
    }

    public final <R> R foldRightIndexed(R r, ny nyVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return r;
        }
        while (size >= 0) {
            r = (R) nyVar.invoke(Integer.valueOf(size), tArr[size], r);
            size--;
        }
        return r;
    }

    public final void forEach(ky kyVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            kyVar.invoke(tArr[i]);
        }
    }

    public final void forEachIndexed(my myVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            myVar.invoke(Integer.valueOf(i), tArr[i]);
        }
    }

    public final void forEachReversed(ky kyVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            kyVar.invoke(tArr[size]);
            size--;
        }
    }

    public final void forEachReversedIndexed(my myVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            myVar.invoke(Integer.valueOf(size), tArr[size]);
            size--;
        }
    }

    public final T get(int i) {
        return this.content[i];
    }

    public final T[] getContent() {
        return this.content;
    }

    public final k10 getIndices() {
        return y80.W(0, getSize());
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T t) {
        T[] tArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (q10.b(t, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(ky kyVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            if (((Boolean) kyVar.invoke(tArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public final int indexOfLast(ky kyVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return -1;
        }
        while (size >= 0) {
            if (((Boolean) kyVar.invoke(tArr[size])).booleanValue()) {
                return size;
            }
            size--;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final T last(ky kyVar) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            T t = tArr[size];
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                return t;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        o.j();
        return null;
    }

    public final int lastIndexOf(T t) {
        T[] tArr = this.content;
        for (int i = this.size - 1; i >= 0; i--) {
            if (q10.b(t, tArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public final T lastOrNull(ky kyVar) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            T t = tArr[size];
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public final <R> R[] map(ky kyVar) {
        getSize();
        q10.G();
        throw null;
    }

    public final <R> R[] mapIndexed(my myVar) {
        getSize();
        q10.G();
        throw null;
    }

    public final <R> MutableVector<R> mapIndexedNotNull(my myVar) {
        getSize();
        q10.G();
        throw null;
    }

    public final <R> MutableVector<R> mapNotNull(ky kyVar) {
        getSize();
        q10.G();
        throw null;
    }

    public final void minusAssign(T t) {
        remove(t);
    }

    public final void plusAssign(T t) {
        add(t);
    }

    public final boolean remove(T t) {
        int indexOf = indexOf(t);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.size;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.size;
    }

    public final T removeAt(int i) {
        T[] tArr = this.content;
        T t = tArr[i];
        if (i != getSize() - 1) {
            int i2 = i + 1;
            System.arraycopy(tArr, i2, tArr, i, this.size - i2);
        }
        int i3 = this.size - 1;
        this.size = i3;
        tArr[i3] = null;
        return t;
    }

    public final void removeIf(ky kyVar) {
        int size = getSize();
        int i = 0;
        int i2 = 0;
        while (true) {
            T[] tArr = this.content;
            if (i >= size) {
                int i3 = size - i2;
                ac.X(tArr, i3, size, null);
                setSize(i3);
                return;
            } else {
                if (((Boolean) kyVar.invoke(tArr[i])).booleanValue()) {
                    i2++;
                } else if (i2 > 0) {
                    T[] tArr2 = this.content;
                    tArr2[i - i2] = tArr2[i];
                }
                i++;
            }
        }
    }

    public final void removeRange(int i, int i2) {
        if (i2 > i) {
            int i3 = this.size;
            if (i2 < i3) {
                T[] tArr = this.content;
                System.arraycopy(tArr, i2, tArr, i, i3 - i2);
            }
            int i4 = this.size - (i2 - i);
            int size = getSize() - 1;
            if (i4 <= size) {
                int i5 = i4;
                while (true) {
                    this.content[i5] = null;
                    if (i5 == size) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.size = i4;
        }
    }

    public final void resizeStorage(int i) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    public final boolean retainAll(Collection<? extends T> collection) {
        int i = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!collection.contains(this.content[size])) {
                removeAt(size);
            }
        }
        return i != this.size;
    }

    public final boolean reversedAny(ky kyVar) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (((Boolean) kyVar.invoke(tArr[size])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final T set(int i, T t) {
        T[] tArr = this.content;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void sortWith(Comparator<T> comparator) {
        T[] tArr = this.content;
        int i = this.size;
        tArr.getClass();
        comparator.getClass();
        Arrays.sort(tArr, 0, i, comparator);
    }

    public final int sumBy(ky kyVar) {
        T[] tArr = this.content;
        int i = 0;
        for (int i2 = 0; i2 < getSize(); i2++) {
            i += ((Number) kyVar.invoke(tArr[i2])).intValue();
        }
        return i;
    }

    public final Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new tj();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class MutableVectorList<T> implements List<T>, o20 {
        private final MutableVector<T> vector;

        public MutableVectorList(MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            return this.vector.add(t);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            return this.vector.addAll(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.vector.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.content[i];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.vector.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.vector.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.vector.removeAll(collection);
        }

        public T removeAt(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.vector.retainAll(collection);
        }

        @Override // java.util.List
        public T set(int i, T t) {
            MutableVectorKt.checkIndex(this, i);
            return this.vector.set(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            MutableVectorKt.checkSubIndex(this, i, i2);
            return new SubList(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return d41.J(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) d41.K(this, tArr);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.vector.add(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            return this.vector.addAll(collection);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SubList<T> implements List<T>, o20 {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i, int i2) {
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.list.add(i + this.start, t);
            this.end++;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            this.list.addAll(i + this.start, collection);
            int size = collection.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (q10.b(this.list.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i) {
            MutableVectorKt.checkIndex(this, i);
            return this.list.get(i + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (q10.b(this.list.get(i2), obj)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 > i) {
                return -1;
            }
            while (!q10.b(this.list.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (q10.b(this.list.get(i2), obj)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i = this.end;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.end;
        }

        public T removeAt(int i) {
            MutableVectorKt.checkIndex(this, i);
            this.end--;
            return this.list.remove(i + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.end;
        }

        @Override // java.util.List
        public T set(int i, T t) {
            MutableVectorKt.checkIndex(this, i);
            return this.list.set(i + this.start, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            MutableVectorKt.checkSubIndex(this, i, i2);
            return new SubList(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return d41.J(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) d41.K(this, tArr);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            this.list.addAll(this.end, collection);
            int size = collection.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }
    }

    public final Void throwNoSuchElementException(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public final T firstOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[0];
    }

    public final T lastOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[getSize() - 1];
    }

    public final boolean add(T t) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        tArr[i2] = t;
        this.size = i2 + 1;
        return true;
    }

    public final boolean containsAll(Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(List<? extends T> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!contains(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final T first() {
        if (getSize() != 0) {
            return this.content[0];
        }
        throwNoSuchElementException("MutableVector is empty.");
        o.j();
        return null;
    }

    public final boolean removeAll(MutableVector<T> mutableVector) {
        int i = this.size;
        int size = mutableVector.getSize() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                remove(mutableVector.content[i2]);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return i != this.size;
    }

    public final T last() {
        if (getSize() != 0) {
            return this.content[getSize() - 1];
        }
        throwNoSuchElementException("MutableVector is empty.");
        o.j();
        return null;
    }

    public final boolean removeAll(List<? extends T> list) {
        int i = this.size;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(list.get(i2));
        }
        return i != this.size;
    }

    public final boolean addAll(int i, MutableVector<T> mutableVector) {
        int i2 = mutableVector.size;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.size + i2;
        if (this.content.length < i3) {
            resizeStorage(i3);
        }
        T[] tArr = this.content;
        int i4 = this.size;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + i2, i4 - i);
        }
        System.arraycopy(mutableVector.content, 0, tArr, i, i2);
        this.size += i2;
        return true;
    }

    public final boolean addAll(List<? extends T> list) {
        return addAll(getSize(), (List) list);
    }

    public final boolean addAll(MutableVector<T> mutableVector) {
        return addAll(getSize(), mutableVector);
    }

    public final boolean addAll(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return false;
        }
        int i = this.size + length;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        System.arraycopy(tArr, 0, this.content, this.size, length);
        this.size += length;
        return true;
    }

    public final boolean addAll(int i, List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i2 = this.size + size;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        if (i != i3) {
            System.arraycopy(tArr, i, tArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            tArr[i + i4] = list.get(i4);
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.size, collection);
    }
}
