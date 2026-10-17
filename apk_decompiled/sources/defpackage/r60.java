package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class r60 implements Cloneable {
    public /* synthetic */ boolean d;
    public /* synthetic */ long[] e;
    public /* synthetic */ Object[] f;
    public /* synthetic */ int g;

    public r60(int i) {
        if (i == 0) {
            this.e = p10.c;
            this.f = p10.d;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.e = new long[i5];
        this.f = new Object[i5];
    }

    public final Object a(long j) {
        Object obj;
        int f = p10.f(this.e, this.g, j);
        if (f < 0 || (obj = this.f[f]) == cq.c) {
            return null;
        }
        return obj;
    }

    public final long b(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.g)) {
            o.m(j50.h(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.d) {
            long[] jArr = this.e;
            Object[] objArr = this.f;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != cq.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.d = false;
            this.g = i3;
        }
        return this.e[i];
    }

    public final void c(long j, Object obj) {
        Object obj2 = cq.c;
        int f = p10.f(this.e, this.g, j);
        if (f >= 0) {
            this.f[f] = obj;
            return;
        }
        int i = ~f;
        int i2 = this.g;
        if (i < i2) {
            Object[] objArr = this.f;
            if (objArr[i] == obj2) {
                this.e[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.d) {
            long[] jArr = this.e;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.d = false;
                this.g = i3;
                i = ~p10.f(this.e, i3, j);
            }
        }
        int i5 = this.g;
        if (i5 >= this.e.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.e = Arrays.copyOf(this.e, i9);
            this.f = Arrays.copyOf(this.f, i9);
        }
        int i10 = this.g;
        if (i10 - i != 0) {
            long[] jArr2 = this.e;
            int i11 = i + 1;
            ac.P(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f;
            ac.Q(objArr3, objArr3, i11, i, this.g);
        }
        this.e[i] = j;
        this.f[i] = obj;
        this.g++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        r60 r60Var = (r60) clone;
        r60Var.e = (long[]) this.e.clone();
        r60Var.f = (Object[]) this.f.clone();
        return r60Var;
    }

    public final void d(long j) {
        int f = p10.f(this.e, this.g, j);
        if (f >= 0) {
            Object[] objArr = this.f;
            Object obj = objArr[f];
            Object obj2 = cq.c;
            if (obj != obj2) {
                objArr[f] = obj2;
                this.d = true;
            }
        }
    }

    public final int e() {
        if (this.d) {
            int i = this.g;
            long[] jArr = this.e;
            Object[] objArr = this.f;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != cq.c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.d = false;
            this.g = i2;
        }
        return this.g;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.g)) {
            o.m(j50.h(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.d) {
            long[] jArr = this.e;
            Object[] objArr = this.f;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != cq.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.d = false;
            this.g = i3;
        }
        return this.f[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ r60() {
        this(10);
    }
}
