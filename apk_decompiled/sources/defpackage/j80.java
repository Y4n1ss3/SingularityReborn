package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class j80 {
    public int d;
    public int e;
    public int f;
    public Object g;

    public j80() {
        if (zk0.e == null) {
            zk0.e = new zk0(9);
        }
    }

    public int a(int i) {
        if (i < this.f) {
            return ((ByteBuffer) this.g).getShort(this.e + i);
        }
        return 0;
    }

    public void b() {
        if (((k80) this.g).k == this.f) {
            return;
        }
        o.a();
    }

    public void c() {
        while (true) {
            int i = this.d;
            k80 k80Var = (k80) this.g;
            if (i >= k80Var.i || k80Var.f[i] >= 0) {
                return;
            } else {
                this.d = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.d < ((k80) this.g).i;
    }

    public void remove() {
        k80 k80Var = (k80) this.g;
        b();
        if (this.e == -1) {
            o.f("Call next() before removing element from the iterator.");
            return;
        }
        k80Var.b();
        k80Var.j(this.e);
        this.e = -1;
        this.f = k80Var.k;
    }
}
