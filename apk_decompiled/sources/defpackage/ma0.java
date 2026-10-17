package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ma0 extends e10 {
    public ma0(int i) {
        this.a = i == 0 ? n10.a : new int[i];
    }

    public final void d() {
        int i = this.b;
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        f(i + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        if (i2 != 0) {
            ac.O(iArr, iArr, 1, 0, i2);
        }
        iArr[0] = 0;
        this.b++;
    }

    public final void e(int i) {
        f(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void f(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final void g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            ac.O(iArr, iArr, i, i + 1, i2);
        }
        this.b--;
    }

    public final void h(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (i2 < i) {
            o.m("The end index must be < start index");
        } else if (i2 != i) {
            if (i2 < i3) {
                int[] iArr = this.a;
                ac.O(iArr, iArr, i, i2, i3);
            }
            this.b -= i2 - i;
        }
    }

    public final void i(int i, int i2) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public /* synthetic */ ma0() {
        this(16);
    }
}
