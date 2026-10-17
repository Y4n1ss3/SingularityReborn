package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class r50 implements go0 {
    public final go0 a;

    public r50(go0 go0Var) {
        this.a = go0Var;
    }

    @Override // defpackage.go0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.go0
    public final y80 d() {
        return ls0.n;
    }

    @Override // defpackage.go0
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r50)) {
            return false;
        }
        r50 r50Var = (r50) obj;
        return q10.b(this.a, r50Var.a) && q10.b(a(), r50Var.a());
    }

    @Override // defpackage.go0
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.go0
    public final go0 g(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder f = kp0.f(i, "Illegal index ", ", ");
        f.append(a());
        f.append(" expects only non-negative indices");
        throw new IllegalArgumentException(f.toString().toString());
    }

    @Override // defpackage.go0
    public final boolean h(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder f = kp0.f(i, "Illegal index ", ", ");
        f.append(a());
        f.append(" expects only non-negative indices");
        throw new IllegalArgumentException(f.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
