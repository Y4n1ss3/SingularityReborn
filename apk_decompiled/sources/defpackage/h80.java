package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class h80 extends j80 implements Iterator, n20 {
    public final /* synthetic */ int h;

    public h80(k80 k80Var, int i) {
        this.h = i;
        this.g = k80Var;
        this.e = -1;
        this.f = k80Var.k;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                b();
                int i = this.d;
                k80 k80Var = (k80) this.g;
                if (i >= k80Var.i) {
                    o.q();
                    break;
                } else {
                    this.d = i + 1;
                    this.e = i;
                    i80 i80Var = new i80(k80Var, i);
                    c();
                    break;
                }
            case 1:
                b();
                int i2 = this.d;
                k80 k80Var2 = (k80) this.g;
                if (i2 >= k80Var2.i) {
                    o.q();
                    break;
                } else {
                    this.d = i2 + 1;
                    this.e = i2;
                    Object obj = k80Var2.d[i2];
                    c();
                    break;
                }
            default:
                b();
                int i3 = this.d;
                k80 k80Var3 = (k80) this.g;
                if (i3 >= k80Var3.i) {
                    o.q();
                    break;
                } else {
                    this.d = i3 + 1;
                    this.e = i3;
                    Object[] objArr = k80Var3.e;
                    objArr.getClass();
                    Object obj2 = objArr[this.e];
                    c();
                    break;
                }
        }
        return null;
    }
}
