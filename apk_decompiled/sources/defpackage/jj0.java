package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class jj0 implements Serializable {
    public final Throwable d;

    public jj0(Throwable th) {
        th.getClass();
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jj0) {
            return q10.b(this.d, ((jj0) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.d + ')';
    }
}
