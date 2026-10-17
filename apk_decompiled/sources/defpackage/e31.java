package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class e31 {
    public final p31 a;
    public v00[] b;

    public e31() {
        this(new p31((p31) null));
    }

    public final void a() {
        v00[] v00VarArr = this.b;
        if (v00VarArr != null) {
            v00 v00Var = v00VarArr[0];
            v00 v00Var2 = v00VarArr[1];
            p31 p31Var = this.a;
            if (v00Var2 == null) {
                v00Var2 = p31Var.a.g(2);
            }
            if (v00Var == null) {
                v00Var = p31Var.a.g(1);
            }
            g(v00.a(v00Var, v00Var2));
            v00 v00Var3 = this.b[cq.v(16)];
            if (v00Var3 != null) {
                f(v00Var3);
            }
            v00 v00Var4 = this.b[cq.v(32)];
            if (v00Var4 != null) {
                d(v00Var4);
            }
            v00 v00Var5 = this.b[cq.v(64)];
            if (v00Var5 != null) {
                h(v00Var5);
            }
        }
    }

    public abstract p31 b();

    public void c(int i, v00 v00Var) {
        if (this.b == null) {
            this.b = new v00[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[cq.v(i2)] = v00Var;
            }
        }
    }

    public abstract void d(v00 v00Var);

    public abstract void e(v00 v00Var);

    public abstract void f(v00 v00Var);

    public abstract void g(v00 v00Var);

    public abstract void h(v00 v00Var);

    public e31(p31 p31Var) {
        this.a = p31Var;
    }
}
