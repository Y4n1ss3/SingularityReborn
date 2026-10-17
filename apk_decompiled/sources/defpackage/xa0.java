package defpackage;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class xa0 extends cd0 {
    public va0 c;

    public xa0(int i) {
        this.a = i == 0 ? dd0.a : new Object[i];
    }

    public final void g(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void h(cd0 cd0Var) {
        cd0Var.getClass();
        if (cd0Var.d()) {
            return;
        }
        int i = this.b + cd0Var.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        ac.Q(cd0Var.a, this.a, this.b, 0, cd0Var.b);
        this.b += cd0Var.b;
    }

    public final void i(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            n(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void j() {
        ac.X(this.a, 0, this.b, null);
        this.b = 0;
    }

    public final boolean k(Object obj) {
        int c = c(obj);
        if (c < 0) {
            return false;
        }
        l(c);
        return true;
    }

    public final Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            ac.Q(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            o.i(j50.j("Start (", i, ") and end (", i2, ") must be in 0.."), this.b);
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                ac.Q(objArr, objArr, i, i2, i3);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            ac.X(this.a, i5, i4, null);
            this.b = i5;
        }
    }

    public final void n(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        ac.Q(objArr, objArr2, 0, 0, length);
        this.a = objArr2;
    }

    public final void o(int i) {
        StringBuilder f = kp0.f(i, "Index ", " must be in 0..");
        f.append(this.b);
        throw new IndexOutOfBoundsException(f.toString());
    }

    public /* synthetic */ xa0() {
        this(16);
    }
}
