package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class mt {
    public int a = 1;
    public final e90 b;
    public e90 c;
    public e90 d;
    public int e;
    public int f;

    public mt(e90 e90Var) {
        this.b = e90Var;
        this.c = e90Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        c90 b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.g).get(a + b.d) == 0) || this.e == 65039;
    }
}
