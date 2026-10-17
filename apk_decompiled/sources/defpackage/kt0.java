package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kt0 implements ao0, os {
    public final ao0 a;
    public final int b;

    public kt0(ao0 ao0Var, int i) {
        this.a = ao0Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        o.c(r6.b("count must be non-negative, but was ", i, '.'));
        throw null;
    }

    @Override // defpackage.os
    public final ao0 a(int i) {
        return i >= this.b ? this : new kt0(this.a, i);
    }

    @Override // defpackage.ao0
    public final Iterator iterator() {
        return new q00(this);
    }
}
