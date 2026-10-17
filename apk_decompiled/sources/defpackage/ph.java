package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ph implements a30 {
    public static final ph a = new ph();
    public static final io0 b = q10.d("kotlin.CharSequence", new go0[0]);

    public static CharSequence d(d41 d41Var) {
        if (!(d41Var instanceof tk0)) {
            o.c(d41.t(b.a, d41Var));
            return null;
        }
        tk0 tk0Var = (tk0) d41Var;
        Bundle bundle = tk0Var.k;
        String str = tk0Var.m;
        str.getClass();
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence;
        }
        y80.A(str);
        throw null;
    }

    public static void e(uk0 uk0Var, CharSequence charSequence) {
        charSequence.getClass();
        if (!(uk0Var instanceof uk0)) {
            o.c(d41.x(b.a, uk0Var));
            return;
        }
        Bundle bundle = uk0Var.a;
        String str = uk0Var.c;
        str.getClass();
        bundle.putCharSequence(str, charSequence);
    }

    @Override // defpackage.a30
    public final /* bridge */ /* synthetic */ void a(uk0 uk0Var, Object obj) {
        e(uk0Var, (CharSequence) obj);
    }

    @Override // defpackage.a30
    public final /* bridge */ /* synthetic */ Object b(d41 d41Var) {
        return d(d41Var);
    }

    @Override // defpackage.a30
    public final go0 c() {
        return b;
    }
}
