package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class sl implements go0 {
    public final io0 a;
    public final ji b;
    public final String c;

    public sl(io0 io0Var, ji jiVar) {
        this.a = io0Var;
        this.b = jiVar;
        this.c = io0Var.a + '<' + jiVar.b() + '>';
    }

    @Override // defpackage.go0
    public final String a() {
        return this.c;
    }

    @Override // defpackage.go0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.go0
    public final y80 d() {
        return this.a.b;
    }

    @Override // defpackage.go0
    public final int e() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        sl slVar = obj instanceof sl ? (sl) obj : null;
        return slVar != null && this.a.equals(slVar.a) && slVar.b.equals(this.b);
    }

    @Override // defpackage.go0
    public final String f(int i) {
        return this.a.e[i];
    }

    @Override // defpackage.go0
    public final go0 g(int i) {
        return this.a.f[i];
    }

    @Override // defpackage.go0
    public final boolean h(int i) {
        return this.a.h[i];
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
