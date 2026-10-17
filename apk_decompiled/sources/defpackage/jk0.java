package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class jk0 implements Map.Entry {
    public final x40 d;
    public final z40 e;
    public jk0 f;
    public jk0 g;

    public jk0(x40 x40Var, z40 z40Var) {
        this.d = x40Var;
        this.e = z40Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jk0) {
            jk0 jk0Var = (jk0) obj;
            return this.d.equals(jk0Var.d) && this.e == jk0Var.e;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.e.hashCode() ^ this.d.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.d + "=" + this.e;
    }
}
