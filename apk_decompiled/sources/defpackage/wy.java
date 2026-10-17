package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class wy extends wf implements vy, m20 {
    private final int arity;
    private final int flags;

    public wy(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // defpackage.wf
    public k20 computeReflected() {
        ki0.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wy) {
            wy wyVar = (wy) obj;
            return getName().equals(wyVar.getName()) && getSignature().equals(wyVar.getSignature()) && this.flags == wyVar.flags && this.arity == wyVar.arity && q10.b(getBoundReceiver(), wyVar.getBoundReceiver()) && q10.b(getOwner(), wyVar.getOwner());
        }
        if (obj instanceof m20) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.vy
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.wf
    public m20 getReflected() {
        k20 compute = compute();
        if (compute != this) {
            return (m20) compute;
        }
        throw new yn("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.m20
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.m20
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.m20
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.m20
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.wf, defpackage.k20
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        k20 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
