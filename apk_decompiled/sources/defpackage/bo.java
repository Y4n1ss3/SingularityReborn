package defpackage;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class bo {
    public final List a;

    public bo(List list) {
        list.getClass();
        this.a = list;
    }

    public final zn a() {
        return (zn) yi.v0(this.a);
    }

    public final zn b() {
        return (zn) yi.p0(this.a);
    }

    public final zn c() {
        List list = this.a;
        if (list.size() >= 3) {
            return (zn) list.get(1);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bo) && q10.b(this.a, ((bo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CpuTopology(clusters=" + this.a + ")";
    }
}
