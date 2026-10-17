package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ze0 implements a30 {
    public static final ze0 a = new ze0();
    public static final io0 b = q10.d("kotlin.collections.List<android.os.Parcelable>", new go0[0]);

    @Override // defpackage.a30
    public final go0 c() {
        return b;
    }

    @Override // defpackage.a30
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ArrayList b(d41 d41Var) {
        if (!(d41Var instanceof tk0)) {
            o.c(d41.t(b.a, d41Var));
            return null;
        }
        tk0 tk0Var = (tk0) d41Var;
        Bundle bundle = tk0Var.k;
        String str = tk0Var.m;
        ji a2 = ki0.a(Parcelable.class);
        str.getClass();
        Class cls = a2.d;
        cls.getClass();
        ArrayList d = Build.VERSION.SDK_INT >= 34 ? w0.d(bundle, str, cls) : bundle.getParcelableArrayList(str);
        if (d != null) {
            return d;
        }
        y80.A(str);
        throw null;
    }

    @Override // defpackage.a30
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a(uk0 uk0Var, List list) {
        list.getClass();
        if (!(uk0Var instanceof uk0)) {
            o.c(d41.x(b.a, uk0Var));
            return;
        }
        Bundle bundle = uk0Var.a;
        String str = uk0Var.c;
        str.getClass();
        bundle.putParcelableArrayList(str, p01.E(list));
    }
}
