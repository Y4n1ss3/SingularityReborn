package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import defpackage.ac;
import defpackage.ky;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {
    public static final int $stable = 8;
    private final Object[] root;
    private final int rootShift;
    private final int size;
    private final Object[] tail;

    public PersistentVector(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i;
        this.rootShift = i2;
        if (!(size() > 32)) {
            PreconditionsKt.throwIllegalArgumentException("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        int size = size() - UtilsKt.rootSize(size());
        int length = objArr2.length;
        CommonFunctionsKt.m4094assert(size <= (length <= 32 ? length : 32));
    }

    private final Object[] bufferFor(int i) {
        if (rootSize() <= i) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i, i2)];
            objArr2.getClass();
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        if (i == 0) {
            Object[] copyOf = indexSegment == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            ac.Q(objArr, copyOf, indexSegment + 1, indexSegment, 31);
            objectRef.setValue(objArr[31]);
            copyOf[indexSegment] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[indexSegment];
        obj2.getClass();
        copyOf2[indexSegment] = insertIntoRoot((Object[]) obj2, i3, i2, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || copyOf2[indexSegment] == null) {
                break;
            }
            Object obj3 = objArr[indexSegment];
            obj3.getClass();
            copyOf2[indexSegment] = insertIntoRoot((Object[]) obj3, i3, 0, objectRef.getValue(), objectRef);
        }
        return copyOf2;
    }

    private final PersistentVector<E> insertIntoTail(Object[] objArr, int i, Object obj) {
        int size = size() - rootSize();
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        Object[] objArr2 = this.tail;
        if (size < 32) {
            ac.Q(objArr2, copyOf, i + 1, i, size);
            copyOf[i] = obj;
            return new PersistentVector<>(objArr, copyOf, size() + 1, this.rootShift);
        }
        Object obj2 = objArr2[31];
        ac.Q(objArr2, copyOf, i + 1, i, size - 1);
        copyOf[i] = obj;
        return pushFilledTail(objArr, copyOf, UtilsKt.presizedBufferWith(obj2));
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i2, i);
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
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[indexSegment] = pullLastBuffer;
        return copyOf;
    }

    private final PersistentList<E> pullLastBufferFromRoot(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i2, i - 1, objectRef);
        pullLastBuffer.getClass();
        Object value = objectRef.getValue();
        value.getClass();
        Object[] objArr2 = (Object[]) value;
        if (pullLastBuffer[1] != null) {
            return new PersistentVector(pullLastBuffer, objArr2, i, i2);
        }
        Object obj = pullLastBuffer[0];
        obj.getClass();
        return new PersistentVector((Object[]) obj, objArr2, i, i2 - 5);
    }

    private final PersistentVector<E> pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.rootShift;
        if (size <= (1 << i)) {
            return new PersistentVector<>(pushTail(objArr, i, objArr2), objArr3, size() + 1, this.rootShift);
        }
        Object[] presizedBufferWith = UtilsKt.presizedBufferWith(objArr);
        int i2 = this.rootShift + 5;
        return new PersistentVector<>(pushTail(presizedBufferWith, i2, objArr2), objArr3, size() + 1, i2);
    }

    private final Object[] pushTail(Object[] objArr, int i, Object[] objArr2) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[indexSegment] = objArr2;
            return copyOf;
        }
        copyOf[indexSegment] = pushTail((Object[]) copyOf[indexSegment], i - 5, objArr2);
        return copyOf;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        if (i == 0) {
            Object[] copyOf = indexSegment == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            ac.Q(objArr, copyOf, indexSegment, indexSegment + 1, 32);
            copyOf[31] = objectRef.getValue();
            objectRef.setValue(objArr[indexSegment]);
            return copyOf;
        }
        int indexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = indexSegment + 1;
        if (i4 <= indexSegment2) {
            while (true) {
                Object obj = copyOf2[indexSegment2];
                obj.getClass();
                copyOf2[indexSegment2] = removeFromRootAt((Object[]) obj, i3, 0, objectRef);
                if (indexSegment2 == i4) {
                    break;
                }
                indexSegment2--;
            }
        }
        Object obj2 = copyOf2[indexSegment];
        obj2.getClass();
        copyOf2[indexSegment] = removeFromRootAt((Object[]) obj2, i3, i2, objectRef);
        return copyOf2;
    }

    private final PersistentList<E> removeFromTailAt(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        CommonFunctionsKt.m4094assert(i3 < size);
        if (size == 1) {
            return pullLastBufferFromRoot(objArr, i, i2);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        int i4 = size - 1;
        if (i3 < i4) {
            ac.Q(this.tail, copyOf, i3, i3 + 1, size);
        }
        copyOf[i4] = null;
        return new PersistentVector(objArr, copyOf, (i + size) - 1, i2);
    }

    private final int rootSize() {
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i, int i2, Object obj) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[indexSegment] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[indexSegment];
        obj2.getClass();
        copyOf[indexSegment] = setInRoot((Object[]) obj2, i - 5, i2, obj);
        return copyOf;
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i, E e) {
        ListImplementation.checkPositionIndex$runtime(i, size());
        if (i == size()) {
            return add((PersistentVector<E>) e);
        }
        int rootSize = rootSize();
        if (i >= rootSize) {
            return insertIntoTail(this.root, i - rootSize, e);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return insertIntoTail(insertIntoRoot(this.root, this.rootShift, i, e, objectRef), 0, objectRef.getValue());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // defpackage.t, java.util.List
    public E get(int i) {
        ListImplementation.checkElementIndex$runtime(i, size());
        return (E) bufferFor(i)[i & 31];
    }

    @Override // defpackage.t, defpackage.i
    public int getSize() {
        return this.size;
    }

    @Override // defpackage.t, java.util.List
    public ListIterator<E> listIterator(int i) {
        ListImplementation.checkPositionIndex$runtime(i, size());
        return new PersistentVectorIterator(this.root, this.tail, i, size(), (this.rootShift / 5) + 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(ky kyVar) {
        PersistentVectorBuilder<E> builder = builder();
        builder.removeAllWithPredicate(kyVar);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int i) {
        ListImplementation.checkElementIndex$runtime(i, size());
        int rootSize = rootSize();
        Object[] objArr = this.root;
        return i >= rootSize ? removeFromTailAt(objArr, rootSize, this.rootShift, i - rootSize) : removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i, new ObjectRef(this.tail[0])), rootSize, this.rootShift, 0);
    }

    @Override // defpackage.t, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int i, E e) {
        ListImplementation.checkElementIndex$runtime(i, size());
        if (rootSize() > i) {
            return new PersistentVector(setInRoot(this.root, this.rootShift, i, e), this.tail, size(), this.rootShift);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        copyOf[i & 31] = e;
        return new PersistentVector(this.root, copyOf, size(), this.rootShift);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E e) {
        int size = size() - rootSize();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.tail, 32);
            copyOf[size] = e;
            return new PersistentVector(this.root, copyOf, size() + 1, this.rootShift);
        }
        return pushFilledTail(this.root, this.tail, UtilsKt.presizedBufferWith(e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentVector<E>) obj);
    }
}
