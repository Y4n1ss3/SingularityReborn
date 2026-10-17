package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vz {
    public final gf a;
    public final ox b;
    public final ox c;

    public vz(gf gfVar, ox oxVar, ox oxVar2) {
        this.a = gfVar;
        this.b = oxVar;
        this.c = oxVar2;
        if (gfVar.b() == 0 && gfVar.a() == 0) {
            o.m("Bounds must be non zero");
            throw null;
        }
        if (gfVar.a == 0 || gfVar.b == 0) {
            return;
        }
        o.m("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (vz.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            vz vzVar = (vz) obj;
            return this.a.equals(vzVar.a) && this.b == vzVar.b && this.c == vzVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return vz.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
