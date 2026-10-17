package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import defpackage.ac;
import defpackage.d41;
import defpackage.dq;
import defpackage.iy;
import defpackage.n20;
import defpackage.o;
import defpackage.q10;
import defpackage.qa0;
import defpackage.xa0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class HitTestResult implements List<Modifier.Node>, n20 {
    public static final int $stable = 8;
    private xa0 values = new xa0(16);
    private qa0 distanceFromEdgeAndFlags = new qa0(16);
    private int hitDepth = -1;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        throw new java.lang.IndexOutOfBoundsException("Index must be between 0 and size");
     */
    /* renamed from: findBestHitDistance-fn2tFes, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long m6455findBestHitDistancefn2tFes() {
        long DistanceAndFlags$default = HitTestResultKt.DistanceAndFlags$default(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i = this.hitDepth + 1;
        int size = size() - 1;
        if (i > size) {
            return DistanceAndFlags$default;
        }
        while (true) {
            qa0 qa0Var = this.distanceFromEdgeAndFlags;
            if (i < 0) {
                qa0Var.getClass();
                break;
            }
            if (i >= qa0Var.b) {
                break;
            }
            long m6433constructorimpl = DistanceAndFlags.m6433constructorimpl(qa0Var.a[i]);
            if (DistanceAndFlags.m6432compareTo9YPOF3E(m6433constructorimpl, DistanceAndFlags$default) < 0) {
                DistanceAndFlags$default = m6433constructorimpl;
            }
            if ((DistanceAndFlags.m6436getDistanceimpl(DistanceAndFlags$default) >= 0.0f || !DistanceAndFlags.m6439isInLayerimpl(DistanceAndFlags$default)) && i != size) {
                i++;
            }
        }
        return DistanceAndFlags$default;
    }

    private final void removeNodeAtDepth(int i) {
        this.values.l(i);
        qa0 qa0Var = this.distanceFromEdgeAndFlags;
        if (i >= 0) {
            int i2 = qa0Var.b;
            if (i < i2) {
                long[] jArr = qa0Var.a;
                long j = jArr[i];
                if (i != i2 - 1) {
                    ac.P(jArr, jArr, i, i + 1, i2);
                }
                qa0Var.b--;
                return;
            }
        } else {
            qa0Var.getClass();
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and size");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeNodesInRange(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.values.m(i, i2);
        qa0 qa0Var = this.distanceFromEdgeAndFlags;
        if (i >= 0) {
            int i3 = qa0Var.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    o.m("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = qa0Var.a;
                            ac.P(jArr, jArr, i, i2, i3);
                        }
                        qa0Var.b -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            qa0Var.getClass();
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and size");
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.j();
        this.distanceFromEdgeAndFlags.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
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

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node get(int i) {
        Object b = this.values.b(i);
        b.getClass();
        return (Modifier.Node) b;
    }

    public int getSize() {
        return this.values.b;
    }

    public final boolean hasHit() {
        long m6455findBestHitDistancefn2tFes = m6455findBestHitDistancefn2tFes();
        return DistanceAndFlags.m6436getDistanceimpl(m6455findBestHitDistancefn2tFes) < 0.0f && DistanceAndFlags.m6439isInLayerimpl(m6455findBestHitDistancefn2tFes) && !DistanceAndFlags.m6438isInExpandedBoundsimpl(m6455findBestHitDistancefn2tFes);
    }

    public final void hit(Modifier.Node node, boolean z, iy iyVar) {
        long DistanceAndFlags;
        int i = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.g(node);
        qa0 qa0Var = this.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(-1.0f, z, false);
        qa0Var.a(DistanceAndFlags);
        iyVar.invoke();
        this.hitDepth = i;
    }

    public final void hitExpandedTouchBounds(Modifier.Node node, boolean z, iy iyVar) {
        long DistanceAndFlags;
        long DistanceAndFlags2;
        long DistanceAndFlags3;
        if (this.hitDepth == size() - 1) {
            int i = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.g(node);
            qa0 qa0Var = this.distanceFromEdgeAndFlags;
            DistanceAndFlags3 = HitTestResultKt.DistanceAndFlags(0.0f, z, true);
            qa0Var.a(DistanceAndFlags3);
            iyVar.invoke();
            this.hitDepth = i;
            return;
        }
        long m6455findBestHitDistancefn2tFes = m6455findBestHitDistancefn2tFes();
        int i2 = this.hitDepth;
        if (!DistanceAndFlags.m6438isInExpandedBoundsimpl(m6455findBestHitDistancefn2tFes)) {
            if (DistanceAndFlags.m6436getDistanceimpl(m6455findBestHitDistancefn2tFes) > 0.0f) {
                int i3 = this.hitDepth;
                removeNodesInRange(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.g(node);
                qa0 qa0Var2 = this.distanceFromEdgeAndFlags;
                DistanceAndFlags = HitTestResultKt.DistanceAndFlags(0.0f, z, true);
                qa0Var2.a(DistanceAndFlags);
                iyVar.invoke();
                this.hitDepth = i3;
                return;
            }
            return;
        }
        this.hitDepth = size() - 1;
        int i4 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.g(node);
        qa0 qa0Var3 = this.distanceFromEdgeAndFlags;
        DistanceAndFlags2 = HitTestResultKt.DistanceAndFlags(0.0f, z, true);
        qa0Var3.a(DistanceAndFlags2);
        iyVar.invoke();
        this.hitDepth = i4;
        if (DistanceAndFlags.m6436getDistanceimpl(m6455findBestHitDistancefn2tFes()) < 0.0f) {
            removeNodesInRange(i2 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i2;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f, boolean z, iy iyVar) {
        long DistanceAndFlags;
        int i = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.g(node);
        qa0 qa0Var = this.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f, z, false);
        qa0Var.a(DistanceAndFlags);
        iyVar.invoke();
        this.hitDepth = i;
    }

    public int indexOf(Modifier.Node node) {
        int size = size() - 1;
        if (size < 0) {
            return -1;
        }
        int i = 0;
        while (!q10.b(this.values.b(i), node)) {
            if (i == size) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.d();
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f, boolean z) {
        if (this.hitDepth == size() - 1) {
            return true;
        }
        return DistanceAndFlags.m6432compareTo9YPOF3E(m6455findBestHitDistancefn2tFes(), HitTestResultKt.DistanceAndFlags$default(f, z, false, 4, null)) > 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Modifier.Node> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    public int lastIndexOf(Modifier.Node node) {
        int size = size();
        do {
            size--;
            if (-1 >= size) {
                return -1;
            }
        } while (!q10.b(this.values.b(size), node));
        return size;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Modifier.Node removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Modifier.Node removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Modifier.Node set2(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(iy iyVar) {
        int i = this.hitDepth;
        iyVar.invoke();
        this.hitDepth = i;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(Modifier.Node node, float f, boolean z, iy iyVar) {
        long DistanceAndFlags;
        long DistanceAndFlags2;
        if (this.hitDepth == size() - 1) {
            int i = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.g(node);
            qa0 qa0Var = this.distanceFromEdgeAndFlags;
            DistanceAndFlags2 = HitTestResultKt.DistanceAndFlags(f, z, false);
            qa0Var.a(DistanceAndFlags2);
            iyVar.invoke();
            this.hitDepth = i;
            if (this.hitDepth + 1 == size() - 1 || DistanceAndFlags.m6438isInExpandedBoundsimpl(m6455findBestHitDistancefn2tFes())) {
                removeNodeAtDepth(this.hitDepth + 1);
                return;
            }
            return;
        }
        long m6455findBestHitDistancefn2tFes = m6455findBestHitDistancefn2tFes();
        int i2 = this.hitDepth;
        this.hitDepth = size() - 1;
        int i3 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.g(node);
        qa0 qa0Var2 = this.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f, z, false);
        qa0Var2.a(DistanceAndFlags);
        iyVar.invoke();
        this.hitDepth = i3;
        long m6455findBestHitDistancefn2tFes2 = m6455findBestHitDistancefn2tFes();
        if (this.hitDepth + 1 >= size() - 1 || DistanceAndFlags.m6432compareTo9YPOF3E(m6455findBestHitDistancefn2tFes, m6455findBestHitDistancefn2tFes2) <= 0) {
            removeNodesInRange(this.hitDepth + 1, size());
        } else {
            int i4 = i2 + 1;
            boolean m6438isInExpandedBoundsimpl = DistanceAndFlags.m6438isInExpandedBoundsimpl(m6455findBestHitDistancefn2tFes2);
            int i5 = this.hitDepth;
            removeNodesInRange(i4, m6438isInExpandedBoundsimpl ? i5 + 2 : i5 + 1);
        }
        this.hitDepth = i2;
    }

    @Override // java.util.List
    public List<Modifier.Node> subList(int i, int i2) {
        return new SubList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return d41.J(this);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class SubList implements List<Modifier.Node>, n20 {
        private final int maxIndex;
        private final int minIndex;

        public SubList(int i, int i2) {
            this.minIndex = i;
            this.maxIndex = i2;
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addFirst(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addLast(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return contains((Modifier.Node) obj);
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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node get(int i) {
            Object b = HitTestResult.this.values.b(i + this.minIndex);
            b.getClass();
            return (Modifier.Node) b;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        public int indexOf(Modifier.Node node) {
            int i = this.minIndex;
            int i2 = this.maxIndex;
            if (i > i2) {
                return -1;
            }
            while (!q10.b(HitTestResult.this.values.b(i), node)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Modifier.Node> iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i, i, this.maxIndex);
        }

        public int lastIndexOf(Modifier.Node node) {
            int i = this.maxIndex;
            int i2 = this.minIndex;
            if (i2 > i) {
                return -1;
            }
            while (!q10.b(HitTestResult.this.values.b(i), node)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator(int i) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i + i2, i2, this.maxIndex);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Modifier.Node removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Modifier.Node removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public Modifier.Node set2(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<Modifier.Node> subList(int i, int i2) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i3 = this.minIndex;
            return hitTestResult.new SubList(i + i3, i3 + i2);
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
        public /* bridge */ /* synthetic */ void add(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: removeFirst, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m6458removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: removeLast, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m6459removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean add(Modifier.Node node) {
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

        public boolean contains(Modifier.Node node) {
            return indexOf((Object) node) != -1;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return indexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return lastIndexOf((Modifier.Node) obj);
            }
            return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d41.K(this, tArr);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class HitTestResultIterator implements ListIterator<Modifier.Node>, n20 {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i, int i2, int i3, int i4, dq dqVar) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? hitTestResult.size() : i3);
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Modifier.Node next() {
            xa0 xa0Var = HitTestResult.this.values;
            int i = this.index;
            this.index = i + 1;
            Object b = xa0Var.b(i);
            b.getClass();
            return (Modifier.Node) b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.ListIterator
        public Modifier.Node previous() {
            xa0 xa0Var = HitTestResult.this.values;
            int i = this.index - 1;
            this.index = i;
            Object b = xa0Var.b(i);
            b.getClass();
            return (Modifier.Node) b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public HitTestResultIterator(int i, int i2, int i3) {
            this.index = i;
            this.minIndex = i2;
            this.maxIndex = i3;
        }
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m6456removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m6457removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Modifier.Node node) {
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

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator(int i) {
        return new HitTestResultIterator(this, i, 0, 0, 6, null);
    }

    public boolean contains(Modifier.Node node) {
        return indexOf((Object) node) != -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f, boolean z, boolean z2, iy iyVar) {
        long DistanceAndFlags;
        int i = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.g(node);
        qa0 qa0Var = this.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f, z, z2);
        qa0Var.a(DistanceAndFlags);
        iyVar.invoke();
        this.hitDepth = i;
    }
}
