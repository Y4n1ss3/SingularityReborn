package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class mq implements a30 {
    public static final mq b = new mq();
    public final io0 a = q10.d("android.os.Parcelable", new go0[0]);

    @Override // defpackage.a30
    public final go0 c() {
        return this.a;
    }

    @Override // defpackage.a30
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Parcelable b(d41 d41Var) {
        Object parcelable;
        if (!(d41Var instanceof tk0)) {
            o.c(d41.t(this.a.a, d41Var));
            return null;
        }
        tk0 tk0Var = (tk0) d41Var;
        Bundle bundle = tk0Var.k;
        String str = tk0Var.m;
        ji a = ki0.a(Parcelable.class);
        str.getClass();
        Class cls = a.d;
        cls.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = w0.b(bundle, str, cls);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!cls.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        Parcelable parcelable2 = (Parcelable) parcelable;
        if (parcelable2 != null) {
            return parcelable2;
        }
        y80.A(str);
        throw null;
    }

    @Override // defpackage.a30
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a(uk0 uk0Var, Parcelable parcelable) {
        parcelable.getClass();
        if (!(uk0Var instanceof uk0)) {
            o.c(d41.x(this.a.a, uk0Var));
            return;
        }
        Bundle bundle = uk0Var.a;
        String str = uk0Var.c;
        str.getClass();
        bundle.putParcelable(str, parcelable);
    }
}
