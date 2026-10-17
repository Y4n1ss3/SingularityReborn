package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class hy {
    public boolean a;
    public final Object b;
    public final Object c;

    public hy(un unVar, boolean z, my myVar) {
        this.a = z;
        this.b = d41.b(-2, 4, mf.d);
        this.c = p01.t(unVar, null, null, new o3(myVar, this, (hm) null, 9), 3);
    }

    public void a() {
        ((of) this.b).b(new CancellationException("onBack cancelled"), true);
        ((rr0) this.c).cancel(null);
    }

    public hy(ck ckVar, vj vjVar) {
        this.b = new Object();
        this.c = new ArrayList();
    }
}
