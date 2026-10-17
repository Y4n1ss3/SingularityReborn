package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ke0 implements l20 {
    public final Class d;

    public ke0(Class cls) {
        cls.getClass();
        this.d = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ke0) {
            return q10.b(this.d, ((ke0) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d + " (Kotlin reflection is not available)";
    }
}
