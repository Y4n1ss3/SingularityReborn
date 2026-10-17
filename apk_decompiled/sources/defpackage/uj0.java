package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class uj0 {
    public final String a;
    public final int b;

    public uj0(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj0)) {
            return false;
        }
        uj0 uj0Var = (uj0) obj;
        return q10.b(this.a, uj0Var.a) && this.b == uj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommandResult(output=" + this.a + ", exitCode=" + this.b + ")";
    }
}
