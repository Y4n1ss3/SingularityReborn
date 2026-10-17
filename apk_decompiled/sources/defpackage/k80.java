package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class k80 implements Map, Serializable, q20 {
    public static final k80 q;
    public Object[] d;
    public Object[] e;
    public int[] f;
    public int[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public l80 m;
    public m80 n;
    public l80 o;
    public boolean p;

    static {
        k80 k80Var = new k80(0);
        k80Var.p = true;
        q = k80Var;
    }

    public k80(int i) {
        if (i < 0) {
            o.m("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.d = objArr;
        this.e = null;
        this.f = iArr;
        this.g = new int[highestOneBit];
        this.h = 2;
        this.i = 0;
        this.j = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int h = h(obj);
            int i = this.h * 2;
            int length = this.g.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                int i3 = iArr[h];
                if (i3 <= 0) {
                    int i4 = this.i;
                    Object[] objArr = this.d;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.i = i5;
                        objArr[i4] = obj;
                        this.f[i4] = h;
                        iArr[h] = i5;
                        this.l++;
                        this.k++;
                        if (i2 > this.h) {
                            this.h = i2;
                        }
                        return i4;
                    }
                    e(1);
                } else {
                    if (q10.b(this.d[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        i(this.g.length * 2);
                        break;
                    }
                    h = h == 0 ? this.g.length - 1 : h - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.p) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.i;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.d;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.g[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        p10.J(this.d, i3, i);
        if (objArr != null) {
            p10.J(objArr, i3, this.i);
        }
        this.i = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.i - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.g[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        p10.J(this.d, 0, this.i);
        Object[] objArr = this.e;
        if (objArr != null) {
            p10.J(objArr, 0, this.i);
        }
        this.l = 0;
        this.i = 0;
        this.k++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        boolean b;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = f(entry.getKey());
                    if (f < 0) {
                        b = false;
                    } else {
                        Object[] objArr = this.e;
                        objArr.getClass();
                        b = q10.b(objArr[f], entry.getValue());
                    }
                    if (!b) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        Object[] objArr = this.d;
        int length = objArr.length;
        int i2 = this.i;
        int i3 = length - i2;
        int i4 = i2 - this.l;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            p pVar = t.Companion;
            int length2 = objArr.length;
            pVar.getClass();
            int d = p.d(length2, i5);
            Object[] objArr2 = this.d;
            objArr2.getClass();
            this.d = Arrays.copyOf(objArr2, d);
            Object[] objArr3 = this.e;
            this.e = objArr3 != null ? Arrays.copyOf(objArr3, d) : null;
            this.f = Arrays.copyOf(this.f, d);
            int highestOneBit = Integer.highestOneBit((d >= 1 ? d : 1) * 3);
            if (highestOneBit > this.g.length) {
                i(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        l80 l80Var = this.o;
        if (l80Var != null) {
            return l80Var;
        }
        l80 l80Var2 = new l80(this, 0);
        this.o = l80Var2;
        return l80Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.l == map.size() && d(map.entrySet());
    }

    public final int f(Object obj) {
        int h = h(obj);
        int i = this.h;
        while (true) {
            int i2 = this.g[h];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (q10.b(this.d[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            h = h == 0 ? this.g.length - 1 : h - 1;
        }
    }

    public final int g(Object obj) {
        int i = this.i;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f[i] >= 0) {
                Object[] objArr = this.e;
                objArr.getClass();
                if (q10.b(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int f = f(obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.e;
        objArr.getClass();
        return objArr[f];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.j;
    }

    @Override // java.util.Map
    public final int hashCode() {
        h80 h80Var = new h80(this, 0);
        int i = 0;
        while (h80Var.hasNext()) {
            int i2 = h80Var.d;
            k80 k80Var = (k80) h80Var.g;
            if (i2 >= k80Var.i) {
                o.q();
                return 0;
            }
            h80Var.d = i2 + 1;
            h80Var.e = i2;
            Object obj = k80Var.d[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = k80Var.e;
            objArr.getClass();
            Object obj2 = objArr[h80Var.e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            h80Var.c();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i) {
        this.k++;
        int i2 = 0;
        if (this.i > this.l) {
            c(false);
        }
        this.g = new int[i];
        this.j = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.i) {
            int i3 = i2 + 1;
            int h = h(this.d[i2]);
            int i4 = this.h;
            while (true) {
                int[] iArr = this.g;
                if (iArr[h] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    o.f("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                h = h == 0 ? iArr.length - 1 : h - 1;
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.l == 0;
    }

    public final void j(int i) {
        Object[] objArr = this.d;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.e;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.f[i];
        int i3 = this.h * 2;
        int length = this.g.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.g.length - 1 : i2 - 1;
            i5++;
            int i7 = this.h;
            int[] iArr = this.g;
            if (i5 > i7) {
                iArr[i6] = 0;
                break;
            }
            int i8 = iArr[i2];
            if (i8 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i8 < 0) {
                iArr[i6] = -1;
                i6 = i2;
                i5 = 0;
            } else {
                int i9 = i8 - 1;
                int h = h(this.d[i9]) - i2;
                int[] iArr2 = this.g;
                if ((h & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i8;
                    this.f[i9] = i6;
                    i6 = i2;
                    i5 = 0;
                }
                iArr = iArr2;
            }
            i4--;
            if (i4 < 0) {
                iArr[i6] = -1;
                break;
            }
        }
        this.f[i] = -1;
        this.l--;
        this.k++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        l80 l80Var = this.m;
        if (l80Var != null) {
            return l80Var;
        }
        l80 l80Var2 = new l80(this, 1);
        this.m = l80Var2;
        return l80Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a = a(obj);
        Object[] objArr = this.e;
        if (objArr == null) {
            int length = this.d.length;
            if (length < 0) {
                o.m("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.e = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i = (-a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        e(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.e;
            if (objArr == null) {
                int length = this.d.length;
                if (length < 0) {
                    o.m("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.e = objArr;
                }
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!q10.b(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int f = f(obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.e;
        objArr.getClass();
        Object obj2 = objArr[f];
        j(f);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.l * 3) + 2);
        sb.append("{");
        int i = 0;
        h80 h80Var = new h80(this, 0);
        while (h80Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = h80Var.d;
            k80 k80Var = (k80) h80Var.g;
            if (i2 >= k80Var.i) {
                o.q();
                return null;
            }
            h80Var.d = i2 + 1;
            h80Var.e = i2;
            Object obj = k80Var.d[i2];
            if (obj == k80Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = k80Var.e;
            objArr.getClass();
            Object obj2 = objArr[h80Var.e];
            if (obj2 == k80Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            h80Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        m80 m80Var = this.n;
        if (m80Var != null) {
            return m80Var;
        }
        m80 m80Var2 = new m80(this);
        this.n = m80Var2;
        return m80Var2;
    }
}
