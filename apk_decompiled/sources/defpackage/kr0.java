package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kr0 implements Cloneable {
    public /* synthetic */ int[] d;
    public /* synthetic */ Object[] e;
    public /* synthetic */ int f;

    public kr0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.d = new int[i4];
        this.e = new Object[i4];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kr0 clone() {
        Object clone = super.clone();
        clone.getClass();
        kr0 kr0Var = (kr0) clone;
        kr0Var.d = (int[]) this.d.clone();
        kr0Var.e = (Object[]) this.e.clone();
        return kr0Var;
    }

    public final void b(int i, Object obj) {
        int e = p10.e(this.d, this.f, i);
        if (e >= 0) {
            this.e[e] = obj;
            return;
        }
        int i2 = ~e;
        int i3 = this.f;
        if (i2 < i3) {
            Object[] objArr = this.e;
            if (objArr[i2] == cq.e) {
                this.d[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.d.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.d = Arrays.copyOf(this.d, i7);
            this.e = Arrays.copyOf(this.e, i7);
        }
        int i8 = this.f;
        if (i8 - i2 != 0) {
            int[] iArr = this.d;
            int i9 = i2 + 1;
            ac.O(iArr, iArr, i9, i2, i8);
            Object[] objArr2 = this.e;
            ac.Q(objArr2, objArr2, i9, i2, this.f);
        }
        this.d[i2] = i;
        this.e[i2] = obj;
        this.f++;
    }

    public final Object c(int i) {
        Object[] objArr = this.e;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.f;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.d[i3]);
            sb.append('=');
            Object c = c(i3);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
