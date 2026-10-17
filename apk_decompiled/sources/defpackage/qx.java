package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class qx {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx)) {
            return false;
        }
        qx qxVar = (qx) obj;
        return Objects.equals(this.a, qxVar.a) && Objects.equals(this.b, qxVar.b) && Objects.equals(this.c, qxVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
