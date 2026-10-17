package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class k50 implements ListIterator, n20 {
    public int e;
    public int g;
    public final x h;
    public final /* synthetic */ int d = 0;
    public int f = -1;

    public k50(m50 m50Var, int i) {
        int i2;
        this.h = m50Var;
        this.e = i;
        i2 = ((AbstractList) m50Var).modCount;
        this.g = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((l50) this.h).h).modCount;
        if (i == this.g) {
            return;
        }
        o.a();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.d;
        x xVar = this.h;
        switch (i3) {
            case 0:
                a();
                l50 l50Var = (l50) xVar;
                int i4 = this.e;
                this.e = i4 + 1;
                l50Var.add(i4, obj);
                this.f = -1;
                i = ((AbstractList) l50Var).modCount;
                this.g = i;
                break;
            default:
                b();
                m50 m50Var = (m50) xVar;
                int i5 = this.e;
                this.e = i5 + 1;
                m50Var.add(i5, obj);
                this.f = -1;
                i2 = ((AbstractList) m50Var).modCount;
                this.g = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((m50) this.h)).modCount;
        if (i == this.g) {
            return;
        }
        o.a();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        x xVar = this.h;
        switch (i) {
            case 0:
                if (this.e < ((l50) xVar).f) {
                    break;
                }
                break;
            default:
                if (this.e < ((m50) xVar).e) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.d) {
            case 0:
                if (this.e > 0) {
                }
                break;
            default:
                if (this.e > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.d;
        x xVar = this.h;
        switch (i) {
            case 0:
                a();
                int i2 = this.e;
                l50 l50Var = (l50) xVar;
                if (i2 >= l50Var.f) {
                    o.q();
                    break;
                } else {
                    this.e = i2 + 1;
                    this.f = i2;
                    break;
                }
            default:
                b();
                int i3 = this.e;
                m50 m50Var = (m50) xVar;
                if (i3 >= m50Var.e) {
                    o.q();
                    break;
                } else {
                    this.e = i3 + 1;
                    this.f = i3;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.d) {
        }
        return this.e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.d;
        x xVar = this.h;
        switch (i) {
            case 0:
                a();
                int i2 = this.e;
                if (i2 <= 0) {
                    o.q();
                    break;
                } else {
                    int i3 = i2 - 1;
                    this.e = i3;
                    this.f = i3;
                    l50 l50Var = (l50) xVar;
                    break;
                }
            default:
                b();
                int i4 = this.e;
                if (i4 <= 0) {
                    o.q();
                    break;
                } else {
                    int i5 = i4 - 1;
                    this.e = i5;
                    this.f = i5;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.d) {
            case 0:
                i = this.e;
                break;
            default:
                i = this.e;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.d;
        x xVar = this.h;
        switch (i3) {
            case 0:
                l50 l50Var = (l50) xVar;
                a();
                int i4 = this.f;
                if (i4 == -1) {
                    o.f("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    l50Var.removeAt(i4);
                    this.e = this.f;
                    this.f = -1;
                    i = ((AbstractList) l50Var).modCount;
                    this.g = i;
                    break;
                }
            default:
                m50 m50Var = (m50) xVar;
                b();
                int i5 = this.f;
                if (i5 == -1) {
                    o.f("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    m50Var.removeAt(i5);
                    this.e = this.f;
                    this.f = -1;
                    i2 = ((AbstractList) m50Var).modCount;
                    this.g = i2;
                    break;
                }
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.d;
        x xVar = this.h;
        switch (i) {
            case 0:
                a();
                int i2 = this.f;
                if (i2 == -1) {
                    o.f("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((l50) xVar).set(i2, obj);
                    break;
                }
            default:
                b();
                int i3 = this.f;
                if (i3 == -1) {
                    o.f("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((m50) xVar).set(i3, obj);
                    break;
                }
        }
    }

    public k50(l50 l50Var, int i) {
        int i2;
        this.h = l50Var;
        this.e = i;
        i2 = ((AbstractList) l50Var).modCount;
        this.g = i2;
    }
}
