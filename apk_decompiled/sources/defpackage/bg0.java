package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class bg0 implements go0 {
    public final String a;
    public final ag0 b;

    public bg0(String str, ag0 ag0Var) {
        this.a = str;
        this.b = ag0Var;
    }

    @Override // defpackage.go0
    public final String a() {
        return this.a;
    }

    @Override // defpackage.go0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.go0
    public final y80 d() {
        return this.b;
    }

    @Override // defpackage.go0
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg0)) {
            return false;
        }
        bg0 bg0Var = (bg0) obj;
        return this.a.equals(bg0Var.a) && this.b.equals(bg0Var.b);
    }

    @Override // defpackage.go0
    public final String f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.go0
    public final go0 g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.go0
    public final boolean h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return c21.a(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
