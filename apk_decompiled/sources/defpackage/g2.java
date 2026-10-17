package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class g2 implements vy, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel = false;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public g2(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.isTopLevel == g2Var.isTopLevel && this.arity == g2Var.arity && this.flags == g2Var.flags && q10.b(this.receiver, g2Var.receiver) && q10.b(this.owner, g2Var.owner) && this.name.equals(g2Var.name) && this.signature.equals(g2Var.signature);
    }

    @Override // defpackage.vy
    public int getArity() {
        return this.arity;
    }

    public l20 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return ki0.a(cls);
        }
        ki0.a.getClass();
        return new ke0(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((((this.signature.hashCode() + ((this.name.hashCode() + ((hashCode + (cls != null ? cls.hashCode() : 0)) * 31)) * 31)) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        ki0.a.getClass();
        return li0.a(this);
    }
}
