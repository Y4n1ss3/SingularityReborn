package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ti implements ui {
    public final float a;
    public final float b;

    public ti(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean a() {
        return this.a > this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ti)) {
            return false;
        }
        if (a() && ((ti) obj).a()) {
            return true;
        }
        ti tiVar = (ti) obj;
        return this.a == tiVar.a && this.b == tiVar.b;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
