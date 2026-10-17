package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class wv implements ao0 {
    public final ao0 a;
    public final boolean b;
    public final ky c;

    public wv(ao0 ao0Var, boolean z, ky kyVar) {
        this.a = ao0Var;
        this.b = z;
        this.c = kyVar;
    }

    @Override // defpackage.ao0
    public final Iterator iterator() {
        return new vv(this);
    }
}
