package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class l0 {
    public m0[] d;
    public int e;
    public int f;
    public ms0 g;

    public final m0 d() {
        m0 m0Var;
        ms0 ms0Var;
        synchronized (this) {
            try {
                m0[] m0VarArr = this.d;
                if (m0VarArr == null) {
                    m0VarArr = f();
                    this.d = m0VarArr;
                } else if (this.e >= m0VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(m0VarArr, m0VarArr.length * 2);
                    this.d = (m0[]) copyOf;
                    m0VarArr = (m0[]) copyOf;
                }
                int i = this.f;
                do {
                    m0Var = m0VarArr[i];
                    if (m0Var == null) {
                        m0Var = e();
                        m0VarArr[i] = m0Var;
                    }
                    i++;
                    if (i >= m0VarArr.length) {
                        i = 0;
                    }
                } while (!m0Var.a(this));
                this.f = i;
                this.e++;
                ms0Var = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ms0Var != null) {
            ms0Var.v(1);
        }
        return m0Var;
    }

    public abstract m0 e();

    public abstract m0[] f();

    public final void g(m0 m0Var) {
        ms0 ms0Var;
        int i;
        hm[] b;
        synchronized (this) {
            try {
                int i2 = this.e - 1;
                this.e = i2;
                ms0Var = this.g;
                if (i2 == 0) {
                    this.f = 0;
                }
                m0Var.getClass();
                b = m0Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (hm hmVar : b) {
            if (hmVar != null) {
                hmVar.resumeWith(w01.a);
            }
        }
        if (ms0Var != null) {
            ms0Var.v(-1);
        }
    }

    public final ms0 h() {
        ms0 ms0Var;
        synchronized (this) {
            ms0Var = this.g;
            if (ms0Var == null) {
                int i = this.e;
                ms0Var = new ms0(1, Integer.MAX_VALUE, mf.e);
                ms0Var.b(Integer.valueOf(i));
                this.g = ms0Var;
            }
        }
        return ms0Var;
    }
}
