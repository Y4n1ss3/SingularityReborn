package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ml implements ao0 {
    public final AtomicReference a;

    public ml(ao0 ao0Var) {
        this.a = new AtomicReference(ao0Var);
    }

    @Override // defpackage.ao0
    public final Iterator iterator() {
        ao0 ao0Var = (ao0) this.a.getAndSet(null);
        if (ao0Var != null) {
            return ao0Var.iterator();
        }
        o.f("This sequence can be consumed only once.");
        return null;
    }
}
