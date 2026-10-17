package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class xe0 implements Serializable {
    public final Object d;
    public final Object e;

    public xe0(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe0)) {
            return false;
        }
        xe0 xe0Var = (xe0) obj;
        return q10.b(this.d, xe0Var.d) && q10.b(this.e, xe0Var.e);
    }

    public final int hashCode() {
        Object obj = this.d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.d + ", " + this.e + ')';
    }
}
