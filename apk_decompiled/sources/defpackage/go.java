package defpackage;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class go {
    public final int a;
    public final int b;
    public final int c;
    public final List d;

    public go(List list, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return this.a == goVar.a && this.b == goVar.b && this.c == goVar.c && this.d.equals(goVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j50.b(this.c, j50.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder j = j50.j("CoreInfo(idx=", this.a, ", minKhz=", this.b, ", maxKhz=");
        j.append(this.c);
        j.append(", availableKhz=");
        j.append(this.d);
        j.append(")");
        return j.toString();
    }
}
