package defpackage;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class zz implements a30 {
    public static final io0 a = q10.d("android.os.IBinder", new go0[0]);

    public static IBinder d(d41 d41Var) {
        if (!(d41Var instanceof tk0)) {
            o.c(d41.t(a.a, d41Var));
            return null;
        }
        tk0 tk0Var = (tk0) d41Var;
        Bundle bundle = tk0Var.k;
        String str = tk0Var.m;
        str.getClass();
        IBinder binder = bundle.getBinder(str);
        if (binder != null) {
            return binder;
        }
        y80.A(str);
        throw null;
    }
}
