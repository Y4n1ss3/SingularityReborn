package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class f30 implements vy, Serializable {
    private final int arity;

    public f30(int i) {
        this.arity = i;
    }

    @Override // defpackage.vy
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        ki0.a.getClass();
        return li0.a(this);
    }
}
