package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class yc0 implements a30 {
    public final a30 a;
    public final ho0 b;

    public yc0(a30 a30Var) {
        this.a = a30Var;
        this.b = new ho0(a30Var.c());
    }

    @Override // defpackage.a30
    public final void a(uk0 uk0Var, Object obj) {
        if (obj != null) {
            uk0Var.j(this.a, obj);
            return;
        }
        Bundle bundle = uk0Var.a;
        String str = uk0Var.c;
        str.getClass();
        bundle.putString(str, null);
    }

    @Override // defpackage.a30
    public final Object b(d41 d41Var) {
        if (d41Var.o()) {
            return d41Var.q(this.a);
        }
        return null;
    }

    @Override // defpackage.a30
    public final go0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && yc0.class == obj.getClass() && this.a.equals(((yc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
