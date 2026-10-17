package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class cd0 {
    public Object[] a;
    public int b;

    public final Object a() {
        if (d()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return this.a[0];
    }

    public final Object b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        f(i);
        throw null;
    }

    public final int c(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final boolean e() {
        return this.b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cd0) {
            cd0 cd0Var = (cd0) obj;
            int i = cd0Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = cd0Var.a;
                k10 W = y80.W(0, i2);
                int i3 = W.d;
                int i4 = W.e;
                if (i3 > i4) {
                    return true;
                }
                while (q10.b(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i) {
        StringBuilder f = kp0.f(i, "Index ", " must be in 0..");
        f.append(this.b - 1);
        throw new IndexOutOfBoundsException(f.toString());
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final String toString() {
        int i = 0;
        bd0 bd0Var = new bd0(this, 0);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i2 = this.b;
        while (true) {
            if (i >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) bd0Var.invoke(obj));
            i++;
        }
        return sb.toString();
    }
}
