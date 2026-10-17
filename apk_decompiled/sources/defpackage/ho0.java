package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ho0 implements go0, tf {
    public final go0 a;
    public final String b;
    public final Set c;

    public ho0(go0 go0Var) {
        go0Var.getClass();
        this.a = go0Var;
        this.b = go0Var.a() + '?';
        this.c = p01.g(go0Var);
    }

    @Override // defpackage.go0
    public final String a() {
        return this.b;
    }

    @Override // defpackage.tf
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.go0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.go0
    public final y80 d() {
        return this.a.d();
    }

    @Override // defpackage.go0
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ho0) {
            return q10.b(this.a, ((ho0) obj).a);
        }
        return false;
    }

    @Override // defpackage.go0
    public final String f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.go0
    public final go0 g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.go0
    public final boolean h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
