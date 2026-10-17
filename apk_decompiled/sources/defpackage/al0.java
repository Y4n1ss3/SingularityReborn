package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class al0 implements dl0 {
    public final el0 a;
    public boolean b;
    public Bundle c;
    public final ys0 d;

    public al0(el0 el0Var, vu0 vu0Var) {
        el0Var.getClass();
        this.a = el0Var;
        this.d = new ys0(new vj(vu0Var, 1));
    }

    @Override // defpackage.dl0
    public final Bundle a() {
        Bundle g = p10.g((xe0[]) Arrays.copyOf(new xe0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            g.putAll(bundle);
        }
        Iterator it = ((bl0) this.d.getValue()).a.entrySet().iterator();
        if (!it.hasNext()) {
            this.b = false;
            return g;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((vk0) entry.getValue()).getClass();
        throw null;
    }
}
