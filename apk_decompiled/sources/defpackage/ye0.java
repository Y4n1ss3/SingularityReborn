package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class ye0 implements a30 {
    public static final io0 a = q10.d("kotlin.Array<android.os.Parcelable>", new go0[0]);

    public static Parcelable[] d(d41 d41Var) {
        if (!(d41Var instanceof tk0)) {
            o.c(d41.t(a.a, d41Var));
            return null;
        }
        tk0 tk0Var = (tk0) d41Var;
        Bundle bundle = tk0Var.k;
        String str = tk0Var.m;
        ji a2 = ki0.a(Parcelable.class);
        str.getClass();
        Class cls = a2.d;
        cls.getClass();
        Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) w0.c(bundle, str, cls) : bundle.getParcelableArray(str);
        if (parcelableArray == null) {
            parcelableArray = null;
        }
        if (parcelableArray != null) {
            return parcelableArray;
        }
        y80.A(str);
        throw null;
    }
}
