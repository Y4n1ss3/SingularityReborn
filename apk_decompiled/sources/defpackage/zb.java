package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class zb implements Collection, Set, o20, t20 {
    public int[] d = p10.b;
    public Object[] e = p10.d;
    public int f;

    public final Object a(int i) {
        int i2 = this.f;
        Object[] objArr = this.e;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.d;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                ac.O(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.e;
                ac.Q(objArr2, objArr2, i, i4, i2);
            }
            this.e[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.d = iArr2;
            this.e = new Object[i5];
            if (i > 0) {
                ac.S(iArr, iArr2, 0, i, 6);
                ac.U(objArr, this.e, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                ac.O(iArr, this.d, i, i6, i2);
                ac.Q(objArr, this.e, i, i6, i2);
            }
        }
        if (i2 == this.f) {
            this.f = i3;
            return obj;
        }
        o.a();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int w;
        int i2 = this.f;
        if (obj == null) {
            w = p10.w(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            w = p10.w(this, obj, hashCode);
        }
        if (w >= 0) {
            return false;
        }
        int i3 = ~w;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.e;
            int[] iArr2 = new int[i4];
            this.d = iArr2;
            this.e = new Object[i4];
            if (i2 != this.f) {
                o.a();
                return false;
            }
            if (iArr2.length != 0) {
                ac.S(iArr, iArr2, 0, iArr.length, 6);
                ac.U(objArr, this.e, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.d;
            int i5 = i3 + 1;
            ac.O(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.e;
            ac.Q(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.f;
        if (i2 == i6) {
            int[] iArr4 = this.d;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.e[i3] = obj;
                this.f = i6 + 1;
                return true;
            }
        }
        o.a();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f;
        int i = this.f;
        int[] iArr = this.d;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.e;
            int[] iArr2 = new int[size];
            this.d = iArr2;
            this.e = new Object[size];
            if (i > 0) {
                ac.S(iArr, iArr2, 0, i, 6);
                ac.U(objArr, this.e, 0, this.f, 6);
            }
        }
        if (this.f != i) {
            o.a();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f;
        if (i != 0) {
            this.d = p10.b;
            this.e = p10.d;
            i = 0;
            this.f = 0;
        }
        if (i == 0) {
            return;
        }
        o.a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? p10.w(this, null, 0) : p10.w(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.e[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.d;
        int i = this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ub(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int w = obj == null ? p10.w(this, null, 0) : p10.w(this, obj, obj.hashCode());
        if (w < 0) {
            return false;
        }
        a(w);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.f - 1; -1 < i; i--) {
            if (!yi.m0(collection, this.e[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        ac.Q(this.e, objArr, 0, 0, this.f);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 14);
        sb.append('{');
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.e[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ac.V(this.e, 0, this.f);
    }
}
