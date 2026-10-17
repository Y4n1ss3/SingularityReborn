package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ib0 extends no0 implements t20 {
    public final gb0 e;

    public ib0(gb0 gb0Var) {
        super(gb0Var);
        this.e = gb0Var;
    }

    @Override // defpackage.no0, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.e.d(obj);
    }

    @Override // defpackage.no0, java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        gb0 gb0Var = this.e;
        int i = gb0Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gb0Var.l(it.next());
        }
        return i != gb0Var.d;
    }

    @Override // defpackage.no0, java.util.Set, java.util.Collection
    public final void clear() {
        this.e.f();
    }

    @Override // defpackage.no0, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new dz(this);
    }

    @Override // defpackage.no0, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.e.m(obj);
    }

    @Override // defpackage.no0, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        gb0 gb0Var = this.e;
        int i = gb0Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gb0Var.j(it.next());
        }
        return i != gb0Var.d;
    }

    @Override // defpackage.no0, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        gb0 gb0Var = this.e;
        Object[] objArr = gb0Var.b;
        int i = gb0Var.d;
        long[] jArr = gb0Var.a;
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
                            if (!yi.m0(collection, objArr[i5])) {
                                gb0Var.n(i5);
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
        return i != gb0Var.d;
    }
}
