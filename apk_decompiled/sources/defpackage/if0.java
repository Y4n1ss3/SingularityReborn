package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class if0 {
    public final boolean a;
    public final String b;
    public final String c;

    public if0(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if0)) {
            return false;
        }
        if0 if0Var = (if0) obj;
        return this.a == if0Var.a && q10.b(this.b, if0Var.b) && this.c.equals(if0Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "BackupResult(success=" + this.a + ", path=" + this.b + ", message=" + this.c + ")";
    }
}
