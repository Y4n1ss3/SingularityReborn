package androidx.compose.ui.layout;

import defpackage.ab0;
import defpackage.d41;
import defpackage.dq;
import defpackage.dz;
import defpackage.ky;
import defpackage.n20;
import defpackage.ya0;
import defpackage.yd0;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface SubcomposeSlotReusePolicy {
    boolean areCompatible(Object obj, Object obj2);

    void getSlotsToRetain(SlotIdsSet slotIdsSet);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SlotIdsSet implements Collection<Object>, n20 {
        public static final int $stable = 8;
        private final ya0 set;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SlotIdsSet(ya0 ya0Var, int i, dq dqVar) {
            this(ya0Var);
            if ((i & 1) != 0) {
                int i2 = yd0.a;
                ya0Var = new ya0(6);
            }
        }

        @Override // java.util.Collection
        /* renamed from: add$ui, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.set.a(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.b();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.set.c(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.set.c(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final void fastForEach(ky kyVar) {
            ya0 set = getSet();
            Object[] objArr = set.b;
            long[] jArr = set.c;
            int i = set.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                kyVar.invoke(objArr[i]);
                i = i2;
            }
        }

        public final void forEach(ky kyVar) {
            ya0 ya0Var = this.set;
            Object[] objArr = ya0Var.b;
            long[] jArr = ya0Var.c;
            int i = ya0Var.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                kyVar.invoke(objArr[i]);
                i = i2;
            }
        }

        public final ya0 getSet() {
            return this.set;
        }

        public int getSize() {
            return this.set.g;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            ya0 ya0Var = this.set;
            ya0Var.getClass();
            return new dz(new ab0(ya0Var));
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.set.g(obj);
        }

        public final boolean removeAll(ky kyVar) {
            ya0 ya0Var = this.set;
            int i = ya0Var.g;
            Object[] objArr = ya0Var.b;
            long[] jArr = ya0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                if (((Boolean) kyVar.invoke(objArr[i5])).booleanValue()) {
                                    ya0Var.h(i5);
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return i != this.set.g;
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(ky kyVar) {
            ya0 ya0Var = this.set;
            Object[] objArr = ya0Var.b;
            int i = ya0Var.g;
            long[] jArr = ya0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                if (!((Boolean) kyVar.invoke(objArr[i5])).booleanValue()) {
                                    ya0Var.h(i5);
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return i != ya0Var.g;
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return d41.J(this);
        }

        public final void trimToSize(int i) {
            int i2;
            ya0 ya0Var = this.set;
            long[] jArr = ya0Var.c;
            int i3 = ya0Var.d;
            while (i3 != Integer.MAX_VALUE && (i2 = ya0Var.g) > i && i2 != 0) {
                int i4 = (int) (jArr[i3] & 2147483647L);
                ya0Var.h(i3);
                i3 = i4;
            }
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) d41.K(this, tArr);
        }

        public SlotIdsSet(ya0 ya0Var) {
            this.set = ya0Var;
        }

        public SlotIdsSet() {
            this(null, 1, null);
        }

        public static /* synthetic */ void getSet$annotations() {
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return this.set.i(collection);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return this.set.g(collection);
        }
    }
}
