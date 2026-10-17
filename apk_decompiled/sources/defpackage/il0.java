package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class il0 implements a30 {
    public static final il0 a = new il0();
    public static final io0 b = q10.d("androidx.savedstate.SavedState", new go0[0]);

    @Override // defpackage.a30
    public final void a(uk0 uk0Var, Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        if (!(uk0Var instanceof uk0)) {
            o.c(d41.x(b.a, uk0Var));
            return;
        }
        boolean b2 = q10.b(uk0Var.c, "");
        Bundle bundle2 = uk0Var.a;
        if (b2) {
            bundle2.putAll(bundle);
            return;
        }
        String str = uk0Var.c;
        str.getClass();
        bundle2.putBundle(str, bundle);
    }

    @Override // defpackage.a30
    public final Object b(d41 d41Var) {
        if (!(d41Var instanceof tk0)) {
            o.c(d41.t(b.a, d41Var));
            return null;
        }
        tk0 tk0Var = (tk0) d41Var;
        boolean b2 = q10.b(tk0Var.m, "");
        Bundle bundle = tk0Var.k;
        return b2 ? bundle : q10.t(tk0Var.m, bundle);
    }

    @Override // defpackage.a30
    public final go0 c() {
        return b;
    }
}
