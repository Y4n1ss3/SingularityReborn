package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class hj implements kn, Serializable {
    public final kn d;
    public final in e;

    public hj(in inVar, kn knVar) {
        knVar.getClass();
        this.d = knVar;
        this.e = inVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof hj) {
            hj hjVar = (hj) obj;
            int i = 2;
            hj hjVar2 = hjVar;
            int i2 = 2;
            while (true) {
                kn knVar = hjVar2.d;
                hjVar2 = knVar instanceof hj ? (hj) knVar : null;
                if (hjVar2 == null) {
                    break;
                }
                i2++;
            }
            hj hjVar3 = this;
            while (true) {
                kn knVar2 = hjVar3.d;
                hjVar3 = knVar2 instanceof hj ? (hj) knVar2 : null;
                if (hjVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    in inVar = this.e;
                    if (!q10.b(hjVar.get(inVar.getKey()), inVar)) {
                        z = false;
                        break;
                    }
                    kn knVar3 = this.d;
                    if (!(knVar3 instanceof hj)) {
                        knVar3.getClass();
                        in inVar2 = (in) knVar3;
                        z = q10.b(hjVar.get(inVar2.getKey()), inVar2);
                        break;
                    }
                    this = (hj) knVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.kn
    public final Object fold(Object obj, my myVar) {
        return myVar.invoke(this.d.fold(obj, myVar), this.e);
    }

    @Override // defpackage.kn
    public final in get(jn jnVar) {
        jnVar.getClass();
        while (true) {
            in inVar = this.e.get(jnVar);
            if (inVar != null) {
                return inVar;
            }
            kn knVar = this.d;
            if (!(knVar instanceof hj)) {
                return knVar.get(jnVar);
            }
            this = (hj) knVar;
        }
    }

    public final int hashCode() {
        return this.e.hashCode() + this.d.hashCode();
    }

    @Override // defpackage.kn
    public final kn minusKey(jn jnVar) {
        jnVar.getClass();
        in inVar = this.e;
        in inVar2 = inVar.get(jnVar);
        kn knVar = this.d;
        if (inVar2 != null) {
            return knVar;
        }
        kn minusKey = knVar.minusKey(jnVar);
        return minusKey == knVar ? this : minusKey == st.d ? inVar : new hj(inVar, minusKey);
    }

    @Override // defpackage.kn
    public final kn plus(kn knVar) {
        knVar.getClass();
        return knVar == st.d ? this : (kn) knVar.fold(this, new bl(22));
    }

    public final String toString() {
        return c21.a(new StringBuilder("["), (String) fold("", new w4(8)), ']');
    }
}
