package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class tj0 extends t implements RandomAccess {
    public final Object[] d;
    public final int e;
    public int f;
    public int g;

    public tj0(Object[] objArr, int i) {
        this.d = objArr;
        if (i < 0) {
            o.c(j50.h(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.e = objArr.length;
            this.g = i;
        } else {
            StringBuilder f = kp0.f(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            f.append(objArr.length);
            throw new IllegalArgumentException(f.toString().toString());
        }
    }

    public final void a(int i) {
        if (i < 0) {
            o.c(j50.h(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > size()) {
            StringBuilder f = kp0.f(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            f.append(size());
            throw new IllegalArgumentException(f.toString().toString());
        }
        if (i > 0) {
            int i2 = this.f;
            int i3 = this.e;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.d;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f = i4;
            this.g = size() - i;
        }
    }

    @Override // defpackage.t, java.util.List
    public final Object get(int i) {
        p pVar = t.Companion;
        int size = size();
        pVar.getClass();
        p.a(i, size);
        return this.d[(this.f + i) % this.e];
    }

    @Override // defpackage.t, defpackage.i
    public final int getSize() {
        return this.g;
    }

    @Override // defpackage.t, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new sj0(this);
    }

    @Override // defpackage.i, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i = this.f;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr2 = this.d;
            if (i3 >= size || i >= this.e) {
                break;
            }
            objArr[i3] = objArr2[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = objArr2[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // defpackage.i, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
