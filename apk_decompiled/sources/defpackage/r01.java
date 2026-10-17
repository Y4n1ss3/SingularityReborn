package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class r01 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final f90 b;
    public volatile int c = 0;

    public r01(f90 f90Var, int i) {
        this.b = f90Var;
        this.a = i;
    }

    public final int a(int i) {
        c90 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.g;
        int i2 = a + b.d;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final c90 b() {
        ThreadLocal threadLocal = d;
        c90 c90Var = (c90) threadLocal.get();
        if (c90Var == null) {
            c90Var = new c90();
            threadLocal.set(c90Var);
        }
        d90 d90Var = (d90) this.b.a;
        int a = d90Var.a(6);
        if (a != 0) {
            int i = a + d90Var.d;
            int i2 = (this.a * 4) + ((ByteBuffer) d90Var.g).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) d90Var.g).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) d90Var.g;
            c90Var.g = byteBuffer;
            if (byteBuffer != null) {
                c90Var.d = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c90Var.e = i4;
                c90Var.f = ((ByteBuffer) c90Var.g).getShort(i4);
                return c90Var;
            }
            c90Var.d = 0;
            c90Var.e = 0;
            c90Var.f = 0;
        }
        return c90Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        c90 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.g).getInt(a + b.d) : 0));
        sb.append(", codepoints:");
        c90 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.d;
            i = ((ByteBuffer) b2.g).getInt(((ByteBuffer) b2.g).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
