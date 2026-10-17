package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class c10 {
    public final long a;

    public /* synthetic */ c10(long j) {
        this.a = j;
    }

    public static long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c10) {
            return this.a == ((c10) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return fc.e(sb, (int) (j & 4294967295L), ')');
    }
}
