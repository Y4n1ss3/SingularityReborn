package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class km {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public km(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km)) {
            return false;
        }
        km kmVar = (km) obj;
        return this.a.equals(kmVar.a) && q10.b(this.b, kmVar.b) && q10.b(this.c, kmVar.c) && q10.b(this.d, kmVar.d) && q10.b(this.e, kmVar.e) && this.f.equals(kmVar.f) && q10.b(this.g, kmVar.g) && q10.b(this.h, kmVar.h) && this.i == kmVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (this.f.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return Boolean.hashCode(this.i) + ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder k = j50.k("ControllerDevice(typeId=", this.a, ", typeName=", this.b, ", model=");
        k.append(this.c);
        k.append(", id=");
        k.append(this.d);
        k.append(", serial=");
        k.append(this.e);
        k.append(", status=");
        k.append(this.f);
        k.append(", battery=");
        k.append(this.g);
        k.append(", firmware=");
        k.append(this.h);
        k.append(", isPaired=");
        k.append(this.i);
        k.append(")");
        return k.toString();
    }
}
