package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kj0 implements Serializable {
    public final Object d;

    public /* synthetic */ kj0(Object obj) {
        this.d = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof jj0) {
            return ((jj0) obj).d;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kj0) {
            return q10.b(this.d, ((kj0) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.d;
        if (obj instanceof jj0) {
            return ((jj0) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
