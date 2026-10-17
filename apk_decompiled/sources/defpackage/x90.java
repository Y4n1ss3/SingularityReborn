package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class x90 {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public x90(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return q10.b(this.a, x90Var.a) && q10.b(this.b, x90Var.b) && q10.b(this.c, x90Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "Custom(bg=" + this.a + ", text=" + this.b + ", accent=" + this.c + ")";
    }
}
