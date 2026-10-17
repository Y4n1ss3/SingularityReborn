package defpackage;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class t31 {
    public final List a;

    public t31(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !t31.class.equals(obj.getClass())) {
            return false;
        }
        return this.a.equals(((t31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return yi.u0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
