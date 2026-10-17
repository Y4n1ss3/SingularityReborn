package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import defpackage.a0;
import defpackage.ac;
import defpackage.cq;
import defpackage.ky;
import defpackage.o;
import defpackage.q;
import defpackage.x;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends x implements PersistentList.Builder<E> {
    public static final int $stable = 8;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList<? extends E> vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    public PersistentVectorBuilder(PersistentList<? extends E> persistentList, Object[] objArr, Object[] objArr2, int i) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] bufferFor(int i) {
        if (rootSize() <= i) {
            return this.tail;
        }
        Object[] objArr = this.root;
        objArr.getClass();
        for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i, i2)];
            objArr2.getClass();
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object obj2;
        int indexSegment = UtilsKt.indexSegment(i2, i);
        if (i == 0) {
            objectRef.setValue(objArr[31]);
            Object[] makeMutable = makeMutable(objArr);
            ac.Q(objArr, makeMutable, indexSegment + 1, indexSegment, 31);
            makeMutable[indexSegment] = obj;
            return makeMutable;
        }
        Object[] makeMutable2 = makeMutable(objArr);
        int i3 = i - 5;
        Object obj3 = makeMutable2[indexSegment];
        obj3.getClass();
        makeMutable2[indexSegment] = insertIntoRoot((Object[]) obj3, i3, i2, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj2 = makeMutable2[indexSegment]) == null) {
                break;
            }
            makeMutable2[indexSegment] = insertIntoRoot((Object[]) obj2, i3, 0, objectRef.getValue(), objectRef);
        }
        return makeMutable2;
    }

    private final void insertIntoTail(Object[] objArr, int i, E e) {
        int tailSize = tailSize();
        Object[] makeMutable = makeMutable(this.tail);
        Object[] objArr2 = this.tail;
        if (tailSize >= 32) {
            Object obj = objArr2[31];
            ac.Q(objArr2, makeMutable, i + 1, i, 31);
            makeMutable[i] = e;
            pushFilledTail(objArr, makeMutable, mutableBufferWith(obj));
            return;
        }
        ac.Q(objArr2, makeMutable, i + 1, i, tailSize);
        makeMutable[i] = e;
        this.root = objArr;
        this.tail = makeMutable;
        this.size = size() + 1;
    }

    private final boolean isMutable(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.ownership;
    }

    private final ListIterator<Object[]> leafBufferIterator(int i) {
        Object[] objArr = this.root;
        if (objArr == null) {
            o.f("Invalid root");
            return null;
        }
        int rootSize = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime(i, rootSize);
        int i2 = this.rootShift;
        return i2 == 0 ? new SingleElementListIterator(objArr, i) : new TrieIterator(objArr, i, rootSize, i2 / 5);
    }

    private final Object[] makeMutable(Object[] objArr) {
        if (objArr == null) {
            return mutableBuffer();
        }
        if (isMutable(objArr)) {
            return objArr;
        }
        Object[] mutableBuffer = mutableBuffer();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ac.U(objArr, mutableBuffer, 0, length, 6);
        return mutableBuffer;
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i) {
        if (isMutable(objArr)) {
            ac.Q(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] mutableBuffer = mutableBuffer();
        ac.Q(objArr, mutableBuffer, i, 0, 32 - i);
        return mutableBuffer;
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            PreconditionsKt.throwIllegalArgumentException("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int indexSegment = UtilsKt.indexSegment(i, i2);
        Object obj = objArr[indexSegment];
        obj.getClass();
        Object nullifyAfter = nullifyAfter((Object[]) obj, i, i2 - 5);
        if (indexSegment < 31) {
            int i3 = indexSegment + 1;
            if (objArr[i3] != null) {
                if (isMutable(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] mutableBuffer = mutableBuffer();
                ac.Q(objArr, mutableBuffer, 0, 0, i3);
                objArr = mutableBuffer;
            }
        }
        if (nullifyAfter == objArr[indexSegment]) {
            return objArr;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = nullifyAfter;
        return makeMutable;
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i2 - 1, i);
        if (i == 5) {
            objectRef.setValue(objArr[indexSegment]);
            pullLastBuffer = null;
        } else {
            Object obj = objArr[indexSegment];
            obj.getClass();
            pullLastBuffer = pullLastBuffer((Object[]) obj, i - 5, i2, objectRef);
        }
        if (pullLastBuffer == null && indexSegment == 0) {
            return null;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = pullLastBuffer;
        return makeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i;
            this.rootShift = i2;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        objArr.getClass();
        Object[] pullLastBuffer = pullLastBuffer(objArr, i2, i, objectRef);
        pullLastBuffer.getClass();
        Object value = objectRef.getValue();
        value.getClass();
        this.tail = (Object[]) value;
        this.size = i;
        if (pullLastBuffer[1] == null) {
            this.root = (Object[]) pullLastBuffer[0];
            this.rootShift = i2 - 5;
        } else {
            this.root = pullLastBuffer;
            this.rootShift = i2;
        }
    }

    private final Object[] pushBuffers(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("negative shift");
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] makeMutable = makeMutable(objArr);
        int indexSegment = UtilsKt.indexSegment(i, i2);
        int i3 = i2 - 5;
        makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], i, i3, it);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || !it.hasNext()) {
                break;
            }
            makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], 0, i3, it);
        }
        return makeMutable;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i, Object[][] objArr2) {
        q z = cq.z(objArr2);
        int i2 = i >> 5;
        int i3 = this.rootShift;
        Object[] pushBuffers = i2 < (1 << i3) ? pushBuffers(objArr, i, i3, z) : makeMutable(objArr);
        while (z.hasNext()) {
            this.rootShift += 5;
            pushBuffers = mutableBufferWith(pushBuffers);
            int i4 = this.rootShift;
            pushBuffers(pushBuffers, 1 << i4, i4, z);
        }
        return pushBuffers;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.rootShift;
        if (size > (1 << i)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, i);
        Object[] makeMutable = makeMutable(objArr);
        if (i == 5) {
            makeMutable[indexSegment] = objArr2;
            return makeMutable;
        }
        makeMutable[indexSegment] = pushTail((Object[]) makeMutable[indexSegment], objArr2, i - 5);
        return makeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(ky kyVar, Object[] objArr, int i, int i2, ObjectRef objectRef, List<Object[]> list, List<Object[]> list2) {
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = objectRef.getValue();
        value.getClass();
        Object[] objArr2 = (Object[]) value;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) kyVar.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !list.isEmpty() ? list.remove(list.size() - 1) : mutableBuffer();
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        objectRef.setValue(objArr3);
        if (objArr2 != objectRef.getValue()) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final boolean removeAll(ky kyVar) {
        int tailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(kyVar, tailSize, objectRef) != tailSize;
        }
        ListIterator<Object[]> leafBufferIterator = leafBufferIterator(0);
        int i = 32;
        while (i == 32 && leafBufferIterator.hasNext()) {
            i = removeAll(kyVar, leafBufferIterator.next(), 32, objectRef);
        }
        if (i == 32) {
            CommonFunctionsKt.m4094assert(!leafBufferIterator.hasNext());
            int removeAllFromTail = removeAllFromTail(kyVar, tailSize, objectRef);
            if (removeAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return removeAllFromTail != tailSize;
        }
        int previousIndex = leafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (leafBufferIterator.hasNext()) {
            i2 = recyclableRemoveAll(kyVar, leafBufferIterator.next(), 32, i2, objectRef, arrayList2, arrayList);
        }
        int recyclableRemoveAll = recyclableRemoveAll(kyVar, this.tail, tailSize, i2, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        value.getClass();
        Object[] objArr = (Object[]) value;
        Arrays.fill(objArr, recyclableRemoveAll, 32, (Object) null);
        boolean isEmpty = arrayList.isEmpty();
        Object[] objArr2 = this.root;
        if (isEmpty) {
            objArr2.getClass();
        } else {
            objArr2 = pushBuffers(objArr2, previousIndex, this.rootShift, arrayList.iterator());
        }
        int size = previousIndex + (arrayList.size() << 5);
        this.root = retainFirst(objArr2, size);
        this.tail = objArr;
        this.size = size + recyclableRemoveAll;
        return true;
    }

    private final int removeAllFromTail(ky kyVar, int i, ObjectRef objectRef) {
        int removeAll = removeAll(kyVar, this.tail, i, objectRef);
        if (removeAll == i) {
            CommonFunctionsKt.m4094assert(objectRef.getValue() == this.tail);
            return i;
        }
        Object value = objectRef.getValue();
        value.getClass();
        Object[] objArr = (Object[]) value;
        Arrays.fill(objArr, removeAll, i, (Object) null);
        this.tail = objArr;
        this.size = size() - (i - removeAll);
        return removeAll;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        if (i == 0) {
            Object obj = objArr[indexSegment];
            Object[] makeMutable = makeMutable(objArr);
            ac.Q(objArr, makeMutable, indexSegment, indexSegment + 1, 32);
            makeMutable[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return makeMutable;
        }
        int indexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i) : 31;
        Object[] makeMutable2 = makeMutable(objArr);
        int i3 = i - 5;
        int i4 = indexSegment + 1;
        if (i4 <= indexSegment2) {
            while (true) {
                Object obj2 = makeMutable2[indexSegment2];
                obj2.getClass();
                makeMutable2[indexSegment2] = removeFromRootAt((Object[]) obj2, i3, 0, objectRef);
                if (indexSegment2 == i4) {
                    break;
                }
                indexSegment2--;
            }
        }
        Object obj3 = makeMutable2[indexSegment];
        obj3.getClass();
        makeMutable2[indexSegment] = removeFromRootAt((Object[]) obj3, i3, i2, objectRef);
        return makeMutable2;
    }

    private final Object removeFromTailAt(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        CommonFunctionsKt.m4094assert(i3 < size);
        Object[] objArr2 = this.tail;
        if (size == 1) {
            Object obj = objArr2[0];
            pullLastBufferFromRoot(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] makeMutable = makeMutable(objArr2);
        ac.Q(objArr2, makeMutable, i3, i3 + 1, size);
        makeMutable[size - 1] = null;
        this.root = objArr;
        this.tail = makeMutable;
        this.size = (i + size) - 1;
        this.rootShift = i2;
        return obj2;
    }

    private final Object[] retainFirst(Object[] objArr, int i) {
        if (!((i & 31) == 0)) {
            PreconditionsKt.throwIllegalArgumentException("invalid size");
        }
        if (i == 0) {
            this.rootShift = 0;
            return null;
        }
        int i2 = i - 1;
        while (true) {
            int i3 = this.rootShift;
            if ((i2 >> i3) != 0) {
                return nullifyAfter(objArr, i2, i3);
            }
            this.rootShift = i3 - 5;
            Object[] objArr2 = objArr[0];
            objArr2.getClass();
            objArr = objArr2;
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i, int i2, E e, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        Object[] makeMutable = makeMutable(objArr);
        if (i != 0) {
            Object obj = makeMutable[indexSegment];
            obj.getClass();
            makeMutable[indexSegment] = setInRoot((Object[]) obj, i - 5, i2, e, objectRef);
            return makeMutable;
        }
        if (makeMutable != objArr) {
            ((AbstractList) this).modCount++;
        }
        objectRef.setValue(makeMutable[indexSegment]);
        makeMutable[indexSegment] = e;
        return makeMutable;
    }

    private final Object[] shiftLeafBuffers(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.root == null) {
            o.f("root is null");
            return null;
        }
        ListIterator<Object[]> leafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (leafBufferIterator.previousIndex() != i) {
            Object[] previous = leafBufferIterator.previous();
            ac.Q(previous, objArr2, 0, 32 - i2, 32);
            objArr2 = makeMutableShiftingRight(previous, i2);
            i3--;
            objArr[i3] = objArr2;
        }
        return leafBufferIterator.previous();
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] mutableBuffer;
        if (i3 < 1) {
            PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] makeMutable = makeMutable(objArr);
        objArr2[0] = makeMutable;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ac.Q(makeMutable, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                mutableBuffer = makeMutable;
            } else {
                mutableBuffer = mutableBuffer();
                i3--;
                objArr2[i3] = mutableBuffer;
            }
            int i7 = i2 - i6;
            ac.Q(makeMutable, objArr3, 0, i7, i2);
            ac.Q(makeMutable, mutableBuffer, size + 1, i4, i7);
            objArr3 = mutableBuffer;
        }
        Iterator<? extends E> it = collection.iterator();
        copyToBuffer(makeMutable, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            objArr2[i8] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(objArr3, 0, it);
    }

    private final int tailSize(int i) {
        return i <= 32 ? i : i - UtilsKt.rootSize(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        ListImplementation.checkPositionIndex$runtime(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i >= rootSize) {
            insertIntoTail(this.root, i - rootSize, e);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        objArr.getClass();
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i, e, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        PersistentVectorBuilder<E> persistentVectorBuilder;
        Collection<? extends E> collection2;
        Object[] mutableBuffer;
        ListImplementation.checkPositionIndex$runtime(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (size() - i2)) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m4094assert(i >= rootSize());
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] makeMutable = makeMutable(objArr);
            ac.Q(objArr, makeMutable, size2 + 1, i3, tailSize());
            copyToBuffer(makeMutable, i3, collection.iterator());
            this.tail = makeMutable;
            this.size = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int tailSize = tailSize();
        int tailSize2 = tailSize(collection.size() + size());
        if (i >= rootSize()) {
            mutableBuffer = mutableBuffer();
            persistentVectorBuilder = this;
            collection2 = collection;
            persistentVectorBuilder.splitToBuffers(collection2, i, this.tail, tailSize, objArr2, size, mutableBuffer);
            objArr2 = objArr2;
        } else {
            persistentVectorBuilder = this;
            collection2 = collection;
            Object[] objArr3 = persistentVectorBuilder.tail;
            if (tailSize2 > tailSize) {
                int i4 = tailSize2 - tailSize;
                Object[] makeMutableShiftingRight = persistentVectorBuilder.makeMutableShiftingRight(objArr3, i4);
                persistentVectorBuilder.insertIntoRoot(collection2, i, i4, objArr2, size, makeMutableShiftingRight);
                objArr2 = objArr2;
                mutableBuffer = makeMutableShiftingRight;
            } else {
                mutableBuffer = persistentVectorBuilder.mutableBuffer();
                int i5 = tailSize - tailSize2;
                ac.Q(objArr3, mutableBuffer, 0, i5, tailSize);
                int i6 = 32 - i5;
                Object[] makeMutableShiftingRight2 = persistentVectorBuilder.makeMutableShiftingRight(persistentVectorBuilder.tail, i6);
                int i7 = size - 1;
                objArr2[i7] = makeMutableShiftingRight2;
                persistentVectorBuilder.insertIntoRoot(collection2, i, i6, objArr2, i7, makeMutableShiftingRight2);
                persistentVectorBuilder = persistentVectorBuilder;
                collection2 = collection2;
            }
        }
        persistentVectorBuilder.root = persistentVectorBuilder.pushBuffersIncreasingHeightIfNeeded(persistentVectorBuilder.root, i2, objArr2);
        persistentVectorBuilder.tail = mutableBuffer;
        persistentVectorBuilder.size = collection2.size() + persistentVectorBuilder.size();
        return true;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                persistentVector = objArr2.length == 0 ? UtilsKt.persistentVectorOf() : new SmallPersistentVector(Arrays.copyOf(this.tail, size()));
            } else {
                objArr.getClass();
                persistentVector = new PersistentVector(objArr, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        ListImplementation.checkElementIndex$runtime(i, size());
        return (E) bufferFor(i)[i & 31];
    }

    public final int getModCount$runtime() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] getRoot$runtime() {
        return this.root;
    }

    public final int getRootShift$runtime() {
        return this.rootShift;
    }

    @Override // defpackage.x
    public int getSize() {
        return this.size;
    }

    public final Object[] getTail$runtime() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        ListImplementation.checkPositionIndex$runtime(i, size());
        return new PersistentVectorMutableIterator(this, i);
    }

    public final boolean removeAllWithPredicate(ky kyVar) {
        boolean removeAll = removeAll(kyVar);
        if (removeAll) {
            ((AbstractList) this).modCount++;
        }
        return removeAll;
    }

    @Override // defpackage.x
    public E removeAt(int i) {
        ListImplementation.checkElementIndex$runtime(i, size());
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i >= rootSize) {
            return (E) removeFromTailAt(this.root, rootSize, this.rootShift, i - rootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        objArr.getClass();
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i, objectRef), rootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        ListImplementation.checkElementIndex$runtime(i, size());
        if (rootSize() > i) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.root;
            objArr.getClass();
            this.root = setInRoot(objArr, this.rootShift, i, e, objectRef);
            return (E) objectRef.getValue();
        }
        Object[] makeMutable = makeMutable(this.tail);
        if (makeMutable != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) makeMutable[i2];
        makeMutable[i2] = e;
        this.tail = makeMutable;
        return e2;
    }

    public final void setRootShift$runtime(int i) {
        this.rootShift = i;
    }

    private final int tailSize() {
        return tailSize(size());
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        if (tailSize < 32) {
            Object[] makeMutable = makeMutable(this.tail);
            makeMutable[tailSize] = e;
            this.tail = makeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e));
        }
        return true;
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        Object[] objArr3;
        if (this.root != null) {
            int i4 = i >> 5;
            Object[] shiftLeafBuffers = shiftLeafBuffers(i4, i2, objArr, i3, objArr2);
            int rootSize = i3 - (((rootSize() >> 5) - 1) - i4);
            if (rootSize < i3) {
                Object[] objArr4 = objArr[rootSize];
                objArr4.getClass();
                objArr3 = objArr4;
            } else {
                objArr3 = objArr2;
            }
            splitToBuffers(collection, i, shiftLeafBuffers, 32, objArr, rootSize, objArr3);
            return;
        }
        o.f("root is null");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        return removeAllWithPredicate(new a0(2, collection));
    }

    private final int removeAll(ky kyVar, Object[] objArr, int i, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) kyVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = makeMutable(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        objectRef.setValue(objArr2);
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        Iterator<? extends E> it = collection.iterator();
        if (32 - tailSize >= collection.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), tailSize, it);
            this.size = collection.size() + size();
        } else {
            int size = ((collection.size() + tailSize) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = copyToBuffer(makeMutable(this.tail), tailSize, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = collection.size() + size();
        }
        return true;
    }
}
