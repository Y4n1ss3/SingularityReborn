package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ik0 extends lk0 implements Iterator {
    public jk0 d;
    public jk0 e;
    public final /* synthetic */ int f;

    public ik0(jk0 jk0Var, jk0 jk0Var2, int i) {
        this.f = i;
        this.d = jk0Var2;
        this.e = jk0Var;
    }

    @Override // defpackage.lk0
    public final void a(jk0 jk0Var) {
        jk0 jk0Var2;
        jk0 jk0Var3 = this.d;
        jk0 jk0Var4 = null;
        if (jk0Var3 == jk0Var && jk0Var == this.e) {
            this.e = null;
            this.d = null;
            jk0Var3 = null;
        }
        jk0 jk0Var5 = jk0Var3;
        if (jk0Var3 == jk0Var) {
            switch (this.f) {
                case 0:
                    jk0Var2 = jk0Var3.g;
                    break;
                default:
                    jk0Var2 = jk0Var3.f;
                    break;
            }
            jk0Var5 = jk0Var2;
            this.d = jk0Var5;
        }
        jk0 jk0Var6 = this.e;
        if (jk0Var6 == jk0Var) {
            if (jk0Var6 != jk0Var5 && jk0Var5 != null) {
                jk0Var4 = b(jk0Var6);
            }
            this.e = jk0Var4;
        }
    }

    public final jk0 b(jk0 jk0Var) {
        switch (this.f) {
            case 0:
                return jk0Var.f;
            default:
                return jk0Var.g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        jk0 jk0Var = this.e;
        jk0 jk0Var2 = this.d;
        this.e = (jk0Var == jk0Var2 || jk0Var2 == null) ? null : b(jk0Var);
        return jk0Var;
    }
}
