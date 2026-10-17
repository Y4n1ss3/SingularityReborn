package defpackage;

import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class x1 implements w40 {
    public final /* synthetic */ String d;
    public final /* synthetic */ u1 e;
    public final /* synthetic */ v1 f;
    public final /* synthetic */ yj g;

    public x1(yj yjVar, String str, u1 u1Var, v1 v1Var) {
        this.g = yjVar;
        this.d = str;
        this.e = u1Var;
        this.f = v1Var;
    }

    @Override // defpackage.w40
    public final void onStateChanged(y40 y40Var, q40 q40Var) {
        boolean equals = q40.ON_START.equals(q40Var);
        String str = this.d;
        yj yjVar = this.g;
        if (!equals) {
            if (q40.ON_STOP.equals(q40Var)) {
                yjVar.e.remove(str);
                return;
            } else {
                if (q40.ON_DESTROY.equals(q40Var)) {
                    yjVar.d(str);
                    return;
                }
                return;
            }
        }
        HashMap hashMap = yjVar.e;
        Bundle bundle = yjVar.g;
        HashMap hashMap2 = yjVar.f;
        u1 u1Var = this.e;
        hashMap.put(str, new z1(u1Var, this.f));
        if (hashMap2.containsKey(str)) {
            Object obj = hashMap2.get(str);
            hashMap2.remove(str);
            u1Var.a(obj);
        }
        t1 t1Var = (t1) bundle.getParcelable(str);
        if (t1Var != null) {
            bundle.remove(str);
            u1Var.a(new t1(t1Var.d, t1Var.e));
        }
    }
}
