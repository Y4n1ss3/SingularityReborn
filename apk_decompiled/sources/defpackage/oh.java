package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class oh implements a30 {
    public static final oh a = new oh();
    public static final io0 b = q10.d("kotlin.collections.List<kotlin.CharSequence>", new go0[0]);

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
        str.getClass();
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(str);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
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
        bundle.putCharSequenceArrayList(str, p01.E(list));
    }
}
