package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class je {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public je(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je)) {
            return false;
        }
        je jeVar = (je) obj;
        return q10.b(this.a, jeVar.a) && q10.b(this.b, jeVar.b) && this.c.equals(jeVar.c) && this.d == jeVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = j50.k("BootPackInfo(name=", this.a, ", author=", this.b, ", glbFileName=");
        k.append(this.c);
        k.append(", hasSound=");
        k.append(this.d);
        k.append(")");
        return k.toString();
    }
}
