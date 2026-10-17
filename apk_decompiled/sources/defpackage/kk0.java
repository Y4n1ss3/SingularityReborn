package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kk0 extends lk0 implements Iterator {
    public jk0 d;
    public boolean e = true;
    public final /* synthetic */ kv f;

    public kk0(kv kvVar) {
        this.f = kvVar;
    }

    @Override // defpackage.lk0
    public final void a(jk0 jk0Var) {
        jk0 jk0Var2 = this.d;
        if (jk0Var == jk0Var2) {
            jk0 jk0Var3 = jk0Var2.g;
            this.d = jk0Var3;
            this.e = jk0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e) {
            return this.f.d != null;
        }
        jk0 jk0Var = this.d;
        return (jk0Var == null || jk0Var.f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e) {
            this.e = false;
            jk0 jk0Var = this.f.d;
            this.d = jk0Var;
            return jk0Var;
        }
        jk0 jk0Var2 = this.d;
        jk0 jk0Var3 = jk0Var2 != null ? jk0Var2.f : null;
        this.d = jk0Var3;
        return jk0Var3;
    }
}
