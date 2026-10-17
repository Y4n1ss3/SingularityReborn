package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.State;
import java.util.HashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class d2 extends f30 implements ky {
    public final /* synthetic */ w1 d;
    public final /* synthetic */ yj e;
    public final /* synthetic */ String f;
    public final /* synthetic */ y80 g;
    public final /* synthetic */ State h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(w1 w1Var, yj yjVar, String str, y80 y80Var, State state) {
        super(1);
        this.d = w1Var;
        this.e = yjVar;
        this.f = str;
        this.g = y80Var;
        this.h = state;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        b2 b2Var = new b2(this.h, 0);
        yj yjVar = this.e;
        Bundle bundle = yjVar.g;
        String str = this.f;
        yjVar.c(str);
        HashMap hashMap = yjVar.e;
        y80 y80Var = this.g;
        hashMap.put(str, new z1(b2Var, y80Var));
        HashMap hashMap2 = yjVar.f;
        if (hashMap2.containsKey(str)) {
            Object obj2 = hashMap2.get(str);
            hashMap2.remove(str);
            b2Var.a(obj2);
        }
        t1 t1Var = (t1) bundle.getParcelable(str);
        if (t1Var != null) {
            bundle.remove(str);
            b2Var.a(y80Var.H(t1Var.d, t1Var.e));
        }
        y1 y1Var = new y1(yjVar, str, y80Var, 1);
        w1 w1Var = this.d;
        w1Var.a = y1Var;
        return new c2(w1Var, 0);
    }
}
