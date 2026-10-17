package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kw0 implements Serializable {
    public final Object d;
    public final Object e;
    public final Object f;

    public kw0(Object obj, Object obj2, Object obj3) {
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw0)) {
            return false;
        }
        kw0 kw0Var = (kw0) obj;
        return q10.b(this.d, kw0Var.d) && q10.b(this.e, kw0Var.e) && q10.b(this.f, kw0Var.f);
    }

    public final int hashCode() {
        Object obj = this.d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.e;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.d + ", " + this.e + ", " + this.f + ')';
    }
}
